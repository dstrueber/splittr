package de.uni_marburg.splittr.retrieval;

import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.indexing.LsaQueryInput;
import de.uni_marburg.splittr.util.NamingUtil;

/**
 * Holds a result of searching the Lucene index.
 * @author strueber
 *
 */
public class LuceneSearchResultEntry {
	private LsaQueryInput document;
	private float score;
	private EObject resultObject;
	
	public LuceneSearchResultEntry(LsaQueryInput document, float score, EObject resultObject) {
		super();
		this.document = document;
		this.score = score;
		this.resultObject = resultObject;
	}

	public LsaQueryInput getDocument() {
		return document;
	}


	public float getScore() {
		return score;
	}


	public EObject getResultObject() {
		return resultObject;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		sb.append(NamingUtil.retreiveName(resultObject));
		sb.append(',');
		sb.append(document.getName());
		sb.append(',');
		sb.append(score);
		sb.append(']');
		return sb.toString();
	}
	
}
