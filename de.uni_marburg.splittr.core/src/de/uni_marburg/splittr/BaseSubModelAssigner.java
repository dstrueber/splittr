package de.uni_marburg.splittr;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.analysis.IStructuralAnalyzer;
import de.uni_marburg.splittr.analysis.graph.GraphBuilder;
import de.uni_marburg.splittr.finalassign.FinalAssigner;
import de.uni_marburg.splittr.finalassign.UnassignedModelElementManager;
import de.uni_marburg.splittr.indexing.IDocumentFromModelGenerator;
import de.uni_marburg.splittr.indexing.ISubModelReader;
import de.uni_marburg.splittr.indexing.LsaQueryInput;
import de.uni_marburg.splittr.indexing.ModelElementRegistry;
import de.uni_marburg.splittr.indexing.SubModelReader;
import de.uni_marburg.splittr.indexing.SubModelRegistry;
import de.uni_marburg.splittr.indexing.VectorizationTrigger;
import de.uni_marburg.splittr.retrieval.AbsoluteElementListTruncator;
import de.uni_marburg.splittr.retrieval.ElementListTruncator;
import de.uni_marburg.splittr.retrieval.GapElementListTruncator;
import de.uni_marburg.splittr.retrieval.LuceneIndexSearcher;
import de.uni_marburg.splittr.retrieval.LuceneSearchResult;
import de.uni_marburg.splittr.retrieval.LuceneSearchResultEntry;
import de.uni_marburg.splittr.splittrResult.SplittrResultFactory;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultComparator;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;
import de.uni_marburg.splittr.splittrResult.impl.SplittrResultFactoryImpl;

/**
 * Base implementation of {@code SubModelAssigner}.
 * 
 * @author strueber
 * 
 */
public abstract class BaseSubModelAssigner implements SubModelAssigner  {

	protected String modelPath;
	protected String submodelDescriptionPath;
	protected String documentOutputPath = new String("docs");
	protected String documentIndexingPath = new String("index");
	protected IDocumentFromModelGenerator modelDocumentGenerator;
	protected ISubModelReader subModelReader;
	protected IStructuralAnalyzer structuralAnalyzer;
	protected GraphBuilder graphBuilder;
	protected GapElementListTruncator<LuceneSearchResultEntry> truncator;
	protected Configuration configuration;

	/**
	 * 
	 * @param modelPath
	 *            Path to the input model.
	 * @param subModelDescriptionPath
	 *            Path to the input sub-model descriptions. If this is a directory
	 *            path, the sub-model descriptions are read file-wise from the
	 *            files contained in the directory. Otherwise, it is assumed
	 *            that the path points to a text file. In this case, the sub-model
	 *            descriptions are read line-wise from the text file.
	 */
	public BaseSubModelAssigner(String modelPath, String subModelDescriptionPath) {
		this.modelPath = modelPath;
		this.submodelDescriptionPath = subModelDescriptionPath;
		this.documentOutputPath = new String("docs");
		this.documentIndexingPath = new String("index");
		subModelReader = new SubModelReader();
		configuration = new Configuration();
	}

	/**
	 * 
	 * @param modelPath
	 *            Path to the input model.
	 * @param subModelDescriptionPath
	 *            Path to the input sub-model descriptions. If this is a directory
	 *            path, the sub-model descriptions are read file-wise from the
	 *            files contained in the directory. Otherwise, it is assumed
	 *            that the path points to a text file. In this case, the sub-model
	 *            descriptions are read line-wise from the text file.
	 * @param documentTemporaryPath
	 *            Path where indexing information and documents are to be stored
	 *            while analysis is performed.
	 */
	public BaseSubModelAssigner(String modelPath, String subModelDescriptionPath,
			String documentTemporaryPath) {
		this.modelPath = modelPath;
		this.submodelDescriptionPath = subModelDescriptionPath;
		this.documentOutputPath = new String(documentTemporaryPath + "docs");
		this.documentIndexingPath = new String(documentTemporaryPath + "index");
		subModelReader = new SubModelReader();
		configuration = new Configuration();
	}

	/* (non-Javadoc)
	 * @see de.uni_marburg.splittr.SubModelAssigner#getModelPath()
	 */
	@Override
	public String getModelPath() {
		return modelPath;
	}

	/* (non-Javadoc)
	 * @see de.uni_marburg.splittr.SubModelAssigner#setModelPath(java.lang.String)
	 */
	@Override
	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
	}

	/* (non-Javadoc)
	 * @see de.uni_marburg.splittr.SubModelAssigner#getDescriptionPath()
	 */
	@Override
	public String getDescriptionPath() {
		return submodelDescriptionPath;
	}

	/* (non-Javadoc)
	 * @see de.uni_marburg.splittr.SubModelAssigner#setDescriptionPath(java.lang.String)
	 */
	@Override
	public void setDescriptionPath(String descriptionPath) {
		this.submodelDescriptionPath = descriptionPath;
	}

	/* (non-Javadoc)
	 * @see de.uni_marburg.splittr.SubModelAssigner#createAssignment()
	 */
	@Override
	public SubModelAssignmentResult createAssignment() {
		// initialization
		ModelElementRegistry.getInstance().clear();
		SubModelRegistry.getInstance().clear();
		EObject modelRoot = loadModelRoot();

		// information retrieval phase
		SubModelAssignmentResult result = SplittrResultFactoryImpl.eINSTANCE
				.createSubModelAssignmentResult();
		Map<SubModel, LuceneSearchResult> subModel2relevantElems = determineInitialScoreResults(modelRoot);
		
		// For each sub-model, find additional relevant elements and create result
		// entries.
		initializeGraphBuilding();
		for (SubModel subModel : subModel2relevantElems.keySet()) {
			Map<EObject, Double> relevant = retreiveInitiallyRelevantElementsForSubModels(
					subModel2relevantElems.get(subModel),
					configuration.IR_RESULT_TRUNCATE);
			Map<EObject, Double> allRelevant = retreiveInitiallyRelevantElementsForSubModels(
					subModel2relevantElems.get(subModel), false);

			if (configuration.ANALYSIS_CRAWL) {
				relevant = structuralAnalyzer.findRelatedElements(modelRoot,
						relevant, allRelevant);
			}

			List<SubModelAssignmentResultEntry> results = new ArrayList<SubModelAssignmentResultEntry>();
			for (EObject e : relevant.keySet()) {
				if (subModel == null)
					throw new RuntimeException("SubModel cannot be null!");
				SubModelAssignmentResultEntry r = SplittrResultFactory.eINSTANCE
						.createSubModelAssignmentResultEntry(subModel, e,
								relevant.get(e));
				result.getSubModels().add(subModel);
				results.add(r);
			}

			if (configuration.TRUNCATE_FOR_PARTIAL_SPLIT) {
				SubModelAssignmentResultComparator comparator = new SubModelAssignmentResultComparator();
				ElementListTruncator<SubModelAssignmentResultEntry> endTruncator = new AbsoluteElementListTruncator<SubModelAssignmentResultEntry>(
						comparator);
				List<SubModelAssignmentResultEntry> acceptedEntries = endTruncator
						.truncateEntries(
								results,
								configuration.POSTPROCESSING_TRUNCATION_THRESHOLD,
								false);
				results.retainAll(acceptedEntries);
			}

			result.getEntries().addAll(results);
		}
		ECollections.sort(result.getSubModels());
		FinalAssigner.assign(result, modelRoot, configuration);
		if (configuration.POSTPROCESSING_CREATE_REST_SUBMODEL) {
			Set<EObject> vertexSet = graphBuilder
					.createDirectedMultigraph(modelRoot)
					.vertexSet();
			UnassignedModelElementManager.addUnassignedSubModel(result,
					vertexSet);
		}

		return result;
	}

	/**
	 * Performs the Information retrieval phase, comprising document indexing,
	 * vectorization and querying to produce a set of initially relevant
	 * elements per sub-model.
	 */
	private Map<SubModel, LuceneSearchResult> determineInitialScoreResults(
			EObject modelRoot) {
		if (configuration.IR_SUB_MODELS_AS_DOCUMENTS) {
			subModelReader.readSubModelsFromFileSystem(submodelDescriptionPath);
			List<LsaQueryInput> objectDocuments = modelDocumentGenerator
					.createLsaQueries(modelRoot, documentOutputPath);

			VectorizationTrigger.applyLuceneIndexer(submodelDescriptionPath,
					documentIndexingPath);
			VectorizationTrigger.applySLA(documentIndexingPath, "docVectors",
					"termVectors");
			Map<SubModel, LuceneSearchResult> subModel2relevantElems = LuceneIndexSearcher
					.searchSubModelsForModelElementBatch("contents",
							documentIndexingPath, objectDocuments);
			return subModel2relevantElems;
		} else {
			List<LsaQueryInput> objectDocuments = subModelReader
					.createLsaQueries(submodelDescriptionPath);

			modelDocumentGenerator
					.writeDocuments(modelRoot, documentOutputPath);
			VectorizationTrigger.applyLuceneIndexer(documentOutputPath,
					documentIndexingPath);
			VectorizationTrigger.applySLA(documentIndexingPath, "docVectors",
					"termVectors");
			Map<EObject, LuceneSearchResult> eobject2results = LuceneIndexSearcher
					.searchModelElementsForSubModelBatch("contents",
							documentIndexingPath, objectDocuments);

			return convertObjectToResultMapToSubModelToResultMap(eobject2results);
		}
	}

	private Map<SubModel, LuceneSearchResult> convertObjectToResultMapToSubModelToResultMap(
			Map<EObject, LuceneSearchResult> objects2results) {
		Map<SubModel, LuceneSearchResult> result = new LinkedHashMap<SubModel, LuceneSearchResult>();
		for (SubModel f : SubModelRegistry.getInstance().getSubModels()) {
			LuceneSearchResult newResult = new LuceneSearchResult(0);
			result.put(f, newResult);
		}

		for (EObject o : objects2results.keySet()) {
			for (LuceneSearchResultEntry e : objects2results.get(o)
					.getEntries()) {
				SubModel subModel = SubModelRegistry.getInstance().query(
						e.getDocument().getName());
				result.get(subModel).add(e);
			}
		}

		return result;
	}

	/**
	 * Looks up the relevant model elements corresponding to the documents
	 * selected by the Lucene search.
	 * 
	 * @param searchResult
	 * @return
	 * @throws DataInconsistencyException
	 */
	private Map<EObject, Double> retreiveInitiallyRelevantElementsForSubModels(
			LuceneSearchResult searchResult, boolean truncateEntries) {
		Map<EObject, Double> result = new LinkedHashMap<EObject, Double>();
		List<LuceneSearchResultEntry> entries = truncateEntries ? searchResult
				.getTruncatedEntries(truncator) : searchResult.getEntries();
		double max = 0.0;
		if (configuration.IR_SUB_MODELS_AS_DOCUMENTS) {
			for (LuceneSearchResultEntry entry : entries) {
				String documentPath = entry.getDocument().getName();
				String fileName = documentPath.substring(documentPath
						.lastIndexOf(File.separator) + 1);
				Set<EObject> objects = ModelElementRegistry.getInstance().query(
						fileName);
				if (objects != null) {
					for (EObject o : objects) {
						result.put(o, (double) entry.getScore());
					}
					max = Math.max(max, (double) entry.getScore());					
				} else {
					throw new RuntimeException("Found a document (" + fileName
							+ ") with no corresponding model element.");
				}
			}
		} else {
			for (LuceneSearchResultEntry entry : entries) {
				if (entry.getResultObject() != null) {
					result.put(entry.getResultObject(),
							(double) entry.getScore());
					max = Math.max(max, (double) entry.getScore());
				} else {
					throw new RuntimeException("Illegal entry for sub-model: "
							+ entry.getDocument());
				}

			}
		}
		if (configuration.IR_RESULT_NORMALIZE)
			normalize(result, max);
		return result;
	}

	private void normalize(Map<EObject, Double> result, double max) {
		for (EObject o : result.keySet()) {
			result.put(o, result.get(o) / max);
		}
	}

	protected abstract void initializeGraphBuilding();

	protected abstract EObject loadModelRoot();

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
}
