/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.AbstractView;
import com.eryaz.prototype.ryz.ActionLink;
import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.ActionMethodParameterType;
import com.eryaz.prototype.ryz.ActionMethodReturnType;
import com.eryaz.prototype.ryz.Actor;
import com.eryaz.prototype.ryz.Button;
import com.eryaz.prototype.ryz.ButtonType;
import com.eryaz.prototype.ryz.Cardinality;
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
import com.eryaz.prototype.ryz.HttpMethod;
import com.eryaz.prototype.ryz.Input;
import com.eryaz.prototype.ryz.InputDataType;
import com.eryaz.prototype.ryz.Layout;
import com.eryaz.prototype.ryz.Link;
import com.eryaz.prototype.ryz.MainComponent;
import com.eryaz.prototype.ryz.MainComponentRelation;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelAssociation;
import com.eryaz.prototype.ryz.ModelCardinality;
import com.eryaz.prototype.ryz.ModelOperation;
import com.eryaz.prototype.ryz.ModelPackage;
import com.eryaz.prototype.ryz.ModelPropertyType;
import com.eryaz.prototype.ryz.MultipleChoice;
import com.eryaz.prototype.ryz.MultipleChoiceType;
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
import com.eryaz.prototype.ryz.RequestType;
import com.eryaz.prototype.ryz.RyzFactory;
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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RyzPackageImpl extends EPackageImpl implements RyzPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mvcPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainComponentRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewToControllerRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerToModelRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperForSendingRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerToViewRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewToModelRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseActorPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCasePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationFormElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ýnputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formElementToPropertyKeyRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentationFormElementToPropertyKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelPropertyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionMethodParameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelCardinalityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionMethodReturnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multipleChoiceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buttonTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ýnputDataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.eryaz.prototype.ryz.RyzPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RyzPackageImpl() {
		super(eNS_URI, RyzFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RyzPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RyzPackage init() {
		if (isInited)
			return (RyzPackage) EPackage.Registry.INSTANCE.getEPackage(RyzPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRyzPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RyzPackageImpl theRyzPackage = registeredRyzPackage instanceof RyzPackageImpl
				? (RyzPackageImpl) registeredRyzPackage
				: new RyzPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRyzPackage.createPackageContents();

		// Initialize created meta-data
		theRyzPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRyzPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RyzPackage.eNS_URI, theRyzPackage);
		return theRyzPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Packages() {
		return (EReference) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPackage() {
		return componentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMvcPackage() {
		return mvcPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMvcPackage_Maincomponents() {
		return (EReference) mvcPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMvcPackage_Maincomponentrelations() {
		return (EReference) mvcPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelPackage() {
		return modelPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelPackage_Models() {
		return (EReference) modelPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelPackage_Modelassociations() {
		return (EReference) modelPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewPackage() {
		return viewPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewPackage_Views() {
		return (EReference) viewPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControllerPackage() {
		return controllerPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControllerPackage_Controllers() {
		return (EReference) controllerPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_ÝsAbstract() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Properties() {
		return (EReference) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Ýnherits() {
		return (EReference) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Tablekeys() {
		return (EReference) modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractView() {
		return abstractViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractView_Renders() {
		return (EReference) abstractViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractView_Htmlelements() {
		return (EReference) abstractViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractView_Presentationelement() {
		return (EReference) abstractViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getController_Actionmethods() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMainComponent() {
		return mainComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Type() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_ÝsRequired() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelAssociation() {
		return modelAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelAssociation_Principal() {
		return (EReference) modelAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelAssociation_Dependent() {
		return (EReference) modelAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelAssociation_Cardinality() {
		return (EAttribute) modelAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelAssociation_ÝsRequired() {
		return (EAttribute) modelAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelAssociation_PrincipalRoleName() {
		return (EAttribute) modelAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelAssociation_DependentRoleName() {
		return (EAttribute) modelAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartial() {
		return partialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionMethod() {
		return actionMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionMethod_HttpMethod() {
		return (EAttribute) actionMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionMethod_Parameters() {
		return (EReference) actionMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionMethod_Returns() {
		return (EAttribute) actionMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionMethod_Usecase() {
		return (EReference) actionMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getView_Layout() {
		return (EReference) viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_ÝsNullable() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_ÝsList() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMainComponentRelation() {
		return mainComponentRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewToControllerRelation() {
		return viewToControllerRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewToControllerRelation_Helperforsendingrequest() {
		return (EReference) viewToControllerRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewToControllerRelation_Actionmethod() {
		return (EReference) viewToControllerRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewToControllerRelation_Model() {
		return (EReference) viewToControllerRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewToControllerRelation_Properties() {
		return (EReference) viewToControllerRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControllerToModelRelation() {
		return controllerToModelRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControllerToModelRelation_Actionmethod() {
		return (EReference) controllerToModelRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControllerToModelRelation_Model() {
		return (EReference) controllerToModelRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControllerToModelRelation_Modelproperties() {
		return (EReference) controllerToModelRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControllerToModelRelation_ModelCardinality() {
		return (EAttribute) controllerToModelRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControllerToModelRelation_ModelOperation() {
		return (EAttribute) controllerToModelRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionLink() {
		return actionLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHelperForSendingRequest() {
		return helperForSendingRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelperForSendingRequest_RequestType() {
		return (EAttribute) helperForSendingRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelperForSendingRequest_HttpMethod() {
		return (EAttribute) helperForSendingRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHelperForSendingRequest_Text() {
		return (EAttribute) helperForSendingRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHelperForSendingRequest_Usecase() {
		return (EReference) helperForSendingRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHelperForSendingRequest_Presentationelement() {
		return (EReference) helperForSendingRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControllerToViewRelation() {
		return controllerToViewRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControllerToViewRelation_Actionmethod() {
		return (EReference) controllerToViewRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControllerToViewRelation_Returns() {
		return (EReference) controllerToViewRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableKey() {
		return tableKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableKey_Type() {
		return (EAttribute) tableKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableKey_ÝsRequired() {
		return (EAttribute) tableKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableKey_ÝsPrimaryKey() {
		return (EAttribute) tableKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableKey_ÝsForeignKey() {
		return (EAttribute) tableKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViewToModelRelation() {
		return viewToModelRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewToModelRelation_Abstractview() {
		return (EReference) viewToModelRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewToModelRelation_Model() {
		return (EReference) viewToModelRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getViewToModelRelation_Modelcardinality() {
		return (EAttribute) viewToModelRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getViewToModelRelation_Properties() {
		return (EReference) viewToModelRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseCaseActorPackage() {
		return useCaseActorPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCaseActorPackage_Actors() {
		return (EReference) useCaseActorPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCaseActorPackage_Usecasepackages() {
		return (EReference) useCaseActorPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActor_Usecase() {
		return (EReference) actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Actor() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Helperforsendingrequest() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCase_Actionmethod() {
		return (EReference) useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseCasePackage() {
		return useCasePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUseCasePackage_Usecases() {
		return (EReference) useCasePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationElement() {
		return presentationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationElement_Helperforsendingrequest() {
		return (EReference) presentationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationForm() {
		return presentationFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationForm_Presentationformelement() {
		return (EReference) presentationFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultipleChoice() {
		return multipleChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultipleChoice_Choice() {
		return (EReference) multipleChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultipleChoice_MultipleChoiceType() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultipleChoice_MultipleSelection() {
		return (EAttribute) multipleChoiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Text() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Value() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Selected() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getButton_ButtonType() {
		return (EAttribute) buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationFormElement() {
		return presentationFormElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPresentationFormElement_LabelText() {
		return (EAttribute) presentationFormElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return ýnputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_ÝnputDataType() {
		return (EAttribute) ýnputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_ÝsReadOnly() {
		return (EAttribute) ýnputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_ÝsHidden() {
		return (EAttribute) ýnputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Text() {
		return (EAttribute) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTable_Header() {
		return (EReference) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeader() {
		return headerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeader_LabelText() {
		return (EAttribute) headerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeader_Name() {
		return (EAttribute) headerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormElementToPropertyKeyRelation() {
		return formElementToPropertyKeyRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormElementToPropertyKeyRelation_Helperforsendingrequest() {
		return (EReference) formElementToPropertyKeyRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormElementToPropertyKeyRelation_Model() {
		return (EReference) formElementToPropertyKeyRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormElementToPropertyKeyRelation_Presentationformelementtoproperty() {
		return (EReference) formElementToPropertyKeyRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentationFormElementToPropertyKey() {
		return presentationFormElementToPropertyKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationFormElementToPropertyKey_Presentationformelement() {
		return (EReference) presentationFormElementToPropertyKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationFormElementToPropertyKey_Property() {
		return (EReference) presentationFormElementToPropertyKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPresentationFormElementToPropertyKey_Tablekey() {
		return (EReference) presentationFormElementToPropertyKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelPropertyType() {
		return modelPropertyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionMethodParameterType() {
		return actionMethodParameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRequestType() {
		return requestTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHttpMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelCardinality() {
		return modelCardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelOperation() {
		return modelOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionMethodReturnType() {
		return actionMethodReturnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultipleChoiceType() {
		return multipleChoiceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getButtonType() {
		return buttonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInputDataType() {
		return ýnputDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RyzFactory getRyzFactory() {
		return (RyzFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__PACKAGES);

		packageEClass = createEClass(PACKAGE);

		componentPackageEClass = createEClass(COMPONENT_PACKAGE);

		mvcPackageEClass = createEClass(MVC_PACKAGE);
		createEReference(mvcPackageEClass, MVC_PACKAGE__MAÝNCOMPONENTS);
		createEReference(mvcPackageEClass, MVC_PACKAGE__MAÝNCOMPONENTRELATÝONS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		modelPackageEClass = createEClass(MODEL_PACKAGE);
		createEReference(modelPackageEClass, MODEL_PACKAGE__MODELS);
		createEReference(modelPackageEClass, MODEL_PACKAGE__MODELASSOCÝATÝONS);

		viewPackageEClass = createEClass(VÝEW_PACKAGE);
		createEReference(viewPackageEClass, VÝEW_PACKAGE__VÝEWS);

		controllerPackageEClass = createEClass(CONTROLLER_PACKAGE);
		createEReference(controllerPackageEClass, CONTROLLER_PACKAGE__CONTROLLERS);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__ÝS_ABSTRACT);
		createEReference(modelEClass, MODEL__PROPERTÝES);
		createEReference(modelEClass, MODEL__ÝNHERÝTS);
		createEReference(modelEClass, MODEL__TABLEKEYS);

		abstractViewEClass = createEClass(ABSTRACT_VÝEW);
		createEReference(abstractViewEClass, ABSTRACT_VÝEW__RENDERS);
		createEReference(abstractViewEClass, ABSTRACT_VÝEW__HTMLELEMENTS);
		createEReference(abstractViewEClass, ABSTRACT_VÝEW__PRESENTATÝONELEMENT);

		controllerEClass = createEClass(CONTROLLER);
		createEReference(controllerEClass, CONTROLLER__ACTÝONMETHODS);

		mainComponentEClass = createEClass(MAÝN_COMPONENT);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__ÝS_REQUÝRED);

		modelAssociationEClass = createEClass(MODEL_ASSOCÝATÝON);
		createEReference(modelAssociationEClass, MODEL_ASSOCÝATÝON__PRÝNCÝPAL);
		createEReference(modelAssociationEClass, MODEL_ASSOCÝATÝON__DEPENDENT);
		createEAttribute(modelAssociationEClass, MODEL_ASSOCÝATÝON__CARDÝNALÝTY);
		createEAttribute(modelAssociationEClass, MODEL_ASSOCÝATÝON__ÝS_REQUÝRED);
		createEAttribute(modelAssociationEClass, MODEL_ASSOCÝATÝON__PRÝNCÝPAL_ROLE_NAME);
		createEAttribute(modelAssociationEClass, MODEL_ASSOCÝATÝON__DEPENDENT_ROLE_NAME);

		partialEClass = createEClass(PARTÝAL);

		actionMethodEClass = createEClass(ACTÝON_METHOD);
		createEAttribute(actionMethodEClass, ACTÝON_METHOD__HTTP_METHOD);
		createEReference(actionMethodEClass, ACTÝON_METHOD__PARAMETERS);
		createEAttribute(actionMethodEClass, ACTÝON_METHOD__RETURNS);
		createEReference(actionMethodEClass, ACTÝON_METHOD__USECASE);

		layoutEClass = createEClass(LAYOUT);

		viewEClass = createEClass(VÝEW);
		createEReference(viewEClass, VÝEW__LAYOUT);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__ÝS_NULLABLE);
		createEAttribute(parameterEClass, PARAMETER__ÝS_LÝST);

		mainComponentRelationEClass = createEClass(MAÝN_COMPONENT_RELATÝON);

		viewToControllerRelationEClass = createEClass(VÝEW_TO_CONTROLLER_RELATÝON);
		createEReference(viewToControllerRelationEClass, VÝEW_TO_CONTROLLER_RELATÝON__HELPERFORSENDÝNGREQUEST);
		createEReference(viewToControllerRelationEClass, VÝEW_TO_CONTROLLER_RELATÝON__ACTÝONMETHOD);
		createEReference(viewToControllerRelationEClass, VÝEW_TO_CONTROLLER_RELATÝON__MODEL);
		createEReference(viewToControllerRelationEClass, VÝEW_TO_CONTROLLER_RELATÝON__PROPERTÝES);

		controllerToModelRelationEClass = createEClass(CONTROLLER_TO_MODEL_RELATÝON);
		createEReference(controllerToModelRelationEClass, CONTROLLER_TO_MODEL_RELATÝON__ACTÝONMETHOD);
		createEReference(controllerToModelRelationEClass, CONTROLLER_TO_MODEL_RELATÝON__MODEL);
		createEReference(controllerToModelRelationEClass, CONTROLLER_TO_MODEL_RELATÝON__MODELPROPERTÝES);
		createEAttribute(controllerToModelRelationEClass, CONTROLLER_TO_MODEL_RELATÝON__MODEL_CARDÝNALÝTY);
		createEAttribute(controllerToModelRelationEClass, CONTROLLER_TO_MODEL_RELATÝON__MODEL_OPERATÝON);

		actionLinkEClass = createEClass(ACTÝON_LÝNK);

		formEClass = createEClass(FORM);

		helperForSendingRequestEClass = createEClass(HELPER_FOR_SENDÝNG_REQUEST);
		createEAttribute(helperForSendingRequestEClass, HELPER_FOR_SENDÝNG_REQUEST__REQUEST_TYPE);
		createEAttribute(helperForSendingRequestEClass, HELPER_FOR_SENDÝNG_REQUEST__HTTP_METHOD);
		createEAttribute(helperForSendingRequestEClass, HELPER_FOR_SENDÝNG_REQUEST__TEXT);
		createEReference(helperForSendingRequestEClass, HELPER_FOR_SENDÝNG_REQUEST__USECASE);
		createEReference(helperForSendingRequestEClass, HELPER_FOR_SENDÝNG_REQUEST__PRESENTATÝONELEMENT);

		controllerToViewRelationEClass = createEClass(CONTROLLER_TO_VÝEW_RELATÝON);
		createEReference(controllerToViewRelationEClass, CONTROLLER_TO_VÝEW_RELATÝON__ACTÝONMETHOD);
		createEReference(controllerToViewRelationEClass, CONTROLLER_TO_VÝEW_RELATÝON__RETURNS);

		tableKeyEClass = createEClass(TABLE_KEY);
		createEAttribute(tableKeyEClass, TABLE_KEY__TYPE);
		createEAttribute(tableKeyEClass, TABLE_KEY__ÝS_REQUÝRED);
		createEAttribute(tableKeyEClass, TABLE_KEY__ÝS_PRÝMARY_KEY);
		createEAttribute(tableKeyEClass, TABLE_KEY__ÝS_FOREÝGN_KEY);

		viewToModelRelationEClass = createEClass(VÝEW_TO_MODEL_RELATÝON);
		createEReference(viewToModelRelationEClass, VÝEW_TO_MODEL_RELATÝON__ABSTRACTVÝEW);
		createEReference(viewToModelRelationEClass, VÝEW_TO_MODEL_RELATÝON__MODEL);
		createEAttribute(viewToModelRelationEClass, VÝEW_TO_MODEL_RELATÝON__MODELCARDÝNALÝTY);
		createEReference(viewToModelRelationEClass, VÝEW_TO_MODEL_RELATÝON__PROPERTÝES);

		useCaseActorPackageEClass = createEClass(USE_CASE_ACTOR_PACKAGE);
		createEReference(useCaseActorPackageEClass, USE_CASE_ACTOR_PACKAGE__ACTORS);
		createEReference(useCaseActorPackageEClass, USE_CASE_ACTOR_PACKAGE__USECASEPACKAGES);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__USECASE);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__ACTOR);
		createEReference(useCaseEClass, USE_CASE__HELPERFORSENDÝNGREQUEST);
		createEReference(useCaseEClass, USE_CASE__ACTÝONMETHOD);

		useCasePackageEClass = createEClass(USE_CASE_PACKAGE);
		createEReference(useCasePackageEClass, USE_CASE_PACKAGE__USECASES);

		presentationElementEClass = createEClass(PRESENTATÝON_ELEMENT);
		createEReference(presentationElementEClass, PRESENTATÝON_ELEMENT__HELPERFORSENDÝNGREQUEST);

		presentationFormEClass = createEClass(PRESENTATÝON_FORM);
		createEReference(presentationFormEClass, PRESENTATÝON_FORM__PRESENTATÝONFORMELEMENT);

		multipleChoiceEClass = createEClass(MULTÝPLE_CHOÝCE);
		createEReference(multipleChoiceEClass, MULTÝPLE_CHOÝCE__CHOÝCE);
		createEAttribute(multipleChoiceEClass, MULTÝPLE_CHOÝCE__MULTÝPLE_CHOÝCE_TYPE);
		createEAttribute(multipleChoiceEClass, MULTÝPLE_CHOÝCE__MULTÝPLE_SELECTÝON);

		choiceEClass = createEClass(CHOÝCE);
		createEAttribute(choiceEClass, CHOÝCE__TEXT);
		createEAttribute(choiceEClass, CHOÝCE__VALUE);
		createEAttribute(choiceEClass, CHOÝCE__SELECTED);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__BUTTON_TYPE);

		presentationFormElementEClass = createEClass(PRESENTATÝON_FORM_ELEMENT);
		createEAttribute(presentationFormElementEClass, PRESENTATÝON_FORM_ELEMENT__LABEL_TEXT);

		ýnputEClass = createEClass(INPUT);
		createEAttribute(ýnputEClass, INPUT__ÝNPUT_DATA_TYPE);
		createEAttribute(ýnputEClass, INPUT__ÝS_READ_ONLY);
		createEAttribute(ýnputEClass, INPUT__ÝS_HÝDDEN);

		linkEClass = createEClass(LÝNK);
		createEAttribute(linkEClass, LÝNK__TEXT);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__HEADER);

		headerEClass = createEClass(HEADER);
		createEAttribute(headerEClass, HEADER__LABEL_TEXT);
		createEAttribute(headerEClass, HEADER__NAME);

		formElementToPropertyKeyRelationEClass = createEClass(FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON);
		createEReference(formElementToPropertyKeyRelationEClass,
				FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__HELPERFORSENDÝNGREQUEST);
		createEReference(formElementToPropertyKeyRelationEClass, FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__MODEL);
		createEReference(formElementToPropertyKeyRelationEClass,
				FORM_ELEMENT_TO_PROPERTY_KEY_RELATÝON__PRESENTATÝONFORMELEMENTTOPROPERTY);

		presentationFormElementToPropertyKeyEClass = createEClass(PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY);
		createEReference(presentationFormElementToPropertyKeyEClass,
				PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PRESENTATÝONFORMELEMENT);
		createEReference(presentationFormElementToPropertyKeyEClass,
				PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__PROPERTY);
		createEReference(presentationFormElementToPropertyKeyEClass,
				PRESENTATÝON_FORM_ELEMENT_TO_PROPERTY_KEY__TABLEKEY);

		// Create enums
		modelPropertyTypeEEnum = createEEnum(MODEL_PROPERTY_TYPE);
		cardinalityEEnum = createEEnum(CARDÝNALÝTY);
		actionMethodParameterTypeEEnum = createEEnum(ACTÝON_METHOD_PARAMETER_TYPE);
		requestTypeEEnum = createEEnum(REQUEST_TYPE);
		httpMethodEEnum = createEEnum(HTTP_METHOD);
		modelCardinalityEEnum = createEEnum(MODEL_CARDÝNALÝTY);
		modelOperationEEnum = createEEnum(MODEL_OPERATÝON);
		actionMethodReturnTypeEEnum = createEEnum(ACTÝON_METHOD_RETURN_TYPE);
		multipleChoiceTypeEEnum = createEEnum(MULTÝPLE_CHOÝCE_TYPE);
		buttonTypeEEnum = createEEnum(BUTTON_TYPE);
		ýnputDataTypeEEnum = createEEnum(INPUT_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectEClass.getESuperTypes().add(this.getNamedElement());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		componentPackageEClass.getESuperTypes().add(this.getPackage());
		mvcPackageEClass.getESuperTypes().add(this.getPackage());
		modelPackageEClass.getESuperTypes().add(this.getComponentPackage());
		viewPackageEClass.getESuperTypes().add(this.getComponentPackage());
		controllerPackageEClass.getESuperTypes().add(this.getComponentPackage());
		modelEClass.getESuperTypes().add(this.getMainComponent());
		abstractViewEClass.getESuperTypes().add(this.getMainComponent());
		controllerEClass.getESuperTypes().add(this.getMainComponent());
		mainComponentEClass.getESuperTypes().add(this.getNamedElement());
		propertyEClass.getESuperTypes().add(this.getNamedElement());
		modelAssociationEClass.getESuperTypes().add(this.getNamedElement());
		partialEClass.getESuperTypes().add(this.getAbstractView());
		actionMethodEClass.getESuperTypes().add(this.getNamedElement());
		layoutEClass.getESuperTypes().add(this.getAbstractView());
		viewEClass.getESuperTypes().add(this.getAbstractView());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		mainComponentRelationEClass.getESuperTypes().add(this.getNamedElement());
		viewToControllerRelationEClass.getESuperTypes().add(this.getMainComponentRelation());
		controllerToModelRelationEClass.getESuperTypes().add(this.getMainComponentRelation());
		actionLinkEClass.getESuperTypes().add(this.getHelperForSendingRequest());
		formEClass.getESuperTypes().add(this.getHelperForSendingRequest());
		controllerToViewRelationEClass.getESuperTypes().add(this.getMainComponentRelation());
		tableKeyEClass.getESuperTypes().add(this.getNamedElement());
		viewToModelRelationEClass.getESuperTypes().add(this.getMainComponentRelation());
		useCaseActorPackageEClass.getESuperTypes().add(this.getPackage());
		actorEClass.getESuperTypes().add(this.getNamedElement());
		useCaseEClass.getESuperTypes().add(this.getNamedElement());
		useCasePackageEClass.getESuperTypes().add(this.getNamedElement());
		presentationElementEClass.getESuperTypes().add(this.getNamedElement());
		presentationFormEClass.getESuperTypes().add(this.getPresentationElement());
		multipleChoiceEClass.getESuperTypes().add(this.getPresentationFormElement());
		buttonEClass.getESuperTypes().add(this.getPresentationFormElement());
		ýnputEClass.getESuperTypes().add(this.getPresentationFormElement());
		linkEClass.getESuperTypes().add(this.getPresentationElement());
		tableEClass.getESuperTypes().add(this.getPresentationElement());
		formElementToPropertyKeyRelationEClass.getESuperTypes().add(this.getMainComponentRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_Packages(), this.getPackage(), null, "packages", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, com.eryaz.prototype.ryz.Package.class, "Package", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentPackageEClass, ComponentPackage.class, "ComponentPackage", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mvcPackageEClass, MvcPackage.class, "MvcPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMvcPackage_Maincomponents(), this.getMainComponent(), null, "maincomponents", null, 0, -1,
				MvcPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMvcPackage_Maincomponentrelations(), this.getMainComponentRelation(), null,
				"maincomponentrelations", null, 0, -1, MvcPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelPackageEClass, ModelPackage.class, "ModelPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelPackage_Models(), this.getModel(), null, "models", null, 0, -1, ModelPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelPackage_Modelassociations(), this.getModelAssociation(), null, "modelassociations", null,
				0, -1, ModelPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewPackageEClass, ViewPackage.class, "ViewPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewPackage_Views(), this.getAbstractView(), null, "views", null, 0, -1, ViewPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerPackageEClass, ControllerPackage.class, "ControllerPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerPackage_Controllers(), this.getController(), null, "controllers", null, 0, -1,
				ControllerPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_ÝsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 1, 1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Properties(), this.getProperty(), null, "properties", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Ýnherits(), this.getModel(), null, "inherits", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModel_Tablekeys(), this.getTableKey(), null, "tablekeys", null, 0, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractViewEClass, AbstractView.class, "AbstractView", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractView_Renders(), this.getPartial(), null, "renders", null, 0, -1, AbstractView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractView_Htmlelements(), this.getHelperForSendingRequest(), null, "htmlelements", null, 0,
				-1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractView_Presentationelement(), this.getPresentationElement(), null,
				"presentationelement", null, 0, -1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getController_Actionmethods(), this.getActionMethod(), null, "actionmethods", null, 0, -1,
				Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainComponentEClass, MainComponent.class, "MainComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Type(), this.getModelPropertyType(), "type", null, 1, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_ÝsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 1, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelAssociationEClass, ModelAssociation.class, "ModelAssociation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelAssociation_Principal(), this.getModel(), null, "principal", null, 1, 1,
				ModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelAssociation_Dependent(), this.getModel(), null, "dependent", null, 1, 1,
				ModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAssociation_Cardinality(), this.getCardinality(), "cardinality", null, 1, 1,
				ModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAssociation_ÝsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 1, 1,
				ModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAssociation_PrincipalRoleName(), ecorePackage.getEString(), "principalRoleName", null, 1,
				1, ModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAssociation_DependentRoleName(), ecorePackage.getEString(), "dependentRoleName", null, 1,
				1, ModelAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialEClass, Partial.class, "Partial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionMethodEClass, ActionMethod.class, "ActionMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionMethod_HttpMethod(), this.getHttpMethod(), "httpMethod", null, 1, 1, ActionMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionMethod_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				ActionMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionMethod_Returns(), this.getActionMethodReturnType(), "returns", null, 1, 1,
				ActionMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getActionMethod_Usecase(), this.getUseCase(), this.getUseCase_Actionmethod(), "usecase", null, 0,
				-1, ActionMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getView_Layout(), this.getLayout(), null, "layout", null, 0, 1, View.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), this.getActionMethodParameterType(), "type", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ÝsNullable(), ecorePackage.getEBoolean(), "isNullable", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_ÝsList(), ecorePackage.getEBoolean(), "isList", null, 1, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainComponentRelationEClass, MainComponentRelation.class, "MainComponentRelation", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewToControllerRelationEClass, ViewToControllerRelation.class, "ViewToControllerRelation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewToControllerRelation_Helperforsendingrequest(), this.getHelperForSendingRequest(), null,
				"helperforsendingrequest", null, 1, 1, ViewToControllerRelation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewToControllerRelation_Actionmethod(), this.getActionMethod(), null, "actionmethod", null,
				1, 1, ViewToControllerRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewToControllerRelation_Model(), this.getModel(), null, "model", null, 0, 1,
				ViewToControllerRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewToControllerRelation_Properties(), this.getProperty(), null, "properties", null, 0, -1,
				ViewToControllerRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerToModelRelationEClass, ControllerToModelRelation.class, "ControllerToModelRelation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerToModelRelation_Actionmethod(), this.getActionMethod(), null, "actionmethod", null,
				1, 1, ControllerToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerToModelRelation_Model(), this.getModel(), null, "model", null, 1, 1,
				ControllerToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerToModelRelation_Modelproperties(), this.getProperty(), null, "modelproperties",
				null, 0, -1, ControllerToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerToModelRelation_ModelCardinality(), this.getModelCardinality(), "modelCardinality",
				null, 1, 1, ControllerToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerToModelRelation_ModelOperation(), this.getModelOperation(), "modelOperation", null,
				1, 1, ControllerToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionLinkEClass, ActionLink.class, "ActionLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helperForSendingRequestEClass, HelperForSendingRequest.class, "HelperForSendingRequest", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHelperForSendingRequest_RequestType(), this.getRequestType(), "requestType", null, 1, 1,
				HelperForSendingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelperForSendingRequest_HttpMethod(), this.getHttpMethod(), "httpMethod", null, 1, 1,
				HelperForSendingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelperForSendingRequest_Text(), ecorePackage.getEString(), "text", null, 1, 1,
				HelperForSendingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperForSendingRequest_Usecase(), this.getUseCase(),
				this.getUseCase_Helperforsendingrequest(), "usecase", null, 0, -1, HelperForSendingRequest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHelperForSendingRequest_Presentationelement(), this.getPresentationElement(),
				this.getPresentationElement_Helperforsendingrequest(), "presentationelement", null, 0, -1,
				HelperForSendingRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerToViewRelationEClass, ControllerToViewRelation.class, "ControllerToViewRelation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerToViewRelation_Actionmethod(), this.getActionMethod(), null, "actionmethod", null,
				1, 1, ControllerToViewRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerToViewRelation_Returns(), this.getAbstractView(), null, "returns", null, 1, 1,
				ControllerToViewRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableKeyEClass, TableKey.class, "TableKey", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableKey_Type(), this.getModelPropertyType(), "type", null, 1, 1, TableKey.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableKey_ÝsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 1, 1, TableKey.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableKey_ÝsPrimaryKey(), ecorePackage.getEBoolean(), "isPrimaryKey", null, 1, 1,
				TableKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableKey_ÝsForeignKey(), ecorePackage.getEBoolean(), "isForeignKey", null, 1, 1,
				TableKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(viewToModelRelationEClass, ViewToModelRelation.class, "ViewToModelRelation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewToModelRelation_Abstractview(), this.getAbstractView(), null, "abstractview", null, 1, 1,
				ViewToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewToModelRelation_Model(), this.getModel(), null, "model", null, 1, 1,
				ViewToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewToModelRelation_Modelcardinality(), this.getModelCardinality(), "modelcardinality", null,
				1, 1, ViewToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewToModelRelation_Properties(), this.getProperty(), null, "properties", null, 0, -1,
				ViewToModelRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseActorPackageEClass, UseCaseActorPackage.class, "UseCaseActorPackage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCaseActorPackage_Actors(), this.getActor(), null, "actors", null, 0, -1,
				UseCaseActorPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCaseActorPackage_Usecasepackages(), this.getUseCasePackage(), null, "usecasepackages",
				null, 0, -1, UseCaseActorPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_Usecase(), this.getUseCase(), this.getUseCase_Actor(), "usecase", null, 0, -1,
				Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_Actor(), this.getActor(), this.getActor_Usecase(), "actor", null, 0, -1,
				UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Helperforsendingrequest(), this.getHelperForSendingRequest(),
				this.getHelperForSendingRequest_Usecase(), "helperforsendingrequest", null, 0, -1, UseCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUseCase_Actionmethod(), this.getActionMethod(), this.getActionMethod_Usecase(),
				"actionmethod", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useCasePackageEClass, UseCasePackage.class, "UseCasePackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCasePackage_Usecases(), this.getUseCase(), null, "usecases", null, 0, -1,
				UseCasePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationElementEClass, PresentationElement.class, "PresentationElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationElement_Helperforsendingrequest(), this.getHelperForSendingRequest(),
				this.getHelperForSendingRequest_Presentationelement(), "helperforsendingrequest", null, 0, -1,
				PresentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationFormEClass, PresentationForm.class, "PresentationForm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationForm_Presentationformelement(), this.getPresentationFormElement(), null,
				"presentationformelement", null, 0, -1, PresentationForm.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multipleChoiceEClass, MultipleChoice.class, "MultipleChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultipleChoice_Choice(), this.getChoice(), null, "choice", null, 0, -1, MultipleChoice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleChoice_MultipleChoiceType(), this.getMultipleChoiceType(), "multipleChoiceType", null,
				1, 1, MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultipleChoice_MultipleSelection(), ecorePackage.getEBoolean(), "multipleSelection", "false",
				1, 1, MultipleChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_Text(), theXMLTypePackage.getString(), "text", null, 1, 1, Choice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoice_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, Choice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoice_Selected(), theXMLTypePackage.getBoolean(), "selected", "false", 1, 1, Choice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_ButtonType(), this.getButtonType(), "buttonType", null, 1, 1, Button.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationFormElementEClass, PresentationFormElement.class, "PresentationFormElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPresentationFormElement_LabelText(), ecorePackage.getEString(), "labelText", null, 1, 1,
				PresentationFormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ýnputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_ÝnputDataType(), this.getInputDataType(), "inputDataType", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_ÝsReadOnly(), ecorePackage.getEBoolean(), "isReadOnly", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_ÝsHidden(), ecorePackage.getEBoolean(), "isHidden", null, 1, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_Text(), ecorePackage.getEString(), "text", null, 1, 1, Link.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Header(), this.getHeader(), null, "header", null, 0, -1, Table.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(headerEClass, Header.class, "Header", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeader_LabelText(), ecorePackage.getEString(), "labelText", null, 1, 1, Header.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHeader_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Header.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formElementToPropertyKeyRelationEClass, FormElementToPropertyKeyRelation.class,
				"FormElementToPropertyKeyRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormElementToPropertyKeyRelation_Helperforsendingrequest(), this.getHelperForSendingRequest(),
				null, "helperforsendingrequest", null, 1, 1, FormElementToPropertyKeyRelation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFormElementToPropertyKeyRelation_Model(), this.getModel(), null, "model", null, 1, 1,
				FormElementToPropertyKeyRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormElementToPropertyKeyRelation_Presentationformelementtoproperty(),
				this.getPresentationFormElementToPropertyKey(), null, "presentationformelementtoproperty", null, 0, -1,
				FormElementToPropertyKeyRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(presentationFormElementToPropertyKeyEClass, PresentationFormElementToPropertyKey.class,
				"PresentationFormElementToPropertyKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPresentationFormElementToPropertyKey_Presentationformelement(),
				this.getPresentationFormElement(), null, "presentationformelement", null, 1, 1,
				PresentationFormElementToPropertyKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationFormElementToPropertyKey_Property(), this.getProperty(), null, "property", null,
				0, 1, PresentationFormElementToPropertyKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPresentationFormElementToPropertyKey_Tablekey(), this.getTableKey(), null, "tablekey", null,
				0, 1, PresentationFormElementToPropertyKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modelPropertyTypeEEnum, ModelPropertyType.class, "ModelPropertyType");
		addEEnumLiteral(modelPropertyTypeEEnum, ModelPropertyType.INTEGER);
		addEEnumLiteral(modelPropertyTypeEEnum, ModelPropertyType.STRING);
		addEEnumLiteral(modelPropertyTypeEEnum, ModelPropertyType.DOUBLE);
		addEEnumLiteral(modelPropertyTypeEEnum, ModelPropertyType.BOOLEAN);
		addEEnumLiteral(modelPropertyTypeEEnum, ModelPropertyType.DATETIME);

		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.MANY_TO_MANY);
		addEEnumLiteral(cardinalityEEnum, Cardinality.ONE_TO_MANY);
		addEEnumLiteral(cardinalityEEnum, Cardinality.ONE_TO_ONE);

		initEEnum(actionMethodParameterTypeEEnum, ActionMethodParameterType.class, "ActionMethodParameterType");
		addEEnumLiteral(actionMethodParameterTypeEEnum, ActionMethodParameterType.INTEGER);
		addEEnumLiteral(actionMethodParameterTypeEEnum, ActionMethodParameterType.STRING);

		initEEnum(requestTypeEEnum, RequestType.class, "RequestType");
		addEEnumLiteral(requestTypeEEnum, RequestType.REGULAR_HTTP);
		addEEnumLiteral(requestTypeEEnum, RequestType.AJAX);

		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);

		initEEnum(modelCardinalityEEnum, ModelCardinality.class, "ModelCardinality");
		addEEnumLiteral(modelCardinalityEEnum, ModelCardinality.ONE);
		addEEnumLiteral(modelCardinalityEEnum, ModelCardinality.ALL);

		initEEnum(modelOperationEEnum, ModelOperation.class, "ModelOperation");
		addEEnumLiteral(modelOperationEEnum, ModelOperation.CREATE);
		addEEnumLiteral(modelOperationEEnum, ModelOperation.READ);
		addEEnumLiteral(modelOperationEEnum, ModelOperation.UPDATE);
		addEEnumLiteral(modelOperationEEnum, ModelOperation.DELETE);

		initEEnum(actionMethodReturnTypeEEnum, ActionMethodReturnType.class, "ActionMethodReturnType");
		addEEnumLiteral(actionMethodReturnTypeEEnum, ActionMethodReturnType.VÝEW);
		addEEnumLiteral(actionMethodReturnTypeEEnum, ActionMethodReturnType.PARTÝAL_VÝEW);
		addEEnumLiteral(actionMethodReturnTypeEEnum, ActionMethodReturnType.REDÝRECT_TO_ACTÝON);
		addEEnumLiteral(actionMethodReturnTypeEEnum, ActionMethodReturnType.JSON);
		addEEnumLiteral(actionMethodReturnTypeEEnum, ActionMethodReturnType.CONTENT);

		initEEnum(multipleChoiceTypeEEnum, MultipleChoiceType.class, "MultipleChoiceType");
		addEEnumLiteral(multipleChoiceTypeEEnum, MultipleChoiceType.RADIO_BUTTON);
		addEEnumLiteral(multipleChoiceTypeEEnum, MultipleChoiceType.CHECKBOX_GROUP);
		addEEnumLiteral(multipleChoiceTypeEEnum, MultipleChoiceType.DROPDOWN_LIST);

		initEEnum(buttonTypeEEnum, ButtonType.class, "ButtonType");
		addEEnumLiteral(buttonTypeEEnum, ButtonType.SUBMIT);
		addEEnumLiteral(buttonTypeEEnum, ButtonType.RESET);

		initEEnum(ýnputDataTypeEEnum, InputDataType.class, "InputDataType");
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.TEXT);
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.NUMBER);
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.PASSWORD);
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.EMAIL);
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.TEL);
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.DATE);
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.TIME);
		addEEnumLiteral(ýnputDataTypeEEnum, InputDataType.FILE);

		// Create resource
		createResource(eNS_URI);
	}

} //RyzPackageImpl
