/**
 */
package ClassDiagram.impl;

import ClassDiagram.Booking_Bill;
import ClassDiagram.Booking_PurchasedService;
import ClassDiagram.ClassDiagramPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Booking_BillImpl#getPaidAmount <em>Paid Amount</em>}</li>
 *   <li>{@link ClassDiagram.impl.Booking_BillImpl#getHasPurchaseditem <em>Has Purchaseditem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Booking_BillImpl extends MinimalEObjectImpl.Container implements Booking_Bill {
	/**
	 * The default value of the '{@link #getPaidAmount() <em>Paid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double PAID_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPaidAmount() <em>Paid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidAmount()
	 * @generated
	 * @ordered
	 */
	protected double paidAmount = PAID_AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasPurchaseditem() <em>Has Purchaseditem</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPurchaseditem()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking_PurchasedService> hasPurchaseditem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Booking_BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.BOOKING_BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPaidAmount() {
		return paidAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaidAmount(double newPaidAmount) {
		double oldPaidAmount = paidAmount;
		paidAmount = newPaidAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOKING_BILL__PAID_AMOUNT, oldPaidAmount, paidAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking_PurchasedService> getHasPurchaseditem() {
		if (hasPurchaseditem == null) {
			hasPurchaseditem = new EObjectResolvingEList<Booking_PurchasedService>(Booking_PurchasedService.class, this, ClassDiagramPackage.BOOKING_BILL__HAS_PURCHASEDITEM);
		}
		return hasPurchaseditem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_BILL__PAID_AMOUNT:
				return getPaidAmount();
			case ClassDiagramPackage.BOOKING_BILL__HAS_PURCHASEDITEM:
				return getHasPurchaseditem();
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
			case ClassDiagramPackage.BOOKING_BILL__PAID_AMOUNT:
				setPaidAmount((Double)newValue);
				return;
			case ClassDiagramPackage.BOOKING_BILL__HAS_PURCHASEDITEM:
				getHasPurchaseditem().clear();
				getHasPurchaseditem().addAll((Collection<? extends Booking_PurchasedService>)newValue);
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
			case ClassDiagramPackage.BOOKING_BILL__PAID_AMOUNT:
				setPaidAmount(PAID_AMOUNT_EDEFAULT);
				return;
			case ClassDiagramPackage.BOOKING_BILL__HAS_PURCHASEDITEM:
				getHasPurchaseditem().clear();
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
			case ClassDiagramPackage.BOOKING_BILL__PAID_AMOUNT:
				return paidAmount != PAID_AMOUNT_EDEFAULT;
			case ClassDiagramPackage.BOOKING_BILL__HAS_PURCHASEDITEM:
				return hasPurchaseditem != null && !hasPurchaseditem.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (paidAmount: ");
		result.append(paidAmount);
		result.append(')');
		return result.toString();
	}

} //Booking_BillImpl
