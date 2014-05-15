/**
 */
package de.uni_marburg.splittr.description.splittr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uni_marburg.splittr.description.splittr.SplittrPackage
 * @generated
 */
public interface SplittrFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SplittrFactory eINSTANCE = de.uni_marburg.splittr.description.splittr.impl.SplittrFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Splitting Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Splitting Description</em>'.
   * @generated
   */
  SplittingDescription createSplittingDescription();

  /**
   * Returns a new object of class '<em>Sub Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Model</em>'.
   * @generated
   */
  SubModel createSubModel();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SplittrPackage getSplittrPackage();

} //SplittrFactory
