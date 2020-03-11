/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Cardinality;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelAssociation;
import com.eryaz.prototype.ryz.RyzPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl#getPrincipal <em>Principal</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl#getDependent <em>Dependent</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl#is›sRequired <em>›s Required</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl#getPrincipalRoleName <em>Principal Role Name</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl#getDependentRoleName <em>Dependent Role Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelAssociationImpl extends NamedElementImpl implements ModelAssociation {
	/**
	 * The cached value of the '{@link #getPrincipal() <em>Principal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipal()
	 * @generated
	 * @ordered
	 */
	protected Model principal;

	/**
	 * The cached value of the '{@link #getDependent() <em>Dependent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent()
	 * @generated
	 * @ordered
	 */
	protected Model dependent;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARD›NAL›TY_EDEFAULT = Cardinality.MANY_TO_MANY;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARD›NAL›TY_EDEFAULT;

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
	 * The default value of the '{@link #getPrincipalRoleName() <em>Principal Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String PR›NC›PAL_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrincipalRoleName() <em>Principal Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipalRoleName()
	 * @generated
	 * @ordered
	 */
	protected String principalRoleName = PR›NC›PAL_ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependentRoleName() <em>Dependent Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENT_ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependentRoleName() <em>Dependent Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentRoleName()
	 * @generated
	 * @ordered
	 */
	protected String dependentRoleName = DEPENDENT_ROLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.MODEL_ASSOC›AT›ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getPrincipal() {
		if (principal != null && principal.eIsProxy()) {
			InternalEObject oldPrincipal = (InternalEObject) principal;
			principal = (Model) eResolveProxy(oldPrincipal);
			if (principal != oldPrincipal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL,
							oldPrincipal, principal));
			}
		}
		return principal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetPrincipal() {
		return principal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipal(Model newPrincipal) {
		Model oldPrincipal = principal;
		principal = newPrincipal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL, oldPrincipal,
					principal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getDependent() {
		if (dependent != null && dependent.eIsProxy()) {
			InternalEObject oldDependent = (InternalEObject) dependent;
			dependent = (Model) eResolveProxy(oldDependent);
			if (dependent != oldDependent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT,
							oldDependent, dependent));
			}
		}
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetDependent() {
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependent(Model newDependent) {
		Model oldDependent = dependent;
		dependent = newDependent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT, oldDependent,
					dependent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARD›NAL›TY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL_ASSOC›AT›ON__CARD›NAL›TY,
					oldCardinality, cardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL_ASSOC›AT›ON__›S_REQU›RED,
					old›sRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrincipalRoleName() {
		return principalRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrincipalRoleName(String newPrincipalRoleName) {
		String oldPrincipalRoleName = principalRoleName;
		principalRoleName = newPrincipalRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME,
					oldPrincipalRoleName, principalRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDependentRoleName() {
		return dependentRoleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependentRoleName(String newDependentRoleName) {
		String oldDependentRoleName = dependentRoleName;
		dependentRoleName = newDependentRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME,
					oldDependentRoleName, dependentRoleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL:
			if (resolve)
				return getPrincipal();
			return basicGetPrincipal();
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT:
			if (resolve)
				return getDependent();
			return basicGetDependent();
		case RyzPackage.MODEL_ASSOC›AT›ON__CARD›NAL›TY:
			return getCardinality();
		case RyzPackage.MODEL_ASSOC›AT›ON__›S_REQU›RED:
			return is›sRequired();
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME:
			return getPrincipalRoleName();
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME:
			return getDependentRoleName();
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
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL:
			setPrincipal((Model) newValue);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT:
			setDependent((Model) newValue);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__CARD›NAL›TY:
			setCardinality((Cardinality) newValue);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__›S_REQU›RED:
			set›sRequired((Boolean) newValue);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME:
			setPrincipalRoleName((String) newValue);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME:
			setDependentRoleName((String) newValue);
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
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL:
			setPrincipal((Model) null);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT:
			setDependent((Model) null);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__CARD›NAL›TY:
			setCardinality(CARD›NAL›TY_EDEFAULT);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__›S_REQU›RED:
			set›sRequired(›S_REQU›RED_EDEFAULT);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME:
			setPrincipalRoleName(PR›NC›PAL_ROLE_NAME_EDEFAULT);
			return;
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME:
			setDependentRoleName(DEPENDENT_ROLE_NAME_EDEFAULT);
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
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL:
			return principal != null;
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT:
			return dependent != null;
		case RyzPackage.MODEL_ASSOC›AT›ON__CARD›NAL›TY:
			return cardinality != CARD›NAL›TY_EDEFAULT;
		case RyzPackage.MODEL_ASSOC›AT›ON__›S_REQU›RED:
			return isRequired != ›S_REQU›RED_EDEFAULT;
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME:
			return PR›NC›PAL_ROLE_NAME_EDEFAULT == null ? principalRoleName != null
					: !PR›NC›PAL_ROLE_NAME_EDEFAULT.equals(principalRoleName);
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME:
			return DEPENDENT_ROLE_NAME_EDEFAULT == null ? dependentRoleName != null
					: !DEPENDENT_ROLE_NAME_EDEFAULT.equals(dependentRoleName);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", isRequired: ");
		result.append(isRequired);
		result.append(", principalRoleName: ");
		result.append(principalRoleName);
		result.append(", dependentRoleName: ");
		result.append(dependentRoleName);
		result.append(')');
		return result.toString();
	}

} //ModelAssociationImpl
