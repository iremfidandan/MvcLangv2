/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.AbstractView;
import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.ControllerToViewRelation;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller To View Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ControllerToViewRelationImpl#getActionmethod <em>Actionmethod</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ControllerToViewRelationImpl#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerToViewRelationImpl extends MainComponentRelationImpl implements ControllerToViewRelation {
	/**
	 * The cached value of the '{@link #getActionmethod() <em>Actionmethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionmethod()
	 * @generated
	 * @ordered
	 */
	protected ActionMethod actionmethod;

	/**
	 * The cached value of the '{@link #getReturns() <em>Returns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturns()
	 * @generated
	 * @ordered
	 */
	protected AbstractView returns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerToViewRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.CONTROLLER_TO_VÝEW_RELATÝON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionMethod getActionmethod() {
		if (actionmethod != null && actionmethod.eIsProxy()) {
			InternalEObject oldActionmethod = (InternalEObject) actionmethod;
			actionmethod = (ActionMethod) eResolveProxy(oldActionmethod);
			if (actionmethod != oldActionmethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__ACTÝONMETHOD, oldActionmethod, actionmethod));
			}
		}
		return actionmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMethod basicGetActionmethod() {
		return actionmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionmethod(ActionMethod newActionmethod) {
		ActionMethod oldActionmethod = actionmethod;
		actionmethod = newActionmethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__ACTÝONMETHOD,
					oldActionmethod, actionmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractView getReturns() {
		if (returns != null && returns.eIsProxy()) {
			InternalEObject oldReturns = (InternalEObject) returns;
			returns = (AbstractView) eResolveProxy(oldReturns);
			if (returns != oldReturns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__RETURNS, oldReturns, returns));
			}
		}
		return returns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView basicGetReturns() {
		return returns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturns(AbstractView newReturns) {
		AbstractView oldReturns = returns;
		returns = newReturns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__RETURNS,
					oldReturns, returns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__ACTÝONMETHOD:
			if (resolve)
				return getActionmethod();
			return basicGetActionmethod();
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__RETURNS:
			if (resolve)
				return getReturns();
			return basicGetReturns();
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
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__ACTÝONMETHOD:
			setActionmethod((ActionMethod) newValue);
			return;
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__RETURNS:
			setReturns((AbstractView) newValue);
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
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__ACTÝONMETHOD:
			setActionmethod((ActionMethod) null);
			return;
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__RETURNS:
			setReturns((AbstractView) null);
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
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__ACTÝONMETHOD:
			return actionmethod != null;
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON__RETURNS:
			return returns != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerToViewRelationImpl
