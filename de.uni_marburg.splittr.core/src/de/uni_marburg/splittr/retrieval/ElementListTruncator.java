package de.uni_marburg.splittr.retrieval;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class ElementListTruncator<T> {
	protected TalkativeComparator<T> comparator;
	
	/**
	 * Truncates the elements of a collection based on some strategy.
	 * 
	 * @param entryCollection
	 *            The collection in question.
	 * @return
	 */
	public  abstract List<T> truncateEntries(
			Collection<T> entryCollection, float threshold, boolean sort);

	
	protected List<T> sortSearchResultByScore(
			Collection<T> entries) {
		List<T> result = new ArrayList<T>();
		result.addAll(entries);
		Collections.sort(result, Collections.reverseOrder(comparator));
		// want ascending order
		return result;
	}
}