package de.uni_marburg.splittr.uml;

import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.BaseSubModelAssigner;
import de.uni_marburg.splittr.analysis.IStructuralAnalyzer;
import de.uni_marburg.splittr.analysis.crawl.ModifiedReinforcementSpecificityAnalyzer;
import de.uni_marburg.splittr.analysis.crawl.ModifiedReinforcementSpecificityWeightedAnalyzer;
import de.uni_marburg.splittr.analysis.crawl.PlainReinforcementSpecificityAnalyzer;
import de.uni_marburg.splittr.analysis.graph.uml.UmlEdgeKind;
import de.uni_marburg.splittr.analysis.graph.uml.UmlGraphBuilder;
import de.uni_marburg.splittr.retrieval.GapElementListTruncator;
import de.uni_marburg.splittr.retrieval.LuceneSearchResultComparator;
import de.uni_marburg.splittr.retrieval.LuceneSearchResultEntry;
import de.uni_marburg.splittr.util.FileIOUtil;

public class UmlSubModelAssigner extends BaseSubModelAssigner {


	public UmlSubModelAssigner(String modelPath, String subModelDescriptionPath) {
		super(modelPath, subModelDescriptionPath);
		modelDocumentGenerator = new UmlDocumentGenerator();
		graphBuilder = new UmlGraphBuilder();
		structuralAnalyzer = createAnalyzer();
		truncator = new GapElementListTruncator<LuceneSearchResultEntry>(new LuceneSearchResultComparator());
	}
	

	public UmlSubModelAssigner(String modelPath, String subModelDescriptionPath, String documentPath) {
		super(modelPath, subModelDescriptionPath, documentPath);
		modelDocumentGenerator = new UmlDocumentGenerator();
		graphBuilder = new UmlGraphBuilder();
		structuralAnalyzer = createAnalyzer();
		truncator = new GapElementListTruncator<LuceneSearchResultEntry>(new LuceneSearchResultComparator());
	}
	
	private IStructuralAnalyzer createAnalyzer() {
		switch (configuration.ANALYSIS_METHOD) {
		case 0: return new PlainReinforcementSpecificityAnalyzer(
				configuration.ANALYSIS_ALPHA, configuration.ANALYSIS_ITERATIONS, graphBuilder);
		case 1: return new ModifiedReinforcementSpecificityAnalyzer(
				configuration.ANALYSIS_ALPHA, configuration.ANALYSIS_ITERATIONS, graphBuilder);
		default: return new ModifiedReinforcementSpecificityWeightedAnalyzer(
				configuration.ANALYSIS_ALPHA, configuration.ANALYSIS_ITERATIONS, graphBuilder);
		} 
	}
	


	@Override
	protected void initializeGraphBuilding() {
		UmlEdgeKind.AGGREGATION.setWeight(configuration.WEIGHT_AGGREGATION);
		UmlEdgeKind.COMPOSITION.setWeight(configuration.WEIGHT_COMPOSITION);
		UmlEdgeKind.GENERALIZATION.setWeight(configuration.WEIGHT_GENERALIZATION);
		UmlEdgeKind.ASSOCIATION.setWeight(configuration.WEIGHT_ASSOCIATION);
		UmlEdgeKind.INTERFACE_REALIZATION.setWeight(configuration.WEIGHT_INTERFACE_REALIZATION);
	}

	@Override
	protected EObject loadModelRoot() {
		return FileIOUtil.loadUmlModel(modelPath);
	}
}
