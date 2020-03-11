/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View To Controller Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getActionmethod <em>Actionmethod</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToControllerRelation()
 * @model
 * @generated
 */
public interface ViewToControllerRelation extends MainComponentRelation {
	/**
	 * Returns the value of the '<em><b>Helperforsendingrequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helperforsendingrequest</em>' reference.
	 * @see #setHelperforsendingrequest(HelperForSendingRequest)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToControllerRelation_Helperforsendingrequest()
	 * @model required="true"
	 * @generated
	 */
	HelperForSendingRequest getHelperforsendingrequest();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getHelperforsendingrequest <em>Helperforsendingrequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helperforsendingrequest</em>' reference.
	 * @see #getHelperforsendingrequest()
	 * @generated
	 */
	void setHelperforsendingrequest(HelperForSendingRequest value);

	/**
	 * Returns the value of the '<em><b>Actionmethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionmethod</em>' reference.
	 * @see #setActionmethod(ActionMethod)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToControllerRelation_Actionmethod()
	 * @model required="true"
	 * @generated
	 */
	ActionMethod getActionmethod();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getActionmethod <em>Actionmethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actionmethod</em>' reference.
	 * @see #getActionmethod()
	 * @generated
	 */
	void setActionmethod(ActionMethod value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToControllerRelation_Model()
	 * @model
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToControllerRelation_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

} // ViewToControllerRelation
