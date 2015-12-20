package ClassDiagram.impl;

import java.awt.List;
import java.util.Date;

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
		guest1.setName("Johan");
		company.getRecordsOf().add(guest1);

		
		
		
		EList<Hotel_Room> bookingRooms = new BasicEList<Hotel_Room>();
		
		Date start = new Date();
		Date end = new Date();
		start.setMonth(1);;
		end.setMonth(2);;
		
		
		BookingManager bookingManager = factory.createBookingManager();
		bookingManager.setHotel(theHotel);
		bookingManager.createBooking(start, end, bookingRooms, guest1, 2);

		RoomManager roomManager = factory.createRoomManager();
		roomManager.setHotel(theHotel);
		bookingManager.setRoomManager(roomManager);
		
		bookingRooms.add(roomManager.findRoom(1));

		
		
		EList<Room_RoomType> roomTypes = new BasicEList<Room_RoomType>();
		roomTypes.add(singleRoom);
		
		//EList<Hotel_Room> availableRooms = bookingManager.findAvailableRooms(start, end, roomTypes);
		
		//System.out.println(availableRooms);
		
		System.out.println("Bookings \n" + theHotel.getListOfBookings());
		System.out.println("Rooms \n" + theHotel.getListOfRooms());
		System.out.println("Guests \n" + company.getRecordsOf());
		
		bookingManager.initBooking();
		
		
	}

}
