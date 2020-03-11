/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Model#is›sAbstract <em>›s Abstract</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Model#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Model#get›nherits <em>›nherits</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.Model#getTablekeys <em>Tablekeys</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends MainComponent {
	/**
	 * Returns the value of the '<em><b>›s Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>›s Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›s Abstract</em>' attribute.
	 * @see #set›sAbstract(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModel_›sAbstract()
	 * @model required="true"
	 * @generated
	 */
	boolean is›sAbstract();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Model#is›sAbstract <em>›s Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›s Abstract</em>' attribute.
	 * @see #is›sAbstract()
	 * @generated
	 */
	void set›sAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModel_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>›nherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>›nherits</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>›nherits</em>' reference.
	 * @see #set›nherits(Model)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModel_›nherits()
	 * @model
	 * @generated
	 */
	Model get›nherits();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.Model#get›nherits <em>›nherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>›nherits</em>' reference.
	 * @see #get›nherits()
	 * @generated
	 */
	void set›nherits(Model value);

	/**
	 * Returns the value of the '<em><b>Tablekeys</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.TableKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablekeys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablekeys</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getModel_Tablekeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableKey> getTablekeys();

} // Model
