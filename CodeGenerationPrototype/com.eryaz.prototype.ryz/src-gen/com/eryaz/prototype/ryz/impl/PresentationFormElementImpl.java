/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.PresentationFormElement;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Form Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PresentationFormElementImpl#getLabelText <em>Label Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PresentationFormElementImpl extends MinimalEObjectImpl.Container
		implements PresentationFormElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationFormElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.PRESENTATÝON_FORM_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.PRESENTATÝON_FORM_ELEMENT__LABEL_TEXT,
					oldLabelText, labelText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT__LABEL_TEXT:
			return getLabelText();
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
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT__LABEL_TEXT:
			setLabelText((String) newValue);
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
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT__LABEL_TEXT:
			setLabelText(LABEL_TEXT_EDEFAULT);
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
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT__LABEL_TEXT:
			return LABEL_TEXT_EDEFAULT == null ? labelText != null : !LABEL_TEXT_EDEFAULT.equals(labelText);
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
		result.append(')');
		return result.toString();
	}

} //PresentationFormElementImpl
