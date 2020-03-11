/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Property#getType <em>Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Property#is›sRequired <em>›s Required</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ModelPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelPropertyType
	 * @see #setType(ModelPropertyType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	ModelPropertyType getType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Property#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelPropertyType
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelPropertyType value);

	/**
	 * Returns the value of the '<em><b>›s Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Required</em>' attribute.
	 * @see #set›sRequired(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getProperty_›sRequired()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sRequired();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Property#is›sRequired <em>›s Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Required</em>' attribute.
	 * @see #is›sRequired()
	 * @generated
	 */
	void set›sRequired(boolean value);

} // Property
