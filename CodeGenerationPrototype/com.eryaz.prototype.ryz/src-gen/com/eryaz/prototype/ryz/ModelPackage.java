/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ModelPackage#getModels <em>Models</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ModelPackage#getModelassociations <em>Modelassociations</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getModelPackage()
 * @model
 * @generated
 */
public interface ModelPackage extends ComponentPackage {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelPackage_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Modelassociations</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.ModelAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelassociations</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelPackage_Modelassociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelAssociation> getModelassociations();

} // ModelPackage
