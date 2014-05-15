package de.uni_marburg.splittr.ui.ecoretools.editor;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.wizard.Wizard;

import de.uni_marburg.splittr.splittrResult.SplittrResultFactory;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

public class AssignSubModelWizard extends Wizard {

	protected AssignSubModelWizardPage wizardPage;
	private EObject object;
	private SubModelAssignmentResult assignment;

	public AssignSubModelWizard(SubModelAssignmentResult assignment, EObject object) {
		super();
		setNeedsProgressMonitor(true);

		this.assignment = assignment;
		this.object = object;
	}

	@Override
	public void addPages() {
		wizardPage = new AssignSubModelWizardPage(assignment, object);
		addPage(wizardPage);
	}

	@Override
	public boolean performFinish() {
		SubModel s = assignment.getSubModels().get(wizardPage.getSubModel());
		EList<SubModelAssignmentResultEntry> entries = assignment
				.findResultEntriesByElement(object);

		if (entries.isEmpty()) {
			SubModelAssignmentResultEntry e = SplittrResultFactory.eINSTANCE
					.createSubModelAssignmentResultEntry(s, object, 1.0);
			assignment.getEntries().add(e);
		} else {
			for (SubModelAssignmentResultEntry e : entries) {
				e.setSubModel(s);
			}
		}

		try {
			assignment.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}
}
