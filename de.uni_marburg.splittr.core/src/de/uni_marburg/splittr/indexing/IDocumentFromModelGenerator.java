package de.uni_marburg.splittr.indexing;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface IDocumentFromModelGenerator {

	/**
	 * Reads the model from the given file path and writes a set of document files
	 * corresponding to significant model elements.
	 * 
	 * @param inputModelPath
	 * @param outputDirectoryPath
	 */
	public void writeDocuments(String inputModelPath,
			String outputDirectoryPath);

	/**
	 * Takes a model as input and writes a set of document files corresponding to
	 * significant model elements.
	 * 
	 * @param modelRoot
	 *            Root object of the model in question
	 * @param outputDirectoryPath
	 */
	public void writeDocuments(EObject modelRoot,
			String outputDirectoryPath);
	
	/**
	 * Takes a model as input and returns a list of query inputs corresponding to
	 * significant model elements.
	 * 
	 * @param modelRoot
	 *            Root object of the model in question
	 * @param outputDirectoryPath
	 */
	public List<LsaQueryInput> createLsaQueries(EObject modelRoot,
			String outputDirectoryPath);
}