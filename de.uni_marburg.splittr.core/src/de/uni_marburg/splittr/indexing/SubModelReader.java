package de.uni_marburg.splittr.indexing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Path;

import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.description.splittr.SplittrPackage;
import de.uni_marburg.splittr.splittrResult.SplittrResultFactory;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.util.FileIOUtil;

public class SubModelReader implements ISubModelReader {

	@Override
	public List<LsaQueryInput> createLsaQueries(String subModelDescriptionPath) {
		List<SubModel> subModels = readSubModelsFromFileSystem(subModelDescriptionPath);
		List<LsaQueryInput> results = new ArrayList<LsaQueryInput>();
		for (SubModel f : subModels) {
			results.add(new LsaQueryInput(f.getName(), f.getDescription())); 
		}
		return results;
	}

	/**
	 * Reads a list of sub-model descriptions from a directory or file. If the
	 * input path leads to a directory, one sub-model is returned for each
	 * contained file. If the input path leads to a text file, one sub-model is
	 * returned for each line. As side effect, adds the sub-models to the sub-model
	 * registry.
	 * 
	 * @param path
	 *            Directory or file path
	 * @return
	 */
	public List<SubModel> readSubModelsFromFileSystem(String path) {
		List<SubModel> result = new ArrayList<SubModel>(); 
		File file = new File(path);
		if (path.endsWith(SplittrPackage.eNAME)) { 	// Read from description file
			String uri = new Path(path).toFile().toURI().toString();
			SplittingDescription d = FileIOUtil.readDescriptionFile(uri);
			for (de.uni_marburg.splittr.description.splittr.SubModel s : d.getSubmodels()) {
				de.uni_marburg.splittr.splittrResult.SubModel subModel = SplittrResultFactory.eINSTANCE.createSubModel(s.getName(),
						s.getDescription());
				result.add(subModel);
				SubModelRegistry.getInstance()
						.registerPair(subModel, subModel.getName());
			}
		} else if (file.isDirectory()) { 			// Read from directory structure
			for (File f : file.listFiles()) {
				String contents = FileIOUtil.removeBadCharacters(FileIOUtil
						.simpleReadFromFile(f));
				SubModel subModel = SplittrResultFactory.eINSTANCE.createSubModel(f.getName(),
						contents);
				result.add(subModel);
				SubModelRegistry.getInstance()
						.registerPair(subModel, subModel.getName());
			}
		} else {									// Read from CSV
			String contents = FileIOUtil.removeBadCharacters(FileIOUtil
					.simpleReadFromFile(file));
			String[] subModels = contents.split(System.lineSeparator());
			for (int i = 0; i < subModels.length; i++) {
				SubModel subModel = SplittrResultFactory.eINSTANCE.createSubModel(subModels[i],
						subModels[i]);
				result.add(subModel);
				SubModelRegistry.getInstance().registerPair(subModel, subModels[i]);
			}
		}
		return result;
	}

}
