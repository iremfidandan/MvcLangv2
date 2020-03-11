/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ModelPropertyType;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.TableKey;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.TableKeyImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.TableKeyImpl#is›sRequired <em>›s Required</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.TableKeyImpl#is›sPrimaryKey <em>›s Primary Key</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.TableKeyImpl#is›sForeignKey <em>›s Foreign Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableKeyImpl extends NamedElementImpl implements TableKey {
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
	 * The default value of the '{@link #is›sPrimaryKey() <em>›s Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_PR›MARY_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sPrimaryKey() <em>›s Primary Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sPrimaryKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimaryKey = ›S_PR›MARY_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #is›sForeignKey() <em>›s Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sForeignKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ›S_FORE›GN_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #is›sForeignKey() <em>›s Foreign Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is›sForeignKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isForeignKey = ›S_FORE›GN_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.TABLE_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPropertyType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ModelPropertyType newType) {
		ModelPropertyType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.TABLE_KEY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is›sRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set›sRequired(boolean new›sRequired) {
		boolean old›sRequired = isRequired;
		isRequired = new›sRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.TABLE_KEY__›S_REQU›RED, old›sRequired,
					isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is›sPrimaryKey() {
		return isPrimaryKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set›sPrimaryKey(boolean new›sPrimaryKey) {
		boolean old›sPrimaryKey = isPrimaryKey;
		isPrimaryKey = new›sPrimaryKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.TABLE_KEY__›S_PR›MARY_KEY, old›sPrimaryKey,
					isPrimaryKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is›sForeignKey() {
		return isForeignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set›sForeignKey(boolean new›sForeignKey) {
		boolean old›sForeignKey = isForeignKey;
		isForeignKey = new›sForeignKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.TABLE_KEY__›S_FORE›GN_KEY, old›sForeignKey,
					isForeignKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.TABLE_KEY__TYPE:
			return getType();
		case RyzPackage.TABLE_KEY__›S_REQU›RED:
			return is›sRequired();
		case RyzPackage.TABLE_KEY__›S_PR›MARY_KEY:
			return is›sPrimaryKey();
		case RyzPackage.TABLE_KEY__›S_FORE›GN_KEY:
			return is›sForeignKey();
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
		case RyzPackage.TABLE_KEY__TYPE:
			setType((ModelPropertyType) newValue);
			return;
		case RyzPackage.TABLE_KEY__›S_REQU›RED:
			set›sRequired((Boolean) newValue);
			return;
		case RyzPackage.TABLE_KEY__›S_PR›MARY_KEY:
			set›sPrimaryKey((Boolean) newValue);
			return;
		case RyzPackage.TABLE_KEY__›S_FORE›GN_KEY:
			set›sForeignKey((Boolean) newValue);
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
		case RyzPackage.TABLE_KEY__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case RyzPackage.TABLE_KEY__›S_REQU›RED:
			set›sRequired(›S_REQU›RED_EDEFAULT);
			return;
		case RyzPackage.TABLE_KEY__›S_PR›MARY_KEY:
			set›sPrimaryKey(›S_PR›MARY_KEY_EDEFAULT);
			return;
		case RyzPackage.TABLE_KEY__›S_FORE›GN_KEY:
			set›sForeignKey(›S_FORE›GN_KEY_EDEFAULT);
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
		case RyzPackage.TABLE_KEY__TYPE:
			return type != TYPE_EDEFAULT;
		case RyzPackage.TABLE_KEY__›S_REQU›RED:
			return isRequired != ›S_REQU›RED_EDEFAULT;
		case RyzPackage.TABLE_KEY__›S_PR›MARY_KEY:
			return isPrimaryKey != ›S_PR›MARY_KEY_EDEFAULT;
		case RyzPackage.TABLE_KEY__›S_FORE›GN_KEY:
			return isForeignKey != ›S_FORE›GN_KEY_EDEFAULT;
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
		result.append(", isPrimaryKey: ");
		result.append(isPrimaryKey);
		result.append(", isForeignKey: ");
		result.append(isForeignKey);
		result.append(')');
		return result.toString();
	}

} //TableKeyImpl
