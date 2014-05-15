package de.uni_marburg.splittr.ui.ecoretools;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class RefreshUtil {

	public static void refreshAllProjects() {
		for (IProject p : ResourcesPlugin.getWorkspace().getRoot()
				.getProjects()) {
			try {
				p.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
}
