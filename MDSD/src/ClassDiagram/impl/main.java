package ClassDiagram.impl;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import ClassDiagram.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassDiagramFactory factory = ClassDiagramFactoryImpl.init();
		
		Company company = factory.createCompany();		
		company.setName("The company");
		
		Company_Hotel theHotel  = factory.createCompany_Hotel();

		theHotel.setName("Our hotel");
		
		company.getOwns().add(theHotel);
		
		Room_RoomType single = new Room_RoomTypeImpl();
		
		Hotel_RoomImpl room1 = new Hotel_RoomImpl();
		room1.setRoomNumber(1);
		room1.setBelongsTo(single);
		
		theHotel.getConsistsOf().add(room1);
		
		Company_GuestRecord guest1 = factory.createCompany_GuestRecord();
		guest1.setSsn("1");
		guest1.setName("Johan");

		company.getRecordsOf().add(guest1);
		
		System.out.println(theHotel.getConsistsOf());
		System.out.println(company.getOwns());
		System.out.println(company.getRecordsOf());
		
		GuestBookingImpl guestBooking = new GuestBookingImpl();
		guestBooking.setHotel(theHotel);
		
		Date start = new Date();
		Date end = new Date();

		guestBooking.createBooking(start, end, theHotel.getConsistsOf(), guest1);
		
		
	}

}
