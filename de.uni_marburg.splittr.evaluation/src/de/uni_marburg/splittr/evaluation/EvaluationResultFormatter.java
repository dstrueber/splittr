package de.uni_marburg.splittr.evaluation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import de.uni_marburg.splittr.evaluation.coherence.CoherenceCouplingEntry;
import de.uni_marburg.splittr.evaluation.precision.PrecisionRecallCalculator;
import de.uni_marburg.splittr.evaluation.precision.PrecisionRecallEntry;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;
import de.uni_marburg.splittr.util.NamingUtil;

public class EvaluationResultFormatter {

	static boolean FOR_LATEX = false;
	static boolean LONG_VERSION = false;
	static boolean INCLUDE_EDGE_INFORMATION = true;

	public static String getFormattedEvaluationResultString(
			String exampleTitle, Map<SubModel, PrecisionRecallEntry> results,
			Map<SubModel, CoherenceCouplingEntry> ccResults,
			Map<SubModel, CoherenceCouplingEntry> ccResultsReferee,
			EList<SubModelAssignmentResultEntry> unassigned) {
		if (FOR_LATEX)
			return getLatexFormattedEvaluationResultString(exampleTitle,
					results, ccResults, ccResultsReferee, unassigned);
		if (LONG_VERSION)
			return getLongFormattedEvaluationResultString(exampleTitle,
					results, ccResults, ccResultsReferee, unassigned);
		else
			return getShortFormattedEvaluationResultString(exampleTitle,
					results, ccResults, ccResultsReferee, unassigned);
	}

	public static String getLongFormattedEvaluationResultString(
			String exampleTitle, Map<SubModel, PrecisionRecallEntry> results,
			Map<SubModel, CoherenceCouplingEntry> ccResults,
			Map<SubModel, CoherenceCouplingEntry> ccResultsReferee,
			EList<SubModelAssignmentResultEntry> unassigned) {
		StringBuilder sb = new StringBuilder();
		sb.append(System.lineSeparator());
		sb.append("##########################################");
		sb.append(System.lineSeparator());
		sb.append(exampleTitle);
		sb.append(System.lineSeparator());
		sb.append("##########################################");
		sb.append(System.lineSeparator());

		int longestSizeNames = 0;
		int longestSizePrecision = "Precision".length();
		int longestSizeRecall = "Recall".length();
		int longestSizeBalancedF = "BalancedF".length();

		double recallSum = 0;
		double precSum = 0;
		double balancedFSum = 0;

		for (SubModel f : results.keySet()) {
			PrecisionRecallEntry entry = results.get(f);
			longestSizeNames = Math.max(longestSizeNames, f.getName().length());
			longestSizePrecision = Math.max(longestSizePrecision, Double
					.toString(entry.calculatePrecision()).length());
			longestSizeRecall = Math.max(longestSizeRecall,
					Double.toString(entry.calculateRecall()).length());
			longestSizeBalancedF = Math.max(longestSizeBalancedF, Double
					.toString(entry.calculateBalancedF()).length());

			double precision = entry.calculatePrecision();
			double recall = entry.calculateRecall();
			double balancedF = entry.calculateBalancedF();

			precSum += Double.compare(Double.NaN, precision) == 0 ? 0
					: precision;
			recallSum += Double.compare(Double.NaN, recall) == 0 ? 0 : recall;
			balancedFSum += Double.compare(Double.NaN, balancedF) == 0 ? 0
					: balancedF;
		}

		appendWithTrailingBlanks(sb, "", longestSizeNames + 3);
		appendWithTrailingBlanks(sb, "Precision", longestSizePrecision + 3);
		appendWithTrailingBlanks(sb, "Recall", longestSizeRecall + 3);
		appendWithTrailingBlanks(sb, "BalancedF", longestSizeRecall + 3);
		sb.append(System.lineSeparator());

		for (SubModel f : orderByName(results.keySet())) {
			PrecisionRecallEntry entry = results.get(f);
			appendWithTrailingBlanks(sb, f.getName(), longestSizeNames + 3);
			appendWithTrailingBlanks(sb,
					Double.toString(entry.calculatePrecision()),
					longestSizePrecision + 3);
			appendWithTrailingBlanks(sb,
					Double.toString(entry.calculateRecall()),
					longestSizeRecall + 3);
			appendWithTrailingBlanks(sb,
					Double.toString(entry.calculateBalancedF()),
					longestSizeBalancedF + 3);
			sb.append(System.lineSeparator());
			sb.append(System.lineSeparator());

			appendWithTrailingBlanks(sb, "Query:  " + f.getDescription(),
					longestSizeNames + 3);

			sb.append(System.lineSeparator());
			sb.append(System.lineSeparator());

			appendWithTrailingBlanks(
					sb,
					"Expected:        "
							+ PrecisionRecallCalculator.comparisonData.get(f
									.getName()), longestSizeNames + 3);

			sb.append(System.lineSeparator());

			appendWithTrailingBlanks(sb, "Got correctly:   "
					+ PrecisionRecallCalculator.resultCorrect.get(f.getName()),
					longestSizeNames + 3);

			sb.append(System.lineSeparator());

			appendWithTrailingBlanks(
					sb,
					"False positive:  "
							+ PrecisionRecallCalculator.resultFalsePositive
									.get(f.getName()), longestSizeNames + 3);

			sb.append(System.lineSeparator());

			appendWithTrailingBlanks(
					sb,
					"False negative:  "
							+ PrecisionRecallCalculator.resultFalseNegative
									.get(f.getName()), longestSizeNames + 3);

			sb.append(System.lineSeparator());
			sb.append(System.lineSeparator());

		}

		appendWithTrailingBlanks(sb, "TOTAL", longestSizeNames + 3);
		appendWithTrailingBlanks(sb,
				Double.toString(toPercent(precSum / results.keySet().size())),
				longestSizePrecision + 3);
		appendWithTrailingBlanks(
				sb,
				Double.toString(toPercent(recallSum / results.keySet().size())),
				longestSizeRecall + 3);
		appendWithTrailingBlanks(
				sb,
				Double.toString(toPercent(balancedFSum
						/ results.keySet().size())), longestSizeBalancedF + 3);
		appendWithTrailingBlanks(sb,
				truncateResult(Double.toString(PrecisionRecallEntry
						.calculateBalancedF(precSum, recallSum)
						/ results.keySet().size())), longestSizeBalancedF + 3);
		sb.append('\n');

		return sb.toString();
	}

	public static String getShortFormattedEvaluationResultString(
			String exampleTitle, Map<SubModel, PrecisionRecallEntry> results,
			Map<SubModel, CoherenceCouplingEntry> ccResults,
			Map<SubModel, CoherenceCouplingEntry> ccResultsReferee,
			EList<SubModelAssignmentResultEntry> unassigned) {
		StringBuilder sb = new StringBuilder();
		sb.append(System.lineSeparator());
		sb.append("##########################################");
		sb.append(System.lineSeparator());
		sb.append(exampleTitle);
		sb.append(System.lineSeparator());
		sb.append("##########################################");
		sb.append(System.lineSeparator());

		int longestSizeNames = 0;
		int intraEdgesSize = "Intra".length();
		int interEdgesSize = "Inter".length();
		int intraEdgesRefSize = "Intra(C)".length();
		int interEdgesRefSize = "Inter(C)".length();
		int longestSizePrecision = "Precision".length();
		int longestSizeRecall = "Recall".length();
		int longestSizeBalancedF = "BalancedF".length();

		double recallSum = 0;
		double precSum = 0;
		double balancedFSum = 0;
		double intraSum = 0;
		double interSum = 0;
		double intraSumRef = 0;
		double interSumRef = 0;

		appendPrecisionFeedback(results, sb);

		for (SubModel f : results.keySet()) {
			PrecisionRecallEntry entry = results.get(f);
			longestSizeNames = Math.max(longestSizeNames, f.getName().length());
			// longestSizePrecision = Math.max(longestSizePrecision, Double
			// .toString(entry.calculatePrecision()).length());
			// longestSizeRecall = Math.max(longestSizeRecall,
			// Double.toString(entry.calculateRecall()).length());
			// longestSizeBalancedF =
			// Math.max(longestSizeBalancedF, Double
			// .toString(entry.calculateBalancedF()).length());

			double precision = entry.calculatePrecision();
			double recall = entry.calculateRecall();
			double balancedF = entry.calculateBalancedF();

			precSum += Double.compare(Double.NaN, precision) == 0 ? 0
					: precision;
			recallSum += Double.compare(Double.NaN, recall) == 0 ? 0 : recall;
			balancedFSum += Double.compare(Double.NaN, balancedF) == 0 ? 0
					: balancedF;

			CoherenceCouplingEntry ccEntry = ccResults.get(f);
			CoherenceCouplingEntry ccEntryRef = ccResultsReferee.get(f);
			intraSum += ccEntry.getIntraEdges();
			interSum += ccEntry.getInterEdges();
			intraSumRef += ccEntryRef.getIntraEdges();
			interSumRef += ccEntryRef.getInterEdges();
		}

		appendWithTrailingBlanks(sb, "", longestSizeNames + 3);
		if (INCLUDE_EDGE_INFORMATION) {
			appendWithTrailingBlanks(sb, "Intra", intraEdgesSize + 2);
			appendWithTrailingBlanks(sb, "Inter", interEdgesSize + 2);
			appendWithTrailingBlanks(sb, "Intra (R)", intraEdgesRefSize + 2);
			appendWithTrailingBlanks(sb, "Inter (R)", interEdgesRefSize + 2);
		}
		appendWithTrailingBlanks(sb, "Precision", longestSizePrecision + 3);
		appendWithTrailingBlanks(sb, "Recall", longestSizeRecall + 3);
		appendWithTrailingBlanks(sb, "BalancedF", longestSizeRecall + 3);
		sb.append(System.lineSeparator());

		for (SubModel f : orderByName(results.keySet())) {
			PrecisionRecallEntry prEntry = results.get(f);
			CoherenceCouplingEntry ccEntry = ccResults.get(f);
			CoherenceCouplingEntry ccEntryRef = ccResultsReferee.get(f);
			appendWithTrailingBlanks(sb, f.getName(), longestSizeNames + 3);
			if (INCLUDE_EDGE_INFORMATION) {
				appendWithTrailingBlanks(sb,
						Double.toString(ccEntry.getIntraEdges()),
						intraEdgesSize + 2);
				appendWithTrailingBlanks(sb,
						Double.toString(ccEntry.getInterEdges()),
						interEdgesSize + 2);
				appendWithTrailingBlanks(sb,
						Double.toString(ccEntryRef.getIntraEdges()),
						intraEdgesRefSize + 2);
				appendWithTrailingBlanks(sb,
						Double.toString(ccEntryRef.getInterEdges()),
						interEdgesRefSize + 2);
			}
			appendWithTrailingBlanks(sb,
					Double.toString(round(prEntry.calculatePrecision())),
					longestSizePrecision + 3);
			appendWithTrailingBlanks(sb,
					Double.toString(round(prEntry.calculateRecall())),
					longestSizeRecall + 3);
			appendWithTrailingBlanks(sb,
					Double.toString(round(prEntry.calculateBalancedF())),
					longestSizeBalancedF + 3);
			sb.append(System.lineSeparator());

		}

		appendWithTrailingBlanks(sb, "TOTAL", longestSizeNames + 3);
		if (INCLUDE_EDGE_INFORMATION) {
			appendWithTrailingBlanks(sb, Double.toString(intraSum),
					intraEdgesSize + 2);
			appendWithTrailingBlanks(sb, Double.toString(interSum),
					interEdgesSize + 2);
			appendWithTrailingBlanks(sb, Double.toString(intraSumRef),
					intraEdgesRefSize + 2);
			appendWithTrailingBlanks(sb, Double.toString(interSumRef),
					interEdgesRefSize + 2);
		}
		appendWithTrailingBlanks(sb,
				Double.toString(round(precSum / results.keySet().size())),
				longestSizePrecision + 3);
		appendWithTrailingBlanks(sb,
				Double.toString(round(recallSum / results.keySet().size())),
				longestSizeRecall + 3);
		appendWithTrailingBlanks(sb,
				Double.toString(round(balancedFSum / results.keySet().size())),
				longestSizeBalancedF + 3);
		OverallAverageRegistry.entries.add(round(balancedFSum
				/ results.keySet().size()));
		// appendWithTrailingBlanks(sb,
		// Double.toString(PrecisionAndRecallEntry.calculateBalancedF(precSum,
		// recallSum)/results.keySet().size()), longestSizeBalancedF+3);
		sb.append(System.lineSeparator());
		sb.append(System.lineSeparator());

		if (!unassigned.isEmpty()) {
			sb.append("Unassigned Elements: (");
			sb.append(unassigned.size());
			sb.append(") [");
			for (ListIterator<SubModelAssignmentResultEntry> it = unassigned
					.listIterator(); it.hasNext();) {
				SubModelAssignmentResultEntry o = it.next();
				sb.append(NamingUtil.retreiveName(o.getRelevantElement()));
				if (it.hasNext())
					sb.append(", ");
			}
			sb.append("]");
		}

		sb.append(System.lineSeparator());

		return sb.toString();
	}

	private static void appendPrecisionFeedback(
			Map<SubModel, PrecisionRecallEntry> results, StringBuilder sb) {
		HashSet<String> falsePositives = new HashSet<String>();
		HashSet<String> falseNegatives = new HashSet<String>();
		int lowerNamePositive = 0;
		int lowerNameNegative = 0;
		for (String subModel : PrecisionRecallCalculator.resultFalseNegative
				.keySet()) {
			for (String s : PrecisionRecallCalculator.resultFalseNegative
					.get(subModel)) {
				falseNegatives.add(s);
				if (Character.isLowerCase(s.charAt(0)))
					lowerNameNegative++;
			}
		}
		for (String subModel : PrecisionRecallCalculator.resultFalsePositive
				.keySet()) {
			for (String s : PrecisionRecallCalculator.resultFalsePositive
					.get(subModel)) {
				falsePositives.add(s);
				if (Character.isUpperCase(s.charAt(0)))
					lowerNamePositive++;
			}
		}
		System.out.println("Positive: "+ lowerNamePositive + "/" + falsePositives.size());
		System.out.println("Negative: "+ lowerNameNegative + "/" + falseNegatives.size());
		
	}

	public static String getLatexFormattedEvaluationResultString(
			String exampleTitle, Map<SubModel, PrecisionRecallEntry> results,
			Map<SubModel, CoherenceCouplingEntry> ccResults,
			Map<SubModel, CoherenceCouplingEntry> ccResultsReferee,
			EList<SubModelAssignmentResultEntry> unassigned) {
		StringBuilder sb = new StringBuilder();
		// sb.append(System.lineSeparator());
		// sb.append("##########################################");
		// sb.append(System.lineSeparator());
		// sb.append(exampleTitle);
		// sb.append(System.lineSeparator());
		// sb.append("##########################################");
		// sb.append(System.lineSeparator());

		int longestSizeNames = 0;
		int intraEdgesSize = "Intra".length();
		int interEdgesSize = "Inter".length();
		int intraEdgesRefSize = "Intra(C)".length();
		int interEdgesRefSize = "Inter(C)".length();
		int longestSizePrecision = "Precision".length();
		int longestSizeRecall = "Recall".length();
		int longestSizeBalancedF = "BalancedF".length();

		double recallSum = 0;
		double precSum = 0;
		double balancedFSum = 0;
		double intraSum = 0;
		double interSum = 0;
		double intraSumRef = 0;
		double interSumRef = 0;

		for (SubModel f : results.keySet()) {
			PrecisionRecallEntry entry = results.get(f);
			longestSizeNames = Math.max(longestSizeNames, f.getName().length());
			// longestSizePrecision = Math.max(longestSizePrecision, Double
			// .toString(entry.calculatePrecision()).length());
			// longestSizeRecall = Math.max(longestSizeRecall,
			// Double.toString(entry.calculateRecall()).length());
			// longestSizeBalancedF =
			// Math.max(longestSizeBalancedF, Double
			// .toString(entry.calculateBalancedF()).length());

			double precision = entry.calculatePrecision();
			double recall = entry.calculateRecall();
			double balancedF = entry.calculateBalancedF();

			precSum += Double.compare(Double.NaN, precision) == 0 ? 0
					: precision;
			recallSum += Double.compare(Double.NaN, recall) == 0 ? 0 : recall;
			balancedFSum += Double.compare(Double.NaN, balancedF) == 0 ? 0
					: balancedF;

			CoherenceCouplingEntry ccEntry = ccResults.get(f);
			CoherenceCouplingEntry ccEntryRef = ccResultsReferee.get(f);
			intraSum += ccEntry.getIntraEdges();
			interSum += ccEntry.getInterEdges();
			intraSumRef += ccEntryRef.getIntraEdges();
			interSumRef += ccEntryRef.getInterEdges();
		}

		// appendWithTrailingBlanks(sb, "", longestSizeNames + 3);
		// if (INCLUDE_EDGE_INFORMATION) {
		// appendWithTrailingBlanks(sb, "Intra", intraEdgesSize + 2);
		// appendWithTrailingBlanks(sb, "Inter", interEdgesSize + 2);
		// appendWithTrailingBlanks(sb, "Intra (R)", intraEdgesRefSize + 2);
		// appendWithTrailingBlanks(sb, "Inter (R)", interEdgesRefSize + 2);
		// }
		// appendWithTrailingBlanks(sb, "Precision", longestSizePrecision + 3);
		// appendWithTrailingBlanks(sb, "Recall", longestSizeRecall + 3);
		// appendWithTrailingBlanks(sb, "BalancedF", longestSizeRecall + 3);
		// sb.append(System.lineSeparator());

		// for (SubModel f : orderByName(results.keySet())) {
		// PrecisionRecallEntry prEntry = results.get(f);
		// CoherenceCouplingEntry ccEntry = ccResults.get(f);
		// CoherenceCouplingEntry ccEntryRef = ccResultsReferee.get(f);
		// appendWithTrailingBlanks(sb, f.getName(), longestSizeNames + 3);
		// if (INCLUDE_EDGE_INFORMATION) {
		// appendWithTrailingBlanks(sb,
		// Double.toString(ccEntry.getIntraEdges()),
		// intraEdgesSize + 2);
		// appendWithTrailingBlanks(sb,
		// Double.toString(ccEntry.getInterEdges()),
		// interEdgesSize + 2);
		// appendWithTrailingBlanks(sb,
		// Double.toString(ccEntryRef.getIntraEdges()),
		// intraEdgesRefSize + 2);
		// appendWithTrailingBlanks(sb,
		// Double.toString(ccEntryRef.getInterEdges()),
		// interEdgesRefSize + 2);
		// }
		// appendWithTrailingBlanks(sb,
		// Double.toString(round(prEntry.calculatePrecision())),
		// longestSizePrecision + 3);
		// appendWithTrailingBlanks(sb,
		// Double.toString(round(prEntry.calculateRecall())),
		// longestSizeRecall + 3);
		// appendWithTrailingBlanks(sb,
		// Double.toString(round(prEntry.calculateBalancedF())),
		// longestSizeBalancedF + 3);
		// sb.append(System.lineSeparator());
		//
		// }

		appendWithTrailingBlanks(sb, exampleTitle, longestSizeNames + 3);
		appendWithTrailingBlanks(sb, " & ", 3);
		if (INCLUDE_EDGE_INFORMATION) {
			appendWithTrailingBlanks(sb, Integer.toString((int) intraSum),
					intraEdgesSize + 2);
			appendWithTrailingBlanks(sb, " & ", 1);
			appendWithTrailingBlanks(sb, Integer.toString((int) interSum),
					interEdgesSize + 2);
			appendWithTrailingBlanks(sb, " & ", 1);
			appendWithTrailingBlanks(sb,
					Double.toString(round(interSum / intraSum)),
					interEdgesSize + 2);
			appendWithTrailingBlanks(sb, " & ", 1);
			appendWithTrailingBlanks(sb, Integer.toString((int) intraSumRef),
					intraEdgesRefSize + 2);
			appendWithTrailingBlanks(sb, " & ", 1);
			appendWithTrailingBlanks(sb, Integer.toString((int) interSumRef),
					interEdgesRefSize + 2);
			appendWithTrailingBlanks(sb, " & ", 1);
			appendWithTrailingBlanks(sb,
					Double.toString(round(interSumRef / intraSumRef)),
					interEdgesSize + 2);
			appendWithTrailingBlanks(sb, " & ", 1);
		}
		appendWithTrailingBlanks(sb,
				Double.toString(round(precSum / results.keySet().size())),
				longestSizePrecision + 3);
		appendWithTrailingBlanks(sb, " \\% & ", 1);
		appendWithTrailingBlanks(sb,
				Double.toString(round(recallSum / results.keySet().size())),
				longestSizeRecall + 3);
		appendWithTrailingBlanks(sb, " \\% & \\textbf{", 1);
		appendWithTrailingBlanks(sb,
				Double.toString(round(balancedFSum / results.keySet().size())),
				longestSizeBalancedF + 3);
		appendWithTrailingBlanks(sb, "} \\%  ", 1);
		// appendWithTrailingBlanks(sb,
		// Double.toString(PrecisionAndRecallEntry.calculateBalancedF(precSum,
		// recallSum)/results.keySet().size()), longestSizeBalancedF+3);
		// sb.append(System.lineSeparator());
		// sb.append(System.lineSeparator());
		//
		// if (!unassigned.isEmpty()) {
		// sb.append("Unassigned Elements: (");
		// sb.append(unassigned.size());
		// sb.append(") [");
		// for (ListIterator<SubModelAssignmentResultEntry> it = unassigned
		// .listIterator(); it.hasNext();) {
		// SubModelAssignmentResultEntry o = it.next();
		// sb.append(NamingUtil.retreiveName(o.getRelevantElement()));
		// if (it.hasNext())
		// sb.append(", ");
		// }
		// sb.append("]");
		// }
		//
		sb.append("\\\\");
		sb.append(System.lineSeparator());

		return sb.toString();
	}

	private static int toPercent(double d) {
		d *= 100;
		d = Math.round(d);
		return (int) d / 1;
	}

	private static double round(double d) {
		d *= 100;
		d = Math.round(d);
		return d;
	}

	private static String truncateResult(String str) {
		if (str.length() > 6)
			return str.substring(0, 5);
		else
			return str;
	}

	private static List<SubModel> orderByName(Set<SubModel> keySet) {
		Map<String, SubModel> name2feat = new HashMap<String, SubModel>();
		for (SubModel f : keySet)
			name2feat.put(f.getName(), f);

		List<String> names = new ArrayList<String>();
		names.addAll(name2feat.keySet());
		Collections.sort(names);

		List<SubModel> result = new ArrayList<SubModel>();
		for (String name : names)
			result.add(name2feat.get(name));
		// TODO Auto-generated method stub
		return result;
	}

	private static void appendWithTrailingBlanks(StringBuilder sb, String s,
			int longestSize) {
		sb.append(s);
		for (int i = s.length(); i < longestSize; i++)
			sb.append(' ');
	}
}
