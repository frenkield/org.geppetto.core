/**
 */
package org.geppetto.core.model.common;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.geppetto.core.model.values.AValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.core.model.common.StateSet#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.core.model.common.CommonPackage#getStateSet()
 * @model
 * @generated
 */
public interface StateSet extends EObject
{
	/**
	 * Returns the value of the '<em><b>States</b></em>' map.
	 * The key is of type {@link org.geppetto.core.model.common.StateInstancePath},
	 * and the value is of type list of {@link org.geppetto.core.model.values.AValue},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' map.
	 * @see org.geppetto.core.model.common.CommonPackage#getStateSet_States()
	 * @model mapType="org.geppetto.core.model.common.StateInstancePathToAValueMap<org.geppetto.core.model.common.StateInstancePath, org.geppetto.core.model.values.AValue>"
	 * @generated
	 */
	EMap<StateInstancePath, EList<AValue>> getStates();

} // StateSet
