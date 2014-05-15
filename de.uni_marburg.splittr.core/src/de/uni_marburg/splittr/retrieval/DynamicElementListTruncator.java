package de.uni_marburg.splittr.retrieval;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Truncates a list of ranking search results so that only the initially
 * relevant entries are left.
 * 
 * @author strueber
 * 
 */
public class DynamicElementListTruncator<T> extends ElementListTruncator<T> {

	public DynamicElementListTruncator(TalkativeComparator<T> comparator) {
		this.comparator = comparator;
	}
	
	/**
	 * Truncates search results based on a default strategy.
	 * 
	 * @param elements
	 *            List of elements
	 * @return
	 */
	public List<T> truncateEntries(
			Collection<T> elements, float threshold, boolean sort) {
		return truncateEntries(elements, threshold, sort, 0, elements.size());
	}

	/**
	 * Truncates search results based on a default strategy.
	 * 
	 * @param elements
	 *            List of elements
	 * @return
	 */
	public List<T> truncateEntries(
			Collection<T> elements, float threshold, boolean sort, int minResults, int maxResults) {

		List<T> input = new ArrayList<T>();
		if (sort) 
			input = sortSearchResultByScore(elements);
		else 
			input.addAll(elements);
		
		
		// Default strategy:
		// - Always include first $MIN entries (if available)
		// - Truncate if the score between two successive entries decreases
		// more than $THRESHOLD
		// - Always truncate after $MAX entries
		List<T> newResults = new ArrayList<T>();
		for (int i = 0; i < maxResults && i < input.size(); i++) {
			if (i == 0 || i < minResults) {
				newResults.add(input.get(i));
			} else if(i<input.size()) {
				float lastScore = comparator.getComparisonBasis(input.get(i - 1));
				float currentScore = comparator.getComparisonBasis(input.get(i));
				float quotientRemainder = currentScore / lastScore;
				if (quotientRemainder >= threshold) {
					newResults.add(input.get(i));
				} else {
					i = maxResults;
				}
			} 
		}
		return newResults;

	}

}
