/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.Actor;
import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.UseCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.UseCaseImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.UseCaseImpl#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.UseCaseImpl#getActionmethod <em>Actionmethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends NamedElementImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getHelperforsendingrequest() <em>Helperforsendingrequest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelperforsendingrequest()
	 * @generated
	 * @ordered
	 */
	protected EList<HelperForSendingRequest> helperforsendingrequest;

	/**
	 * The cached value of the '{@link #getActionmethod() <em>Actionmethod</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionmethod()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionMethod> actionmethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this,
					RyzPackage.USE_CASE__ACTOR, RyzPackage.ACTOR__USECASE);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HelperForSendingRequest> getHelperforsendingrequest() {
		if (helperforsendingrequest == null) {
			helperforsendingrequest = new EObjectWithInverseResolvingEList.ManyInverse<HelperForSendingRequest>(
					HelperForSendingRequest.class, this, RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST,
					RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__USECASE);
		}
		return helperforsendingrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionMethod> getActionmethod() {
		if (actionmethod == null) {
			actionmethod = new EObjectWithInverseResolvingEList.ManyInverse<ActionMethod>(ActionMethod.class, this,
					RyzPackage.USE_CASE__ACTÝONMETHOD, RyzPackage.ACTÝON_METHOD__USECASE);
		}
		return actionmethod;
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
		case RyzPackage.USE_CASE__ACTOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActor()).basicAdd(otherEnd, msgs);
		case RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHelperforsendingrequest()).basicAdd(otherEnd,
					msgs);
		case RyzPackage.USE_CASE__ACTÝONMETHOD:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActionmethod()).basicAdd(otherEnd, msgs);
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
		case RyzPackage.USE_CASE__ACTOR:
			return ((InternalEList<?>) getActor()).basicRemove(otherEnd, msgs);
		case RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST:
			return ((InternalEList<?>) getHelperforsendingrequest()).basicRemove(otherEnd, msgs);
		case RyzPackage.USE_CASE__ACTÝONMETHOD:
			return ((InternalEList<?>) getActionmethod()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.USE_CASE__ACTOR:
			return getActor();
		case RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST:
			return getHelperforsendingrequest();
		case RyzPackage.USE_CASE__ACTÝONMETHOD:
			return getActionmethod();
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
		case RyzPackage.USE_CASE__ACTOR:
			getActor().clear();
			getActor().addAll((Collection<? extends Actor>) newValue);
			return;
		case RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST:
			getHelperforsendingrequest().clear();
			getHelperforsendingrequest().addAll((Collection<? extends HelperForSendingRequest>) newValue);
			return;
		case RyzPackage.USE_CASE__ACTÝONMETHOD:
			getActionmethod().clear();
			getActionmethod().addAll((Collection<? extends ActionMethod>) newValue);
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
		case RyzPackage.USE_CASE__ACTOR:
			getActor().clear();
			return;
		case RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST:
			getHelperforsendingrequest().clear();
			return;
		case RyzPackage.USE_CASE__ACTÝONMETHOD:
			getActionmethod().clear();
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
		case RyzPackage.USE_CASE__ACTOR:
			return actor != null && !actor.isEmpty();
		case RyzPackage.USE_CASE__HELPERFORSENDÝNGREQUEST:
			return helperforsendingrequest != null && !helperforsendingrequest.isEmpty();
		case RyzPackage.USE_CASE__ACTÝONMETHOD:
			return actionmethod != null && !actionmethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCaseImpl
