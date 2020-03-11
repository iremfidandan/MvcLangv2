/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ActionMethod#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ActionMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ActionMethod#getReturns <em>Returns</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ActionMethod#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getActionMethod()
 * @model
 * @generated
 */
public interface ActionMethod extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see com.eryaz.prototype.ryz.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getActionMethod_HttpMethod()
	 * @model required="true"
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ActionMethod#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see com.eryaz.prototype.ryz.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getActionMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ActionMethodReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returns</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ActionMethodReturnType
	 * @see #setReturns(ActionMethodReturnType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getActionMethod_Returns()
	 * @model required="true"
	 * @generated
	 */
	ActionMethodReturnType getReturns();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ActionMethod#getReturns <em>Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ActionMethodReturnType
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(ActionMethodReturnType value);

	/**
	 * Returns the value of the '<em><b>Usecase</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.UseCase}.
	 * It is bidirectional and its opposite is '{@link com.eryaz.prototype.ryz.UseCase#getActionmethod <em>Actionmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecase</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getActionMethod_Usecase()
	 * @see com.eryaz.prototype.ryz.UseCase#getActionmethod
	 * @model opposite="actionmethod"
	 * @generated
	 */
	EList<UseCase> getUsecase();

} // ActionMethod
