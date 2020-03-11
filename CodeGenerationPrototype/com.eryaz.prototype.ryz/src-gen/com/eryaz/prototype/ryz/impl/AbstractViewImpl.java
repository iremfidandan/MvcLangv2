/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.AbstractView;
import com.eryaz.prototype.ryz.HelperForSendingRequest;
import com.eryaz.prototype.ryz.Partial;
import com.eryaz.prototype.ryz.PresentationElement;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.AbstractViewImpl#getRenders <em>Renders</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.AbstractViewImpl#getHtmlelements <em>Htmlelements</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.AbstractViewImpl#getPresentationelement <em>Presentationelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractViewImpl extends MainComponentImpl implements AbstractView {
	/**
	 * The cached value of the '{@link #getRenders() <em>Renders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenders()
	 * @generated
	 * @ordered
	 */
	protected EList<Partial> renders;

	/**
	 * The cached value of the '{@link #getHtmlelements() <em>Htmlelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlelements()
	 * @generated
	 * @ordered
	 */
	protected EList<HelperForSendingRequest> htmlelements;

	/**
	 * The cached value of the '{@link #getPresentationelement() <em>Presentationelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationelement()
	 * @generated
	 * @ordered
	 */
	protected EList<PresentationElement> presentationelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.ABSTRACT_VÝEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Partial> getRenders() {
		if (renders == null) {
			renders = new EObjectResolvingEList<Partial>(Partial.class, this, RyzPackage.ABSTRACT_VÝEW__RENDERS);
		}
		return renders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HelperForSendingRequest> getHtmlelements() {
		if (htmlelements == null) {
			htmlelements = new EObjectContainmentEList<HelperForSendingRequest>(HelperForSendingRequest.class, this,
					RyzPackage.ABSTRACT_VÝEW__HTMLELEMENTS);
		}
		return htmlelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PresentationElement> getPresentationelement() {
		if (presentationelement == null) {
			presentationelement = new EObjectContainmentEList<PresentationElement>(PresentationElement.class, this,
					RyzPackage.ABSTRACT_VÝEW__PRESENTATÝONELEMENT);
		}
		return presentationelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.ABSTRACT_VÝEW__HTMLELEMENTS:
			return ((InternalEList<?>) getHtmlelements()).basicRemove(otherEnd, msgs);
		case RyzPackage.ABSTRACT_VÝEW__PRESENTATÝONELEMENT:
			return ((InternalEList<?>) getPresentationelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RyzPackage.ABSTRACT_VÝEW__RENDERS:
			return getRenders();
		case RyzPackage.ABSTRACT_VÝEW__HTMLELEMENTS:
			return getHtmlelements();
		case RyzPackage.ABSTRACT_VÝEW__PRESENTATÝONELEMENT:
			return getPresentationelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RyzPackage.ABSTRACT_VÝEW__RENDERS:
			getRenders().clear();
			getRenders().addAll((Collection<? extends Partial>) newValue);
			return;
		case RyzPackage.ABSTRACT_VÝEW__HTMLELEMENTS:
			getHtmlelements().clear();
			getHtmlelements().addAll((Collection<? extends HelperForSendingRequest>) newValue);
			return;
		case RyzPackage.ABSTRACT_VÝEW__PRESENTATÝONELEMENT:
			getPresentationelement().clear();
			getPresentationelement().addAll((Collection<? extends PresentationElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RyzPackage.ABSTRACT_VÝEW__RENDERS:
			getRenders().clear();
			return;
		case RyzPackage.ABSTRACT_VÝEW__HTMLELEMENTS:
			getHtmlelements().clear();
			return;
		case RyzPackage.ABSTRACT_VÝEW__PRESENTATÝONELEMENT:
			getPresentationelement().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RyzPackage.ABSTRACT_VÝEW__RENDERS:
			return renders != null && !renders.isEmpty();
		case RyzPackage.ABSTRACT_VÝEW__HTMLELEMENTS:
			return htmlelements != null && !htmlelements.isEmpty();
		case RyzPackage.ABSTRACT_VÝEW__PRESENTATÝONELEMENT:
			return presentationelement != null && !presentationelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractViewImpl
