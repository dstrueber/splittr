package de.uni_marburg.splittr.retrieval;

import static pitt.search.semanticvectors.LuceneUtils.LUCENE_VERSION;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.indexing.LsaQueryInput;
import de.uni_marburg.splittr.indexing.ModelElementRegistry;
import de.uni_marburg.splittr.indexing.SubModelRegistry;
import de.uni_marburg.splittr.splittrResult.SubModel;

/**
 * Simple standalone class for searching a lucene index. Initially built
 * (quickly) for Pitt OTM demo, partly adapted from lucene demo code.
 * 
 * @author strueber
 */
public class LuceneIndexSearcher {

	private static final int MAX_RESULTS = 100;

	public static LuceneSearchResult search(String luceneField,
			String luceneIndex, LsaQueryInput queryDocument, int maxResults,
			Direction direction) {
		LuceneSearchResult result = new LuceneSearchResult(maxResults);
		if (queryDocument == null) {
			return result;
		}

		int startIndex = 0, endIndexOffset = 0;

		Query query = parserQuery(luceneField, queryDocument.getContent());
		IndexSearcher searcher = openIndex(luceneIndex);
		if (searcher == null || query == null)
			return result;
		TopDocs hits = retreiveHits(searcher, query, maxResults);

		endIndexOffset = maxResults; // default last element to maxResults
		if (hits != null && (startIndex + maxResults) > hits.totalHits) {
			// set the max index to maxResults or last
			endIndexOffset = hits.totalHits - startIndex;
		}

		for (int i = startIndex; i < (endIndexOffset + startIndex); i++) {
			try {
				float score = hits.scoreDocs[i].score;
				Document doc = searcher.doc(hits.scoreDocs[i].doc);
				String path = doc.get("path");

				String filename = path;
				if (path.indexOf(File.separator) > -1)
					filename = path
							.substring(path.lastIndexOf(File.separator) + 1);

				if (direction == Direction.SearchSubModels) {
					EObject resultObject = SubModelRegistry.getInstance()
							.query(filename);
					if (resultObject == null) {
						System.err
								.println("Error performing search. Unknown sub-model name: "
										+ filename);
					}
					result.add(new LuceneSearchResultEntry(queryDocument,
							score, resultObject));
				} else {
					Set<EObject> resultObjects = ModelElementRegistry
							.getInstance().query(filename);
					if (resultObjects == null)
						System.err
								.println("Error performing search. Invalid object name: "
										+ filename);
					for (EObject o : resultObjects)
						result.add(new LuceneSearchResultEntry(queryDocument,
								score, o));
				}

			} catch (Exception e) {
				System.err
						.println("Error while getting data from search results ...");
				e.printStackTrace();
			}
		}

		try {
			searcher.getIndexReader().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static TopDocs retreiveHits(IndexSearcher searcher, Query query,
			int maxResults) {
		TopDocs hits = null;
		try {
			hits = searcher.search(query, maxResults); // run the query
		} catch (Exception e) {
			System.err.println("Lucene: Error during search.");
			e.printStackTrace();
		}
		return hits;
	}

	private static Query parserQuery(String luceneField, String queryString) {
		try {
			// Analyzer analyzer = new StandardAnalyzer(LUCENE_VERSION);
			Analyzer analyzer = new MinimalStemmingAnalyzer();

			// Analyzer analyzer = new EnglishAnalyzer(LUCENE_VERSION);
			QueryParser qp = new QueryParser(LUCENE_VERSION, luceneField,
					analyzer);
			return qp.parse(queryString);
		} catch (ParseException e) {
			System.err.println("Lucene: Error parsing query.");
			e.printStackTrace();
			return null;
		}
	}

	private static IndexSearcher openIndex(String luceneIndex) {
		try {
			return new IndexSearcher(DirectoryReader.open(FSDirectory
					.open(new File(luceneIndex))));
		} catch (Exception e) {
			System.err.println("Lucene: Error opening index at: '"
					+ luceneIndex + "'");
			e.printStackTrace();
			return null;
		}
	}

	public static Map<SubModel, LuceneSearchResult> searchSubModelsForModelElementBatch(
			String luceneField, String indexDirectory,
			List<LsaQueryInput> queryBatch) {
		List<LuceneSearchResult> initialResults = new ArrayList<LuceneSearchResult>();
		for (LsaQueryInput document : queryBatch) {
			LuceneSearchResult searchResult = search(luceneField,
					indexDirectory, document, MAX_RESULTS,
					Direction.SearchSubModels);
			initialResults.add(searchResult);
		}

		Map<SubModel, LuceneSearchResult> result = new HashMap<SubModel, LuceneSearchResult>();
		for (LuceneSearchResult r : initialResults) {
			for (LuceneSearchResultEntry re : r.getEntries()) {
				LuceneSearchResult subModelResult = result.get((SubModel) re
						.getResultObject());
				if (subModelResult == null) {
					subModelResult = new LuceneSearchResult(0);
					result.put((SubModel) re.getResultObject(), subModelResult);
				}
				subModelResult.add(re);
			}
		}

		return result;
	}

	public static Map<EObject, LuceneSearchResult> searchModelElementsForSubModelBatch(
			String luceneField, String indexDirectory,
			List<LsaQueryInput> queryBatch) {
		List<LuceneSearchResult> initialResults = new ArrayList<LuceneSearchResult>();
		for (LsaQueryInput document : queryBatch) {
			LuceneSearchResult searchResult = search(luceneField,
					indexDirectory, document, MAX_RESULTS,
					Direction.SearchModelElements);
			initialResults.add(searchResult);
		}

		Map<EObject, LuceneSearchResult> result = new HashMap<EObject, LuceneSearchResult>();
		for (LuceneSearchResult r : initialResults) {
			for (LuceneSearchResultEntry re : r.getEntries()) {
				LuceneSearchResult subModelResult = result.get((EObject) re
						.getResultObject());
				if (subModelResult == null) {
					subModelResult = new LuceneSearchResult(0);
					result.put((EObject) re.getResultObject(), subModelResult);
				}
				subModelResult.add(re);
			}
		}

		return result;
	}
}

enum Direction {
	SearchSubModels, SearchModelElements;
}
