/**
 */
package de.uni_marburg.splittr.splittrResult.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.uni_marburg.splittr.splittrResult.SplittrResultPackage;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Model Assignment Result Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultEntryImpl#getSubModel <em>Sub Model</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultEntryImpl#getRelevantElement <em>Relevant Element</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultEntryImpl#getScore <em>Score</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubModelAssignmentResultEntryImpl extends MinimalEObjectImpl.Container implements SubModelAssignmentResultEntry {
	/**
	 * The cached value of the '{@link #getSubModel() <em>Sub Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModel()
	 * @generated
	 * @ordered
	 */
	protected SubModel subModel;

	/**
	 * The cached value of the '{@link #getRelevantElement() <em>Relevant Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevantElement()
	 * @generated
	 * @ordered
	 */
	protected EObject relevantElement;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final double SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected double score = SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubModelAssignmentResultEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplittrResultPackage.Literals.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubModel getSubModel() {
		if (subModel != null && subModel.eIsProxy()) {
			InternalEObject oldSubModel = (InternalEObject)subModel;
			subModel = (SubModel)eResolveProxy(oldSubModel);
			if (subModel != oldSubModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL, oldSubModel, subModel));
			}
		}
		return subModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubModel basicGetSubModel() {
		return subModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubModel(SubModel newSubModel) {
		SubModel oldSubModel = subModel;
		subModel = newSubModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL, oldSubModel, subModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRelevantElement() {
		if (relevantElement != null && relevantElement.eIsProxy()) {
			InternalEObject oldRelevantElement = (InternalEObject)relevantElement;
			relevantElement = eResolveProxy(oldRelevantElement);
			if (relevantElement != oldRelevantElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT, oldRelevantElement, relevantElement));
			}
		}
		return relevantElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRelevantElement() {
		return relevantElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelevantElement(EObject newRelevantElement) {
		EObject oldRelevantElement = relevantElement;
		relevantElement = newRelevantElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT, oldRelevantElement, relevantElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(double newScore) {
		double oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL:
				if (resolve) return getSubModel();
				return basicGetSubModel();
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT:
				if (resolve) return getRelevantElement();
				return basicGetRelevantElement();
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE:
				return getScore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL:
				setSubModel((SubModel)newValue);
				return;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT:
				setRelevantElement((EObject)newValue);
				return;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE:
				setScore((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL:
				setSubModel((SubModel)null);
				return;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT:
				setRelevantElement((EObject)null);
				return;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL:
				return subModel != null;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT:
				return relevantElement != null;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE:
				return score != SCORE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //SubModelAssignmentResultEntryImpl
