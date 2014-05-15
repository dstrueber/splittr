/**
 */
package de.uni_marburg.splittr.splittrResult;

import java.util.Collection;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage
 * @generated
 */
public interface SplittrResultFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplittrResultFactory eINSTANCE = de.uni_marburg.splittr.splittrResult.impl.SplittrResultFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sub Model Assignment Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Model Assignment Result</em>'.
	 * @generated
	 */
	SubModelAssignmentResult createSubModelAssignmentResult();

	/**
	 * Returns a new object of class '<em>Sub Model Assignment Result Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Model Assignment Result Entry</em>'.
	 * @generated
	 */
	SubModelAssignmentResultEntry createSubModelAssignmentResultEntry();

	/**
	 * Returns a new object of class '<em>Sub Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Model</em>'.
	 * @generated
	 */
	SubModel createSubModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SplittrResultPackage getSplittrResultPackage();

	SubModel createSubModel(String name, String description);

	SubModelAssignmentResultEntry createSubModelAssignmentResultEntry(
			SubModel subModel, EObject relevantElement, double score);

	SubModelAssignmentResult createSubModelAssignmentResult(
			Collection<SubModelAssignmentResultEntry> subModelAssignmentResultEntries);

} //SplittrResultFactory
