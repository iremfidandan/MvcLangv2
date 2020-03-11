/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Button;
import com.eryaz.prototype.ryz.ButtonType;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ButtonImpl#getButtonType <em>Button Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends PresentationFormElementImpl implements Button {
	/**
	 * The default value of the '{@link #getButtonType() <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonType()
	 * @generated
	 * @ordered
	 */
	protected static final ButtonType BUTTON_TYPE_EDEFAULT = ButtonType.SUBMIT;

	/**
	 * The cached value of the '{@link #getButtonType() <em>Button Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonType()
	 * @generated
	 * @ordered
	 */
	protected ButtonType buttonType = BUTTON_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ButtonType getButtonType() {
		return buttonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setButtonType(ButtonType newButtonType) {
		ButtonType oldButtonType = buttonType;
		buttonType = newButtonType == null ? BUTTON_TYPE_EDEFAULT : newButtonType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.BUTTON__BUTTON_TYPE, oldButtonType,
					buttonType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.BUTTON__BUTTON_TYPE:
			return getButtonType();
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
		case RyzPackage.BUTTON__BUTTON_TYPE:
			setButtonType((ButtonType) newValue);
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
		case RyzPackage.BUTTON__BUTTON_TYPE:
			setButtonType(BUTTON_TYPE_EDEFAULT);
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
		case RyzPackage.BUTTON__BUTTON_TYPE:
			return buttonType != BUTTON_TYPE_EDEFAULT;
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
		result.append(" (buttonType: ");
		result.append(buttonType);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl
