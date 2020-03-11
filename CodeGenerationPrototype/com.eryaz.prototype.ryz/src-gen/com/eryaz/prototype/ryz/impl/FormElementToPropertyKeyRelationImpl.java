/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation;
import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey;
import com.eryaz.prototype.ryz.RyzPackage;

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
 * An implementation of the model object '<em><b>Form Element To Property Key Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.FormElementToPropertyKeyRelationImpl#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.FormElementToPropertyKeyRelationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.FormElementToPropertyKeyRelationImpl#getPresentationformelementtoproperty <em>Presentationformelementtoproperty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormElementToPropertyKeyRelationImpl extends MainComponentRelationImpl
		implements FormElementToPropertyKeyRelation {
	/**
	 * The cached value of the '{@link #getHelperforsendingrequest() <em>Helperforsendingrequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelperforsendingrequest()
	 * @generated
	 * @ordered
	 */
	protected HelperForSendingRequest helperforsendingrequest;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getPresentationformelementtoproperty() <em>Presentationformelementtoproperty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationformelementtoproperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PresentationFormElementToPropertyKey> presentationformelementtoproperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormElementToPropertyKeyRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HelperForSendingRequest getHelperforsendingrequest() {
		if (helperforsendingrequest != null && helperforsendingrequest.eIsProxy()) {
			InternalEObject oldHelperforsendingrequest = (InternalEObject) helperforsendingrequest;
			helperforsendingrequest = (HelperForSendingRequest) eResolveProxy(oldHelperforsendingrequest);
			if (helperforsendingrequest != oldHelperforsendingrequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__HELPERFORSENDÝNGREQUEST,
							oldHelperforsendingrequest, helperforsendingrequest));
			}
		}
		return helperforsendingrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperForSendingRequest basicGetHelperforsendingrequest() {
		return helperforsendingrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHelperforsendingrequest(HelperForSendingRequest newHelperforsendingrequest) {
		HelperForSendingRequest oldHelperforsendingrequest = helperforsendingrequest;
		helperforsendingrequest = newHelperforsendingrequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__HELPERFORSENDÝNGREQUEST,
					oldHelperforsendingrequest, helperforsendingrequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject) model;
			model = (Model) eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PresentationFormElementToPropertyKey> getPresentationformelementtoproperty() {
		if (presentationformelementtoproperty == null) {
			presentationformelementtoproperty = new EObjectContainmentEList<PresentationFormElementToPropertyKey>(
					PresentationFormElementToPropertyKey.class, this,
					RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__PRESENTATÝONFORMELEMENTTOPROPERTY);
		}
		return presentationformelementtoproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__PRESENTATÝONFORMELEMENTTOPROPERTY:
			return ((InternalEList<?>) getPresentationformelementtoproperty()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__HELPERFORSENDÝNGREQUEST:
			if (resolve)
				return getHelperforsendingrequest();
			return basicGetHelperforsendingrequest();
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__PRESENTATÝONFORMELEMENTTOPROPERTY:
			return getPresentationformelementtoproperty();
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
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__HELPERFORSENDÝNGREQUEST:
			setHelperforsendingrequest((HelperForSendingRequest) newValue);
			return;
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__MODEL:
			setModel((Model) newValue);
			return;
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__PRESENTATÝONFORMELEMENTTOPROPERTY:
			getPresentationformelementtoproperty().clear();
			getPresentationformelementtoproperty()
					.addAll((Collection<? extends PresentationFormElementToPropertyKey>) newValue);
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
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__HELPERFORSENDÝNGREQUEST:
			setHelperforsendingrequest((HelperForSendingRequest) null);
			return;
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__MODEL:
			setModel((Model) null);
			return;
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__PRESENTATÝONFORMELEMENTTOPROPERTY:
			getPresentationformelementtoproperty().clear();
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
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__HELPERFORSENDÝNGREQUEST:
			return helperforsendingrequest != null;
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__MODEL:
			return model != null;
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__PRESENTATÝONFORMELEMENTTOPROPERTY:
			return presentationformelementtoproperty != null && !presentationformelementtoproperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormElementToPropertyKeyRelationImpl
