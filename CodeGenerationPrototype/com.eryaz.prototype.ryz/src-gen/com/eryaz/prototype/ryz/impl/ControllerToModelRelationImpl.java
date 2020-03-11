/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.ControllerToModelRelation;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelCardinality;
import com.eryaz.prototype.ryz.ModelOperation;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller To Model Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl#getActionmethod <em>Actionmethod</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl#getModelproperties <em>Modelproperties</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl#getModelCardinality <em>Model Cardinality</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl#getModelOperation <em>Model Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerToModelRelationImpl extends MainComponentRelationImpl implements ControllerToModelRelation {
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
	 * The cached value of the '{@link #getModelproperties() <em>Modelproperties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> modelproperties;

	/**
	 * The default value of the '{@link #getModelCardinality() <em>Model Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final ModelCardinality MODEL_CARD�NAL�TY_EDEFAULT = ModelCardinality.ONE;

	/**
	 * The cached value of the '{@link #getModelCardinality() <em>Model Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelCardinality()
	 * @generated
	 * @ordered
	 */
	protected ModelCardinality modelCardinality = MODEL_CARD�NAL�TY_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelOperation() <em>Model Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ModelOperation MODEL_OPERAT�ON_EDEFAULT = ModelOperation.CREATE;

	/**
	 * The cached value of the '{@link #getModelOperation() <em>Model Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelOperation()
	 * @generated
	 * @ordered
	 */
	protected ModelOperation modelOperation = MODEL_OPERAT�ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerToModelRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.CONTROLLER_TO_MODEL_RELAT�ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionMethod getActionmethod() {
		if (actionmethod != null && actionmethod.eIsProxy()) {
			InternalEObject oldActionmethod = (InternalEObject) actionmethod;
			actionmethod = (ActionMethod) eResolveProxy(oldActionmethod);
			if (actionmethod != oldActionmethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__ACT�ONMETHOD, oldActionmethod, actionmethod));
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
	@Override
	public void setActionmethod(ActionMethod newActionmethod) {
		ActionMethod oldActionmethod = actionmethod;
		actionmethod = newActionmethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__ACT�ONMETHOD,
					oldActionmethod, actionmethod));
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
							RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL,
					oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getModelproperties() {
		if (modelproperties == null) {
			modelproperties = new EObjectResolvingEList<Property>(Property.class, this,
					RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODELPROPERT�ES);
		}
		return modelproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelCardinality getModelCardinality() {
		return modelCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelCardinality(ModelCardinality newModelCardinality) {
		ModelCardinality oldModelCardinality = modelCardinality;
		modelCardinality = newModelCardinality == null ? MODEL_CARD�NAL�TY_EDEFAULT : newModelCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_CARD�NAL�TY, oldModelCardinality, modelCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelOperation getModelOperation() {
		return modelOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelOperation(ModelOperation newModelOperation) {
		ModelOperation oldModelOperation = modelOperation;
		modelOperation = newModelOperation == null ? MODEL_OPERAT�ON_EDEFAULT : newModelOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_OPERAT�ON, oldModelOperation, modelOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__ACT�ONMETHOD:
			if (resolve)
				return getActionmethod();
			return basicGetActionmethod();
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODELPROPERT�ES:
			return getModelproperties();
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_CARD�NAL�TY:
			return getModelCardinality();
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_OPERAT�ON:
			return getModelOperation();
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
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__ACT�ONMETHOD:
			setActionmethod((ActionMethod) newValue);
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL:
			setModel((Model) newValue);
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODELPROPERT�ES:
			getModelproperties().clear();
			getModelproperties().addAll((Collection<? extends Property>) newValue);
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_CARD�NAL�TY:
			setModelCardinality((ModelCardinality) newValue);
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_OPERAT�ON:
			setModelOperation((ModelOperation) newValue);
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
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__ACT�ONMETHOD:
			setActionmethod((ActionMethod) null);
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL:
			setModel((Model) null);
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODELPROPERT�ES:
			getModelproperties().clear();
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_CARD�NAL�TY:
			setModelCardinality(MODEL_CARD�NAL�TY_EDEFAULT);
			return;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_OPERAT�ON:
			setModelOperation(MODEL_OPERAT�ON_EDEFAULT);
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
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__ACT�ONMETHOD:
			return actionmethod != null;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL:
			return model != null;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODELPROPERT�ES:
			return modelproperties != null && !modelproperties.isEmpty();
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_CARD�NAL�TY:
			return modelCardinality != MODEL_CARD�NAL�TY_EDEFAULT;
		case RyzPackage.CONTROLLER_TO_MODEL_RELAT�ON__MODEL_OPERAT�ON:
			return modelOperation != MODEL_OPERAT�ON_EDEFAULT;
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
		result.append(" (modelCardinality: ");
		result.append(modelCardinality);
		result.append(", modelOperation: ");
		result.append(modelOperation);
		result.append(')');
		return result.toString();
	}

} //ControllerToModelRelationImpl
