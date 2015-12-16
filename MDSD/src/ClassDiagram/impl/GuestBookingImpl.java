/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Company_Hotel;
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
	
	Company_Hotel hotel;
	
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
	 * @generated NOT
	 */
	public void createBooking(Date start, Date end, EList<Hotel_RoomImpl> rooms, Company_GuestRecord guest) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		Hotel_BookingImpl booking = new Hotel_BookingImpl();
		booking.setStartDate(start);
		booking.setEndDate(end);
		booking.setStartDate(start);
		booking.getRooms().addAll(rooms);
		booking.setResponsibleGuest(guest);
		
		hotel.getHasBookings().add(booking);
	}

	public Company_Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Company_Hotel hotel) {
		this.hotel = hotel;
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
	public void getBookings(String ssn) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.GUEST_BOOKING___CREATE_BOOKING__DATE_DATE_HOTEL_ROOM_COMPANY_GUESTRECORD:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (Hotel_Room)arguments.get(2), (Company_GuestRecord)arguments.get(3));
				return null;
			case ClassDiagramPackage.GUEST_BOOKING___FIND_AVAILABLE_ROOMS__DATE_DATE_ELIST:
				findAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (EList<Room_RoomType>)arguments.get(2));
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
			case ClassDiagramPackage.GUEST_BOOKING___GET_BOOKINGS__STRING:
				getBookings((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void createBooking(Date start, Date end, Hotel_Room rooms, Company_GuestRecord guest) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findAvailableRooms(Date start, Date end, EList<Room_RoomType> roomTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //GuestBookingImpl
