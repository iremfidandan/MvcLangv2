/**
 */
package com.eryaz.prototype.ryz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Content Encoding</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.eryaz.prototype.ryz.RyzPackage#getContentEncoding()
 * @model
 * @generated
 */
public enum ContentEncoding implements Enumerator {
	/**
	 * The '<em><b>ASCII Encoding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCII_ENCOD�NG_VALUE
	 * @generated
	 * @ordered
	 */
	ASCII_ENCOD�NG(0, "ASCIIEncoding", "ASCIIEncoding"),

	/**
	 * The '<em><b>Unicode Encoding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UN�CODE_ENCOD�NG_VALUE
	 * @generated
	 * @ordered
	 */
	UN�CODE_ENCOD�NG(1, "UnicodeEncoding", "UnicodeEncoding"),

	/**
	 * The '<em><b>UTF32 Encoding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF32_ENCOD�NG_VALUE
	 * @generated
	 * @ordered
	 */
	UTF32_ENCOD�NG(2, "UTF32Encoding", "UTF32Encoding"),

	/**
	 * The '<em><b>UTF7 Encoding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF7_ENCOD�NG_VALUE
	 * @generated
	 * @ordered
	 */
	UTF7_ENCOD�NG(3, "UTF7Encoding", "UTF7Encoding"),

	/**
	 * The '<em><b>UTF8 Encoding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTF8_ENCOD�NG_VALUE
	 * @generated
	 * @ordered
	 */
	UTF8_ENCOD�NG(4, "UTF8Encoding", "UTF8Encoding");

	/**
	 * The '<em><b>ASCII Encoding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASCII Encoding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASCII_ENCOD�NG
	 * @model name="ASCIIEncoding"
	 * @generated
	 * @ordered
	 */
	public static final int ASCII_ENCOD�NG_VALUE = 0;

	/**
	 * The '<em><b>Unicode Encoding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unicode Encoding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UN�CODE_ENCOD�NG
	 * @model name="UnicodeEncoding"
	 * @generated
	 * @ordered
	 */
	public static final int UN�CODE_ENCOD�NG_VALUE = 1;

	/**
	 * The '<em><b>UTF32 Encoding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF32 Encoding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF32_ENCOD�NG
	 * @model name="UTF32Encoding"
	 * @generated
	 * @ordered
	 */
	public static final int UTF32_ENCOD�NG_VALUE = 2;

	/**
	 * The '<em><b>UTF7 Encoding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF7 Encoding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF7_ENCOD�NG
	 * @model name="UTF7Encoding"
	 * @generated
	 * @ordered
	 */
	public static final int UTF7_ENCOD�NG_VALUE = 3;

	/**
	 * The '<em><b>UTF8 Encoding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTF8 Encoding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTF8_ENCOD�NG
	 * @model name="UTF8Encoding"
	 * @generated
	 * @ordered
	 */
	public static final int UTF8_ENCOD�NG_VALUE = 4;

	/**
	 * An array of all the '<em><b>Content Encoding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContentEncoding[] VALUES_ARRAY = new ContentEncoding[] { ASCII_ENCOD�NG, UN�CODE_ENCOD�NG,
			UTF32_ENCOD�NG, UTF7_ENCOD�NG, UTF8_ENCOD�NG, };

	/**
	 * A public read-only list of all the '<em><b>Content Encoding</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentEncoding> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Content Encoding</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentEncoding get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentEncoding result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Encoding</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentEncoding getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentEncoding result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Encoding</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentEncoding get(int value) {
		switch (value) {
		case ASCII_ENCOD�NG_VALUE:
			return ASCII_ENCOD�NG;
		case UN�CODE_ENCOD�NG_VALUE:
			return UN�CODE_ENCOD�NG;
		case UTF32_ENCOD�NG_VALUE:
			return UTF32_ENCOD�NG;
		case UTF7_ENCOD�NG_VALUE:
			return UTF7_ENCOD�NG;
		case UTF8_ENCOD�NG_VALUE:
			return UTF8_ENCOD�NG;
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
	private ContentEncoding(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //ContentEncoding
