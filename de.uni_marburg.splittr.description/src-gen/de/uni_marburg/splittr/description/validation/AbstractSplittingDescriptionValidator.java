/*
 * generated by Xtext
 */
package de.uni_marburg.splittr.description.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractSplittingDescriptionValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(de.uni_marburg.splittr.description.splittr.SplittrPackage.eINSTANCE);
		return result;
	}
}
