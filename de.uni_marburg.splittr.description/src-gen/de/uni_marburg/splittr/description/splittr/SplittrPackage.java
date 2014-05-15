/**
 */
package de.uni_marburg.splittr.description.splittr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uni_marburg.splittr.description.splittr.SplittrFactory
 * @model kind="package"
 * @generated
 */
public interface SplittrPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "splittr";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uni_marburg.de/splittr/description/SplittingDescription";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "splittr";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SplittrPackage eINSTANCE = de.uni_marburg.splittr.description.splittr.impl.SplittrPackageImpl.init();

  /**
   * The meta object id for the '{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl <em>Splitting Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl
   * @see de.uni_marburg.splittr.description.splittr.impl.SplittrPackageImpl#getSplittingDescription()
   * @generated
   */
  int SPLITTING_DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Model Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__MODEL_LOCATION = 0;

  /**
   * The feature id for the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__THRESHOLD = 1;

  /**
   * The feature id for the '<em><b>Submodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__SUBMODELS = 2;

  /**
   * The feature id for the '<em><b>Weight Generalization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION = 3;

  /**
   * The feature id for the '<em><b>Weight Aggregation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION = 4;

  /**
   * The feature id for the '<em><b>Weight Association</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION = 5;

  /**
   * The feature id for the '<em><b>Weight Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT = 6;

  /**
   * The feature id for the '<em><b>Weight Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__WEIGHT_INTERFACE = 7;

  /**
   * The feature id for the '<em><b>Weight Enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__WEIGHT_ENUM = 8;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION__ALPHA = 9;

  /**
   * The number of structural features of the '<em>Splitting Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLITTING_DESCRIPTION_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link de.uni_marburg.splittr.description.splittr.impl.SubModelImpl <em>Sub Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.uni_marburg.splittr.description.splittr.impl.SubModelImpl
   * @see de.uni_marburg.splittr.description.splittr.impl.SplittrPackageImpl#getSubModel()
   * @generated
   */
  int SUB_MODEL = 1;

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
   * Returns the meta object for class '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription <em>Splitting Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Splitting Description</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription
   * @generated
   */
  EClass getSplittingDescription();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getModelLocation <em>Model Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Location</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getModelLocation()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_ModelLocation();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getThreshold <em>Threshold</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Threshold</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getThreshold()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_Threshold();

  /**
   * Returns the meta object for the containment reference list '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getSubmodels <em>Submodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Submodels</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getSubmodels()
   * @see #getSplittingDescription()
   * @generated
   */
  EReference getSplittingDescription_Submodels();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightGeneralization <em>Weight Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight Generalization</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightGeneralization()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_WeightGeneralization();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAggregation <em>Weight Aggregation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight Aggregation</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAggregation()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_WeightAggregation();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAssociation <em>Weight Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight Association</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAssociation()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_WeightAssociation();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightContainment <em>Weight Containment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight Containment</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightContainment()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_WeightContainment();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightInterface <em>Weight Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight Interface</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightInterface()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_WeightInterface();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightEnum <em>Weight Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight Enum</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightEnum()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_WeightEnum();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alpha</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SplittingDescription#getAlpha()
   * @see #getSplittingDescription()
   * @generated
   */
  EAttribute getSplittingDescription_Alpha();

  /**
   * Returns the meta object for class '{@link de.uni_marburg.splittr.description.splittr.SubModel <em>Sub Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Model</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SubModel
   * @generated
   */
  EClass getSubModel();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SubModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SubModel#getName()
   * @see #getSubModel()
   * @generated
   */
  EAttribute getSubModel_Name();

  /**
   * Returns the meta object for the attribute '{@link de.uni_marburg.splittr.description.splittr.SubModel#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see de.uni_marburg.splittr.description.splittr.SubModel#getDescription()
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
  SplittrFactory getSplittrFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl <em>Splitting Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl
     * @see de.uni_marburg.splittr.description.splittr.impl.SplittrPackageImpl#getSplittingDescription()
     * @generated
     */
    EClass SPLITTING_DESCRIPTION = eINSTANCE.getSplittingDescription();

    /**
     * The meta object literal for the '<em><b>Model Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__MODEL_LOCATION = eINSTANCE.getSplittingDescription_ModelLocation();

    /**
     * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__THRESHOLD = eINSTANCE.getSplittingDescription_Threshold();

    /**
     * The meta object literal for the '<em><b>Submodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLITTING_DESCRIPTION__SUBMODELS = eINSTANCE.getSplittingDescription_Submodels();

    /**
     * The meta object literal for the '<em><b>Weight Generalization</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION = eINSTANCE.getSplittingDescription_WeightGeneralization();

    /**
     * The meta object literal for the '<em><b>Weight Aggregation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION = eINSTANCE.getSplittingDescription_WeightAggregation();

    /**
     * The meta object literal for the '<em><b>Weight Association</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION = eINSTANCE.getSplittingDescription_WeightAssociation();

    /**
     * The meta object literal for the '<em><b>Weight Containment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT = eINSTANCE.getSplittingDescription_WeightContainment();

    /**
     * The meta object literal for the '<em><b>Weight Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__WEIGHT_INTERFACE = eINSTANCE.getSplittingDescription_WeightInterface();

    /**
     * The meta object literal for the '<em><b>Weight Enum</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__WEIGHT_ENUM = eINSTANCE.getSplittingDescription_WeightEnum();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLITTING_DESCRIPTION__ALPHA = eINSTANCE.getSplittingDescription_Alpha();

    /**
     * The meta object literal for the '{@link de.uni_marburg.splittr.description.splittr.impl.SubModelImpl <em>Sub Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.uni_marburg.splittr.description.splittr.impl.SubModelImpl
     * @see de.uni_marburg.splittr.description.splittr.impl.SplittrPackageImpl#getSubModel()
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

} //SplittrPackage
