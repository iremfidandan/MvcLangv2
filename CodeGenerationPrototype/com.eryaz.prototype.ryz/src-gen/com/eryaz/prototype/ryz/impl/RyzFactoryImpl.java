/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.ActionLink;
import com.eryaz.prototype.ryz.ActionMethod;
import com.eryaz.prototype.ryz.ActionMethodParameterType;
import com.eryaz.prototype.ryz.ActionMethodReturnType;
import com.eryaz.prototype.ryz.Cardinality;
import com.eryaz.prototype.ryz.Controller;
import com.eryaz.prototype.ryz.ControllerPackage;
import com.eryaz.prototype.ryz.ControllerToModelRelation;
import com.eryaz.prototype.ryz.ControllerToViewRelation;
import com.eryaz.prototype.ryz.Form;
import com.eryaz.prototype.ryz.HttpMethod;
import com.eryaz.prototype.ryz.Layout;
import com.eryaz.prototype.ryz.Model;
import com.eryaz.prototype.ryz.ModelAssociation;
import com.eryaz.prototype.ryz.ModelCardinality;
import com.eryaz.prototype.ryz.ModelOperation;
import com.eryaz.prototype.ryz.ModelPackage;
import com.eryaz.prototype.ryz.ModelPropertyType;
import com.eryaz.prototype.ryz.MvcPackage;
import com.eryaz.prototype.ryz.Parameter;
import com.eryaz.prototype.ryz.Partial;
import com.eryaz.prototype.ryz.Project;
import com.eryaz.prototype.ryz.Property;
import com.eryaz.prototype.ryz.RequestType;
import com.eryaz.prototype.ryz.RyzFactory;
import com.eryaz.prototype.ryz.RyzPackage;
import com.eryaz.prototype.ryz.TableKey;
import com.eryaz.prototype.ryz.View;
import com.eryaz.prototype.ryz.ViewPackage;
import com.eryaz.prototype.ryz.ViewToControllerRelation;

import com.eryaz.prototype.ryz.ViewToModelRelation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RyzFactoryImpl extends EFactoryImpl implements RyzFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RyzFactory init() {
		try {
			RyzFactory theRyzFactory = (RyzFactory) EPackage.Registry.INSTANCE.getEFactory(RyzPackage.eNS_URI);
			if (theRyzFactory != null) {
				return theRyzFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RyzFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RyzFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RyzPackage.PROJECT:
			return createProject();
		case RyzPackage.MVC_PACKAGE:
			return createMvcPackage();
		case RyzPackage.MODEL_PACKAGE:
			return createModelPackage();
		case RyzPackage.VÝEW_PACKAGE:
			return createViewPackage();
		case RyzPackage.CONTROLLER_PACKAGE:
			return createControllerPackage();
		case RyzPackage.MODEL:
			return createModel();
		case RyzPackage.CONTROLLER:
			return createController();
		case RyzPackage.PROPERTY:
			return createProperty();
		case RyzPackage.MODEL_ASSOCÝATÝON:
			return createModelAssociation();
		case RyzPackage.PARTÝAL:
			return createPartial();
		case RyzPackage.ACTÝON_METHOD:
			return createActionMethod();
		case RyzPackage.LAYOUT:
			return createLayout();
		case RyzPackage.VÝEW:
			return createView();
		case RyzPackage.PARAMETER:
			return createParameter();
		case RyzPackage.VÝEW_TO_CONTROLLER_RELATÝON:
			return createViewToControllerRelation();
		case RyzPackage.CONTROLLER_TO_MODEL_RELATÝON:
			return createControllerToModelRelation();
		case RyzPackage.ACTÝON_LÝNK:
			return createActionLink();
		case RyzPackage.FORM:
			return createForm();
		case RyzPackage.CONTROLLER_TO_VÝEW_RELATÝON:
			return createControllerToViewRelation();
		case RyzPackage.TABLE_KEY:
			return createTableKey();
		case RyzPackage.VÝEW_TO_MODEL_RELATÝON:
			return createViewToModelRelation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case RyzPackage.MODEL_PROPERTY_TYPE:
			return createModelPropertyTypeFromString(eDataType, initialValue);
		case RyzPackage.CARDÝNALÝTY:
			return createCardinalityFromString(eDataType, initialValue);
		case RyzPackage.ACTÝON_METHOD_PARAMETER_TYPE:
			return createActionMethodParameterTypeFromString(eDataType, initialValue);
		case RyzPackage.REQUEST_TYPE:
			return createRequestTypeFromString(eDataType, initialValue);
		case RyzPackage.HTTP_METHOD:
			return createHttpMethodFromString(eDataType, initialValue);
		case RyzPackage.MODEL_CARDÝNALÝTY:
			return createModelCardinalityFromString(eDataType, initialValue);
		case RyzPackage.MODEL_OPERATÝON:
			return createModelOperationFromString(eDataType, initialValue);
		case RyzPackage.ACTÝON_METHOD_RETURN_TYPE:
			return createActionMethodReturnTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case RyzPackage.MODEL_PROPERTY_TYPE:
			return convertModelPropertyTypeToString(eDataType, instanceValue);
		case RyzPackage.CARDÝNALÝTY:
			return convertCardinalityToString(eDataType, instanceValue);
		case RyzPackage.ACTÝON_METHOD_PARAMETER_TYPE:
			return convertActionMethodParameterTypeToString(eDataType, instanceValue);
		case RyzPackage.REQUEST_TYPE:
			return convertRequestTypeToString(eDataType, instanceValue);
		case RyzPackage.HTTP_METHOD:
			return convertHttpMethodToString(eDataType, instanceValue);
		case RyzPackage.MODEL_CARDÝNALÝTY:
			return convertModelCardinalityToString(eDataType, instanceValue);
		case RyzPackage.MODEL_OPERATÝON:
			return convertModelOperationToString(eDataType, instanceValue);
		case RyzPackage.ACTÝON_METHOD_RETURN_TYPE:
			return convertActionMethodReturnTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MvcPackage createMvcPackage() {
		MvcPackageImpl mvcPackage = new MvcPackageImpl();
		return mvcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage createModelPackage() {
		ModelPackageImpl modelPackage = new ModelPackageImpl();
		return modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPackage createViewPackage() {
		ViewPackageImpl viewPackage = new ViewPackageImpl();
		return viewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerPackage createControllerPackage() {
		ControllerPackageImpl controllerPackage = new ControllerPackageImpl();
		return controllerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAssociation createModelAssociation() {
		ModelAssociationImpl modelAssociation = new ModelAssociationImpl();
		return modelAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partial createPartial() {
		PartialImpl partial = new PartialImpl();
		return partial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMethod createActionMethod() {
		ActionMethodImpl actionMethod = new ActionMethodImpl();
		return actionMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewToControllerRelation createViewToControllerRelation() {
		ViewToControllerRelationImpl viewToControllerRelation = new ViewToControllerRelationImpl();
		return viewToControllerRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerToModelRelation createControllerToModelRelation() {
		ControllerToModelRelationImpl controllerToModelRelation = new ControllerToModelRelationImpl();
		return controllerToModelRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLink createActionLink() {
		ActionLinkImpl actionLink = new ActionLinkImpl();
		return actionLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerToViewRelation createControllerToViewRelation() {
		ControllerToViewRelationImpl controllerToViewRelation = new ControllerToViewRelationImpl();
		return controllerToViewRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableKey createTableKey() {
		TableKeyImpl tableKey = new TableKeyImpl();
		return tableKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewToModelRelation createViewToModelRelation() {
		ViewToModelRelationImpl viewToModelRelation = new ViewToModelRelationImpl();
		return viewToModelRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPropertyType createModelPropertyTypeFromString(EDataType eDataType, String initialValue) {
		ModelPropertyType result = ModelPropertyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue) {
		Cardinality result = Cardinality.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMethodParameterType createActionMethodParameterTypeFromString(EDataType eDataType,
			String initialValue) {
		ActionMethodParameterType result = ActionMethodParameterType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionMethodParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestType createRequestTypeFromString(EDataType eDataType, String initialValue) {
		RequestType result = RequestType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCardinality createModelCardinalityFromString(EDataType eDataType, String initialValue) {
		ModelCardinality result = ModelCardinality.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelCardinalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelOperation createModelOperationFromString(EDataType eDataType, String initialValue) {
		ModelOperation result = ModelOperation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionMethodReturnType createActionMethodReturnTypeFromString(EDataType eDataType, String initialValue) {
		ActionMethodReturnType result = ActionMethodReturnType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionMethodReturnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RyzPackage getRyzPackage() {
		return (RyzPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RyzPackage getPackage() {
		return RyzPackage.eINSTANCE;
	}

} //RyzFactoryImpl
