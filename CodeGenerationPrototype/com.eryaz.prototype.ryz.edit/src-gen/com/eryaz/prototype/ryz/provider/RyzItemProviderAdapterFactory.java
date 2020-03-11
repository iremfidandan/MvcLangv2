/**
 */
package com.eryaz.prototype.ryz.provider;

import com.eryaz.prototype.ryz.util.RyzAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RyzItemProviderAdapterFactory extends RyzAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RyzItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Project} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectItemProvider projectItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectAdapter() {
		if (projectItemProvider == null) {
			projectItemProvider = new ProjectItemProvider(this);
		}

		return projectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.MvcPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MvcPackageItemProvider mvcPackageItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.MvcPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMvcPackageAdapter() {
		if (mvcPackageItemProvider == null) {
			mvcPackageItemProvider = new MvcPackageItemProvider(this);
		}

		return mvcPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ModelPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelPackageItemProvider modelPackageItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelPackageAdapter() {
		if (modelPackageItemProvider == null) {
			modelPackageItemProvider = new ModelPackageItemProvider(this);
		}

		return modelPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ViewPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewPackageItemProvider viewPackageItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ViewPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewPackageAdapter() {
		if (viewPackageItemProvider == null) {
			viewPackageItemProvider = new ViewPackageItemProvider(this);
		}

		return viewPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ControllerPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerPackageItemProvider controllerPackageItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ControllerPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerPackageAdapter() {
		if (controllerPackageItemProvider == null) {
			controllerPackageItemProvider = new ControllerPackageItemProvider(this);
		}

		return controllerPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Model} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelItemProvider modelItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAdapter() {
		if (modelItemProvider == null) {
			modelItemProvider = new ModelItemProvider(this);
		}

		return modelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Controller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerItemProvider controllerItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerAdapter() {
		if (controllerItemProvider == null) {
			controllerItemProvider = new ControllerItemProvider(this);
		}

		return controllerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ModelAssociation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAssociationItemProvider modelAssociationItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ModelAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelAssociationAdapter() {
		if (modelAssociationItemProvider == null) {
			modelAssociationItemProvider = new ModelAssociationItemProvider(this);
		}

		return modelAssociationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Partial} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialItemProvider partialItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Partial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPartialAdapter() {
		if (partialItemProvider == null) {
			partialItemProvider = new PartialItemProvider(this);
		}

		return partialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ActionMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionMethodItemProvider actionMethodItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ActionMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionMethodAdapter() {
		if (actionMethodItemProvider == null) {
			actionMethodItemProvider = new ActionMethodItemProvider(this);
		}

		return actionMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Layout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutItemProvider layoutItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Layout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayoutAdapter() {
		if (layoutItemProvider == null) {
			layoutItemProvider = new LayoutItemProvider(this);
		}

		return layoutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.View} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewItemProvider viewItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.View}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewAdapter() {
		if (viewItemProvider == null) {
			viewItemProvider = new ViewItemProvider(this);
		}

		return viewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ViewToControllerRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewToControllerRelationItemProvider viewToControllerRelationItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ViewToControllerRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewToControllerRelationAdapter() {
		if (viewToControllerRelationItemProvider == null) {
			viewToControllerRelationItemProvider = new ViewToControllerRelationItemProvider(this);
		}

		return viewToControllerRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ControllerToModelRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerToModelRelationItemProvider controllerToModelRelationItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ControllerToModelRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerToModelRelationAdapter() {
		if (controllerToModelRelationItemProvider == null) {
			controllerToModelRelationItemProvider = new ControllerToModelRelationItemProvider(this);
		}

		return controllerToModelRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ActionLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionLinkItemProvider actionLinkItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ActionLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionLinkAdapter() {
		if (actionLinkItemProvider == null) {
			actionLinkItemProvider = new ActionLinkItemProvider(this);
		}

		return actionLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Form} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormItemProvider formItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormAdapter() {
		if (formItemProvider == null) {
			formItemProvider = new FormItemProvider(this);
		}

		return formItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ControllerToViewRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerToViewRelationItemProvider controllerToViewRelationItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ControllerToViewRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllerToViewRelationAdapter() {
		if (controllerToViewRelationItemProvider == null) {
			controllerToViewRelationItemProvider = new ControllerToViewRelationItemProvider(this);
		}

		return controllerToViewRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.TableKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableKeyItemProvider tableKeyItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.TableKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableKeyAdapter() {
		if (tableKeyItemProvider == null) {
			tableKeyItemProvider = new TableKeyItemProvider(this);
		}

		return tableKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.ViewToModelRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewToModelRelationItemProvider viewToModelRelationItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.ViewToModelRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewToModelRelationAdapter() {
		if (viewToModelRelationItemProvider == null) {
			viewToModelRelationItemProvider = new ViewToModelRelationItemProvider(this);
		}

		return viewToModelRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.UseCaseActorPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseActorPackageItemProvider useCaseActorPackageItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.UseCaseActorPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseCaseActorPackageAdapter() {
		if (useCaseActorPackageItemProvider == null) {
			useCaseActorPackageItemProvider = new UseCaseActorPackageItemProvider(this);
		}

		return useCaseActorPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Actor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider actorItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.UseCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseItemProvider useCaseItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseCaseAdapter() {
		if (useCaseItemProvider == null) {
			useCaseItemProvider = new UseCaseItemProvider(this);
		}

		return useCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.UseCasePackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCasePackageItemProvider useCasePackageItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.UseCasePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUseCasePackageAdapter() {
		if (useCasePackageItemProvider == null) {
			useCasePackageItemProvider = new UseCasePackageItemProvider(this);
		}

		return useCasePackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.PresentationForm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationFormItemProvider presentationFormItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.PresentationForm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresentationFormAdapter() {
		if (presentationFormItemProvider == null) {
			presentationFormItemProvider = new PresentationFormItemProvider(this);
		}

		return presentationFormItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.MultipleChoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceItemProvider multipleChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.MultipleChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultipleChoiceAdapter() {
		if (multipleChoiceItemProvider == null) {
			multipleChoiceItemProvider = new MultipleChoiceItemProvider(this);
		}

		return multipleChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Choice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceItemProvider choiceItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceAdapter() {
		if (choiceItemProvider == null) {
			choiceItemProvider = new ChoiceItemProvider(this);
		}

		return choiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider �nputItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (�nputItemProvider == null) {
			�nputItemProvider = new InputItemProvider(this);
		}

		return �nputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Table} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableItemProvider tableItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Table}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTableAdapter() {
		if (tableItemProvider == null) {
			tableItemProvider = new TableItemProvider(this);
		}

		return tableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.Header} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderItemProvider headerItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.Header}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeaderAdapter() {
		if (headerItemProvider == null) {
			headerItemProvider = new HeaderItemProvider(this);
		}

		return headerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormElementToPropertyKeyRelationItemProvider formElementToPropertyKeyRelationItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormElementToPropertyKeyRelationAdapter() {
		if (formElementToPropertyKeyRelationItemProvider == null) {
			formElementToPropertyKeyRelationItemProvider = new FormElementToPropertyKeyRelationItemProvider(this);
		}

		return formElementToPropertyKeyRelationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationFormElementToPropertyKeyItemProvider presentationFormElementToPropertyKeyItemProvider;

	/**
	 * This creates an adapter for a {@link com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresentationFormElementToPropertyKeyAdapter() {
		if (presentationFormElementToPropertyKeyItemProvider == null) {
			presentationFormElementToPropertyKeyItemProvider = new PresentationFormElementToPropertyKeyItemProvider(
					this);
		}

		return presentationFormElementToPropertyKeyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (projectItemProvider != null)
			projectItemProvider.dispose();
		if (mvcPackageItemProvider != null)
			mvcPackageItemProvider.dispose();
		if (modelPackageItemProvider != null)
			modelPackageItemProvider.dispose();
		if (viewPackageItemProvider != null)
			viewPackageItemProvider.dispose();
		if (controllerPackageItemProvider != null)
			controllerPackageItemProvider.dispose();
		if (modelItemProvider != null)
			modelItemProvider.dispose();
		if (controllerItemProvider != null)
			controllerItemProvider.dispose();
		if (propertyItemProvider != null)
			propertyItemProvider.dispose();
		if (modelAssociationItemProvider != null)
			modelAssociationItemProvider.dispose();
		if (partialItemProvider != null)
			partialItemProvider.dispose();
		if (actionMethodItemProvider != null)
			actionMethodItemProvider.dispose();
		if (layoutItemProvider != null)
			layoutItemProvider.dispose();
		if (viewItemProvider != null)
			viewItemProvider.dispose();
		if (parameterItemProvider != null)
			parameterItemProvider.dispose();
		if (viewToControllerRelationItemProvider != null)
			viewToControllerRelationItemProvider.dispose();
		if (controllerToModelRelationItemProvider != null)
			controllerToModelRelationItemProvider.dispose();
		if (actionLinkItemProvider != null)
			actionLinkItemProvider.dispose();
		if (formItemProvider != null)
			formItemProvider.dispose();
		if (controllerToViewRelationItemProvider != null)
			controllerToViewRelationItemProvider.dispose();
		if (tableKeyItemProvider != null)
			tableKeyItemProvider.dispose();
		if (viewToModelRelationItemProvider != null)
			viewToModelRelationItemProvider.dispose();
		if (useCaseActorPackageItemProvider != null)
			useCaseActorPackageItemProvider.dispose();
		if (actorItemProvider != null)
			actorItemProvider.dispose();
		if (useCaseItemProvider != null)
			useCaseItemProvider.dispose();
		if (useCasePackageItemProvider != null)
			useCasePackageItemProvider.dispose();
		if (presentationFormItemProvider != null)
			presentationFormItemProvider.dispose();
		if (multipleChoiceItemProvider != null)
			multipleChoiceItemProvider.dispose();
		if (choiceItemProvider != null)
			choiceItemProvider.dispose();
		if (buttonItemProvider != null)
			buttonItemProvider.dispose();
		if (�nputItemProvider != null)
			�nputItemProvider.dispose();
		if (linkItemProvider != null)
			linkItemProvider.dispose();
		if (tableItemProvider != null)
			tableItemProvider.dispose();
		if (headerItemProvider != null)
			headerItemProvider.dispose();
		if (formElementToPropertyKeyRelationItemProvider != null)
			formElementToPropertyKeyRelationItemProvider.dispose();
		if (presentationFormElementToPropertyKeyItemProvider != null)
			presentationFormElementToPropertyKeyItemProvider.dispose();
	}

}