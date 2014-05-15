package de.uni_marburg.splittr.indexing;

import java.util.List;

import de.uni_marburg.splittr.splittrResult.SubModel;

public interface ISubModelReader {

	/**
	 * Takes a sub-model description path (directory or file) as input and returns a list of query inputs.
	 * 
	 * @param outputDirectoryPath
	 */
	public List<LsaQueryInput> createLsaQueries(String subModelDescriptionPath);

	/**
	 * Reads a list of sub-models from the file system, put them into the sub-model registry and returns them.
	 * 
	 * @param outputDirectoryPath
	 */
	public List<SubModel> readSubModelsFromFileSystem(String path);
	
}
