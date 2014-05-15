/**
 */
package de.uni_marburg.splittr.splittrResult.impl;


import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_marburg.splittr.splittrResult.SplittrResultPackage;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;
import de.uni_marburg.splittr.util.NamingUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Model Assignment Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultImpl#getSubModels <em>Sub Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubModelAssignmentResultImpl extends MinimalEObjectImpl.Container implements SubModelAssignmentResult {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<SubModelAssignmentResultEntry> entries;

	/**
	 * The cached value of the '{@link #getSubModels() <em>Sub Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SubModel> subModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubModelAssignmentResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SplittrResultPackage.Literals.SUB_MODEL_ASSIGNMENT_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubModelAssignmentResultEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<SubModelAssignmentResultEntry>(SubModelAssignmentResultEntry.class, this, SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubModel> getSubModels() {
		if (subModels == null) {
			subModels = new EObjectContainmentEList<SubModel>(SubModel.class, this, SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS);
		}
		return subModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SubModel findSubModelByName(String subModel) {
		for (SubModel f : getSubModels())
			if (f.getName().equals(subModel))
				return f;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubModelAssignmentResultEntry> findResultEntriesByElementName(String name) {
		EList<SubModelAssignmentResultEntry> result = new BasicEList<SubModelAssignmentResultEntry>();
		for (SubModelAssignmentResultEntry e : getEntries())
			if (e.getRelevantElement() != null && NamingUtil.retreiveName(e.getRelevantElement()).equals(name))
				result.add(e);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SubModelAssignmentResultEntry> findResultEntriesByElement(EObject element) {
		EList<SubModelAssignmentResultEntry> result = new BasicEList<SubModelAssignmentResultEntry>();
		for (SubModelAssignmentResultEntry e : getEntries())
			if (e.getRelevantElement() != null && e.getRelevantElement() == element)
				result.add(e);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SubModelAssignmentResultEntry> findResultEntriesBySubModel(
			SubModel subModel) {
		EList<SubModelAssignmentResultEntry> result = new BasicEList<SubModelAssignmentResultEntry>();
		for (SubModelAssignmentResultEntry e : getEntries())
			if (e.getSubModel() == subModel)
				result.add(e);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SubModelAssignmentResultEntry> findResultEntriesBySubModel(
			String name) {
		EList<SubModelAssignmentResultEntry> result = new BasicEList<SubModelAssignmentResultEntry>();
		for (SubModelAssignmentResultEntry e : getEntries())
			if (e.getSubModel().getName().equals(name))
				result.add(e);
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SubModelAssignmentResultEntry findResultEntryBySubModelAndElement(
			SubModel subModel, EObject element) {
		for (SubModelAssignmentResultEntry e : getEntries())
			if (e.getSubModel() == subModel && e.getRelevantElement() == element)
				return e;
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SubModelAssignmentResultEntry findResultEntryBySubModelAndElement(
			String subModelName, String elementName) {
		for (SubModelAssignmentResultEntry e : getEntries())
			if (e.getSubModel().getName().equals(subModelName)
					&& NamingUtil.retreiveName(e.getRelevantElement())
							.equals(elementName))
				return e;
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS:
				return ((InternalEList<?>)getSubModels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES:
				return getEntries();
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS:
				return getSubModels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends SubModelAssignmentResultEntry>)newValue);
				return;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS:
				getSubModels().clear();
				getSubModels().addAll((Collection<? extends SubModel>)newValue);
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
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES:
				getEntries().clear();
				return;
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS:
				getSubModels().clear();
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
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES:
				return entries != null && !entries.isEmpty();
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS:
				return subModels != null && !subModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT___FIND_SUB_MODEL_BY_NAME__STRING:
				return findSubModelByName((String)arguments.get(0));
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT_NAME__STRING:
				return findResultEntriesByElementName((String)arguments.get(0));
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT__EOBJECT:
				return findResultEntriesByElement((EObject)arguments.get(0));
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__SUBMODEL:
				return findResultEntriesBySubModel((SubModel)arguments.get(0));
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__STRING:
				return findResultEntriesBySubModel((String)arguments.get(0));
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__SUBMODEL_EOBJECT:
				return findResultEntryBySubModelAndElement((SubModel)arguments.get(0), (EObject)arguments.get(1));
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__STRING_STRING:
				return findResultEntryBySubModelAndElement((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append('[');
		Iterator<SubModelAssignmentResultEntry> it = getEntries().iterator();
		for (SubModelAssignmentResultEntry e = it.next(); it.hasNext(); e = it.next()) {
			result.append(NamingUtil.retreiveName(e.getRelevantElement()));
			result.append(" -> ");
			result.append(e.getSubModel().getName());
			result.append(" (");
			result.append(e.getScore());
			result.append(")");
			if (it.hasNext())
				result.append(", ");
		}
		result.append(']');
		return result.toString();
	}
} //SubModelAssignmentResultImpl
