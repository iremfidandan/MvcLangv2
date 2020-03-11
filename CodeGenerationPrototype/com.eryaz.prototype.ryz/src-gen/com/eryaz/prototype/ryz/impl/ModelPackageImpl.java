/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelAssociation;
import com.eryaz.prototype.ryz.ModelPackage;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelPackageImpl#getModels <em>Models</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.ModelPackageImpl#getModelassociations <em>Modelassociations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelPackageImpl extends ComponentPackageImpl implements ModelPackage {
	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getModelassociations() <em>Modelassociations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelassociations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelAssociation> modelassociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.MODEL_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentEList<Model>(Model.class, this, RyzPackage.MODEL_PACKAGE__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelAssociation> getModelassociations() {
		if (modelassociations == null) {
			modelassociations = new EObjectContainmentEList<ModelAssociation>(ModelAssociation.class, this,
					RyzPackage.MODEL_PACKAGE__MODELASSOCÝATÝONS);
		}
		return modelassociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.MODEL_PACKAGE__MODELS:
			return ((InternalEList<?>) getModels()).basicRemove(otherEnd, msgs);
		case RyzPackage.MODEL_PACKAGE__MODELASSOCÝATÝONS:
			return ((InternalEList<?>) getModelassociations()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.MODEL_PACKAGE__MODELS:
			return getModels();
		case RyzPackage.MODEL_PACKAGE__MODELASSOCÝATÝONS:
			return getModelassociations();
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
		case RyzPackage.MODEL_PACKAGE__MODELS:
			getModels().clear();
			getModels().addAll((Collection<? extends Model>) newValue);
			return;
		case RyzPackage.MODEL_PACKAGE__MODELASSOCÝATÝONS:
			getModelassociations().clear();
			getModelassociations().addAll((Collection<? extends ModelAssociation>) newValue);
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
		case RyzPackage.MODEL_PACKAGE__MODELS:
			getModels().clear();
			return;
		case RyzPackage.MODEL_PACKAGE__MODELASSOCÝATÝONS:
			getModelassociations().clear();
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
		case RyzPackage.MODEL_PACKAGE__MODELS:
			return models != null && !models.isEmpty();
		case RyzPackage.MODEL_PACKAGE__MODELASSOCÝATÝONS:
			return modelassociations != null && !modelassociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelPackageImpl
