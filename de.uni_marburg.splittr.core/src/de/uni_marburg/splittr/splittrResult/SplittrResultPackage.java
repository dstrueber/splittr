/**
 */
package de.uni_marburg.splittr.splittrResult;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_marburg.splittr.splittrResult.SplittrResultFactory
 * @model kind="package"
 * @generated
 */
public interface SplittrResultPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "splittrResult";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uni_marburg.de/splittr/result/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "splittrResult";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SplittrResultPackage eINSTANCE = de.uni_marburg.splittr.splittrResult.impl.SplittrResultPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultImpl <em>Sub Model Assignment Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultImpl
	 * @see de.uni_marburg.splittr.splittrResult.impl.SplittrResultPackageImpl#getSubModelAssignmentResult()
	 * @generated
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Sub Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS = 1;

	/**
	 * The number of structural features of the '<em>Sub Model Assignment Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Find Sub Model By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT___FIND_SUB_MODEL_BY_NAME__STRING = 0;

	/**
	 * The operation id for the '<em>Find Result Entries By Element Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT_NAME__STRING = 1;

	/**
	 * The operation id for the '<em>Find Result Entries By Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT__EOBJECT = 2;

	/**
	 * The operation id for the '<em>Find Result Entries By Sub Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__SUBMODEL = 3;

	/**
	 * The operation id for the '<em>Find Result Entries By Sub Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__STRING = 4;

	/**
	 * The operation id for the '<em>Find Result Entry By Sub Model And Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__SUBMODEL_EOBJECT = 5;

	/**
	 * The operation id for the '<em>Find Result Entry By Sub Model And Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__STRING_STRING = 6;

	/**
	 * The number of operations of the '<em>Sub Model Assignment Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultEntryImpl <em>Sub Model Assignment Result Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultEntryImpl
	 * @see de.uni_marburg.splittr.splittrResult.impl.SplittrResultPackageImpl#getSubModelAssignmentResultEntry()
	 * @generated
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Sub Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Relevant Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE = 2;

	/**
	 * The number of structural features of the '<em>Sub Model Assignment Result Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sub Model Assignment Result Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_ASSIGNMENT_RESULT_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uni_marburg.splittr.splittrResult.impl.SubModelImpl <em>Sub Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uni_marburg.splittr.splittrResult.impl.SubModelImpl
	 * @see de.uni_marburg.splittr.splittrResult.impl.SplittrResultPackageImpl#getSubModel()
	 * @generated
	 */
	int SUB_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Sub Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sub Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult <em>Sub Model Assignment Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Model Assignment Result</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult
	 * @generated
	 */
	EClass getSubModelAssignmentResult();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#getEntries()
	 * @see #getSubModelAssignmentResult()
	 * @generated
	 */
	EReference getSubModelAssignmentResult_Entries();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#getSubModels <em>Sub Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Models</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#getSubModels()
	 * @see #getSubModelAssignmentResult()
	 * @generated
	 */
	EReference getSubModelAssignmentResult_SubModels();

	/**
	 * Returns the meta object for the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findSubModelByName(java.lang.String) <em>Find Sub Model By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Sub Model By Name</em>' operation.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findSubModelByName(java.lang.String)
	 * @generated
	 */
	EOperation getSubModelAssignmentResult__FindSubModelByName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesByElementName(java.lang.String) <em>Find Result Entries By Element Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Entries By Element Name</em>' operation.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesByElementName(java.lang.String)
	 * @generated
	 */
	EOperation getSubModelAssignmentResult__FindResultEntriesByElementName__String();

	/**
	 * Returns the meta object for the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesByElement(org.eclipse.emf.ecore.EObject) <em>Find Result Entries By Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Entries By Element</em>' operation.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesByElement(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSubModelAssignmentResult__FindResultEntriesByElement__EObject();

	/**
	 * Returns the meta object for the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesBySubModel(de.uni_marburg.splittr.splittrResult.SubModel) <em>Find Result Entries By Sub Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Entries By Sub Model</em>' operation.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesBySubModel(de.uni_marburg.splittr.splittrResult.SubModel)
	 * @generated
	 */
	EOperation getSubModelAssignmentResult__FindResultEntriesBySubModel__SubModel();

	/**
	 * Returns the meta object for the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesBySubModel(java.lang.String) <em>Find Result Entries By Sub Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Entries By Sub Model</em>' operation.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntriesBySubModel(java.lang.String)
	 * @generated
	 */
	EOperation getSubModelAssignmentResult__FindResultEntriesBySubModel__String();

	/**
	 * Returns the meta object for the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntryBySubModelAndElement(de.uni_marburg.splittr.splittrResult.SubModel, org.eclipse.emf.ecore.EObject) <em>Find Result Entry By Sub Model And Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Entry By Sub Model And Element</em>' operation.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntryBySubModelAndElement(de.uni_marburg.splittr.splittrResult.SubModel, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__SubModel_EObject();

	/**
	 * Returns the meta object for the '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntryBySubModelAndElement(java.lang.String, java.lang.String) <em>Find Result Entry By Sub Model And Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Result Entry By Sub Model And Element</em>' operation.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResult#findResultEntryBySubModelAndElement(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__String_String();

	/**
	 * Returns the meta object for class '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry <em>Sub Model Assignment Result Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Model Assignment Result Entry</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry
	 * @generated
	 */
	EClass getSubModelAssignmentResultEntry();

	/**
	 * Returns the meta object for the reference '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getSubModel <em>Sub Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Model</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getSubModel()
	 * @see #getSubModelAssignmentResultEntry()
	 * @generated
	 */
	EReference getSubModelAssignmentResultEntry_SubModel();

	/**
	 * Returns the meta object for the reference '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getRelevantElement <em>Relevant Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relevant Element</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getRelevantElement()
	 * @see #getSubModelAssignmentResultEntry()
	 * @generated
	 */
	EReference getSubModelAssignmentResultEntry_RelevantElement();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModelAssignmentResultEntry#getScore()
	 * @see #getSubModelAssignmentResultEntry()
	 * @generated
	 */
	EAttribute getSubModelAssignmentResultEntry_Score();

	/**
	 * Returns the meta object for class '{@link de.uni_marburg.splittr.splittrResult.SubModel <em>Sub Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Model</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModel
	 * @generated
	 */
	EClass getSubModel();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.splittrResult.SubModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModel#getName()
	 * @see #getSubModel()
	 * @generated
	 */
	EAttribute getSubModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.splittrResult.SubModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.uni_marburg.splittr.splittrResult.SubModel#getDescription()
	 * @see #getSubModel()
	 * @generated
	 */
	EAttribute getSubModel_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SplittrResultFactory getSplittrResultFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultImpl <em>Sub Model Assignment Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultImpl
		 * @see de.uni_marburg.splittr.splittrResult.impl.SplittrResultPackageImpl#getSubModelAssignmentResult()
		 * @generated
		 */
		EClass SUB_MODEL_ASSIGNMENT_RESULT = eINSTANCE.getSubModelAssignmentResult();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODEL_ASSIGNMENT_RESULT__ENTRIES = eINSTANCE.getSubModelAssignmentResult_Entries();

		/**
		 * The meta object literal for the '<em><b>Sub Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODEL_ASSIGNMENT_RESULT__SUB_MODELS = eINSTANCE.getSubModelAssignmentResult_SubModels();

		/**
		 * The meta object literal for the '<em><b>Find Sub Model By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_MODEL_ASSIGNMENT_RESULT___FIND_SUB_MODEL_BY_NAME__STRING = eINSTANCE.getSubModelAssignmentResult__FindSubModelByName__String();

		/**
		 * The meta object literal for the '<em><b>Find Result Entries By Element Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT_NAME__STRING = eINSTANCE.getSubModelAssignmentResult__FindResultEntriesByElementName__String();

		/**
		 * The meta object literal for the '<em><b>Find Result Entries By Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_ELEMENT__EOBJECT = eINSTANCE.getSubModelAssignmentResult__FindResultEntriesByElement__EObject();

		/**
		 * The meta object literal for the '<em><b>Find Result Entries By Sub Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__SUBMODEL = eINSTANCE.getSubModelAssignmentResult__FindResultEntriesBySubModel__SubModel();

		/**
		 * The meta object literal for the '<em><b>Find Result Entries By Sub Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRIES_BY_SUB_MODEL__STRING = eINSTANCE.getSubModelAssignmentResult__FindResultEntriesBySubModel__String();

		/**
		 * The meta object literal for the '<em><b>Find Result Entry By Sub Model And Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__SUBMODEL_EOBJECT = eINSTANCE.getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__SubModel_EObject();

		/**
		 * The meta object literal for the '<em><b>Find Result Entry By Sub Model And Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUB_MODEL_ASSIGNMENT_RESULT___FIND_RESULT_ENTRY_BY_SUB_MODEL_AND_ELEMENT__STRING_STRING = eINSTANCE.getSubModelAssignmentResult__FindResultEntryBySubModelAndElement__String_String();

		/**
		 * The meta object literal for the '{@link de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultEntryImpl <em>Sub Model Assignment Result Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_marburg.splittr.splittrResult.impl.SubModelAssignmentResultEntryImpl
		 * @see de.uni_marburg.splittr.splittrResult.impl.SplittrResultPackageImpl#getSubModelAssignmentResultEntry()
		 * @generated
		 */
		EClass SUB_MODEL_ASSIGNMENT_RESULT_ENTRY = eINSTANCE.getSubModelAssignmentResultEntry();

		/**
		 * The meta object literal for the '<em><b>Sub Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SUB_MODEL = eINSTANCE.getSubModelAssignmentResultEntry_SubModel();

		/**
		 * The meta object literal for the '<em><b>Relevant Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__RELEVANT_ELEMENT = eINSTANCE.getSubModelAssignmentResultEntry_RelevantElement();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODEL_ASSIGNMENT_RESULT_ENTRY__SCORE = eINSTANCE.getSubModelAssignmentResultEntry_Score();

		/**
		 * The meta object literal for the '{@link de.uni_marburg.splittr.splittrResult.impl.SubModelImpl <em>Sub Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uni_marburg.splittr.splittrResult.impl.SubModelImpl
		 * @see de.uni_marburg.splittr.splittrResult.impl.SplittrResultPackageImpl#getSubModel()
		 * @generated
		 */
		EClass SUB_MODEL = eINSTANCE.getSubModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODEL__NAME = eINSTANCE.getSubModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_MODEL__DESCRIPTION = eINSTANCE.getSubModel_Description();

	}

} //SplittrResultPackage
