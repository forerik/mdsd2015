/**
 */
package ClassDiagram.util;

import ClassDiagram.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage
 * @generated
 */
public class ClassDiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassDiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = ClassDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ClassDiagramPackage.COMPANY: {
				Company company = (Company)theEObject;
				T result = caseCompany(company);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.COMPANY_HOTEL: {
				Company_Hotel company_Hotel = (Company_Hotel)theEObject;
				T result = caseCompany_Hotel(company_Hotel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.HOTEL_BOOKING: {
				Hotel_Booking hotel_Booking = (Hotel_Booking)theEObject;
				T result = caseHotel_Booking(hotel_Booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE: {
				Booking_BookedService booking_BookedService = (Booking_BookedService)theEObject;
				T result = caseBooking_BookedService(booking_BookedService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.HOTEL_ROOM: {
				Hotel_Room hotel_Room = (Hotel_Room)theEObject;
				T result = caseHotel_Room(hotel_Room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE: {
				Room_RoomAppliance room_RoomAppliance = (Room_RoomAppliance)theEObject;
				T result = caseRoom_RoomAppliance(room_RoomAppliance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_APPLIANCE_APPLIANCE_TYPE: {
				RoomAppliance_ApplianceType roomAppliance_ApplianceType = (RoomAppliance_ApplianceType)theEObject;
				T result = caseRoomAppliance_ApplianceType(roomAppliance_ApplianceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.APPLIANCE_TYPE_APPLIANCE_SERVICE: {
				ApplianceType_ApplianceService applianceType_ApplianceService = (ApplianceType_ApplianceService)theEObject;
				T result = caseApplianceType_ApplianceService(applianceType_ApplianceService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_ROOM_TYPE: {
				Room_RoomType room_RoomType = (Room_RoomType)theEObject;
				T result = caseRoom_RoomType(room_RoomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_ROOM_KEY: {
				Room_RoomKey room_RoomKey = (Room_RoomKey)theEObject;
				T result = caseRoom_RoomKey(room_RoomKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.COMPANY_GUEST_RECORD: {
				Company_GuestRecord company_GuestRecord = (Company_GuestRecord)theEObject;
				T result = caseCompany_GuestRecord(company_GuestRecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BOOKING_BILL: {
				Booking_Bill booking_Bill = (Booking_Bill)theEObject;
				T result = caseBooking_Bill(booking_Bill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BOOKING_PURCHASED_SERVICE: {
				Booking_PurchasedService booking_PurchasedService = (Booking_PurchasedService)theEObject;
				T result = caseBooking_PurchasedService(booking_PurchasedService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.HOTEL_FACILITY: {
				Hotel_Facility hotel_Facility = (Hotel_Facility)theEObject;
				T result = caseHotel_Facility(hotel_Facility);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.FACILITY_FACILITY_TYPE: {
				Facility_FacilityType facility_FacilityType = (Facility_FacilityType)theEObject;
				T result = caseFacility_FacilityType(facility_FacilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.FACILITY_FACILITY_SERVICE: {
				Facility_FacilityService facility_FacilityService = (Facility_FacilityService)theEObject;
				T result = caseFacility_FacilityService(facility_FacilityService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.HOTEL_STAFF: {
				Hotel_Staff hotel_Staff = (Hotel_Staff)theEObject;
				T result = caseHotel_Staff(hotel_Staff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IROOM_MANAGER: {
				IRoomManager iRoomManager = (IRoomManager)theEObject;
				T result = caseIRoomManager(iRoomManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BOOKING_MANAGER: {
				BookingManager bookingManager = (BookingManager)theEObject;
				T result = caseBookingManager(bookingManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IGUEST_MANAGER: {
				IGuestManager iGuestManager = (IGuestManager)theEObject;
				T result = caseIGuestManager(iGuestManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IBILL_MANAGER: {
				IBillManager iBillManager = (IBillManager)theEObject;
				T result = caseIBillManager(iBillManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IFACILITY_MANAGER: {
				IFacilityManager iFacilityManager = (IFacilityManager)theEObject;
				T result = caseIFacilityManager(iFacilityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IAPPLIANCE_ADMINISTRATION: {
				IApplianceAdministration iApplianceAdministration = (IApplianceAdministration)theEObject;
				T result = caseIApplianceAdministration(iApplianceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IROOM_ADMINISTRATION: {
				IRoomAdministration iRoomAdministration = (IRoomAdministration)theEObject;
				T result = caseIRoomAdministration(iRoomAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IFACILITY_ADMINISTRATION: {
				IFacilityAdministration iFacilityAdministration = (IFacilityAdministration)theEObject;
				T result = caseIFacilityAdministration(iFacilityAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ISTAFF_ADMINISTRATION: {
				IStaffAdministration iStaffAdministration = (IStaffAdministration)theEObject;
				T result = caseIStaffAdministration(iStaffAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IHOTEL_ADMINISTRATION: {
				IHotelAdministration iHotelAdministration = (IHotelAdministration)theEObject;
				T result = caseIHotelAdministration(iHotelAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.IBOOKING: {
				IBooking iBooking = (IBooking)theEObject;
				T result = caseIBooking(iBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ISERVICE_BOOKING: {
				IServiceBooking iServiceBooking = (IServiceBooking)theEObject;
				T result = caseIServiceBooking(iServiceBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.GUEST_BOOKING: {
				GuestBooking guestBooking = (GuestBooking)theEObject;
				T result = caseGuestBooking(guestBooking);
				if (result == null) result = caseIBooking(guestBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.STAFF_BOOKING: {
				StaffBooking staffBooking = (StaffBooking)theEObject;
				T result = caseStaffBooking(staffBooking);
				if (result == null) result = caseBookingManager(staffBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.FACILITY_ADMINISTRATION: {
				FacilityAdministration facilityAdministration = (FacilityAdministration)theEObject;
				T result = caseFacilityAdministration(facilityAdministration);
				if (result == null) result = caseIFacilityAdministration(facilityAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.SERVICE_BOOKING: {
				ServiceBooking serviceBooking = (ServiceBooking)theEObject;
				T result = caseServiceBooking(serviceBooking);
				if (result == null) result = caseIServiceBooking(serviceBooking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.FACILITY_MANAGER: {
				FacilityManager facilityManager = (FacilityManager)theEObject;
				T result = caseFacilityManager(facilityManager);
				if (result == null) result = caseIFacilityManager(facilityManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.GUEST_MANAGER: {
				GuestManager guestManager = (GuestManager)theEObject;
				T result = caseGuestManager(guestManager);
				if (result == null) result = caseIGuestManager(guestManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.BILL_MANAGER: {
				BillManager billManager = (BillManager)theEObject;
				T result = caseBillManager(billManager);
				if (result == null) result = caseIBillManager(billManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.HOTEL_ADMINISTRATION: {
				HotelAdministration hotelAdministration = (HotelAdministration)theEObject;
				T result = caseHotelAdministration(hotelAdministration);
				if (result == null) result = caseIHotelAdministration(hotelAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.STAFF_ADMINISTRATION: {
				StaffAdministration staffAdministration = (StaffAdministration)theEObject;
				T result = caseStaffAdministration(staffAdministration);
				if (result == null) result = caseIStaffAdministration(staffAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_MANAGER: {
				RoomManager roomManager = (RoomManager)theEObject;
				T result = caseRoomManager(roomManager);
				if (result == null) result = caseIRoomManager(roomManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.ROOM_ADMINISTRATION: {
				RoomAdministration roomAdministration = (RoomAdministration)theEObject;
				T result = caseRoomAdministration(roomAdministration);
				if (result == null) result = caseIRoomAdministration(roomAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION: {
				ApplianceAdministration applianceAdministration = (ApplianceAdministration)theEObject;
				T result = caseApplianceAdministration(applianceAdministration);
				if (result == null) result = caseIApplianceAdministration(applianceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompany(Company object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company Hotel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company Hotel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompany_Hotel(Company_Hotel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Booking(Hotel_Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Booked Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Booked Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking_BookedService(Booking_BookedService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Company Guest Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Company Guest Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompany_GuestRecord(Company_GuestRecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Bill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking_Bill(Booking_Bill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Purchased Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Purchased Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking_PurchasedService(Booking_PurchasedService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Room(Hotel_Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Room Appliance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Room Appliance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom_RoomAppliance(Room_RoomAppliance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Appliance Appliance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Appliance Appliance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomAppliance_ApplianceType(RoomAppliance_ApplianceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appliance Type Appliance Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appliance Type Appliance Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplianceType_ApplianceService(ApplianceType_ApplianceService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom_RoomType(Room_RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Room Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Room Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom_RoomKey(Room_RoomKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Facility</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Facility</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Facility(Hotel_Facility object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Facility Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Facility Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacility_FacilityType(Facility_FacilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Facility Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Facility Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacility_FacilityService(Facility_FacilityService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotel_Staff(Hotel_Staff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomManager(IRoomManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingManager(BookingManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGuest Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGuest Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGuestManager(IGuestManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBill Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBill Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBillManager(IBillManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFacility Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFacility Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFacilityManager(IFacilityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAppliance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAppliance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIApplianceAdministration(IApplianceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomAdministration(IRoomAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IFacility Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IFacility Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFacilityAdministration(IFacilityAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStaff Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStaff Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaffAdministration(IStaffAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IHotel Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IHotel Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHotelAdministration(IHotelAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBooking(IBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IService Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IService Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIServiceBooking(IServiceBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestBooking(GuestBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffBooking(StaffBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilityAdministration(FacilityAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBooking(ServiceBooking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilityManager(FacilityManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestManager(GuestManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bill Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bill Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillManager(BillManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hotel Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hotel Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHotelAdministration(HotelAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffAdministration(StaffAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomManager(RoomManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomAdministration(RoomAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appliance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appliance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplianceAdministration(ApplianceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ClassDiagramSwitch
