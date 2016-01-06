package ClassDiagram.impl;
import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

import org.eclipse.emf.common.util.EList;
import ClassDiagram.*;
import org.eclipse.emf.common.util.BasicEList;


public class TestClass {
	
	Company company;
	Company_Hotel theHotel;
	BookingManager bookingManager;
	GuestManager guestManager;
	RoomManager roomManager;
	BillManager billManager;
	
	
	Room_RoomType singleRoom;
	Company_GuestRecord guest1;
	
	Date start;
	Date end;
	
	SimpleDateFormat sdf;
	
	public TestClass() {
		ClassDiagramFactory factory = ClassDiagramFactoryImpl.init();	
		Company company = factory.createCompany();		
		company.setName("Test company");
		
		// Creating the Hotels
		theHotel  = factory.createCompany_Hotel();
		theHotel.setName("Test hotel");
		
		// Adding the hotels to the company
		company.getOwns().add(theHotel);
		bookingManager = factory.createBookingManager();
		bookingManager.setHotel(theHotel);

		roomManager = factory.createRoomManager();
		roomManager.setHotel(theHotel);
		bookingManager.setRoomManager(roomManager);
		
		guestManager = factory.createGuestManager();
		guestManager.setCompany(company);
		bookingManager.setGuestManager(guestManager);
		
		billManager = factory.createBillManager();
		billManager.setHotel(theHotel);	
		bookingManager.setBillManager(billManager);
		
		////////////////////////////////////////////////////////
		
		sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		end = new Date();		
		start = new Date();
		start.setDate(1);
		end.setDate(2);
		start.setMonth(11);
		end.setMonth(11);
		start.setHours(12);
		start.setHours(15);
		
		guest1 = factory.createCompany_GuestRecord();
		guest1.setSsn("1");
		guest1.setName("Johan Sundby");
		company.getRecordsOf().add(guest1);
		
		singleRoom = factory.createRoom_RoomType();
		singleRoom.setName("Single");
		singleRoom.setMaxNumberOfGuests(1);

		Hotel_Room room1 = factory.createHotel_Room();
		room1.setRoomNumber(1);
		room1.setRoomType(singleRoom);
		theHotel.getListOfRoomTypes().add(singleRoom);
		theHotel.getListOfRooms().add(room1);
		
		////////////////////////////////////////////////////////
			
		String dateInString = "2016-06-01 11:00:00";
		String dateInString2 = "2016-06-31 11:00:00";
		start = new Date();		
		try {
			start = sdf.parse(dateInString);
			end = sdf.parse(dateInString2);
		} catch (ParseException e) {
			e.printStackTrace();
		}					
	}
	
	
	@Test
	public void createBookingTest(){
		Assert.assertTrue(theHotel.getListOfBookings().size() == 0);
		Hotel_Booking newBooking = bookingManager.createBooking(start, end, theHotel.getListOfRooms(), guest1, 1);
		Assert.assertTrue(theHotel.getListOfBookings().size() == 1);
		
	}
	
	@Test
	public void findAvailableRoomsTest(){
		
		Assert.assertTrue(bookingManager.findAvailableRooms(start, end, singleRoom, 1).size() == 1);
		Hotel_Booking newBooking = bookingManager.createBooking(start, end, theHotel.getListOfRooms(), guest1, 1);
		Assert.assertTrue(bookingManager.findAvailableRooms(start, end, singleRoom, 1).size() == 0);
		
	}
	
	@Test
	public void testCheckIn(){
		Date start1 = new Date();
		Date end1 = new Date();
		Hotel_Booking newBooking = bookingManager.createBooking(start1, end1, theHotel.getListOfRooms(), guest1, 1);
		bookingManager.checkIn(1);
		Assert.assertTrue(newBooking.isCheckedIn() == true);
	
		
	}
	@Test
	public void testCheckOut(){
		Date start1 = new Date();
		Date end1 = new Date();
		Hotel_Booking newBooking = bookingManager.createBooking(start1, end1, theHotel.getListOfRooms(), guest1, 1);
		bookingManager.checkIn(1);
		Assert.assertTrue(newBooking.isCheckedIn() == true);
		bookingManager.checkOut(1);
		Assert.assertTrue(newBooking.isCheckedIn() == false);
		
	}
	
	@Test
	public void testInvalidCheckInDay(){
		//try to check in a booking that has another start date than today
		// (start date =/ todays date --> not able to check in)
		Hotel_Booking newBooking = bookingManager.createBooking(start, end, theHotel.getListOfRooms(), guest1, 1);
		bookingManager.checkIn(1);
		Assert.assertTrue(newBooking.isCheckedIn() == false);
	}
	
	@Test
	public void testInvalidCheckOutDay(){
		Date start1 = new Date();
		Date end1 = new Date();
		end1.setMonth(11);
		Hotel_Booking newBooking = bookingManager.createBooking(start1, end1, theHotel.getListOfRooms(), guest1, 1);
		bookingManager.checkIn(1);
		bookingManager.checkOut(1);
		Assert.assertTrue(newBooking.isCheckedIn() == true);
	}
	
	@Test
	public void testCheckOutValue(){
		Hotel_Booking newBooking = bookingManager.createBooking(start, end, theHotel.getListOfRooms(), guest1, 1);
		bookingManager.checkOut(1);
		Assert.assertTrue(newBooking.isCheckedIn() == false);
	}
	

	

	
	
	
	
	

}
