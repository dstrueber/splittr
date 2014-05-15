package de.uni_marburg.splittr.retrieval;

import java.util.Comparator;

public interface TalkativeComparator<T> extends Comparator<T> {
	public int compare(T arg0, Float arg1);

	float getComparisonBasis(T t);
}
