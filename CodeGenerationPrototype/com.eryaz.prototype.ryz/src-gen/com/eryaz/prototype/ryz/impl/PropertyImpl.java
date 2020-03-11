/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ModelPropertyType;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PropertyImpl#is›sRequired <em>›s Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends NamedElementImpl implements Property {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ModelPropertyType TYPE_EDEFAULT = ModelPropertyType.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ModelPropertyType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #is›sRequired() <em>›s Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_REQU›RED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sRequired() <em>›s Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = ›S_REQU›RED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelPropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ModelPropertyType newType) {
		ModelPropertyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean is›sRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set›sRequired(boolean new›sRequired) {
		boolean old›sRequired = isRequired;
		isRequired = new›sRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.PROPERTY__›S_REQU›RED, old›sRequired,
					isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.PROPERTY__TYPE:
			return getType();
		case RyzPackage.PROPERTY__›S_REQU›RED:
			return is›sRequired();
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
		case RyzPackage.PROPERTY__TYPE:
			setType((ModelPropertyType) newValue);
			return;
		case RyzPackage.PROPERTY__›S_REQU›RED:
			set›sRequired((Boolean) newValue);
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
		case RyzPackage.PROPERTY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RyzPackage.PROPERTY__›S_REQU›RED:
			set›sRequired(›S_REQU›RED_EDEFAULT);
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
		case RyzPackage.PROPERTY__TYPE:
			return type != TYPE_EDEFAULT;
		case RyzPackage.PROPERTY__›S_REQU›RED:
			return isRequired != ›S_REQU›RED_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", isRequired: ");
		result.append(isRequired);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
