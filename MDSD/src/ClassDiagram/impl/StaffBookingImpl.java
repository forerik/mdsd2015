/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Room;
import ClassDiagram.StaffBooking;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StaffBookingImpl extends MinimalEObjectImpl.Container implements StaffBooking {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.STAFF_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBooking(Date date, String guestSSN) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(Hotel_Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(Hotel_Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assignKey(Hotel_Room rooms, Hotel_Booking booking, Date expirationDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBooking(Date date, int roomNr) {
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
			case ClassDiagramPackage.STAFF_BOOKING___FIND_BOOKING__DATE_STRING:
				findBooking((Date)arguments.get(0), (String)arguments.get(1));
				return null;
			case ClassDiagramPackage.STAFF_BOOKING___CHECK_IN__HOTEL_BOOKING:
				checkIn((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.STAFF_BOOKING___CHECK_OUT__HOTEL_BOOKING:
				checkOut((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.STAFF_BOOKING___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE:
				assignKey((Hotel_Room)arguments.get(0), (Hotel_Booking)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ClassDiagramPackage.STAFF_BOOKING___FIND_BOOKING__DATE_INT:
				findBooking((Date)arguments.get(0), (Integer)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffBookingImpl
