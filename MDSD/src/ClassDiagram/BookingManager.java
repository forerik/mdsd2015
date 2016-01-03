/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.BookingManager#getHotel <em>Hotel</em>}</li>
 *   <li>{@link ClassDiagram.BookingManager#getRoomManager <em>Room Manager</em>}</li>
 *   <li>{@link ClassDiagram.BookingManager#getGuestManager <em>Guest Manager</em>}</li>
 *   <li>{@link ClassDiagram.BookingManager#getBillManager <em>Bill Manager</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBookingManager()
 * @model
 * @generated
 */
public interface BookingManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel</em>' reference.
	 * @see #setHotel(Company_Hotel)
	 * @see ClassDiagram.ClassDiagramPackage#getBookingManager_Hotel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company_Hotel getHotel();

	/**
	 * Sets the value of the '{@link ClassDiagram.BookingManager#getHotel <em>Hotel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel</em>' reference.
	 * @see #getHotel()
	 * @generated
	 */
	void setHotel(Company_Hotel value);

	/**
	 * Returns the value of the '<em><b>Room Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Manager</em>' reference.
	 * @see #setRoomManager(RoomManager)
	 * @see ClassDiagram.ClassDiagramPackage#getBookingManager_RoomManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomManager getRoomManager();

	/**
	 * Sets the value of the '{@link ClassDiagram.BookingManager#getRoomManager <em>Room Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Manager</em>' reference.
	 * @see #getRoomManager()
	 * @generated
	 */
	void setRoomManager(RoomManager value);

	/**
	 * Returns the value of the '<em><b>Guest Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Manager</em>' reference.
	 * @see #setGuestManager(GuestManager)
	 * @see ClassDiagram.ClassDiagramPackage#getBookingManager_GuestManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GuestManager getGuestManager();

	/**
	 * Sets the value of the '{@link ClassDiagram.BookingManager#getGuestManager <em>Guest Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Manager</em>' reference.
	 * @see #getGuestManager()
	 * @generated
	 */
	void setGuestManager(GuestManager value);

	/**
	 * Returns the value of the '<em><b>Bill Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Manager</em>' reference.
	 * @see #setBillManager(BillManager)
	 * @see ClassDiagram.ClassDiagramPackage#getBookingManager_BillManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BillManager getBillManager();

	/**
	 * Sets the value of the '{@link ClassDiagram.BookingManager#getBillManager <em>Bill Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Manager</em>' reference.
	 * @see #getBillManager()
	 * @generated
	 */
	void setBillManager(BillManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomsRequired="true" roomsMany="true" roomsOrdered="false" guestRequired="true" guestOrdered="false" numberOfPeopleRequired="true" numberOfPeopleOrdered="false"
	 * @generated NOT
	 */
	Hotel_Booking createBooking(Date start, Date end, EList<Hotel_Room> rooms, Company_GuestRecord guest, int numberOfPeople);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomTypeRequired="true" roomTypeOrdered="false" _peopleRequired="true" _peopleOrdered="false"
	 *        _peopleAnnotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='#people'"
	 * @generated NOT
	 */
	EList<Hotel_Room> findAvailableRooms(Date start, Date end, Room_RoomType roomType, int _people);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated NOT
	 */
	boolean checkIn(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated NOT
	 */
	boolean checkOut(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false" bookingRequired="true" bookingOrdered="false" expirationDateRequired="true" expirationDateOrdered="false"
	 * @generated
	 */
	void assignKey(Hotel_Room room, Hotel_Booking booking, Date expirationDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dateRequired="true" dateOrdered="false" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	void findBooking(Date date, int roomNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void editBooking(int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void cancelBooking(int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void getBookings(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initBooking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model startRequired="true" startOrdered="false" endRequired="true" endOrdered="false"
	 * @generated NOT
	 */
	EList<Room_RoomType> findAvailableRoomTypes(Date start, Date end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated NOT
	 */
	Hotel_Booking findBooking(int bookingID);

} // BookingManager
