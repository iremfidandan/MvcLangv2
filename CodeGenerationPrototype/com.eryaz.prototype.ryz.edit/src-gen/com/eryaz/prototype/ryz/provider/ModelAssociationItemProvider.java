/**
 */
package com.eryaz.prototype.ryz.provider;

import com.eryaz.prototype.ryz.ModelAssociation;
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
 * This is the item provider adapter for a {@link com.eryaz.prototype.ryz.ModelAssociation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelAssociationItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAssociationItemProvider(AdapterFactory adapterFactory) {
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

			addPrincipalPropertyDescriptor(object);
			addDependentPropertyDescriptor(object);
			addCardinalityPropertyDescriptor(object);
			add›sRequiredPropertyDescriptor(object);
			addPrincipalRoleNamePropertyDescriptor(object);
			addDependentRoleNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Principal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrincipalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModelAssociation_principal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ModelAssociation_principal_feature",
								"_UI_ModelAssociation_type"),
						RyzPackage.Literals.MODEL_ASSOC›AT›ON__PR›NC›PAL, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Dependent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModelAssociation_dependent_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ModelAssociation_dependent_feature",
								"_UI_ModelAssociation_type"),
						RyzPackage.Literals.MODEL_ASSOC›AT›ON__DEPENDENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Cardinality feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCardinalityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModelAssociation_cardinality_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ModelAssociation_cardinality_feature",
								"_UI_ModelAssociation_type"),
						RyzPackage.Literals.MODEL_ASSOC›AT›ON__CARD›NAL›TY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the ›s Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void add›sRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ModelAssociation_isRequired_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ModelAssociation_isRequired_feature",
								"_UI_ModelAssociation_type"),
						RyzPackage.Literals.MODEL_ASSOC›AT›ON__›S_REQU›RED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Principal Role Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrincipalRoleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModelAssociation_principalRoleName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ModelAssociation_principalRoleName_feature",
						"_UI_ModelAssociation_type"),
				RyzPackage.Literals.MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dependent Role Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependentRoleNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ModelAssociation_dependentRoleName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ModelAssociation_dependentRoleName_feature",
						"_UI_ModelAssociation_type"),
				RyzPackage.Literals.MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ModelAssociation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelAssociation"));
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
		String label = ((ModelAssociation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ModelAssociation_type")
				: getString("_UI_ModelAssociation_type") + " " + label;
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

		switch (notification.getFeatureID(ModelAssociation.class)) {
		case RyzPackage.MODEL_ASSOC›AT›ON__CARD›NAL›TY:
		case RyzPackage.MODEL_ASSOC›AT›ON__›S_REQU›RED:
		case RyzPackage.MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME:
		case RyzPackage.MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME:
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
