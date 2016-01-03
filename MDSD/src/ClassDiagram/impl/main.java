package ClassDiagram.impl;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;
import ClassDiagram.*;
import org.eclipse.emf.common.util.BasicEList;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating the factory
		ClassDiagramFactory factory = ClassDiagramFactoryImpl.init();	

		Company company = factory.createCompany();		
		company.setName("The company");
		
		// Creating the Hotels
		Company_Hotel theHotel  = factory.createCompany_Hotel();
		theHotel.setName("Our hotel");
		
		// Adding the hotels to the company
		company.getOwns().add(theHotel);

		BookingManager bookingManager = factory.createBookingManager();

		init(company, theHotel, bookingManager);
		

		
		
		Scanner s = new Scanner(System.in);
		String input;
		
		while(true) {
			System.out.println("Select what you want to do:");
			System.out.println("1: View all guests");
			System.out.println("2: View all rooms");
			System.out.println("3: View all bookings");
			System.out.println("4: Create a new booking");
			System.out.println("5: Check in");
			System.out.println("6: Check out");
			input = s.nextLine();
			System.out.println();

			if (input.equals("1")) {
				System.out.println("All guests in the company:");
				for(Company_GuestRecord guest: company.getRecordsOf()) {
					System.out.println(showGuest(guest) );
				}
			}
			else if (input.equals("2")) {
				System.out.println("All rooms in the hotel:");
				for(Hotel_Room aRoom: theHotel.getListOfRooms()) {
					System.out.println(showRoom(aRoom));
				}
			}
			else if (input.equals("3")) {
				System.out.println("All bookings in the hotel:");
				for(Hotel_Booking booking: theHotel.getListOfBookings()) {
					System.out.println("  Responsible guest: " + showGuest(booking.getResponsibleGuest()));
					System.out.println("    Price " + booking.getPrice() + ":-");
					System.out.println("    Payed " + booking.getBill().getPaidAmount() + ":-");
					System.out.println("    Checked in " + booking.isCheckedIn());
					System.out.println("    " + booking.getStartDate() + " - " + booking.getEndDate());
					for(Hotel_Room aRoom: booking.getRooms()) {
						System.out.println("    " + showRoom(aRoom));
					}
				}
			}
			else if (input.equals("4"))
				bookingManager.initBooking();				
			else if (input.equals("5"))
				bookingManager.checkIn(0);
			else if (input.equals("6"))
				bookingManager.checkOut(0);

			
			System.out.println();
		
		}
		
		
	}
	
	public static String showGuest(Company_GuestRecord guest) {
		return "  " +guest.getName() + " - " + guest.getSsn();
	}
	public static String showRoom(Hotel_Room room) {
		return "  " + room.getRoomNumber() + " - " + room.getRoomType().getName();
	}
	
	public static void init(Company company, Company_Hotel theHotel, BookingManager bookingManager) {

		ClassDiagramFactory factory = ClassDiagramFactoryImpl.init();	

		// Creating the room types
		Room_RoomType singleRoom = factory.createRoom_RoomType();
		Room_RoomType doubleRoom = factory.createRoom_RoomType();
		singleRoom.setMaxNumberOfGuests(1);
		doubleRoom.setMaxNumberOfGuests(2);
		singleRoom.setName("Single");
		doubleRoom.setName("Double");
		singleRoom.setPrice(100);
		doubleRoom.setPrice(200);
		theHotel.getListOfRoomTypes().add(singleRoom);
		theHotel.getListOfRoomTypes().add(doubleRoom);

		// Creating 20 single and 20 double rooms and adding them to the hotel
		Hotel_Room room;
		
		for (int i = 1; i < 10; i++) {
			room = factory.createHotel_Room();
			room.setRoomNumber(i);
			if (i < 6)
				room.setRoomType(singleRoom);
			else 
				room.setRoomType(doubleRoom);
			theHotel.getListOfRooms().add(room);
		}
		
		// Creating the guest records
		Company_GuestRecord guest1 = factory.createCompany_GuestRecord();
		guest1.setSsn("1");
		guest1.setName("Johan Sundby");
		company.getRecordsOf().add(guest1);

		Company_GuestRecord guest2 = factory.createCompany_GuestRecord();
		guest2.setSsn("2");
		guest2.setName("Emma Haraldsson");
		company.getRecordsOf().add(guest2);


		Company_GuestRecord guest3 = factory.createCompany_GuestRecord();
		guest3.setSsn("3");
		guest3.setName("James Smith");
		company.getRecordsOf().add(guest3);

		Company_GuestRecord guest4 = factory.createCompany_GuestRecord();
		guest4.setSsn("4");
		guest4.setName("Lord Elrond");
		company.getRecordsOf().add(guest4);
		
			
		
			
		// Creating the managers for the hotel and company
		bookingManager.setHotel(theHotel);

		RoomManager roomManager = factory.createRoomManager();
		roomManager.setHotel(theHotel);
		bookingManager.setRoomManager(roomManager);
		
		GuestManager guestManager = factory.createGuestManager();
		guestManager.setCompany(company);
		bookingManager.setGuestManager(guestManager);
		
		BillManager billManager = factory.createBillManager();
		billManager.setHotel(theHotel);	
		bookingManager.setBillManager(billManager);

		// Creating bookings
		EList<Hotel_Room> bookingRooms = new BasicEList<Hotel_Room>();
		bookingRooms.add(theHotel.getListOfRooms().get(1));
		bookingRooms.add(theHotel.getListOfRooms().get(2));

		Date start = new Date();
		Date end = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		String dateInString = "2016-02-01 15:00:00";
		String dateInString2 = "2016-02-15 11:00:00";
		try {
			start = sdf.parse(dateInString);
			end = sdf.parse(dateInString2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Hotel_Booking newBooking = bookingManager.createBooking(start, end, bookingRooms, guest1, 2);
		
		double price = 0;
		for (Hotel_Room theRoom: bookingRooms) {
			price += theRoom.getRoomType().getPrice();
		}
		
		newBooking.setBookingID(theHotel.getListOfBookings().size());
		newBooking.setPrice(price);
		
		// A checked in booking that can be checked out today
		dateInString = "2016-01-01 15:00:00";
		end = new Date();		
		try {
			start = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		newBooking = bookingManager.createBooking(start, end, bookingRooms, guest3, 2);
		
		price = 0;
		for (Hotel_Room theRoom: bookingRooms) {
			price += theRoom.getRoomType().getPrice();
		}
		
		newBooking.setBookingID(theHotel.getListOfBookings().size());
		newBooking.setPrice(price);
		
		newBooking.setCheckedIn(true);

		// A booking that can be checked in today
		dateInString = "2016-02-01 11:00:00";
		start = new Date();		
		try {
			end = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookingRooms.add(theHotel.getListOfRooms().get(5));
		bookingRooms.add(theHotel.getListOfRooms().get(6));
		newBooking = bookingManager.createBooking(start, end, bookingRooms, guest4, 4);
		
		price = 0;
		for (Hotel_Room theRoom: bookingRooms) {
			price += theRoom.getRoomType().getPrice();
		}
		
		newBooking.setBookingID(theHotel.getListOfBookings().size());
		newBooking.setPrice(price);

		// A booking that books all rooms for a certain period
		dateInString = "2016-06-01 11:00:00";
		dateInString2 = "2016-06-31 11:00:00";
		start = new Date();		
		try {
			start = sdf.parse(dateInString);
			end = sdf.parse(dateInString2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EList<Hotel_Room> bookingRooms2 = new BasicEList<Hotel_Room>();
		newBooking = bookingManager.createBooking(start, end, theHotel.getListOfRooms(), guest4, 30);
		
		price = 0;
		for (Hotel_Room theRoom: theHotel.getListOfRooms()) {
			price += theRoom.getRoomType().getPrice();
		}
		
		newBooking.setBookingID(theHotel.getListOfBookings().size());
		newBooking.setPrice(price);
		
		Scanner s = new Scanner(System.in);
		String input;
		
		while(true) {
			System.out.println("Select what you want to do:");
			System.out.println("1: View all guests");
			System.out.println("2: View all rooms");
			System.out.println("3: View all bookings");
			System.out.println("4: Create a new booking");
			System.out.println("5: Check in");
			System.out.println("6: Check out");
			input = s.nextLine();
			System.out.println();

			if (input.equals("1")) {
				System.out.println("All guests in the company:");
				for(Company_GuestRecord guest: company.getRecordsOf()) {
					System.out.println(showGuest(guest) );
				}
			}
			else if (input.equals("2")) {
				System.out.println("All rooms in the hotel:");
				for(Hotel_Room aRoom: theHotel.getListOfRooms()) {
					System.out.println(showRoom(aRoom));
				}
			}
			else if (input.equals("3")) {
				System.out.println("All bookings in the hotel:");
				for(Hotel_Booking booking: theHotel.getListOfBookings()) {
					System.out.println("Booking number: " + booking.getBookingID());
					System.out.println("  Responsible guest: " + showGuest(booking.getResponsibleGuest()));
					System.out.println("    Price " + booking.getPrice() + ":-");
					System.out.println("    Payed " + booking.getBill().getPaidAmount() + ":-");
					System.out.println("    Checked in " + booking.isCheckedIn());
					System.out.println("    " + booking.getStartDate() + " - " + booking.getEndDate());
					for(Hotel_Room aRoom: booking.getRooms()) {
						System.out.println("    " + showRoom(aRoom));
					}
				}
			}
			else if (input.equals("4"))
				bookingManager.initBooking();				
			else if (input.equals("5")){
				System.out.println("Check in. Type in the booking number:");
				input = s.nextLine();
				int bookingID = Integer.parseInt(input);
				if(bookingManager.findBooking(bookingID).equals(null)){
					System.out.println("Booking does not exist!");
				}else{
					bookingManager.checkIn(bookingID);
					System.out.println("Checked in: " + bookingManager.findBooking(bookingID).isCheckedIn());
				}
				
			}
			else if (input.equals("6")){
				System.out.println("Check out. Type in the booking number");
				input = s.nextLine();
				int bookingID = Integer.parseInt(input);
				if(bookingManager.findBooking(bookingID).equals(null)){
					System.out.println("Booking does not exist!");
				}else{
					bookingManager.checkOut(bookingID);
					System.out.println("Checked out and paid in full");
				}
				
			}

			System.out.println();
		
		}
	}
}
