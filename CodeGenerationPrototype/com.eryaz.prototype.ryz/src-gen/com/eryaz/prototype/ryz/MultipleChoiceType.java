/**
 */
package com.eryaz.prototype.ryz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiple Choice Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.eryaz.prototype.ryz.RyzPackage#getMultipleChoiceType()
 * @model
 * @generated
 */
public enum MultipleChoiceType implements Enumerator {
	/**
	 * The '<em><b>RADIO BUTTON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_BUTTON_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_BUTTON(0, "RADIO_BUTTON", "RADIO_BUTTON"),

	/**
	 * The '<em><b>CHECKBOX GROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	CHECKBOX_GROUP(1, "CHECKBOX_GROUP", "CHECKBOX_GROUP"),

	/**
	 * The '<em><b>DROPDOWN LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	DROPDOWN_LIST(2, "DROPDOWN_LIST", "DROPDOWN_LIST");

	/**
	 * The '<em><b>RADIO BUTTON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_BUTTON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_BUTTON_VALUE = 0;

	/**
	 * The '<em><b>CHECKBOX GROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_GROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX_GROUP_VALUE = 1;

	/**
	 * The '<em><b>DROPDOWN LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN_LIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DROPDOWN_LIST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Multiple Choice Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultipleChoiceType[] VALUES_ARRAY = new MultipleChoiceType[] { RADIO_BUTTON, CHECKBOX_GROUP,
			DROPDOWN_LIST, };

	/**
	 * A public read-only list of all the '<em><b>Multiple Choice Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultipleChoiceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiple Choice Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultipleChoiceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleChoiceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Choice Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultipleChoiceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleChoiceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Choice Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultipleChoiceType get(int value) {
		switch (value) {
		case RADIO_BUTTON_VALUE:
			return RADIO_BUTTON;
		case CHECKBOX_GROUP_VALUE:
			return CHECKBOX_GROUP;
		case DROPDOWN_LIST_VALUE:
			return DROPDOWN_LIST;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleChoiceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //MultipleChoiceType
