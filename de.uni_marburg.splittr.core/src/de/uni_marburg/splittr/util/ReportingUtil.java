package de.uni_marburg.splittr.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.indexing.ModelElementRegistry;
import de.uni_marburg.splittr.retrieval.LuceneSearchResult;
import de.uni_marburg.splittr.retrieval.LuceneSearchResultEntry;
import de.uni_marburg.splittr.splittrResult.SubModel;

public class ReportingUtil {



	public static void reportLuceneBatchSearchResults(
			Map<SubModel, LuceneSearchResult> results) {
		StringBuilder sb = new StringBuilder();
		for (SubModel subModel : results.keySet()) {
			String query = subModel.getDescription();
			sb.append("============================");
			sb.append(System.lineSeparator());
			sb.append("Query: ");
			sb.append(query);
			sb.append("\n============================\n");

			int pos = 1;
			for (LuceneSearchResultEntry res : results.get(subModel)
					.getEntries()) {
				for (EObject o : ModelElementRegistry.getInstance()
						.query(res.getDocument().getName())) {
					sb.append(pos);
					sb.append(". ");
					sb.append("Score: ");
					sb.append(res.getScore());
					sb.append(" Document: ");
					
					sb.append(NamingUtil.retreiveName(o));
					sb.append("\n");
					pos++;
					
				}
			}
		}
		System.out.print(sb.toString());
	}
}
