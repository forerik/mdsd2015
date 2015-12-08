/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IService Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIServiceBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IServiceBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false" facilityRequired="true" facilityOrdered="false" serviceRequired="true" serviceOrdered="false" dateRequired="true" dateOrdered="false" guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void bookFacilityService(Hotel_Booking booking, Hotel_Facility facility, Facility_FacilityService service, Date date, String guest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityRequired="true" facilityOrdered="false" dateRequired="true" dateOrdered="false"
	 * @generated
	 */
	void findAvailableServices(Hotel_Facility facility, Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void getBookedServices(Hotel_Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookedServiceIDRequired="true" bookedServiceIDOrdered="false"
	 * @generated
	 */
	void findBookedService(int bookedServiceID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void cancelBookedService(Booking_BookedService service);

} // IServiceBooking
