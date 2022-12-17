/**
 */
package it.mde.assignment4.model.webApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.Form#getElements <em>Elements</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.Form#getMethod <em>Method</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.Form#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getForm_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link it.mde.assignment4.model.webApplication.MethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see it.mde.assignment4.model.webApplication.MethodType
	 * @see #setMethod(MethodType)
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getForm_Method()
	 * @model
	 * @generated
	 */
	MethodType getMethod();

	/**
	 * Sets the value of the '{@link it.mde.assignment4.model.webApplication.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see it.mde.assignment4.model.webApplication.MethodType
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(MethodType value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getForm_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link it.mde.assignment4.model.webApplication.Form#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Form
