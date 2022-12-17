/**
 */
package it.mde.assignment4.model.webApplication;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.mde.assignment4.model.webApplication.Individual#getConceptHub <em>Concept Hub</em>}</li>
 * </ul>
 *
 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends Index {
	/**
	 * Returns the value of the '<em><b>Concept Hub</b></em>' containment reference list.
	 * The list contents are of type {@link it.mde.assignment4.model.webApplication.ConceptHub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Hub</em>' containment reference list.
	 * @see it.mde.assignment4.model.webApplication.WebApplicationPackage#getIndividual_ConceptHub()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptHub> getConceptHub();

} // Individual
