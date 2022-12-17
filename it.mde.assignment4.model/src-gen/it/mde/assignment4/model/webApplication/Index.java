/**
 */
package it.mde.assignment4.model.webApplication;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.Index#getIndexedAttribute <em>Indexed Attribute</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.Index#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Indexed Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexed Attribute</em>' reference.
	 * @see #setIndexedAttribute(Attribute)
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getIndex_IndexedAttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getIndexedAttribute();

	/**
	 * Sets the value of the '{@link it.mde.assignment4.model.webApplication.Index#getIndexedAttribute <em>Indexed Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed Attribute</em>' reference.
	 * @see #getIndexedAttribute()
	 * @generated
	 */
	void setIndexedAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getIndex_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link it.mde.assignment4.model.webApplication.Index#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

} // Index
