package de.uni_marburg.splittr.ui.ecoretools.actions;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.ecore.EcoreSubModelAssigner;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.ui.ecoretools.Activator;
import de.uni_marburg.splittr.ui.ecoretools.RefreshUtil;
import de.uni_marburg.splittr.util.FileIOUtil;

public class DeriveSplittingSuggestionAction implements IObjectActionDelegate {

	private ISelection selection;

	@Override
	public void run(IAction action) {
		if (!(selection instanceof IStructuredSelection))
			return;
		IStructuredSelection ssel = (IStructuredSelection) selection;
		Object firstElem = ssel.getFirstElement();
		IPath splittingDescriptionPath = ((IFile) Platform.getAdapterManager()
				.getAdapter(firstElem, IFile.class)).getLocation();
		IPath modelPath = extractModelPath(splittingDescriptionPath);
		IPath temporaryPath = splittingDescriptionPath.removeLastSegments(1)
				.addTrailingSeparator().append("tmp_split" + Math.random())
				.addTrailingSeparator();

		EcoreSubModelAssigner sa = new EcoreSubModelAssigner(
				modelPath.toString(), splittingDescriptionPath.toString(),
				temporaryPath.toString());
		configureAssigner(splittingDescriptionPath, sa);
		SubModelAssignmentResult result = sa.createAssignment();

		IPath resultPath = determineResultPath(modelPath);
		FileIOUtil.saveResource(result, new File(resultPath.toString()).toURI()
				.toString());

		FileIOUtil.purgeFolder(temporaryPath.toFile());
		RefreshUtil.refreshAllProjects();
	}

	private void configureAssigner(IPath splittingDescriptionPath,
			EcoreSubModelAssigner sa) {
		SplittingDescription d = (SplittingDescription) FileIOUtil
				.loadResource(splittingDescriptionPath.toString());
		if (d.getThreshold() != 0.0) {
			sa.getConfiguration().TRUNCATE_FOR_PARTIAL_SPLIT = true;
			sa.getConfiguration().POSTPROCESSING_TRUNCATION_THRESHOLD = (float) d
					.getThreshold();
		}
		if (d.getWeightAggregation() != 0.0)
			sa.getConfiguration().WEIGHT_AGGREGATION = d.getWeightAggregation();
		if (d.getWeightAssociation() != 0.0)
			sa.getConfiguration().WEIGHT_ASSOCIATION = d.getWeightAssociation();
		if (d.getWeightContainment() != 0.0)
			sa.getConfiguration().WEIGHT_COMPOSITION = d.getWeightContainment();
		if (d.getWeightGeneralization() != 0.0)
			sa.getConfiguration().WEIGHT_GENERALIZATION = d
					.getWeightGeneralization();
		if (d.getWeightInterface() != 0.0)
			sa.getConfiguration().WEIGHT_INTERFACE_REALIZATION = d
					.getWeightInterface();
		if (d.getWeightEnum() != 0.0)
			sa.getConfiguration().WEIGHT_ENUM_INSTANTIATION = d.getWeightEnum();

	}

	private IPath extractModelPath(IPath splittingDescriptionPath) {
		String splittingDescriptionPathString = splittingDescriptionPath
				.toFile().toURI().toString();
		SplittingDescription description = FileIOUtil
				.readDescriptionFile(splittingDescriptionPathString);
		if (description != null) {
			String modelLocation = description.getModelLocation();
			if (modelLocation.startsWith("file:"))
				return new Path(modelLocation);
			else if (!description.getModelLocation().contains(File.separator))
				return splittingDescriptionPath.removeLastSegments(1)
						.addTrailingSeparator().append(modelLocation);
			else
				return new Path(modelLocation);
		} else
			return null;
	}

	private IPath determineResultPath(IPath modelPath) {
		return modelPath.removeFileExtension().addFileExtension(
				Activator.FILE_EXTENSION_SPLITTR_RESULT);
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
