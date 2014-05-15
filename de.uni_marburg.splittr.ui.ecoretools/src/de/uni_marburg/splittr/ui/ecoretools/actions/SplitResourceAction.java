package de.uni_marburg.splittr.ui.ecoretools.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_marburg.splittr.splitting.EcoreModelIntoMultipleFilesSplitter;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.ui.ecoretools.RefreshUtil;
import de.uni_marburg.splittr.util.FileIOUtil;

public class SplitResourceAction implements IObjectActionDelegate {

	private ISelection selection;

	@Override
	public void run(IAction action) {
		if (!(selection instanceof IStructuredSelection))
			return;
		IStructuredSelection ssel = (IStructuredSelection) selection;
		Object firstElem = ssel.getFirstElement();
		IPath splittingResultPath = ((IFile) Platform.getAdapterManager().getAdapter(
				firstElem, IFile.class)).getLocation();

		ResourceSet rs = new ResourceSetImpl();
//		String uriString = splittingResultPath.toFile().toURI().toString();
		SubModelAssignmentResult assignment = FileIOUtil.loadSubModelAssignmentResult(splittingResultPath.toString(), rs);

		EcoreModelIntoMultipleFilesSplitter sp = new EcoreModelIntoMultipleFilesSplitter(assignment);
		IPath resultsPath = splittingResultPath.removeLastSegments(1).addTrailingSeparator().append("splittingResults").addTrailingSeparator();
		sp.saveAll(resultsPath.toString());
		
		RefreshUtil.refreshAllProjects();
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selection = targetPart.getSite().getWorkbenchWindow()
				.getSelectionService().getSelection();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// Nothing to do here
	}
}
