/**
 */
package ClassDiagram.impl;

import ClassDiagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagramFactoryImpl extends EFactoryImpl implements ClassDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassDiagramFactory init() {
		try {
			ClassDiagramFactory theClassDiagramFactory = (ClassDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(ClassDiagramPackage.eNS_URI);
			if (theClassDiagramFactory != null) {
				return theClassDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassDiagramPackage.COMPANY: return createCompany();
			case ClassDiagramPackage.COMPANY_HOTEL: return createCompany_Hotel();
			case ClassDiagramPackage.HOTEL_ROOM: return createHotel_Room();
			case ClassDiagramPackage.ROOM_ROOM_KEY: return createRoom_RoomKey();
			case ClassDiagramPackage.ROOM_ROOM_TYPE: return createRoom_RoomType();
			case ClassDiagramPackage.ROOM_APPLIANCE_APPLIANCE_TYPE: return createRoomAppliance_ApplianceType();
			case ClassDiagramPackage.APPLIANCE_TYPE_APPLIANCE_SERVICE: return createApplianceType_ApplianceService();
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE: return createRoom_RoomAppliance();
			case ClassDiagramPackage.HOTEL_STAFF: return createHotel_Staff();
			case ClassDiagramPackage.HOTEL_BOOKING: return createHotel_Booking();
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE: return createBooking_BookedService();
			case ClassDiagramPackage.FACILITY_FACILITY_SERVICE: return createFacility_FacilityService();
			case ClassDiagramPackage.COMPANY_GUEST_RECORD: return createCompany_GuestRecord();
			case ClassDiagramPackage.BOOKING_BILL: return createBooking_Bill();
			case ClassDiagramPackage.BOOKING_PURCHASED_SERVICE: return createBooking_PurchasedService();
			case ClassDiagramPackage.HOTEL_FACILITY: return createHotel_Facility();
			case ClassDiagramPackage.FACILITY_FACILITY_TYPE: return createFacility_FacilityType();
			case ClassDiagramPackage.BOOKING_MANAGER: return createBookingManager();
			case ClassDiagramPackage.STAFF_ADMINISTRATION: return createStaffAdministration();
			case ClassDiagramPackage.ROOM_MANAGER: return createRoomManager();
			case ClassDiagramPackage.ROOM_ADMINISTRATION: return createRoomAdministration();
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION: return createApplianceAdministration();
			case ClassDiagramPackage.GUEST_MANAGER: return createGuestManager();
			case ClassDiagramPackage.FACILITY_ADMINISTRATION: return createFacilityAdministration();
			case ClassDiagramPackage.HOTEL_ADMINISTRATION: return createHotelAdministration();
			case ClassDiagramPackage.BILL_MANAGER: return createBillManager();
			case ClassDiagramPackage.FACILITY_MANAGER: return createFacilityManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ClassDiagramPackage.STAFF_TYPE:
				return createStaffTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ClassDiagramPackage.STAFF_TYPE:
				return convertStaffTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company createCompany() {
		CompanyImpl company = new CompanyImpl();
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company_Hotel createCompany_Hotel() {
		Company_HotelImpl company_Hotel = new Company_HotelImpl();
		return company_Hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Room createHotel_Room() {
		Hotel_RoomImpl hotel_Room = new Hotel_RoomImpl();
		return hotel_Room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room_RoomKey createRoom_RoomKey() {
		Room_RoomKeyImpl room_RoomKey = new Room_RoomKeyImpl();
		return room_RoomKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room_RoomType createRoom_RoomType() {
		Room_RoomTypeImpl room_RoomType = new Room_RoomTypeImpl();
		return room_RoomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAppliance_ApplianceType createRoomAppliance_ApplianceType() {
		RoomAppliance_ApplianceTypeImpl roomAppliance_ApplianceType = new RoomAppliance_ApplianceTypeImpl();
		return roomAppliance_ApplianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplianceType_ApplianceService createApplianceType_ApplianceService() {
		ApplianceType_ApplianceServiceImpl applianceType_ApplianceService = new ApplianceType_ApplianceServiceImpl();
		return applianceType_ApplianceService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room_RoomAppliance createRoom_RoomAppliance() {
		Room_RoomApplianceImpl room_RoomAppliance = new Room_RoomApplianceImpl();
		return room_RoomAppliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Staff createHotel_Staff() {
		Hotel_StaffImpl hotel_Staff = new Hotel_StaffImpl();
		return hotel_Staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManager createBookingManager() {
		BookingManagerImpl bookingManager = new BookingManagerImpl();
		return bookingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company_GuestRecord createCompany_GuestRecord() {
		Company_GuestRecordImpl company_GuestRecord = new Company_GuestRecordImpl();
		return company_GuestRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Booking createHotel_Booking() {
		Hotel_BookingImpl hotel_Booking = new Hotel_BookingImpl();
		return hotel_Booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking_BookedService createBooking_BookedService() {
		Booking_BookedServiceImpl booking_BookedService = new Booking_BookedServiceImpl();
		return booking_BookedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility_FacilityService createFacility_FacilityService() {
		Facility_FacilityServiceImpl facility_FacilityService = new Facility_FacilityServiceImpl();
		return facility_FacilityService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking_Bill createBooking_Bill() {
		Booking_BillImpl booking_Bill = new Booking_BillImpl();
		return booking_Bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking_PurchasedService createBooking_PurchasedService() {
		Booking_PurchasedServiceImpl booking_PurchasedService = new Booking_PurchasedServiceImpl();
		return booking_PurchasedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hotel_Facility createHotel_Facility() {
		Hotel_FacilityImpl hotel_Facility = new Hotel_FacilityImpl();
		return hotel_Facility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility_FacilityType createFacility_FacilityType() {
		Facility_FacilityTypeImpl facility_FacilityType = new Facility_FacilityTypeImpl();
		return facility_FacilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAdministration createStaffAdministration() {
		StaffAdministrationImpl staffAdministration = new StaffAdministrationImpl();
		return staffAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManager createRoomManager() {
		RoomManagerImpl roomManager = new RoomManagerImpl();
		return roomManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAdministration createRoomAdministration() {
		RoomAdministrationImpl roomAdministration = new RoomAdministrationImpl();
		return roomAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplianceAdministration createApplianceAdministration() {
		ApplianceAdministrationImpl applianceAdministration = new ApplianceAdministrationImpl();
		return applianceAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestManager createGuestManager() {
		GuestManagerImpl guestManager = new GuestManagerImpl();
		return guestManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityAdministration createFacilityAdministration() {
		FacilityAdministrationImpl facilityAdministration = new FacilityAdministrationImpl();
		return facilityAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelAdministration createHotelAdministration() {
		HotelAdministrationImpl hotelAdministration = new HotelAdministrationImpl();
		return hotelAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillManager createBillManager() {
		BillManagerImpl billManager = new BillManagerImpl();
		return billManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityManager createFacilityManager() {
		FacilityManagerImpl facilityManager = new FacilityManagerImpl();
		return facilityManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffType createStaffTypeFromString(EDataType eDataType, String initialValue) {
		StaffType result = StaffType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStaffTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramPackage getClassDiagramPackage() {
		return (ClassDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassDiagramPackage getPackage() {
		return ClassDiagramPackage.eINSTANCE;
	}

} //ClassDiagramFactoryImpl
