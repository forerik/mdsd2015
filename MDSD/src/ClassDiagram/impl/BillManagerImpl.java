/**
 */
package ClassDiagram.impl;

import ClassDiagram.BillManager;
import ClassDiagram.ClassDiagramPackage;

import ClassDiagram.Company_Hotel;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.BillManagerImpl#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillManagerImpl extends MinimalEObjectImpl.Container implements BillManager {
	/**
	 * The cached value of the '{@link #getHotel() <em>Hotel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotel()
	 * @generated
	 * @ordered
	 */
	protected Company_Hotel hotel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.BILL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company_Hotel getHotel() {
		if (hotel != null && hotel.eIsProxy()) {
			InternalEObject oldHotel = (InternalEObject)hotel;
			hotel = (Company_Hotel)eResolveProxy(oldHotel);
			if (hotel != oldHotel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.BILL_MANAGER__HOTEL, oldHotel, hotel));
			}
		}
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company_Hotel basicGetHotel() {
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotel(Company_Hotel newHotel) {
		Company_Hotel oldHotel = hotel;
		hotel = newHotel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BILL_MANAGER__HOTEL, oldHotel, hotel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPurchasedService(String bookingID, String item, double amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBill(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createReceipt(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAmount(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pay(int bookingID, double amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BILL_MANAGER__HOTEL:
				if (resolve) return getHotel();
				return basicGetHotel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.BILL_MANAGER__HOTEL:
				setHotel((Company_Hotel)newValue);
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
			case ClassDiagramPackage.BILL_MANAGER__HOTEL:
				setHotel((Company_Hotel)null);
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
			case ClassDiagramPackage.BILL_MANAGER__HOTEL:
				return hotel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.BILL_MANAGER___ADD_PURCHASED_SERVICE__STRING_STRING_DOUBLE:
				addPurchasedService((String)arguments.get(0), (String)arguments.get(1), (Double)arguments.get(2));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___FIND_BILL__INT:
				findBill((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___CREATE_RECEIPT__INT:
				createReceipt((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___GET_AMOUNT__INT:
				getAmount((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___PAY__INT_DOUBLE:
				pay((Integer)arguments.get(0), (Double)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillManagerImpl
