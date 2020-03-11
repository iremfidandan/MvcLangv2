/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Element To Property Key Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation#getPresentationformelementtoproperty <em>Presentationformelementtoproperty</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getFormElementToPropertyKeyRelation()
 * @model
 * @generated
 */
public interface FormElementToPropertyKeyRelation extends MainComponentRelation {
	/**
	 * Returns the value of the '<em><b>Helperforsendingrequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helperforsendingrequest</em>' reference.
	 * @see #setHelperforsendingrequest(HelperForSendingRequest)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getFormElementToPropertyKeyRelation_Helperforsendingrequest()
	 * @model required="true"
	 * @generated
	 */
	HelperForSendingRequest getHelperforsendingrequest();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation#getHelperforsendingrequest <em>Helperforsendingrequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helperforsendingrequest</em>' reference.
	 * @see #getHelperforsendingrequest()
	 * @generated
	 */
	void setHelperforsendingrequest(HelperForSendingRequest value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getFormElementToPropertyKeyRelation_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Presentationformelementtoproperty</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentationformelementtoproperty</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getFormElementToPropertyKeyRelation_Presentationformelementtoproperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<PresentationFormElementToPropertyKey> getPresentationformelementtoproperty();

} // FormElementToPropertyKeyRelation
