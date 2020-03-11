/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.ActionMethodReturnType;
import com.eryaz.prototype.ryz.HttpMethod;
import com.eryaz.prototype.ryz.Parameter;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ActionMethodImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ActionMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ActionMethodImpl#getReturns <em>Returns</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ActionMethodImpl#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionMethodImpl extends NamedElementImpl implements ActionMethod {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getReturns() <em>Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturns()
	 * @generated
	 * @ordered
	 */
	protected static final ActionMethodReturnType RETURNS_EDEFAULT = ActionMethodReturnType.VÝEW;

	/**
	 * The cached value of the '{@link #getReturns() <em>Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturns()
	 * @generated
	 * @ordered
	 */
	protected ActionMethodReturnType returns = RETURNS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.ACTÝON_METHOD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.ACTÝON_METHOD__HTTP_METHOD, oldHttpMethod,
					httpMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					RyzPackage.ACTÝON_METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionMethodReturnType getReturns() {
		return returns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturns(ActionMethodReturnType newReturns) {
		ActionMethodReturnType oldReturns = returns;
		returns = newReturns == null ? RETURNS_EDEFAULT : newReturns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.ACTÝON_METHOD__RETURNS, oldReturns,
					returns));
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
					RyzPackage.ACTÝON_METHOD__USECASE, RyzPackage.USE_CASE__ACTÝONMETHOD);
		}
		return usecase;
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
		case RyzPackage.ACTÝON_METHOD__USECASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsecase()).basicAdd(otherEnd, msgs);
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
		case RyzPackage.ACTÝON_METHOD__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case RyzPackage.ACTÝON_METHOD__USECASE:
			return ((InternalEList<?>) getUsecase()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.ACTÝON_METHOD__HTTP_METHOD:
			return getHttpMethod();
		case RyzPackage.ACTÝON_METHOD__PARAMETERS:
			return getParameters();
		case RyzPackage.ACTÝON_METHOD__RETURNS:
			return getReturns();
		case RyzPackage.ACTÝON_METHOD__USECASE:
			return getUsecase();
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
		case RyzPackage.ACTÝON_METHOD__HTTP_METHOD:
			setHttpMethod((HttpMethod) newValue);
			return;
		case RyzPackage.ACTÝON_METHOD__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameter>) newValue);
			return;
		case RyzPackage.ACTÝON_METHOD__RETURNS:
			setReturns((ActionMethodReturnType) newValue);
			return;
		case RyzPackage.ACTÝON_METHOD__USECASE:
			getUsecase().clear();
			getUsecase().addAll((Collection<? extends UseCase>) newValue);
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
		case RyzPackage.ACTÝON_METHOD__HTTP_METHOD:
			setHttpMethod(HTTP_METHOD_EDEFAULT);
			return;
		case RyzPackage.ACTÝON_METHOD__PARAMETERS:
			getParameters().clear();
			return;
		case RyzPackage.ACTÝON_METHOD__RETURNS:
			setReturns(RETURNS_EDEFAULT);
			return;
		case RyzPackage.ACTÝON_METHOD__USECASE:
			getUsecase().clear();
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
		case RyzPackage.ACTÝON_METHOD__HTTP_METHOD:
			return httpMethod != HTTP_METHOD_EDEFAULT;
		case RyzPackage.ACTÝON_METHOD__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case RyzPackage.ACTÝON_METHOD__RETURNS:
			return returns != RETURNS_EDEFAULT;
		case RyzPackage.ACTÝON_METHOD__USECASE:
			return usecase != null && !usecase.isEmpty();
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
		result.append(" (httpMethod: ");
		result.append(httpMethod);
		result.append(", returns: ");
		result.append(returns);
		result.append(')');
		return result.toString();
	}

} //ActionMethodImpl
