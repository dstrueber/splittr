package de.uni_marburg.splittr.finalassign;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.Configuration;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

public class FinalAssigner {

	static boolean assignWithThreshold = true;

	public static void assign(SubModelAssignmentResult result, EObject modelRoot, Configuration configuration) {
		switch (configuration.POSTPROCESSING_PARTITION) {
		case 1:
			partitionCleanStrategy(result, modelRoot, configuration);
			return;
		case 2:
			assignWithThresholdStrategy(result, modelRoot, configuration);
			return;
		default:
			return;
		}
	}

	public static void assignWithThresholdStrategy(
			SubModelAssignmentResult result, EObject modelRoot, Configuration configuration) {
		// First, get all involved model elements, and for each, model element,
		// the assignment result entries where they showed up.
		Map<EObject, Set<SubModelAssignmentResultEntry>> object2entry = new HashMap<EObject, Set<SubModelAssignmentResultEntry>>();
		for (SubModelAssignmentResultEntry e : result.getEntries()) {
			Set<SubModelAssignmentResultEntry> entrySet = object2entry.get(e
					.getRelevantElement());
			if (entrySet == null) {
				entrySet = new HashSet<SubModelAssignmentResultEntry>();
				object2entry.put(e.getRelevantElement(), entrySet);
			}
			entrySet.add(e);
		}


		// Second, bla
		Set<SubModelAssignmentResultEntry> retainableEntries = new HashSet<SubModelAssignmentResultEntry>();
		for (EObject object : object2entry.keySet()) {
			Set<SubModelAssignmentResultEntry> entries = object2entry.get(object);
			if (entries.size() == 1) {
				retainableEntries.addAll(entries);
			} else {
				SubModelAssignmentResultEntry bestEntry = null;
				for (SubModelAssignmentResultEntry entry : entries) {
					if (bestEntry == null) {
						bestEntry = entry;
					} else {
						if (entry.getScore() > bestEntry.getScore()) {
							bestEntry = entry;
						}
					}
				}
				retainableEntries.add(bestEntry);

				for (SubModelAssignmentResultEntry e : entries) {
					if (e != bestEntry) {
						// System.out.println(+e.getScore() + " "
						// +e.getRelevantElement());
						if (e.getScore() > configuration.POSTPROCESSING_OVERLAP_ADDITION_THRESHOLD)
							retainableEntries.add(e);
					}
				}
			}

		}

		result.getEntries().retainAll(retainableEntries);
	}

	public static void partitionCleanStrategy(SubModelAssignmentResult result,
			EObject modelRoot, Configuration configuration) {
		// First, get all involved model elements, and for each, model element,
		// the assignment result entries where they showed up.
		Map<EObject, Set<SubModelAssignmentResultEntry>> object2entry = new HashMap<EObject, Set<SubModelAssignmentResultEntry>>();
		for (SubModelAssignmentResultEntry e : result.getEntries()) {
			Set<SubModelAssignmentResultEntry> entrySet = object2entry.get(e
					.getRelevantElement());
			if (entrySet == null) {
				entrySet = new HashSet<SubModelAssignmentResultEntry>();
				object2entry.put(e.getRelevantElement(), entrySet);
			}
			entrySet.add(e);
		}


		// Second, create a subset of the result entries containing the result
		// entries to be retained later. The best way to
		// accommodate the model element in question is retained: The sub-model
		// with the highest precision for the
		// model element,
		Set<SubModelAssignmentResultEntry> retainableEntries = new HashSet<SubModelAssignmentResultEntry>();
		for (EObject object : object2entry.keySet()) {
			SubModelAssignmentResultEntry bestEntry = null;
			for (SubModelAssignmentResultEntry entry : object2entry.get(object)) {
				if (bestEntry == null) {
					bestEntry = entry;
				} else {
					if (entry.getScore() > bestEntry.getScore()) {
						bestEntry = entry;
					}
				}
			}
			retainableEntries.add(bestEntry);
		}

		result.getEntries().retainAll(retainableEntries);
	}

}
