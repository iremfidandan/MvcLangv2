/**
 */
package com.eryaz.prototype.ryz.provider;

import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.ViewToControllerRelation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link com.eryaz.prototype.ryz.ViewToControllerRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewToControllerRelationItemProvider extends MainComponentRelationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewToControllerRelationItemProvider(AdapterFactory adapterFactory) {
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

			addHelperforsendingrequestPropertyDescriptor(object);
			addActionmethodPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Helperforsendingrequest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHelperforsendingrequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ViewToControllerRelation_helperforsendingrequest_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ViewToControllerRelation_helperforsendingrequest_feature",
								"_UI_ViewToControllerRelation_type"),
						RyzPackage.Literals.V�EW_TO_CONTROLLER_RELAT�ON__HELPERFORSEND�NGREQUEST, true, false, true,
						null, null, null));
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
				getString("_UI_ViewToControllerRelation_actionmethod_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ViewToControllerRelation_actionmethod_feature",
						"_UI_ViewToControllerRelation_type"),
				RyzPackage.Literals.V�EW_TO_CONTROLLER_RELAT�ON__ACT�ONMETHOD, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_ViewToControllerRelation_model_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ViewToControllerRelation_model_feature",
								"_UI_ViewToControllerRelation_type"),
						RyzPackage.Literals.V�EW_TO_CONTROLLER_RELAT�ON__MODEL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ViewToControllerRelation_properties_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ViewToControllerRelation_properties_feature",
						"_UI_ViewToControllerRelation_type"),
				RyzPackage.Literals.V�EW_TO_CONTROLLER_RELAT�ON__PROPERT�ES, true, false, true, null, null, null));
	}

	/**
	 * This returns ViewToControllerRelation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewToControllerRelation"));
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
		String label = ((ViewToControllerRelation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ViewToControllerRelation_type")
				: getString("_UI_ViewToControllerRelation_type") + " " + label;
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
