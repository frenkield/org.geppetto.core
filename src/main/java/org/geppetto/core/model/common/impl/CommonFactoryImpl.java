/**
 */
package org.geppetto.core.model.common.impl;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.geppetto.core.model.common.*;
import org.geppetto.core.model.values.AValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonFactoryImpl extends EFactoryImpl implements CommonFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommonFactory init()
	{
		try
		{
			CommonFactory theCommonFactory = (CommonFactory)EPackage.Registry.INSTANCE.getEFactory("org.geppetto.model.common"); 
			if (theCommonFactory != null)
			{
				return theCommonFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactoryImpl()
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
			case CommonPackage.STATE_INSTANCE_PATH: return createStateInstancePath();
			case CommonPackage.STATE_INSTANCE_PATH_TO_AVALUE_MAP: return (EObject)createStateInstancePathToAValueMap();
			case CommonPackage.STATE_SET: return createStateSet();
			case CommonPackage.RUN_CONFIGURATION: return createRunConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInstancePath createStateInstancePath()
	{
		StateInstancePathImpl stateInstancePath = new StateInstancePathImpl();
		return stateInstancePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<StateInstancePath, EList<AValue>> createStateInstancePathToAValueMap()
	{
		StateInstancePathToAValueMapImpl stateInstancePathToAValueMap = new StateInstancePathToAValueMapImpl();
		return stateInstancePathToAValueMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSet createStateSet()
	{
		StateSetImpl stateSet = new StateSetImpl();
		return stateSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunConfiguration createRunConfiguration()
	{
		RunConfigurationImpl runConfiguration = new RunConfigurationImpl();
		return runConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPackage getCommonPackage()
	{
		return (CommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommonPackage getPackage()
	{
		return CommonPackage.eINSTANCE;
	}

} //CommonFactoryImpl
