package de.uni_marburg.splittr.indexing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.uni_marburg.splittr.splittrResult.SubModel;


/**
 * A registry responsible for maintaining a mapping from sub-model names to sub-models.
 * 
 * @author strueber
 * 
 */
public class SubModelRegistry {

	private Map<String, SubModel> name2submodel;

	private static SubModelRegistry INSTANCE = new SubModelRegistry();

	private SubModelRegistry() {
		name2submodel = new HashMap<String, SubModel>();
	}

	public static SubModelRegistry getInstance() {
		return INSTANCE;
	}

	public void registerPair(SubModel subModel, String document) {
		name2submodel.put(document, subModel);
	}


	public SubModel query(String document) {
		return name2submodel.get(document);
	}

	public void clear() {
		name2submodel.clear();
	}

	public Collection<SubModel> getSubModels() {
	return name2submodel.values();
	}
}
