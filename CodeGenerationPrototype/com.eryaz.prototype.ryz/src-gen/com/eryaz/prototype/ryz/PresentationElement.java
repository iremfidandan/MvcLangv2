/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presentation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.PresentationElement#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationElement()
 * @model abstract="true"
 * @generated
 */
public interface PresentationElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Helperforsendingrequest</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.HelperForSendingRequest}.
	 * It is bidirectional and its opposite is '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getPresentationelement <em>Presentationelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helperforsendingrequest</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getPresentationElement_Helperforsendingrequest()
	 * @see com.eryaz.prototype.ryz.HelperForSendingRequest#getPresentationelement
	 * @model opposite="presentationelement"
	 * @generated
	 */
	EList<HelperForSendingRequest> getHelperforsendingrequest();

} // PresentationElement
