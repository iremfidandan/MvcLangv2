/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.MainComponent;
import com.eryaz.prototype.ryz.MainComponentRelation;
import com.eryaz.prototype.ryz.MvcPackage;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mvc Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.MvcPackageImpl#getMaincomponents <em>Maincomponents</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.MvcPackageImpl#getMaincomponentrelations <em>Maincomponentrelations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MvcPackageImpl extends PackageImpl implements MvcPackage {
	/**
	 * The cached value of the '{@link #getMaincomponents() <em>Maincomponents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaincomponents()
	 * @generated
	 * @ordered
	 */
	protected EList<MainComponent> maincomponents;

	/**
	 * The cached value of the '{@link #getMaincomponentrelations() <em>Maincomponentrelations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaincomponentrelations()
	 * @generated
	 * @ordered
	 */
	protected EList<MainComponentRelation> maincomponentrelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MvcPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.MVC_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MainComponent> getMaincomponents() {
		if (maincomponents == null) {
			maincomponents = new EObjectResolvingEList<MainComponent>(MainComponent.class, this,
					RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTS);
		}
		return maincomponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MainComponentRelation> getMaincomponentrelations() {
		if (maincomponentrelations == null) {
			maincomponentrelations = new EObjectContainmentEList<MainComponentRelation>(MainComponentRelation.class,
					this, RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTRELATÝONS);
		}
		return maincomponentrelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTRELATÝONS:
			return ((InternalEList<?>) getMaincomponentrelations()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTS:
			return getMaincomponents();
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTRELATÝONS:
			return getMaincomponentrelations();
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
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTS:
			getMaincomponents().clear();
			getMaincomponents().addAll((Collection<? extends MainComponent>) newValue);
			return;
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTRELATÝONS:
			getMaincomponentrelations().clear();
			getMaincomponentrelations().addAll((Collection<? extends MainComponentRelation>) newValue);
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
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTS:
			getMaincomponents().clear();
			return;
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTRELATÝONS:
			getMaincomponentrelations().clear();
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
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTS:
			return maincomponents != null && !maincomponents.isEmpty();
		case RyzPackage.MVC_PACKAGE__MAÝNCOMPONENTRELATÝONS:
			return maincomponentrelations != null && !maincomponentrelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MvcPackageImpl
