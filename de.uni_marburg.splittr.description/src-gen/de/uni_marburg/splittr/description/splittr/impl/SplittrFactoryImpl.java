/**
 */
package de.uni_marburg.splittr.description.splittr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uni_marburg.splittr.description.splittr.SplittingDescription;
import de.uni_marburg.splittr.description.splittr.SplittrFactory;
import de.uni_marburg.splittr.description.splittr.SplittrPackage;
import de.uni_marburg.splittr.description.splittr.SubModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SplittrFactoryImpl extends EFactoryImpl implements SplittrFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SplittrFactory init()
  {
    try
    {
      SplittrFactory theSplittrFactory = (SplittrFactory)EPackage.Registry.INSTANCE.getEFactory(SplittrPackage.eNS_URI);
      if (theSplittrFactory != null)
      {
        return theSplittrFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SplittrFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplittrFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SplittrPackage.SPLITTING_DESCRIPTION: return createSplittingDescription();
      case SplittrPackage.SUB_MODEL: return createSubModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplittingDescription createSplittingDescription()
  {
    SplittingDescriptionImpl splittingDescription = new SplittingDescriptionImpl();
    return splittingDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubModel createSubModel()
  {
    SubModelImpl subModel = new SubModelImpl();
    return subModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplittrPackage getSplittrPackage()
  {
    return (SplittrPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SplittrPackage getPackage()
  {
    return SplittrPackage.eINSTANCE;
  }

} //SplittrFactoryImpl
