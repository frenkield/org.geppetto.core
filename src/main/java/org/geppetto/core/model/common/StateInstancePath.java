/**
 */
package org.geppetto.core.model.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Instance Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.core.model.common.StateInstancePath#getInstancePath <em>Instance Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.core.model.common.CommonPackage#getStateInstancePath()
 * @model
 * @generated
 */
public interface StateInstancePath extends EObject
{
	/**
	 * Returns the value of the '<em><b>Instance Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Path</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Path</em>' attribute list.
	 * @see org.geppetto.core.model.common.CommonPackage#getStateInstancePath_InstancePath()
	 * @model
	 * @generated
	 */
	EList<String> getInstancePath();

} // StateInstancePath
