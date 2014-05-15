/**
 */
package de.uni_marburg.splittr.splittrResult;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Model Assignment Result Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getSubModel <em>Sub Model</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getRelevantElement <em>Relevant Element</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#getSubModelAssignmentResultEntry()
 * @model
 * @generated
 */
public interface SubModelAssignmentResultEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Model</em>' reference.
	 * @see #setSubModel(SubModel)
	 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#getSubModelAssignmentResultEntry_SubModel()
	 * @model
	 * @generated
	 */
	SubModel getSubModel();

	/**
	 * Sets the value of the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getSubModel <em>Sub Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Model</em>' reference.
	 * @see #getSubModel()
	 * @generated
	 */
	void setSubModel(SubModel value);

	/**
	 * Returns the value of the '<em><b>Relevant Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Element</em>' reference.
	 * @see #setRelevantElement(EObject)
	 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#getSubModelAssignmentResultEntry_RelevantElement()
	 * @model
	 * @generated
	 */
	EObject getRelevantElement();

	/**
	 * Sets the value of the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getRelevantElement <em>Relevant Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevant Element</em>' reference.
	 * @see #getRelevantElement()
	 * @generated
	 */
	void setRelevantElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#getSubModelAssignmentResultEntry_Score()
	 * @model
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

} // SubModelAssignmentResultEntry
