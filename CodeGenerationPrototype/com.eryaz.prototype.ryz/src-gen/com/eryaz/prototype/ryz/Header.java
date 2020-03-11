/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Header#getLabelText <em>Label Text</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Header#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Text</em>' attribute.
	 * @see #setLabelText(String)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getHeader_LabelText()
	 * @model required="true"
	 * @generated
	 */
	String getLabelText();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Header#getLabelText <em>Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Text</em>' attribute.
	 * @see #getLabelText()
	 * @generated
	 */
	void setLabelText(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getHeader_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Header#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Header
