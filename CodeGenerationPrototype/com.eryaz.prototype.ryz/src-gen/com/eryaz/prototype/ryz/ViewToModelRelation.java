/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View To Model Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToModelRelation#getAbstractview <em>Abstractview</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToModelRelation#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToModelRelation#getModelcardinality <em>Modelcardinality</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ViewToModelRelation#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToModelRelation()
 * @model
 * @generated
 */
public interface ViewToModelRelation extends MainComponentRelation {
	/**
	 * Returns the value of the '<em><b>Abstractview</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractview</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractview</em>' reference.
	 * @see #setAbstractview(AbstractView)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToModelRelation_Abstractview()
	 * @model required="true"
	 * @generated
	 */
	AbstractView getAbstractview();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ViewToModelRelation#getAbstractview <em>Abstractview</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstractview</em>' reference.
	 * @see #getAbstractview()
	 * @generated
	 */
	void setAbstractview(AbstractView value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToModelRelation_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ViewToModelRelation#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Modelcardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ModelCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelcardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelcardinality</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelCardinality
	 * @see #setModelcardinality(ModelCardinality)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToModelRelation_Modelcardinality()
	 * @model required="true"
	 * @generated
	 */
	ModelCardinality getModelcardinality();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ViewToModelRelation#getModelcardinality <em>Modelcardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelcardinality</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelCardinality
	 * @see #getModelcardinality()
	 * @generated
	 */
	void setModelcardinality(ModelCardinality value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getViewToModelRelation_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

} // ViewToModelRelation
