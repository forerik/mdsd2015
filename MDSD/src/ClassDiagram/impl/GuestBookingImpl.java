/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.GuestBooking;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Room_RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GuestBookingImpl extends MinimalEObjectImpl.Container implements GuestBooking {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.GUEST_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBooking(Date start, Date end, Hotel_Room rooms, Company_GuestRecord guest) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findAvailableRooms(Date start, Date end, Room_RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editBooking(Hotel_Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(Hotel_Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBooking(int bookingNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookings(Company_GuestRecord guest) {
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
			case ClassDiagramPackage.GUEST_BOOKING___CREATE_BOOKING__DATE_DATE_HOTEL_ROOM_COMPANY_GUESTRECORD:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (Hotel_Room)arguments.get(2), (Company_GuestRecord)arguments.get(3));
				return null;
			case ClassDiagramPackage.GUEST_BOOKING___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE:
				findAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (Room_RoomType)arguments.get(2));
				return null;
			case ClassDiagramPackage.GUEST_BOOKING___EDIT_BOOKING__HOTEL_BOOKING:
				editBooking((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.GUEST_BOOKING___CANCEL_BOOKING__HOTEL_BOOKING:
				cancelBooking((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.GUEST_BOOKING___FIND_BOOKING__INT:
				findBooking((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.GUEST_BOOKING___GET_BOOKINGS__COMPANY_GUESTRECORD:
				getBookings((Company_GuestRecord)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GuestBookingImpl
