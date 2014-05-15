package de.uni_marburg.splittr.evaluation.precision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;
import de.uni_marburg.splittr.util.NamingUtil;

/**
 * Performs the evaluation for exactly one run of the sub-model assignment.
 * 
 * @author strueber
 * 
 */
public class PrecisionRecallCalculator {
	public static Map<String, Set<String>> comparisonData;
	public static Map<String, Set<String>> resultCorrect;
	public static Map<String, Set<String>> resultFalsePositive;
	public static Map<String, Set<String>> resultFalseNegative;

//	public static void main(String[] args) {
//		String example = null;
//		if (args.length > 0)
//			example = args[0];
//		else
//			System.err.println("No example parameter was given.");
//
//		EvaluationResultFormatter
//				.getFormattedEvaluationResultString(example, performEvaluation(example), null, null, null);
//	}
	

//	public static Map<SubModel, PrecisionRecallEntry> performEvaluation(
//			String example) {
//		ResourceSet rs = new ResourceSetImpl();
//		FileIOUtil.loadModel("input/" + example + "/model/model.uml", rs);
//		SubModelAssignmentResult fltResult = FileIOUtil.loadSubModelAssignmentResult(+example+".splittrResult", rs);
//		Map<String, Set<String>> comparisonData = ComparisonDataReader
//				.readComparisonDataFromDirectory("input/" + example
//						+ "/referee");
//		return performCalculcation(example, fltResult, comparisonData);
//	}

	public static Map<SubModel, PrecisionRecallEntry> performCalculcation(
			String example, SubModelAssignmentResult splittResult, Map<String, Set<String>> inputComparisonData) {
		comparisonData = inputComparisonData;
		if (comparisonData.isEmpty())
			System.err.println("Comparison data is empty");

		Map<SubModel, PrecisionRecallEntry> results = determinePrecisionAndRecallEntries(
				splittResult, comparisonData);
		return results;
	}

	private static Map<SubModel, PrecisionRecallEntry> determinePrecisionAndRecallEntries(
			SubModelAssignmentResult splittResult,
			Map<String, Set<String>> comparisonData) {
		Map<SubModel, PrecisionRecallEntry> results = new HashMap<SubModel, PrecisionRecallEntry>();
		for (String subModelName : comparisonData.keySet()) {
			PrecisionRecallEntry pr = new PrecisionRecallEntry();
			Map<String, EObject> intersection = new HashMap<String, EObject>();
			Set<String> correct = new HashSet<String>();
			Set<String> falseNegatives = new HashSet<String>();
			Set<String> falsePositives = new HashSet<String>();
			for (String relevantElement : comparisonData.get(subModelName)) {
				SubModelAssignmentResultEntry result = splittResult
						.findResultEntryBySubModelAndElement(subModelName,
								relevantElement);
				if (result != null) {
					EObject resultElement = result.getRelevantElement();
					intersection.put(relevantElement, resultElement);
					correct.add(relevantElement);
				} else {
					falseNegatives.add(relevantElement);
				}
			}
			resultCorrect.put(subModelName, correct);
			resultFalsePositive.put(subModelName, falsePositives);

			EList<SubModelAssignmentResultEntry> positives = splittResult.findResultEntriesBySubModel(subModelName);
			for (SubModelAssignmentResultEntry p : positives) {
				String pName = NamingUtil.retreiveName(p.getRelevantElement());
				if (!correct.contains(pName))
						falsePositives.add(pName);
			}
			resultFalseNegative.put(subModelName, falseNegatives);
			pr.setIntersectionCount(intersection.size());
			pr.setRetrievedCount(splittResult.findResultEntriesBySubModel(
					subModelName).size());
			pr.setRelevantCount(comparisonData.get(subModelName).size());
			SubModel subModel = splittResult.findSubModelByName(subModelName);
			if (subModel == null)
				throw new RuntimeException("Sub-model "+subModelName+" not found.");
			results.put(subModel, pr);
		}
		return results;
	}

}
