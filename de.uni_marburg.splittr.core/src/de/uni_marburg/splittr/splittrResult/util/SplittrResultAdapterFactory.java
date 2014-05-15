/**
 */
package de.uni_marburg.splittr.splittrResult.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uni_marburg.splittr.splittrResult.SplittrResultPackage;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage
 * @generated
 */
public class SplittrResultAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SplittrResultPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplittrResultAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SplittrResultPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplittrResultSwitch<Adapter> modelSwitch =
		new SplittrResultSwitch<Adapter>() {
			@Override
			public Adapter caseSubModelAssignmentResult(SubModelAssignmentResult object) {
				return createSubModelAssignmentResultAdapter();
			}
			@Override
			public Adapter caseSubModelAssignmentResultEntry(SubModelAssignmentResultEntry object) {
				return createSubModelAssignmentResultEntryAdapter();
			}
			@Override
			public Adapter caseSubModel(SubModel object) {
				return createSubModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult <em>Sub Model Assignment Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult
	 * @generated
	 */
	public Adapter createSubModelAssignmentResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry <em>Sub Model Assignment Result Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry
	 * @generated
	 */
	public Adapter createSubModelAssignmentResultEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uni_marburg.splittr.splittrResult.SubModel <em>Sub Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uni_marburg.splittr.splittrResult.SubModel
	 * @generated
	 */
	public Adapter createSubModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SplittrResultAdapterFactory
