/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerPackage#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerPackage()
 * @model
 * @generated
 */
public interface ControllerPackage extends ComponentPackage {
	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerPackage_Controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

} // ControllerPackage
