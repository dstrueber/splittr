package de.uni_marburg.splittr;

import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;

/**
 * Manages the sub-model assignment process. Takes a pair of a model and a set
 * of sub-model descriptions as input. Outputs sub model assignment results,
 * comprising a set of sub-model assignment entries.
 * 
 * @author strueber
 */
public interface SubModelAssigner {

	/**
	 * Performs a sub-model assignment based on the given parameters.
	 * 
	 * @return SubModel location results.
	 */
	public abstract SubModelAssignmentResult createAssignment();

	public abstract String getModelPath();

	public abstract void setModelPath(String modelPath);

	public abstract String getDescriptionPath();

	public abstract void setDescriptionPath(String descriptionPath);
}