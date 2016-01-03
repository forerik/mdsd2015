/**
 */
package ClassDiagram.impl;

import ClassDiagram.BookingManager;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Company_Hotel;
import ClassDiagram.GuestManager;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Room;
import ClassDiagram.RoomManager;
import ClassDiagram.Room_RoomType;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
 *   <li>{@link ClassDiagram.impl.BookingManagerImpl#getRoomManager <em>Room Manager</em>}</li>
 *   <li>{@link ClassDiagram.impl.BookingManagerImpl#getGuestManager <em>Guest Manager</em>}</li>
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
	
	public static final String checkOutHour = "11:00:00";
	public static final String checkInHour = "15:00:00";
	
	Date start = new Date();
	Date end = new Date();
	int numberOfPeople;
	private EList<Room_RoomType> selectedRoomTypes;
	private EList<Hotel_Room> selectedRooms;
	
	protected Company_Hotel hotel;

	/**
	 * The cached value of the '{@link #getRoomManager() <em>Room Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomManager()
	 * @generated
	 * @ordered
	 */
	protected RoomManager roomManager;

	/**
	 * The cached value of the '{@link #getGuestManager() <em>Guest Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestManager()
	 * @generated
	 * @ordered
	 */
	protected GuestManager guestManager;

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
	 * @generated
	 */
	public RoomManager getRoomManager() {
		if (roomManager != null && roomManager.eIsProxy()) {
			InternalEObject oldRoomManager = (InternalEObject)roomManager;
			roomManager = (RoomManager)eResolveProxy(oldRoomManager);
			if (roomManager != oldRoomManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.BOOKING_MANAGER__ROOM_MANAGER, oldRoomManager, roomManager));
			}
		}
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManager basicGetRoomManager() {
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomManager(RoomManager newRoomManager) {
		RoomManager oldRoomManager = roomManager;
		roomManager = newRoomManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOKING_MANAGER__ROOM_MANAGER, oldRoomManager, roomManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestManager getGuestManager() {
		if (guestManager != null && guestManager.eIsProxy()) {
			InternalEObject oldGuestManager = (InternalEObject)guestManager;
			guestManager = (GuestManager)eResolveProxy(oldGuestManager);
			if (guestManager != oldGuestManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.BOOKING_MANAGER__GUEST_MANAGER, oldGuestManager, guestManager));
			}
		}
		return guestManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestManager basicGetGuestManager() {
		return guestManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestManager(GuestManager newGuestManager) {
		GuestManager oldGuestManager = guestManager;
		guestManager = newGuestManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOKING_MANAGER__GUEST_MANAGER, oldGuestManager, guestManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Hotel_Booking createBooking(Date start, Date end, EList<Hotel_Room> rooms, Company_GuestRecord guest, int numberOfPeople) {
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
		
		return booking;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Hotel_Room> findAvailableRooms(Date start, Date end, Room_RoomType roomType, int _people) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Hotel_Room> rooms = new BasicEList<Hotel_Room>(hotel.getListOfRooms());
		EList<Hotel_Room> tempRooms = new BasicEList<Hotel_Room>(hotel.getListOfRooms());
		
		for (Hotel_Room room : tempRooms) {
			if (!(room.getRoomType().getName().equals(roomType.getName()))) {
				rooms.remove(room);				
			}
		}
		
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
		int numberOfRooms = _people/roomType.getMaxNumberOfGuests();
		if (_people % roomType.getMaxNumberOfGuests() != 0)
			numberOfRooms++;
		numberOfRooms = Math.min(rooms.size(), numberOfRooms);
		
		EList<Hotel_Room> selectedRooms = new BasicEList<Hotel_Room>();
		
		for (int i = 0; i < numberOfRooms; i++) {
			selectedRooms.add(rooms.get(i));
		}
		
		return selectedRooms;	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOut(int bookingID) {
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
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		Date today = new Date();
		
		Scanner s = new Scanner(System.in);
		String input = "";
		String[] parts;
		
		boolean cancel = false;
		
		
		// Find or create guest
		Company_GuestRecord guest = null;
		while (guest == null && !cancel) {
			System.out.println("Input ssn or input 'New' to create a new guest record:");
			input = s.nextLine();
			if (input.equals("Cancel")) {
				cancel = true;
				System.out.println("Canceled");
			}
			else if (input.equals("New")) {
				System.out.println("Needs to be implemented!");		

			}
			else {
				Company_GuestRecord foundGuest = guestManager.findGuestRecord(input);
				if (foundGuest != null)
					guest = foundGuest;
			}
		}
		
		// Input the start date
		if (!cancel)
			System.out.println("Input start date: (yyyy-mm-dd)");
		boolean allGood = false;
		while (!allGood && !cancel) {
			input = s.nextLine();
			parts = input.split("-");
			if (input.equals("Cancel")) {
				cancel = true;
				System.out.println("Canceled");
				break;
			}
			else if (parts.length != 3) {
				System.out.println("Wrong input. The start date needs to be in format 'yyyy-mm-dd'");
			}
			else 
				allGood = isNumeric(parts[0]) && parts[0].length() == 4 && 
						  isNumeric(parts[1]) && parts[1].length() == 2 && 
						  isNumeric(parts[2]) && parts[2].length() == 2;

			if (!allGood) 
				System.out.println("Wrong input. The start date needs to be in format 'yyyy-mm-dd'");
			else {
				String dateInString = input + " " + checkInHour;
				try {
					start = sdf.parse(dateInString);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							
				if (!start.after(today)) {
					allGood = false;
					System.out.println("Wrong input. The start date needs to be in the future.");
				}
			}
		}
		//System.out.println(start);


		// Input the end date
		if (!cancel)
			System.out.println("Input end date: (yyyy-mm-dd)");
		allGood = false;
		while (!allGood && !cancel) {
			input = s.nextLine();
			parts = input.split("-");
			if (input.equals("Cancel")) {
				cancel = true;
				System.out.println("Canceled");
				break;
			}
			else if (parts.length != 3) {
				System.out.println("Wrong input. The end date needs to be in format 'yyyy-mm-dd'");
			}
			else 
				allGood = isNumeric(parts[0]) && parts[0].length() == 4 && 
						  isNumeric(parts[1]) && parts[1].length() == 2 && 
						  isNumeric(parts[2]) && parts[2].length() == 2;

			if (!allGood) 
				System.out.println("Wrong input. The start date needs to be in format 'yyyy-mm-dd'");
			else {
				String dateInString = input + " " + checkOutHour;
				try {
					end = sdf.parse(dateInString);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
							
				if (!end.after(start)) {
					allGood = false;
					System.out.println("Wrong input. The end date needs to be in after the start date.");
				}
			}
		}
		if (!cancel) {
			System.out.println(start + " - " + end);
				
		
			// Input the number of people
			System.out.println("Input number of people:");
			input = s.nextLine();
		}
		while (!isNumeric(input) && !cancel) {
			System.out.println("Wrong input. The number of people needs to be an integer.");
				input = s.nextLine();
				parts = input.split("-");	
		}
		if (!cancel)
			numberOfPeople = Integer.parseInt(input);
		
		
		// Get the room types
		while(!cancel && !getRoomTypes());
		if (selectedRoomTypes.size() == 0)
			cancel = true;
		
		selectedRooms = new BasicEList<Hotel_Room>();

		// Get the rooms
		while(!cancel && !getRooms());
		if (selectedRooms.size() == 0)
			cancel = true;
		
		if (!cancel) {
			Hotel_Booking booking = createBooking(start, end, selectedRooms, guest, numberOfPeople);
	
			double price = 0;
			for (Hotel_Room room: selectedRooms) {
				price += room.getRoomType().getPrice();
			}
			
			booking.setPrice(price);
/*			
			ClassDiagramFactory factory = ClassDiagramFactoryImpl.init();
			Booking_Bill bill = factory.createBooking_Bill();
			booking.setBill(bill);
			*/			
		}
		boolean payed = false;
		if (!payed && !cancel) {

			System.out.println("Do you want to pay? (y/n");
			input = s.nextLine();
			if (input == "") {
				
			}
		}

		
		
		// System.out.println("Bookings \n" + hotel.getListOfBookings());
		
		
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean getRoomTypes()  {  
		EList<Room_RoomType> roomtypes = hotel.getListOfRoomTypes();
		selectedRoomTypes = new BasicEList<Room_RoomType>();
		
		System.out.println("Select roomtypes that you want: \n"
				+  "(Input the indecies seperated by a '-' for the room types that you want.) \n"
				+  "(Input 'all' if you want any kind of room.)");
		for (int i = 0; i < roomtypes.size(); i++) {
			Room_RoomType rt = (Room_RoomType) roomtypes.get(i);
			System.out.println(i+1 + ": " + rt.getName()); 
		}
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		if (input.equals("Cancel")) {
			System.out.println("Canceled");
			selectedRoomTypes = new BasicEList<Room_RoomType>();
			return true;
		}
		else if (input.equals("all")) {
			selectedRoomTypes = hotel.getListOfRoomTypes();
		}
		else {
			String[] parts = input.split("-");
			for (int i = 0; i < parts.length; i++) {
				if (!isNumeric(parts[i]))
					return false;
				else {
					int index = Integer.parseInt(parts[i]);
					index--;
					if (index >= roomtypes.size()) 
						return false;
					else {
						Room_RoomType rt = (Room_RoomType) roomtypes.get(index);
						selectedRoomTypes.add(rt);							
					}
				}
			}
		}

		EList<Hotel_Room> availableRooms = new BasicEList<>();
		
		for (Room_RoomType roomType: selectedRoomTypes) {	
			EList<Hotel_Room> rooms = findAvailableRooms(start, end, roomType, numberOfPeople);
			availableRooms.addAll(rooms);
		}
		
		int coveredPeople = 0;
		for (Hotel_Room room : availableRooms)
			coveredPeople += room.getRoomType().getMaxNumberOfGuests();
		
		if (coveredPeople < numberOfPeople) {
			System.out.println("There are not enough rooms of the selected type(s) to covered the amount guests.");
			return false;
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean getRooms()  {  
		System.out.println("Select the rooms that you want by typing in the room numbers separated by '-':");
		
		EList<Hotel_Room> availableRooms = new BasicEList<>();
		
		for (Room_RoomType roomType: selectedRoomTypes) {
			System.out.println(roomType.getName());
			
			EList<Hotel_Room> rooms = findAvailableRooms(start, end, roomType, numberOfPeople);
			availableRooms.addAll(rooms);
			
			for (Hotel_Room room : selectedRooms) {
				availableRooms.remove(room);
				rooms.remove(room);
			}
			
			for (Hotel_Room room : rooms) {
				System.out.println(" Room: " + room.getRoomNumber());
			}
		}
		
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String[] parts = input.split("-");
		for (int i = 0; i < parts.length; i++) {
			if (input.equals("Cancel")) {
				System.out.println("Canceled");
				selectedRooms = new BasicEList<>();
				return true;
			}
			else if (!isNumeric(parts[i]))
				return false;
			int roomNumber = Integer.parseInt(parts[i]);
			if (!roomManager.roomExists(availableRooms, roomNumber))
				return false;
			else { 
				Hotel_Room room = roomManager.findRoom(roomNumber);
				selectedRooms.add(room);
			}
		}
		int coveredPeople = 0;
		for (Hotel_Room room : selectedRooms)
			coveredPeople += room.getRoomType().getMaxNumberOfGuests();
		if (numberOfPeople > coveredPeople) {
			System.out.println("The rooms that you have chosen does not covered the amount of guests you want to book. \n"
							+  "This is the rooms you have so far:");
			for (Hotel_Room room : selectedRooms) {
				System.out.println(room.getRoomType().getName() + ": " + room.getRoomNumber());
			}			
			return false;
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static boolean isNumeric(String str)  {  
	  try  {
	    Integer.parseInt(str);  
	  } catch(NumberFormatException nfe) {  
	    return false;  
	  }
	  return true;  
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Room_RoomType> findAvailableRoomTypes(Date start, Date end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Room_RoomType> roomTypes = new BasicEList<Room_RoomType>(hotel.getListOfRoomTypes());
		
		EList<Hotel_Booking> bookings = hotel.getListOfBookings();
		
		for(Hotel_Booking booking : bookings) {
			
			Date bStart = booking.getStartDate();
			Date bEnd = booking.getEndDate();
			
			if (!(bEnd.before(start) || bStart.after(end))) {
				for(Hotel_Room room : booking.getRooms()) {
					roomTypes.remove(room.getRoomType());
				}
			}
		}
		return roomTypes;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBooking(int bookingID) {
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
			case ClassDiagramPackage.BOOKING_MANAGER__HOTEL:
				if (resolve) return getHotel();
				return basicGetHotel();
			case ClassDiagramPackage.BOOKING_MANAGER__ROOM_MANAGER:
				if (resolve) return getRoomManager();
				return basicGetRoomManager();
			case ClassDiagramPackage.BOOKING_MANAGER__GUEST_MANAGER:
				if (resolve) return getGuestManager();
				return basicGetGuestManager();
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
			case ClassDiagramPackage.BOOKING_MANAGER__ROOM_MANAGER:
				setRoomManager((RoomManager)newValue);
				return;
			case ClassDiagramPackage.BOOKING_MANAGER__GUEST_MANAGER:
				setGuestManager((GuestManager)newValue);
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
			case ClassDiagramPackage.BOOKING_MANAGER__ROOM_MANAGER:
				setRoomManager((RoomManager)null);
				return;
			case ClassDiagramPackage.BOOKING_MANAGER__GUEST_MANAGER:
				setGuestManager((GuestManager)null);
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
			case ClassDiagramPackage.BOOKING_MANAGER__ROOM_MANAGER:
				return roomManager != null;
			case ClassDiagramPackage.BOOKING_MANAGER__GUEST_MANAGER:
				return guestManager != null;
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
			case ClassDiagramPackage.BOOKING_MANAGER___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE_INT:
				findAvailableRooms((Date)arguments.get(0), (Date)arguments.get(1), (Room_RoomType)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___CHECK_IN__INT:
				checkIn((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___CHECK_OUT__INT:
				checkOut((Integer)arguments.get(0));
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
			case ClassDiagramPackage.BOOKING_MANAGER___FIND_AVAILABLE_ROOM_TYPES__DATE_DATE:
				findAvailableRoomTypes((Date)arguments.get(0), (Date)arguments.get(1));
				return null;
			case ClassDiagramPackage.BOOKING_MANAGER___FIND_BOOKING__INT:
				findBooking((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookingManagerImpl
