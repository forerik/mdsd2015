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
	 * The feature id for the '<em><b>Has Hotel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__HAS_HOTEL = 0;

	/**
	 * The feature id for the '<em><b>Has Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__HAS_GUEST = 1;

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
	 * The feature id for the '<em><b>Has Booking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__HAS_BOOKING = 0;

	/**
	 * The feature id for the '<em><b>Has Room</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__HAS_ROOM = 1;

	/**
	 * The feature id for the '<em><b>Has Facility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__HAS_FACILITY = 2;

	/**
	 * The feature id for the '<em><b>Employee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__EMPLOYEE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL__NAME = 4;

	/**
	 * The number of structural features of the '<em>Company Hotel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_HOTEL_FEATURE_COUNT = 5;

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
	int HOTEL_BOOKING = 2;

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
	 * The feature id for the '<em><b>Bookedservice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING__BOOKEDSERVICE = 5;

	/**
	 * The number of structural features of the '<em>Hotel Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Hotel Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Booking_BookedServiceImpl <em>Booking Booked Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Booking_BookedServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_BookedService()
	 * @generated
	 */
	int BOOKING_BOOKED_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BOOKED_SERVICE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BOOKED_SERVICE__PRICE = 1;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Company_GuestRecordImpl <em>Company Guest Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Company_GuestRecordImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getCompany_GuestRecord()
	 * @generated
	 */
	int COMPANY_GUEST_RECORD = 16;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.Booking_BillImpl <em>Booking Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Booking_BillImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_Bill()
	 * @generated
	 */
	int BOOKING_BILL = 4;

	/**
	 * The feature id for the '<em><b>Paid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__PAID_AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Has Purchaseditem</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_BILL__HAS_PURCHASEDITEM = 1;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Booking_PurchasedServiceImpl <em>Booking Purchased Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Booking_PurchasedServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBooking_PurchasedService()
	 * @generated
	 */
	int BOOKING_PURCHASED_SERVICE = 5;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Hotel_RoomImpl <em>Hotel Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Hotel_RoomImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Room()
	 * @generated
	 */
	int HOTEL_ROOM = 6;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Room Appliances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__ROOM_APPLIANCES = 1;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__HAS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Has Key</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__HAS_KEY = 3;

	/**
	 * The feature id for the '<em><b>Cleaning Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__CLEANING_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Maintence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__MAINTENCE_STATUS = 5;

	/**
	 * The number of structural features of the '<em>Hotel Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM_FEATURE_COUNT = 6;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_APPLIANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Appliance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE = 1;

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
	 * The meta object id for the '{@link ClassDiagram.impl.RoomAppliance_ApplianceTypeImpl <em>Room Appliance Appliance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomAppliance_ApplianceTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomAppliance_ApplianceType()
	 * @generated
	 */
	int ROOM_APPLIANCE_APPLIANCE_TYPE = 8;

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
	 * The meta object id for the '{@link ClassDiagram.impl.ApplianceType_ApplianceServiceImpl <em>Appliance Type Appliance Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ApplianceType_ApplianceServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getApplianceType_ApplianceService()
	 * @generated
	 */
	int APPLIANCE_TYPE_APPLIANCE_SERVICE = 9;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Room_RoomTypeImpl <em>Room Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Room_RoomTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomType()
	 * @generated
	 */
	int ROOM_ROOM_TYPE = 10;

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
	 * The feature id for the '<em><b>Has Appliance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ROOM_TYPE__HAS_APPLIANCE = 3;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Room_RoomKeyImpl <em>Room Room Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Room_RoomKeyImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoom_RoomKey()
	 * @generated
	 */
	int ROOM_ROOM_KEY = 11;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Hotel_FacilityImpl <em>Hotel Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Hotel_FacilityImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Facility()
	 * @generated
	 */
	int HOTEL_FACILITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FACILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_FACILITY__HAS_TYPE = 1;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Facility_FacilityTypeImpl <em>Facility Facility Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Facility_FacilityTypeImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacility_FacilityType()
	 * @generated
	 */
	int FACILITY_FACILITY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_FACILITY_TYPE__KIND = 0;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Facility_FacilityServiceImpl <em>Facility Facility Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Facility_FacilityServiceImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacility_FacilityService()
	 * @generated
	 */
	int FACILITY_FACILITY_SERVICE = 14;

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
	 * The meta object id for the '{@link ClassDiagram.impl.Hotel_StaffImpl <em>Hotel Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.Hotel_StaffImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotel_Staff()
	 * @generated
	 */
	int HOTEL_STAFF = 15;

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
	 * The feature id for the '<em><b>Stafftype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_STAFF__STAFFTYPE = 3;

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
	 * The feature id for the '<em><b>Payment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_GUEST_RECORD__PAYMENT = 4;

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
	 * The meta object id for the '{@link ClassDiagram.IRoomManager <em>IRoom Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IRoomManager
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIRoomManager()
	 * @generated
	 */
	int IROOM_MANAGER = 17;

	/**
	 * The number of structural features of the '<em>IRoom Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER___FIND_ROOM__INT = 0;

	/**
	 * The operation id for the '<em>Cleaning Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM = 1;

	/**
	 * The operation id for the '<em>Maintenance Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM = 2;

	/**
	 * The operation id for the '<em>Get Rooms To Clean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER___GET_ROOMS_TO_CLEAN = 3;

	/**
	 * The operation id for the '<em>Get Rooms To Maintain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER___GET_ROOMS_TO_MAINTAIN = 4;

	/**
	 * The number of operations of the '<em>IRoom Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.BookingManager <em>Booking Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.BookingManager
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBookingManager()
	 * @generated
	 */
	int BOOKING_MANAGER = 18;

	/**
	 * The number of structural features of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___FIND_BOOKING__DATE_STRING = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_IN__HOTEL_BOOKING = 1;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___CHECK_OUT__HOTEL_BOOKING = 2;

	/**
	 * The operation id for the '<em>Assign Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE = 3;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER___FIND_BOOKING__DATE_INT = 4;

	/**
	 * The number of operations of the '<em>Booking Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.IGuestManager <em>IGuest Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IGuestManager
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIGuestManager()
	 * @generated
	 */
	int IGUEST_MANAGER = 19;

	/**
	 * The number of structural features of the '<em>IGuest Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Edit Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGER___EDIT_GUEST_RECORD__COMPANY_GUESTRECORD = 1;

	/**
	 * The operation id for the '<em>Remove Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGER___REMOVE_GUEST_RECORD__COMPANY_GUESTRECORD = 2;

	/**
	 * The operation id for the '<em>Find Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGER___FIND_GUEST__STRING = 3;

	/**
	 * The operation id for the '<em>Find Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGER___FIND_GUESTS__STRING_STRING = 4;

	/**
	 * The number of operations of the '<em>IGuest Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.IBillManager <em>IBill Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IBillManager
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIBillManager()
	 * @generated
	 */
	int IBILL_MANAGER = 20;

	/**
	 * The number of structural features of the '<em>IBill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILL_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Purchesed Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILL_MANAGER___ADD_PURCHESED_SERVICE__BOOKING_BILL_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Find Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILL_MANAGER___FIND_BILL__HOTEL_BOOKING = 1;

	/**
	 * The operation id for the '<em>Create Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILL_MANAGER___CREATE_RECEIPT__BOOKING_BILL = 2;

	/**
	 * The operation id for the '<em>Get Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILL_MANAGER___GET_AMOUNT__BOOKING_BILL = 3;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILL_MANAGER___PAY__BOOKING_BILL_DOUBLE = 4;

	/**
	 * The number of operations of the '<em>IBill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILL_MANAGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link ClassDiagram.IFacilityManager <em>IFacility Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IFacilityManager
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIFacilityManager()
	 * @generated
	 */
	int IFACILITY_MANAGER = 21;

	/**
	 * The number of structural features of the '<em>IFacility Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Booked Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_MANAGER___FIND_BOOKED_SERVICE__DATE_FACILITY_FACILITYSERVICE = 0;

	/**
	 * The operation id for the '<em>Find Booked Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD = 1;

	/**
	 * The number of operations of the '<em>IFacility Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_MANAGER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ClassDiagram.IApplianceAdministration <em>IAppliance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IApplianceAdministration
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIApplianceAdministration()
	 * @generated
	 */
	int IAPPLIANCE_ADMINISTRATION = 22;

	/**
	 * The number of structural features of the '<em>IAppliance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM = 0;

	/**
	 * The operation id for the '<em>Remove Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE = 1;

	/**
	 * The operation id for the '<em>Add Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING = 2;

	/**
	 * The operation id for the '<em>Edit Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = 3;

	/**
	 * The operation id for the '<em>Remove Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = 4;

	/**
	 * The operation id for the '<em>Edit Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE = 5;

	/**
	 * The operation id for the '<em>Add Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__STRING_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Edit Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = 7;

	/**
	 * The operation id for the '<em>Remove Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = 8;

	/**
	 * The number of operations of the '<em>IAppliance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAPPLIANCE_ADMINISTRATION_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ClassDiagram.IRoomAdministration <em>IRoom Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IRoomAdministration
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIRoomAdministration()
	 * @generated
	 */
	int IROOM_ADMINISTRATION = 23;

	/**
	 * The number of structural features of the '<em>IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM = 1;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM = 2;

	/**
	 * The operation id for the '<em>Create Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION___CREATE_ROOM_TYPE = 3;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE = 4;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE = 5;

	/**
	 * The number of operations of the '<em>IRoom Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_ADMINISTRATION_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ClassDiagram.IFacilityAdministration <em>IFacility Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IFacilityAdministration
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIFacilityAdministration()
	 * @generated
	 */
	int IFACILITY_ADMINISTRATION = 24;

	/**
	 * The number of structural features of the '<em>IFacility Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE = 0;

	/**
	 * The operation id for the '<em>Edit Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY = 1;

	/**
	 * The operation id for the '<em>Remove Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY = 2;

	/**
	 * The operation id for the '<em>Add Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING = 3;

	/**
	 * The operation id for the '<em>Edit Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE = 4;

	/**
	 * The operation id for the '<em>Remove Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE = 5;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE = 6;

	/**
	 * The operation id for the '<em>Edit Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE = 7;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE = 8;

	/**
	 * The number of operations of the '<em>IFacility Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFACILITY_ADMINISTRATION_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ClassDiagram.IStaffAdministration <em>IStaff Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IStaffAdministration
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIStaffAdministration()
	 * @generated
	 */
	int ISTAFF_ADMINISTRATION = 25;

	/**
	 * The number of structural features of the '<em>IStaff Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMINISTRATION___ADD_STAFF = 0;

	/**
	 * The operation id for the '<em>Edit Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMINISTRATION___EDIT_STAFF = 1;

	/**
	 * The operation id for the '<em>Remove Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMINISTRATION___REMOVE_STAFF = 2;

	/**
	 * The number of operations of the '<em>IStaff Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ClassDiagram.IHotelAdministration <em>IHotel Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IHotelAdministration
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIHotelAdministration()
	 * @generated
	 */
	int IHOTEL_ADMINISTRATION = 26;

	/**
	 * The number of structural features of the '<em>IHotel Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATION___ADD_HOTEL = 0;

	/**
	 * The operation id for the '<em>Edit Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATION___EDIT_HOTEL = 1;

	/**
	 * The operation id for the '<em>Remove Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATION___REMOVE_HOTEL = 2;

	/**
	 * The number of operations of the '<em>IHotel Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IHOTEL_ADMINISTRATION_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ClassDiagram.IBooking <em>IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IBooking
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIBooking()
	 * @generated
	 */
	int IBOOKING = 27;

	/**
	 * The number of structural features of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___CREATE_BOOKING__DATE_DATE_HOTEL_ROOM_COMPANY_GUESTRECORD = 0;

	/**
	 * The operation id for the '<em>Find Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE = 1;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___EDIT_BOOKING__HOTEL_BOOKING = 2;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___CANCEL_BOOKING__HOTEL_BOOKING = 3;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___FIND_BOOKING__INT = 4;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_BOOKINGS__COMPANY_GUESTRECORD = 5;

	/**
	 * The number of operations of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link ClassDiagram.IServiceBooking <em>IService Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.IServiceBooking
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIServiceBooking()
	 * @generated
	 */
	int ISERVICE_BOOKING = 28;

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
	 * The meta object id for the '{@link ClassDiagram.impl.GuestBookingImpl <em>Guest Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.GuestBookingImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestBooking()
	 * @generated
	 */
	int GUEST_BOOKING = 29;

	/**
	 * The number of structural features of the '<em>Guest Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING_FEATURE_COUNT = IBOOKING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING___CREATE_BOOKING__DATE_DATE_HOTEL_ROOM_COMPANY_GUESTRECORD = IBOOKING___CREATE_BOOKING__DATE_DATE_HOTEL_ROOM_COMPANY_GUESTRECORD;

	/**
	 * The operation id for the '<em>Find Available Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE = IBOOKING___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING___EDIT_BOOKING__HOTEL_BOOKING = IBOOKING___EDIT_BOOKING__HOTEL_BOOKING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING___CANCEL_BOOKING__HOTEL_BOOKING = IBOOKING___CANCEL_BOOKING__HOTEL_BOOKING;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING___FIND_BOOKING__INT = IBOOKING___FIND_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING___GET_BOOKINGS__COMPANY_GUESTRECORD = IBOOKING___GET_BOOKINGS__COMPANY_GUESTRECORD;

	/**
	 * The number of operations of the '<em>Guest Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BOOKING_OPERATION_COUNT = IBOOKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.StaffBookingImpl <em>Staff Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.StaffBookingImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffBooking()
	 * @generated
	 */
	int STAFF_BOOKING = 30;

	/**
	 * The number of structural features of the '<em>Staff Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING_FEATURE_COUNT = BOOKING_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___FIND_BOOKING__DATE_STRING = BOOKING_MANAGER___FIND_BOOKING__DATE_STRING;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___CHECK_IN__HOTEL_BOOKING = BOOKING_MANAGER___CHECK_IN__HOTEL_BOOKING;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___CHECK_OUT__HOTEL_BOOKING = BOOKING_MANAGER___CHECK_OUT__HOTEL_BOOKING;

	/**
	 * The operation id for the '<em>Assign Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE = BOOKING_MANAGER___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE;

	/**
	 * The operation id for the '<em>Find Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING___FIND_BOOKING__DATE_INT = BOOKING_MANAGER___FIND_BOOKING__DATE_INT;

	/**
	 * The number of operations of the '<em>Staff Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_BOOKING_OPERATION_COUNT = BOOKING_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.FacilityAdministrationImpl <em>Facility Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.FacilityAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacilityAdministration()
	 * @generated
	 */
	int FACILITY_ADMINISTRATION = 31;

	/**
	 * The number of structural features of the '<em>Facility Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION_FEATURE_COUNT = IFACILITY_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE = IFACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE;

	/**
	 * The operation id for the '<em>Edit Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY = IFACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY;

	/**
	 * The operation id for the '<em>Remove Facility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY = IFACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY;

	/**
	 * The operation id for the '<em>Add Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING = IFACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING;

	/**
	 * The operation id for the '<em>Edit Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE = IFACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE;

	/**
	 * The operation id for the '<em>Remove Facility Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE = IFACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE = IFACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Edit Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE = IFACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE = IFACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE;

	/**
	 * The number of operations of the '<em>Facility Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_ADMINISTRATION_OPERATION_COUNT = IFACILITY_ADMINISTRATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ServiceBookingImpl <em>Service Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ServiceBookingImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getServiceBooking()
	 * @generated
	 */
	int SERVICE_BOOKING = 32;

	/**
	 * The number of structural features of the '<em>Service Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING_FEATURE_COUNT = ISERVICE_BOOKING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Book Facility Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING___BOOK_FACILITY_SERVICE__HOTEL_BOOKING_HOTEL_FACILITY_FACILITY_FACILITYSERVICE_DATE_STRING = ISERVICE_BOOKING___BOOK_FACILITY_SERVICE__HOTEL_BOOKING_HOTEL_FACILITY_FACILITY_FACILITYSERVICE_DATE_STRING;

	/**
	 * The operation id for the '<em>Find Available Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING___FIND_AVAILABLE_SERVICES__HOTEL_FACILITY_DATE = ISERVICE_BOOKING___FIND_AVAILABLE_SERVICES__HOTEL_FACILITY_DATE;

	/**
	 * The operation id for the '<em>Get Booked Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING___GET_BOOKED_SERVICES__HOTEL_BOOKING = ISERVICE_BOOKING___GET_BOOKED_SERVICES__HOTEL_BOOKING;

	/**
	 * The operation id for the '<em>Find Booked Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING___FIND_BOOKED_SERVICE__INT = ISERVICE_BOOKING___FIND_BOOKED_SERVICE__INT;

	/**
	 * The operation id for the '<em>Cancel Booked Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING___CANCEL_BOOKED_SERVICE__BOOKING_BOOKEDSERVICE = ISERVICE_BOOKING___CANCEL_BOOKED_SERVICE__BOOKING_BOOKEDSERVICE;

	/**
	 * The number of operations of the '<em>Service Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BOOKING_OPERATION_COUNT = ISERVICE_BOOKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.FacilityManagerImpl <em>Facility Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.FacilityManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getFacilityManager()
	 * @generated
	 */
	int FACILITY_MANAGER = 33;

	/**
	 * The number of structural features of the '<em>Facility Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER_FEATURE_COUNT = IFACILITY_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Booked Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER___FIND_BOOKED_SERVICE__DATE_FACILITY_FACILITYSERVICE = IFACILITY_MANAGER___FIND_BOOKED_SERVICE__DATE_FACILITY_FACILITYSERVICE;

	/**
	 * The operation id for the '<em>Find Booked Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD = IFACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD;

	/**
	 * The number of operations of the '<em>Facility Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_MANAGER_OPERATION_COUNT = IFACILITY_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.GuestManagerImpl <em>Guest Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.GuestManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestManager()
	 * @generated
	 */
	int GUEST_MANAGER = 34;

	/**
	 * The number of structural features of the '<em>Guest Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER_FEATURE_COUNT = IGUEST_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING = IGUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Edit Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___EDIT_GUEST_RECORD__COMPANY_GUESTRECORD = IGUEST_MANAGER___EDIT_GUEST_RECORD__COMPANY_GUESTRECORD;

	/**
	 * The operation id for the '<em>Remove Guest Record</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___REMOVE_GUEST_RECORD__COMPANY_GUESTRECORD = IGUEST_MANAGER___REMOVE_GUEST_RECORD__COMPANY_GUESTRECORD;

	/**
	 * The operation id for the '<em>Find Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___FIND_GUEST__STRING = IGUEST_MANAGER___FIND_GUEST__STRING;

	/**
	 * The operation id for the '<em>Find Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER___FIND_GUESTS__STRING_STRING = IGUEST_MANAGER___FIND_GUESTS__STRING_STRING;

	/**
	 * The number of operations of the '<em>Guest Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MANAGER_OPERATION_COUNT = IGUEST_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.BillManagerImpl <em>Bill Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.BillManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBillManager()
	 * @generated
	 */
	int BILL_MANAGER = 35;

	/**
	 * The number of structural features of the '<em>Bill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_FEATURE_COUNT = IBILL_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Purchesed Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___ADD_PURCHESED_SERVICE__BOOKING_BILL_STRING_DOUBLE = IBILL_MANAGER___ADD_PURCHESED_SERVICE__BOOKING_BILL_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Find Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___FIND_BILL__HOTEL_BOOKING = IBILL_MANAGER___FIND_BILL__HOTEL_BOOKING;

	/**
	 * The operation id for the '<em>Create Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___CREATE_RECEIPT__BOOKING_BILL = IBILL_MANAGER___CREATE_RECEIPT__BOOKING_BILL;

	/**
	 * The operation id for the '<em>Get Amount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___GET_AMOUNT__BOOKING_BILL = IBILL_MANAGER___GET_AMOUNT__BOOKING_BILL;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER___PAY__BOOKING_BILL_DOUBLE = IBILL_MANAGER___PAY__BOOKING_BILL_DOUBLE;

	/**
	 * The number of operations of the '<em>Bill Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_MANAGER_OPERATION_COUNT = IBILL_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.HotelAdministrationImpl <em>Hotel Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.HotelAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotelAdministration()
	 * @generated
	 */
	int HOTEL_ADMINISTRATION = 36;

	/**
	 * The number of structural features of the '<em>Hotel Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION_FEATURE_COUNT = IHOTEL_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION___ADD_HOTEL = IHOTEL_ADMINISTRATION___ADD_HOTEL;

	/**
	 * The operation id for the '<em>Edit Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION___EDIT_HOTEL = IHOTEL_ADMINISTRATION___EDIT_HOTEL;

	/**
	 * The operation id for the '<em>Remove Hotel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION___REMOVE_HOTEL = IHOTEL_ADMINISTRATION___REMOVE_HOTEL;

	/**
	 * The number of operations of the '<em>Hotel Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ADMINISTRATION_OPERATION_COUNT = IHOTEL_ADMINISTRATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.StaffAdministrationImpl <em>Staff Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.StaffAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffAdministration()
	 * @generated
	 */
	int STAFF_ADMINISTRATION = 37;

	/**
	 * The number of structural features of the '<em>Staff Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION_FEATURE_COUNT = ISTAFF_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION___ADD_STAFF = ISTAFF_ADMINISTRATION___ADD_STAFF;

	/**
	 * The operation id for the '<em>Edit Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION___EDIT_STAFF = ISTAFF_ADMINISTRATION___EDIT_STAFF;

	/**
	 * The operation id for the '<em>Remove Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION___REMOVE_STAFF = ISTAFF_ADMINISTRATION___REMOVE_STAFF;

	/**
	 * The number of operations of the '<em>Staff Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ADMINISTRATION_OPERATION_COUNT = ISTAFF_ADMINISTRATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomManagerImpl <em>Room Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomManagerImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomManager()
	 * @generated
	 */
	int ROOM_MANAGER = 38;

	/**
	 * The number of structural features of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_FEATURE_COUNT = IROOM_MANAGER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___FIND_ROOM__INT = IROOM_MANAGER___FIND_ROOM__INT;

	/**
	 * The operation id for the '<em>Cleaning Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM = IROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM;

	/**
	 * The operation id for the '<em>Maintenance Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM = IROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM;

	/**
	 * The operation id for the '<em>Get Rooms To Clean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOMS_TO_CLEAN = IROOM_MANAGER___GET_ROOMS_TO_CLEAN;

	/**
	 * The operation id for the '<em>Get Rooms To Maintain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER___GET_ROOMS_TO_MAINTAIN = IROOM_MANAGER___GET_ROOMS_TO_MAINTAIN;

	/**
	 * The number of operations of the '<em>Room Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGER_OPERATION_COUNT = IROOM_MANAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.RoomAdministrationImpl <em>Room Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.RoomAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomAdministration()
	 * @generated
	 */
	int ROOM_ADMINISTRATION = 39;

	/**
	 * The number of structural features of the '<em>Room Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION_FEATURE_COUNT = IROOM_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE = IROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM = IROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM = IROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM;

	/**
	 * The operation id for the '<em>Create Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___CREATE_ROOM_TYPE = IROOM_ADMINISTRATION___CREATE_ROOM_TYPE;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE = IROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE;

	/**
	 * The operation id for the '<em>Remove Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE = IROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE;

	/**
	 * The number of operations of the '<em>Room Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ADMINISTRATION_OPERATION_COUNT = IROOM_ADMINISTRATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.impl.ApplianceAdministrationImpl <em>Appliance Administration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.impl.ApplianceAdministrationImpl
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getApplianceAdministration()
	 * @generated
	 */
	int APPLIANCE_ADMINISTRATION = 40;

	/**
	 * The number of structural features of the '<em>Appliance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION_FEATURE_COUNT = IAPPLIANCE_ADMINISTRATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM = IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM;

	/**
	 * The operation id for the '<em>Remove Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE = IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE;

	/**
	 * The operation id for the '<em>Add Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING = IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING;

	/**
	 * The operation id for the '<em>Edit Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE;

	/**
	 * The operation id for the '<em>Remove Appliance Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE;

	/**
	 * The operation id for the '<em>Edit Appliance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE = IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE;

	/**
	 * The operation id for the '<em>Add Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__STRING_DOUBLE = IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Edit Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE;

	/**
	 * The operation id for the '<em>Remove Appliance Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE;

	/**
	 * The number of operations of the '<em>Appliance Administration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLIANCE_ADMINISTRATION_OPERATION_COUNT = IAPPLIANCE_ADMINISTRATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ClassDiagram.StaffType <em>Staff Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ClassDiagram.StaffType
	 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffType()
	 * @generated
	 */
	int STAFF_TYPE = 41;

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
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company#getHasHotel <em>Has Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Hotel</em>'.
	 * @see ClassDiagram.Company#getHasHotel()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_HasHotel();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company#getHasGuest <em>Has Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Guest</em>'.
	 * @see ClassDiagram.Company#getHasGuest()
	 * @see #getCompany()
	 * @generated
	 */
	EReference getCompany_HasGuest();

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
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company_Hotel#getHasBooking <em>Has Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Booking</em>'.
	 * @see ClassDiagram.Company_Hotel#getHasBooking()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EReference getCompany_Hotel_HasBooking();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company_Hotel#getHasRoom <em>Has Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Room</em>'.
	 * @see ClassDiagram.Company_Hotel#getHasRoom()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EReference getCompany_Hotel_HasRoom();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company_Hotel#getHasFacility <em>Has Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Facility</em>'.
	 * @see ClassDiagram.Company_Hotel#getHasFacility()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EReference getCompany_Hotel_HasFacility();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Company_Hotel#getEmployee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Employee</em>'.
	 * @see ClassDiagram.Company_Hotel#getEmployee()
	 * @see #getCompany_Hotel()
	 * @generated
	 */
	EReference getCompany_Hotel_Employee();

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
	 * Returns the meta object for the reference list '{@link ClassDiagram.Hotel_Booking#getBookedservice <em>Bookedservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookedservice</em>'.
	 * @see ClassDiagram.Hotel_Booking#getBookedservice()
	 * @see #getHotel_Booking()
	 * @generated
	 */
	EReference getHotel_Booking_Bookedservice();

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
	 * Returns the meta object for the attribute '{@link ClassDiagram.Booking_BookedService#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see ClassDiagram.Booking_BookedService#getPrice()
	 * @see #getBooking_BookedService()
	 * @generated
	 */
	EAttribute getBooking_BookedService_Price();

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
	 * Returns the meta object for the attribute '{@link ClassDiagram.Company_GuestRecord#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment</em>'.
	 * @see ClassDiagram.Company_GuestRecord#getPayment()
	 * @see #getCompany_GuestRecord()
	 * @generated
	 */
	EAttribute getCompany_GuestRecord_Payment();

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
	 * Returns the meta object for the reference list '{@link ClassDiagram.Booking_Bill#getHasPurchaseditem <em>Has Purchaseditem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Purchaseditem</em>'.
	 * @see ClassDiagram.Booking_Bill#getHasPurchaseditem()
	 * @see #getBooking_Bill()
	 * @generated
	 */
	EReference getBooking_Bill_HasPurchaseditem();

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
	 * Returns the meta object for the reference list '{@link ClassDiagram.Hotel_Room#getRoomAppliances <em>Room Appliances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Appliances</em>'.
	 * @see ClassDiagram.Hotel_Room#getRoomAppliances()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EReference getHotel_Room_RoomAppliances();

	/**
	 * Returns the meta object for the reference '{@link ClassDiagram.Hotel_Room#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Type</em>'.
	 * @see ClassDiagram.Hotel_Room#getHasType()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EReference getHotel_Room_HasType();

	/**
	 * Returns the meta object for the reference list '{@link ClassDiagram.Hotel_Room#getHasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Key</em>'.
	 * @see ClassDiagram.Hotel_Room#getHasKey()
	 * @see #getHotel_Room()
	 * @generated
	 */
	EReference getHotel_Room_HasKey();

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
	 * Returns the meta object for the reference '{@link ClassDiagram.Room_RoomAppliance#getHasApplianceType <em>Has Appliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Appliance Type</em>'.
	 * @see ClassDiagram.Room_RoomAppliance#getHasApplianceType()
	 * @see #getRoom_RoomAppliance()
	 * @generated
	 */
	EReference getRoom_RoomAppliance_HasApplianceType();

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
	 * Returns the meta object for the reference list '{@link ClassDiagram.Room_RoomType#getHasAppliance <em>Has Appliance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Appliance</em>'.
	 * @see ClassDiagram.Room_RoomType#getHasAppliance()
	 * @see #getRoom_RoomType()
	 * @generated
	 */
	EReference getRoom_RoomType_HasAppliance();

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
	 * Returns the meta object for the reference '{@link ClassDiagram.Hotel_Facility#getHasType <em>Has Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Type</em>'.
	 * @see ClassDiagram.Hotel_Facility#getHasType()
	 * @see #getHotel_Facility()
	 * @generated
	 */
	EReference getHotel_Facility_HasType();

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
	 * Returns the meta object for the attribute '{@link ClassDiagram.Facility_FacilityType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ClassDiagram.Facility_FacilityType#getKind()
	 * @see #getFacility_FacilityType()
	 * @generated
	 */
	EAttribute getFacility_FacilityType_Kind();

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
	 * Returns the meta object for the attribute '{@link ClassDiagram.Hotel_Staff#getStafftype <em>Stafftype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stafftype</em>'.
	 * @see ClassDiagram.Hotel_Staff#getStafftype()
	 * @see #getHotel_Staff()
	 * @generated
	 */
	EAttribute getHotel_Staff_Stafftype();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IRoomManager <em>IRoom Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Manager</em>'.
	 * @see ClassDiagram.IRoomManager
	 * @generated
	 */
	EClass getIRoomManager();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomManager#findRoom(int) <em>Find Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Room</em>' operation.
	 * @see ClassDiagram.IRoomManager#findRoom(int)
	 * @generated
	 */
	EOperation getIRoomManager__FindRoom__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomManager#cleaningStatus(ClassDiagram.Hotel_Room) <em>Cleaning Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cleaning Status</em>' operation.
	 * @see ClassDiagram.IRoomManager#cleaningStatus(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getIRoomManager__CleaningStatus__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomManager#maintenanceStatus(ClassDiagram.Hotel_Room) <em>Maintenance Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Maintenance Status</em>' operation.
	 * @see ClassDiagram.IRoomManager#maintenanceStatus(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getIRoomManager__MaintenanceStatus__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomManager#getRoomsToClean() <em>Get Rooms To Clean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms To Clean</em>' operation.
	 * @see ClassDiagram.IRoomManager#getRoomsToClean()
	 * @generated
	 */
	EOperation getIRoomManager__GetRoomsToClean();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomManager#getRoomsToMaintain() <em>Get Rooms To Maintain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rooms To Maintain</em>' operation.
	 * @see ClassDiagram.IRoomManager#getRoomsToMaintain()
	 * @generated
	 */
	EOperation getIRoomManager__GetRoomsToMaintain();

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
	 * Returns the meta object for the '{@link ClassDiagram.BookingManager#findBooking(java.util.Date, java.lang.String) <em>Find Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booking</em>' operation.
	 * @see ClassDiagram.BookingManager#findBooking(java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getBookingManager__FindBooking__Date_String();

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
	 * Returns the meta object for class '{@link ClassDiagram.IGuestManager <em>IGuest Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGuest Manager</em>'.
	 * @see ClassDiagram.IGuestManager
	 * @generated
	 */
	EClass getIGuestManager();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IGuestManager#createGuestRecord(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Guest Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Guest Record</em>' operation.
	 * @see ClassDiagram.IGuestManager#createGuestRecord(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuestManager__CreateGuestRecord__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IGuestManager#editGuestRecord(ClassDiagram.Company_GuestRecord) <em>Edit Guest Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Guest Record</em>' operation.
	 * @see ClassDiagram.IGuestManager#editGuestRecord(ClassDiagram.Company_GuestRecord)
	 * @generated
	 */
	EOperation getIGuestManager__EditGuestRecord__Company_GuestRecord();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IGuestManager#removeGuestRecord(ClassDiagram.Company_GuestRecord) <em>Remove Guest Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Record</em>' operation.
	 * @see ClassDiagram.IGuestManager#removeGuestRecord(ClassDiagram.Company_GuestRecord)
	 * @generated
	 */
	EOperation getIGuestManager__RemoveGuestRecord__Company_GuestRecord();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IGuestManager#findGuest(java.lang.String) <em>Find Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Guest</em>' operation.
	 * @see ClassDiagram.IGuestManager#findGuest(java.lang.String)
	 * @generated
	 */
	EOperation getIGuestManager__FindGuest__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IGuestManager#findGuests(java.lang.String, java.lang.String) <em>Find Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Guests</em>' operation.
	 * @see ClassDiagram.IGuestManager#findGuests(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuestManager__FindGuests__String_String();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IBillManager <em>IBill Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBill Manager</em>'.
	 * @see ClassDiagram.IBillManager
	 * @generated
	 */
	EClass getIBillManager();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBillManager#addPurchesedService(ClassDiagram.Booking_Bill, java.lang.String, double) <em>Add Purchesed Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Purchesed Service</em>' operation.
	 * @see ClassDiagram.IBillManager#addPurchesedService(ClassDiagram.Booking_Bill, java.lang.String, double)
	 * @generated
	 */
	EOperation getIBillManager__AddPurchesedService__Booking_Bill_String_double();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBillManager#findBill(ClassDiagram.Hotel_Booking) <em>Find Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Bill</em>' operation.
	 * @see ClassDiagram.IBillManager#findBill(ClassDiagram.Hotel_Booking)
	 * @generated
	 */
	EOperation getIBillManager__FindBill__Hotel_Booking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBillManager#createReceipt(ClassDiagram.Booking_Bill) <em>Create Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Receipt</em>' operation.
	 * @see ClassDiagram.IBillManager#createReceipt(ClassDiagram.Booking_Bill)
	 * @generated
	 */
	EOperation getIBillManager__CreateReceipt__Booking_Bill();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBillManager#getAmount(ClassDiagram.Booking_Bill) <em>Get Amount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount</em>' operation.
	 * @see ClassDiagram.IBillManager#getAmount(ClassDiagram.Booking_Bill)
	 * @generated
	 */
	EOperation getIBillManager__GetAmount__Booking_Bill();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBillManager#pay(ClassDiagram.Booking_Bill, double) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see ClassDiagram.IBillManager#pay(ClassDiagram.Booking_Bill, double)
	 * @generated
	 */
	EOperation getIBillManager__Pay__Booking_Bill_double();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IFacilityManager <em>IFacility Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFacility Manager</em>'.
	 * @see ClassDiagram.IFacilityManager
	 * @generated
	 */
	EClass getIFacilityManager();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityManager#findBookedService(java.util.Date, ClassDiagram.Facility_FacilityService) <em>Find Booked Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booked Service</em>' operation.
	 * @see ClassDiagram.IFacilityManager#findBookedService(java.util.Date, ClassDiagram.Facility_FacilityService)
	 * @generated
	 */
	EOperation getIFacilityManager__FindBookedService__Date_Facility_FacilityService();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityManager#findBookedServices(ClassDiagram.Company_GuestRecord) <em>Find Booked Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booked Services</em>' operation.
	 * @see ClassDiagram.IFacilityManager#findBookedServices(ClassDiagram.Company_GuestRecord)
	 * @generated
	 */
	EOperation getIFacilityManager__FindBookedServices__Company_GuestRecord();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IApplianceAdministration <em>IAppliance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAppliance Administration</em>'.
	 * @see ClassDiagram.IApplianceAdministration
	 * @generated
	 */
	EClass getIApplianceAdministration();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#addAppliance(ClassDiagram.Hotel_Room) <em>Add Appliance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Appliance</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#addAppliance(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getIApplianceAdministration__AddAppliance__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#removeAppliance(ClassDiagram.Room_RoomAppliance) <em>Remove Appliance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Appliance</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#removeAppliance(ClassDiagram.Room_RoomAppliance)
	 * @generated
	 */
	EOperation getIApplianceAdministration__RemoveAppliance__Room_RoomAppliance();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#addApplianceType(java.lang.String) <em>Add Appliance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Appliance Type</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#addApplianceType(java.lang.String)
	 * @generated
	 */
	EOperation getIApplianceAdministration__AddApplianceType__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#editApplianceType(ClassDiagram.RoomAppliance_ApplianceType) <em>Edit Appliance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Appliance Type</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#editApplianceType(ClassDiagram.RoomAppliance_ApplianceType)
	 * @generated
	 */
	EOperation getIApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#removeApplianceType(ClassDiagram.RoomAppliance_ApplianceType) <em>Remove Appliance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Appliance Type</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#removeApplianceType(ClassDiagram.RoomAppliance_ApplianceType)
	 * @generated
	 */
	EOperation getIApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#editAppliance(ClassDiagram.Room_RoomAppliance) <em>Edit Appliance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Appliance</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#editAppliance(ClassDiagram.Room_RoomAppliance)
	 * @generated
	 */
	EOperation getIApplianceAdministration__EditAppliance__Room_RoomAppliance();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#addApplianceService(java.lang.String, double) <em>Add Appliance Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Appliance Service</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#addApplianceService(java.lang.String, double)
	 * @generated
	 */
	EOperation getIApplianceAdministration__AddApplianceService__String_double();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#editApplianceService(ClassDiagram.ApplianceType_ApplianceService) <em>Edit Appliance Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Appliance Service</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#editApplianceService(ClassDiagram.ApplianceType_ApplianceService)
	 * @generated
	 */
	EOperation getIApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IApplianceAdministration#removeApplianceService(ClassDiagram.ApplianceType_ApplianceService) <em>Remove Appliance Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Appliance Service</em>' operation.
	 * @see ClassDiagram.IApplianceAdministration#removeApplianceService(ClassDiagram.ApplianceType_ApplianceService)
	 * @generated
	 */
	EOperation getIApplianceAdministration__RemoveApplianceService__ApplianceType_ApplianceService();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IRoomAdministration <em>IRoom Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Administration</em>'.
	 * @see ClassDiagram.IRoomAdministration
	 * @generated
	 */
	EClass getIRoomAdministration();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomAdministration#addRoom(int, ClassDiagram.Room_RoomType) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see ClassDiagram.IRoomAdministration#addRoom(int, ClassDiagram.Room_RoomType)
	 * @generated
	 */
	EOperation getIRoomAdministration__AddRoom__int_Room_RoomType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomAdministration#removeRoom(ClassDiagram.Hotel_Room) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see ClassDiagram.IRoomAdministration#removeRoom(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getIRoomAdministration__RemoveRoom__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomAdministration#editRoom(ClassDiagram.Hotel_Room) <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see ClassDiagram.IRoomAdministration#editRoom(ClassDiagram.Hotel_Room)
	 * @generated
	 */
	EOperation getIRoomAdministration__EditRoom__Hotel_Room();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomAdministration#createRoomType() <em>Create Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room Type</em>' operation.
	 * @see ClassDiagram.IRoomAdministration#createRoomType()
	 * @generated
	 */
	EOperation getIRoomAdministration__CreateRoomType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomAdministration#editRoomType(ClassDiagram.Room_RoomType) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see ClassDiagram.IRoomAdministration#editRoomType(ClassDiagram.Room_RoomType)
	 * @generated
	 */
	EOperation getIRoomAdministration__EditRoomType__Room_RoomType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IRoomAdministration#removeRoomType(ClassDiagram.Room_RoomType) <em>Remove Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Type</em>' operation.
	 * @see ClassDiagram.IRoomAdministration#removeRoomType(ClassDiagram.Room_RoomType)
	 * @generated
	 */
	EOperation getIRoomAdministration__RemoveRoomType__Room_RoomType();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IFacilityAdministration <em>IFacility Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFacility Administration</em>'.
	 * @see ClassDiagram.IFacilityAdministration
	 * @generated
	 */
	EClass getIFacilityAdministration();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#addFacility(java.lang.String, ClassDiagram.Facility_FacilityType) <em>Add Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Facility</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#addFacility(java.lang.String, ClassDiagram.Facility_FacilityType)
	 * @generated
	 */
	EOperation getIFacilityAdministration__AddFacility__String_Facility_FacilityType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#editFacility(ClassDiagram.Hotel_Facility) <em>Edit Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Facility</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#editFacility(ClassDiagram.Hotel_Facility)
	 * @generated
	 */
	EOperation getIFacilityAdministration__EditFacility__Hotel_Facility();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#removeFacility(ClassDiagram.Hotel_Facility) <em>Remove Facility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Facility</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#removeFacility(ClassDiagram.Hotel_Facility)
	 * @generated
	 */
	EOperation getIFacilityAdministration__RemoveFacility__Hotel_Facility();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#addFacilityType(java.lang.String) <em>Add Facility Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Facility Type</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#addFacilityType(java.lang.String)
	 * @generated
	 */
	EOperation getIFacilityAdministration__AddFacilityType__String();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#editFacilityType(ClassDiagram.Facility_FacilityType) <em>Edit Facility Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Facility Type</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#editFacilityType(ClassDiagram.Facility_FacilityType)
	 * @generated
	 */
	EOperation getIFacilityAdministration__EditFacilityType__Facility_FacilityType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#removeFacilityType(ClassDiagram.Facility_FacilityType) <em>Remove Facility Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Facility Type</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#removeFacilityType(ClassDiagram.Facility_FacilityType)
	 * @generated
	 */
	EOperation getIFacilityAdministration__RemoveFacilityType__Facility_FacilityType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#addService(ClassDiagram.Facility_FacilityType, java.lang.String, double) <em>Add Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#addService(ClassDiagram.Facility_FacilityType, java.lang.String, double)
	 * @generated
	 */
	EOperation getIFacilityAdministration__AddService__Facility_FacilityType_String_double();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#editService(ClassDiagram.Facility_FacilityService) <em>Edit Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Service</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#editService(ClassDiagram.Facility_FacilityService)
	 * @generated
	 */
	EOperation getIFacilityAdministration__EditService__Facility_FacilityService();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IFacilityAdministration#removeService(ClassDiagram.Facility_FacilityService) <em>Remove Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service</em>' operation.
	 * @see ClassDiagram.IFacilityAdministration#removeService(ClassDiagram.Facility_FacilityService)
	 * @generated
	 */
	EOperation getIFacilityAdministration__RemoveService__Facility_FacilityService();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IStaffAdministration <em>IStaff Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStaff Administration</em>'.
	 * @see ClassDiagram.IStaffAdministration
	 * @generated
	 */
	EClass getIStaffAdministration();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IStaffAdministration#addStaff() <em>Add Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Staff</em>' operation.
	 * @see ClassDiagram.IStaffAdministration#addStaff()
	 * @generated
	 */
	EOperation getIStaffAdministration__AddStaff();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IStaffAdministration#editStaff() <em>Edit Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Staff</em>' operation.
	 * @see ClassDiagram.IStaffAdministration#editStaff()
	 * @generated
	 */
	EOperation getIStaffAdministration__EditStaff();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IStaffAdministration#removeStaff() <em>Remove Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Staff</em>' operation.
	 * @see ClassDiagram.IStaffAdministration#removeStaff()
	 * @generated
	 */
	EOperation getIStaffAdministration__RemoveStaff();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IHotelAdministration <em>IHotel Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IHotel Administration</em>'.
	 * @see ClassDiagram.IHotelAdministration
	 * @generated
	 */
	EClass getIHotelAdministration();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IHotelAdministration#addHotel() <em>Add Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Hotel</em>' operation.
	 * @see ClassDiagram.IHotelAdministration#addHotel()
	 * @generated
	 */
	EOperation getIHotelAdministration__AddHotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IHotelAdministration#editHotel() <em>Edit Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Hotel</em>' operation.
	 * @see ClassDiagram.IHotelAdministration#editHotel()
	 * @generated
	 */
	EOperation getIHotelAdministration__EditHotel();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IHotelAdministration#removeHotel() <em>Remove Hotel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Hotel</em>' operation.
	 * @see ClassDiagram.IHotelAdministration#removeHotel()
	 * @generated
	 */
	EOperation getIHotelAdministration__RemoveHotel();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking</em>'.
	 * @see ClassDiagram.IBooking
	 * @generated
	 */
	EClass getIBooking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBooking#createBooking(java.util.Date, java.util.Date, ClassDiagram.Hotel_Room, ClassDiagram.Company_GuestRecord) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see ClassDiagram.IBooking#createBooking(java.util.Date, java.util.Date, ClassDiagram.Hotel_Room, ClassDiagram.Company_GuestRecord)
	 * @generated
	 */
	EOperation getIBooking__CreateBooking__Date_Date_Hotel_Room_Company_GuestRecord();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBooking#findAvailableRooms(java.util.Date, java.util.Date, ClassDiagram.Room_RoomType) <em>Find Available Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Available Rooms</em>' operation.
	 * @see ClassDiagram.IBooking#findAvailableRooms(java.util.Date, java.util.Date, ClassDiagram.Room_RoomType)
	 * @generated
	 */
	EOperation getIBooking__FindAvailableRooms__Date_Date_Room_RoomType();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBooking#editBooking(ClassDiagram.Hotel_Booking) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see ClassDiagram.IBooking#editBooking(ClassDiagram.Hotel_Booking)
	 * @generated
	 */
	EOperation getIBooking__EditBooking__Hotel_Booking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBooking#cancelBooking(ClassDiagram.Hotel_Booking) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see ClassDiagram.IBooking#cancelBooking(ClassDiagram.Hotel_Booking)
	 * @generated
	 */
	EOperation getIBooking__CancelBooking__Hotel_Booking();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBooking#findBooking(int) <em>Find Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Booking</em>' operation.
	 * @see ClassDiagram.IBooking#findBooking(int)
	 * @generated
	 */
	EOperation getIBooking__FindBooking__int();

	/**
	 * Returns the meta object for the '{@link ClassDiagram.IBooking#getBookings(ClassDiagram.Company_GuestRecord) <em>Get Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookings</em>' operation.
	 * @see ClassDiagram.IBooking#getBookings(ClassDiagram.Company_GuestRecord)
	 * @generated
	 */
	EOperation getIBooking__GetBookings__Company_GuestRecord();

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
	 * Returns the meta object for class '{@link ClassDiagram.GuestBooking <em>Guest Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Booking</em>'.
	 * @see ClassDiagram.GuestBooking
	 * @generated
	 */
	EClass getGuestBooking();

	/**
	 * Returns the meta object for class '{@link ClassDiagram.StaffBooking <em>Staff Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Booking</em>'.
	 * @see ClassDiagram.StaffBooking
	 * @generated
	 */
	EClass getStaffBooking();

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
	 * Returns the meta object for class '{@link ClassDiagram.ServiceBooking <em>Service Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Booking</em>'.
	 * @see ClassDiagram.ServiceBooking
	 * @generated
	 */
	EClass getServiceBooking();

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
	 * Returns the meta object for class '{@link ClassDiagram.GuestManager <em>Guest Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Manager</em>'.
	 * @see ClassDiagram.GuestManager
	 * @generated
	 */
	EClass getGuestManager();

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
	 * Returns the meta object for class '{@link ClassDiagram.HotelAdministration <em>Hotel Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Administration</em>'.
	 * @see ClassDiagram.HotelAdministration
	 * @generated
	 */
	EClass getHotelAdministration();

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
	 * Returns the meta object for class '{@link ClassDiagram.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manager</em>'.
	 * @see ClassDiagram.RoomManager
	 * @generated
	 */
	EClass getRoomManager();

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
	 * Returns the meta object for class '{@link ClassDiagram.ApplianceAdministration <em>Appliance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appliance Administration</em>'.
	 * @see ClassDiagram.ApplianceAdministration
	 * @generated
	 */
	EClass getApplianceAdministration();

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
		 * The meta object literal for the '<em><b>Has Hotel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__HAS_HOTEL = eINSTANCE.getCompany_HasHotel();

		/**
		 * The meta object literal for the '<em><b>Has Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY__HAS_GUEST = eINSTANCE.getCompany_HasGuest();

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
		 * The meta object literal for the '<em><b>Has Booking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_HOTEL__HAS_BOOKING = eINSTANCE.getCompany_Hotel_HasBooking();

		/**
		 * The meta object literal for the '<em><b>Has Room</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_HOTEL__HAS_ROOM = eINSTANCE.getCompany_Hotel_HasRoom();

		/**
		 * The meta object literal for the '<em><b>Has Facility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_HOTEL__HAS_FACILITY = eINSTANCE.getCompany_Hotel_HasFacility();

		/**
		 * The meta object literal for the '<em><b>Employee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPANY_HOTEL__EMPLOYEE = eINSTANCE.getCompany_Hotel_Employee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_HOTEL__NAME = eINSTANCE.getCompany_Hotel_Name();

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
		 * The meta object literal for the '<em><b>Bookedservice</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_BOOKING__BOOKEDSERVICE = eINSTANCE.getHotel_Booking_Bookedservice();

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
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING_BOOKED_SERVICE__PRICE = eINSTANCE.getBooking_BookedService_Price();

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
		 * The meta object literal for the '<em><b>Payment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY_GUEST_RECORD__PAYMENT = eINSTANCE.getCompany_GuestRecord_Payment();

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
		 * The meta object literal for the '<em><b>Has Purchaseditem</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING_BILL__HAS_PURCHASEDITEM = eINSTANCE.getBooking_Bill_HasPurchaseditem();

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
		 * The meta object literal for the '<em><b>Room Appliances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_ROOM__ROOM_APPLIANCES = eINSTANCE.getHotel_Room_RoomAppliances();

		/**
		 * The meta object literal for the '<em><b>Has Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_ROOM__HAS_TYPE = eINSTANCE.getHotel_Room_HasType();

		/**
		 * The meta object literal for the '<em><b>Has Key</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_ROOM__HAS_KEY = eINSTANCE.getHotel_Room_HasKey();

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
		 * The meta object literal for the '<em><b>Has Appliance Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE = eINSTANCE.getRoom_RoomAppliance_HasApplianceType();

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
		 * The meta object literal for the '<em><b>Has Appliance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_ROOM_TYPE__HAS_APPLIANCE = eINSTANCE.getRoom_RoomType_HasAppliance();

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
		 * The meta object literal for the '<em><b>Has Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOTEL_FACILITY__HAS_TYPE = eINSTANCE.getHotel_Facility_HasType();

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
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_FACILITY_TYPE__KIND = eINSTANCE.getFacility_FacilityType_Kind();

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
		 * The meta object literal for the '<em><b>Stafftype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_STAFF__STAFFTYPE = eINSTANCE.getHotel_Staff_Stafftype();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IRoomManager <em>IRoom Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IRoomManager
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIRoomManager()
		 * @generated
		 */
		EClass IROOM_MANAGER = eINSTANCE.getIRoomManager();

		/**
		 * The meta object literal for the '<em><b>Find Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGER___FIND_ROOM__INT = eINSTANCE.getIRoomManager__FindRoom__int();

		/**
		 * The meta object literal for the '<em><b>Cleaning Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM = eINSTANCE.getIRoomManager__CleaningStatus__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Maintenance Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM = eINSTANCE.getIRoomManager__MaintenanceStatus__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Get Rooms To Clean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGER___GET_ROOMS_TO_CLEAN = eINSTANCE.getIRoomManager__GetRoomsToClean();

		/**
		 * The meta object literal for the '<em><b>Get Rooms To Maintain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_MANAGER___GET_ROOMS_TO_MAINTAIN = eINSTANCE.getIRoomManager__GetRoomsToMaintain();

		/**
		 * The meta object literal for the '{@link ClassDiagram.BookingManager <em>Booking Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.BookingManager
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getBookingManager()
		 * @generated
		 */
		EClass BOOKING_MANAGER = eINSTANCE.getBookingManager();

		/**
		 * The meta object literal for the '<em><b>Find Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING_MANAGER___FIND_BOOKING__DATE_STRING = eINSTANCE.getBookingManager__FindBooking__Date_String();

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
		 * The meta object literal for the '{@link ClassDiagram.IGuestManager <em>IGuest Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IGuestManager
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIGuestManager()
		 * @generated
		 */
		EClass IGUEST_MANAGER = eINSTANCE.getIGuestManager();

		/**
		 * The meta object literal for the '<em><b>Create Guest Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getIGuestManager__CreateGuestRecord__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Edit Guest Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGER___EDIT_GUEST_RECORD__COMPANY_GUESTRECORD = eINSTANCE.getIGuestManager__EditGuestRecord__Company_GuestRecord();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Record</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGER___REMOVE_GUEST_RECORD__COMPANY_GUESTRECORD = eINSTANCE.getIGuestManager__RemoveGuestRecord__Company_GuestRecord();

		/**
		 * The meta object literal for the '<em><b>Find Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGER___FIND_GUEST__STRING = eINSTANCE.getIGuestManager__FindGuest__String();

		/**
		 * The meta object literal for the '<em><b>Find Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST_MANAGER___FIND_GUESTS__STRING_STRING = eINSTANCE.getIGuestManager__FindGuests__String_String();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IBillManager <em>IBill Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IBillManager
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIBillManager()
		 * @generated
		 */
		EClass IBILL_MANAGER = eINSTANCE.getIBillManager();

		/**
		 * The meta object literal for the '<em><b>Add Purchesed Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILL_MANAGER___ADD_PURCHESED_SERVICE__BOOKING_BILL_STRING_DOUBLE = eINSTANCE.getIBillManager__AddPurchesedService__Booking_Bill_String_double();

		/**
		 * The meta object literal for the '<em><b>Find Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILL_MANAGER___FIND_BILL__HOTEL_BOOKING = eINSTANCE.getIBillManager__FindBill__Hotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Create Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILL_MANAGER___CREATE_RECEIPT__BOOKING_BILL = eINSTANCE.getIBillManager__CreateReceipt__Booking_Bill();

		/**
		 * The meta object literal for the '<em><b>Get Amount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILL_MANAGER___GET_AMOUNT__BOOKING_BILL = eINSTANCE.getIBillManager__GetAmount__Booking_Bill();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILL_MANAGER___PAY__BOOKING_BILL_DOUBLE = eINSTANCE.getIBillManager__Pay__Booking_Bill_double();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IFacilityManager <em>IFacility Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IFacilityManager
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIFacilityManager()
		 * @generated
		 */
		EClass IFACILITY_MANAGER = eINSTANCE.getIFacilityManager();

		/**
		 * The meta object literal for the '<em><b>Find Booked Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_MANAGER___FIND_BOOKED_SERVICE__DATE_FACILITY_FACILITYSERVICE = eINSTANCE.getIFacilityManager__FindBookedService__Date_Facility_FacilityService();

		/**
		 * The meta object literal for the '<em><b>Find Booked Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD = eINSTANCE.getIFacilityManager__FindBookedServices__Company_GuestRecord();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IApplianceAdministration <em>IAppliance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IApplianceAdministration
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIApplianceAdministration()
		 * @generated
		 */
		EClass IAPPLIANCE_ADMINISTRATION = eINSTANCE.getIApplianceAdministration();

		/**
		 * The meta object literal for the '<em><b>Add Appliance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM = eINSTANCE.getIApplianceAdministration__AddAppliance__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Remove Appliance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE = eINSTANCE.getIApplianceAdministration__RemoveAppliance__Room_RoomAppliance();

		/**
		 * The meta object literal for the '<em><b>Add Appliance Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING = eINSTANCE.getIApplianceAdministration__AddApplianceType__String();

		/**
		 * The meta object literal for the '<em><b>Edit Appliance Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = eINSTANCE.getIApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType();

		/**
		 * The meta object literal for the '<em><b>Remove Appliance Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE = eINSTANCE.getIApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType();

		/**
		 * The meta object literal for the '<em><b>Edit Appliance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE = eINSTANCE.getIApplianceAdministration__EditAppliance__Room_RoomAppliance();

		/**
		 * The meta object literal for the '<em><b>Add Appliance Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__STRING_DOUBLE = eINSTANCE.getIApplianceAdministration__AddApplianceService__String_double();

		/**
		 * The meta object literal for the '<em><b>Edit Appliance Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = eINSTANCE.getIApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService();

		/**
		 * The meta object literal for the '<em><b>Remove Appliance Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE = eINSTANCE.getIApplianceAdministration__RemoveApplianceService__ApplianceType_ApplianceService();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IRoomAdministration <em>IRoom Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IRoomAdministration
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIRoomAdministration()
		 * @generated
		 */
		EClass IROOM_ADMINISTRATION = eINSTANCE.getIRoomAdministration();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE = eINSTANCE.getIRoomAdministration__AddRoom__int_Room_RoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM = eINSTANCE.getIRoomAdministration__RemoveRoom__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM = eINSTANCE.getIRoomAdministration__EditRoom__Hotel_Room();

		/**
		 * The meta object literal for the '<em><b>Create Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_ADMINISTRATION___CREATE_ROOM_TYPE = eINSTANCE.getIRoomAdministration__CreateRoomType();

		/**
		 * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE = eINSTANCE.getIRoomAdministration__EditRoomType__Room_RoomType();

		/**
		 * The meta object literal for the '<em><b>Remove Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE = eINSTANCE.getIRoomAdministration__RemoveRoomType__Room_RoomType();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IFacilityAdministration <em>IFacility Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IFacilityAdministration
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIFacilityAdministration()
		 * @generated
		 */
		EClass IFACILITY_ADMINISTRATION = eINSTANCE.getIFacilityAdministration();

		/**
		 * The meta object literal for the '<em><b>Add Facility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE = eINSTANCE.getIFacilityAdministration__AddFacility__String_Facility_FacilityType();

		/**
		 * The meta object literal for the '<em><b>Edit Facility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY = eINSTANCE.getIFacilityAdministration__EditFacility__Hotel_Facility();

		/**
		 * The meta object literal for the '<em><b>Remove Facility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY = eINSTANCE.getIFacilityAdministration__RemoveFacility__Hotel_Facility();

		/**
		 * The meta object literal for the '<em><b>Add Facility Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING = eINSTANCE.getIFacilityAdministration__AddFacilityType__String();

		/**
		 * The meta object literal for the '<em><b>Edit Facility Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE = eINSTANCE.getIFacilityAdministration__EditFacilityType__Facility_FacilityType();

		/**
		 * The meta object literal for the '<em><b>Remove Facility Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE = eINSTANCE.getIFacilityAdministration__RemoveFacilityType__Facility_FacilityType();

		/**
		 * The meta object literal for the '<em><b>Add Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE = eINSTANCE.getIFacilityAdministration__AddService__Facility_FacilityType_String_double();

		/**
		 * The meta object literal for the '<em><b>Edit Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE = eINSTANCE.getIFacilityAdministration__EditService__Facility_FacilityService();

		/**
		 * The meta object literal for the '<em><b>Remove Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IFACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE = eINSTANCE.getIFacilityAdministration__RemoveService__Facility_FacilityService();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IStaffAdministration <em>IStaff Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IStaffAdministration
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIStaffAdministration()
		 * @generated
		 */
		EClass ISTAFF_ADMINISTRATION = eINSTANCE.getIStaffAdministration();

		/**
		 * The meta object literal for the '<em><b>Add Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMINISTRATION___ADD_STAFF = eINSTANCE.getIStaffAdministration__AddStaff();

		/**
		 * The meta object literal for the '<em><b>Edit Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMINISTRATION___EDIT_STAFF = eINSTANCE.getIStaffAdministration__EditStaff();

		/**
		 * The meta object literal for the '<em><b>Remove Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF_ADMINISTRATION___REMOVE_STAFF = eINSTANCE.getIStaffAdministration__RemoveStaff();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IHotelAdministration <em>IHotel Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IHotelAdministration
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIHotelAdministration()
		 * @generated
		 */
		EClass IHOTEL_ADMINISTRATION = eINSTANCE.getIHotelAdministration();

		/**
		 * The meta object literal for the '<em><b>Add Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATION___ADD_HOTEL = eINSTANCE.getIHotelAdministration__AddHotel();

		/**
		 * The meta object literal for the '<em><b>Edit Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATION___EDIT_HOTEL = eINSTANCE.getIHotelAdministration__EditHotel();

		/**
		 * The meta object literal for the '<em><b>Remove Hotel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IHOTEL_ADMINISTRATION___REMOVE_HOTEL = eINSTANCE.getIHotelAdministration__RemoveHotel();

		/**
		 * The meta object literal for the '{@link ClassDiagram.IBooking <em>IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.IBooking
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getIBooking()
		 * @generated
		 */
		EClass IBOOKING = eINSTANCE.getIBooking();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___CREATE_BOOKING__DATE_DATE_HOTEL_ROOM_COMPANY_GUESTRECORD = eINSTANCE.getIBooking__CreateBooking__Date_Date_Hotel_Room_Company_GuestRecord();

		/**
		 * The meta object literal for the '<em><b>Find Available Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE = eINSTANCE.getIBooking__FindAvailableRooms__Date_Date_Room_RoomType();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___EDIT_BOOKING__HOTEL_BOOKING = eINSTANCE.getIBooking__EditBooking__Hotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___CANCEL_BOOKING__HOTEL_BOOKING = eINSTANCE.getIBooking__CancelBooking__Hotel_Booking();

		/**
		 * The meta object literal for the '<em><b>Find Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___FIND_BOOKING__INT = eINSTANCE.getIBooking__FindBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_BOOKINGS__COMPANY_GUESTRECORD = eINSTANCE.getIBooking__GetBookings__Company_GuestRecord();

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
		 * The meta object literal for the '{@link ClassDiagram.impl.GuestBookingImpl <em>Guest Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.GuestBookingImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestBooking()
		 * @generated
		 */
		EClass GUEST_BOOKING = eINSTANCE.getGuestBooking();

		/**
		 * The meta object literal for the '{@link ClassDiagram.impl.StaffBookingImpl <em>Staff Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.StaffBookingImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getStaffBooking()
		 * @generated
		 */
		EClass STAFF_BOOKING = eINSTANCE.getStaffBooking();

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
		 * The meta object literal for the '{@link ClassDiagram.impl.ServiceBookingImpl <em>Service Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ServiceBookingImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getServiceBooking()
		 * @generated
		 */
		EClass SERVICE_BOOKING = eINSTANCE.getServiceBooking();

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
		 * The meta object literal for the '{@link ClassDiagram.impl.GuestManagerImpl <em>Guest Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.GuestManagerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getGuestManager()
		 * @generated
		 */
		EClass GUEST_MANAGER = eINSTANCE.getGuestManager();

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
		 * The meta object literal for the '{@link ClassDiagram.impl.HotelAdministrationImpl <em>Hotel Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.HotelAdministrationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getHotelAdministration()
		 * @generated
		 */
		EClass HOTEL_ADMINISTRATION = eINSTANCE.getHotelAdministration();

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
		 * The meta object literal for the '{@link ClassDiagram.impl.RoomManagerImpl <em>Room Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.RoomManagerImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getRoomManager()
		 * @generated
		 */
		EClass ROOM_MANAGER = eINSTANCE.getRoomManager();

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
		 * The meta object literal for the '{@link ClassDiagram.impl.ApplianceAdministrationImpl <em>Appliance Administration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ClassDiagram.impl.ApplianceAdministrationImpl
		 * @see ClassDiagram.impl.ClassDiagramPackageImpl#getApplianceAdministration()
		 * @generated
		 */
		EClass APPLIANCE_ADMINISTRATION = eINSTANCE.getApplianceAdministration();

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
