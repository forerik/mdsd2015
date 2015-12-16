/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model startRequired="true" startOrdered="false" endRequired="true" endOrdered="false" roomsRequired="true" roomsOrdered="false" guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void createBooking(Date start, Date end, Hotel_Room rooms, Company_GuestRecord guest);

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
	void editBooking(Hotel_Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void cancelBooking(Hotel_Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingNumberRequired="true" bookingNumberOrdered="false"
	 * @generated
	 */
	void findBooking(int bookingNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void getBookings(String ssn);

} // IBooking
