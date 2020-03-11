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
	protected static final MultipleChoiceType MULT�PLE_CHO�CE_TYPE_EDEFAULT = MultipleChoiceType.RADIO_BUTTON;

	/**
	 * The cached value of the '{@link #getMultipleChoiceType() <em>Multiple Choice Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleChoiceType()
	 * @generated
	 * @ordered
	 */
	protected MultipleChoiceType multipleChoiceType = MULT�PLE_CHO�CE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMultipleSelection() <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULT�PLE_SELECT�ON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultipleSelection() <em>Multiple Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleSelection = MULT�PLE_SELECT�ON_EDEFAULT;

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
		return RyzPackage.Literals.MULT�PLE_CHO�CE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Choice> getChoice() {
		if (choice == null) {
			choice = new EObjectContainmentEList<Choice>(Choice.class, this, RyzPackage.MULT�PLE_CHO�CE__CHO�CE);
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
		multipleChoiceType = newMultipleChoiceType == null ? MULT�PLE_CHO�CE_TYPE_EDEFAULT : newMultipleChoiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_CHO�CE_TYPE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_SELECT�ON,
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
		case RyzPackage.MULT�PLE_CHO�CE__CHO�CE:
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
		case RyzPackage.MULT�PLE_CHO�CE__CHO�CE:
			return getChoice();
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_CHO�CE_TYPE:
			return getMultipleChoiceType();
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_SELECT�ON:
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
		case RyzPackage.MULT�PLE_CHO�CE__CHO�CE:
			getChoice().clear();
			getChoice().addAll((Collection<? extends Choice>) newValue);
			return;
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_CHO�CE_TYPE:
			setMultipleChoiceType((MultipleChoiceType) newValue);
			return;
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_SELECT�ON:
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
		case RyzPackage.MULT�PLE_CHO�CE__CHO�CE:
			getChoice().clear();
			return;
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_CHO�CE_TYPE:
			setMultipleChoiceType(MULT�PLE_CHO�CE_TYPE_EDEFAULT);
			return;
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_SELECT�ON:
			setMultipleSelection(MULT�PLE_SELECT�ON_EDEFAULT);
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
		case RyzPackage.MULT�PLE_CHO�CE__CHO�CE:
			return choice != null && !choice.isEmpty();
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_CHO�CE_TYPE:
			return multipleChoiceType != MULT�PLE_CHO�CE_TYPE_EDEFAULT;
		case RyzPackage.MULT�PLE_CHO�CE__MULT�PLE_SELECT�ON:
			return multipleSelection != MULT�PLE_SELECT�ON_EDEFAULT;
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
