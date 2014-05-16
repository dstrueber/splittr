package de.uni_marburg.splittr.ui.ecoretools.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.description.splittr.SplittrFactory;
import de.uni_marburg.splittr.description.splittr.SubModel;
import de.uni_marburg.splittr.ui.ecoretools.Activator;
import de.uni_marburg.splittr.ui.ecoretools.RefreshUtil;
import de.uni_marburg.splittr.util.FileIOUtil;

public class CreateSplittingDescriptionStubAction implements
		IObjectActionDelegate {

	private ISelection selection;

	@Override
	public void run(IAction action) {
		if (!(selection instanceof IStructuredSelection))
			return;
		IPath modelPath = extractModelPathFromSelection((IStructuredSelection) selection);
		IPath splitDescriptionPath = modelPath.removeFileExtension()
				.addFileExtension(Activator.FILE_EXTENSION_SPLITTR_DESCRIPTION);
		SplittingDescription description = SplittrFactory.eINSTANCE
				.createSplittingDescription();
		
		SubModel s1 = SplittrFactory.eINSTANCE.createSubModel();
		s1.setName("TestModel");
		s1.setDescription("Insert a description here");
		description.getSubmodels().add(s1);
		description.setModelLocation(modelPath.lastSegment());
		
		String descriptionPathString = splitDescriptionPath.toString();
		FileIOUtil.saveXtextResource(description, descriptionPathString);
		RefreshUtil.refreshAllProjects();

		openFileInEditor(getFile(splitDescriptionPath));
	}

	private IPath extractModelPathFromSelection(IStructuredSelection selection) {
		IStructuredSelection ssel = (IStructuredSelection) selection;	
		Object firstElem = ssel.getFirstElement();
		
		if (!(firstElem instanceof IFile))
			return null;
			
		IPath modelPath = ((IFile) Platform.getAdapterManager().getAdapter(
				firstElem, IFile.class)).getLocation();
		return modelPath;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selection = targetPart.getSite().getWorkbenchWindow()
				.getSelectionService().getSelection();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (!(selection instanceof IStructuredSelection))
			return;
		IPath modelPath = extractModelPathFromSelection((IStructuredSelection) selection);
		if (modelPath == null)
			return; 
		IPath splitDescriptionPath = modelPath.removeFileExtension()
				.addFileExtension(Activator.FILE_EXTENSION_SPLITTR_DESCRIPTION);
		if (!getFile(splitDescriptionPath).isAccessible())
			action.setEnabled(true);
		else
			action.setEnabled(false);
	}

	/**
	 * Open the given file in an appropriate editor.
	 * 
	 * @param file
	 *            - The file to open.
	 */
	private static void openFileInEditor(IFile file) {
		// Get the active page.
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		// Figure out the default editor for the file type based on extension.
		IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry()
				.getDefaultEditor(file.getName());
		if (desc == null) {
			openPopupError("Editor open error",
					"Unable to find a suitable editor to open file.");
		} else {
			try {
				page.openEditor(new FileEditorInput(file), desc.getId());
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}

	private static void openPopupError(String title, String message) {
		Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK
				| SWT.CANCEL);
		dialog.setText(title);
		dialog.setMessage(message);

	}

	private IFile getFile(IPath modelPath) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		return workspace.getRoot().getFileForLocation(modelPath);
	}

}
