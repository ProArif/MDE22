/**
 */
package it.mde.assignment4.model.webApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.Entity#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getEntity_Reference()
	 * @model containment="true"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link it.mde.assignment4.model.webApplication.Entity#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // Entity
