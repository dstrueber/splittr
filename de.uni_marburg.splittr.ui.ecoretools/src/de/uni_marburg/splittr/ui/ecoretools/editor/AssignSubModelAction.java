package de.uni_marburg.splittr.ui.ecoretools.editor;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;

import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.util.NamingUtil;

public class AssignSubModelAction implements IExternalJavaAction {


	/**
	 * The action expects a single EObject as input.
	 */
	public boolean canExecute(Collection<? extends EObject> selections) {
		return getSemanticTarget(selections) != null;
	}

	private EClass getSemanticTarget(Collection<? extends EObject> selections) {
		if (selections == null || selections.size() != 1) {
			return null;
		} else {
			final EObject selection = selections.iterator().next();
			final EObject semanticTarget;
			if (selection instanceof DSemanticDecorator) {
				semanticTarget = ((DSemanticDecorator) selection).getTarget();
			} else {
				semanticTarget = selection;
			}
			if (semanticTarget instanceof EClass) {
				return (EClass) semanticTarget;
			} else {
				return null;
			}
		}
	}
	
	

	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		EObject object = getSemanticTarget(selections);

		SubModelAssignmentResult assignment = AssignmentFileIOUtil.getAssignmentResult(object);

		if (assignment != null) {
			AssignSubModelWizard wiz = new AssignSubModelWizard(assignment, object); 
			wiz.setWindowTitle("Set sub-model for class " + NamingUtil.retreiveName(object));
			WizardDialog wizDog = new WizardDialog(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), wiz);
			wizDog.open();			
		} else {
			MessageBox mBox = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.ICON_INFORMATION | SWT.OK);
			mBox.setMessage("Please derive a splitting suggestion first. To derive a splitting suggestion, first define a splitting description by righting click on the model file in the package explorer and picking \"Create a Splitting Description...\". After defining the description, right click on the description file and select \"Derive a Splitting Suggestion...\"");
			mBox.setText("Please derive a splitting description");
			mBox.open();
		}
		
	}

	
}
