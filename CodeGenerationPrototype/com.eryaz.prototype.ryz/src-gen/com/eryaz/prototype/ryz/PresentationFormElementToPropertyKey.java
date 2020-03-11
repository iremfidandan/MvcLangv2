/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Form Element To Property Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey#getPresentationformelement <em>Presentationformelement</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey#getProperty <em>Property</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey#getTablekey <em>Tablekey</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationFormElementToPropertyKey()
 * @model
 * @generated
 */
public interface PresentationFormElementToPropertyKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Presentationformelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentationformelement</em>' reference.
	 * @see #setPresentationformelement(PresentationFormElement)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationFormElementToPropertyKey_Presentationformelement()
	 * @model required="true"
	 * @generated
	 */
	PresentationFormElement getPresentationformelement();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey#getPresentationformelement <em>Presentationformelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentationformelement</em>' reference.
	 * @see #getPresentationformelement()
	 * @generated
	 */
	void setPresentationformelement(PresentationFormElement value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationFormElementToPropertyKey_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Tablekey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablekey</em>' reference.
	 * @see #setTablekey(TableKey)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationFormElementToPropertyKey_Tablekey()
	 * @model
	 * @generated
	 */
	TableKey getTablekey();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey#getTablekey <em>Tablekey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tablekey</em>' reference.
	 * @see #getTablekey()
	 * @generated
	 */
	void setTablekey(TableKey value);

} // PresentationFormElementToPropertyKey
