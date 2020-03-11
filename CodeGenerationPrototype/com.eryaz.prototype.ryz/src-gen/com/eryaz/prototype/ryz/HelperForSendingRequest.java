/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper For Sending Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getHelperForSendingRequest()
 * @model abstract="true"
 * @generated
 */
public interface HelperForSendingRequest extends HtmlElement {
	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.RequestType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.RequestType
	 * @see #setRequestType(RequestType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getHelperForSendingRequest_RequestType()
	 * @model required="true"
	 * @generated
	 */
	RequestType getRequestType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getRequestType <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.RequestType
	 * @see #getRequestType()
	 * @generated
	 */
	void setRequestType(RequestType value);

	/**
	 * Returns the value of the '<em><b>Http Method</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Method</em>' attribute.
	 * @see com.eryaz.prototype.ryz.HttpMethod
	 * @see #setHttpMethod(HttpMethod)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getHelperForSendingRequest_HttpMethod()
	 * @model required="true"
	 * @generated
	 */
	HttpMethod getHttpMethod();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getHttpMethod <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Method</em>' attribute.
	 * @see com.eryaz.prototype.ryz.HttpMethod
	 * @see #getHttpMethod()
	 * @generated
	 */
	void setHttpMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getHelperForSendingRequest_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // HelperForSendingRequest
