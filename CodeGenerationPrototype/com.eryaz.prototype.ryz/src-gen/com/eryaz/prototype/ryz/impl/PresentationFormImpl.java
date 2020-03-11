/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.PresentationForm;
import com.eryaz.prototype.ryz.PresentationFormElement;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PresentationFormImpl#getPresentationformelement <em>Presentationformelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationFormImpl extends PresentationElementImpl implements PresentationForm {
	/**
	 * The cached value of the '{@link #getPresentationformelement() <em>Presentationformelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationformelement()
	 * @generated
	 * @ordered
	 */
	protected EList<PresentationFormElement> presentationformelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.PRESENTATÝON_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PresentationFormElement> getPresentationformelement() {
		if (presentationformelement == null) {
			presentationformelement = new EObjectContainmentEList<PresentationFormElement>(
					PresentationFormElement.class, this, RyzPackage.PRESENTATÝON_FORM__PRESENTATÝONFORMELEMENT);
		}
		return presentationformelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.PRESENTATÝON_FORM__PRESENTATÝONFORMELEMENT:
			return ((InternalEList<?>) getPresentationformelement()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.PRESENTATÝON_FORM__PRESENTATÝONFORMELEMENT:
			return getPresentationformelement();
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
		case RyzPackage.PRESENTATÝON_FORM__PRESENTATÝONFORMELEMENT:
			getPresentationformelement().clear();
			getPresentationformelement().addAll((Collection<? extends PresentationFormElement>) newValue);
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
		case RyzPackage.PRESENTATÝON_FORM__PRESENTATÝONFORMELEMENT:
			getPresentationformelement().clear();
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
		case RyzPackage.PRESENTATÝON_FORM__PRESENTATÝONFORMELEMENT:
			return presentationformelement != null && !presentationformelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PresentationFormImpl
