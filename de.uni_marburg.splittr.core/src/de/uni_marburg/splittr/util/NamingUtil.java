package de.uni_marburg.splittr.util;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.NamedElement;

public class NamingUtil {
		
	/**
	 * Heuristically determines the name of the model element in question.
	 * @param modelElement
	 * @return
	 */
	public static String retreiveName(EObject modelElement) {
		if (modelElement instanceof ENamedElement) {
			return ((ENamedElement) modelElement).getName();
		}
		if (modelElement instanceof NamedElement) {
			return ((NamedElement) modelElement).getName();
		}
		if (modelElement != null && modelElement.eClass() != null) {
			EStructuralFeature nameFeature = modelElement.eClass()
					.getEStructuralFeature("name");
			if (nameFeature != null) {
				return (String) modelElement.eGet(nameFeature);
			}
		}
		if (modelElement == null) {
			return null;
		}
		return modelElement.toString();
	}

}
