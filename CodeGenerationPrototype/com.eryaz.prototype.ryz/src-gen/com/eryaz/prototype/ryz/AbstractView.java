/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.AbstractView#getRenders <em>Renders</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.AbstractView#getHtmlelements <em>Htmlelements</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getAbstractView()
 * @model abstract="true"
 * @generated
 */
public interface AbstractView extends MainComponent {
	/**
	 * Returns the value of the '<em><b>Renders</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Partial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renders</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getAbstractView_Renders()
	 * @model
	 * @generated
	 */
	EList<Partial> getRenders();

	/**
	 * Returns the value of the '<em><b>Htmlelements</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.HtmlElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Htmlelements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Htmlelements</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getAbstractView_Htmlelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<HtmlElement> getHtmlelements();

} // AbstractView
