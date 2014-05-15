package de.uni_marburg.splittr.evaluation;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.uni_marburg.splittr.SubModelAssigner;
import de.uni_marburg.splittr.analysis.graph.uml.SubsetRegistry;
import de.uni_marburg.splittr.ecore.EcoreSubModelAssigner;
import de.uni_marburg.splittr.evaluation.coherence.CoherenceCouplingCalculator;
import de.uni_marburg.splittr.evaluation.coherence.CoherenceCouplingEntry;
import de.uni_marburg.splittr.evaluation.precision.PrecisionRecallCalculator;
import de.uni_marburg.splittr.evaluation.precision.PrecisionRecallEntry;
import de.uni_marburg.splittr.evaluation.refereedata.ComparisonDataReader;
import de.uni_marburg.splittr.indexing.ModelElementRegistry;
import de.uni_marburg.splittr.indexing.SubModelRegistry;
import de.uni_marburg.splittr.splittrResult.SplittrResultPackage;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;
import de.uni_marburg.splittr.uml.UmlSubModelAssigner;
import de.uni_marburg.splittr.util.FileIOUtil;

public class Evaluator {

	public static void main(String[] args) {
		initialize();
		String[] examples = EvaluationConfiguration.EVALUATION_EXAMPLES;
		if (args.length > 0)
			examples = args;

		String resultString = new String();
		for (int i = 0; i < examples.length; i++) {
			SubsetRegistry.subset = new HashSet<String>();
			PrecisionRecallCalculator.comparisonData = new HashMap<String, Set<String>>();
			PrecisionRecallCalculator.resultCorrect = new HashMap<String, Set<String>>();
			PrecisionRecallCalculator.resultFalseNegative = new HashMap<String, Set<String>>();
			PrecisionRecallCalculator.resultFalsePositive = new HashMap<String, Set<String>>();
			resultString += evaluateExample(examples[i]);
			SubModelRegistry.getInstance().clear();
			ModelElementRegistry.getInstance().clear();
			System.out.println(SubsetRegistry.subset.size());
		}

		FileIOUtil.simpleWriteToFile("logs" + File.separator + join(examples)
				+ " - " + getCurrentDate(), resultString);
		System.out.println(resultString);
		System.out.println(OverallAverageRegistry.average());
OverallAverageRegistry.printGraphs();
		// OverallAverageRegistry.printGraphs();

	}

	private static void initialize() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		EcorePackage.eINSTANCE.eClass();
		SplittrResultPackage.eINSTANCE.eClass();
	}

	private static String join(String[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i + 1 < array.length)
				sb.append(" ");
		}
		return sb.toString();
	}

	private static String evaluateExample(String example) {
		// First, perform the technique and save its results
		String inputPath = EvaluationConfiguration.PATH + "input" + File.separator + example + File.separator;
		String outputPath = EvaluationConfiguration.PATH + "output" + File.separator + example
				+ File.separator;
		String modelPath = inputPath + "model" + File.separator + "model."
				+ EvaluationConfiguration.EVALUATION_MODE;
		String queryPath = inputPath + File.separator + "queries";

		Map<String, Set<String>> comparisonData = ComparisonDataReader
				.readComparisonDataFromDirectory("input/" + example
						+ "/referee");

		SubModelAssigner sa = createSubModelAssigner(modelPath, queryPath,
				outputPath);
		SubModelAssignmentResult result = sa.createAssignment();
		
		String resultPath =  EvaluationConfiguration.PATH + "cjsl.splittrResult";
		FileIOUtil.saveResource(result, "file:/" +resultPath, getResourceSet(result));

		// Then, perform the evaluation: Open the result and obtain
		// (1) precision and recall values, (2) coherence and coupling metric
		// values

		ResourceSet rs = new ResourceSetImpl();
		EObject modelRoot = FileIOUtil.loadModel(modelPath, rs);
		SubModelAssignmentResult splittrResult = FileIOUtil
				.loadSubModelAssignmentResult(resultPath, rs);
		comparisonData = ComparisonDataReader
				.readComparisonDataFromDirectory("input/" + example
						+ "/referee");

		Map<SubModel, PrecisionRecallEntry> prResults = PrecisionRecallCalculator
				.performCalculcation(example, splittrResult, comparisonData);
		Map<SubModel, CoherenceCouplingEntry> ccResults = CoherenceCouplingCalculator
				.performCalculation(modelRoot, splittrResult);
		Map<SubModel, CoherenceCouplingEntry> ccResultsReferee = CoherenceCouplingCalculator
				.performCalculcationForRefereeData(modelRoot, comparisonData,
						splittrResult);
		EList<SubModelAssignmentResultEntry> unassigned = splittrResult
				.findResultEntriesBySubModel("Unassigned");

		String resultString = EvaluationResultFormatter
				.getFormattedEvaluationResultString("" + example, prResults,
						ccResults, ccResultsReferee, unassigned);
		return resultString;
	}

	private static ResourceSet getResourceSet(SubModelAssignmentResult result) {
		SubModelAssignmentResultEntry firstEntry = result.getEntries().get(0);
		return firstEntry.getRelevantElement().eResource().getResourceSet();
	}

	private static SubModelAssigner createSubModelAssigner(String modelPath,
			String queryPath, String outputPath) {
		if (EvaluationConfiguration.EVALUATION_MODE.equals("ecore"))
			return new EcoreSubModelAssigner(modelPath, queryPath,
					outputPath);
		if (EvaluationConfiguration.EVALUATION_MODE.equals("uml"))
			return new UmlSubModelAssigner(modelPath, queryPath,
					outputPath); 
		return null;
	}

	private static String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

}
