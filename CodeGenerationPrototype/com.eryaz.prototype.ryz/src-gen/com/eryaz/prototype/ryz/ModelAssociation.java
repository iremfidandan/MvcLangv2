/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ModelAssociation#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ModelAssociation#getDependent <em>Dependent</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ModelAssociation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ModelAssociation#is›sRequired <em>›s Required</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ModelAssociation#getPrincipalRoleName <em>Principal Role Name</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ModelAssociation#getDependentRoleName <em>Dependent Role Name</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getModelAssociation()
 * @model
 * @generated
 */
public interface ModelAssociation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Principal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principal</em>' reference.
	 * @see #setPrincipal(Model)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelAssociation_Principal()
	 * @model required="true"
	 * @generated
	 */
	Model getPrincipal();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ModelAssociation#getPrincipal <em>Principal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal</em>' reference.
	 * @see #getPrincipal()
	 * @generated
	 */
	void setPrincipal(Model value);

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' reference.
	 * @see #setDependent(Model)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelAssociation_Dependent()
	 * @model required="true"
	 * @generated
	 */
	Model getDependent();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ModelAssociation#getDependent <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent</em>' reference.
	 * @see #getDependent()
	 * @generated
	 */
	void setDependent(Model value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see com.eryaz.prototype.ryz.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelAssociation_Cardinality()
	 * @model required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ModelAssociation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see com.eryaz.prototype.ryz.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>›s Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>›s Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Required</em>' attribute.
	 * @see #set›sRequired(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelAssociation_›sRequired()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sRequired();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ModelAssociation#is›sRequired <em>›s Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Required</em>' attribute.
	 * @see #is›sRequired()
	 * @generated
	 */
	void set›sRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Principal Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principal Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principal Role Name</em>' attribute.
	 * @see #setPrincipalRoleName(String)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelAssociation_PrincipalRoleName()
	 * @model required="true"
	 * @generated
	 */
	String getPrincipalRoleName();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ModelAssociation#getPrincipalRoleName <em>Principal Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Role Name</em>' attribute.
	 * @see #getPrincipalRoleName()
	 * @generated
	 */
	void setPrincipalRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Dependent Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Role Name</em>' attribute.
	 * @see #setDependentRoleName(String)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModelAssociation_DependentRoleName()
	 * @model required="true"
	 * @generated
	 */
	String getDependentRoleName();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ModelAssociation#getDependentRoleName <em>Dependent Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependent Role Name</em>' attribute.
	 * @see #getDependentRoleName()
	 * @generated
	 */
	void setDependentRoleName(String value);

} // ModelAssociation
