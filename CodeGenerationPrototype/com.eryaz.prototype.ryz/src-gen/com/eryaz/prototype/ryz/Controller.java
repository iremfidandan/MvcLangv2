/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Controller#getActionmethods <em>Actionmethods</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends MainComponent {
	/**
	 * Returns the value of the '<em><b>Actionmethods</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.ActionMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionmethods</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getController_Actionmethods()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionMethod> getActionmethods();

} // Controller
