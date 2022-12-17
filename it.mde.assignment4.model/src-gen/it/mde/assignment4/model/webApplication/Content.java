/**
 */
package it.mde.assignment4.model.webApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.Content#getSContent <em>SContent</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.Content#getDcontent <em>Dcontent</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getContent()
 * @model
 * @generated
 */
public interface Content extends NamedElement {
	/**
	 * Returns the value of the '<em><b>SContent</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.StaticContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SContent</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getContent_SContent()
	 * @model containment="true"
	 * @generated
	 */
	EList<StaticContent> getSContent();

	/**
	 * Returns the value of the '<em><b>Dcontent</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.DynamicContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dcontent</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getContent_Dcontent()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicContent> getDcontent();

} // Content
