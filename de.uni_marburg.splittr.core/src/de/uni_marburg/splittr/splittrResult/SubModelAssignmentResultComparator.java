package de.uni_marburg.splittr.splittrResult;

import de.uni_marburg.splittr.retrieval.TalkativeComparator;
import de.uni_marburg.splittr.util.NamingUtil;

public class SubModelAssignmentResultComparator  implements TalkativeComparator<SubModelAssignmentResultEntry> {
	@Override
	public int compare(SubModelAssignmentResultEntry arg0,
			SubModelAssignmentResultEntry arg1) {
		int scoreDifference = Double.compare(arg0.getScore(),
				arg1.getScore());
		if (scoreDifference == 0 && arg0.getRelevantElement() != null
				&& arg1.getRelevantElement() != null) {
			return NamingUtil.retreiveName(arg0.getRelevantElement())
					.compareTo(NamingUtil.retreiveName(arg0.getRelevantElement()));
		} else
			return scoreDifference;
	}

	@Override
	public int compare(SubModelAssignmentResultEntry arg0, Float arg1) {
		return Double.compare(arg0.getScore(), arg1);
	}
	
	@Override
	public float getComparisonBasis(SubModelAssignmentResultEntry arg0) {
		return (float) arg0.getScore();
	}
	
}