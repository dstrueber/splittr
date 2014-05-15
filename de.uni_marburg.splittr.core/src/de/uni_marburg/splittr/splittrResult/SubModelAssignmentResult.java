/**
 */
package de.uni_marburg.splittr.splittrResult;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Model Assignment Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#getEntries <em>Entries</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#getSubModels <em>Sub Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#getSubModelAssignmentResult()
 * @model
 * @generated
 */
public interface SubModelAssignmentResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#getSubModelAssignmentResult_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubModelAssignmentResultEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Sub Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_marburg.splittr.splittrResult.SubModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Models</em>' containment reference list.
	 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#getSubModelAssignmentResult_SubModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubModel> getSubModels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SubModel findSubModelByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<SubModelAssignmentResultEntry> findResultEntriesByElementName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<SubModelAssignmentResultEntry> findResultEntriesByElement(EObject element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<SubModelAssignmentResultEntry> findResultEntriesBySubModel(SubModel subModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<SubModelAssignmentResultEntry> findResultEntriesBySubModel(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SubModelAssignmentResultEntry findResultEntryBySubModelAndElement(SubModel subModel, EObject element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SubModelAssignmentResultEntry findResultEntryBySubModelAndElement(String subModelName, String elementName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String toString();
} // SubModelAssignmentResult
