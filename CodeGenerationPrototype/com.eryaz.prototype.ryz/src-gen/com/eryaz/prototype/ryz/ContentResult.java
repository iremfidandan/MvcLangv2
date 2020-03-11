/**
 */
package com.eryaz.prototype.ryz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.ContentResult#getContentType <em>Content Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.ContentResult#getContentEncoding <em>Content Encoding</em>}</li>
 * </ul>
 *
 * @see com.eryaz.prototype.ryz.RyzPackage#getContentResult()
 * @model
 * @generated
 */
public interface ContentResult extends ActionMethod {
	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getContentResult_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ContentResult#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Content Encoding</b></em>' attribute.
	 * The literals are from the enumeration {@link com.eryaz.prototype.ryz.ContentEncoding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Encoding</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ContentEncoding
	 * @see #setContentEncoding(ContentEncoding)
	 * @see com.eryaz.prototype.ryz.RyzPackage#getContentResult_ContentEncoding()
	 * @model
	 * @generated
	 */
	ContentEncoding getContentEncoding();

	/**
	 * Sets the value of the '{@link com.eryaz.prototype.ryz.ContentResult#getContentEncoding <em>Content Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Encoding</em>' attribute.
	 * @see com.eryaz.prototype.ryz.ContentEncoding
	 * @see #getContentEncoding()
	 * @generated
	 */
	void setContentEncoding(ContentEncoding value);

} // ContentResult
