/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.ViewToControllerRelation;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View To Controller Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl#getActionmethod <em>Actionmethod</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewToControllerRelationImpl extends MainComponentRelationImpl implements ViewToControllerRelation {
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
	 * The cached value of the '{@link #getActionmethod() <em>Actionmethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionmethod()
	 * @generated
	 * @ordered
	 */
	protected ActionMethod actionmethod;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewToControllerRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.VÝEW_TO_CONTROLLER_RELATÝON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperForSendingRequest getHelperforsendingrequest() {
		if (helperforsendingrequest != null && helperforsendingrequest.eIsProxy()) {
			InternalEObject oldHelperforsendingrequest = (InternalEObject) helperforsendingrequest;
			helperforsendingrequest = (HelperForSendingRequest) eResolveProxy(oldHelperforsendingrequest);
			if (helperforsendingrequest != oldHelperforsendingrequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__HELPERFORSENDÝNGREQUEST, oldHelperforsendingrequest,
							helperforsendingrequest));
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
	public void setHelperforsendingrequest(HelperForSendingRequest newHelperforsendingrequest) {
		HelperForSendingRequest oldHelperforsendingrequest = helperforsendingrequest;
		helperforsendingrequest = newHelperforsendingrequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__HELPERFORSENDÝNGREQUEST, oldHelperforsendingrequest,
					helperforsendingrequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMethod getActionmethod() {
		if (actionmethod != null && actionmethod.eIsProxy()) {
			InternalEObject oldActionmethod = (InternalEObject) actionmethod;
			actionmethod = (ActionMethod) eResolveProxy(oldActionmethod);
			if (actionmethod != oldActionmethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__ACTÝONMETHOD, oldActionmethod, actionmethod));
			}
		}
		return actionmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMethod basicGetActionmethod() {
		return actionmethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionmethod(ActionMethod newActionmethod) {
		ActionMethod oldActionmethod = actionmethod;
		actionmethod = newActionmethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__ACTÝONMETHOD,
					oldActionmethod, actionmethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject) model;
			model = (Model) eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__MODEL, oldModel, model));
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
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__MODEL,
					oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Property>(Property.class, this,
					RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__PROPERTÝES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__HELPERFORSENDÝNGREQUEST:
			if (resolve)
				return getHelperforsendingrequest();
			return basicGetHelperforsendingrequest();
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__ACTÝONMETHOD:
			if (resolve)
				return getActionmethod();
			return basicGetActionmethod();
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__PROPERTÝES:
			return getProperties();
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
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__HELPERFORSENDÝNGREQUEST:
			setHelperforsendingrequest((HelperForSendingRequest) newValue);
			return;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__ACTÝONMETHOD:
			setActionmethod((ActionMethod) newValue);
			return;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__MODEL:
			setModel((Model) newValue);
			return;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__PROPERTÝES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Property>) newValue);
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
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__HELPERFORSENDÝNGREQUEST:
			setHelperforsendingrequest((HelperForSendingRequest) null);
			return;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__ACTÝONMETHOD:
			setActionmethod((ActionMethod) null);
			return;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__MODEL:
			setModel((Model) null);
			return;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__PROPERTÝES:
			getProperties().clear();
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
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__HELPERFORSENDÝNGREQUEST:
			return helperforsendingrequest != null;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__ACTÝONMETHOD:
			return actionmethod != null;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__MODEL:
			return model != null;
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON__PROPERTÝES:
			return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewToControllerRelationImpl
