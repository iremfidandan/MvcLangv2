/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.HttpMethod;
import com.eryaz.prototype.ryz.RequestType;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper For Sending Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HelperForSendingRequestImpl extends HtmlElementImpl implements HelperForSendingRequest {
	/**
	 * The default value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected static final RequestType REQUEST_TYPE_EDEFAULT = RequestType.REGULAR_HTTP;

	/**
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected RequestType requestType = REQUEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HttpMethod HTTP_METHOD_EDEFAULT = HttpMethod.GET;

	/**
	 * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpMethod()
	 * @generated
	 * @ordered
	 */
	protected HttpMethod httpMethod = HTTP_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperForSendingRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.HELPER_FOR_SENDÝNG_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestType getRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestType(RequestType newRequestType) {
		RequestType oldRequestType = requestType;
		requestType = newRequestType == null ? REQUEST_TYPE_EDEFAULT : newRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__REQUEST_TYPE,
					oldRequestType, requestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpMethod(HttpMethod newHttpMethod) {
		HttpMethod oldHttpMethod = httpMethod;
		httpMethod = newHttpMethod == null ? HTTP_METHOD_EDEFAULT : newHttpMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__HTTP_METHOD,
					oldHttpMethod, httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__TEXT, oldText,
					text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__REQUEST_TYPE:
			return getRequestType();
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__HTTP_METHOD:
			return getHttpMethod();
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__TEXT:
			return getText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__REQUEST_TYPE:
			setRequestType((RequestType) newValue);
			return;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__HTTP_METHOD:
			setHttpMethod((HttpMethod) newValue);
			return;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__TEXT:
			setText((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__REQUEST_TYPE:
			setRequestType(REQUEST_TYPE_EDEFAULT);
			return;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__HTTP_METHOD:
			setHttpMethod(HTTP_METHOD_EDEFAULT);
			return;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__TEXT:
			setText(TEXT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__REQUEST_TYPE:
			return requestType != REQUEST_TYPE_EDEFAULT;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__HTTP_METHOD:
			return httpMethod != HTTP_METHOD_EDEFAULT;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__TEXT:
			return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (requestType: ");
		result.append(requestType);
		result.append(", httpMethod: ");
		result.append(httpMethod);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //HelperForSendingRequestImpl
