/**
 */
package org.geppetto.core.model.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.core.model.common.RunConfiguration#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link org.geppetto.core.model.common.RunConfiguration#getRunLength <em>Run Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.core.model.common.CommonPackage#getRunConfiguration()
 * @model
 * @generated
 */
public interface RunConfiguration extends EObject
{
	/**
	 * Returns the value of the '<em><b>Time Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Step</em>' attribute.
	 * @see #setTimeStep(double)
	 * @see org.geppetto.core.model.common.CommonPackage#getRunConfiguration_TimeStep()
	 * @model
	 * @generated
	 */
	double getTimeStep();

	/**
	 * Sets the value of the '{@link org.geppetto.core.model.common.RunConfiguration#getTimeStep <em>Time Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Step</em>' attribute.
	 * @see #getTimeStep()
	 * @generated
	 */
	void setTimeStep(double value);

	/**
	 * Returns the value of the '<em><b>Run Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Length</em>' attribute.
	 * @see #setRunLength(double)
	 * @see org.geppetto.core.model.common.CommonPackage#getRunConfiguration_RunLength()
	 * @model
	 * @generated
	 */
	double getRunLength();

	/**
	 * Sets the value of the '{@link org.geppetto.core.model.common.RunConfiguration#getRunLength <em>Run Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Length</em>' attribute.
	 * @see #getRunLength()
	 * @generated
	 */
	void setRunLength(double value);

} // RunConfiguration
