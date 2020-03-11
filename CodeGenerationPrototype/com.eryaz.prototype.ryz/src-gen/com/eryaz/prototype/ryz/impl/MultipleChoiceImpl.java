/**
 */
package com.eryaz.prototype.ryz.impl;

import com.eryaz.prototype.ryz.Choice;
import com.eryaz.prototype.ryz.MultipleChoice;
import com.eryaz.prototype.ryz.MultipleChoiceType;
import com.eryaz.prototype.ryz.RyzPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.eryaz.prototype.ryz.impl.MultipleChoiceImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.MultipleChoiceImpl#getMultipleChoiceType <em>Multiple Choice Type</em>}</li>
 *   <li>{@link com.eryaz.prototype.ryz.impl.MultipleChoiceImpl#isMultipleSelection <em>Multiple Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleChoiceImpl extends PresentationFormElementImpl implements MultipleChoice {
	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<Choice> choice;

	/**
	 * The default value of the '{@link #getMultipleChoiceType() <em>Multiple Choice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceType()
	 * @generated
	 * @ordered
	 */
	protected static final MultipleChoiceType MULTÝPLE_CHOÝCE_TYPE_EDEFAULT = MultipleChoiceType.RADIO_BUTTON;

	/**
	 * The cached value of the '{@link #getMultipleChoiceType() <em>Multiple Choice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceType()
	 * @generated
	 * @ordered
	 */
	protected MultipleChoiceType multipleChoiceType = MULTÝPLE_CHOÝCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultipleSelection() <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTÝPLE_SELECTÝON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleSelection() <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleSelection = MULTÝPLE_SELECTÝON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RyzPackage.Literals.MULTÝPLE_CHOÝCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Choice> getChoice() {
		if (choice == null) {
			choice = new EObjectContainmentEList<Choice>(Choice.class, this, RyzPackage.MULTÝPLE_CHOÝCE__CHOÝCE);
		}
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultipleChoiceType getMultipleChoiceType() {
		return multipleChoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleChoiceType(MultipleChoiceType newMultipleChoiceType) {
		MultipleChoiceType oldMultipleChoiceType = multipleChoiceType;
		multipleChoiceType = newMultipleChoiceType == null ? MULTÝPLE_CHOÝCE_TYPE_EDEFAULT : newMultipleChoiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_CHOÝCE_TYPE,
					oldMultipleChoiceType, multipleChoiceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMultipleSelection() {
		return multipleSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleSelection(boolean newMultipleSelection) {
		boolean oldMultipleSelection = multipleSelection;
		multipleSelection = newMultipleSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_SELECTÝON,
					oldMultipleSelection, multipleSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RyzPackage.MULTÝPLE_CHOÝCE__CHOÝCE:
			return ((InternalEList<?>) getChoice()).basicRemove(otherEnd, msgs);
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
		case RyzPackage.MULTÝPLE_CHOÝCE__CHOÝCE:
			return getChoice();
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_CHOÝCE_TYPE:
			return getMultipleChoiceType();
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_SELECTÝON:
			return isMultipleSelection();
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
		case RyzPackage.MULTÝPLE_CHOÝCE__CHOÝCE:
			getChoice().clear();
			getChoice().addAll((Collection<? extends Choice>) newValue);
			return;
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_CHOÝCE_TYPE:
			setMultipleChoiceType((MultipleChoiceType) newValue);
			return;
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_SELECTÝON:
			setMultipleSelection((Boolean) newValue);
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
		case RyzPackage.MULTÝPLE_CHOÝCE__CHOÝCE:
			getChoice().clear();
			return;
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_CHOÝCE_TYPE:
			setMultipleChoiceType(MULTÝPLE_CHOÝCE_TYPE_EDEFAULT);
			return;
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_SELECTÝON:
			setMultipleSelection(MULTÝPLE_SELECTÝON_EDEFAULT);
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
		case RyzPackage.MULTÝPLE_CHOÝCE__CHOÝCE:
			return choice != null && !choice.isEmpty();
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_CHOÝCE_TYPE:
			return multipleChoiceType != MULTÝPLE_CHOÝCE_TYPE_EDEFAULT;
		case RyzPackage.MULTÝPLE_CHOÝCE__MULTÝPLE_SELECTÝON:
			return multipleSelection != MULTÝPLE_SELECTÝON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (multipleChoiceType: ");
		result.append(multipleChoiceType);
		result.append(", multipleSelection: ");
		result.append(multipleSelection);
		result.append(')');
		return result.toString();
	}

} //MultipleChoiceImpl
