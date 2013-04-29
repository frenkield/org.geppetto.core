/**
 */
package org.geppetto.core.model.common;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.geppetto.core.model.common.CommonPackage
 * @generated
 */
public interface CommonFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonFactory eINSTANCE = org.geppetto.core.model.common.impl.CommonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>State Instance Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Instance Path</em>'.
	 * @generated
	 */
	StateInstancePath createStateInstancePath();

	/**
	 * Returns a new object of class '<em>State Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Set</em>'.
	 * @generated
	 */
	StateSet createStateSet();

	/**
	 * Returns a new object of class '<em>Run Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Configuration</em>'.
	 * @generated
	 */
	RunConfiguration createRunConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonPackage getCommonPackage();

} //CommonFactory
