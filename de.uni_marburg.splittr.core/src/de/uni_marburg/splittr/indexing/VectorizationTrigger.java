package de.uni_marburg.splittr.indexing;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.Path;

import pitt.search.semanticvectors.LSA;
import pitt.search.semanticvectors.VectorStoreTranslater;
import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.description.splittr.SplittrPackage;
import de.uni_marburg.splittr.description.splittr.SubModel;
import de.uni_marburg.splittr.util.FileIOUtil;

/**
 * Convenience class for triggering Lucene's document indexing and
 * SemanticVector's LSI vector creation functionalities.
 * 
 * @author strueber
 * 
 */
public class VectorizationTrigger {
	private final static String TEMPORARY_PATH = "tmp_splitting/";
	
	public static void applyLuceneIndexer(String inputPath, String outputPath) {
		if (inputPath.endsWith(SplittrPackage.eNAME)) { // Index from msplit file
			String uri = new Path(inputPath).toFile().toURI().toString();
			SplittingDescription input = FileIOUtil
					.readDescriptionFile(uri);
			new File(TEMPORARY_PATH).mkdir();
			for (SubModel s : input.getSubmodels()) {
				FileIOUtil.simpleWriteToFile(TEMPORARY_PATH + s.getName(),
						s.getDescription());
			}
			String[] str = { "-docs", TEMPORARY_PATH, "-index", outputPath };
			FileIOUtil.purgeFolder(new File(outputPath));
			CustomFileIndexer.main(str);
			FileIOUtil.purgeFolder(new File(TEMPORARY_PATH));
			new File(TEMPORARY_PATH).delete();

		} else { // Index from file system
			String[] str = { "-docs", inputPath, "-index", outputPath };
			FileIOUtil.purgeFolder(new File(outputPath));
			CustomFileIndexer.main(str);
		}
	}

	public static void applySLA(String indexDirectory,
			String docVectorFileName, String termVectorFileName) {
		String[] str = { "-luceneindexpath", indexDirectory };
		try {
			LSA.main(str);
			LSA.main(str);
		} catch (IllegalArgumentException | IOException e) {
			System.err.println("Error while applying LSA.");
			e.printStackTrace();
		}

		String[] VstParamsDoc = { "-lucenetotext", docVectorFileName + ".bin",
				docVectorFileName + ".txt" };
		String[] VstParamsTerm = { "-lucenetotext",
				termVectorFileName + ".bin", termVectorFileName + ".txt" };
		try {
			VectorStoreTranslater.main(VstParamsDoc);
			VectorStoreTranslater.main(VstParamsTerm);
		} catch (IOException e) {
			System.err
					.println("Error while converting binary to ASCII vector representations.");
			e.printStackTrace();
		}
	}

}
