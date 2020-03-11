/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Header;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.HeaderImpl#getLabelText <em>Label Text</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.HeaderImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header {
	/**
	 * The default value of the '{@link #getLabelText() <em>Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelText()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelText() <em>Label Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelText()
	 * @generated
	 * @ordered
	 */
	protected String labelText = LABEL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelText() {
		return labelText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelText(String newLabelText) {
		String oldLabelText = labelText;
		labelText = newLabelText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.HEADER__LABEL_TEXT, oldLabelText,
					labelText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.HEADER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.HEADER__LABEL_TEXT:
			return getLabelText();
		case RyzPackage.HEADER__NAME:
			return getName();
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
		case RyzPackage.HEADER__LABEL_TEXT:
			setLabelText((String) newValue);
			return;
		case RyzPackage.HEADER__NAME:
			setName((String) newValue);
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
		case RyzPackage.HEADER__LABEL_TEXT:
			setLabelText(LABEL_TEXT_EDEFAULT);
			return;
		case RyzPackage.HEADER__NAME:
			setName(NAME_EDEFAULT);
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
		case RyzPackage.HEADER__LABEL_TEXT:
			return LABEL_TEXT_EDEFAULT == null ? labelText != null : !LABEL_TEXT_EDEFAULT.equals(labelText);
		case RyzPackage.HEADER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (labelText: ");
		result.append(labelText);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
