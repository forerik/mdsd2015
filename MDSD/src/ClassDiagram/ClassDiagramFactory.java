/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage
 * @generated
 */
public interface ClassDiagramFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagramFactory eINSTANCE = ClassDiagram.impl.ClassDiagramFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company</em>'.
	 * @generated
	 */
	Company createCompany();

	/**
	 * Returns a new object of class '<em>Company Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company Hotel</em>'.
	 * @generated
	 */
	Company_Hotel createCompany_Hotel();

	/**
	 * Returns a new object of class '<em>Hotel Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Booking</em>'.
	 * @generated
	 */
	Hotel_Booking createHotel_Booking();

	/**
	 * Returns a new object of class '<em>Booking Booked Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Booked Service</em>'.
	 * @generated
	 */
	Booking_BookedService createBooking_BookedService();

	/**
	 * Returns a new object of class '<em>Hotel Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Room</em>'.
	 * @generated
	 */
	Hotel_Room createHotel_Room();

	/**
	 * Returns a new object of class '<em>Room Room Appliance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Room Appliance</em>'.
	 * @generated
	 */
	Room_RoomAppliance createRoom_RoomAppliance();

	/**
	 * Returns a new object of class '<em>Room Appliance Appliance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Appliance Appliance Type</em>'.
	 * @generated
	 */
	RoomAppliance_ApplianceType createRoomAppliance_ApplianceType();

	/**
	 * Returns a new object of class '<em>Appliance Type Appliance Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appliance Type Appliance Service</em>'.
	 * @generated
	 */
	ApplianceType_ApplianceService createApplianceType_ApplianceService();

	/**
	 * Returns a new object of class '<em>Room Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Room Type</em>'.
	 * @generated
	 */
	Room_RoomType createRoom_RoomType();

	/**
	 * Returns a new object of class '<em>Room Room Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Room Key</em>'.
	 * @generated
	 */
	Room_RoomKey createRoom_RoomKey();

	/**
	 * Returns a new object of class '<em>Company Guest Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Company Guest Record</em>'.
	 * @generated
	 */
	Company_GuestRecord createCompany_GuestRecord();

	/**
	 * Returns a new object of class '<em>Booking Bill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Bill</em>'.
	 * @generated
	 */
	Booking_Bill createBooking_Bill();

	/**
	 * Returns a new object of class '<em>Booking Purchased Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Purchased Service</em>'.
	 * @generated
	 */
	Booking_PurchasedService createBooking_PurchasedService();

	/**
	 * Returns a new object of class '<em>Hotel Facility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Facility</em>'.
	 * @generated
	 */
	Hotel_Facility createHotel_Facility();

	/**
	 * Returns a new object of class '<em>Facility Facility Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facility Facility Type</em>'.
	 * @generated
	 */
	Facility_FacilityType createFacility_FacilityType();

	/**
	 * Returns a new object of class '<em>Facility Facility Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facility Facility Service</em>'.
	 * @generated
	 */
	Facility_FacilityService createFacility_FacilityService();

	/**
	 * Returns a new object of class '<em>Hotel Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Staff</em>'.
	 * @generated
	 */
	Hotel_Staff createHotel_Staff();

	/**
	 * Returns a new object of class '<em>Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Manager</em>'.
	 * @generated
	 */
	BookingManager createBookingManager();

	/**
	 * Returns a new object of class '<em>Facility Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facility Manager</em>'.
	 * @generated
	 */
	FacilityManager createFacilityManager();

	/**
	 * Returns a new object of class '<em>Hotel Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Administration</em>'.
	 * @generated
	 */
	HotelAdministration createHotelAdministration();

	/**
	 * Returns a new object of class '<em>Bill Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bill Manager</em>'.
	 * @generated
	 */
	BillManager createBillManager();

	/**
	 * Returns a new object of class '<em>Staff Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff Administration</em>'.
	 * @generated
	 */
	StaffAdministration createStaffAdministration();

	/**
	 * Returns a new object of class '<em>Room Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Manager</em>'.
	 * @generated
	 */
	RoomManager createRoomManager();

	/**
	 * Returns a new object of class '<em>Room Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Administration</em>'.
	 * @generated
	 */
	RoomAdministration createRoomAdministration();

	/**
	 * Returns a new object of class '<em>Appliance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appliance Administration</em>'.
	 * @generated
	 */
	ApplianceAdministration createApplianceAdministration();

	/**
	 * Returns a new object of class '<em>Guest Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest Manager</em>'.
	 * @generated
	 */
	GuestManager createGuestManager();

	/**
	 * Returns a new object of class '<em>Facility Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facility Administration</em>'.
	 * @generated
	 */
	FacilityAdministration createFacilityAdministration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClassDiagramPackage getClassDiagramPackage();

} //ClassDiagramFactory
