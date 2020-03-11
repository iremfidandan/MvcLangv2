/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Actor;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.UseCaseActorPackage;
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
 * An implementation of the model object '<em><b>Use Case Actor Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.UseCaseActorPackageImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.UseCaseActorPackageImpl#getUsecasepackages <em>Usecasepackages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseActorPackageImpl extends PackageImpl implements UseCaseActorPackage {
	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * The cached value of the '{@link #getUsecasepackages() <em>Usecasepackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecasepackages()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCasePackage> usecasepackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseActorPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.USE_CASE_ACTOR_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, RyzPackage.USE_CASE_ACTOR_PACKAGE__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UseCasePackage> getUsecasepackages() {
		if (usecasepackages == null) {
			usecasepackages = new EObjectContainmentEList<UseCasePackage>(UseCasePackage.class, this,
					RyzPackage.USE_CASE_ACTOR_PACKAGE__USECASEPACKAGES);
		}
		return usecasepackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__ACTORS:
			return ((InternalEList<?>) getActors()).basicRemove(otherEnd, msgs);
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__USECASEPACKAGES:
			return ((InternalEList<?>) getUsecasepackages()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__ACTORS:
			return getActors();
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__USECASEPACKAGES:
			return getUsecasepackages();
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
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__ACTORS:
			getActors().clear();
			getActors().addAll((Collection<? extends Actor>) newValue);
			return;
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__USECASEPACKAGES:
			getUsecasepackages().clear();
			getUsecasepackages().addAll((Collection<? extends UseCasePackage>) newValue);
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
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__ACTORS:
			getActors().clear();
			return;
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__USECASEPACKAGES:
			getUsecasepackages().clear();
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
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__ACTORS:
			return actors != null && !actors.isEmpty();
		case RyzPackage.USE_CASE_ACTOR_PACKAGE__USECASEPACKAGES:
			return usecasepackages != null && !usecasepackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UseCaseActorPackageImpl
