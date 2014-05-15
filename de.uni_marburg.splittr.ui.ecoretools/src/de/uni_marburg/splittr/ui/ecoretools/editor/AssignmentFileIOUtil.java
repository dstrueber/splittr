package de.uni_marburg.splittr.ui.ecoretools.editor;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;
import de.uni_marburg.splittr.ui.ecoretools.Activator;
import de.uni_marburg.splittr.util.FileIOUtil;

/**
 * This class loads a @ SubModelAssignmentResult} from the file system and
 * caches it for a fixed amount of time, per default 3 seconds. This is to avoid
 * gratuitous file IO.
 */
public class AssignmentFileIOUtil {
	private static Map<Resource, SubModelAssignmentResult> assignments = new HashMap<Resource, SubModelAssignmentResult>();
	private static Map<EObject, SubModel> directAssignments = new HashMap<EObject, SubModel>();
	private static Map<SubModel, Integer> subModelIndicies = new HashMap<SubModel, Integer>();

	private static Calendar cachingTimestamp = Calendar.getInstance();
	private static final int CACHE_EXPIRY = 3000; // milli seconds

	public static SubModel getAssignedSubModel(EObject object) {
		if (!cacheExpired()) {
			if (directAssignments.containsKey(object))
				return directAssignments.get(object);
		}
		refresh(object);
		return directAssignments.get(object);
	}

	public static Integer getSubModelIndex(SubModel object) {
		if (!cacheExpired()) {
			if (subModelIndicies.containsKey(object))
				return subModelIndicies.get(object);
		}
		refresh(object);
		return subModelIndicies.get(object);
	}

	public static SubModelAssignmentResult getAssignmentResult(EObject resource) {
		if (!cacheExpired()) {
			if (assignments.containsKey(resource))
				return assignments.get(resource);
		}
		refresh(resource);
		return assignments.get(resource);
	}

	private static void refresh(EObject object) {
		IPath modelPath = new Path(object.eResource().getURI().toString());
		IPath resultPath = modelPath.removeFileExtension().addFileExtension(
				Activator.FILE_EXTENSION_SPLITTR_RESULT);
		SubModelAssignmentResult assignment = FileIOUtil
				.loadSubModelAssignmentResult(resultPath.toString(), object
						.eResource().getResourceSet(), true);
		assignments.put(object.eResource(), assignment);
		EList<SubModel> subModels = assignment.getSubModels();
		for (int i = 0; i < subModels.size(); i++)
			subModelIndicies.put(assignment.getSubModels().get(i), i);
		for (SubModelAssignmentResultEntry e : assignment.getEntries())
			directAssignments.put(e.getRelevantElement(), e.getSubModel());
		cachingTimestamp = Calendar.getInstance();
	}

	private static boolean cacheExpired() {
		long difference = Calendar.getInstance().getTimeInMillis()
				- cachingTimestamp.getTimeInMillis();
		return (difference > CACHE_EXPIRY);
	}

}
