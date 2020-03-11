/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Button#getButtonType <em>Button Type</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends PresentationFormElement {
	/**
	 * Returns the value of the '<em><b>Button Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ButtonType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ButtonType
	 * @see #setButtonType(ButtonType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getButton_ButtonType()
	 * @model required="true"
	 * @generated
	 */
	ButtonType getButtonType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Button#getButtonType <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ButtonType
	 * @see #getButtonType()
	 * @generated
	 */
	void setButtonType(ButtonType value);

} // Button
