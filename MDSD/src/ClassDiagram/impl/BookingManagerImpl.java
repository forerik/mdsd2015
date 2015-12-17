/**
 */
package ClassDiagram.impl;

import ClassDiagram.BookingManager;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Room_RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.BookingManagerImpl#getBookingList <em>Booking List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingManagerImpl extends MinimalEObjectImpl.Container implements BookingManager {
	/**
	 * The cached value of the '{@link #getBookingList() <em>Booking List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingList()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Booking> bookingList;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.BOOKING_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Booking> getBookingList() {
		if (bookingList == null) {
			bookingList = new EObjectResolvingEList<Hotel_Booking>(Hotel_Booking.class, this, ClassDiagramPackage.BOOKING_MANAGER__BOOKING_LIST);
		}
		return bookingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void createBooking(Date start, Date end, EList<Hotel_Room> rooms, Company_GuestRecord guest) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Hotel_BookingImpl booking = new Hotel_BookingImpl();
		booking.setStartDate(start);
		booking.setEndDate(end);
		booking.setStartDate(start);
		booking.getRooms().addAll(rooms);
		booking.setResponsibleGuest(guest);
		
		bookingList.add(booking);	
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
	public void assignKey(Hotel_Room room, Hotel_Booking booking, Date expirationDate) {
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
	public void editBooking(int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(int bookingId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBooking(int bookingId) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_MANAGER__BOOKING_LIST:
				return getBookingList();
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
			case ClassDiagramPackage.BOOKING_MANAGER__BOOKING_LIST:
				getBookingList().clear();
				getBookingList().addAll((Collection<? extends Hotel_Booking>)newValue);
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
			case ClassDiagramPackage.BOOKING_MANAGER__BOOKING_LIST:
				getBookingList().clear();
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
			case ClassDiagramPackage.BOOKING_MANAGER__BOOKING_LIST:
				return bookingList != null && !bookingList.isEmpty();
		}
		return super.eIsSet(featureID);
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
			case ClassDiagramPackage.BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_ELIST_COMPANY_GUESTRECORD:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (EList<Hotel_Room>)arguments.get(2), (Company_GuestRecord)arguments.get(3));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___FIND_AVAILABLE_ROOMS__DATE_DATE_ELIST:
				findAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (EList<Room_RoomType>)arguments.get(2));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___CHECK_IN__HOTEL_BOOKING:
				checkIn((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___CHECK_OUT__HOTEL_BOOKING:
				checkOut((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE:
				assignKey((Hotel_Room)arguments.get(0), (Hotel_Booking)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___FIND_BOOKING__DATE_INT:
				findBooking((Date)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___EDIT_BOOKING__INT:
				editBooking((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___CANCEL_BOOKING__INT:
				cancelBooking((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___FIND_BOOKING__INT:
				findBooking((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___GET_BOOKINGS__STRING:
				getBookings((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagerImpl
