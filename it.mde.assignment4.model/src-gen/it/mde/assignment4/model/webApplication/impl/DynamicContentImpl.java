/**
 */
package it.mde.assignment4.model.webApplication.impl;

import it.mde.assignment4.model.webApplication.DynamicContent;
import it.mde.assignment4.model.webApplication.Entity;
import it.mde.assignment4.model.webApplication.Individual;
import it.mde.assignment4.model.webApplication.WebApplicationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.DynamicContentImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.DynamicContentImpl#getIndividualData <em>Individual Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicContentImpl extends MinimalEObjectImpl.Container implements DynamicContent {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getIndividualData() <em>Individual Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualData()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> individualData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.DYNAMIC_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (Entity) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WebApplicationPackage.DYNAMIC_CONTENT__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApplicationPackage.DYNAMIC_CONTENT__ENTITY,
					oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getIndividualData() {
		if (individualData == null) {
			individualData = new EObjectContainmentEList<Individual>(Individual.class, this,
					WebApplicationPackage.DYNAMIC_CONTENT__INDIVIDUAL_DATA);
		}
		return individualData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebApplicationPackage.DYNAMIC_CONTENT__INDIVIDUAL_DATA:
			return ((InternalEList<?>) getIndividualData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
		case WebApplicationPackage.DYNAMIC_CONTENT__INDIVIDUAL_DATA:
			return getIndividualData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
			setEntity((Entity) newValue);
			return;
		case WebApplicationPackage.DYNAMIC_CONTENT__INDIVIDUAL_DATA:
			getIndividualData().clear();
			getIndividualData().addAll((Collection<? extends Individual>) newValue);
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
		case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
			setEntity((Entity) null);
			return;
		case WebApplicationPackage.DYNAMIC_CONTENT__INDIVIDUAL_DATA:
			getIndividualData().clear();
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
		case WebApplicationPackage.DYNAMIC_CONTENT__ENTITY:
			return entity != null;
		case WebApplicationPackage.DYNAMIC_CONTENT__INDIVIDUAL_DATA:
			return individualData != null && !individualData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicContentImpl
