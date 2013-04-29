/**
 */
package org.geppetto.core.model.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASimulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.geppetto.core.model.common.ASimulator#isInitialized <em>Initialized</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.geppetto.core.model.common.CommonPackage#getASimulator()
 * @model abstract="true"
 * @generated
 */
public interface ASimulator extends ISimulator
{

	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.geppetto.core.model.common.CommonPackage#getASimulator_Initialized()
	 * @model
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.geppetto.core.model.common.ASimulator#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);
} // ASimulator
