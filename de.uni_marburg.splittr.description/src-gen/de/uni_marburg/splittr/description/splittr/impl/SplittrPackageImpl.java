/**
 */
package de.uni_marburg.splittr.description.splittr.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.description.splittr.SplittrFactory;
import de.uni_marburg.splittr.description.splittr.SplittrPackage;
import de.uni_marburg.splittr.description.splittr.SubModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplittrPackageImpl extends EPackageImpl implements SplittrPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splittingDescriptionEClass = null;

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
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SplittrPackageImpl()
  {
    super(eNS_URI, SplittrFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SplittrPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SplittrPackage init()
  {
    if (isInited) return (SplittrPackage)EPackage.Registry.INSTANCE.getEPackage(SplittrPackage.eNS_URI);

    // Obtain or create and register package
    SplittrPackageImpl theSplittrPackage = (SplittrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SplittrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SplittrPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSplittrPackage.createPackageContents();

    // Initialize created meta-data
    theSplittrPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSplittrPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SplittrPackage.eNS_URI, theSplittrPackage);
    return theSplittrPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSplittingDescription()
  {
    return splittingDescriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_ModelLocation()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_Threshold()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplittingDescription_Submodels()
  {
    return (EReference)splittingDescriptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_WeightGeneralization()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_WeightAggregation()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_WeightAssociation()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_WeightContainment()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_WeightInterface()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_WeightEnum()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplittingDescription_Alpha()
  {
    return (EAttribute)splittingDescriptionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubModel()
  {
    return subModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubModel_Name()
  {
    return (EAttribute)subModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubModel_Description()
  {
    return (EAttribute)subModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplittrFactory getSplittrFactory()
  {
    return (SplittrFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    splittingDescriptionEClass = createEClass(SPLITTING_DESCRIPTION);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__MODEL_LOCATION);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__THRESHOLD);
    createEReference(splittingDescriptionEClass, SPLITTING_DESCRIPTION__SUBMODELS);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__WEIGHT_INTERFACE);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__WEIGHT_ENUM);
    createEAttribute(splittingDescriptionEClass, SPLITTING_DESCRIPTION__ALPHA);

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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(splittingDescriptionEClass, SplittingDescription.class, "SplittingDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSplittingDescription_ModelLocation(), ecorePackage.getEString(), "modelLocation", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_Threshold(), ecorePackage.getEDouble(), "threshold", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSplittingDescription_Submodels(), this.getSubModel(), null, "submodels", null, 0, -1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_WeightGeneralization(), ecorePackage.getEDouble(), "weightGeneralization", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_WeightAggregation(), ecorePackage.getEDouble(), "weightAggregation", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_WeightAssociation(), ecorePackage.getEDouble(), "weightAssociation", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_WeightContainment(), ecorePackage.getEDouble(), "weightContainment", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_WeightInterface(), ecorePackage.getEDouble(), "weightInterface", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_WeightEnum(), ecorePackage.getEDouble(), "weightEnum", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSplittingDescription_Alpha(), ecorePackage.getEDouble(), "alpha", null, 0, 1, SplittingDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subModelEClass, SubModel.class, "SubModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, SubModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SplittrPackageImpl
