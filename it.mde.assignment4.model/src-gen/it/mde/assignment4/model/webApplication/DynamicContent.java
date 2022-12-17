/**
 */
package it.mde.assignment4.model.webApplication;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.DynamicContent#getEntity <em>Entity</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.DynamicContent#getIndividualData <em>Individual Data</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getDynamicContent()
 * @model
 * @generated
 */
public interface DynamicContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getDynamicContent_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link it.mde.assignment4.model.webApplication.DynamicContent#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Individual Data</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Data</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getDynamicContent_IndividualData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getIndividualData();

} // DynamicContent
