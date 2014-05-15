package de.uni_marburg.splittr.retrieval;

import java.util.ArrayList;
import java.util.List;

import de.uni_marburg.splittr.indexing.LsaQueryInput;
import de.uni_marburg.splittr.splittrResult.SubModel;

/**
 * Holds a Lucene search result, comprising a set of search result entries, and
 * provides convenient querying functionality.
 * 
 * @author strueber
 * 
 */
public class LuceneSearchResult {
	public List<LuceneSearchResultEntry> entries;

	public LuceneSearchResult(int size) {
		entries = new ArrayList<LuceneSearchResultEntry>(size);
	}

	public void add(LuceneSearchResultEntry entry) {
		entries.add(entry);
	}

	public LuceneSearchResultEntry get(int i) {
		return entries.get(i);
	}

	public LuceneSearchResultEntry getEntryForDocument(LsaQueryInput document) {
		for (LuceneSearchResultEntry e : entries) {
			if (e.getDocument() == document)
				return e;
		}
		return null;
	}

	public LuceneSearchResultEntry getEntryForSubModel(SubModel subModel) {
		for (LuceneSearchResultEntry e : entries) {
			if (e.getResultObject() == subModel)
				return e;
		}
		return null;
	}

	public boolean containsDocument(LsaQueryInput document) {
		for (LuceneSearchResultEntry e : entries) {
			if (e.getDocument() == document)
				return true;
		}
		return false;
	}

	public boolean containsTitle(SubModel subModel) {
		for (LuceneSearchResultEntry e : entries) {
			if (e.getResultObject() == subModel)
				return true;
		}
		return false;
	}

	public List<LuceneSearchResultEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<LuceneSearchResultEntry> entries) {
		this.entries = entries;
	}

	public List<LuceneSearchResultEntry> getTruncatedEntries(
			GapElementListTruncator<LuceneSearchResultEntry> truncator) {
//		float threshold = Configuration.IR_TRUNCATE_ABSOLUTE_THRESHOLD;

		return truncator.truncateEntries(getEntries(), (float) 0.0, true);
	}
}
