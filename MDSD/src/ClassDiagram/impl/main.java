package ClassDiagram.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import ClassDiagram.*;

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
		Room_RoomType single = factory.createRoom_RoomType();
		
		// Creating the rooms
		Hotel_Room room1 = factory.createHotel_Room();
		room1.setRoomNumber(1);
		room1.setRoomType(single);
		
		// Adding the rooms to the hotel
		theHotel.getListOfRooms().add(room1);
		
		// Creating the guest records
		Company_GuestRecord guest1 = factory.createCompany_GuestRecord();
		guest1.setSsn("1");
		guest1.setName("Johan");

		company.getRecordsOf().add(guest1);

		
		
		Date start = new Date();
		Date end = new Date();

		
		
		BookingManager bookingManager = factory.createBookingManager();
		bookingManager.setHotel(theHotel);
		bookingManager.createBooking(start, end, theHotel.getListOfRooms(), guest1);
		
		System.out.println(theHotel.getListOfBookings());
		System.out.println(theHotel.getListOfRooms());
		System.out.println(company.getOwns());
		System.out.println(company.getRecordsOf());
		
		
	}

}
