/**
 */
package it.mde.assignment4.model.webApplication;

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
 * @see it.mde.assignment4.model.webApplication.WebApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface WebApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "webApplication";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/webApplication";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "webApplication";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WebApplicationPackage eINSTANCE = it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.NamedElementImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getNamedElement()
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
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.WebApplicationImpl <em>Web Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getWebApplication()
	 * @generated
	 */
	int WEB_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__ENTITIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__FORMS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION__PAGES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Web Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_APPLICATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.EntityImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__REFERENCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.FormImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METHOD = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.PageImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.AttributeImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Primary Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_PRIMARY_KEY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.IndexImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 6;

	/**
	 * The feature id for the '<em><b>Indexed Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INDEXED_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__ORDER = 1;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.ReferenceImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__FOREIGN_KEY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.ContentImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>SContent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__SCONTENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dcontent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DCONTENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.ElementImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TOOLTIP = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.StaticContentImpl <em>Static Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.StaticContentImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getStaticContent()
	 * @generated
	 */
	int STATIC_CONTENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTENT__CONTENT_STYLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_CONTENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.DynamicContentImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getDynamicContent()
	 * @generated
	 */
	int DYNAMIC_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT__ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Individual Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT__INDIVIDUAL_DATA = 1;

	/**
	 * The number of structural features of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.ConceptHubImpl <em>Concept Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.ConceptHubImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getConceptHub()
	 * @generated
	 */
	int CONCEPT_HUB = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HUB__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HUB__ATTRIBUTE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HUB_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concept Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_HUB_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.impl.IndividualImpl
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 13;

	/**
	 * The feature id for the '<em><b>Indexed Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__INDEXED_ATTRIBUTE = INDEX__INDEXED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ORDER = INDEX__ORDER;

	/**
	 * The feature id for the '<em><b>Concept Hub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__CONCEPT_HUB = INDEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = INDEX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = INDEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.DataType
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 14;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.MethodType <em>Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.MethodType
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getMethodType()
	 * @generated
	 */
	int METHOD_TYPE = 15;

	/**
	 * The meta object id for the '{@link it.mde.assignment4.model.webApplication.ContentType <em>Content Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.mde.assignment4.model.webApplication.ContentType
	 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 16;

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.WebApplication <em>Web Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Application</em>'.
	 * @see it.mde.assignment4.model.webApplication.WebApplication
	 * @generated
	 */
	EClass getWebApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.WebApplication#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see it.mde.assignment4.model.webApplication.WebApplication#getEntities()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.WebApplication#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see it.mde.assignment4.model.webApplication.WebApplication#getForms()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Forms();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.WebApplication#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see it.mde.assignment4.model.webApplication.WebApplication#getPages()
	 * @see #getWebApplication()
	 * @generated
	 */
	EReference getWebApplication_Pages();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see it.mde.assignment4.model.webApplication.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see it.mde.assignment4.model.webApplication.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link it.mde.assignment4.model.webApplication.Entity#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see it.mde.assignment4.model.webApplication.Entity#getReference()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Reference();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see it.mde.assignment4.model.webApplication.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.Form#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see it.mde.assignment4.model.webApplication.Form#getElements()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Elements();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.Form#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see it.mde.assignment4.model.webApplication.Form#getMethod()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Method();

	/**
	 * Returns the meta object for the reference '{@link it.mde.assignment4.model.webApplication.Form#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see it.mde.assignment4.model.webApplication.Form#getEntity()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Entity();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see it.mde.assignment4.model.webApplication.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.Page#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see it.mde.assignment4.model.webApplication.Page#getContents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Contents();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.mde.assignment4.model.webApplication.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.mde.assignment4.model.webApplication.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see it.mde.assignment4.model.webApplication.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.mde.assignment4.model.webApplication.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.Attribute#isIsPrimaryKey <em>Is Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary Key</em>'.
	 * @see it.mde.assignment4.model.webApplication.Attribute#isIsPrimaryKey()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsPrimaryKey();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see it.mde.assignment4.model.webApplication.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the reference '{@link it.mde.assignment4.model.webApplication.Index#getIndexedAttribute <em>Indexed Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Indexed Attribute</em>'.
	 * @see it.mde.assignment4.model.webApplication.Index#getIndexedAttribute()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_IndexedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.Index#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see it.mde.assignment4.model.webApplication.Index#getOrder()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_Order();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see it.mde.assignment4.model.webApplication.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link it.mde.assignment4.model.webApplication.Reference#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Key</em>'.
	 * @see it.mde.assignment4.model.webApplication.Reference#getForeignKey()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_ForeignKey();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see it.mde.assignment4.model.webApplication.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.Content#getSContent <em>SContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SContent</em>'.
	 * @see it.mde.assignment4.model.webApplication.Content#getSContent()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_SContent();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.Content#getDcontent <em>Dcontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dcontent</em>'.
	 * @see it.mde.assignment4.model.webApplication.Content#getDcontent()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Dcontent();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see it.mde.assignment4.model.webApplication.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.Element#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see it.mde.assignment4.model.webApplication.Element#getLabel()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Label();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.Element#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see it.mde.assignment4.model.webApplication.Element#getTooltip()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Tooltip();

	/**
	 * Returns the meta object for the reference '{@link it.mde.assignment4.model.webApplication.Element#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see it.mde.assignment4.model.webApplication.Element#getAttribute()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attribute();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.StaticContent <em>Static Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Content</em>'.
	 * @see it.mde.assignment4.model.webApplication.StaticContent
	 * @generated
	 */
	EClass getStaticContent();

	/**
	 * Returns the meta object for the attribute '{@link it.mde.assignment4.model.webApplication.StaticContent#getContentStyle <em>Content Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Style</em>'.
	 * @see it.mde.assignment4.model.webApplication.StaticContent#getContentStyle()
	 * @see #getStaticContent()
	 * @generated
	 */
	EAttribute getStaticContent_ContentStyle();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.DynamicContent <em>Dynamic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Content</em>'.
	 * @see it.mde.assignment4.model.webApplication.DynamicContent
	 * @generated
	 */
	EClass getDynamicContent();

	/**
	 * Returns the meta object for the reference '{@link it.mde.assignment4.model.webApplication.DynamicContent#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see it.mde.assignment4.model.webApplication.DynamicContent#getEntity()
	 * @see #getDynamicContent()
	 * @generated
	 */
	EReference getDynamicContent_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.DynamicContent#getIndividualData <em>Individual Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual Data</em>'.
	 * @see it.mde.assignment4.model.webApplication.DynamicContent#getIndividualData()
	 * @see #getDynamicContent()
	 * @generated
	 */
	EReference getDynamicContent_IndividualData();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.ConceptHub <em>Concept Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Hub</em>'.
	 * @see it.mde.assignment4.model.webApplication.ConceptHub
	 * @generated
	 */
	EClass getConceptHub();

	/**
	 * Returns the meta object for the reference '{@link it.mde.assignment4.model.webApplication.ConceptHub#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see it.mde.assignment4.model.webApplication.ConceptHub#getAttribute()
	 * @see #getConceptHub()
	 * @generated
	 */
	EReference getConceptHub_Attribute();

	/**
	 * Returns the meta object for class '{@link it.mde.assignment4.model.webApplication.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see it.mde.assignment4.model.webApplication.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the containment reference list '{@link it.mde.assignment4.model.webApplication.Individual#getConceptHub <em>Concept Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept Hub</em>'.
	 * @see it.mde.assignment4.model.webApplication.Individual#getConceptHub()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_ConceptHub();

	/**
	 * Returns the meta object for enum '{@link it.mde.assignment4.model.webApplication.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see it.mde.assignment4.model.webApplication.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link it.mde.assignment4.model.webApplication.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Type</em>'.
	 * @see it.mde.assignment4.model.webApplication.MethodType
	 * @generated
	 */
	EEnum getMethodType();

	/**
	 * Returns the meta object for enum '{@link it.mde.assignment4.model.webApplication.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Type</em>'.
	 * @see it.mde.assignment4.model.webApplication.ContentType
	 * @generated
	 */
	EEnum getContentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WebApplicationFactory getWebApplicationFactory();

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
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.WebApplicationImpl <em>Web Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getWebApplication()
		 * @generated
		 */
		EClass WEB_APPLICATION = eINSTANCE.getWebApplication();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__ENTITIES = eINSTANCE.getWebApplication_Entities();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__FORMS = eINSTANCE.getWebApplication_Forms();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_APPLICATION__PAGES = eINSTANCE.getWebApplication_Pages();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.EntityImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__REFERENCE = eINSTANCE.getEntity_Reference();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.FormImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ELEMENTS = eINSTANCE.getForm_Elements();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__METHOD = eINSTANCE.getForm_Method();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ENTITY = eINSTANCE.getForm_Entity();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.PageImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONTENTS = eINSTANCE.getPage_Contents();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.NamedElementImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.AttributeImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Is Primary Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_PRIMARY_KEY = eINSTANCE.getAttribute_IsPrimaryKey();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.IndexImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Indexed Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__INDEXED_ATTRIBUTE = eINSTANCE.getIndex_IndexedAttribute();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__ORDER = eINSTANCE.getIndex_Order();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.ReferenceImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__FOREIGN_KEY = eINSTANCE.getReference_ForeignKey();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.ContentImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>SContent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__SCONTENT = eINSTANCE.getContent_SContent();

		/**
		 * The meta object literal for the '<em><b>Dcontent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DCONTENT = eINSTANCE.getContent_Dcontent();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.ElementImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__LABEL = eINSTANCE.getElement_Label();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TOOLTIP = eINSTANCE.getElement_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTE = eINSTANCE.getElement_Attribute();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.StaticContentImpl <em>Static Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.StaticContentImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getStaticContent()
		 * @generated
		 */
		EClass STATIC_CONTENT = eINSTANCE.getStaticContent();

		/**
		 * The meta object literal for the '<em><b>Content Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_CONTENT__CONTENT_STYLE = eINSTANCE.getStaticContent_ContentStyle();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.DynamicContentImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getDynamicContent()
		 * @generated
		 */
		EClass DYNAMIC_CONTENT = eINSTANCE.getDynamicContent();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTENT__ENTITY = eINSTANCE.getDynamicContent_Entity();

		/**
		 * The meta object literal for the '<em><b>Individual Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_CONTENT__INDIVIDUAL_DATA = eINSTANCE.getDynamicContent_IndividualData();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.ConceptHubImpl <em>Concept Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.ConceptHubImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getConceptHub()
		 * @generated
		 */
		EClass CONCEPT_HUB = eINSTANCE.getConceptHub();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT_HUB__ATTRIBUTE = eINSTANCE.getConceptHub_Attribute();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.impl.IndividualImpl
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Concept Hub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__CONCEPT_HUB = eINSTANCE.getIndividual_ConceptHub();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.DataType
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.MethodType <em>Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.MethodType
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getMethodType()
		 * @generated
		 */
		EEnum METHOD_TYPE = eINSTANCE.getMethodType();

		/**
		 * The meta object literal for the '{@link it.mde.assignment4.model.webApplication.ContentType <em>Content Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.mde.assignment4.model.webApplication.ContentType
		 * @see it.mde.assignment4.model.webApplication.impl.WebApplicationPackageImpl#getContentType()
		 * @generated
		 */
		EEnum CONTENT_TYPE = eINSTANCE.getContentType();

	}

} //WebApplicationPackage
