package de.uni_marburg.splittr.retrieval;

import de.uni_marburg.splittr.util.NamingUtil;

/**
 * Compare two search result based by their score, or, if score is the same,
 * name (to ensure stability)
 * @author strueber
 *
 */
public class LuceneSearchResultComparator implements TalkativeComparator<LuceneSearchResultEntry> {
	@Override
	public int compare(LuceneSearchResultEntry arg0,
			LuceneSearchResultEntry arg1) {
		int scoreDifference = Float.compare(arg0.getScore(),
				arg1.getScore());
		if (scoreDifference == 0 && arg0.getResultObject() != null
				&& arg1.getResultObject() != null) {
			return NamingUtil.retreiveName(arg0.getResultObject())
					.compareTo(NamingUtil.retreiveName(arg0.getResultObject()));
		} else
			return scoreDifference;
	}

	@Override
	public int compare(LuceneSearchResultEntry arg0, Float arg1) {
		return Float.compare(arg0.getScore(), arg1);
	}
	
	@Override
	public float getComparisonBasis(LuceneSearchResultEntry arg0) {
		return arg0.getScore();
	}
	
}