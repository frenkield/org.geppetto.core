/**
 */
package org.geppetto.core.model.common.util;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.geppetto.core.model.common.*;
import org.geppetto.core.model.values.AValue;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.geppetto.core.model.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = CommonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case CommonPackage.STATE_INSTANCE_PATH:
			{
				StateInstancePath stateInstancePath = (StateInstancePath)theEObject;
				T result = caseStateInstancePath(stateInstancePath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.STATE_INSTANCE_PATH_TO_AVALUE_MAP:
			{
				@SuppressWarnings("unchecked") Map.Entry<StateInstancePath, EList<AValue>> stateInstancePathToAValueMap = (Map.Entry<StateInstancePath, EList<AValue>>)theEObject;
				T result = caseStateInstancePathToAValueMap(stateInstancePathToAValueMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.STATE_SET:
			{
				StateSet stateSet = (StateSet)theEObject;
				T result = caseStateSet(stateSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ISIMULATOR:
			{
				ISimulator iSimulator = (ISimulator)theEObject;
				T result = caseISimulator(iSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.IMODEL:
			{
				IModel iModel = (IModel)theEObject;
				T result = caseIModel(iModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.RUN_CONFIGURATION:
			{
				RunConfiguration runConfiguration = (RunConfiguration)theEObject;
				T result = caseRunConfiguration(runConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.ASIMULATOR:
			{
				ASimulator aSimulator = (ASimulator)theEObject;
				T result = caseASimulator(aSimulator);
				if (result == null) result = caseISimulator(aSimulator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Instance Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Instance Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInstancePath(StateInstancePath object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Instance Path To AValue Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Instance Path To AValue Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateInstancePathToAValueMap(Map.Entry<StateInstancePath, EList<AValue>> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateSet(StateSet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISimulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISimulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISimulator(ISimulator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IModel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IModel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIModel(IModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunConfiguration(RunConfiguration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASimulator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASimulator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASimulator(ASimulator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //CommonSwitch
