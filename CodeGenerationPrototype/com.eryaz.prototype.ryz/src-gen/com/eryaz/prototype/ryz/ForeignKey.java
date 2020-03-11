/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ForeignKey#getType <em>Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ForeignKey#is›sRequired <em>›s Required</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getForeignKey_Type()
	 * @model required="true"
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ForeignKey#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

	/**
	 * Returns the value of the '<em><b>›s Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>›s Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Required</em>' attribute.
	 * @see #set›sRequired(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getForeignKey_›sRequired()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sRequired();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ForeignKey#is›sRequired <em>›s Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Required</em>' attribute.
	 * @see #is›sRequired()
	 * @generated
	 */
	void set›sRequired(boolean value);

} // ForeignKey
