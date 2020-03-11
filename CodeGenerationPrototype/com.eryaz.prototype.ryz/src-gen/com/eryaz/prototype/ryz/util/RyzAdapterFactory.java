/**
 */
package com.eryaz.prototype.ryz.util;

import com.eryaz.prototype.ryz.AbstractView;
import com.eryaz.prototype.ryz.ActionLink;
import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.ComponentPackage;
import com.eryaz.prototype.ryz.Controller;
import com.eryaz.prototype.ryz.ControllerPackage;
import com.eryaz.prototype.ryz.ControllerToModelRelation;
import com.eryaz.prototype.ryz.ControllerToViewRelation;
import com.eryaz.prototype.ryz.Form;
import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.HtmlElement;
import com.eryaz.prototype.ryz.Layout;
import com.eryaz.prototype.ryz.MainComponent;
import com.eryaz.prototype.ryz.MainComponentRelation;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelAssociation;
import com.eryaz.prototype.ryz.ModelPackage;
import com.eryaz.prototype.ryz.MvcPackage;
import com.eryaz.prototype.ryz.NamedElement;
import com.eryaz.prototype.ryz.Parameter;
import com.eryaz.prototype.ryz.Partial;
import com.eryaz.prototype.ryz.Project;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.TableKey;
import com.eryaz.prototype.ryz.View;
import com.eryaz.prototype.ryz.ViewPackage;
import com.eryaz.prototype.ryz.ViewToControllerRelation;

import com.eryaz.prototype.ryz.ViewToModelRelation;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.eryaz.prototype.ryz.RyzPackage
 * @generated
 */
public class RyzAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RyzPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RyzAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RyzPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RyzSwitch<Adapter> modelSwitch = new RyzSwitch<Adapter>() {
		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter casePackage(com.eryaz.prototype.ryz.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseComponentPackage(ComponentPackage object) {
			return createComponentPackageAdapter();
		}

		@Override
		public Adapter caseMvcPackage(MvcPackage object) {
			return createMvcPackageAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseModelPackage(ModelPackage object) {
			return createModelPackageAdapter();
		}

		@Override
		public Adapter caseViewPackage(ViewPackage object) {
			return createViewPackageAdapter();
		}

		@Override
		public Adapter caseControllerPackage(ControllerPackage object) {
			return createControllerPackageAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseAbstractView(AbstractView object) {
			return createAbstractViewAdapter();
		}

		@Override
		public Adapter caseController(Controller object) {
			return createControllerAdapter();
		}

		@Override
		public Adapter caseMainComponent(MainComponent object) {
			return createMainComponentAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseModelAssociation(ModelAssociation object) {
			return createModelAssociationAdapter();
		}

		@Override
		public Adapter casePartial(Partial object) {
			return createPartialAdapter();
		}

		@Override
		public Adapter caseActionMethod(ActionMethod object) {
			return createActionMethodAdapter();
		}

		@Override
		public Adapter caseLayout(Layout object) {
			return createLayoutAdapter();
		}

		@Override
		public Adapter caseView(View object) {
			return createViewAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseMainComponentRelation(MainComponentRelation object) {
			return createMainComponentRelationAdapter();
		}

		@Override
		public Adapter caseViewToControllerRelation(ViewToControllerRelation object) {
			return createViewToControllerRelationAdapter();
		}

		@Override
		public Adapter caseControllerToModelRelation(ControllerToModelRelation object) {
			return createControllerToModelRelationAdapter();
		}

		@Override
		public Adapter caseHtmlElement(HtmlElement object) {
			return createHtmlElementAdapter();
		}

		@Override
		public Adapter caseActionLink(ActionLink object) {
			return createActionLinkAdapter();
		}

		@Override
		public Adapter caseForm(Form object) {
			return createFormAdapter();
		}

		@Override
		public Adapter caseHelperForSendingRequest(HelperForSendingRequest object) {
			return createHelperForSendingRequestAdapter();
		}

		@Override
		public Adapter caseControllerToViewRelation(ControllerToViewRelation object) {
			return createControllerToViewRelationAdapter();
		}

		@Override
		public Adapter caseTableKey(TableKey object) {
			return createTableKeyAdapter();
		}

		@Override
		public Adapter caseViewToModelRelation(ViewToModelRelation object) {
			return createViewToModelRelationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ComponentPackage <em>Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ComponentPackage
	 * @generated
	 */
	public Adapter createComponentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.MvcPackage <em>Mvc Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.MvcPackage
	 * @generated
	 */
	public Adapter createMvcPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ModelPackage <em>Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ModelPackage
	 * @generated
	 */
	public Adapter createModelPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ViewPackage <em>View Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ViewPackage
	 * @generated
	 */
	public Adapter createViewPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ControllerPackage <em>Controller Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ControllerPackage
	 * @generated
	 */
	public Adapter createControllerPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.AbstractView
	 * @generated
	 */
	public Adapter createAbstractViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.MainComponent <em>Main Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.MainComponent
	 * @generated
	 */
	public Adapter createMainComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ModelAssociation <em>Model Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ModelAssociation
	 * @generated
	 */
	public Adapter createModelAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Partial <em>Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Partial
	 * @generated
	 */
	public Adapter createPartialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ActionMethod <em>Action Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ActionMethod
	 * @generated
	 */
	public Adapter createActionMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.MainComponentRelation <em>Main Component Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.MainComponentRelation
	 * @generated
	 */
	public Adapter createMainComponentRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ViewToControllerRelation <em>View To Controller Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ViewToControllerRelation
	 * @generated
	 */
	public Adapter createViewToControllerRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ControllerToModelRelation <em>Controller To Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ControllerToModelRelation
	 * @generated
	 */
	public Adapter createControllerToModelRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.HtmlElement <em>Html Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.HtmlElement
	 * @generated
	 */
	public Adapter createHtmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ActionLink
	 * @generated
	 */
	public Adapter createActionLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.HelperForSendingRequest <em>Helper For Sending Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.HelperForSendingRequest
	 * @generated
	 */
	public Adapter createHelperForSendingRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ControllerToViewRelation <em>Controller To View Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ControllerToViewRelation
	 * @generated
	 */
	public Adapter createControllerToViewRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.TableKey <em>Table Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.TableKey
	 * @generated
	 */
	public Adapter createTableKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.eryaz.prototype.ryz.ViewToModelRelation <em>View To Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.eryaz.prototype.ryz.ViewToModelRelation
	 * @generated
	 */
	public Adapter createViewToModelRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RyzAdapterFactory
