/**
 */
package it.mde.assignment4.model.webApplication.impl;

import it.mde.assignment4.model.webApplication.Content;
import it.mde.assignment4.model.webApplication.DynamicContent;
import it.mde.assignment4.model.webApplication.StaticContent;
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
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.ContentImpl#getSContent <em>SContent</em>}</li>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.ContentImpl#getDcontent <em>Dcontent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentImpl extends NamedElementImpl implements Content {
	/**
	 * The cached value of the '{@link #getSContent() <em>SContent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSContent()
	 * @generated
	 * @ordered
	 */
	protected EList<StaticContent> sContent;

	/**
	 * The cached value of the '{@link #getDcontent() <em>Dcontent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcontent()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicContent> dcontent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaticContent> getSContent() {
		if (sContent == null) {
			sContent = new EObjectContainmentEList<StaticContent>(StaticContent.class, this,
					WebApplicationPackage.CONTENT__SCONTENT);
		}
		return sContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicContent> getDcontent() {
		if (dcontent == null) {
			dcontent = new EObjectContainmentEList<DynamicContent>(DynamicContent.class, this,
					WebApplicationPackage.CONTENT__DCONTENT);
		}
		return dcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebApplicationPackage.CONTENT__SCONTENT:
			return ((InternalEList<?>) getSContent()).basicRemove(otherEnd, msgs);
		case WebApplicationPackage.CONTENT__DCONTENT:
			return ((InternalEList<?>) getDcontent()).basicRemove(otherEnd, msgs);
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
		case WebApplicationPackage.CONTENT__SCONTENT:
			return getSContent();
		case WebApplicationPackage.CONTENT__DCONTENT:
			return getDcontent();
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
		case WebApplicationPackage.CONTENT__SCONTENT:
			getSContent().clear();
			getSContent().addAll((Collection<? extends StaticContent>) newValue);
			return;
		case WebApplicationPackage.CONTENT__DCONTENT:
			getDcontent().clear();
			getDcontent().addAll((Collection<? extends DynamicContent>) newValue);
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
		case WebApplicationPackage.CONTENT__SCONTENT:
			getSContent().clear();
			return;
		case WebApplicationPackage.CONTENT__DCONTENT:
			getDcontent().clear();
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
		case WebApplicationPackage.CONTENT__SCONTENT:
			return sContent != null && !sContent.isEmpty();
		case WebApplicationPackage.CONTENT__DCONTENT:
			return dcontent != null && !dcontent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentImpl
