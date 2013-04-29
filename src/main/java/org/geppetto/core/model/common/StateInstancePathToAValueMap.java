/**
 */
package org.geppetto.core.model.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.geppetto.core.model.values.AValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Instance Path To AValue Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.core.model.common.StateInstancePathToAValueMap#getKey <em>Key</em>}</li>
 *   <li>{@link org.geppetto.core.model.common.StateInstancePathToAValueMap#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.core.model.common.CommonPackage#getStateInstancePathToAValueMap()
 * @model
 * @generated
 */
public interface StateInstancePathToAValueMap extends EObject
{
	/**
	 * Returns the value of the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' reference.
	 * @see #setKey(StateInstancePath)
	 * @see org.geppetto.core.model.common.CommonPackage#getStateInstancePathToAValueMap_Key()
	 * @model
	 * @generated
	 */
	StateInstancePath getKey();

	/**
	 * Sets the value of the '{@link org.geppetto.core.model.common.StateInstancePathToAValueMap#getKey <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(StateInstancePath value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.geppetto.core.model.values.AValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.geppetto.core.model.common.CommonPackage#getStateInstancePathToAValueMap_Value()
	 * @model
	 * @generated
	 */
	EList<AValue> getValue();

} // StateInstancePathToAValueMap
