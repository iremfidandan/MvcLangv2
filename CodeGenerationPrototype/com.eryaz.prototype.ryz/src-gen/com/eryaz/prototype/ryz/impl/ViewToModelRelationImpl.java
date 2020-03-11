/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.AbstractView;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelCardinality;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.ViewToModelRelation;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View To Model Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl#getAbstractview <em>Abstractview</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl#getModelcardinality <em>Modelcardinality</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewToModelRelationImpl extends MainComponentRelationImpl implements ViewToModelRelation {
	/**
	 * The cached value of the '{@link #getAbstractview() <em>Abstractview</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractview()
	 * @generated
	 * @ordered
	 */
	protected AbstractView abstractview;

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
	 * The default value of the '{@link #getModelcardinality() <em>Modelcardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelcardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ModelCardinality MODELCARD�NAL�TY_EDEFAULT = ModelCardinality.ONE;

	/**
	 * The cached value of the '{@link #getModelcardinality() <em>Modelcardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelcardinality()
	 * @generated
	 * @ordered
	 */
	protected ModelCardinality modelcardinality = MODELCARD�NAL�TY_EDEFAULT;

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
	protected ViewToModelRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.V�EW_TO_MODEL_RELAT�ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView getAbstractview() {
		if (abstractview != null && abstractview.eIsProxy()) {
			InternalEObject oldAbstractview = (InternalEObject) abstractview;
			abstractview = (AbstractView) eResolveProxy(oldAbstractview);
			if (abstractview != oldAbstractview) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.V�EW_TO_MODEL_RELAT�ON__ABSTRACTV�EW, oldAbstractview, abstractview));
			}
		}
		return abstractview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView basicGetAbstractview() {
		return abstractview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractview(AbstractView newAbstractview) {
		AbstractView oldAbstractview = abstractview;
		abstractview = newAbstractview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.V�EW_TO_MODEL_RELAT�ON__ABSTRACTV�EW,
					oldAbstractview, abstractview));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODEL,
							oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODEL, oldModel,
					model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCardinality getModelcardinality() {
		return modelcardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelcardinality(ModelCardinality newModelcardinality) {
		ModelCardinality oldModelcardinality = modelcardinality;
		modelcardinality = newModelcardinality == null ? MODELCARD�NAL�TY_EDEFAULT : newModelcardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODELCARD�NAL�TY,
					oldModelcardinality, modelcardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Property>(Property.class, this,
					RyzPackage.V�EW_TO_MODEL_RELAT�ON__PROPERT�ES);
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
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__ABSTRACTV�EW:
			if (resolve)
				return getAbstractview();
			return basicGetAbstractview();
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODELCARD�NAL�TY:
			return getModelcardinality();
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__PROPERT�ES:
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
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__ABSTRACTV�EW:
			setAbstractview((AbstractView) newValue);
			return;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODEL:
			setModel((Model) newValue);
			return;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODELCARD�NAL�TY:
			setModelcardinality((ModelCardinality) newValue);
			return;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__PROPERT�ES:
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
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__ABSTRACTV�EW:
			setAbstractview((AbstractView) null);
			return;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODEL:
			setModel((Model) null);
			return;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODELCARD�NAL�TY:
			setModelcardinality(MODELCARD�NAL�TY_EDEFAULT);
			return;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__PROPERT�ES:
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
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__ABSTRACTV�EW:
			return abstractview != null;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODEL:
			return model != null;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__MODELCARD�NAL�TY:
			return modelcardinality != MODELCARD�NAL�TY_EDEFAULT;
		case RyzPackage.V�EW_TO_MODEL_RELAT�ON__PROPERT�ES:
			return properties != null && !properties.isEmpty();
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
		result.append(" (modelcardinality: ");
		result.append(modelcardinality);
		result.append(')');
		return result.toString();
	}

} //ViewToModelRelationImpl
