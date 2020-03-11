/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller To View Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerToViewRelation#getActionmethod <em>Actionmethod</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerToViewRelation#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToViewRelation()
 * @model
 * @generated
 */
public interface ControllerToViewRelation extends MainComponentRelation {
	/**
	 * Returns the value of the '<em><b>Actionmethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionmethod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionmethod</em>' reference.
	 * @see #setActionmethod(ActionMethod)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToViewRelation_Actionmethod()
	 * @model required="true"
	 * @generated
	 */
	ActionMethod getActionmethod();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ControllerToViewRelation#getActionmethod <em>Actionmethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionmethod</em>' reference.
	 * @see #getActionmethod()
	 * @generated
	 */
	void setActionmethod(ActionMethod value);

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returns</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns</em>' reference.
	 * @see #setReturns(AbstractView)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToViewRelation_Returns()
	 * @model required="true"
	 * @generated
	 */
	AbstractView getReturns();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ControllerToViewRelation#getReturns <em>Returns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' reference.
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(AbstractView value);

} // ControllerToViewRelation
