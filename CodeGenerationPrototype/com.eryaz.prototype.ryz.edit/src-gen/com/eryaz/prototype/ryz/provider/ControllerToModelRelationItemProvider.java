/**
 */
package com.eryaz.prototype.ryz.provider;

import com.eryaz.prototype.ryz.ControllerToModelRelation;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.eryaz.prototype.ryz.ControllerToModelRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllerToModelRelationItemProvider extends MainComponentRelationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerToModelRelationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addActionmethodPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addModelpropertiesPropertyDescriptor(object);
			addModelCardinalityPropertyDescriptor(object);
			addModelOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actionmethod feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionmethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ControllerToModelRelation_actionmethod_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ControllerToModelRelation_actionmethod_feature",
						"_UI_ControllerToModelRelation_type"),
				RyzPackage.Literals.CONTROLLER_TO_MODEL_RELATÝON__ACTÝONMETHOD, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ControllerToModelRelation_model_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ControllerToModelRelation_model_feature",
								"_UI_ControllerToModelRelation_type"),
						RyzPackage.Literals.CONTROLLER_TO_MODEL_RELATÝON__MODEL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Modelproperties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelpropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ControllerToModelRelation_modelproperties_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ControllerToModelRelation_modelproperties_feature",
						"_UI_ControllerToModelRelation_type"),
				RyzPackage.Literals.CONTROLLER_TO_MODEL_RELATÝON__MODELPROPERTÝES, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Model Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ControllerToModelRelation_modelCardinality_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ControllerToModelRelation_modelCardinality_feature", "_UI_ControllerToModelRelation_type"),
				RyzPackage.Literals.CONTROLLER_TO_MODEL_RELATÝON__MODEL_CARDÝNALÝTY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Model Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ControllerToModelRelation_modelOperation_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ControllerToModelRelation_modelOperation_feature",
						"_UI_ControllerToModelRelation_type"),
				RyzPackage.Literals.CONTROLLER_TO_MODEL_RELATÝON__MODEL_OPERATÝON, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ControllerToModelRelation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControllerToModelRelation"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ControllerToModelRelation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ControllerToModelRelation_type")
				: getString("_UI_ControllerToModelRelation_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ControllerToModelRelation.class)) {
		case RyzPackage.CONTROLLER_TO_MODEL_RELATÝON__MODEL_CARDÝNALÝTY:
		case RyzPackage.CONTROLLER_TO_MODEL_RELATÝON__MODEL_OPERATÝON:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
