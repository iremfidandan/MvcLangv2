/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller To Model Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getActionmethod <em>Actionmethod</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelproperties <em>Modelproperties</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelCardinality <em>Model Cardinality</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelOperation <em>Model Operation</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToModelRelation()
 * @model
 * @generated
 */
public interface ControllerToModelRelation extends MainComponentRelation {
	/**
	 * Returns the value of the '<em><b>Actionmethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionmethod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionmethod</em>' reference.
	 * @see #setActionmethod(ActionMethod)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToModelRelation_Actionmethod()
	 * @model required="true"
	 * @generated
	 */
	ActionMethod getActionmethod();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getActionmethod <em>Actionmethod</em>}' reference.
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
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToModelRelation_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Modelproperties</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelproperties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelproperties</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToModelRelation_Modelproperties()
	 * @model
	 * @generated
	 */
	EList<Property> getModelproperties();

	/**
	 * Returns the value of the '<em><b>Model Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ModelCardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Cardinality</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelCardinality
	 * @see #setModelCardinality(ModelCardinality)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToModelRelation_ModelCardinality()
	 * @model required="true"
	 * @generated
	 */
	ModelCardinality getModelCardinality();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelCardinality <em>Model Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Cardinality</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelCardinality
	 * @see #getModelCardinality()
	 * @generated
	 */
	void setModelCardinality(ModelCardinality value);

	/**
	 * Returns the value of the '<em><b>Model Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ModelOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Operation</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelOperation
	 * @see #setModelOperation(ModelOperation)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getControllerToModelRelation_ModelOperation()
	 * @model required="true"
	 * @generated
	 */
	ModelOperation getModelOperation();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelOperation <em>Model Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Operation</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ModelOperation
	 * @see #getModelOperation()
	 * @generated
	 */
	void setModelOperation(ModelOperation value);

} // ControllerToModelRelation
