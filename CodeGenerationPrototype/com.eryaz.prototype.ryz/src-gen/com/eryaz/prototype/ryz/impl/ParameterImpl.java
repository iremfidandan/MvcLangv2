/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ActionMethodParameterType;
import com.eryaz.prototype.ryz.Parameter;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ParameterImpl#is›sNullable <em>›s Nullable</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ParameterImpl#is›sList <em>›s List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends NamedElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ActionMethodParameterType TYPE_EDEFAULT = ActionMethodParameterType.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActionMethodParameterType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #is›sNullable() <em>›s Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sNullable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_NULLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sNullable() <em>›s Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sNullable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNullable = ›S_NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #is›sList() <em>›s List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sList()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_L›ST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sList() <em>›s List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sList()
	 * @generated
	 * @ordered
	 */
	protected boolean isList = ›S_L›ST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionMethodParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ActionMethodParameterType newType) {
		ActionMethodParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean is›sNullable() {
		return isNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set›sNullable(boolean new›sNullable) {
		boolean old›sNullable = isNullable;
		isNullable = new›sNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.PARAMETER__›S_NULLABLE, old›sNullable,
					isNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean is›sList() {
		return isList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void set›sList(boolean new›sList) {
		boolean old›sList = isList;
		isList = new›sList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.PARAMETER__›S_L›ST, old›sList, isList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.PARAMETER__TYPE:
			return getType();
		case RyzPackage.PARAMETER__›S_NULLABLE:
			return is›sNullable();
		case RyzPackage.PARAMETER__›S_L›ST:
			return is›sList();
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
		case RyzPackage.PARAMETER__TYPE:
			setType((ActionMethodParameterType) newValue);
			return;
		case RyzPackage.PARAMETER__›S_NULLABLE:
			set›sNullable((Boolean) newValue);
			return;
		case RyzPackage.PARAMETER__›S_L›ST:
			set›sList((Boolean) newValue);
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
		case RyzPackage.PARAMETER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RyzPackage.PARAMETER__›S_NULLABLE:
			set›sNullable(›S_NULLABLE_EDEFAULT);
			return;
		case RyzPackage.PARAMETER__›S_L›ST:
			set›sList(›S_L›ST_EDEFAULT);
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
		case RyzPackage.PARAMETER__TYPE:
			return type != TYPE_EDEFAULT;
		case RyzPackage.PARAMETER__›S_NULLABLE:
			return isNullable != ›S_NULLABLE_EDEFAULT;
		case RyzPackage.PARAMETER__›S_L›ST:
			return isList != ›S_L›ST_EDEFAULT;
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
		result.append(", isNullable: ");
		result.append(isNullable);
		result.append(", isList: ");
		result.append(isList);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
