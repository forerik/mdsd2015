/**
 */
package ClassDiagram.impl;

import ClassDiagram.BillManager;
import ClassDiagram.Booking_Bill;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Booking;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BillManagerImpl extends MinimalEObjectImpl.Container implements BillManager {
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
	public void addPurchesedService(Booking_Bill bill, String item, double amount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBill(Hotel_Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createReceipt(Booking_Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAmount(Booking_Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pay(Booking_Bill bill, double amount) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.BILL_MANAGER___ADD_PURCHESED_SERVICE__BOOKING_BILL_STRING_DOUBLE:
				addPurchesedService((Booking_Bill)arguments.get(0), (String)arguments.get(1), (Double)arguments.get(2));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___FIND_BILL__HOTEL_BOOKING:
				findBill((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___CREATE_RECEIPT__BOOKING_BILL:
				createReceipt((Booking_Bill)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___GET_AMOUNT__BOOKING_BILL:
				getAmount((Booking_Bill)arguments.get(0));
				return null;
			case ClassDiagramPackage.BILL_MANAGER___PAY__BOOKING_BILL_DOUBLE:
				pay((Booking_Bill)arguments.get(0), (Double)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillManagerImpl
