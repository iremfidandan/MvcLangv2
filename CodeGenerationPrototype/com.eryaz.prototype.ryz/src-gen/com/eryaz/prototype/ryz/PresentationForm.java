/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.PresentationForm#getPresentationformelement <em>Presentationformelement</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationForm()
 * @model
 * @generated
 */
public interface PresentationForm extends PresentationElement {
	/**
	 * Returns the value of the '<em><b>Presentationformelement</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.PresentationFormElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentationformelement</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationForm_Presentationformelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<PresentationFormElement> getPresentationformelement();

} // PresentationForm
