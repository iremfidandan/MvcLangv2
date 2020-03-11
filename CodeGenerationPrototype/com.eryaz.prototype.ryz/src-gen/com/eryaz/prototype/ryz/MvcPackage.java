/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mvc Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.MvcPackage#getMaincomponents <em>Maincomponents</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.MvcPackage#getMaincomponentrelations <em>Maincomponentrelations</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getMvcPackage()
 * @model
 * @generated
 */
public interface MvcPackage extends com.eryaz.prototype.ryz.Package {
	/**
	 * Returns the value of the '<em><b>Maincomponents</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.MainComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maincomponents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maincomponents</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getMvcPackage_Maincomponents()
	 * @model
	 * @generated
	 */
	EList<MainComponent> getMaincomponents();

	/**
	 * Returns the value of the '<em><b>Maincomponentrelations</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.MainComponentRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maincomponentrelations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maincomponentrelations</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getMvcPackage_Maincomponentrelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<MainComponentRelation> getMaincomponentrelations();

} // MvcPackage
