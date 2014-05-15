package de.uni_marburg.splittr.ui.ecoretools.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;

public class AssignSubModelWizardPage extends WizardPage {
	private Combo combo;
	private Composite container;
	private EObject object;
	private SubModelAssignmentResult assignment;

	public AssignSubModelWizardPage(SubModelAssignmentResult assignment, EObject object) {
		super("Select Sub Model");
		setTitle("Select Sub Model");
		setDescription("Please select the target sub-model for this element.");
		
		this.assignment = assignment;
		this.object = object;
	}

	@Override
	public void createControl(Composite parent) {
		 
		parent.setSize(500, 200);
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.makeColumnsEqualWidth = false;
		
		
		GridData comboRow = new GridData(GridData.FILL_HORIZONTAL);
		comboRow.horizontalAlignment = GridData.FILL;
		
		Label selFeatureLabel = new Label(container, SWT.NONE);
		selFeatureLabel.setText("Select sub-model");

		combo = new Combo(container, SWT.DROP_DOWN);
		
		int counter=0;
		for (SubModel subModel: assignment.getSubModels()) {
			combo.add(subModel.getName());
			if (assignment.findResultEntryBySubModelAndElement(subModel, object) != null)
				combo.select(counter);
			counter++;
		}		
		
		selFeatureLabel.setLayoutData(comboRow);
				
		// Required to avoid an error in the system
		setControl(container);
		setPageComplete(true);

	}

	public int getSubModel() {
		return combo.getSelectionIndex();
	}

}