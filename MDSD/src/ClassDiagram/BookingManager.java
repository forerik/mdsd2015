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
 *   <li>{@link ClassDiagram.BookingManager#getBookingList <em>Booking List</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBookingManager()
 * @model
 * @generated
 */
public interface BookingManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking List</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking List</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getBookingManager_BookingList()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Booking> getBookingList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomsRequired="true" roomsMany="true" roomsOrdered="false" guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void createBooking(Date start, Date end, EList<Hotel_Room> rooms, Company_GuestRecord guest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomTypesRequired="true" roomTypesMany="true" roomTypesOrdered="false"
	 * @generated
	 */
	void findAvailableRooms(Date start, Date end, EList<Room_RoomType> roomTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void checkIn(Hotel_Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void checkOut(Hotel_Booking booking);

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
	 * @model bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	void findBooking(int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void getBookings(String ssn);

} // BookingManager
