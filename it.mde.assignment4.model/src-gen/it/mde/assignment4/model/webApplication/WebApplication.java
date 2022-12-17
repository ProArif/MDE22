/**
 */
package it.mde.assignment4.model.webApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.WebApplication#getEntities <em>Entities</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.WebApplication#getForms <em>Forms</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.WebApplication#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getWebApplication()
 * @model
 * @generated
 */
public interface WebApplication extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getWebApplication_Entities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getWebApplication_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getWebApplication_Pages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPages();

} // WebApplication
