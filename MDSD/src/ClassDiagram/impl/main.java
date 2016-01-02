package ClassDiagram.impl;

import java.awt.List;
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
//		ClassDiagramPackage classes = ClassDiagramPackage.init();
		// Creating the company
//		Company company2 = factory.create(classes.getCompany());		

		Company company = factory.createCompany();		
		company.setName("The company");
		
		// Creating the Hotels
		Company_Hotel theHotel  = factory.createCompany_Hotel();
		theHotel.setName("Our hotel");
		
		// Adding the hotels to the company
		company.getOwns().add(theHotel);
		
		// Creating the room types
		Room_RoomType singleRoom = factory.createRoom_RoomType();
		Room_RoomType doubleRoom = factory.createRoom_RoomType();
		singleRoom.setMaxNumberOfGuests(1);
		doubleRoom.setMaxNumberOfGuests(2);
		singleRoom.setName("Single");
		doubleRoom.setName("Double");
		theHotel.getListOfRoomTypes().add(singleRoom);
		theHotel.getListOfRoomTypes().add(doubleRoom);

		// Creating 20 single and 20 double rooms and adding them to the hotel
		Hotel_Room room;
		
		for (int i = 1; i < 40; i++) {
			room = factory.createHotel_Room();
			room.setRoomNumber(i);
			if (i < 21)
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
		
		
		
			
		// Creating the managers for the hotel
		BookingManager bookingManager = factory.createBookingManager();
		bookingManager.setHotel(theHotel);

		RoomManager roomManager = factory.createRoomManager();
		roomManager.setHotel(theHotel);
		bookingManager.setRoomManager(roomManager);
		
		GuestManager guestManager = factory.createGuestManager();
		guestManager.setCompany(company);
		bookingManager.setGuestManager(guestManager);
		
		BillManager billManager = factory.createBillManager();
		billManager.setHotel(theHotel);	
		
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
					System.out.println("    " + booking.getStartDate() + " - " + booking.getEndDate());
					for(Hotel_Room aRoom: booking.getRooms()) {
						System.out.println("    " + showRoom(aRoom));
					}
				}
			}
			else if (input.equals("4"))
				bookingManager.initBooking();				
			else if (input.equals("5"))
				System.out.println("Not implemented yet");
			else if (input.equals("6"))
				System.out.println("Not implemented yet");

			
			System.out.println();
		
		}
		
		
	}
	
	public static String showGuest(Company_GuestRecord guest) {
		return "  " +guest.getName() + " - " + guest.getSsn();
	}
	public static String showRoom(Hotel_Room room) {
		return "  " + room.getRoomNumber() + " - " + room.getRoomType().getName();
	}
	
}
