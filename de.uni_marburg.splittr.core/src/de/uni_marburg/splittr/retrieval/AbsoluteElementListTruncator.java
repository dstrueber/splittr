package de.uni_marburg.splittr.retrieval;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AbsoluteElementListTruncator<T> extends
		ElementListTruncator<T> {
	public AbsoluteElementListTruncator(
			TalkativeComparator<T> comparator) {
		this.comparator = comparator;
	}

	/**
	 * Truncates search results based on a default strategy.
	 * 
	 * @param searchResult
	 *            List of search results, sorted by score
	 * @return
	 */
	public List<T> truncateEntries(Collection<T> searchResult, float threshold, boolean sort) {
		List<T> input = new ArrayList<T>();
		if (sort) 
			input = sortSearchResultByScore(searchResult);
		else 
			input.addAll(searchResult);

		List<T> newResults = new ArrayList<T>();
		for (int i = 0; i < input.size(); i++) {
			if (comparator.compare(input.get(i), threshold) >= 0) {
				newResults.add(input.get(i));
			} else {
				if (sort)
					i = input.size();
			}
		}

		return newResults;
	}

}
