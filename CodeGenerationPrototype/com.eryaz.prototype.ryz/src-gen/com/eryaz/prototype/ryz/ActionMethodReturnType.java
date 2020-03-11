/**
 */
package com.eryaz.prototype.ryz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Method Return Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.eryaz.prototype.ryz.RyzPackage#getActionMethodReturnType()
 * @model
 * @generated
 */
public enum ActionMethodReturnType implements Enumerator {
	/**
	 * The '<em><b>View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VÝEW_VALUE
	 * @generated
	 * @ordered
	 */
	VÝEW(0, "View", "View"),

	/**
	 * The '<em><b>Partial View</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTÝAL_VÝEW_VALUE
	 * @generated
	 * @ordered
	 */
	PARTÝAL_VÝEW(1, "PartialView", "PartialView"),

	/**
	 * The '<em><b>Redirect To Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDÝRECT_TO_ACTÝON_VALUE
	 * @generated
	 * @ordered
	 */
	REDÝRECT_TO_ACTÝON(2, "RedirectToAction", "RedirectToAction"),

	/**
	 * The '<em><b>Json</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(3, "Json", "Json"),

	/**
	 * The '<em><b>Content</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT(4, "Content", "Content");

	/**
	 * The '<em><b>View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VÝEW
	 * @model name="View"
	 * @generated
	 * @ordered
	 */
	public static final int VÝEW_VALUE = 0;

	/**
	 * The '<em><b>Partial View</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTÝAL_VÝEW
	 * @model name="PartialView"
	 * @generated
	 * @ordered
	 */
	public static final int PARTÝAL_VÝEW_VALUE = 1;

	/**
	 * The '<em><b>Redirect To Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDÝRECT_TO_ACTÝON
	 * @model name="RedirectToAction"
	 * @generated
	 * @ordered
	 */
	public static final int REDÝRECT_TO_ACTÝON_VALUE = 2;

	/**
	 * The '<em><b>Json</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model name="Json"
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 3;

	/**
	 * The '<em><b>Content</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT
	 * @model name="Content"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Action Method Return Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionMethodReturnType[] VALUES_ARRAY = new ActionMethodReturnType[] { VÝEW, PARTÝAL_VÝEW,
			REDÝRECT_TO_ACTÝON, JSON, CONTENT, };

	/**
	 * A public read-only list of all the '<em><b>Action Method Return Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionMethodReturnType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Method Return Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionMethodReturnType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionMethodReturnType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Method Return Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionMethodReturnType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionMethodReturnType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Method Return Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActionMethodReturnType get(int value) {
		switch (value) {
		case VÝEW_VALUE:
			return VÝEW;
		case PARTÝAL_VÝEW_VALUE:
			return PARTÝAL_VÝEW;
		case REDÝRECT_TO_ACTÝON_VALUE:
			return REDÝRECT_TO_ACTÝON;
		case JSON_VALUE:
			return JSON;
		case CONTENT_VALUE:
			return CONTENT;
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
	private ActionMethodReturnType(int value, String name, String literal) {
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

} //ActionMethodReturnType
