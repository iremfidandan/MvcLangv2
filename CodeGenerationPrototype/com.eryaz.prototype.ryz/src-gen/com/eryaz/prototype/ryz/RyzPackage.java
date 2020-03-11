/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.eryaz.prototype.ryz.RyzFactory
 * @model kind="package"
 * @generated
 */
public interface RyzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ryz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eryaz.com/prototype/ryz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ryz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RyzPackage eINSTANCE = com.eryaz.prototype.ryz.impl.RyzPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.NamedElementImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ProjectImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.PackageImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ComponentPackageImpl <em>Component Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ComponentPackageImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getComponentPackage()
	 * @generated
	 */
	int COMPONENT_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The number of structural features of the '<em>Component Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PACKAGE_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.MvcPackageImpl <em>Mvc Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.MvcPackageImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getMvcPackage()
	 * @generated
	 */
	int MVC_PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_PACKAGE__NAME = PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Maincomponents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_PACKAGE__MA›NCOMPONENTS = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maincomponentrelations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_PACKAGE__MA›NCOMPONENTRELAT›ONS = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mvc Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_PACKAGE_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mvc Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MVC_PACKAGE_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ModelPackageImpl <em>Model Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ModelPackageImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelPackage()
	 * @generated
	 */
	int MODEL_PACKAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PACKAGE__NAME = COMPONENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PACKAGE__MODELS = COMPONENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modelassociations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PACKAGE__MODELASSOC›AT›ONS = COMPONENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PACKAGE_FEATURE_COUNT = COMPONENT_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PACKAGE_OPERATION_COUNT = COMPONENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ViewPackageImpl <em>View Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ViewPackageImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getViewPackage()
	 * @generated
	 */
	int V›EW_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_PACKAGE__NAME = COMPONENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_PACKAGE__V›EWS = COMPONENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_PACKAGE_FEATURE_COUNT = COMPONENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_PACKAGE_OPERATION_COUNT = COMPONENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ControllerPackageImpl <em>Controller Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ControllerPackageImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getControllerPackage()
	 * @generated
	 */
	int CONTROLLER_PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_PACKAGE__NAME = COMPONENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_PACKAGE__CONTROLLERS = COMPONENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_PACKAGE_FEATURE_COUNT = COMPONENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controller Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_PACKAGE_OPERATION_COUNT = COMPONENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.MainComponentImpl <em>Main Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.MainComponentImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getMainComponent()
	 * @generated
	 */
	int MA›N_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA›N_COMPONENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Main Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA›N_COMPONENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA›N_COMPONENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ModelImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = MA›N_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>›s Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__›S_ABSTRACT = MA›N_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROPERT›ES = MA›N_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>›nherits</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__›NHER›TS = MA›N_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tablekeys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TABLEKEYS = MA›N_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MA›N_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = MA›N_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.AbstractViewImpl <em>Abstract View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.AbstractViewImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getAbstractView()
	 * @generated
	 */
	int ABSTRACT_V›EW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_V›EW__NAME = MA›N_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Renders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_V›EW__RENDERS = MA›N_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Htmlelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_V›EW__HTMLELEMENTS = MA›N_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_V›EW_FEATURE_COUNT = MA›N_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_V›EW_OPERATION_COUNT = MA›N_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ControllerImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = MA›N_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Actionmethods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ACT›ONMETHODS = MA›N_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = MA›N_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = MA›N_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.PropertyImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>›s Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__›S_REQU›RED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl <em>Model Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ModelAssociationImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelAssociation()
	 * @generated
	 */
	int MODEL_ASSOC›AT›ON = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Principal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON__PR›NC›PAL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON__DEPENDENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON__CARD›NAL›TY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>›s Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON__›S_REQU›RED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Principal Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependent Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Model Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ASSOC›AT›ON_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.PartialImpl <em>Partial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.PartialImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getPartial()
	 * @generated
	 */
	int PART›AL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART›AL__NAME = ABSTRACT_V›EW__NAME;

	/**
	 * The feature id for the '<em><b>Renders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART›AL__RENDERS = ABSTRACT_V›EW__RENDERS;

	/**
	 * The feature id for the '<em><b>Htmlelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART›AL__HTMLELEMENTS = ABSTRACT_V›EW__HTMLELEMENTS;

	/**
	 * The number of structural features of the '<em>Partial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART›AL_FEATURE_COUNT = ABSTRACT_V›EW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART›AL_OPERATION_COUNT = ABSTRACT_V›EW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ActionMethodImpl <em>Action Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ActionMethodImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionMethod()
	 * @generated
	 */
	int ACT›ON_METHOD = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_METHOD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_METHOD__HTTP_METHOD = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_METHOD__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_METHOD__RETURNS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_METHOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.LayoutImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = ABSTRACT_V›EW__NAME;

	/**
	 * The feature id for the '<em><b>Renders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__RENDERS = ABSTRACT_V›EW__RENDERS;

	/**
	 * The feature id for the '<em><b>Htmlelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__HTMLELEMENTS = ABSTRACT_V›EW__HTMLELEMENTS;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = ABSTRACT_V›EW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = ABSTRACT_V›EW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ViewImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getView()
	 * @generated
	 */
	int V›EW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW__NAME = ABSTRACT_V›EW__NAME;

	/**
	 * The feature id for the '<em><b>Renders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW__RENDERS = ABSTRACT_V›EW__RENDERS;

	/**
	 * The feature id for the '<em><b>Htmlelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW__HTMLELEMENTS = ABSTRACT_V›EW__HTMLELEMENTS;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW__LAYOUT = ABSTRACT_V›EW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_FEATURE_COUNT = ABSTRACT_V›EW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_OPERATION_COUNT = ABSTRACT_V›EW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ParameterImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>›s Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__›S_NULLABLE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>›s List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__›S_L›ST = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.MainComponentRelationImpl <em>Main Component Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.MainComponentRelationImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getMainComponentRelation()
	 * @generated
	 */
	int MA›N_COMPONENT_RELAT›ON = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA›N_COMPONENT_RELAT›ON__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Main Component Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Main Component Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MA›N_COMPONENT_RELAT›ON_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl <em>View To Controller Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getViewToControllerRelation()
	 * @generated
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON__NAME = MA›N_COMPONENT_RELAT›ON__NAME;

	/**
	 * The feature id for the '<em><b>Helperforsendingrequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON__HELPERFORSEND›NGREQUEST = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actionmethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON__ACT›ONMETHOD = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON__MODEL = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON__PROPERT›ES = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View To Controller Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON_FEATURE_COUNT = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>View To Controller Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_CONTROLLER_RELAT›ON_OPERATION_COUNT = MA›N_COMPONENT_RELAT›ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl <em>Controller To Model Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getControllerToModelRelation()
	 * @generated
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON__NAME = MA›N_COMPONENT_RELAT›ON__NAME;

	/**
	 * The feature id for the '<em><b>Actionmethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON__ACT›ONMETHOD = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON__MODEL = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modelproperties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON__MODELPROPERT›ES = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON__MODEL_CARD›NAL›TY = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON__MODEL_OPERAT›ON = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Controller To Model Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON_FEATURE_COUNT = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Controller To Model Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_MODEL_RELAT›ON_OPERATION_COUNT = MA›N_COMPONENT_RELAT›ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.HtmlElementImpl <em>Html Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.HtmlElementImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getHtmlElement()
	 * @generated
	 */
	int HTML_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Html Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Html Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl <em>Helper For Sending Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getHelperForSendingRequest()
	 * @generated
	 */
	int HELPER_FOR_SEND›NG_REQUEST = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FOR_SEND›NG_REQUEST__NAME = HTML_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FOR_SEND›NG_REQUEST__REQUEST_TYPE = HTML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FOR_SEND›NG_REQUEST__HTTP_METHOD = HTML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FOR_SEND›NG_REQUEST__TEXT = HTML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Helper For Sending Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FOR_SEND›NG_REQUEST_FEATURE_COUNT = HTML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Helper For Sending Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FOR_SEND›NG_REQUEST_OPERATION_COUNT = HTML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ActionLinkImpl <em>Action Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ActionLinkImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionLink()
	 * @generated
	 */
	int ACT›ON_L›NK = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_L›NK__NAME = HELPER_FOR_SEND›NG_REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_L›NK__REQUEST_TYPE = HELPER_FOR_SEND›NG_REQUEST__REQUEST_TYPE;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_L›NK__HTTP_METHOD = HELPER_FOR_SEND›NG_REQUEST__HTTP_METHOD;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_L›NK__TEXT = HELPER_FOR_SEND›NG_REQUEST__TEXT;

	/**
	 * The number of structural features of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_L›NK_FEATURE_COUNT = HELPER_FOR_SEND›NG_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT›ON_L›NK_OPERATION_COUNT = HELPER_FOR_SEND›NG_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.FormImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = HELPER_FOR_SEND›NG_REQUEST__NAME;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__REQUEST_TYPE = HELPER_FOR_SEND›NG_REQUEST__REQUEST_TYPE;

	/**
	 * The feature id for the '<em><b>Http Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HTTP_METHOD = HELPER_FOR_SEND›NG_REQUEST__HTTP_METHOD;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TEXT = HELPER_FOR_SEND›NG_REQUEST__TEXT;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = HELPER_FOR_SEND›NG_REQUEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = HELPER_FOR_SEND›NG_REQUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ControllerToViewRelationImpl <em>Controller To View Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ControllerToViewRelationImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getControllerToViewRelation()
	 * @generated
	 */
	int CONTROLLER_TO_V›EW_RELAT›ON = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_V›EW_RELAT›ON__NAME = MA›N_COMPONENT_RELAT›ON__NAME;

	/**
	 * The feature id for the '<em><b>Actionmethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_V›EW_RELAT›ON__ACT›ONMETHOD = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_V›EW_RELAT›ON__RETURNS = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller To View Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_V›EW_RELAT›ON_FEATURE_COUNT = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Controller To View Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_TO_V›EW_RELAT›ON_OPERATION_COUNT = MA›N_COMPONENT_RELAT›ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.TableKeyImpl <em>Table Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.TableKeyImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getTableKey()
	 * @generated
	 */
	int TABLE_KEY = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_KEY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_KEY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>›s Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_KEY__›S_REQU›RED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>›s Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_KEY__›S_PR›MARY_KEY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>›s Foreign Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_KEY__›S_FORE›GN_KEY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Table Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_KEY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Table Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_KEY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl <em>View To Model Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getViewToModelRelation()
	 * @generated
	 */
	int V›EW_TO_MODEL_RELAT›ON = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_MODEL_RELAT›ON__NAME = MA›N_COMPONENT_RELAT›ON__NAME;

	/**
	 * The feature id for the '<em><b>Abstractview</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_MODEL_RELAT›ON__ABSTRACTV›EW = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_MODEL_RELAT›ON__MODEL = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modelcardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_MODEL_RELAT›ON__MODELCARD›NAL›TY = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_MODEL_RELAT›ON__PROPERT›ES = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>View To Model Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_MODEL_RELAT›ON_FEATURE_COUNT = MA›N_COMPONENT_RELAT›ON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>View To Model Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int V›EW_TO_MODEL_RELAT›ON_OPERATION_COUNT = MA›N_COMPONENT_RELAT›ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.ModelPropertyType <em>Model Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.ModelPropertyType
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelPropertyType()
	 * @generated
	 */
	int MODEL_PROPERTY_TYPE = 29;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.Cardinality <em>Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.Cardinality
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getCardinality()
	 * @generated
	 */
	int CARD›NAL›TY = 30;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.ActionMethodParameterType <em>Action Method Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.ActionMethodParameterType
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionMethodParameterType()
	 * @generated
	 */
	int ACT›ON_METHOD_PARAMETER_TYPE = 31;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.RequestType <em>Request Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.RequestType
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getRequestType()
	 * @generated
	 */
	int REQUEST_TYPE = 32;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.HttpMethod
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 33;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.ModelCardinality <em>Model Cardinality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.ModelCardinality
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelCardinality()
	 * @generated
	 */
	int MODEL_CARD›NAL›TY = 34;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.ModelOperation <em>Model Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.ModelOperation
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelOperation()
	 * @generated
	 */
	int MODEL_OPERAT›ON = 35;

	/**
	 * The meta object id for the '{@link com.eryaz.prototype.ryz.ActionMethodReturnType <em>Action Method Return Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.eryaz.prototype.ryz.ActionMethodReturnType
	 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionMethodReturnType()
	 * @generated
	 */
	int ACT›ON_METHOD_RETURN_TYPE = 36;

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.eryaz.prototype.ryz.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.Project#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see com.eryaz.prototype.ryz.Project#getPackages()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Packages();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see com.eryaz.prototype.ryz.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ComponentPackage <em>Component Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Package</em>'.
	 * @see com.eryaz.prototype.ryz.ComponentPackage
	 * @generated
	 */
	EClass getComponentPackage();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.MvcPackage <em>Mvc Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mvc Package</em>'.
	 * @see com.eryaz.prototype.ryz.MvcPackage
	 * @generated
	 */
	EClass getMvcPackage();

	/**
	 * Returns the meta object for the reference list '{@link com.eryaz.prototype.ryz.MvcPackage#getMaincomponents <em>Maincomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Maincomponents</em>'.
	 * @see com.eryaz.prototype.ryz.MvcPackage#getMaincomponents()
	 * @see #getMvcPackage()
	 * @generated
	 */
	EReference getMvcPackage_Maincomponents();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.MvcPackage#getMaincomponentrelations <em>Maincomponentrelations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Maincomponentrelations</em>'.
	 * @see com.eryaz.prototype.ryz.MvcPackage#getMaincomponentrelations()
	 * @see #getMvcPackage()
	 * @generated
	 */
	EReference getMvcPackage_Maincomponentrelations();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.eryaz.prototype.ryz.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.eryaz.prototype.ryz.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ModelPackage <em>Model Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Package</em>'.
	 * @see com.eryaz.prototype.ryz.ModelPackage
	 * @generated
	 */
	EClass getModelPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.ModelPackage#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see com.eryaz.prototype.ryz.ModelPackage#getModels()
	 * @see #getModelPackage()
	 * @generated
	 */
	EReference getModelPackage_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.ModelPackage#getModelassociations <em>Modelassociations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelassociations</em>'.
	 * @see com.eryaz.prototype.ryz.ModelPackage#getModelassociations()
	 * @see #getModelPackage()
	 * @generated
	 */
	EReference getModelPackage_Modelassociations();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ViewPackage <em>View Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Package</em>'.
	 * @see com.eryaz.prototype.ryz.ViewPackage
	 * @generated
	 */
	EClass getViewPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.ViewPackage#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see com.eryaz.prototype.ryz.ViewPackage#getViews()
	 * @see #getViewPackage()
	 * @generated
	 */
	EReference getViewPackage_Views();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ControllerPackage <em>Controller Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Package</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerPackage
	 * @generated
	 */
	EClass getControllerPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.ControllerPackage#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerPackage#getControllers()
	 * @see #getControllerPackage()
	 * @generated
	 */
	EReference getControllerPackage_Controllers();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.eryaz.prototype.ryz.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.Model#is›sAbstract <em>›s Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s Abstract</em>'.
	 * @see com.eryaz.prototype.ryz.Model#is›sAbstract()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_›sAbstract();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.Model#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see com.eryaz.prototype.ryz.Model#getProperties()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Properties();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.Model#get›nherits <em>›nherits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>›nherits</em>'.
	 * @see com.eryaz.prototype.ryz.Model#get›nherits()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_›nherits();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.Model#getTablekeys <em>Tablekeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablekeys</em>'.
	 * @see com.eryaz.prototype.ryz.Model#getTablekeys()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Tablekeys();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract View</em>'.
	 * @see com.eryaz.prototype.ryz.AbstractView
	 * @generated
	 */
	EClass getAbstractView();

	/**
	 * Returns the meta object for the reference list '{@link com.eryaz.prototype.ryz.AbstractView#getRenders <em>Renders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Renders</em>'.
	 * @see com.eryaz.prototype.ryz.AbstractView#getRenders()
	 * @see #getAbstractView()
	 * @generated
	 */
	EReference getAbstractView_Renders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.AbstractView#getHtmlelements <em>Htmlelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Htmlelements</em>'.
	 * @see com.eryaz.prototype.ryz.AbstractView#getHtmlelements()
	 * @see #getAbstractView()
	 * @generated
	 */
	EReference getAbstractView_Htmlelements();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see com.eryaz.prototype.ryz.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.Controller#getActionmethods <em>Actionmethods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionmethods</em>'.
	 * @see com.eryaz.prototype.ryz.Controller#getActionmethods()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Actionmethods();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.MainComponent <em>Main Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Component</em>'.
	 * @see com.eryaz.prototype.ryz.MainComponent
	 * @generated
	 */
	EClass getMainComponent();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.eryaz.prototype.ryz.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.eryaz.prototype.ryz.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.Property#is›sRequired <em>›s Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s Required</em>'.
	 * @see com.eryaz.prototype.ryz.Property#is›sRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_›sRequired();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ModelAssociation <em>Model Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Association</em>'.
	 * @see com.eryaz.prototype.ryz.ModelAssociation
	 * @generated
	 */
	EClass getModelAssociation();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ModelAssociation#getPrincipal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Principal</em>'.
	 * @see com.eryaz.prototype.ryz.ModelAssociation#getPrincipal()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EReference getModelAssociation_Principal();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ModelAssociation#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent</em>'.
	 * @see com.eryaz.prototype.ryz.ModelAssociation#getDependent()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EReference getModelAssociation_Dependent();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ModelAssociation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see com.eryaz.prototype.ryz.ModelAssociation#getCardinality()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EAttribute getModelAssociation_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ModelAssociation#is›sRequired <em>›s Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s Required</em>'.
	 * @see com.eryaz.prototype.ryz.ModelAssociation#is›sRequired()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EAttribute getModelAssociation_›sRequired();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ModelAssociation#getPrincipalRoleName <em>Principal Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Principal Role Name</em>'.
	 * @see com.eryaz.prototype.ryz.ModelAssociation#getPrincipalRoleName()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EAttribute getModelAssociation_PrincipalRoleName();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ModelAssociation#getDependentRoleName <em>Dependent Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent Role Name</em>'.
	 * @see com.eryaz.prototype.ryz.ModelAssociation#getDependentRoleName()
	 * @see #getModelAssociation()
	 * @generated
	 */
	EAttribute getModelAssociation_DependentRoleName();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Partial <em>Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial</em>'.
	 * @see com.eryaz.prototype.ryz.Partial
	 * @generated
	 */
	EClass getPartial();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ActionMethod <em>Action Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Method</em>'.
	 * @see com.eryaz.prototype.ryz.ActionMethod
	 * @generated
	 */
	EClass getActionMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link com.eryaz.prototype.ryz.ActionMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.eryaz.prototype.ryz.ActionMethod#getParameters()
	 * @see #getActionMethod()
	 * @generated
	 */
	EReference getActionMethod_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ActionMethod#getReturns <em>Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returns</em>'.
	 * @see com.eryaz.prototype.ryz.ActionMethod#getReturns()
	 * @see #getActionMethod()
	 * @generated
	 */
	EAttribute getActionMethod_Returns();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ActionMethod#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see com.eryaz.prototype.ryz.ActionMethod#getHttpMethod()
	 * @see #getActionMethod()
	 * @generated
	 */
	EAttribute getActionMethod_HttpMethod();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see com.eryaz.prototype.ryz.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see com.eryaz.prototype.ryz.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.View#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see com.eryaz.prototype.ryz.View#getLayout()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Layout();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see com.eryaz.prototype.ryz.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.eryaz.prototype.ryz.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.Parameter#is›sNullable <em>›s Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s Nullable</em>'.
	 * @see com.eryaz.prototype.ryz.Parameter#is›sNullable()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_›sNullable();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.Parameter#is›sList <em>›s List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s List</em>'.
	 * @see com.eryaz.prototype.ryz.Parameter#is›sList()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_›sList();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.MainComponentRelation <em>Main Component Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Component Relation</em>'.
	 * @see com.eryaz.prototype.ryz.MainComponentRelation
	 * @generated
	 */
	EClass getMainComponentRelation();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ViewToControllerRelation <em>View To Controller Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View To Controller Relation</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToControllerRelation
	 * @generated
	 */
	EClass getViewToControllerRelation();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getHelperforsendingrequest <em>Helperforsendingrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Helperforsendingrequest</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToControllerRelation#getHelperforsendingrequest()
	 * @see #getViewToControllerRelation()
	 * @generated
	 */
	EReference getViewToControllerRelation_Helperforsendingrequest();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getActionmethod <em>Actionmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actionmethod</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToControllerRelation#getActionmethod()
	 * @see #getViewToControllerRelation()
	 * @generated
	 */
	EReference getViewToControllerRelation_Actionmethod();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToControllerRelation#getModel()
	 * @see #getViewToControllerRelation()
	 * @generated
	 */
	EReference getViewToControllerRelation_Model();

	/**
	 * Returns the meta object for the reference list '{@link com.eryaz.prototype.ryz.ViewToControllerRelation#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToControllerRelation#getProperties()
	 * @see #getViewToControllerRelation()
	 * @generated
	 */
	EReference getViewToControllerRelation_Properties();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ControllerToModelRelation <em>Controller To Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller To Model Relation</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToModelRelation
	 * @generated
	 */
	EClass getControllerToModelRelation();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getActionmethod <em>Actionmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actionmethod</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToModelRelation#getActionmethod()
	 * @see #getControllerToModelRelation()
	 * @generated
	 */
	EReference getControllerToModelRelation_Actionmethod();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToModelRelation#getModel()
	 * @see #getControllerToModelRelation()
	 * @generated
	 */
	EReference getControllerToModelRelation_Model();

	/**
	 * Returns the meta object for the reference list '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelproperties <em>Modelproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modelproperties</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToModelRelation#getModelproperties()
	 * @see #getControllerToModelRelation()
	 * @generated
	 */
	EReference getControllerToModelRelation_Modelproperties();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelCardinality <em>Model Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Cardinality</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToModelRelation#getModelCardinality()
	 * @see #getControllerToModelRelation()
	 * @generated
	 */
	EAttribute getControllerToModelRelation_ModelCardinality();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ControllerToModelRelation#getModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Operation</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToModelRelation#getModelOperation()
	 * @see #getControllerToModelRelation()
	 * @generated
	 */
	EAttribute getControllerToModelRelation_ModelOperation();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.HtmlElement <em>Html Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Element</em>'.
	 * @see com.eryaz.prototype.ryz.HtmlElement
	 * @generated
	 */
	EClass getHtmlElement();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ActionLink <em>Action Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Link</em>'.
	 * @see com.eryaz.prototype.ryz.ActionLink
	 * @generated
	 */
	EClass getActionLink();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see com.eryaz.prototype.ryz.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.HelperForSendingRequest <em>Helper For Sending Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper For Sending Request</em>'.
	 * @see com.eryaz.prototype.ryz.HelperForSendingRequest
	 * @generated
	 */
	EClass getHelperForSendingRequest();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Type</em>'.
	 * @see com.eryaz.prototype.ryz.HelperForSendingRequest#getRequestType()
	 * @see #getHelperForSendingRequest()
	 * @generated
	 */
	EAttribute getHelperForSendingRequest_RequestType();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getHttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Method</em>'.
	 * @see com.eryaz.prototype.ryz.HelperForSendingRequest#getHttpMethod()
	 * @see #getHelperForSendingRequest()
	 * @generated
	 */
	EAttribute getHelperForSendingRequest_HttpMethod();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.eryaz.prototype.ryz.HelperForSendingRequest#getText()
	 * @see #getHelperForSendingRequest()
	 * @generated
	 */
	EAttribute getHelperForSendingRequest_Text();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ControllerToViewRelation <em>Controller To View Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller To View Relation</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToViewRelation
	 * @generated
	 */
	EClass getControllerToViewRelation();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ControllerToViewRelation#getActionmethod <em>Actionmethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actionmethod</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToViewRelation#getActionmethod()
	 * @see #getControllerToViewRelation()
	 * @generated
	 */
	EReference getControllerToViewRelation_Actionmethod();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ControllerToViewRelation#getReturns <em>Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returns</em>'.
	 * @see com.eryaz.prototype.ryz.ControllerToViewRelation#getReturns()
	 * @see #getControllerToViewRelation()
	 * @generated
	 */
	EReference getControllerToViewRelation_Returns();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.TableKey <em>Table Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Key</em>'.
	 * @see com.eryaz.prototype.ryz.TableKey
	 * @generated
	 */
	EClass getTableKey();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.TableKey#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.eryaz.prototype.ryz.TableKey#getType()
	 * @see #getTableKey()
	 * @generated
	 */
	EAttribute getTableKey_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.TableKey#is›sRequired <em>›s Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s Required</em>'.
	 * @see com.eryaz.prototype.ryz.TableKey#is›sRequired()
	 * @see #getTableKey()
	 * @generated
	 */
	EAttribute getTableKey_›sRequired();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.TableKey#is›sPrimaryKey <em>›s Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s Primary Key</em>'.
	 * @see com.eryaz.prototype.ryz.TableKey#is›sPrimaryKey()
	 * @see #getTableKey()
	 * @generated
	 */
	EAttribute getTableKey_›sPrimaryKey();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.TableKey#is›sForeignKey <em>›s Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>›s Foreign Key</em>'.
	 * @see com.eryaz.prototype.ryz.TableKey#is›sForeignKey()
	 * @see #getTableKey()
	 * @generated
	 */
	EAttribute getTableKey_›sForeignKey();

	/**
	 * Returns the meta object for class '{@link com.eryaz.prototype.ryz.ViewToModelRelation <em>View To Model Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View To Model Relation</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToModelRelation
	 * @generated
	 */
	EClass getViewToModelRelation();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ViewToModelRelation#getAbstractview <em>Abstractview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Abstractview</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToModelRelation#getAbstractview()
	 * @see #getViewToModelRelation()
	 * @generated
	 */
	EReference getViewToModelRelation_Abstractview();

	/**
	 * Returns the meta object for the reference '{@link com.eryaz.prototype.ryz.ViewToModelRelation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToModelRelation#getModel()
	 * @see #getViewToModelRelation()
	 * @generated
	 */
	EReference getViewToModelRelation_Model();

	/**
	 * Returns the meta object for the attribute '{@link com.eryaz.prototype.ryz.ViewToModelRelation#getModelcardinality <em>Modelcardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelcardinality</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToModelRelation#getModelcardinality()
	 * @see #getViewToModelRelation()
	 * @generated
	 */
	EAttribute getViewToModelRelation_Modelcardinality();

	/**
	 * Returns the meta object for the reference list '{@link com.eryaz.prototype.ryz.ViewToModelRelation#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see com.eryaz.prototype.ryz.ViewToModelRelation#getProperties()
	 * @see #getViewToModelRelation()
	 * @generated
	 */
	EReference getViewToModelRelation_Properties();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.ModelPropertyType <em>Model Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Property Type</em>'.
	 * @see com.eryaz.prototype.ryz.ModelPropertyType
	 * @generated
	 */
	EEnum getModelPropertyType();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality</em>'.
	 * @see com.eryaz.prototype.ryz.Cardinality
	 * @generated
	 */
	EEnum getCardinality();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.ActionMethodParameterType <em>Action Method Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Method Parameter Type</em>'.
	 * @see com.eryaz.prototype.ryz.ActionMethodParameterType
	 * @generated
	 */
	EEnum getActionMethodParameterType();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.RequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Request Type</em>'.
	 * @see com.eryaz.prototype.ryz.RequestType
	 * @generated
	 */
	EEnum getRequestType();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see com.eryaz.prototype.ryz.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.ModelCardinality <em>Model Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Cardinality</em>'.
	 * @see com.eryaz.prototype.ryz.ModelCardinality
	 * @generated
	 */
	EEnum getModelCardinality();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.ModelOperation <em>Model Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Operation</em>'.
	 * @see com.eryaz.prototype.ryz.ModelOperation
	 * @generated
	 */
	EEnum getModelOperation();

	/**
	 * Returns the meta object for enum '{@link com.eryaz.prototype.ryz.ActionMethodReturnType <em>Action Method Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Method Return Type</em>'.
	 * @see com.eryaz.prototype.ryz.ActionMethodReturnType
	 * @generated
	 */
	EEnum getActionMethodReturnType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RyzFactory getRyzFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ProjectImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PACKAGES = eINSTANCE.getProject_Packages();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.PackageImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ComponentPackageImpl <em>Component Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ComponentPackageImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getComponentPackage()
		 * @generated
		 */
		EClass COMPONENT_PACKAGE = eINSTANCE.getComponentPackage();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.MvcPackageImpl <em>Mvc Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.MvcPackageImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getMvcPackage()
		 * @generated
		 */
		EClass MVC_PACKAGE = eINSTANCE.getMvcPackage();

		/**
		 * The meta object literal for the '<em><b>Maincomponents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_PACKAGE__MA›NCOMPONENTS = eINSTANCE.getMvcPackage_Maincomponents();

		/**
		 * The meta object literal for the '<em><b>Maincomponentrelations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MVC_PACKAGE__MA›NCOMPONENTRELAT›ONS = eINSTANCE.getMvcPackage_Maincomponentrelations();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.NamedElementImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ModelPackageImpl <em>Model Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ModelPackageImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelPackage()
		 * @generated
		 */
		EClass MODEL_PACKAGE = eINSTANCE.getModelPackage();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PACKAGE__MODELS = eINSTANCE.getModelPackage_Models();

		/**
		 * The meta object literal for the '<em><b>Modelassociations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PACKAGE__MODELASSOC›AT›ONS = eINSTANCE.getModelPackage_Modelassociations();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ViewPackageImpl <em>View Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ViewPackageImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getViewPackage()
		 * @generated
		 */
		EClass V›EW_PACKAGE = eINSTANCE.getViewPackage();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_PACKAGE__V›EWS = eINSTANCE.getViewPackage_Views();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ControllerPackageImpl <em>Controller Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ControllerPackageImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getControllerPackage()
		 * @generated
		 */
		EClass CONTROLLER_PACKAGE = eINSTANCE.getControllerPackage();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_PACKAGE__CONTROLLERS = eINSTANCE.getControllerPackage_Controllers();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ModelImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>›s Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__›S_ABSTRACT = eINSTANCE.getModel_›sAbstract();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PROPERT›ES = eINSTANCE.getModel_Properties();

		/**
		 * The meta object literal for the '<em><b>›nherits</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__›NHER›TS = eINSTANCE.getModel_›nherits();

		/**
		 * The meta object literal for the '<em><b>Tablekeys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TABLEKEYS = eINSTANCE.getModel_Tablekeys();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.AbstractViewImpl <em>Abstract View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.AbstractViewImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getAbstractView()
		 * @generated
		 */
		EClass ABSTRACT_V›EW = eINSTANCE.getAbstractView();

		/**
		 * The meta object literal for the '<em><b>Renders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_V›EW__RENDERS = eINSTANCE.getAbstractView_Renders();

		/**
		 * The meta object literal for the '<em><b>Htmlelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_V›EW__HTMLELEMENTS = eINSTANCE.getAbstractView_Htmlelements();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ControllerImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Actionmethods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__ACT›ONMETHODS = eINSTANCE.getController_Actionmethods();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.MainComponentImpl <em>Main Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.MainComponentImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getMainComponent()
		 * @generated
		 */
		EClass MA›N_COMPONENT = eINSTANCE.getMainComponent();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.PropertyImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>›s Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__›S_REQU›RED = eINSTANCE.getProperty_›sRequired();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ModelAssociationImpl <em>Model Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ModelAssociationImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelAssociation()
		 * @generated
		 */
		EClass MODEL_ASSOC›AT›ON = eINSTANCE.getModelAssociation();

		/**
		 * The meta object literal for the '<em><b>Principal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ASSOC›AT›ON__PR›NC›PAL = eINSTANCE.getModelAssociation_Principal();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ASSOC›AT›ON__DEPENDENT = eINSTANCE.getModelAssociation_Dependent();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ASSOC›AT›ON__CARD›NAL›TY = eINSTANCE.getModelAssociation_Cardinality();

		/**
		 * The meta object literal for the '<em><b>›s Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ASSOC›AT›ON__›S_REQU›RED = eINSTANCE.getModelAssociation_›sRequired();

		/**
		 * The meta object literal for the '<em><b>Principal Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ASSOC›AT›ON__PR›NC›PAL_ROLE_NAME = eINSTANCE.getModelAssociation_PrincipalRoleName();

		/**
		 * The meta object literal for the '<em><b>Dependent Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ASSOC›AT›ON__DEPENDENT_ROLE_NAME = eINSTANCE.getModelAssociation_DependentRoleName();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.PartialImpl <em>Partial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.PartialImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getPartial()
		 * @generated
		 */
		EClass PART›AL = eINSTANCE.getPartial();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ActionMethodImpl <em>Action Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ActionMethodImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionMethod()
		 * @generated
		 */
		EClass ACT›ON_METHOD = eINSTANCE.getActionMethod();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACT›ON_METHOD__PARAMETERS = eINSTANCE.getActionMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Returns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT›ON_METHOD__RETURNS = eINSTANCE.getActionMethod_Returns();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACT›ON_METHOD__HTTP_METHOD = eINSTANCE.getActionMethod_HttpMethod();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.LayoutImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ViewImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getView()
		 * @generated
		 */
		EClass V›EW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW__LAYOUT = eINSTANCE.getView_Layout();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ParameterImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>›s Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__›S_NULLABLE = eINSTANCE.getParameter_›sNullable();

		/**
		 * The meta object literal for the '<em><b>›s List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__›S_L›ST = eINSTANCE.getParameter_›sList();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.MainComponentRelationImpl <em>Main Component Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.MainComponentRelationImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getMainComponentRelation()
		 * @generated
		 */
		EClass MA›N_COMPONENT_RELAT›ON = eINSTANCE.getMainComponentRelation();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl <em>View To Controller Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ViewToControllerRelationImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getViewToControllerRelation()
		 * @generated
		 */
		EClass V›EW_TO_CONTROLLER_RELAT›ON = eINSTANCE.getViewToControllerRelation();

		/**
		 * The meta object literal for the '<em><b>Helperforsendingrequest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_TO_CONTROLLER_RELAT›ON__HELPERFORSEND›NGREQUEST = eINSTANCE
				.getViewToControllerRelation_Helperforsendingrequest();

		/**
		 * The meta object literal for the '<em><b>Actionmethod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_TO_CONTROLLER_RELAT›ON__ACT›ONMETHOD = eINSTANCE.getViewToControllerRelation_Actionmethod();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_TO_CONTROLLER_RELAT›ON__MODEL = eINSTANCE.getViewToControllerRelation_Model();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_TO_CONTROLLER_RELAT›ON__PROPERT›ES = eINSTANCE.getViewToControllerRelation_Properties();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl <em>Controller To Model Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ControllerToModelRelationImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getControllerToModelRelation()
		 * @generated
		 */
		EClass CONTROLLER_TO_MODEL_RELAT›ON = eINSTANCE.getControllerToModelRelation();

		/**
		 * The meta object literal for the '<em><b>Actionmethod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_TO_MODEL_RELAT›ON__ACT›ONMETHOD = eINSTANCE.getControllerToModelRelation_Actionmethod();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_TO_MODEL_RELAT›ON__MODEL = eINSTANCE.getControllerToModelRelation_Model();

		/**
		 * The meta object literal for the '<em><b>Modelproperties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_TO_MODEL_RELAT›ON__MODELPROPERT›ES = eINSTANCE
				.getControllerToModelRelation_Modelproperties();

		/**
		 * The meta object literal for the '<em><b>Model Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_TO_MODEL_RELAT›ON__MODEL_CARD›NAL›TY = eINSTANCE
				.getControllerToModelRelation_ModelCardinality();

		/**
		 * The meta object literal for the '<em><b>Model Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_TO_MODEL_RELAT›ON__MODEL_OPERAT›ON = eINSTANCE
				.getControllerToModelRelation_ModelOperation();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.HtmlElementImpl <em>Html Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.HtmlElementImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getHtmlElement()
		 * @generated
		 */
		EClass HTML_ELEMENT = eINSTANCE.getHtmlElement();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ActionLinkImpl <em>Action Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ActionLinkImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionLink()
		 * @generated
		 */
		EClass ACT›ON_L›NK = eINSTANCE.getActionLink();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.FormImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl <em>Helper For Sending Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.HelperForSendingRequestImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getHelperForSendingRequest()
		 * @generated
		 */
		EClass HELPER_FOR_SEND›NG_REQUEST = eINSTANCE.getHelperForSendingRequest();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_FOR_SEND›NG_REQUEST__REQUEST_TYPE = eINSTANCE.getHelperForSendingRequest_RequestType();

		/**
		 * The meta object literal for the '<em><b>Http Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_FOR_SEND›NG_REQUEST__HTTP_METHOD = eINSTANCE.getHelperForSendingRequest_HttpMethod();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_FOR_SEND›NG_REQUEST__TEXT = eINSTANCE.getHelperForSendingRequest_Text();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ControllerToViewRelationImpl <em>Controller To View Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ControllerToViewRelationImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getControllerToViewRelation()
		 * @generated
		 */
		EClass CONTROLLER_TO_V›EW_RELAT›ON = eINSTANCE.getControllerToViewRelation();

		/**
		 * The meta object literal for the '<em><b>Actionmethod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_TO_V›EW_RELAT›ON__ACT›ONMETHOD = eINSTANCE.getControllerToViewRelation_Actionmethod();

		/**
		 * The meta object literal for the '<em><b>Returns</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_TO_V›EW_RELAT›ON__RETURNS = eINSTANCE.getControllerToViewRelation_Returns();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.TableKeyImpl <em>Table Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.TableKeyImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getTableKey()
		 * @generated
		 */
		EClass TABLE_KEY = eINSTANCE.getTableKey();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_KEY__TYPE = eINSTANCE.getTableKey_Type();

		/**
		 * The meta object literal for the '<em><b>›s Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_KEY__›S_REQU›RED = eINSTANCE.getTableKey_›sRequired();

		/**
		 * The meta object literal for the '<em><b>›s Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_KEY__›S_PR›MARY_KEY = eINSTANCE.getTableKey_›sPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>›s Foreign Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_KEY__›S_FORE›GN_KEY = eINSTANCE.getTableKey_›sForeignKey();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl <em>View To Model Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.impl.ViewToModelRelationImpl
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getViewToModelRelation()
		 * @generated
		 */
		EClass V›EW_TO_MODEL_RELAT›ON = eINSTANCE.getViewToModelRelation();

		/**
		 * The meta object literal for the '<em><b>Abstractview</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_TO_MODEL_RELAT›ON__ABSTRACTV›EW = eINSTANCE.getViewToModelRelation_Abstractview();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_TO_MODEL_RELAT›ON__MODEL = eINSTANCE.getViewToModelRelation_Model();

		/**
		 * The meta object literal for the '<em><b>Modelcardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute V›EW_TO_MODEL_RELAT›ON__MODELCARD›NAL›TY = eINSTANCE.getViewToModelRelation_Modelcardinality();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference V›EW_TO_MODEL_RELAT›ON__PROPERT›ES = eINSTANCE.getViewToModelRelation_Properties();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.ModelPropertyType <em>Model Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.ModelPropertyType
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelPropertyType()
		 * @generated
		 */
		EEnum MODEL_PROPERTY_TYPE = eINSTANCE.getModelPropertyType();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.Cardinality <em>Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.Cardinality
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getCardinality()
		 * @generated
		 */
		EEnum CARD›NAL›TY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.ActionMethodParameterType <em>Action Method Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.ActionMethodParameterType
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionMethodParameterType()
		 * @generated
		 */
		EEnum ACT›ON_METHOD_PARAMETER_TYPE = eINSTANCE.getActionMethodParameterType();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.RequestType <em>Request Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.RequestType
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getRequestType()
		 * @generated
		 */
		EEnum REQUEST_TYPE = eINSTANCE.getRequestType();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.HttpMethod
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.ModelCardinality <em>Model Cardinality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.ModelCardinality
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelCardinality()
		 * @generated
		 */
		EEnum MODEL_CARD›NAL›TY = eINSTANCE.getModelCardinality();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.ModelOperation <em>Model Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.ModelOperation
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getModelOperation()
		 * @generated
		 */
		EEnum MODEL_OPERAT›ON = eINSTANCE.getModelOperation();

		/**
		 * The meta object literal for the '{@link com.eryaz.prototype.ryz.ActionMethodReturnType <em>Action Method Return Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.eryaz.prototype.ryz.ActionMethodReturnType
		 * @see com.eryaz.prototype.ryz.impl.RyzPackageImpl#getActionMethodReturnType()
		 * @generated
		 */
		EEnum ACT›ON_METHOD_RETURN_TYPE = eINSTANCE.getActionMethodReturnType();

	}

} //RyzPackage
