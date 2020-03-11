/**
 */
package com.eryaz.prototype.ryz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.MultipleChoice#getChoice <em>Choice</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.MultipleChoice#getMultipleChoiceType <em>Multiple Choice Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.MultipleChoice#isMultipleSelection <em>Multiple Selection</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends PresentationFormElement {
	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link com.eryaz.prototype.ryz.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see com.eryaz.prototype.ryz.RyzPackage#getMultipleChoice_Choice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Choice> getChoice();

	/**
	 * Returns the value of the '<em><b>Multiple Choice Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.MultipleChoiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Choice Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.MultipleChoiceType
	 * @see #setMultipleChoiceType(MultipleChoiceType)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getMultipleChoice_MultipleChoiceType()
	 * @model required="true"
	 * @generated
	 */
	MultipleChoiceType getMultipleChoiceType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.MultipleChoice#getMultipleChoiceType <em>Multiple Choice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Choice Type</em>' attribute.
	 * @see com.eryaz.prototype.ryz.MultipleChoiceType
	 * @see #getMultipleChoiceType()
	 * @generated
	 */
	void setMultipleChoiceType(MultipleChoiceType value);

	/**
	 * Returns the value of the '<em><b>Multiple Selection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Selection</em>' attribute.
	 * @see #setMultipleSelection(boolean)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getMultipleChoice_MultipleSelection()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMultipleSelection();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.MultipleChoice#isMultipleSelection <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Selection</em>' attribute.
	 * @see #isMultipleSelection()
	 * @generated
	 */
	void setMultipleSelection(boolean value);

} // MultipleChoice
