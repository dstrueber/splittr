/**
 */
package de.uni_marburg.splittr.splittrResult.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_marburg.splittr.splittrResult.SplittrResultFactory;
import de.uni_marburg.splittr.splittrResult.SplittrResultPackage;
import de.uni_marburg.splittr.splittrResult.SubModel;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult;
import de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplittrResultPackageImpl extends EPackageImpl implements SplittrResultPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subModelAssignmentResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subModelAssignmentResultEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uni_marburg.splittr.splittrResult.SplittrResultPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SplittrResultPackageImpl() {
		super(eNS_URI, SplittrResultFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SplittrResultPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SplittrResultPackage init() {
		if (isInited) return (SplittrResultPackage)EPackage.Registry.INSTANCE.getEPackage(SplittrResultPackage.eNS_URI);

		// Obtain or create and register package
		SplittrResultPackageImpl theSplittrResultPackage = (SplittrResultPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SplittrResultPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SplittrResultPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSplittrResultPackage.createPackageContents();

		// Initialize created meta-data
		theSplittrResultPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSplittrResultPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SplittrResultPackage.eNS_URI, theSplittrResultPackage);
		return theSplittrResultPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubModelAssignmentResult() {
		return subModelAssignmentResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModelAssignmentResult_Entries() {
		return (EReference)subModelAssignmentResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModelAssignmentResult_SubModels() {
		return (EReference)subModelAssignmentResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubModelAssignmentResult__FindSubModelByName__String() {
		return subModelAssignmentResultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubModelAssignmentResult__FindResultEntriesByElementName__String() {
		return subModelAssignmentResultEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubModelAssignmentResult__FindResultEntriesByElement__EObject() {
		return subModelAssignmentResultEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubModelAssignmentResult__FindResultEntriesBySubModel__SubModel() {
		return subModelAssignmentResultEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubModelAssignmentResult__FindResultEntriesBySubModel__String() {
		return subModelAssignmentResultEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__SubModel_EObject() {
		return subModelAssignmentResultEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__String_String() {
		return subModelAssignmentResultEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubModelAssignmentResultEntry() {
		return subModelAssignmentResultEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModelAssignmentResultEntry_SubModel() {
		return (EReference)subModelAssignmentResultEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubModelAssignmentResultEntry_RelevantElement() {
		return (EReference)subModelAssignmentResultEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModelAssignmentResultEntry_Score() {
		return (EAttribute)subModelAssignmentResultEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubModel() {
		return subModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModel_Name() {
		return (EAttribute)subModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubModel_Description() {
		return (EAttribute)subModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplittrResultFactory getSplittrResultFactory() {
		return (SplittrResultFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		subModelAssignmentResultEClass = createEClass(SUB_MODEL_ASSIGNMENT_RESULT);
		createEReference(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES);
		createEReference(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS);
		createEOperation(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT___FIND_SUB_MODEL_BY_NAME__STRING);
		createEOperation(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT_NAME__STRING);
		createEOperation(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT__EOBJECT);
		createEOperation(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__SUBMODEL);
		createEOperation(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__STRING);
		createEOperation(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__SUBMODEL_EOBJECT);
		createEOperation(subModelAssignmentResultEClass, SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__STRING_STRING);

		subModelAssignmentResultEntryEClass = createEClass(SUB_MODEL_ASSIGNMENT_RESULT_ENTRY);
		createEReference(subModelAssignmentResultEntryEClass, SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL);
		createEReference(subModelAssignmentResultEntryEClass, SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT);
		createEAttribute(subModelAssignmentResultEntryEClass, SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE);

		subModelEClass = createEClass(SUB_MODEL);
		createEAttribute(subModelEClass, SUB_MODEL__NAME);
		createEAttribute(subModelEClass, SUB_MODEL__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(subModelAssignmentResultEClass, SubModelAssignmentResult.class, "SubModelAssignmentResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubModelAssignmentResult_Entries(), this.getSubModelAssignmentResultEntry(), null, "entries", null, 0, -1, SubModelAssignmentResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubModelAssignmentResult_SubModels(), this.getSubModel(), null, "subModels", null, 0, -1, SubModelAssignmentResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSubModelAssignmentResult__FindSubModelByName__String(), this.getSubModel(), "findSubModelByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubModelAssignmentResult__FindResultEntriesByElementName__String(), this.getSubModelAssignmentResultEntry(), "findResultEntriesByElementName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubModelAssignmentResult__FindResultEntriesByElement__EObject(), this.getSubModelAssignmentResultEntry(), "findResultEntriesByElement", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubModelAssignmentResult__FindResultEntriesBySubModel__SubModel(), this.getSubModelAssignmentResultEntry(), "findResultEntriesBySubModel", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSubModel(), "subModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubModelAssignmentResult__FindResultEntriesBySubModel__String(), this.getSubModelAssignmentResultEntry(), "findResultEntriesBySubModel", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__SubModel_EObject(), this.getSubModelAssignmentResultEntry(), "findResultEntryBySubModelAndElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSubModel(), "subModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__String_String(), this.getSubModelAssignmentResultEntry(), "findResultEntryBySubModelAndElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "subModelName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subModelAssignmentResultEntryEClass, SubModelAssignmentResultEntry.class, "SubModelAssignmentResultEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubModelAssignmentResultEntry_SubModel(), this.getSubModel(), null, "subModel", null, 0, 1, SubModelAssignmentResultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubModelAssignmentResultEntry_RelevantElement(), ecorePackage.getEObject(), null, "relevantElement", null, 0, 1, SubModelAssignmentResultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubModelAssignmentResultEntry_Score(), ecorePackage.getEDouble(), "score", null, 0, 1, SubModelAssignmentResultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subModelEClass, SubModel.class, "SubModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, SubModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SplittrResultPackageImpl
