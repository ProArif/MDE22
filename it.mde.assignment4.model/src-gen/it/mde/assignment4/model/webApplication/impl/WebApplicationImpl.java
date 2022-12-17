/**
 */
package it.mde.assignment4.model.webApplication.impl;

import it.mde.assignment4.model.webApplication.Entity;
import it.mde.assignment4.model.webApplication.Form;
import it.mde.assignment4.model.webApplication.Page;
import it.mde.assignment4.model.webApplication.WebApplication;
import it.mde.assignment4.model.webApplication.WebApplicationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.WebApplicationImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.WebApplicationImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.WebApplicationImpl#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebApplicationImpl extends NamedElementImpl implements WebApplication {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.WEB_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this,
					WebApplicationPackage.WEB_APPLICATION__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, WebApplicationPackage.WEB_APPLICATION__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, WebApplicationPackage.WEB_APPLICATION__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebApplicationPackage.WEB_APPLICATION__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
		case WebApplicationPackage.WEB_APPLICATION__FORMS:
			return ((InternalEList<?>) getForms()).basicRemove(otherEnd, msgs);
		case WebApplicationPackage.WEB_APPLICATION__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
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
		case WebApplicationPackage.WEB_APPLICATION__ENTITIES:
			return getEntities();
		case WebApplicationPackage.WEB_APPLICATION__FORMS:
			return getForms();
		case WebApplicationPackage.WEB_APPLICATION__PAGES:
			return getPages();
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
		case WebApplicationPackage.WEB_APPLICATION__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
			return;
		case WebApplicationPackage.WEB_APPLICATION__FORMS:
			getForms().clear();
			getForms().addAll((Collection<? extends Form>) newValue);
			return;
		case WebApplicationPackage.WEB_APPLICATION__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends Page>) newValue);
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
		case WebApplicationPackage.WEB_APPLICATION__ENTITIES:
			getEntities().clear();
			return;
		case WebApplicationPackage.WEB_APPLICATION__FORMS:
			getForms().clear();
			return;
		case WebApplicationPackage.WEB_APPLICATION__PAGES:
			getPages().clear();
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
		case WebApplicationPackage.WEB_APPLICATION__ENTITIES:
			return entities != null && !entities.isEmpty();
		case WebApplicationPackage.WEB_APPLICATION__FORMS:
			return forms != null && !forms.isEmpty();
		case WebApplicationPackage.WEB_APPLICATION__PAGES:
			return pages != null && !pages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WebApplicationImpl
