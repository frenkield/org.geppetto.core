/**
 */
package org.geppetto.core.model.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISimulator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.geppetto.core.model.common.CommonPackage#getISimulator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ISimulator extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize(IModel model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StateSet run(RunConfiguration runConfiguration);

} // ISimulator
