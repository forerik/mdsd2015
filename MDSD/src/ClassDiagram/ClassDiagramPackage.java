/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramFactory
 * @model kind="package"
 * @generated
 */
public interface ClassDiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ClassDiagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ClassDiagram.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ClassDiagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassDiagramPackage eINSTANCE = ClassDiagram.impl.ClassDiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.CompanyImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 0;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__OWNS = 0;

	/**
	 * The feature id for the '<em><b>Records Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__RECORDS_OF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Company_HotelImpl <em>Company Hotel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Company_HotelImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCompany_Hotel()
	 * @generated
	 */
	int COMPANY_HOTEL = 1;

	/**
	 * The feature id for the '<em><b>List Of Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__LIST_OF_ROOMS = 0;

	/**
	 * The feature id for the '<em><b>Employees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__EMPLOYEES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>List Of Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__LIST_OF_BOOKINGS = 3;

	/**
	 * The number of structural features of the '<em>Company Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Company Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Hotel_BookingImpl <em>Hotel Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Hotel_BookingImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Booking()
	 * @generated
	 */
	int HOTEL_BOOKING = 9;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Booking_BookedServiceImpl <em>Booking Booked Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Booking_BookedServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_BookedService()
	 * @generated
	 */
	int BOOKING_BOOKED_SERVICE = 10;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Hotel_RoomImpl <em>Hotel Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Hotel_RoomImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Room()
	 * @generated
	 */
	int HOTEL_ROOM = 2;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Accessed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__ACCESSED_BY = 1;

	/**
	 * The feature id for the '<em><b>Cleaning Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__CLEANING_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Maintence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__MAINTENCE_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__ROOM_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Hotel Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Hotel Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Room_RoomApplianceImpl <em>Room Room Appliance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Room_RoomApplianceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomAppliance()
	 * @generated
	 */
	int ROOM_ROOM_APPLIANCE = 7;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomAppliance_ApplianceTypeImpl <em>Room Appliance Appliance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomAppliance_ApplianceTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomAppliance_ApplianceType()
	 * @generated
	 */
	int ROOM_APPLIANCE_APPLIANCE_TYPE = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ApplianceType_ApplianceServiceImpl <em>Appliance Type Appliance Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ApplianceType_ApplianceServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getApplianceType_ApplianceService()
	 * @generated
	 */
	int APPLIANCE_TYPE_APPLIANCE_SERVICE = 6;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Room_RoomTypeImpl <em>Room Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Room_RoomTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomType()
	 * @generated
	 */
	int ROOM_ROOM_TYPE = 4;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Room_RoomKeyImpl <em>Room Room Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Room_RoomKeyImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomKey()
	 * @generated
	 */
	int ROOM_ROOM_KEY = 3;

	/**
	 * The feature id for the '<em><b>Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_KEY__EXPIRATION_DATE = 0;

	/**
	 * The number of structural features of the '<em>Room Room Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_KEY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Room Room Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_KEY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_TYPE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Max Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS = 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_TYPE__AREA = 2;

	/**
	 * The feature id for the '<em><b>Appliance Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_TYPE__APPLIANCE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Room Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Room Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_APPLIANCE_APPLIANCE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Room Appliance Appliance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_APPLIANCE_APPLIANCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Room Appliance Appliance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_APPLIANCE_APPLIANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_TYPE_APPLIANCE_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_TYPE_APPLIANCE_SERVICE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Appliance Type Appliance Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_TYPE_APPLIANCE_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Appliance Type Appliance Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_TYPE_APPLIANCE_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_APPLIANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Appliance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Room Room Appliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_APPLIANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Room Appliance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_APPLIANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Company_GuestRecordImpl <em>Company Guest Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Company_GuestRecordImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCompany_GuestRecord()
	 * @generated
	 */
	int COMPANY_GUEST_RECORD = 12;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Booking_BillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Booking_BillImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_Bill()
	 * @generated
	 */
	int BOOKING_BILL = 13;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Booking_PurchasedServiceImpl <em>Booking Purchased Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Booking_PurchasedServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_PurchasedService()
	 * @generated
	 */
	int BOOKING_PURCHASED_SERVICE = 14;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Hotel_FacilityImpl <em>Hotel Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Hotel_FacilityImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Facility()
	 * @generated
	 */
	int HOTEL_FACILITY = 15;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Facility_FacilityTypeImpl <em>Facility Facility Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Facility_FacilityTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacility_FacilityType()
	 * @generated
	 */
	int FACILITY_FACILITY_TYPE = 16;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Facility_FacilityServiceImpl <em>Facility Facility Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Facility_FacilityServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacility_FacilityService()
	 * @generated
	 */
	int FACILITY_FACILITY_SERVICE = 11;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Hotel_StaffImpl <em>Hotel Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Hotel_StaffImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Staff()
	 * @generated
	 */
	int HOTEL_STAFF = 8;

	/**
	 * The feature id for the '<em><b>Ssn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__SSN = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Has Work Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__HAS_WORK_TITEL = 3;

	/**
	 * The number of structural features of the '<em>Hotel Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hotel Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.IServiceBooking <em>IService Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IServiceBooking
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIServiceBooking()
	 * @generated
	 */
	int ISERVICE_BOOKING = 17;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BookingManagerImpl <em>Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BookingManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBookingManager()
	 * @generated
	 */
	int BOOKING_MANAGER = 18;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__START_DATE = 0;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__END_DATE = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__CHECKED_IN = 3;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__BOOKING_ID = 4;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__INCLUDES = 5;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__ROOMS = 6;

	/**
	 * The feature id for the '<em><b>Responsible Guest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__RESPONSIBLE_GUEST = 7;

	/**
	 * The number of structural features of the '<em>Hotel Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Hotel Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BOOKED_SERVICE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Facility Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BOOKED_SERVICE__FACILITY_SERVICE = 1;

	/**
	 * The number of structural features of the '<em>Booking Booked Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BOOKED_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Booking Booked Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BOOKED_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_SERVICE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Facility Facility Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Facility Facility Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD__ADRESS = 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD__PHONE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Ssn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD__SSN = 3;

	/**
	 * The feature id for the '<em><b>Payment Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD__PAYMENT_INFORMATION = 4;

	/**
	 * The number of structural features of the '<em>Company Guest Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Company Guest Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Paid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__PAID_AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__CONTAINS = 1;

	/**
	 * The number of structural features of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Booking Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PURCHASED_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PURCHASED_SERVICE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Booking Purchased Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PURCHASED_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Booking Purchased Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_PURCHASED_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FACILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Facility Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FACILITY__FACILITY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Hotel Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FACILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hotel Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FACILITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Facility Facility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Facility Facility Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>IService Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Book Facility Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING___BOOK_FACILITY_SERVICE__HOTEL_BOOKING_HOTEL_FACILITY_FACILITY_FACILITYSERVICE_DATE_STRING = 0;

	/**
	 * The operation id for the '<em>Find Available Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING___FIND_AVAILABLE_SERVICES__HOTEL_FACILITY_DATE = 1;

	/**
	 * The operation id for the '<em>Get Booked Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING___GET_BOOKED_SERVICES__HOTEL_BOOKING = 2;

	/**
	 * The operation id for the '<em>Find Booked Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING___FIND_BOOKED_SERVICE__INT = 3;

	/**
	 * The operation id for the '<em>Cancel Booked Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING___CANCEL_BOOKED_SERVICE__BOOKING_BOOKEDSERVICE = 4;

	/**
	 * The number of operations of the '<em>IService Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_BOOKING_OPERATION_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_ELIST_COMPANY_GUESTRECORD = 0;

	/**
	 * The operation id for the '<em>Find Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___FIND_AVAILABLE_ROOMS__DATE_DATE_ELIST = 1;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_IN__HOTEL_BOOKING = 2;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_OUT__HOTEL_BOOKING = 3;

	/**
	 * The operation id for the '<em>Assign Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE = 4;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___FIND_BOOKING__DATE_INT = 5;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___EDIT_BOOKING__INT = 6;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CANCEL_BOOKING__INT = 7;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___GET_BOOKINGS__STRING = 8;

	/**
	 * The number of operations of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.FacilityManagerImpl <em>Facility Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.FacilityManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacilityManager()
	 * @generated
	 */
	int FACILITY_MANAGER = 27;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.HotelAdministrationImpl <em>Hotel Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.HotelAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotelAdministration()
	 * @generated
	 */
	int HOTEL_ADMINISTRATION = 25;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BillManagerImpl <em>Bill Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BillManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBillManager()
	 * @generated
	 */
	int BILL_MANAGER = 26;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.StaffAdministrationImpl <em>Staff Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.StaffAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffAdministration()
	 * @generated
	 */
	int STAFF_ADMINISTRATION = 19;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Staff Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION___ADD_STAFF__STRING_STRING_STRING_STAFFTYPE = 0;

	/**
	 * The operation id for the '<em>Edit Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION___EDIT_STAFF__HOTEL_STAFF = 1;

	/**
	 * The operation id for the '<em>Remove Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION___REMOVE_STAFF__HOTEL_STAFF = 2;

	/**
	 * The number of operations of the '<em>Staff Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomManagerImpl <em>Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomManager()
	 * @generated
	 */
	int ROOM_MANAGER = 20;

	/**
	 * The number of structural features of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___FIND_ROOM__INT = 0;

	/**
	 * The operation id for the '<em>Cleaning Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM = 1;

	/**
	 * The operation id for the '<em>Maintenance Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM = 2;

	/**
	 * The operation id for the '<em>Get Rooms To Clean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOMS_TO_CLEAN = 3;

	/**
	 * The operation id for the '<em>Get Rooms To Maintain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOMS_TO_MAINTAIN = 4;

	/**
	 * The number of operations of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomAdministrationImpl <em>Room Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomAdministration()
	 * @generated
	 */
	int ROOM_ADMINISTRATION = 21;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Room Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE_ELIST = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM = 1;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM = 2;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE = 3;

	/**
	 * The operation id for the '<em>Create Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___CREATE_ROOM_TYPE__DOUBLE_INT_DOUBLE_ROOMAPPLIANCE_APPLIANCETYPE = 4;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE = 5;

	/**
	 * The number of operations of the '<em>Room Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ApplianceAdministrationImpl <em>Appliance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ApplianceAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getApplianceAdministration()
	 * @generated
	 */
	int APPLIANCE_ADMINISTRATION = 22;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Appliance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM = 0;

	/**
	 * The operation id for the '<em>Remove Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE = 1;

	/**
	 * The operation id for the '<em>Add Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Edit Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = 3;

	/**
	 * The operation id for the '<em>Remove Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = 4;

	/**
	 * The operation id for the '<em>Edit Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE = 5;

	/**
	 * The operation id for the '<em>Add Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = 6;

	/**
	 * The operation id for the '<em>Edit Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = 7;

	/**
	 * The operation id for the '<em>Remove Appliance Server</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVER__APPLIANCETYPE_APPLIANCESERVICE = 8;

	/**
	 * The number of operations of the '<em>Appliance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.GuestManagerImpl <em>Guest Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.GuestManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestManager()
	 * @generated
	 */
	int GUEST_MANAGER = 23;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Guest Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Create Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___EDIT_GUEST_RECORD__STRING = 1;

	/**
	 * The operation id for the '<em>Remove Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___REMOVE_GUEST_RECORD__STRING = 2;

	/**
	 * The operation id for the '<em>Find Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___FIND_GUEST_RECORD__STRING = 3;

	/**
	 * The operation id for the '<em>Find Guest Records</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___FIND_GUEST_RECORDS__STRING_STRING = 4;

	/**
	 * The number of operations of the '<em>Guest Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.FacilityAdministrationImpl <em>Facility Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.FacilityAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacilityAdministration()
	 * @generated
	 */
	int FACILITY_ADMINISTRATION = 24;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Facility Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE = 0;

	/**
	 * The operation id for the '<em>Edit Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY = 1;

	/**
	 * The operation id for the '<em>Add Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Edit Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE = 3;

	/**
	 * The operation id for the '<em>Remove Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY = 4;

	/**
	 * The operation id for the '<em>Remove Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE = 5;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Edit Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE = 7;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE = 8;

	/**
	 * The number of operations of the '<em>Facility Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION_OPERATION_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Company</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION__COMPANY = 0;

	/**
	 * The number of structural features of the '<em>Hotel Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION___ADD_HOTEL__STRING = 0;

	/**
	 * The operation id for the '<em>Edit Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION___EDIT_HOTEL__COMPANY_HOTEL = 1;

	/**
	 * The operation id for the '<em>Remove Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION___REMOVE_HOTEL__COMPANY_HOTEL = 2;

	/**
	 * The number of operations of the '<em>Hotel Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Bill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Purchased Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___ADD_PURCHASED_SERVICE__STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Find Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___FIND_BILL__INT = 1;

	/**
	 * The operation id for the '<em>Create Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___CREATE_RECEIPT__INT = 2;

	/**
	 * The operation id for the '<em>Get Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___GET_AMOUNT__INT = 3;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___PAY__INT_DOUBLE = 4;

	/**
	 * The number of operations of the '<em>Bill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER__HOTEL = 0;

	/**
	 * The number of structural features of the '<em>Facility Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Find Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER___FIND_SERVICES__DATE_HOTEL_FACILITY_DATE = 0;

	/**
	 * The operation id for the '<em>Find Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER___FIND_SERVICES__DATE = 1;

	/**
	 * The operation id for the '<em>Find Booked Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD = 2;

	/**
	 * The number of operations of the '<em>Facility Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ClassDiagram.StaffType <em>Staff Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.StaffType
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffType()
	 * @generated
	 */
	int STAFF_TYPE = 28;


	/**
	 * Returns the meta object for class '{@link ClassDiagram.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see ClassDiagram.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns</em>'.
	 * @see ClassDiagram.Company#getOwns()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_Owns();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company#getRecordsOf <em>Records Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Records Of</em>'.
	 * @see ClassDiagram.Company#getRecordsOf()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_RecordsOf();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Company_Hotel <em>Company Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company Hotel</em>'.
	 * @see ClassDiagram.Company_Hotel
	 * @generated
	 */
	EClass getCompany_Hotel();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company_Hotel#getListOfRooms <em>List Of Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Of Rooms</em>'.
	 * @see ClassDiagram.Company_Hotel#getListOfRooms()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EReference getCompany_Hotel_ListOfRooms();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company_Hotel#getEmployees <em>Employees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employees</em>'.
	 * @see ClassDiagram.Company_Hotel#getEmployees()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EReference getCompany_Hotel_Employees();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company_Hotel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Company_Hotel#getName()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EAttribute getCompany_Hotel_Name();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company_Hotel#getListOfBookings <em>List Of Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Of Bookings</em>'.
	 * @see ClassDiagram.Company_Hotel#getListOfBookings()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EReference getCompany_Hotel_ListOfBookings();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Hotel_Booking <em>Hotel Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Booking</em>'.
	 * @see ClassDiagram.Hotel_Booking
	 * @generated
	 */
	EClass getHotel_Booking();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Booking#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see ClassDiagram.Hotel_Booking#getStartDate()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EAttribute getHotel_Booking_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Booking#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see ClassDiagram.Hotel_Booking#getEndDate()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EAttribute getHotel_Booking_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Booking#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.Hotel_Booking#getPrice()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EAttribute getHotel_Booking_Price();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Booking#isCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see ClassDiagram.Hotel_Booking#isCheckedIn()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EAttribute getHotel_Booking_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see ClassDiagram.Hotel_Booking#getBookingID()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EAttribute getHotel_Booking_BookingID();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Hotel_Booking#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see ClassDiagram.Hotel_Booking#getIncludes()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EReference getHotel_Booking_Includes();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Hotel_Booking#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see ClassDiagram.Hotel_Booking#getRooms()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EReference getHotel_Booking_Rooms();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Hotel_Booking#getResponsibleGuest <em>Responsible Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsible Guest</em>'.
	 * @see ClassDiagram.Hotel_Booking#getResponsibleGuest()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EReference getHotel_Booking_ResponsibleGuest();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Booking_BookedService <em>Booking Booked Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Booked Service</em>'.
	 * @see ClassDiagram.Booking_BookedService
	 * @generated
	 */
	EClass getBooking_BookedService();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Booking_BookedService#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see ClassDiagram.Booking_BookedService#getDate()
	 * @see #getBooking_BookedService()
	 * @generated
	 */
	EAttribute getBooking_BookedService_Date();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Booking_BookedService#getFacilityService <em>Facility Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Service</em>'.
	 * @see ClassDiagram.Booking_BookedService#getFacilityService()
	 * @see #getBooking_BookedService()
	 * @generated
	 */
	EReference getBooking_BookedService_FacilityService();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Hotel_Room <em>Hotel Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Room</em>'.
	 * @see ClassDiagram.Hotel_Room
	 * @generated
	 */
	EClass getHotel_Room();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see ClassDiagram.Hotel_Room#getRoomNumber()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EAttribute getHotel_Room_RoomNumber();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Hotel_Room#getAccessedBy <em>Accessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accessed By</em>'.
	 * @see ClassDiagram.Hotel_Room#getAccessedBy()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EReference getHotel_Room_AccessedBy();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Room#isCleaningStatus <em>Cleaning Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cleaning Status</em>'.
	 * @see ClassDiagram.Hotel_Room#isCleaningStatus()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EAttribute getHotel_Room_CleaningStatus();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Room#isMaintenceStatus <em>Maintence Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintence Status</em>'.
	 * @see ClassDiagram.Hotel_Room#isMaintenceStatus()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EAttribute getHotel_Room_MaintenceStatus();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Hotel_Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see ClassDiagram.Hotel_Room#getRoomType()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EReference getHotel_Room_RoomType();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Room_RoomAppliance <em>Room Room Appliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Room Appliance</em>'.
	 * @see ClassDiagram.Room_RoomAppliance
	 * @generated
	 */
	EClass getRoom_RoomAppliance();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Room_RoomAppliance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Room_RoomAppliance#getName()
	 * @see #getRoom_RoomAppliance()
	 * @generated
	 */
	EAttribute getRoom_RoomAppliance_Name();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Room_RoomAppliance#getApplianceType <em>Appliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Appliance Type</em>'.
	 * @see ClassDiagram.Room_RoomAppliance#getApplianceType()
	 * @see #getRoom_RoomAppliance()
	 * @generated
	 */
	EReference getRoom_RoomAppliance_ApplianceType();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.RoomAppliance_ApplianceType <em>Room Appliance Appliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Appliance Appliance Type</em>'.
	 * @see ClassDiagram.RoomAppliance_ApplianceType
	 * @generated
	 */
	EClass getRoomAppliance_ApplianceType();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.RoomAppliance_ApplianceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.RoomAppliance_ApplianceType#getName()
	 * @see #getRoomAppliance_ApplianceType()
	 * @generated
	 */
	EAttribute getRoomAppliance_ApplianceType_Name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.ApplianceType_ApplianceService <em>Appliance Type Appliance Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appliance Type Appliance Service</em>'.
	 * @see ClassDiagram.ApplianceType_ApplianceService
	 * @generated
	 */
	EClass getApplianceType_ApplianceService();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.ApplianceType_ApplianceService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.ApplianceType_ApplianceService#getName()
	 * @see #getApplianceType_ApplianceService()
	 * @generated
	 */
	EAttribute getApplianceType_ApplianceService_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.ApplianceType_ApplianceService#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.ApplianceType_ApplianceService#getPrice()
	 * @see #getApplianceType_ApplianceService()
	 * @generated
	 */
	EAttribute getApplianceType_ApplianceService_Price();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Room_RoomType <em>Room Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Room Type</em>'.
	 * @see ClassDiagram.Room_RoomType
	 * @generated
	 */
	EClass getRoom_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Room_RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.Room_RoomType#getPrice()
	 * @see #getRoom_RoomType()
	 * @generated
	 */
	EAttribute getRoom_RoomType_Price();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Room_RoomType#getMaxNumberOfGuests <em>Max Number Of Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Guests</em>'.
	 * @see ClassDiagram.Room_RoomType#getMaxNumberOfGuests()
	 * @see #getRoom_RoomType()
	 * @generated
	 */
	EAttribute getRoom_RoomType_MaxNumberOfGuests();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Room_RoomType#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see ClassDiagram.Room_RoomType#getArea()
	 * @see #getRoom_RoomType()
	 * @generated
	 */
	EAttribute getRoom_RoomType_Area();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Room_RoomType#getApplianceType <em>Appliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appliance Type</em>'.
	 * @see ClassDiagram.Room_RoomType#getApplianceType()
	 * @see #getRoom_RoomType()
	 * @generated
	 */
	EReference getRoom_RoomType_ApplianceType();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Room_RoomKey <em>Room Room Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Room Key</em>'.
	 * @see ClassDiagram.Room_RoomKey
	 * @generated
	 */
	EClass getRoom_RoomKey();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Room_RoomKey#getExpirationDate <em>Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration Date</em>'.
	 * @see ClassDiagram.Room_RoomKey#getExpirationDate()
	 * @see #getRoom_RoomKey()
	 * @generated
	 */
	EAttribute getRoom_RoomKey_ExpirationDate();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Company_GuestRecord <em>Company Guest Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company Guest Record</em>'.
	 * @see ClassDiagram.Company_GuestRecord
	 * @generated
	 */
	EClass getCompany_GuestRecord();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company_GuestRecord#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Company_GuestRecord#getName()
	 * @see #getCompany_GuestRecord()
	 * @generated
	 */
	EAttribute getCompany_GuestRecord_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company_GuestRecord#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see ClassDiagram.Company_GuestRecord#getAdress()
	 * @see #getCompany_GuestRecord()
	 * @generated
	 */
	EAttribute getCompany_GuestRecord_Adress();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company_GuestRecord#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see ClassDiagram.Company_GuestRecord#getPhoneNumber()
	 * @see #getCompany_GuestRecord()
	 * @generated
	 */
	EAttribute getCompany_GuestRecord_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company_GuestRecord#getSsn <em>Ssn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssn</em>'.
	 * @see ClassDiagram.Company_GuestRecord#getSsn()
	 * @see #getCompany_GuestRecord()
	 * @generated
	 */
	EAttribute getCompany_GuestRecord_Ssn();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company_GuestRecord#getPaymentInformation <em>Payment Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Information</em>'.
	 * @see ClassDiagram.Company_GuestRecord#getPaymentInformation()
	 * @see #getCompany_GuestRecord()
	 * @generated
	 */
	EAttribute getCompany_GuestRecord_PaymentInformation();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Booking_Bill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Bill</em>'.
	 * @see ClassDiagram.Booking_Bill
	 * @generated
	 */
	EClass getBooking_Bill();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Booking_Bill#getPaidAmount <em>Paid Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Amount</em>'.
	 * @see ClassDiagram.Booking_Bill#getPaidAmount()
	 * @see #getBooking_Bill()
	 * @generated
	 */
	EAttribute getBooking_Bill_PaidAmount();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Booking_Bill#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see ClassDiagram.Booking_Bill#getContains()
	 * @see #getBooking_Bill()
	 * @generated
	 */
	EReference getBooking_Bill_Contains();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Booking_PurchasedService <em>Booking Purchased Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Purchased Service</em>'.
	 * @see ClassDiagram.Booking_PurchasedService
	 * @generated
	 */
	EClass getBooking_PurchasedService();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Booking_PurchasedService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Booking_PurchasedService#getName()
	 * @see #getBooking_PurchasedService()
	 * @generated
	 */
	EAttribute getBooking_PurchasedService_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Booking_PurchasedService#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.Booking_PurchasedService#getPrice()
	 * @see #getBooking_PurchasedService()
	 * @generated
	 */
	EAttribute getBooking_PurchasedService_Price();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Hotel_Facility <em>Hotel Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Facility</em>'.
	 * @see ClassDiagram.Hotel_Facility
	 * @generated
	 */
	EClass getHotel_Facility();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Facility#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Hotel_Facility#getName()
	 * @see #getHotel_Facility()
	 * @generated
	 */
	EAttribute getHotel_Facility_Name();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Hotel_Facility#getFacilityType <em>Facility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Type</em>'.
	 * @see ClassDiagram.Hotel_Facility#getFacilityType()
	 * @see #getHotel_Facility()
	 * @generated
	 */
	EReference getHotel_Facility_FacilityType();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Facility_FacilityType <em>Facility Facility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility Facility Type</em>'.
	 * @see ClassDiagram.Facility_FacilityType
	 * @generated
	 */
	EClass getFacility_FacilityType();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Facility_FacilityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Facility_FacilityType#getName()
	 * @see #getFacility_FacilityType()
	 * @generated
	 */
	EAttribute getFacility_FacilityType_Name();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Facility_FacilityService <em>Facility Facility Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility Facility Service</em>'.
	 * @see ClassDiagram.Facility_FacilityService
	 * @generated
	 */
	EClass getFacility_FacilityService();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Facility_FacilityService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ClassDiagram.Facility_FacilityService#getName()
	 * @see #getFacility_FacilityService()
	 * @generated
	 */
	EAttribute getFacility_FacilityService_Name();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Facility_FacilityService#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.Facility_FacilityService#getPrice()
	 * @see #getFacility_FacilityService()
	 * @generated
	 */
	EAttribute getFacility_FacilityService_Price();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.Hotel_Staff <em>Hotel Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Staff</em>'.
	 * @see ClassDiagram.Hotel_Staff
	 * @generated
	 */
	EClass getHotel_Staff();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Staff#getSsn <em>Ssn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssn</em>'.
	 * @see ClassDiagram.Hotel_Staff#getSsn()
	 * @see #getHotel_Staff()
	 * @generated
	 */
	EAttribute getHotel_Staff_Ssn();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Staff#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see ClassDiagram.Hotel_Staff#getFirstName()
	 * @see #getHotel_Staff()
	 * @generated
	 */
	EAttribute getHotel_Staff_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Staff#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see ClassDiagram.Hotel_Staff#getLastName()
	 * @see #getHotel_Staff()
	 * @generated
	 */
	EAttribute getHotel_Staff_LastName();

	/**
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Staff#getHasWorkTitel <em>Has Work Titel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Work Titel</em>'.
	 * @see ClassDiagram.Hotel_Staff#getHasWorkTitel()
	 * @see #getHotel_Staff()
	 * @generated
	 */
	EAttribute getHotel_Staff_HasWorkTitel();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IServiceBooking <em>IService Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IService Booking</em>'.
	 * @see ClassDiagram.IServiceBooking
	 * @generated
	 */
	EClass getIServiceBooking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IServiceBooking#bookFacilityService(ClassDiagram.Hotel_Booking, ClassDiagram.Hotel_Facility, ClassDiagram.Facility_FacilityService, java.util.Date, java.lang.String) <em>Book Facility Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Book Facility Service</em>' operation.
	 * @see ClassDiagram.IServiceBooking#bookFacilityService(ClassDiagram.Hotel_Booking, ClassDiagram.Hotel_Facility, ClassDiagram.Facility_FacilityService, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getIServiceBooking__BookFacilityService__Hotel_Booking_Hotel_Facility_Facility_FacilityService_Date_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IServiceBooking#findAvailableServices(ClassDiagram.Hotel_Facility, java.util.Date) <em>Find Available Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Available Services</em>' operation.
	 * @see ClassDiagram.IServiceBooking#findAvailableServices(ClassDiagram.Hotel_Facility, java.util.Date)
	 * @generated
	 */
	EOperation getIServiceBooking__FindAvailableServices__Hotel_Facility_Date();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IServiceBooking#getBookedServices(ClassDiagram.Hotel_Booking) <em>Get Booked Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booked Services</em>' operation.
	 * @see ClassDiagram.IServiceBooking#getBookedServices(ClassDiagram.Hotel_Booking)
	 * @generated
	 */
	EOperation getIServiceBooking__GetBookedServices__Hotel_Booking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IServiceBooking#findBookedService(int) <em>Find Booked Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booked Service</em>' operation.
	 * @see ClassDiagram.IServiceBooking#findBookedService(int)
	 * @generated
	 */
	EOperation getIServiceBooking__FindBookedService__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IServiceBooking#cancelBookedService(ClassDiagram.Booking_BookedService) <em>Cancel Booked Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booked Service</em>' operation.
	 * @see ClassDiagram.IServiceBooking#cancelBookedService(ClassDiagram.Booking_BookedService)
	 * @generated
	 */
	EOperation getIServiceBooking__CancelBookedService__Booking_BookedService();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking Manager</em>'.
	 * @see ClassDiagram.BookingManager
	 * @generated
	 */
	EClass getBookingManager();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.BookingManager#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.BookingManager#getHotel()
	 * @see #getBookingManager()
	 * @generated
	 */
	EReference getBookingManager_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#createBooking(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList, ClassDiagram.Company_GuestRecord) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see ClassDiagram.BookingManager#createBooking(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList, ClassDiagram.Company_GuestRecord)
	 * @generated
	 */
	EOperation getBookingManager__CreateBooking__Date_Date_EList_Company_GuestRecord();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#findAvailableRooms(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList) <em>Find Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Available Rooms</em>' operation.
	 * @see ClassDiagram.BookingManager#findAvailableRooms(java.util.Date, java.util.Date, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getBookingManager__FindAvailableRooms__Date_Date_EList();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#checkIn(ClassDiagram.Hotel_Booking) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see ClassDiagram.BookingManager#checkIn(ClassDiagram.Hotel_Booking)
	 * @generated
	 */
	EOperation getBookingManager__CheckIn__Hotel_Booking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#checkOut(ClassDiagram.Hotel_Booking) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see ClassDiagram.BookingManager#checkOut(ClassDiagram.Hotel_Booking)
	 * @generated
	 */
	EOperation getBookingManager__CheckOut__Hotel_Booking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#assignKey(ClassDiagram.Hotel_Room, ClassDiagram.Hotel_Booking, java.util.Date) <em>Assign Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Key</em>' operation.
	 * @see ClassDiagram.BookingManager#assignKey(ClassDiagram.Hotel_Room, ClassDiagram.Hotel_Booking, java.util.Date)
	 * @generated
	 */
	EOperation getBookingManager__AssignKey__Hotel_Room_Hotel_Booking_Date();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#findBooking(java.util.Date, int) <em>Find Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booking</em>' operation.
	 * @see ClassDiagram.BookingManager#findBooking(java.util.Date, int)
	 * @generated
	 */
	EOperation getBookingManager__FindBooking__Date_int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#editBooking(int) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see ClassDiagram.BookingManager#editBooking(int)
	 * @generated
	 */
	EOperation getBookingManager__EditBooking__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#cancelBooking(int) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see ClassDiagram.BookingManager#cancelBooking(int)
	 * @generated
	 */
	EOperation getBookingManager__CancelBooking__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#getBookings(java.lang.String) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see ClassDiagram.BookingManager#getBookings(java.lang.String)
	 * @generated
	 */
	EOperation getBookingManager__GetBookings__String();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.FacilityManager <em>Facility Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility Manager</em>'.
	 * @see ClassDiagram.FacilityManager
	 * @generated
	 */
	EClass getFacilityManager();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.FacilityManager#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.FacilityManager#getHotel()
	 * @see #getFacilityManager()
	 * @generated
	 */
	EReference getFacilityManager_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityManager#findServices(java.util.Date, ClassDiagram.Hotel_Facility, java.util.Date) <em>Find Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Services</em>' operation.
	 * @see ClassDiagram.FacilityManager#findServices(java.util.Date, ClassDiagram.Hotel_Facility, java.util.Date)
	 * @generated
	 */
	EOperation getFacilityManager__FindServices__Date_Hotel_Facility_Date();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityManager#findServices(java.util.Date) <em>Find Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Services</em>' operation.
	 * @see ClassDiagram.FacilityManager#findServices(java.util.Date)
	 * @generated
	 */
	EOperation getFacilityManager__FindServices__Date();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityManager#findBookedServices(ClassDiagram.Company_GuestRecord) <em>Find Booked Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booked Services</em>' operation.
	 * @see ClassDiagram.FacilityManager#findBookedServices(ClassDiagram.Company_GuestRecord)
	 * @generated
	 */
	EOperation getFacilityManager__FindBookedServices__Company_GuestRecord();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.HotelAdministration <em>Hotel Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Administration</em>'.
	 * @see ClassDiagram.HotelAdministration
	 * @generated
	 */
	EClass getHotelAdministration();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.HotelAdministration#getCompany <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Company</em>'.
	 * @see ClassDiagram.HotelAdministration#getCompany()
	 * @see #getHotelAdministration()
	 * @generated
	 */
	EReference getHotelAdministration_Company();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.HotelAdministration#addHotel(java.lang.String) <em>Add Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Hotel</em>' operation.
	 * @see ClassDiagram.HotelAdministration#addHotel(java.lang.String)
	 * @generated
	 */
	EOperation getHotelAdministration__AddHotel__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.HotelAdministration#editHotel(ClassDiagram.Company_Hotel) <em>Edit Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Hotel</em>' operation.
	 * @see ClassDiagram.HotelAdministration#editHotel(ClassDiagram.Company_Hotel)
	 * @generated
	 */
	EOperation getHotelAdministration__EditHotel__Company_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.HotelAdministration#removeHotel(ClassDiagram.Company_Hotel) <em>Remove Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Hotel</em>' operation.
	 * @see ClassDiagram.HotelAdministration#removeHotel(ClassDiagram.Company_Hotel)
	 * @generated
	 */
	EOperation getHotelAdministration__RemoveHotel__Company_Hotel();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.BillManager <em>Bill Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill Manager</em>'.
	 * @see ClassDiagram.BillManager
	 * @generated
	 */
	EClass getBillManager();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.BillManager#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.BillManager#getHotel()
	 * @see #getBillManager()
	 * @generated
	 */
	EReference getBillManager_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BillManager#addPurchasedService(java.lang.String, java.lang.String, double) <em>Add Purchased Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Purchased Service</em>' operation.
	 * @see ClassDiagram.BillManager#addPurchasedService(java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getBillManager__AddPurchasedService__String_String_double();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BillManager#findBill(int) <em>Find Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Bill</em>' operation.
	 * @see ClassDiagram.BillManager#findBill(int)
	 * @generated
	 */
	EOperation getBillManager__FindBill__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BillManager#createReceipt(int) <em>Create Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Receipt</em>' operation.
	 * @see ClassDiagram.BillManager#createReceipt(int)
	 * @generated
	 */
	EOperation getBillManager__CreateReceipt__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BillManager#getAmount(int) <em>Get Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount</em>' operation.
	 * @see ClassDiagram.BillManager#getAmount(int)
	 * @generated
	 */
	EOperation getBillManager__GetAmount__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.BillManager#pay(int, double) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see ClassDiagram.BillManager#pay(int, double)
	 * @generated
	 */
	EOperation getBillManager__Pay__int_double();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.StaffAdministration <em>Staff Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Administration</em>'.
	 * @see ClassDiagram.StaffAdministration
	 * @generated
	 */
	EClass getStaffAdministration();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.StaffAdministration#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.StaffAdministration#getHotel()
	 * @see #getStaffAdministration()
	 * @generated
	 */
	EReference getStaffAdministration_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.StaffAdministration#addStaff(java.lang.String, java.lang.String, java.lang.String, ClassDiagram.StaffType) <em>Add Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Staff</em>' operation.
	 * @see ClassDiagram.StaffAdministration#addStaff(java.lang.String, java.lang.String, java.lang.String, ClassDiagram.StaffType)
	 * @generated
	 */
	EOperation getStaffAdministration__AddStaff__String_String_String_StaffType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.StaffAdministration#editStaff(ClassDiagram.Hotel_Staff) <em>Edit Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Staff</em>' operation.
	 * @see ClassDiagram.StaffAdministration#editStaff(ClassDiagram.Hotel_Staff)
	 * @generated
	 */
	EOperation getStaffAdministration__EditStaff__Hotel_Staff();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.StaffAdministration#removeStaff(ClassDiagram.Hotel_Staff) <em>Remove Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Staff</em>' operation.
	 * @see ClassDiagram.StaffAdministration#removeStaff(ClassDiagram.Hotel_Staff)
	 * @generated
	 */
	EOperation getStaffAdministration__RemoveStaff__Hotel_Staff();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager</em>'.
	 * @see ClassDiagram.RoomManager
	 * @generated
	 */
	EClass getRoomManager();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomManager#findRoom(int) <em>Find Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Room</em>' operation.
	 * @see ClassDiagram.RoomManager#findRoom(int)
	 * @generated
	 */
	EOperation getRoomManager__FindRoom__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomManager#cleaningStatus(ClassDiagram.Hotel_Room) <em>Cleaning Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cleaning Status</em>' operation.
	 * @see ClassDiagram.RoomManager#cleaningStatus(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getRoomManager__CleaningStatus__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomManager#maintenanceStatus(ClassDiagram.Hotel_Room) <em>Maintenance Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Maintenance Status</em>' operation.
	 * @see ClassDiagram.RoomManager#maintenanceStatus(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getRoomManager__MaintenanceStatus__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomManager#getRoomsToClean() <em>Get Rooms To Clean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms To Clean</em>' operation.
	 * @see ClassDiagram.RoomManager#getRoomsToClean()
	 * @generated
	 */
	EOperation getRoomManager__GetRoomsToClean();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomManager#getRoomsToMaintain() <em>Get Rooms To Maintain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms To Maintain</em>' operation.
	 * @see ClassDiagram.RoomManager#getRoomsToMaintain()
	 * @generated
	 */
	EOperation getRoomManager__GetRoomsToMaintain();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.RoomAdministration <em>Room Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Administration</em>'.
	 * @see ClassDiagram.RoomAdministration
	 * @generated
	 */
	EClass getRoomAdministration();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.RoomAdministration#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.RoomAdministration#getHotel()
	 * @see #getRoomAdministration()
	 * @generated
	 */
	EReference getRoomAdministration_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomAdministration#addRoom(int, ClassDiagram.Room_RoomType, org.eclipse.emf.common.util.EList) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see ClassDiagram.RoomAdministration#addRoom(int, ClassDiagram.Room_RoomType, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRoomAdministration__AddRoom__int_Room_RoomType_EList();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomAdministration#removeRoom(ClassDiagram.Hotel_Room) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see ClassDiagram.RoomAdministration#removeRoom(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getRoomAdministration__RemoveRoom__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomAdministration#editRoom(ClassDiagram.Hotel_Room) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see ClassDiagram.RoomAdministration#editRoom(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getRoomAdministration__EditRoom__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomAdministration#editRoomType(ClassDiagram.Room_RoomType) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see ClassDiagram.RoomAdministration#editRoomType(ClassDiagram.Room_RoomType)
	 * @generated
	 */
	EOperation getRoomAdministration__EditRoomType__Room_RoomType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomAdministration#createRoomType(double, int, double, ClassDiagram.RoomAppliance_ApplianceType) <em>Create Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room Type</em>' operation.
	 * @see ClassDiagram.RoomAdministration#createRoomType(double, int, double, ClassDiagram.RoomAppliance_ApplianceType)
	 * @generated
	 */
	EOperation getRoomAdministration__CreateRoomType__double_int_double_RoomAppliance_ApplianceType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.RoomAdministration#removeRoomType(ClassDiagram.Room_RoomType) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see ClassDiagram.RoomAdministration#removeRoomType(ClassDiagram.Room_RoomType)
	 * @generated
	 */
	EOperation getRoomAdministration__RemoveRoomType__Room_RoomType();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.ApplianceAdministration <em>Appliance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appliance Administration</em>'.
	 * @see ClassDiagram.ApplianceAdministration
	 * @generated
	 */
	EClass getApplianceAdministration();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.ApplianceAdministration#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.ApplianceAdministration#getHotel()
	 * @see #getApplianceAdministration()
	 * @generated
	 */
	EReference getApplianceAdministration_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#addAppliance(ClassDiagram.Hotel_Room) <em>Add Appliance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Appliance</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#addAppliance(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getApplianceAdministration__AddAppliance__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#removeAppliance(ClassDiagram.Room_RoomAppliance) <em>Remove Appliance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Appliance</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#removeAppliance(ClassDiagram.Room_RoomAppliance)
	 * @generated
	 */
	EOperation getApplianceAdministration__RemoveAppliance__Room_RoomAppliance();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#addApplianceType(java.lang.String) <em>Add Appliance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Appliance Type</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#addApplianceType(java.lang.String)
	 * @generated
	 */
	EOperation getApplianceAdministration__AddApplianceType__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#editApplianceType(ClassDiagram.RoomAppliance_ApplianceType) <em>Edit Appliance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Appliance Type</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#editApplianceType(ClassDiagram.RoomAppliance_ApplianceType)
	 * @generated
	 */
	EOperation getApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#removeApplianceType(ClassDiagram.RoomAppliance_ApplianceType) <em>Remove Appliance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Appliance Type</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#removeApplianceType(ClassDiagram.RoomAppliance_ApplianceType)
	 * @generated
	 */
	EOperation getApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#editAppliance(ClassDiagram.Room_RoomAppliance) <em>Edit Appliance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Appliance</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#editAppliance(ClassDiagram.Room_RoomAppliance)
	 * @generated
	 */
	EOperation getApplianceAdministration__EditAppliance__Room_RoomAppliance();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#addApplianceService(ClassDiagram.ApplianceType_ApplianceService) <em>Add Appliance Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Appliance Service</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#addApplianceService(ClassDiagram.ApplianceType_ApplianceService)
	 * @generated
	 */
	EOperation getApplianceAdministration__AddApplianceService__ApplianceType_ApplianceService();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#editApplianceService(ClassDiagram.ApplianceType_ApplianceService) <em>Edit Appliance Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Appliance Service</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#editApplianceService(ClassDiagram.ApplianceType_ApplianceService)
	 * @generated
	 */
	EOperation getApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.ApplianceAdministration#removeApplianceServer(ClassDiagram.ApplianceType_ApplianceService) <em>Remove Appliance Server</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Appliance Server</em>' operation.
	 * @see ClassDiagram.ApplianceAdministration#removeApplianceServer(ClassDiagram.ApplianceType_ApplianceService)
	 * @generated
	 */
	EOperation getApplianceAdministration__RemoveApplianceServer__ApplianceType_ApplianceService();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.GuestManager <em>Guest Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Manager</em>'.
	 * @see ClassDiagram.GuestManager
	 * @generated
	 */
	EClass getGuestManager();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.GuestManager#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.GuestManager#getHotel()
	 * @see #getGuestManager()
	 * @generated
	 */
	EReference getGuestManager_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.GuestManager#createGuestRecord(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Guest Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Guest Record</em>' operation.
	 * @see ClassDiagram.GuestManager#createGuestRecord(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuestManager__CreateGuestRecord__String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.GuestManager#editGuestRecord(java.lang.String) <em>Edit Guest Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Guest Record</em>' operation.
	 * @see ClassDiagram.GuestManager#editGuestRecord(java.lang.String)
	 * @generated
	 */
	EOperation getGuestManager__EditGuestRecord__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.GuestManager#removeGuestRecord(java.lang.String) <em>Remove Guest Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Record</em>' operation.
	 * @see ClassDiagram.GuestManager#removeGuestRecord(java.lang.String)
	 * @generated
	 */
	EOperation getGuestManager__RemoveGuestRecord__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.GuestManager#findGuestRecord(java.lang.String) <em>Find Guest Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Guest Record</em>' operation.
	 * @see ClassDiagram.GuestManager#findGuestRecord(java.lang.String)
	 * @generated
	 */
	EOperation getGuestManager__FindGuestRecord__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.GuestManager#findGuestRecords(java.lang.String, java.lang.String) <em>Find Guest Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Guest Records</em>' operation.
	 * @see ClassDiagram.GuestManager#findGuestRecords(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuestManager__FindGuestRecords__String_String();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.FacilityAdministration <em>Facility Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility Administration</em>'.
	 * @see ClassDiagram.FacilityAdministration
	 * @generated
	 */
	EClass getFacilityAdministration();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.FacilityAdministration#getHotel <em>Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hotel</em>'.
	 * @see ClassDiagram.FacilityAdministration#getHotel()
	 * @see #getFacilityAdministration()
	 * @generated
	 */
	EReference getFacilityAdministration_Hotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#addFacility(java.lang.String, ClassDiagram.Facility_FacilityType) <em>Add Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Facility</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#addFacility(java.lang.String, ClassDiagram.Facility_FacilityType)
	 * @generated
	 */
	EOperation getFacilityAdministration__AddFacility__String_Facility_FacilityType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#editFacility(ClassDiagram.Hotel_Facility) <em>Edit Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Facility</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#editFacility(ClassDiagram.Hotel_Facility)
	 * @generated
	 */
	EOperation getFacilityAdministration__EditFacility__Hotel_Facility();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#addFacilityType(java.lang.String) <em>Add Facility Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Facility Type</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#addFacilityType(java.lang.String)
	 * @generated
	 */
	EOperation getFacilityAdministration__AddFacilityType__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#editFacilityType(ClassDiagram.Facility_FacilityType) <em>Edit Facility Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Facility Type</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#editFacilityType(ClassDiagram.Facility_FacilityType)
	 * @generated
	 */
	EOperation getFacilityAdministration__EditFacilityType__Facility_FacilityType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#removeFacility(ClassDiagram.Hotel_Facility) <em>Remove Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Facility</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#removeFacility(ClassDiagram.Hotel_Facility)
	 * @generated
	 */
	EOperation getFacilityAdministration__RemoveFacility__Hotel_Facility();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#removeFacilityType(ClassDiagram.Facility_FacilityType) <em>Remove Facility Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Facility Type</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#removeFacilityType(ClassDiagram.Facility_FacilityType)
	 * @generated
	 */
	EOperation getFacilityAdministration__RemoveFacilityType__Facility_FacilityType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#addService(ClassDiagram.Facility_FacilityType, java.lang.String, double) <em>Add Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#addService(ClassDiagram.Facility_FacilityType, java.lang.String, double)
	 * @generated
	 */
	EOperation getFacilityAdministration__AddService__Facility_FacilityType_String_double();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#editService(ClassDiagram.Facility_FacilityService) <em>Edit Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Service</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#editService(ClassDiagram.Facility_FacilityService)
	 * @generated
	 */
	EOperation getFacilityAdministration__EditService__Facility_FacilityService();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.FacilityAdministration#removeService(ClassDiagram.Facility_FacilityService) <em>Remove Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service</em>' operation.
	 * @see ClassDiagram.FacilityAdministration#removeService(ClassDiagram.Facility_FacilityService)
	 * @generated
	 */
	EOperation getFacilityAdministration__RemoveService__Facility_FacilityService();

	/**
	 * Returns the meta object for enum '{@link ClassDiagram.StaffType <em>Staff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Staff Type</em>'.
	 * @see ClassDiagram.StaffType
	 * @generated
	 */
	EEnum getStaffType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassDiagramFactory getClassDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.CompanyImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__OWNS = eINSTANCE.getCompany_Owns();

		/**
		 * The meta object literal for the '<em><b>Records Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__RECORDS_OF = eINSTANCE.getCompany_RecordsOf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Company_HotelImpl <em>Company Hotel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Company_HotelImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCompany_Hotel()
		 * @generated
		 */
		EClass COMPANY_HOTEL = eINSTANCE.getCompany_Hotel();

		/**
		 * The meta object literal for the '<em><b>List Of Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_HOTEL__LIST_OF_ROOMS = eINSTANCE.getCompany_Hotel_ListOfRooms();

		/**
		 * The meta object literal for the '<em><b>Employees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_HOTEL__EMPLOYEES = eINSTANCE.getCompany_Hotel_Employees();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_HOTEL__NAME = eINSTANCE.getCompany_Hotel_Name();

		/**
		 * The meta object literal for the '<em><b>List Of Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_HOTEL__LIST_OF_BOOKINGS = eINSTANCE.getCompany_Hotel_ListOfBookings();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Hotel_BookingImpl <em>Hotel Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Hotel_BookingImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Booking()
		 * @generated
		 */
		EClass HOTEL_BOOKING = eINSTANCE.getHotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_BOOKING__START_DATE = eINSTANCE.getHotel_Booking_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_BOOKING__END_DATE = eINSTANCE.getHotel_Booking_EndDate();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_BOOKING__PRICE = eINSTANCE.getHotel_Booking_Price();

		/**
		 * The meta object literal for the '<em><b>Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_BOOKING__CHECKED_IN = eINSTANCE.getHotel_Booking_CheckedIn();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_BOOKING__BOOKING_ID = eINSTANCE.getHotel_Booking_BookingID();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_BOOKING__INCLUDES = eINSTANCE.getHotel_Booking_Includes();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_BOOKING__ROOMS = eINSTANCE.getHotel_Booking_Rooms();

		/**
		 * The meta object literal for the '<em><b>Responsible Guest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_BOOKING__RESPONSIBLE_GUEST = eINSTANCE.getHotel_Booking_ResponsibleGuest();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Booking_BookedServiceImpl <em>Booking Booked Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Booking_BookedServiceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_BookedService()
		 * @generated
		 */
		EClass BOOKING_BOOKED_SERVICE = eINSTANCE.getBooking_BookedService();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_BOOKED_SERVICE__DATE = eINSTANCE.getBooking_BookedService_Date();

		/**
		 * The meta object literal for the '<em><b>Facility Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_BOOKED_SERVICE__FACILITY_SERVICE = eINSTANCE.getBooking_BookedService_FacilityService();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Hotel_RoomImpl <em>Hotel Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Hotel_RoomImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Room()
		 * @generated
		 */
		EClass HOTEL_ROOM = eINSTANCE.getHotel_Room();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ROOM__ROOM_NUMBER = eINSTANCE.getHotel_Room_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Accessed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_ROOM__ACCESSED_BY = eINSTANCE.getHotel_Room_AccessedBy();

		/**
		 * The meta object literal for the '<em><b>Cleaning Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ROOM__CLEANING_STATUS = eINSTANCE.getHotel_Room_CleaningStatus();

		/**
		 * The meta object literal for the '<em><b>Maintence Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ROOM__MAINTENCE_STATUS = eINSTANCE.getHotel_Room_MaintenceStatus();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_ROOM__ROOM_TYPE = eINSTANCE.getHotel_Room_RoomType();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Room_RoomApplianceImpl <em>Room Room Appliance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Room_RoomApplianceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomAppliance()
		 * @generated
		 */
		EClass ROOM_ROOM_APPLIANCE = eINSTANCE.getRoom_RoomAppliance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ROOM_APPLIANCE__NAME = eINSTANCE.getRoom_RoomAppliance_Name();

		/**
		 * The meta object literal for the '<em><b>Appliance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE = eINSTANCE.getRoom_RoomAppliance_ApplianceType();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.RoomAppliance_ApplianceTypeImpl <em>Room Appliance Appliance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.RoomAppliance_ApplianceTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomAppliance_ApplianceType()
		 * @generated
		 */
		EClass ROOM_APPLIANCE_APPLIANCE_TYPE = eINSTANCE.getRoomAppliance_ApplianceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_APPLIANCE_APPLIANCE_TYPE__NAME = eINSTANCE.getRoomAppliance_ApplianceType_Name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ApplianceType_ApplianceServiceImpl <em>Appliance Type Appliance Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ApplianceType_ApplianceServiceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getApplianceType_ApplianceService()
		 * @generated
		 */
		EClass APPLIANCE_TYPE_APPLIANCE_SERVICE = eINSTANCE.getApplianceType_ApplianceService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLIANCE_TYPE_APPLIANCE_SERVICE__NAME = eINSTANCE.getApplianceType_ApplianceService_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLIANCE_TYPE_APPLIANCE_SERVICE__PRICE = eINSTANCE.getApplianceType_ApplianceService_Price();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Room_RoomTypeImpl <em>Room Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Room_RoomTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomType()
		 * @generated
		 */
		EClass ROOM_ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ROOM_TYPE__PRICE = eINSTANCE.getRoom_RoomType_Price();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS = eINSTANCE.getRoom_RoomType_MaxNumberOfGuests();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ROOM_TYPE__AREA = eINSTANCE.getRoom_RoomType_Area();

		/**
		 * The meta object literal for the '<em><b>Appliance Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ROOM_TYPE__APPLIANCE_TYPE = eINSTANCE.getRoom_RoomType_ApplianceType();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Room_RoomKeyImpl <em>Room Room Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Room_RoomKeyImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomKey()
		 * @generated
		 */
		EClass ROOM_ROOM_KEY = eINSTANCE.getRoom_RoomKey();

		/**
		 * The meta object literal for the '<em><b>Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_ROOM_KEY__EXPIRATION_DATE = eINSTANCE.getRoom_RoomKey_ExpirationDate();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Company_GuestRecordImpl <em>Company Guest Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Company_GuestRecordImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCompany_GuestRecord()
		 * @generated
		 */
		EClass COMPANY_GUEST_RECORD = eINSTANCE.getCompany_GuestRecord();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_GUEST_RECORD__NAME = eINSTANCE.getCompany_GuestRecord_Name();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_GUEST_RECORD__ADRESS = eINSTANCE.getCompany_GuestRecord_Adress();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_GUEST_RECORD__PHONE_NUMBER = eINSTANCE.getCompany_GuestRecord_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Ssn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_GUEST_RECORD__SSN = eINSTANCE.getCompany_GuestRecord_Ssn();

		/**
		 * The meta object literal for the '<em><b>Payment Information</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_GUEST_RECORD__PAYMENT_INFORMATION = eINSTANCE.getCompany_GuestRecord_PaymentInformation();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Booking_BillImpl <em>Booking Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Booking_BillImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_Bill()
		 * @generated
		 */
		EClass BOOKING_BILL = eINSTANCE.getBooking_Bill();

		/**
		 * The meta object literal for the '<em><b>Paid Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_BILL__PAID_AMOUNT = eINSTANCE.getBooking_Bill_PaidAmount();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_BILL__CONTAINS = eINSTANCE.getBooking_Bill_Contains();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Booking_PurchasedServiceImpl <em>Booking Purchased Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Booking_PurchasedServiceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_PurchasedService()
		 * @generated
		 */
		EClass BOOKING_PURCHASED_SERVICE = eINSTANCE.getBooking_PurchasedService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_PURCHASED_SERVICE__NAME = eINSTANCE.getBooking_PurchasedService_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_PURCHASED_SERVICE__PRICE = eINSTANCE.getBooking_PurchasedService_Price();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Hotel_FacilityImpl <em>Hotel Facility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Hotel_FacilityImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Facility()
		 * @generated
		 */
		EClass HOTEL_FACILITY = eINSTANCE.getHotel_Facility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_FACILITY__NAME = eINSTANCE.getHotel_Facility_Name();

		/**
		 * The meta object literal for the '<em><b>Facility Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_FACILITY__FACILITY_TYPE = eINSTANCE.getHotel_Facility_FacilityType();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Facility_FacilityTypeImpl <em>Facility Facility Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Facility_FacilityTypeImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacility_FacilityType()
		 * @generated
		 */
		EClass FACILITY_FACILITY_TYPE = eINSTANCE.getFacility_FacilityType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_FACILITY_TYPE__NAME = eINSTANCE.getFacility_FacilityType_Name();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Facility_FacilityServiceImpl <em>Facility Facility Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Facility_FacilityServiceImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacility_FacilityService()
		 * @generated
		 */
		EClass FACILITY_FACILITY_SERVICE = eINSTANCE.getFacility_FacilityService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_FACILITY_SERVICE__NAME = eINSTANCE.getFacility_FacilityService_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_FACILITY_SERVICE__PRICE = eINSTANCE.getFacility_FacilityService_Price();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.Hotel_StaffImpl <em>Hotel Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.Hotel_StaffImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Staff()
		 * @generated
		 */
		EClass HOTEL_STAFF = eINSTANCE.getHotel_Staff();

		/**
		 * The meta object literal for the '<em><b>Ssn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__SSN = eINSTANCE.getHotel_Staff_Ssn();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__FIRST_NAME = eINSTANCE.getHotel_Staff_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__LAST_NAME = eINSTANCE.getHotel_Staff_LastName();

		/**
		 * The meta object literal for the '<em><b>Has Work Titel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__HAS_WORK_TITEL = eINSTANCE.getHotel_Staff_HasWorkTitel();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IServiceBooking <em>IService Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IServiceBooking
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIServiceBooking()
		 * @generated
		 */
		EClass ISERVICE_BOOKING = eINSTANCE.getIServiceBooking();

		/**
		 * The meta object literal for the '<em><b>Book Facility Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING___BOOK_FACILITY_SERVICE__HOTEL_BOOKING_HOTEL_FACILITY_FACILITY_FACILITYSERVICE_DATE_STRING = eINSTANCE.getIServiceBooking__BookFacilityService__Hotel_Booking_Hotel_Facility_Facility_FacilityService_Date_String();

		/**
		 * The meta object literal for the '<em><b>Find Available Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING___FIND_AVAILABLE_SERVICES__HOTEL_FACILITY_DATE = eINSTANCE.getIServiceBooking__FindAvailableServices__Hotel_Facility_Date();

		/**
		 * The meta object literal for the '<em><b>Get Booked Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING___GET_BOOKED_SERVICES__HOTEL_BOOKING = eINSTANCE.getIServiceBooking__GetBookedServices__Hotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Find Booked Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING___FIND_BOOKED_SERVICE__INT = eINSTANCE.getIServiceBooking__FindBookedService__int();

		/**
		 * The meta object literal for the '<em><b>Cancel Booked Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICE_BOOKING___CANCEL_BOOKED_SERVICE__BOOKING_BOOKEDSERVICE = eINSTANCE.getIServiceBooking__CancelBookedService__Booking_BookedService();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BookingManagerImpl <em>Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BookingManagerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBookingManager()
		 * @generated
		 */
		EClass BOOKING_MANAGER = eINSTANCE.getBookingManager();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_MANAGER__HOTEL = eINSTANCE.getBookingManager_Hotel();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_ELIST_COMPANY_GUESTRECORD = eINSTANCE.getBookingManager__CreateBooking__Date_Date_EList_Company_GuestRecord();

		/**
		 * The meta object literal for the '<em><b>Find Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___FIND_AVAILABLE_ROOMS__DATE_DATE_ELIST = eINSTANCE.getBookingManager__FindAvailableRooms__Date_Date_EList();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CHECK_IN__HOTEL_BOOKING = eINSTANCE.getBookingManager__CheckIn__Hotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CHECK_OUT__HOTEL_BOOKING = eINSTANCE.getBookingManager__CheckOut__Hotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Assign Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE = eINSTANCE.getBookingManager__AssignKey__Hotel_Room_Hotel_Booking_Date();

		/**
		 * The meta object literal for the '<em><b>Find Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___FIND_BOOKING__DATE_INT = eINSTANCE.getBookingManager__FindBooking__Date_int();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___EDIT_BOOKING__INT = eINSTANCE.getBookingManager__EditBooking__int();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___CANCEL_BOOKING__INT = eINSTANCE.getBookingManager__CancelBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___GET_BOOKINGS__STRING = eINSTANCE.getBookingManager__GetBookings__String();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.FacilityManagerImpl <em>Facility Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.FacilityManagerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacilityManager()
		 * @generated
		 */
		EClass FACILITY_MANAGER = eINSTANCE.getFacilityManager();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_MANAGER__HOTEL = eINSTANCE.getFacilityManager_Hotel();

		/**
		 * The meta object literal for the '<em><b>Find Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_MANAGER___FIND_SERVICES__DATE_HOTEL_FACILITY_DATE = eINSTANCE.getFacilityManager__FindServices__Date_Hotel_Facility_Date();

		/**
		 * The meta object literal for the '<em><b>Find Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_MANAGER___FIND_SERVICES__DATE = eINSTANCE.getFacilityManager__FindServices__Date();

		/**
		 * The meta object literal for the '<em><b>Find Booked Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD = eINSTANCE.getFacilityManager__FindBookedServices__Company_GuestRecord();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.HotelAdministrationImpl <em>Hotel Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.HotelAdministrationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotelAdministration()
		 * @generated
		 */
		EClass HOTEL_ADMINISTRATION = eINSTANCE.getHotelAdministration();

		/**
		 * The meta object literal for the '<em><b>Company</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_ADMINISTRATION__COMPANY = eINSTANCE.getHotelAdministration_Company();

		/**
		 * The meta object literal for the '<em><b>Add Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_ADMINISTRATION___ADD_HOTEL__STRING = eINSTANCE.getHotelAdministration__AddHotel__String();

		/**
		 * The meta object literal for the '<em><b>Edit Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_ADMINISTRATION___EDIT_HOTEL__COMPANY_HOTEL = eINSTANCE.getHotelAdministration__EditHotel__Company_Hotel();

		/**
		 * The meta object literal for the '<em><b>Remove Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOTEL_ADMINISTRATION___REMOVE_HOTEL__COMPANY_HOTEL = eINSTANCE.getHotelAdministration__RemoveHotel__Company_Hotel();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.BillManagerImpl <em>Bill Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.BillManagerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBillManager()
		 * @generated
		 */
		EClass BILL_MANAGER = eINSTANCE.getBillManager();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILL_MANAGER__HOTEL = eINSTANCE.getBillManager_Hotel();

		/**
		 * The meta object literal for the '<em><b>Add Purchased Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___ADD_PURCHASED_SERVICE__STRING_STRING_DOUBLE = eINSTANCE.getBillManager__AddPurchasedService__String_String_double();

		/**
		 * The meta object literal for the '<em><b>Find Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___FIND_BILL__INT = eINSTANCE.getBillManager__FindBill__int();

		/**
		 * The meta object literal for the '<em><b>Create Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___CREATE_RECEIPT__INT = eINSTANCE.getBillManager__CreateReceipt__int();

		/**
		 * The meta object literal for the '<em><b>Get Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___GET_AMOUNT__INT = eINSTANCE.getBillManager__GetAmount__int();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILL_MANAGER___PAY__INT_DOUBLE = eINSTANCE.getBillManager__Pay__int_double();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.StaffAdministrationImpl <em>Staff Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.StaffAdministrationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffAdministration()
		 * @generated
		 */
		EClass STAFF_ADMINISTRATION = eINSTANCE.getStaffAdministration();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_ADMINISTRATION__HOTEL = eINSTANCE.getStaffAdministration_Hotel();

		/**
		 * The meta object literal for the '<em><b>Add Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ADMINISTRATION___ADD_STAFF__STRING_STRING_STRING_STAFFTYPE = eINSTANCE.getStaffAdministration__AddStaff__String_String_String_StaffType();

		/**
		 * The meta object literal for the '<em><b>Edit Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ADMINISTRATION___EDIT_STAFF__HOTEL_STAFF = eINSTANCE.getStaffAdministration__EditStaff__Hotel_Staff();

		/**
		 * The meta object literal for the '<em><b>Remove Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ADMINISTRATION___REMOVE_STAFF__HOTEL_STAFF = eINSTANCE.getStaffAdministration__RemoveStaff__Hotel_Staff();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.RoomManagerImpl <em>Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.RoomManagerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomManager()
		 * @generated
		 */
		EClass ROOM_MANAGER = eINSTANCE.getRoomManager();

		/**
		 * The meta object literal for the '<em><b>Find Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___FIND_ROOM__INT = eINSTANCE.getRoomManager__FindRoom__int();

		/**
		 * The meta object literal for the '<em><b>Cleaning Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM = eINSTANCE.getRoomManager__CleaningStatus__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Maintenance Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM = eINSTANCE.getRoomManager__MaintenanceStatus__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Get Rooms To Clean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___GET_ROOMS_TO_CLEAN = eINSTANCE.getRoomManager__GetRoomsToClean();

		/**
		 * The meta object literal for the '<em><b>Get Rooms To Maintain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGER___GET_ROOMS_TO_MAINTAIN = eINSTANCE.getRoomManager__GetRoomsToMaintain();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.RoomAdministrationImpl <em>Room Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.RoomAdministrationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomAdministration()
		 * @generated
		 */
		EClass ROOM_ADMINISTRATION = eINSTANCE.getRoomAdministration();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ADMINISTRATION__HOTEL = eINSTANCE.getRoomAdministration_Hotel();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE_ELIST = eINSTANCE.getRoomAdministration__AddRoom__int_Room_RoomType_EList();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM = eINSTANCE.getRoomAdministration__RemoveRoom__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM = eINSTANCE.getRoomAdministration__EditRoom__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE = eINSTANCE.getRoomAdministration__EditRoomType__Room_RoomType();

		/**
		 * The meta object literal for the '<em><b>Create Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ADMINISTRATION___CREATE_ROOM_TYPE__DOUBLE_INT_DOUBLE_ROOMAPPLIANCE_APPLIANCETYPE = eINSTANCE.getRoomAdministration__CreateRoomType__double_int_double_RoomAppliance_ApplianceType();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE = eINSTANCE.getRoomAdministration__RemoveRoomType__Room_RoomType();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.ApplianceAdministrationImpl <em>Appliance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ApplianceAdministrationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getApplianceAdministration()
		 * @generated
		 */
		EClass APPLIANCE_ADMINISTRATION = eINSTANCE.getApplianceAdministration();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLIANCE_ADMINISTRATION__HOTEL = eINSTANCE.getApplianceAdministration_Hotel();

		/**
		 * The meta object literal for the '<em><b>Add Appliance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM = eINSTANCE.getApplianceAdministration__AddAppliance__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Remove Appliance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE = eINSTANCE.getApplianceAdministration__RemoveAppliance__Room_RoomAppliance();

		/**
		 * The meta object literal for the '<em><b>Add Appliance Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING = eINSTANCE.getApplianceAdministration__AddApplianceType__String();

		/**
		 * The meta object literal for the '<em><b>Edit Appliance Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = eINSTANCE.getApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType();

		/**
		 * The meta object literal for the '<em><b>Remove Appliance Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = eINSTANCE.getApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType();

		/**
		 * The meta object literal for the '<em><b>Edit Appliance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE = eINSTANCE.getApplianceAdministration__EditAppliance__Room_RoomAppliance();

		/**
		 * The meta object literal for the '<em><b>Add Appliance Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = eINSTANCE.getApplianceAdministration__AddApplianceService__ApplianceType_ApplianceService();

		/**
		 * The meta object literal for the '<em><b>Edit Appliance Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = eINSTANCE.getApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService();

		/**
		 * The meta object literal for the '<em><b>Remove Appliance Server</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVER__APPLIANCETYPE_APPLIANCESERVICE = eINSTANCE.getApplianceAdministration__RemoveApplianceServer__ApplianceType_ApplianceService();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.GuestManagerImpl <em>Guest Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.GuestManagerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestManager()
		 * @generated
		 */
		EClass GUEST_MANAGER = eINSTANCE.getGuestManager();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST_MANAGER__HOTEL = eINSTANCE.getGuestManager_Hotel();

		/**
		 * The meta object literal for the '<em><b>Create Guest Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getGuestManager__CreateGuestRecord__String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Guest Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_MANAGER___EDIT_GUEST_RECORD__STRING = eINSTANCE.getGuestManager__EditGuestRecord__String();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_MANAGER___REMOVE_GUEST_RECORD__STRING = eINSTANCE.getGuestManager__RemoveGuestRecord__String();

		/**
		 * The meta object literal for the '<em><b>Find Guest Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_MANAGER___FIND_GUEST_RECORD__STRING = eINSTANCE.getGuestManager__FindGuestRecord__String();

		/**
		 * The meta object literal for the '<em><b>Find Guest Records</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_MANAGER___FIND_GUEST_RECORDS__STRING_STRING = eINSTANCE.getGuestManager__FindGuestRecords__String_String();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.FacilityAdministrationImpl <em>Facility Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.FacilityAdministrationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacilityAdministration()
		 * @generated
		 */
		EClass FACILITY_ADMINISTRATION = eINSTANCE.getFacilityAdministration();

		/**
		 * The meta object literal for the '<em><b>Hotel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_ADMINISTRATION__HOTEL = eINSTANCE.getFacilityAdministration_Hotel();

		/**
		 * The meta object literal for the '<em><b>Add Facility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE = eINSTANCE.getFacilityAdministration__AddFacility__String_Facility_FacilityType();

		/**
		 * The meta object literal for the '<em><b>Edit Facility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY = eINSTANCE.getFacilityAdministration__EditFacility__Hotel_Facility();

		/**
		 * The meta object literal for the '<em><b>Add Facility Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING = eINSTANCE.getFacilityAdministration__AddFacilityType__String();

		/**
		 * The meta object literal for the '<em><b>Edit Facility Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE = eINSTANCE.getFacilityAdministration__EditFacilityType__Facility_FacilityType();

		/**
		 * The meta object literal for the '<em><b>Remove Facility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY = eINSTANCE.getFacilityAdministration__RemoveFacility__Hotel_Facility();

		/**
		 * The meta object literal for the '<em><b>Remove Facility Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE = eINSTANCE.getFacilityAdministration__RemoveFacilityType__Facility_FacilityType();

		/**
		 * The meta object literal for the '<em><b>Add Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE = eINSTANCE.getFacilityAdministration__AddService__Facility_FacilityType_String_double();

		/**
		 * The meta object literal for the '<em><b>Edit Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE = eINSTANCE.getFacilityAdministration__EditService__Facility_FacilityService();

		/**
		 * The meta object literal for the '<em><b>Remove Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE = eINSTANCE.getFacilityAdministration__RemoveService__Facility_FacilityService();

		/**
		 * The meta object literal for the '{@link ClassDiagram.StaffType <em>Staff Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.StaffType
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffType()
		 * @generated
		 */
		EEnum STAFF_TYPE = eINSTANCE.getStaffType();

	}

} //ClassDiagramPackage
