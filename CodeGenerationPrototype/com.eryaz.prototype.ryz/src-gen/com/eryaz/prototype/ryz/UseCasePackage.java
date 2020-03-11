/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.UseCasePackage#getUsecases <em>Usecases</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCasePackage()
 * @model
 * @generated
 */
public interface UseCasePackage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usecases</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecases</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCasePackage_Usecases()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCase> getUsecases();

} // UseCasePackage
