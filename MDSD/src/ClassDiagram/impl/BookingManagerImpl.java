/**
 */
package ClassDiagram.impl;

import ClassDiagram.BookingManager;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Company_Hotel;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Room_RoomType;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.common.util.BasicEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.BookingManagerImpl#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingManagerImpl extends MinimalEObjectImpl.Container implements BookingManager {
	/**
	 * The cached value of the '{@link #getHotel() <em>Hotel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotel()
	 * @generated NOT
	 * @ordered
	 */
	
	public static final int checkOutHour = 12;
	public static final int checkInHour = 15;
	
	protected Company_Hotel hotel;

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
	public Company_Hotel getHotel() {
		if (hotel != null && hotel.eIsProxy()) {
			InternalEObject oldHotel = (InternalEObject)hotel;
			hotel = (Company_Hotel)eResolveProxy(oldHotel);
			if (hotel != oldHotel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.BOOKING_MANAGER__HOTEL, oldHotel, hotel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOKING_MANAGER__HOTEL, oldHotel, hotel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void createBooking(Date start, Date end, EList<Hotel_Room> rooms, Company_GuestRecord guest, int numberOfPeople) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		ClassDiagramFactory factory = ClassDiagramFactoryImpl.init();
		
		Hotel_Booking booking = factory.createHotel_Booking();
		booking.setStartDate(start);
		booking.setEndDate(end);
		booking.setStartDate(start);
		booking.getRooms().addAll(rooms);
		booking.setResponsibleGuest(guest);		
		
		hotel.getListOfBookings().add(booking);	
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Hotel_Room> findAvailableRooms(Date start, Date end, EList<Room_RoomType> roomTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<Hotel_Room> rooms = new BasicEList<Hotel_Room>(hotel.getListOfRooms());
				
		EList<Hotel_Booking> bookings = hotel.getListOfBookings();
		
		for(Hotel_Booking booking : bookings) {
			
			Date bStart = booking.getStartDate();
			Date bEnd = booking.getEndDate();
			
			if (!(bEnd.before(start) || bStart.after(end))) {
				for(Hotel_Room room : booking.getRooms()) {
					rooms.remove(room);
				}
			}
		}
		return rooms;
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
	public void getBookings(String ssn) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initBooking() {
		Date start = new Date();
		Date end = new Date();
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String[] parts = input.split("-");
		int year = Integer.parseInt(parts[0]);
		int month = Integer.parseInt(parts[1]);
		int day = Integer.parseInt(parts[2]);
		
		start.setYear(year);
		start.setMonth(month-1);
		start.setDate(day);
		start.setHours(checkInHour);;
		//System.out.println(start);
		
		input = s.nextLine();
		parts = input.split("-");
		year = Integer.parseInt(parts[0]);
		month = Integer.parseInt(parts[1]);
		day = Integer.parseInt(parts[2]);
		
		end.setYear(year);
		end.setMonth(month-1);
		end.setDate(day);
		end.setHours(checkOutHour);
		//System.out.println(end);
		s.close();
		
		System.out.println();
		
		
		
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_MANAGER__HOTEL:
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
			case ClassDiagramPackage.BOOKING_MANAGER__HOTEL:
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
			case ClassDiagramPackage.BOOKING_MANAGER__HOTEL:
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
			case ClassDiagramPackage.BOOKING_MANAGER__HOTEL:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_ELIST_COMPANY_GUESTRECORD_INT:
				createBooking((Date)arguments.get(0), (Date)arguments.get(1), (EList<Hotel_Room>)arguments.get(2), (Company_GuestRecord)arguments.get(3), (Integer)arguments.get(4));
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
			case ClassDiagramPackage.BOOKING_MANAGER___GET_BOOKINGS__STRING:
				getBookings((String)arguments.get(0));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___INIT_BOOKING:
				initBooking();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagerImpl
