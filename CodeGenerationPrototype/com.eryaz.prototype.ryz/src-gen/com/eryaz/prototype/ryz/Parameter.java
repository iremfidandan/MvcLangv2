/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Parameter#is›sNullable <em>›s Nullable</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Parameter#is›sList <em>›s List</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ActionMethodParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ActionMethodParameterType
	 * @see #setType(ActionMethodParameterType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	ActionMethodParameterType getType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ActionMethodParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActionMethodParameterType value);

	/**
	 * Returns the value of the '<em><b>›s Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Nullable</em>' attribute.
	 * @see #set›sNullable(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getParameter_›sNullable()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sNullable();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Parameter#is›sNullable <em>›s Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Nullable</em>' attribute.
	 * @see #is›sNullable()
	 * @generated
	 */
	void set›sNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>›s List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s List</em>' attribute.
	 * @see #set›sList(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getParameter_›sList()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sList();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Parameter#is›sList <em>›s List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s List</em>' attribute.
	 * @see #is›sList()
	 * @generated
	 */
	void set›sList(boolean value);

} // Parameter
