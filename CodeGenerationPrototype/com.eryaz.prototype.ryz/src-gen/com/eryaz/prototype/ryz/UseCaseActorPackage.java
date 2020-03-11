/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Actor Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.UseCaseActorPackage#getActors <em>Actors</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.UseCaseActorPackage#getUsecasepackages <em>Usecasepackages</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCaseActorPackage()
 * @model
 * @generated
 */
public interface UseCaseActorPackage extends com.eryaz.prototype.ryz.Package {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCaseActorPackage_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Usecasepackages</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.UseCasePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecasepackages</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCaseActorPackage_Usecasepackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<UseCasePackage> getUsecasepackages();

} // UseCaseActorPackage
