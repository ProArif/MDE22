/**
 */
package it.mde.assignment4.model.webApplication.impl;

import it.mde.assignment4.model.webApplication.ConceptHub;
import it.mde.assignment4.model.webApplication.Individual;
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
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.impl.IndividualImpl#getConceptHub <em>Concept Hub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualImpl extends IndexImpl implements Individual {
	/**
	 * The cached value of the '{@link #getConceptHub() <em>Concept Hub</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptHub()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptHub> conceptHub;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApplicationPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptHub> getConceptHub() {
		if (conceptHub == null) {
			conceptHub = new EObjectContainmentEList<ConceptHub>(ConceptHub.class, this,
					WebApplicationPackage.INDIVIDUAL__CONCEPT_HUB);
		}
		return conceptHub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WebApplicationPackage.INDIVIDUAL__CONCEPT_HUB:
			return ((InternalEList<?>) getConceptHub()).basicRemove(otherEnd, msgs);
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
		case WebApplicationPackage.INDIVIDUAL__CONCEPT_HUB:
			return getConceptHub();
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
		case WebApplicationPackage.INDIVIDUAL__CONCEPT_HUB:
			getConceptHub().clear();
			getConceptHub().addAll((Collection<? extends ConceptHub>) newValue);
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
		case WebApplicationPackage.INDIVIDUAL__CONCEPT_HUB:
			getConceptHub().clear();
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
		case WebApplicationPackage.INDIVIDUAL__CONCEPT_HUB:
			return conceptHub != null && !conceptHub.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
