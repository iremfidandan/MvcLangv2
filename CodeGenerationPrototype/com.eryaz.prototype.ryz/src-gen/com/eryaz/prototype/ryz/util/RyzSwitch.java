/**
 */
package com.eryaz.prototype.ryz.util;

import com.eryaz.prototype.ryz.AbstractView;
import com.eryaz.prototype.ryz.ActionLink;
import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.Actor;
import com.eryaz.prototype.ryz.Button;
import com.eryaz.prototype.ryz.Choice;
import com.eryaz.prototype.ryz.ComponentPackage;
import com.eryaz.prototype.ryz.Controller;
import com.eryaz.prototype.ryz.ControllerPackage;
import com.eryaz.prototype.ryz.ControllerToModelRelation;
import com.eryaz.prototype.ryz.ControllerToViewRelation;
import com.eryaz.prototype.ryz.Form;
import com.eryaz.prototype.ryz.FormElementToPropertyKeyRelation;
import com.eryaz.prototype.ryz.Header;
import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.Input;
import com.eryaz.prototype.ryz.Layout;
import com.eryaz.prototype.ryz.Link;
import com.eryaz.prototype.ryz.MainComponent;
import com.eryaz.prototype.ryz.MainComponentRelation;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelAssociation;
import com.eryaz.prototype.ryz.ModelPackage;
import com.eryaz.prototype.ryz.MultipleChoice;
import com.eryaz.prototype.ryz.MvcPackage;
import com.eryaz.prototype.ryz.NamedElement;
import com.eryaz.prototype.ryz.Parameter;
import com.eryaz.prototype.ryz.Partial;
import com.eryaz.prototype.ryz.PresentationElement;
import com.eryaz.prototype.ryz.PresentationForm;
import com.eryaz.prototype.ryz.PresentationFormElement;
import com.eryaz.prototype.ryz.PresentationFormElementToPropertyKey;
import com.eryaz.prototype.ryz.Project;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.Table;
import com.eryaz.prototype.ryz.TableKey;
import com.eryaz.prototype.ryz.UseCase;
import com.eryaz.prototype.ryz.UseCaseActorPackage;
import com.eryaz.prototype.ryz.UseCasePackage;
import com.eryaz.prototype.ryz.View;
import com.eryaz.prototype.ryz.ViewPackage;
import com.eryaz.prototype.ryz.ViewToControllerRelation;
import com.eryaz.prototype.ryz.ViewToModelRelation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.eryaz.prototype.ryz.RyzPackage
 * @generated
 */
public class RyzSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RyzPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RyzSwitch() {
		if (modelPackage == null) {
			modelPackage = RyzPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RyzPackage.PROJECT: {
			Project project = (Project) theEObject;
			T result = caseProject(project);
			if (result == null)
				result = caseNamedElement(project);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PACKAGE: {
			com.eryaz.prototype.ryz.Package package_ = (com.eryaz.prototype.ryz.Package) theEObject;
			T result = casePackage(package_);
			if (result == null)
				result = caseNamedElement(package_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.COMPONENT_PACKAGE: {
			ComponentPackage componentPackage = (ComponentPackage) theEObject;
			T result = caseComponentPackage(componentPackage);
			if (result == null)
				result = casePackage(componentPackage);
			if (result == null)
				result = caseNamedElement(componentPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.MVC_PACKAGE: {
			MvcPackage mvcPackage = (MvcPackage) theEObject;
			T result = caseMvcPackage(mvcPackage);
			if (result == null)
				result = casePackage(mvcPackage);
			if (result == null)
				result = caseNamedElement(mvcPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.MODEL_PACKAGE: {
			ModelPackage modelPackage = (ModelPackage) theEObject;
			T result = caseModelPackage(modelPackage);
			if (result == null)
				result = caseComponentPackage(modelPackage);
			if (result == null)
				result = casePackage(modelPackage);
			if (result == null)
				result = caseNamedElement(modelPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.VÝEW_PACKAGE: {
			ViewPackage viewPackage = (ViewPackage) theEObject;
			T result = caseViewPackage(viewPackage);
			if (result == null)
				result = caseComponentPackage(viewPackage);
			if (result == null)
				result = casePackage(viewPackage);
			if (result == null)
				result = caseNamedElement(viewPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.CONTROLLER_PACKAGE: {
			ControllerPackage controllerPackage = (ControllerPackage) theEObject;
			T result = caseControllerPackage(controllerPackage);
			if (result == null)
				result = caseComponentPackage(controllerPackage);
			if (result == null)
				result = casePackage(controllerPackage);
			if (result == null)
				result = caseNamedElement(controllerPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = caseMainComponent(model);
			if (result == null)
				result = caseNamedElement(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.ABSTRACT_VÝEW: {
			AbstractView abstractView = (AbstractView) theEObject;
			T result = caseAbstractView(abstractView);
			if (result == null)
				result = caseMainComponent(abstractView);
			if (result == null)
				result = caseNamedElement(abstractView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.CONTROLLER: {
			Controller controller = (Controller) theEObject;
			T result = caseController(controller);
			if (result == null)
				result = caseMainComponent(controller);
			if (result == null)
				result = caseNamedElement(controller);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.MAÝN_COMPONENT: {
			MainComponent mainComponent = (MainComponent) theEObject;
			T result = caseMainComponent(mainComponent);
			if (result == null)
				result = caseNamedElement(mainComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = caseNamedElement(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.MODEL_ASSOCÝATÝON: {
			ModelAssociation modelAssociation = (ModelAssociation) theEObject;
			T result = caseModelAssociation(modelAssociation);
			if (result == null)
				result = caseNamedElement(modelAssociation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PARTÝAL: {
			Partial partial = (Partial) theEObject;
			T result = casePartial(partial);
			if (result == null)
				result = caseAbstractView(partial);
			if (result == null)
				result = caseMainComponent(partial);
			if (result == null)
				result = caseNamedElement(partial);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.ACTÝON_METHOD: {
			ActionMethod actionMethod = (ActionMethod) theEObject;
			T result = caseActionMethod(actionMethod);
			if (result == null)
				result = caseNamedElement(actionMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.LAYOUT: {
			Layout layout = (Layout) theEObject;
			T result = caseLayout(layout);
			if (result == null)
				result = caseAbstractView(layout);
			if (result == null)
				result = caseMainComponent(layout);
			if (result == null)
				result = caseNamedElement(layout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.VÝEW: {
			View view = (View) theEObject;
			T result = caseView(view);
			if (result == null)
				result = caseAbstractView(view);
			if (result == null)
				result = caseMainComponent(view);
			if (result == null)
				result = caseNamedElement(view);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.MAÝN_COMPONENT_RELATÝON: {
			MainComponentRelation mainComponentRelation = (MainComponentRelation) theEObject;
			T result = caseMainComponentRelation(mainComponentRelation);
			if (result == null)
				result = caseNamedElement(mainComponentRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON: {
			ViewToControllerRelation viewToControllerRelation = (ViewToControllerRelation) theEObject;
			T result = caseViewToControllerRelation(viewToControllerRelation);
			if (result == null)
				result = caseMainComponentRelation(viewToControllerRelation);
			if (result == null)
				result = caseNamedElement(viewToControllerRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.CONTROLLER_TO_MODEL_RELATÝON: {
			ControllerToModelRelation controllerToModelRelation = (ControllerToModelRelation) theEObject;
			T result = caseControllerToModelRelation(controllerToModelRelation);
			if (result == null)
				result = caseMainComponentRelation(controllerToModelRelation);
			if (result == null)
				result = caseNamedElement(controllerToModelRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.ACTÝON_LÝNK: {
			ActionLink actionLink = (ActionLink) theEObject;
			T result = caseActionLink(actionLink);
			if (result == null)
				result = caseHelperForSendingRequest(actionLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.FORM: {
			Form form = (Form) theEObject;
			T result = caseForm(form);
			if (result == null)
				result = caseHelperForSendingRequest(form);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.HELPER_FOR_SENDÝNG_REQUEST: {
			HelperForSendingRequest helperForSendingRequest = (HelperForSendingRequest) theEObject;
			T result = caseHelperForSendingRequest(helperForSendingRequest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON: {
			ControllerToViewRelation controllerToViewRelation = (ControllerToViewRelation) theEObject;
			T result = caseControllerToViewRelation(controllerToViewRelation);
			if (result == null)
				result = caseMainComponentRelation(controllerToViewRelation);
			if (result == null)
				result = caseNamedElement(controllerToViewRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.TABLE_KEY: {
			TableKey tableKey = (TableKey) theEObject;
			T result = caseTableKey(tableKey);
			if (result == null)
				result = caseNamedElement(tableKey);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.VÝEW_TO_MODEL_RELATÝON: {
			ViewToModelRelation viewToModelRelation = (ViewToModelRelation) theEObject;
			T result = caseViewToModelRelation(viewToModelRelation);
			if (result == null)
				result = caseMainComponentRelation(viewToModelRelation);
			if (result == null)
				result = caseNamedElement(viewToModelRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.USE_CASE_ACTOR_PACKAGE: {
			UseCaseActorPackage useCaseActorPackage = (UseCaseActorPackage) theEObject;
			T result = caseUseCaseActorPackage(useCaseActorPackage);
			if (result == null)
				result = casePackage(useCaseActorPackage);
			if (result == null)
				result = caseNamedElement(useCaseActorPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.ACTOR: {
			Actor actor = (Actor) theEObject;
			T result = caseActor(actor);
			if (result == null)
				result = caseNamedElement(actor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.USE_CASE: {
			UseCase useCase = (UseCase) theEObject;
			T result = caseUseCase(useCase);
			if (result == null)
				result = caseNamedElement(useCase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.USE_CASE_PACKAGE: {
			UseCasePackage useCasePackage = (UseCasePackage) theEObject;
			T result = caseUseCasePackage(useCasePackage);
			if (result == null)
				result = caseNamedElement(useCasePackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PRESENTATÝON_ELEMENT: {
			PresentationElement presentationElement = (PresentationElement) theEObject;
			T result = casePresentationElement(presentationElement);
			if (result == null)
				result = caseNamedElement(presentationElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PRESENTATÝON_FORM: {
			PresentationForm presentationForm = (PresentationForm) theEObject;
			T result = casePresentationForm(presentationForm);
			if (result == null)
				result = casePresentationElement(presentationForm);
			if (result == null)
				result = caseNamedElement(presentationForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.MULTÝPLE_CHOÝCE: {
			MultipleChoice multipleChoice = (MultipleChoice) theEObject;
			T result = caseMultipleChoice(multipleChoice);
			if (result == null)
				result = casePresentationFormElement(multipleChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.CHOÝCE: {
			Choice choice = (Choice) theEObject;
			T result = caseChoice(choice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.BUTTON: {
			Button button = (Button) theEObject;
			T result = caseButton(button);
			if (result == null)
				result = casePresentationFormElement(button);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT: {
			PresentationFormElement presentationFormElement = (PresentationFormElement) theEObject;
			T result = casePresentationFormElement(presentationFormElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.INPUT: {
			Input ýnput = (Input) theEObject;
			T result = caseInput(ýnput);
			if (result == null)
				result = casePresentationFormElement(ýnput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.LÝNK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = casePresentationElement(link);
			if (result == null)
				result = caseNamedElement(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = casePresentationElement(table);
			if (result == null)
				result = caseNamedElement(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.HEADER: {
			Header header = (Header) theEObject;
			T result = caseHeader(header);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON: {
			FormElementToPropertyKeyRelation formElementToPropertyKeyRelation = (FormElementToPropertyKeyRelation) theEObject;
			T result = caseFormElementToPropertyKeyRelation(formElementToPropertyKeyRelation);
			if (result == null)
				result = caseMainComponentRelation(formElementToPropertyKeyRelation);
			if (result == null)
				result = caseNamedElement(formElementToPropertyKeyRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RyzPackage.PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY: {
			PresentationFormElementToPropertyKey presentationFormElementToPropertyKey = (PresentationFormElementToPropertyKey) theEObject;
			T result = casePresentationFormElementToPropertyKey(presentationFormElementToPropertyKey);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(com.eryaz.prototype.ryz.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPackage(ComponentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mvc Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mvc Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMvcPackage(MvcPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelPackage(ModelPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewPackage(ViewPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerPackage(ControllerPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractView(AbstractView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainComponent(MainComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelAssociation(ModelAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartial(Partial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionMethod(ActionMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Component Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Component Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainComponentRelation(MainComponentRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View To Controller Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View To Controller Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewToControllerRelation(ViewToControllerRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller To Model Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller To Model Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerToModelRelation(ControllerToModelRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionLink(ActionLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper For Sending Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper For Sending Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperForSendingRequest(HelperForSendingRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller To View Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller To View Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerToViewRelation(ControllerToViewRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableKey(TableKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View To Model Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View To Model Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewToModelRelation(ViewToModelRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case Actor Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case Actor Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCaseActorPackage(UseCaseActorPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCase(UseCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Case Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Case Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCasePackage(UseCasePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationElement(PresentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationForm(PresentationForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChoice(MultipleChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Form Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Form Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationFormElement(PresentationFormElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Element To Property Key Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Element To Property Key Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormElementToPropertyKeyRelation(FormElementToPropertyKeyRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Form Element To Property Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Form Element To Property Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentationFormElementToPropertyKey(PresentationFormElementToPropertyKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RyzSwitch
