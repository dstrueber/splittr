/**
 */
package de.uni_marburg.splittr.description.splittr;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Splitting Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getModelLocation <em>Model Location</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getSubmodels <em>Submodels</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightGeneralization <em>Weight Generalization</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAggregation <em>Weight Aggregation</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAssociation <em>Weight Association</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightContainment <em>Weight Containment</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightInterface <em>Weight Interface</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightEnum <em>Weight Enum</em>}</li>
 *   <li>{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getAlpha <em>Alpha</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription()
 * @model
 * @generated
 */
public interface SplittingDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Location</em>' attribute.
   * @see #setModelLocation(String)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_ModelLocation()
   * @model
   * @generated
   */
  String getModelLocation();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getModelLocation <em>Model Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Location</em>' attribute.
   * @see #getModelLocation()
   * @generated
   */
  void setModelLocation(String value);

  /**
   * Returns the value of the '<em><b>Threshold</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Threshold</em>' attribute.
   * @see #setThreshold(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_Threshold()
   * @model
   * @generated
   */
  double getThreshold();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getThreshold <em>Threshold</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Threshold</em>' attribute.
   * @see #getThreshold()
   * @generated
   */
  void setThreshold(double value);

  /**
   * Returns the value of the '<em><b>Submodels</b></em>' containment reference list.
   * The list contents are of type {@link de.uni_marburg.splittr.description.splittr.SubModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Submodels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Submodels</em>' containment reference list.
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_Submodels()
   * @model containment="true"
   * @generated
   */
  EList<SubModel> getSubmodels();

  /**
   * Returns the value of the '<em><b>Weight Generalization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight Generalization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight Generalization</em>' attribute.
   * @see #setWeightGeneralization(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_WeightGeneralization()
   * @model
   * @generated
   */
  double getWeightGeneralization();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightGeneralization <em>Weight Generalization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight Generalization</em>' attribute.
   * @see #getWeightGeneralization()
   * @generated
   */
  void setWeightGeneralization(double value);

  /**
   * Returns the value of the '<em><b>Weight Aggregation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight Aggregation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight Aggregation</em>' attribute.
   * @see #setWeightAggregation(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_WeightAggregation()
   * @model
   * @generated
   */
  double getWeightAggregation();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAggregation <em>Weight Aggregation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight Aggregation</em>' attribute.
   * @see #getWeightAggregation()
   * @generated
   */
  void setWeightAggregation(double value);

  /**
   * Returns the value of the '<em><b>Weight Association</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight Association</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight Association</em>' attribute.
   * @see #setWeightAssociation(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_WeightAssociation()
   * @model
   * @generated
   */
  double getWeightAssociation();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightAssociation <em>Weight Association</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight Association</em>' attribute.
   * @see #getWeightAssociation()
   * @generated
   */
  void setWeightAssociation(double value);

  /**
   * Returns the value of the '<em><b>Weight Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight Containment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight Containment</em>' attribute.
   * @see #setWeightContainment(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_WeightContainment()
   * @model
   * @generated
   */
  double getWeightContainment();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightContainment <em>Weight Containment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight Containment</em>' attribute.
   * @see #getWeightContainment()
   * @generated
   */
  void setWeightContainment(double value);

  /**
   * Returns the value of the '<em><b>Weight Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight Interface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight Interface</em>' attribute.
   * @see #setWeightInterface(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_WeightInterface()
   * @model
   * @generated
   */
  double getWeightInterface();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightInterface <em>Weight Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight Interface</em>' attribute.
   * @see #getWeightInterface()
   * @generated
   */
  void setWeightInterface(double value);

  /**
   * Returns the value of the '<em><b>Weight Enum</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight Enum</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight Enum</em>' attribute.
   * @see #setWeightEnum(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_WeightEnum()
   * @model
   * @generated
   */
  double getWeightEnum();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getWeightEnum <em>Weight Enum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight Enum</em>' attribute.
   * @see #getWeightEnum()
   * @generated
   */
  void setWeightEnum(double value);

  /**
   * Returns the value of the '<em><b>Alpha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alpha</em>' attribute.
   * @see #setAlpha(double)
   * @see de.uni_marburg.splittr.description.splittr.SplittrPackage#getSplittingDescription_Alpha()
   * @model
   * @generated
   */
  double getAlpha();

  /**
   * Sets the value of the '{@link de.uni_marburg.splittr.description.splittr.SplittingDescription#getAlpha <em>Alpha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alpha</em>' attribute.
   * @see #getAlpha()
   * @generated
   */
  void setAlpha(double value);

} // SplittingDescription
