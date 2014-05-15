/**
 */
package de.uni_marburg.splittr.description.splittr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.description.splittr.SplittrPackage;
import de.uni_marburg.splittr.description.splittr.SubModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Splitting Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getModelLocation <em>Model Location</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getSubmodels <em>Submodels</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getWeightGeneralization <em>Weight Generalization</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getWeightAggregation <em>Weight Aggregation</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getWeightAssociation <em>Weight Association</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getWeightContainment <em>Weight Containment</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getWeightInterface <em>Weight Interface</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getWeightEnum <em>Weight Enum</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.impl.SplittingDescriptionImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplittingDescriptionImpl extends MinimalEObjectImpl.Container implements SplittingDescription
{
  /**
   * The default value of the '{@link #getModelLocation() <em>Model Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelLocation()
   * @generated
   * @ordered
   */
  protected static final String MODEL_LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelLocation() <em>Model Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelLocation()
   * @generated
   * @ordered
   */
  protected String modelLocation = MODEL_LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected static final double THRESHOLD_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected double threshold = THRESHOLD_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubmodels() <em>Submodels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubmodels()
   * @generated
   * @ordered
   */
  protected EList<SubModel> submodels;

  /**
   * The default value of the '{@link #getWeightGeneralization() <em>Weight Generalization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightGeneralization()
   * @generated
   * @ordered
   */
  protected static final double WEIGHT_GENERALIZATION_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getWeightGeneralization() <em>Weight Generalization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightGeneralization()
   * @generated
   * @ordered
   */
  protected double weightGeneralization = WEIGHT_GENERALIZATION_EDEFAULT;

  /**
   * The default value of the '{@link #getWeightAggregation() <em>Weight Aggregation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightAggregation()
   * @generated
   * @ordered
   */
  protected static final double WEIGHT_AGGREGATION_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getWeightAggregation() <em>Weight Aggregation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightAggregation()
   * @generated
   * @ordered
   */
  protected double weightAggregation = WEIGHT_AGGREGATION_EDEFAULT;

  /**
   * The default value of the '{@link #getWeightAssociation() <em>Weight Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightAssociation()
   * @generated
   * @ordered
   */
  protected static final double WEIGHT_ASSOCIATION_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getWeightAssociation() <em>Weight Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightAssociation()
   * @generated
   * @ordered
   */
  protected double weightAssociation = WEIGHT_ASSOCIATION_EDEFAULT;

  /**
   * The default value of the '{@link #getWeightContainment() <em>Weight Containment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightContainment()
   * @generated
   * @ordered
   */
  protected static final double WEIGHT_CONTAINMENT_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getWeightContainment() <em>Weight Containment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightContainment()
   * @generated
   * @ordered
   */
  protected double weightContainment = WEIGHT_CONTAINMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getWeightInterface() <em>Weight Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightInterface()
   * @generated
   * @ordered
   */
  protected static final double WEIGHT_INTERFACE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getWeightInterface() <em>Weight Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightInterface()
   * @generated
   * @ordered
   */
  protected double weightInterface = WEIGHT_INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #getWeightEnum() <em>Weight Enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightEnum()
   * @generated
   * @ordered
   */
  protected static final double WEIGHT_ENUM_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getWeightEnum() <em>Weight Enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeightEnum()
   * @generated
   * @ordered
   */
  protected double weightEnum = WEIGHT_ENUM_EDEFAULT;

  /**
   * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected static final double ALPHA_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlpha()
   * @generated
   * @ordered
   */
  protected double alpha = ALPHA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SplittingDescriptionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SplittrPackage.Literals.SPLITTING_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelLocation()
  {
    return modelLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelLocation(String newModelLocation)
  {
    String oldModelLocation = modelLocation;
    modelLocation = newModelLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__MODEL_LOCATION, oldModelLocation, modelLocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getThreshold()
  {
    return threshold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThreshold(double newThreshold)
  {
    double oldThreshold = threshold;
    threshold = newThreshold;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__THRESHOLD, oldThreshold, threshold));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubModel> getSubmodels()
  {
    if (submodels == null)
    {
      submodels = new EObjectContainmentEList<SubModel>(SubModel.class, this, SplittrPackage.SPLITTING_DESCRIPTION__SUBMODELS);
    }
    return submodels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getWeightGeneralization()
  {
    return weightGeneralization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeightGeneralization(double newWeightGeneralization)
  {
    double oldWeightGeneralization = weightGeneralization;
    weightGeneralization = newWeightGeneralization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION, oldWeightGeneralization, weightGeneralization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getWeightAggregation()
  {
    return weightAggregation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeightAggregation(double newWeightAggregation)
  {
    double oldWeightAggregation = weightAggregation;
    weightAggregation = newWeightAggregation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION, oldWeightAggregation, weightAggregation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getWeightAssociation()
  {
    return weightAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeightAssociation(double newWeightAssociation)
  {
    double oldWeightAssociation = weightAssociation;
    weightAssociation = newWeightAssociation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION, oldWeightAssociation, weightAssociation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getWeightContainment()
  {
    return weightContainment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeightContainment(double newWeightContainment)
  {
    double oldWeightContainment = weightContainment;
    weightContainment = newWeightContainment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT, oldWeightContainment, weightContainment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getWeightInterface()
  {
    return weightInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeightInterface(double newWeightInterface)
  {
    double oldWeightInterface = weightInterface;
    weightInterface = newWeightInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_INTERFACE, oldWeightInterface, weightInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getWeightEnum()
  {
    return weightEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeightEnum(double newWeightEnum)
  {
    double oldWeightEnum = weightEnum;
    weightEnum = newWeightEnum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ENUM, oldWeightEnum, weightEnum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getAlpha()
  {
    return alpha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlpha(double newAlpha)
  {
    double oldAlpha = alpha;
    alpha = newAlpha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SplittrPackage.SPLITTING_DESCRIPTION__ALPHA, oldAlpha, alpha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SplittrPackage.SPLITTING_DESCRIPTION__SUBMODELS:
        return ((InternalEList<?>)getSubmodels()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SplittrPackage.SPLITTING_DESCRIPTION__MODEL_LOCATION:
        return getModelLocation();
      case SplittrPackage.SPLITTING_DESCRIPTION__THRESHOLD:
        return getThreshold();
      case SplittrPackage.SPLITTING_DESCRIPTION__SUBMODELS:
        return getSubmodels();
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION:
        return getWeightGeneralization();
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION:
        return getWeightAggregation();
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION:
        return getWeightAssociation();
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT:
        return getWeightContainment();
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_INTERFACE:
        return getWeightInterface();
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ENUM:
        return getWeightEnum();
      case SplittrPackage.SPLITTING_DESCRIPTION__ALPHA:
        return getAlpha();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SplittrPackage.SPLITTING_DESCRIPTION__MODEL_LOCATION:
        setModelLocation((String)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__THRESHOLD:
        setThreshold((Double)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__SUBMODELS:
        getSubmodels().clear();
        getSubmodels().addAll((Collection<? extends SubModel>)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION:
        setWeightGeneralization((Double)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION:
        setWeightAggregation((Double)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION:
        setWeightAssociation((Double)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT:
        setWeightContainment((Double)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_INTERFACE:
        setWeightInterface((Double)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ENUM:
        setWeightEnum((Double)newValue);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__ALPHA:
        setAlpha((Double)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SplittrPackage.SPLITTING_DESCRIPTION__MODEL_LOCATION:
        setModelLocation(MODEL_LOCATION_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__THRESHOLD:
        setThreshold(THRESHOLD_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__SUBMODELS:
        getSubmodels().clear();
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION:
        setWeightGeneralization(WEIGHT_GENERALIZATION_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION:
        setWeightAggregation(WEIGHT_AGGREGATION_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION:
        setWeightAssociation(WEIGHT_ASSOCIATION_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT:
        setWeightContainment(WEIGHT_CONTAINMENT_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_INTERFACE:
        setWeightInterface(WEIGHT_INTERFACE_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ENUM:
        setWeightEnum(WEIGHT_ENUM_EDEFAULT);
        return;
      case SplittrPackage.SPLITTING_DESCRIPTION__ALPHA:
        setAlpha(ALPHA_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SplittrPackage.SPLITTING_DESCRIPTION__MODEL_LOCATION:
        return MODEL_LOCATION_EDEFAULT == null ? modelLocation != null : !MODEL_LOCATION_EDEFAULT.equals(modelLocation);
      case SplittrPackage.SPLITTING_DESCRIPTION__THRESHOLD:
        return threshold != THRESHOLD_EDEFAULT;
      case SplittrPackage.SPLITTING_DESCRIPTION__SUBMODELS:
        return submodels != null && !submodels.isEmpty();
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_GENERALIZATION:
        return weightGeneralization != WEIGHT_GENERALIZATION_EDEFAULT;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_AGGREGATION:
        return weightAggregation != WEIGHT_AGGREGATION_EDEFAULT;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ASSOCIATION:
        return weightAssociation != WEIGHT_ASSOCIATION_EDEFAULT;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_CONTAINMENT:
        return weightContainment != WEIGHT_CONTAINMENT_EDEFAULT;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_INTERFACE:
        return weightInterface != WEIGHT_INTERFACE_EDEFAULT;
      case SplittrPackage.SPLITTING_DESCRIPTION__WEIGHT_ENUM:
        return weightEnum != WEIGHT_ENUM_EDEFAULT;
      case SplittrPackage.SPLITTING_DESCRIPTION__ALPHA:
        return alpha != ALPHA_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (modelLocation: ");
    result.append(modelLocation);
    result.append(", threshold: ");
    result.append(threshold);
    result.append(", weightGeneralization: ");
    result.append(weightGeneralization);
    result.append(", weightAggregation: ");
    result.append(weightAggregation);
    result.append(", weightAssociation: ");
    result.append(weightAssociation);
    result.append(", weightContainment: ");
    result.append(weightContainment);
    result.append(", weightInterface: ");
    result.append(weightInterface);
    result.append(", weightEnum: ");
    result.append(weightEnum);
    result.append(", alpha: ");
    result.append(alpha);
    result.append(')');
    return result.toString();
  }

} //SplittingDescriptionImpl
