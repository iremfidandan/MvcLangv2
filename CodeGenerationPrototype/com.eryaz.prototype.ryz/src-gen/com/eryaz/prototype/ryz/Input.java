/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Input#get›nputDataType <em>›nput Data Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Input#is›sReadOnly <em>›s Read Only</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Input#is›sHidden <em>›s Hidden</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends PresentationFormElement {
	/**
	 * Returns the value of the '<em><b>›nput Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.InputDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›nput Data Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.InputDataType
	 * @see #set›nputDataType(InputDataType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getInput_›nputDataType()
	 * @model required="true"
	 * @generated
	 */
	InputDataType get›nputDataType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Input#get›nputDataType <em>›nput Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›nput Data Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.InputDataType
	 * @see #get›nputDataType()
	 * @generated
	 */
	void set›nputDataType(InputDataType value);

	/**
	 * Returns the value of the '<em><b>›s Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Read Only</em>' attribute.
	 * @see #set›sReadOnly(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getInput_›sReadOnly()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sReadOnly();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Input#is›sReadOnly <em>›s Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Read Only</em>' attribute.
	 * @see #is›sReadOnly()
	 * @generated
	 */
	void set›sReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>›s Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Hidden</em>' attribute.
	 * @see #set›sHidden(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getInput_›sHidden()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sHidden();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Input#is›sHidden <em>›s Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Hidden</em>' attribute.
	 * @see #is›sHidden()
	 * @generated
	 */
	void set›sHidden(boolean value);

} // Input
