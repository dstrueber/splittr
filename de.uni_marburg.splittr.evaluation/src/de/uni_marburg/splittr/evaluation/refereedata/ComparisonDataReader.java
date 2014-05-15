package de.uni_marburg.splittr.evaluation.refereedata;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.uni_marburg.splittr.analysis.graph.uml.SubsetRegistry;
import de.uni_marburg.splittr.util.FileIOUtil;

public class ComparisonDataReader {

	public static Map<String, Set<String>> readComparisonDataFromDirectory(
			String path) {
		Map<String, Set<String>> result = new HashMap<String, Set<String>>();
		File file = new File(path);

		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				Set<String> classes = new HashSet<String>();
				String featureName = f.getName();
				if (featureName.indexOf('.') >= 0) {
				 featureName = featureName.substring(0,
						f.getName().indexOf('.'));}

				String contents = FileIOUtil.simpleReadFromFile(f);
				contents = extractClassNames(contents);
				String contentsArray[] = contents.split("\n");
				for (int i = 0; i < contentsArray.length; i++)
					classes.add(contentsArray[i].trim());

				if (!classes.isEmpty()) {
					result.put(featureName, classes);
					SubsetRegistry.subset.addAll(classes);
				}

			}
		}
		return result;
	}

	private static String extractClassNames(String input) {
		Pattern pattern = Pattern
				.compile("DiffEntry\\[(ADD|MODIFY) .*\\/(.*?)\\.java\\]");
		Matcher matcher = pattern.matcher(input);
		return matcher.replaceAll("$2");
	}

	public static void main(String[] args) {
		Map<String, Set<String>> results = readComparisonDataFromDirectory("input/freemindreferee");
		for (String feature : results.keySet()) {
			System.out.print(" * " + feature.substring(0, 10) + "...: ");
			for (String clas : results.get(feature))
				System.out.print(clas + " ### ");
			System.out.println();
		}
	}

}
