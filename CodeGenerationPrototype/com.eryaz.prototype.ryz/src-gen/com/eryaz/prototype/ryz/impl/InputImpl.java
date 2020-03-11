/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Input;
import com.eryaz.prototype.ryz.InputDataType;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.InputImpl#get›nputDataType <em>›nput Data Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.InputImpl#is›sReadOnly <em>›s Read Only</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.InputImpl#is›sHidden <em>›s Hidden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends PresentationFormElementImpl implements Input {
	/**
	 * The default value of the '{@link #get›nputDataType() <em>›nput Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get›nputDataType()
	 * @generated
	 * @ordered
	 */
	protected static final InputDataType ›NPUT_DATA_TYPE_EDEFAULT = InputDataType.TEXT;

	/**
	 * The cached value of the '{@link #get›nputDataType() <em>›nput Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get›nputDataType()
	 * @generated
	 * @ordered
	 */
	protected InputDataType inputDataType = ›NPUT_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #is›sReadOnly() <em>›s Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sReadOnly() <em>›s Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = ›S_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #is›sHidden() <em>›s Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_H›DDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sHidden() <em>›s Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean isHidden = ›S_H›DDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputDataType get›nputDataType() {
		return inputDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set›nputDataType(InputDataType new›nputDataType) {
		InputDataType old›nputDataType = inputDataType;
		inputDataType = new›nputDataType == null ? ›NPUT_DATA_TYPE_EDEFAULT : new›nputDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.INPUT__›NPUT_DATA_TYPE, old›nputDataType,
					inputDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean is›sReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set›sReadOnly(boolean new›sReadOnly) {
		boolean old›sReadOnly = isReadOnly;
		isReadOnly = new›sReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.INPUT__›S_READ_ONLY, old›sReadOnly,
					isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean is›sHidden() {
		return isHidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set›sHidden(boolean new›sHidden) {
		boolean old›sHidden = isHidden;
		isHidden = new›sHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.INPUT__›S_H›DDEN, old›sHidden, isHidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.INPUT__›NPUT_DATA_TYPE:
			return get›nputDataType();
		case RyzPackage.INPUT__›S_READ_ONLY:
			return is›sReadOnly();
		case RyzPackage.INPUT__›S_H›DDEN:
			return is›sHidden();
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
		case RyzPackage.INPUT__›NPUT_DATA_TYPE:
			set›nputDataType((InputDataType) newValue);
			return;
		case RyzPackage.INPUT__›S_READ_ONLY:
			set›sReadOnly((Boolean) newValue);
			return;
		case RyzPackage.INPUT__›S_H›DDEN:
			set›sHidden((Boolean) newValue);
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
		case RyzPackage.INPUT__›NPUT_DATA_TYPE:
			set›nputDataType(›NPUT_DATA_TYPE_EDEFAULT);
			return;
		case RyzPackage.INPUT__›S_READ_ONLY:
			set›sReadOnly(›S_READ_ONLY_EDEFAULT);
			return;
		case RyzPackage.INPUT__›S_H›DDEN:
			set›sHidden(›S_H›DDEN_EDEFAULT);
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
		case RyzPackage.INPUT__›NPUT_DATA_TYPE:
			return inputDataType != ›NPUT_DATA_TYPE_EDEFAULT;
		case RyzPackage.INPUT__›S_READ_ONLY:
			return isReadOnly != ›S_READ_ONLY_EDEFAULT;
		case RyzPackage.INPUT__›S_H›DDEN:
			return isHidden != ›S_H›DDEN_EDEFAULT;
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
		result.append(" (inputDataType: ");
		result.append(inputDataType);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isHidden: ");
		result.append(isHidden);
		result.append(')');
		return result.toString();
	}

} //InputImpl
