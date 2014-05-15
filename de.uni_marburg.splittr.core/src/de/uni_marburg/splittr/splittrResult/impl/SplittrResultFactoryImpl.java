/**
 */
package de.uni_marburg.splittr.splittrResult.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_marburg.splittr.splittrResult.SplittrResultFactory;
import de.uni_marburg.splittr.splittrResult.SplittrResultPackage;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplittrResultFactoryImpl extends EFactoryImpl implements SplittrResultFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SplittrResultFactory init() {
		try {
			SplittrResultFactory theSplittrResultFactory = (SplittrResultFactory)EPackage.Registry.INSTANCE.getEFactory(SplittrResultPackage.eNS_URI);
			if (theSplittrResultFactory != null) {
				return theSplittrResultFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SplittrResultFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplittrResultFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT: return createSubModelAssignmentResult();
			case SplittrResultPackage.SUB_MODEL_ASSIGNMENT_RESULT_ENTRY: return createSubModelAssignmentResultEntry();
			case SplittrResultPackage.SUB_MODEL: return createSubModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubModelAssignmentResult createSubModelAssignmentResult() {
		SubModelAssignmentResultImpl subModelAssignmentResult = new SubModelAssignmentResultImpl();
		return subModelAssignmentResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubModelAssignmentResultEntry createSubModelAssignmentResultEntry() {
		SubModelAssignmentResultEntryImpl subModelAssignmentResultEntry = new SubModelAssignmentResultEntryImpl();
		return subModelAssignmentResultEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubModel createSubModel() {
		SubModelImpl subModel = new SubModelImpl();
		return subModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplittrResultPackage getSplittrResultPackage() {
		return (SplittrResultPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SplittrResultPackage getPackage() {
		return SplittrResultPackage.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SubModel createSubModel(String name, String description) {
		SubModel subModel = createSubModel();
		subModel.setName(name);
		subModel.setDescription(description);
		return subModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SubModelAssignmentResultEntry createSubModelAssignmentResultEntry(
			SubModel subModel, EObject relevantElement, double score) {
		SubModelAssignmentResultEntry entry = createSubModelAssignmentResultEntry();
		entry.setSubModel(subModel);
		entry.setScore(score);
		entry.setRelevantElement(relevantElement);
		return entry;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SubModelAssignmentResult  createSubModelAssignmentResult(Collection<SubModelAssignmentResultEntry> subModelAssignmentResultEntries) {
		SubModelAssignmentResult result = createSubModelAssignmentResult();
		result.getEntries().addAll(subModelAssignmentResultEntries);
		return result;
	}
} //SplittrResultFactoryImpl
