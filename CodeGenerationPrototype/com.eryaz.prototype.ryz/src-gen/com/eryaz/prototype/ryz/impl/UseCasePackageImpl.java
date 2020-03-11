/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.UseCase;
import com.eryaz.prototype.ryz.UseCasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.UseCasePackageImpl#getUsecases <em>Usecases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCasePackageImpl extends NamedElementImpl implements UseCasePackage {
	/**
	 * The cached value of the '{@link #getUsecases() <em>Usecases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> usecases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCasePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.USE_CASE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UseCase> getUsecases() {
		if (usecases == null) {
			usecases = new EObjectContainmentEList<UseCase>(UseCase.class, this, RyzPackage.USE_CASE_PACKAGE__USECASES);
		}
		return usecases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.USE_CASE_PACKAGE__USECASES:
			return ((InternalEList<?>) getUsecases()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.USE_CASE_PACKAGE__USECASES:
			return getUsecases();
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
		case RyzPackage.USE_CASE_PACKAGE__USECASES:
			getUsecases().clear();
			getUsecases().addAll((Collection<? extends UseCase>) newValue);
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
		case RyzPackage.USE_CASE_PACKAGE__USECASES:
			getUsecases().clear();
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
		case RyzPackage.USE_CASE_PACKAGE__USECASES:
			return usecases != null && !usecases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCasePackageImpl
