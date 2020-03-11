/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.PresentationElement;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PresentationElementImpl#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PresentationElementImpl extends NamedElementImpl implements PresentationElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.PRESENTATÝON_ELEMENT;
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
					HelperForSendingRequest.class, this, RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST,
					RyzPackage.HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT);
		}
		return helperforsendingrequest;
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
		case RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHelperforsendingrequest()).basicAdd(otherEnd,
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
		case RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST:
			return ((InternalEList<?>) getHelperforsendingrequest()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST:
			return getHelperforsendingrequest();
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
		case RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST:
			getHelperforsendingrequest().clear();
			getHelperforsendingrequest().addAll((Collection<? extends HelperForSendingRequest>) newValue);
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
		case RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST:
			getHelperforsendingrequest().clear();
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
		case RyzPackage.PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST:
			return helperforsendingrequest != null && !helperforsendingrequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PresentationElementImpl
