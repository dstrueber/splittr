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

import de.uni_marburg.splittr.splitting.EcoreModelIntoMultiplePackagesSplitter;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.ui.ecoretools.RefreshUtil;
import de.uni_marburg.splittr.util.FileIOUtil;

public class SplitPackageAction implements IObjectActionDelegate {

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
		SubModelAssignmentResult assignment = FileIOUtil.loadSubModelAssignmentResult(splittingResultPath.toString(), rs);
		EcoreModelIntoMultiplePackagesSplitter sp = new EcoreModelIntoMultiplePackagesSplitter(assignment);
		
		IPath resultpath = splittingResultPath.removeFileExtension();
		String name = resultpath.lastSegment();
		resultpath = resultpath.addFileExtension("split").addFileExtension("ecore");
		sp.save(resultpath.toString(), name);
		
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
