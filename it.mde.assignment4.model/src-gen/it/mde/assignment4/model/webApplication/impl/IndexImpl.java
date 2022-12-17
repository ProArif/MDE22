/**
 */
package it.mde.assignment4.model.webApplication.impl;

import it.mde.assignment4.model.webApplication.Attribute;
import it.mde.assignment4.model.webApplication.Index;
import it.mde.assignment4.model.webApplication.WebApplicationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.IndexImpl#getIndexedAttribute <em>Indexed Attribute</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.IndexImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends MinimalEObjectImpl.Container implements Index {
	/**
	 * The cached value of the '{@link #getIndexedAttribute() <em>Indexed Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexedAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute indexedAttribute;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getIndexedAttribute() {
		if (indexedAttribute != null && indexedAttribute.eIsProxy()) {
			InternalEObject oldIndexedAttribute = (InternalEObject) indexedAttribute;
			indexedAttribute = (Attribute) eResolveProxy(oldIndexedAttribute);
			if (indexedAttribute != oldIndexedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WebApplicationPackage.INDEX__INDEXED_ATTRIBUTE, oldIndexedAttribute, indexedAttribute));
			}
		}
		return indexedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetIndexedAttribute() {
		return indexedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexedAttribute(Attribute newIndexedAttribute) {
		Attribute oldIndexedAttribute = indexedAttribute;
		indexedAttribute = newIndexedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.INDEX__INDEXED_ATTRIBUTE,
					oldIndexedAttribute, indexedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.INDEX__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebApplicationPackage.INDEX__INDEXED_ATTRIBUTE:
			if (resolve)
				return getIndexedAttribute();
			return basicGetIndexedAttribute();
		case WebApplicationPackage.INDEX__ORDER:
			return getOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WebApplicationPackage.INDEX__INDEXED_ATTRIBUTE:
			setIndexedAttribute((Attribute) newValue);
			return;
		case WebApplicationPackage.INDEX__ORDER:
			setOrder((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WebApplicationPackage.INDEX__INDEXED_ATTRIBUTE:
			setIndexedAttribute((Attribute) null);
			return;
		case WebApplicationPackage.INDEX__ORDER:
			setOrder(ORDER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WebApplicationPackage.INDEX__INDEXED_ATTRIBUTE:
			return indexedAttribute != null;
		case WebApplicationPackage.INDEX__ORDER:
			return order != ORDER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //IndexImpl
