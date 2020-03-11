/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.PresentationFormElement;
import com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.TableKey;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Form Element To Property Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PresentationFormElementToPropertyKeyImpl#getPresentationformelement <em>Presentationformelement</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PresentationFormElementToPropertyKeyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.PresentationFormElementToPropertyKeyImpl#getTablekey <em>Tablekey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationFormElementToPropertyKeyImpl extends MinimalEObjectImpl.Container
		implements PresentationFormElementToPropertyKey {
	/**
	 * The cached value of the '{@link #getPresentationformelement() <em>Presentationformelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationformelement()
	 * @generated
	 * @ordered
	 */
	protected PresentationFormElement presentationformelement;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The cached value of the '{@link #getTablekey() <em>Tablekey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablekey()
	 * @generated
	 * @ordered
	 */
	protected TableKey tablekey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationFormElementToPropertyKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentationFormElement getPresentationformelement() {
		if (presentationformelement != null && presentationformelement.eIsProxy()) {
			InternalEObject oldPresentationformelement = (InternalEObject) presentationformelement;
			presentationformelement = (PresentationFormElement) eResolveProxy(oldPresentationformelement);
			if (presentationformelement != oldPresentationformelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PRESENTATÝONFORMELEMENT,
							oldPresentationformelement, presentationformelement));
			}
		}
		return presentationformelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFormElement basicGetPresentationformelement() {
		return presentationformelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentationformelement(PresentationFormElement newPresentationformelement) {
		PresentationFormElement oldPresentationformelement = presentationformelement;
		presentationformelement = newPresentationformelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PRESENTATÝONFORMELEMENT,
					oldPresentationformelement, presentationformelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject) property;
			property = (Property) eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(Property newProperty) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableKey getTablekey() {
		if (tablekey != null && tablekey.eIsProxy()) {
			InternalEObject oldTablekey = (InternalEObject) tablekey;
			tablekey = (TableKey) eResolveProxy(oldTablekey);
			if (tablekey != oldTablekey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__TABLEKEY, oldTablekey, tablekey));
			}
		}
		return tablekey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableKey basicGetTablekey() {
		return tablekey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTablekey(TableKey newTablekey) {
		TableKey oldTablekey = tablekey;
		tablekey = newTablekey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__TABLEKEY, oldTablekey, tablekey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PRESENTATÝONFORMELEMENT:
			if (resolve)
				return getPresentationformelement();
			return basicGetPresentationformelement();
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PROPERTY:
			if (resolve)
				return getProperty();
			return basicGetProperty();
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__TABLEKEY:
			if (resolve)
				return getTablekey();
			return basicGetTablekey();
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
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PRESENTATÝONFORMELEMENT:
			setPresentationformelement((PresentationFormElement) newValue);
			return;
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PROPERTY:
			setProperty((Property) newValue);
			return;
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__TABLEKEY:
			setTablekey((TableKey) newValue);
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
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PRESENTATÝONFORMELEMENT:
			setPresentationformelement((PresentationFormElement) null);
			return;
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PROPERTY:
			setProperty((Property) null);
			return;
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__TABLEKEY:
			setTablekey((TableKey) null);
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
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PRESENTATÝONFORMELEMENT:
			return presentationformelement != null;
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PROPERTY:
			return property != null;
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__TABLEKEY:
			return tablekey != null;
		}
		return super.eIsSet(featureID);
	}

} //PresentationFormElementToPropertyKeyImpl
