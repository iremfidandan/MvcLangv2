/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;

import com.eryaz.prototype.ryz.TableKey;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelImpl#is›sAbstract <em>›s Abstract</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelImpl#get›nherits <em>›nherits</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelImpl#getTablekeys <em>Tablekeys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MainComponentImpl implements Model {
	/**
	 * The default value of the '{@link #is›sAbstract() <em>›s Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sAbstract() <em>›s Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = ›S_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #get›nherits() <em>›nherits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get›nherits()
	 * @generated
	 * @ordered
	 */
	protected Model inherits;

	/**
	 * The cached value of the '{@link #getTablekeys() <em>Tablekeys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablekeys()
	 * @generated
	 * @ordered
	 */
	protected EList<TableKey> tablekeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is›sAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set›sAbstract(boolean new›sAbstract) {
		boolean old›sAbstract = isAbstract;
		isAbstract = new›sAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL__›S_ABSTRACT, old›sAbstract,
					isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, RyzPackage.MODEL__PROPERT›ES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model get›nherits() {
		if (inherits != null && inherits.eIsProxy()) {
			InternalEObject old›nherits = (InternalEObject) inherits;
			inherits = (Model) eResolveProxy(old›nherits);
			if (inherits != old›nherits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RyzPackage.MODEL__›NHER›TS, old›nherits,
							inherits));
			}
		}
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGet›nherits() {
		return inherits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set›nherits(Model new›nherits) {
		Model old›nherits = inherits;
		inherits = new›nherits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL__›NHER›TS, old›nherits, inherits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableKey> getTablekeys() {
		if (tablekeys == null) {
			tablekeys = new EObjectContainmentEList<TableKey>(TableKey.class, this, RyzPackage.MODEL__TABLEKEYS);
		}
		return tablekeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.MODEL__PROPERT›ES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case RyzPackage.MODEL__TABLEKEYS:
			return ((InternalEList<?>) getTablekeys()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.MODEL__›S_ABSTRACT:
			return is›sAbstract();
		case RyzPackage.MODEL__PROPERT›ES:
			return getProperties();
		case RyzPackage.MODEL__›NHER›TS:
			if (resolve)
				return get›nherits();
			return basicGet›nherits();
		case RyzPackage.MODEL__TABLEKEYS:
			return getTablekeys();
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
		case RyzPackage.MODEL__›S_ABSTRACT:
			set›sAbstract((Boolean) newValue);
			return;
		case RyzPackage.MODEL__PROPERT›ES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
			return;
		case RyzPackage.MODEL__›NHER›TS:
			set›nherits((Model) newValue);
			return;
		case RyzPackage.MODEL__TABLEKEYS:
			getTablekeys().clear();
			getTablekeys().addAll((Collection<? extends TableKey>) newValue);
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
		case RyzPackage.MODEL__›S_ABSTRACT:
			set›sAbstract(›S_ABSTRACT_EDEFAULT);
			return;
		case RyzPackage.MODEL__PROPERT›ES:
			getProperties().clear();
			return;
		case RyzPackage.MODEL__›NHER›TS:
			set›nherits((Model) null);
			return;
		case RyzPackage.MODEL__TABLEKEYS:
			getTablekeys().clear();
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
		case RyzPackage.MODEL__›S_ABSTRACT:
			return isAbstract != ›S_ABSTRACT_EDEFAULT;
		case RyzPackage.MODEL__PROPERT›ES:
			return properties != null && !properties.isEmpty();
		case RyzPackage.MODEL__›NHER›TS:
			return inherits != null;
		case RyzPackage.MODEL__TABLEKEYS:
			return tablekeys != null && !tablekeys.isEmpty();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
