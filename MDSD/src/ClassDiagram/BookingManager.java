/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getBookingManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BookingManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dateRequired="true" dateOrdered="false" guestSSNRequired="true" guestSSNOrdered="false"
	 * @generated
	 */
	void findBooking(Date date, String guestSSN);

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
	 * @model roomsRequired="true" roomsOrdered="false" bookingRequired="true" bookingOrdered="false" expirationDateRequired="true" expirationDateOrdered="false"
	 * @generated
	 */
	void assignKey(Hotel_Room rooms, Hotel_Booking booking, Date expirationDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dateRequired="true" dateOrdered="false" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	void findBooking(Date date, int roomNr);

} // BookingManager
