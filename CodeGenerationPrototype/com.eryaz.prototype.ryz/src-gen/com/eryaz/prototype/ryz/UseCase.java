/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.UseCase#getActor <em>Actor</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.UseCase#getHelperforsendingrequest <em>Helperforsendingrequest</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.UseCase#getActionmethod <em>Actionmethod</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Actor}.
	 * It is bidirectional and its opposite is '{@link com.eryaz.prototype.ryz.Actor#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCase_Actor()
	 * @see com.eryaz.prototype.ryz.Actor#getUsecase
	 * @model opposite="usecase"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Helperforsendingrequest</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.HelperForSendingRequest}.
	 * It is bidirectional and its opposite is '{@link com.eryaz.prototype.ryz.HelperForSendingRequest#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helperforsendingrequest</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCase_Helperforsendingrequest()
	 * @see com.eryaz.prototype.ryz.HelperForSendingRequest#getUsecase
	 * @model opposite="usecase"
	 * @generated
	 */
	EList<HelperForSendingRequest> getHelperforsendingrequest();

	/**
	 * Returns the value of the '<em><b>Actionmethod</b></em>' reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.ActionMethod}.
	 * It is bidirectional and its opposite is '{@link com.eryaz.prototype.ryz.ActionMethod#getUsecase <em>Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionmethod</em>' reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getUseCase_Actionmethod()
	 * @see com.eryaz.prototype.ryz.ActionMethod#getUsecase
	 * @model opposite="usecase"
	 * @generated
	 */
	EList<ActionMethod> getActionmethod();

} // UseCase
