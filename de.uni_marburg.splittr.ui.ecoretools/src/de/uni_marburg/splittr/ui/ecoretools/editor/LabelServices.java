package de.uni_marburg.splittr.ui.ecoretools.editor;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.util.NamingUtil;

public class LabelServices {
	public String getLabel(EObject object) {
		if (object == null || object.eResource() == null)
			return new String();
		
		StringBuilder sb = new StringBuilder();
		if (object instanceof EClassifier) {
			SubModel subModel = AssignmentFileIOUtil.getAssignedSubModel(object);
			if (subModel != null) {
				sb.append("«");
				sb.append(subModel.getName());
				sb.append("»\n");
			} 			
		}
		sb.append(NamingUtil.retreiveName(object));
		return sb.toString();
	}
}
