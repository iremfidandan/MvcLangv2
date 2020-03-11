/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.HttpMethod;
import com.eryaz.prototype.ryz.PresentationElement;
import com.eryaz.prototype.ryz.RequestType;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl#getPresentationelement <em>Presentationelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HelperForSendingRequestImpl extends MinimalEObjectImpl.Container
		implements HelperForSendingRequest {
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
	 * The cached value of the '{@link #getUsecase() <em>Usecase</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> usecase;

	/**
	 * The cached value of the '{@link #getPresentationelement() <em>Presentationelement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationelement()
	 * @generated
	 * @ordered
	 */
	protected EList<PresentationElement> presentationelement;

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
	@Override
	public RequestType getRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	public EList<UseCase> getUsecase() {
		if (usecase == null) {
			usecase = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this,
					RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE, RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST);
		}
		return usecase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PresentationElement> getPresentationelement() {
		if (presentationelement == null) {
			presentationelement = new EObjectWithInverseResolvingEList.ManyInverse<PresentationElement>(
					PresentationElement.class, this, RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT,
					RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST);
		}
		return presentationelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsecase()).basicAdd(otherEnd, msgs);
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPresentationelement()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE:
			return ((InternalEList<?>) getUsecase()).basicRemove(otherEnd, msgs);
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT:
			return ((InternalEList<?>) getPresentationelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE:
			return getUsecase();
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT:
			return getPresentationelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE:
			getUsecase().clear();
			getUsecase().addAll((Collection<? extends UseCase>) newValue);
			return;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT:
			getPresentationelement().clear();
			getPresentationelement().addAll((Collection<? extends PresentationElement>) newValue);
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
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE:
			getUsecase().clear();
			return;
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT:
			getPresentationelement().clear();
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
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE:
			return usecase != null && !usecase.isEmpty();
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT:
			return presentationelement != null && !presentationelement.isEmpty();
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
