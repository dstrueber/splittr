package de.uni_marburg.splittr.finalassign;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.splittrResult.SplittrResultFactory;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

public class UnassignedModelElementManager {

	public static void addUnassignedSubModel(SubModelAssignmentResult result,
			Set<EObject> vertexSet) {
		SubModel unassignedSubModel = createUnassignedSubModel(result);
		Set<EObject> unassigned = new HashSet<EObject>();
		for (EObject o : vertexSet) {
			if (result.findResultEntriesByElement(o).isEmpty()) {
				unassigned.add(o);
			}
		}
		for (EObject o : unassigned) {
			SubModelAssignmentResultEntry e = SplittrResultFactory.eINSTANCE
					.createSubModelAssignmentResultEntry(unassignedSubModel, o,
							1.0);
			result.getEntries().add(e);
		}

	}

	private static SubModel createUnassignedSubModel(
			SubModelAssignmentResult result) {
		SubModel unassignedSubModel = SplittrResultFactory.eINSTANCE
				.createSubModel();
		unassignedSubModel.setName("Unassigned");
		result.getSubModels().add(unassignedSubModel);
		return unassignedSubModel;
	}

}
