/**
 */
package org.geppetto.core.model.common.impl;

import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.geppetto.core.model.common.CommonPackage;
import org.geppetto.core.model.common.StateInstancePath;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Instance Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.core.model.common.impl.StateInstancePathImpl#getInstancePath <em>Instance Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateInstancePathImpl extends EObjectImpl implements StateInstancePath
{
	/**
	 * The cached value of the '{@link #getInstancePath() <em>Instance Path</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstancePath()
	 * @generated
	 * @ordered
	 */
	protected EList<String> instancePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateInstancePathImpl()
	{
		super();
	}
	
	public StateInstancePathImpl(String instancePath)
	{
		super();
		setTokenized(instancePath);
	}

	private void setTokenized(String instancePathString)
	{
		StringTokenizer st=new StringTokenizer(instancePathString,".");
		List<String> instancePath=getInstancePath();
		while(st.hasMoreTokens())
		{
			instancePath.add(st.nextToken());
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CommonPackage.Literals.STATE_INSTANCE_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInstancePath()
	{
		if (instancePath == null)
		{
			instancePath = new EDataTypeUniqueEList<String>(String.class, this, CommonPackage.STATE_INSTANCE_PATH__INSTANCE_PATH);
		}
		return instancePath;
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
			case CommonPackage.STATE_INSTANCE_PATH__INSTANCE_PATH:
				return getInstancePath();
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
			case CommonPackage.STATE_INSTANCE_PATH__INSTANCE_PATH:
				getInstancePath().clear();
				getInstancePath().addAll((Collection<? extends String>)newValue);
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
			case CommonPackage.STATE_INSTANCE_PATH__INSTANCE_PATH:
				getInstancePath().clear();
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
			case CommonPackage.STATE_INSTANCE_PATH__INSTANCE_PATH:
				return instancePath != null && !instancePath.isEmpty();
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
		result.append(" (instancePath: ");
		result.append(instancePath);
		result.append(')');
		return result.toString();
	}

} //StateInstancePathImpl
