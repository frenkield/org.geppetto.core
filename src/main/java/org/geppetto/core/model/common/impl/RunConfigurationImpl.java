/**
 */
package org.geppetto.core.model.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.geppetto.core.model.common.CommonPackage;
import org.geppetto.core.model.common.RunConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.geppetto.core.model.common.impl.RunConfigurationImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link org.geppetto.core.model.common.impl.RunConfigurationImpl#getRunLength <em>Run Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunConfigurationImpl extends EObjectImpl implements RunConfiguration
{
	/**
	 * The default value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected double timeStep = TIME_STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunLength() <em>Run Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunLength()
	 * @generated
	 * @ordered
	 */
	protected static final double RUN_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRunLength() <em>Run Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunLength()
	 * @generated
	 * @ordered
	 */
	protected double runLength = RUN_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunConfigurationImpl()
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
		return CommonPackage.Literals.RUN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimeStep()
	{
		return timeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStep(double newTimeStep)
	{
		double oldTimeStep = timeStep;
		timeStep = newTimeStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RUN_CONFIGURATION__TIME_STEP, oldTimeStep, timeStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRunLength()
	{
		return runLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunLength(double newRunLength)
	{
		double oldRunLength = runLength;
		runLength = newRunLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.RUN_CONFIGURATION__RUN_LENGTH, oldRunLength, runLength));
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
			case CommonPackage.RUN_CONFIGURATION__TIME_STEP:
				return getTimeStep();
			case CommonPackage.RUN_CONFIGURATION__RUN_LENGTH:
				return getRunLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case CommonPackage.RUN_CONFIGURATION__TIME_STEP:
				setTimeStep((Double)newValue);
				return;
			case CommonPackage.RUN_CONFIGURATION__RUN_LENGTH:
				setRunLength((Double)newValue);
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
			case CommonPackage.RUN_CONFIGURATION__TIME_STEP:
				setTimeStep(TIME_STEP_EDEFAULT);
				return;
			case CommonPackage.RUN_CONFIGURATION__RUN_LENGTH:
				setRunLength(RUN_LENGTH_EDEFAULT);
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
			case CommonPackage.RUN_CONFIGURATION__TIME_STEP:
				return timeStep != TIME_STEP_EDEFAULT;
			case CommonPackage.RUN_CONFIGURATION__RUN_LENGTH:
				return runLength != RUN_LENGTH_EDEFAULT;
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
		result.append(" (timeStep: ");
		result.append(timeStep);
		result.append(", runLength: ");
		result.append(runLength);
		result.append(')');
		return result.toString();
	}

} //RunConfigurationImpl
