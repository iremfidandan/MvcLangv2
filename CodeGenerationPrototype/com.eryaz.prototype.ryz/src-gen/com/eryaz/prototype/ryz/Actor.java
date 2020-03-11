/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.Actor#getUsecase <em>Usecase</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Usecase</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.UseCase}.
	 * It is bidirectional and its opposite is '{@link com.eryaz.prototype.ryz.UseCase#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecase</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getActor_Usecase()
	 * @see com.eryaz.prototype.ryz.UseCase#getActor
	 * @model opposite="actor"
	 * @generated
	 */
	EList<UseCase> getUsecase();

} // Actor
