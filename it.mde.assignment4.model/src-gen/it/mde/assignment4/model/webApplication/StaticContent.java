/**
 */
package it.mde.assignment4.model.webApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.StaticContent#getContentStyle <em>Content Style</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getStaticContent()
 * @model
 * @generated
 */
public interface StaticContent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Content Style</b></em>' attribute.
	 * The literals are from the enumeration {@link it.mde.assignment4.model.webApplication.ContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Style</em>' attribute.
	 * @see it.mde.assignment4.model.webApplication.ContentType
	 * @see #setContentStyle(ContentType)
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getStaticContent_ContentStyle()
	 * @model
	 * @generated
	 */
	ContentType getContentStyle();

	/**
	 * Sets the value of the '{@link it.mde.assignment4.model.webApplication.StaticContent#getContentStyle <em>Content Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Style</em>' attribute.
	 * @see it.mde.assignment4.model.webApplication.ContentType
	 * @see #getContentStyle()
	 * @generated
	 */
	void setContentStyle(ContentType value);

} // StaticContent
