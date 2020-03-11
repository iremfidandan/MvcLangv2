/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.TableKey#getType <em>Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.TableKey#is›sRequired <em>›s Required</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.TableKey#is›sPrimaryKey <em>›s Primary Key</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.TableKey#is›sForeignKey <em>›s Foreign Key</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getTableKey()
 * @model
 * @generated
 */
public interface TableKey extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ModelPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelPropertyType
	 * @see #setType(ModelPropertyType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getTableKey_Type()
	 * @model required="true"
	 * @generated
	 */
	ModelPropertyType getType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.TableKey#getType <em>Type</em>}' attribute.
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
	 * @see com.eryaz.prototype.ryz.RyzPackage#getTableKey_›sRequired()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sRequired();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.TableKey#is›sRequired <em>›s Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Required</em>' attribute.
	 * @see #is›sRequired()
	 * @generated
	 */
	void set›sRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>›s Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Primary Key</em>' attribute.
	 * @see #set›sPrimaryKey(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getTableKey_›sPrimaryKey()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sPrimaryKey();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.TableKey#is›sPrimaryKey <em>›s Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Primary Key</em>' attribute.
	 * @see #is›sPrimaryKey()
	 * @generated
	 */
	void set›sPrimaryKey(boolean value);

	/**
	 * Returns the value of the '<em><b>›s Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Foreign Key</em>' attribute.
	 * @see #set›sForeignKey(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getTableKey_›sForeignKey()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sForeignKey();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.TableKey#is›sForeignKey <em>›s Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Foreign Key</em>' attribute.
	 * @see #is›sForeignKey()
	 * @generated
	 */
	void set›sForeignKey(boolean value);

} // TableKey
