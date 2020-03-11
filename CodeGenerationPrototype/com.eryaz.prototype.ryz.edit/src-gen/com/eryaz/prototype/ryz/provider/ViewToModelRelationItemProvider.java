/**
 */
package com.eryaz.prototype.ryz.provider;

import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.ViewToModelRelation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.eryaz.prototype.ryz.ViewToModelRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewToModelRelationItemProvider extends MainComponentRelationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewToModelRelationItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractviewPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addModelcardinalityPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstractview feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractviewPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ViewToModelRelation_abstractview_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ViewToModelRelation_abstractview_feature",
								"_UI_ViewToModelRelation_type"),
						RyzPackage.Literals.VÝEW_TO_MODEL_RELATÝON__ABSTRACTVÝEW, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_ViewToModelRelation_model_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ViewToModelRelation_model_feature",
								"_UI_ViewToModelRelation_type"),
						RyzPackage.Literals.VÝEW_TO_MODEL_RELATÝON__MODEL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Modelcardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelcardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ViewToModelRelation_modelcardinality_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ViewToModelRelation_modelcardinality_feature",
						"_UI_ViewToModelRelation_type"),
				RyzPackage.Literals.VÝEW_TO_MODEL_RELATÝON__MODELCARDÝNALÝTY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ViewToModelRelation_properties_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ViewToModelRelation_properties_feature",
								"_UI_ViewToModelRelation_type"),
						RyzPackage.Literals.VÝEW_TO_MODEL_RELATÝON__PROPERTÝES, true, false, true, null, null, null));
	}

	/**
	 * This returns ViewToModelRelation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewToModelRelation"));
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
		String label = ((ViewToModelRelation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ViewToModelRelation_type")
				: getString("_UI_ViewToModelRelation_type") + " " + label;
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

		switch (notification.getFeatureID(ViewToModelRelation.class)) {
		case RyzPackage.VÝEW_TO_MODEL_RELATÝON__MODELCARDÝNALÝTY:
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
