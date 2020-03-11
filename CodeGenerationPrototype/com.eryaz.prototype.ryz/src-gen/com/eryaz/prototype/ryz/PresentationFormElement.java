/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Form Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.PresentationFormElement#getLabelText <em>Label Text</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationFormElement()
 * @model abstract="true"
 * @generated
 */
public interface PresentationFormElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Text</em>' attribute.
	 * @see #setLabelText(String)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationFormElement_LabelText()
	 * @model required="true"
	 * @generated
	 */
	String getLabelText();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.PresentationFormElement#getLabelText <em>Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Text</em>' attribute.
	 * @see #getLabelText()
	 * @generated
	 */
	void setLabelText(String value);

} // PresentationFormElement
