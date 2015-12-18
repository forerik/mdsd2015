/**
 */
package ClassDiagram.impl;

import ClassDiagram.ApplianceAdministration;
import ClassDiagram.ApplianceType_ApplianceService;
import ClassDiagram.BillManager;
import ClassDiagram.BookingManager;
import ClassDiagram.Booking_Bill;
import ClassDiagram.Booking_BookedService;
import ClassDiagram.Booking_PurchasedService;
import ClassDiagram.ClassDiagramFactory;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Company_Hotel;
import ClassDiagram.FacilityAdministration;
import ClassDiagram.FacilityManager;
import ClassDiagram.Facility_FacilityService;
import ClassDiagram.Facility_FacilityType;
import ClassDiagram.GuestManager;
import ClassDiagram.HotelAdministration;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Facility;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Hotel_Staff;
import ClassDiagram.IServiceBooking;
import ClassDiagram.RoomAdministration;
import ClassDiagram.RoomAppliance_ApplianceType;
import ClassDiagram.RoomManager;
import ClassDiagram.Room_RoomAppliance;
import ClassDiagram.Room_RoomKey;
import ClassDiagram.Room_RoomType;
import ClassDiagram.StaffAdministration;
import ClassDiagram.StaffType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassDiagramPackageImpl extends EPackageImpl implements ClassDiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass companyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass company_HotelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_RoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass room_RoomKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass room_RoomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomAppliance_ApplianceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applianceType_ApplianceServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass room_RoomApplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_StaffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass company_GuestRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_BookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booking_BookedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facility_FacilityServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booking_BillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booking_PurchasedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotel_FacilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facility_FacilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iServiceBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applianceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum staffTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ClassDiagram.ClassDiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassDiagramPackageImpl() {
		super(eNS_URI, ClassDiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClassDiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassDiagramPackage init() {
		if (isInited) return (ClassDiagramPackage)EPackage.Registry.INSTANCE.getEPackage(ClassDiagramPackage.eNS_URI);

		// Obtain or create and register package
		ClassDiagramPackageImpl theClassDiagramPackage = (ClassDiagramPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassDiagramPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassDiagramPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theClassDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theClassDiagramPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClassDiagramPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassDiagramPackage.eNS_URI, theClassDiagramPackage);
		return theClassDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompany() {
		return companyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Owns() {
		return (EReference)companyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_RecordsOf() {
		return (EReference)companyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_Name() {
		return (EAttribute)companyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompany_Hotel() {
		return company_HotelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Hotel_ListOfRooms() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Hotel_Employees() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_Hotel_Name() {
		return (EAttribute)company_HotelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Hotel_ListOfBookings() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Hotel_ListOfRoomTypes() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Room() {
		return hotel_RoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Room_RoomNumber() {
		return (EAttribute)hotel_RoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Room_AccessedBy() {
		return (EReference)hotel_RoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Room_CleaningStatus() {
		return (EAttribute)hotel_RoomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Room_MaintenceStatus() {
		return (EAttribute)hotel_RoomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Room_RoomType() {
		return (EReference)hotel_RoomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom_RoomKey() {
		return room_RoomKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomKey_ExpirationDate() {
		return (EAttribute)room_RoomKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom_RoomType() {
		return room_RoomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomType_Price() {
		return (EAttribute)room_RoomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomType_MaxNumberOfGuests() {
		return (EAttribute)room_RoomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomType_Area() {
		return (EAttribute)room_RoomTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomType_ApplianceType() {
		return (EReference)room_RoomTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomType_Name() {
		return (EAttribute)room_RoomTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomAppliance_ApplianceType() {
		return roomAppliance_ApplianceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomAppliance_ApplianceType_Name() {
		return (EAttribute)roomAppliance_ApplianceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplianceType_ApplianceService() {
		return applianceType_ApplianceServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplianceType_ApplianceService_Name() {
		return (EAttribute)applianceType_ApplianceServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplianceType_ApplianceService_Price() {
		return (EAttribute)applianceType_ApplianceServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom_RoomAppliance() {
		return room_RoomApplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomAppliance_Name() {
		return (EAttribute)room_RoomApplianceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomAppliance_ApplianceType() {
		return (EReference)room_RoomApplianceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Staff() {
		return hotel_StaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Staff_Ssn() {
		return (EAttribute)hotel_StaffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Staff_FirstName() {
		return (EAttribute)hotel_StaffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Staff_LastName() {
		return (EAttribute)hotel_StaffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Staff_HasWorkTitel() {
		return (EAttribute)hotel_StaffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingManager() {
		return bookingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingManager_Hotel() {
		return (EReference)bookingManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CreateBooking__Date_Date_EList_Company_GuestRecord_int() {
		return bookingManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__FindAvailableRooms__Date_Date_Room_RoomType_int() {
		return bookingManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CheckIn__Hotel_Booking() {
		return bookingManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CheckOut__Hotel_Booking() {
		return bookingManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__AssignKey__Hotel_Room_Hotel_Booking_Date() {
		return bookingManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__FindBooking__Date_int() {
		return bookingManagerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__EditBooking__int() {
		return bookingManagerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CancelBooking__int() {
		return bookingManagerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__GetBookings__String() {
		return bookingManagerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__InitBooking() {
		return bookingManagerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__FindAvailableRoomTypes__Date_Date() {
		return bookingManagerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompany_GuestRecord() {
		return company_GuestRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_GuestRecord_Name() {
		return (EAttribute)company_GuestRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_GuestRecord_Adress() {
		return (EAttribute)company_GuestRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_GuestRecord_PhoneNumber() {
		return (EAttribute)company_GuestRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_GuestRecord_Ssn() {
		return (EAttribute)company_GuestRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_GuestRecord_PaymentInformation() {
		return (EAttribute)company_GuestRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Booking() {
		return hotel_BookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Booking_StartDate() {
		return (EAttribute)hotel_BookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Booking_EndDate() {
		return (EAttribute)hotel_BookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Booking_Price() {
		return (EAttribute)hotel_BookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Booking_CheckedIn() {
		return (EAttribute)hotel_BookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Booking_BookingID() {
		return (EAttribute)hotel_BookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Booking_Includes() {
		return (EReference)hotel_BookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Booking_Rooms() {
		return (EReference)hotel_BookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Booking_ResponsibleGuest() {
		return (EReference)hotel_BookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking_BookedService() {
		return booking_BookedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookedService_Date() {
		return (EAttribute)booking_BookedServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_BookedService_FacilityService() {
		return (EReference)booking_BookedServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacility_FacilityService() {
		return facility_FacilityServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacility_FacilityService_Name() {
		return (EAttribute)facility_FacilityServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacility_FacilityService_Price() {
		return (EAttribute)facility_FacilityServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking_Bill() {
		return booking_BillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Bill_PaidAmount() {
		return (EAttribute)booking_BillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Bill_Contains() {
		return (EReference)booking_BillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking_PurchasedService() {
		return booking_PurchasedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_PurchasedService_Name() {
		return (EAttribute)booking_PurchasedServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_PurchasedService_Price() {
		return (EAttribute)booking_PurchasedServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotel_Facility() {
		return hotel_FacilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Facility_Name() {
		return (EAttribute)hotel_FacilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Facility_FacilityType() {
		return (EReference)hotel_FacilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacility_FacilityType() {
		return facility_FacilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacility_FacilityType_Name() {
		return (EAttribute)facility_FacilityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIServiceBooking() {
		return iServiceBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServiceBooking__BookFacilityService__Hotel_Booking_Hotel_Facility_Facility_FacilityService_Date_String() {
		return iServiceBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServiceBooking__FindAvailableServices__Hotel_Facility_Date() {
		return iServiceBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServiceBooking__GetBookedServices__Hotel_Booking() {
		return iServiceBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServiceBooking__FindBookedService__int() {
		return iServiceBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServiceBooking__CancelBookedService__Booking_BookedService() {
		return iServiceBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffAdministration() {
		return staffAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffAdministration_Hotel() {
		return (EReference)staffAdministrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAdministration__AddStaff__String_String_String_StaffType() {
		return staffAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAdministration__EditStaff__Hotel_Staff() {
		return staffAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAdministration__RemoveStaff__Hotel_Staff() {
		return staffAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManager() {
		return roomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManager_Hotel() {
		return (EReference)roomManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__FindRoom__int() {
		return roomManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__CleaningStatus__Hotel_Room() {
		return roomManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__MaintenanceStatus__Hotel_Room() {
		return roomManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRoomsToClean() {
		return roomManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManager__GetRoomsToMaintain() {
		return roomManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomAdministration() {
		return roomAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomAdministration_Hotel() {
		return (EReference)roomAdministrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAdministration__AddRoom__int_Room_RoomType_EList() {
		return roomAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAdministration__RemoveRoom__Hotel_Room() {
		return roomAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAdministration__EditRoom__Hotel_Room() {
		return roomAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAdministration__EditRoomType__Room_RoomType() {
		return roomAdministrationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAdministration__CreateRoomType__double_int_double_RoomAppliance_ApplianceType() {
		return roomAdministrationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomAdministration__RemoveRoomType__Room_RoomType() {
		return roomAdministrationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplianceAdministration() {
		return applianceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplianceAdministration_Hotel() {
		return (EReference)applianceAdministrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__AddAppliance__Hotel_Room() {
		return applianceAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__RemoveAppliance__Room_RoomAppliance() {
		return applianceAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__AddApplianceType__String() {
		return applianceAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType() {
		return applianceAdministrationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType() {
		return applianceAdministrationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__EditAppliance__Room_RoomAppliance() {
		return applianceAdministrationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__AddApplianceService__ApplianceType_ApplianceService() {
		return applianceAdministrationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService() {
		return applianceAdministrationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplianceAdministration__RemoveApplianceServer__ApplianceType_ApplianceService() {
		return applianceAdministrationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestManager() {
		return guestManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuestManager_Hotel() {
		return (EReference)guestManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestManager__CreateGuestRecord__String_String_String_String_String_String() {
		return guestManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestManager__EditGuestRecord__String() {
		return guestManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestManager__RemoveGuestRecord__String() {
		return guestManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestManager__FindGuestRecord__String() {
		return guestManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestManager__FindGuestRecords__String_String() {
		return guestManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilityAdministration() {
		return facilityAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityAdministration_Hotel() {
		return (EReference)facilityAdministrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__AddFacility__String_Facility_FacilityType() {
		return facilityAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__EditFacility__Hotel_Facility() {
		return facilityAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__AddFacilityType__String() {
		return facilityAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__EditFacilityType__Facility_FacilityType() {
		return facilityAdministrationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__RemoveFacility__Hotel_Facility() {
		return facilityAdministrationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__RemoveFacilityType__Facility_FacilityType() {
		return facilityAdministrationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__AddService__Facility_FacilityType_String_double() {
		return facilityAdministrationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__EditService__Facility_FacilityService() {
		return facilityAdministrationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityAdministration__RemoveService__Facility_FacilityService() {
		return facilityAdministrationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelAdministration() {
		return hotelAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotelAdministration_Company() {
		return (EReference)hotelAdministrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelAdministration__AddHotel__String() {
		return hotelAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelAdministration__EditHotel__Company_Hotel() {
		return hotelAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHotelAdministration__RemoveHotel__Company_Hotel() {
		return hotelAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillManager() {
		return billManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillManager_Hotel() {
		return (EReference)billManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__AddPurchasedService__String_String_double() {
		return billManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__FindBill__int() {
		return billManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__CreateReceipt__int() {
		return billManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__GetAmount__int() {
		return billManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBillManager__Pay__int_double() {
		return billManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilityManager() {
		return facilityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilityManager_Hotel() {
		return (EReference)facilityManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityManager__FindServices__Date_Hotel_Facility_Date() {
		return facilityManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityManager__FindServices__Date() {
		return facilityManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFacilityManager__FindBookedServices__Company_GuestRecord() {
		return facilityManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStaffType() {
		return staffTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramFactory getClassDiagramFactory() {
		return (ClassDiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		companyEClass = createEClass(COMPANY);
		createEReference(companyEClass, COMPANY__OWNS);
		createEReference(companyEClass, COMPANY__RECORDS_OF);
		createEAttribute(companyEClass, COMPANY__NAME);

		company_HotelEClass = createEClass(COMPANY_HOTEL);
		createEReference(company_HotelEClass, COMPANY_HOTEL__LIST_OF_ROOMS);
		createEReference(company_HotelEClass, COMPANY_HOTEL__EMPLOYEES);
		createEAttribute(company_HotelEClass, COMPANY_HOTEL__NAME);
		createEReference(company_HotelEClass, COMPANY_HOTEL__LIST_OF_BOOKINGS);
		createEReference(company_HotelEClass, COMPANY_HOTEL__LIST_OF_ROOM_TYPES);

		hotel_RoomEClass = createEClass(HOTEL_ROOM);
		createEAttribute(hotel_RoomEClass, HOTEL_ROOM__ROOM_NUMBER);
		createEReference(hotel_RoomEClass, HOTEL_ROOM__ACCESSED_BY);
		createEAttribute(hotel_RoomEClass, HOTEL_ROOM__CLEANING_STATUS);
		createEAttribute(hotel_RoomEClass, HOTEL_ROOM__MAINTENCE_STATUS);
		createEReference(hotel_RoomEClass, HOTEL_ROOM__ROOM_TYPE);

		room_RoomKeyEClass = createEClass(ROOM_ROOM_KEY);
		createEAttribute(room_RoomKeyEClass, ROOM_ROOM_KEY__EXPIRATION_DATE);

		room_RoomTypeEClass = createEClass(ROOM_ROOM_TYPE);
		createEAttribute(room_RoomTypeEClass, ROOM_ROOM_TYPE__PRICE);
		createEAttribute(room_RoomTypeEClass, ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS);
		createEAttribute(room_RoomTypeEClass, ROOM_ROOM_TYPE__AREA);
		createEReference(room_RoomTypeEClass, ROOM_ROOM_TYPE__APPLIANCE_TYPE);
		createEAttribute(room_RoomTypeEClass, ROOM_ROOM_TYPE__NAME);

		roomAppliance_ApplianceTypeEClass = createEClass(ROOM_APPLIANCE_APPLIANCE_TYPE);
		createEAttribute(roomAppliance_ApplianceTypeEClass, ROOM_APPLIANCE_APPLIANCE_TYPE__NAME);

		applianceType_ApplianceServiceEClass = createEClass(APPLIANCE_TYPE_APPLIANCE_SERVICE);
		createEAttribute(applianceType_ApplianceServiceEClass, APPLIANCE_TYPE_APPLIANCE_SERVICE__NAME);
		createEAttribute(applianceType_ApplianceServiceEClass, APPLIANCE_TYPE_APPLIANCE_SERVICE__PRICE);

		room_RoomApplianceEClass = createEClass(ROOM_ROOM_APPLIANCE);
		createEAttribute(room_RoomApplianceEClass, ROOM_ROOM_APPLIANCE__NAME);
		createEReference(room_RoomApplianceEClass, ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE);

		hotel_StaffEClass = createEClass(HOTEL_STAFF);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__SSN);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__FIRST_NAME);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__LAST_NAME);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__HAS_WORK_TITEL);

		hotel_BookingEClass = createEClass(HOTEL_BOOKING);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__START_DATE);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__END_DATE);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__PRICE);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__CHECKED_IN);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__BOOKING_ID);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__INCLUDES);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__ROOMS);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__RESPONSIBLE_GUEST);

		booking_BookedServiceEClass = createEClass(BOOKING_BOOKED_SERVICE);
		createEAttribute(booking_BookedServiceEClass, BOOKING_BOOKED_SERVICE__DATE);
		createEReference(booking_BookedServiceEClass, BOOKING_BOOKED_SERVICE__FACILITY_SERVICE);

		facility_FacilityServiceEClass = createEClass(FACILITY_FACILITY_SERVICE);
		createEAttribute(facility_FacilityServiceEClass, FACILITY_FACILITY_SERVICE__NAME);
		createEAttribute(facility_FacilityServiceEClass, FACILITY_FACILITY_SERVICE__PRICE);

		company_GuestRecordEClass = createEClass(COMPANY_GUEST_RECORD);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__NAME);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__ADRESS);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__PHONE_NUMBER);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__SSN);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__PAYMENT_INFORMATION);

		booking_BillEClass = createEClass(BOOKING_BILL);
		createEAttribute(booking_BillEClass, BOOKING_BILL__PAID_AMOUNT);
		createEReference(booking_BillEClass, BOOKING_BILL__CONTAINS);

		booking_PurchasedServiceEClass = createEClass(BOOKING_PURCHASED_SERVICE);
		createEAttribute(booking_PurchasedServiceEClass, BOOKING_PURCHASED_SERVICE__NAME);
		createEAttribute(booking_PurchasedServiceEClass, BOOKING_PURCHASED_SERVICE__PRICE);

		hotel_FacilityEClass = createEClass(HOTEL_FACILITY);
		createEAttribute(hotel_FacilityEClass, HOTEL_FACILITY__NAME);
		createEReference(hotel_FacilityEClass, HOTEL_FACILITY__FACILITY_TYPE);

		facility_FacilityTypeEClass = createEClass(FACILITY_FACILITY_TYPE);
		createEAttribute(facility_FacilityTypeEClass, FACILITY_FACILITY_TYPE__NAME);

		iServiceBookingEClass = createEClass(ISERVICE_BOOKING);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___BOOK_FACILITY_SERVICE__HOTEL_BOOKING_HOTEL_FACILITY_FACILITY_FACILITYSERVICE_DATE_STRING);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___FIND_AVAILABLE_SERVICES__HOTEL_FACILITY_DATE);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___GET_BOOKED_SERVICES__HOTEL_BOOKING);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___FIND_BOOKED_SERVICE__INT);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___CANCEL_BOOKED_SERVICE__BOOKING_BOOKEDSERVICE);

		bookingManagerEClass = createEClass(BOOKING_MANAGER);
		createEReference(bookingManagerEClass, BOOKING_MANAGER__HOTEL);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CREATE_BOOKING__DATE_DATE_ELIST_COMPANY_GUESTRECORD_INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE_INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_IN__HOTEL_BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_OUT__HOTEL_BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___FIND_BOOKING__DATE_INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___EDIT_BOOKING__INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CANCEL_BOOKING__INT);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___GET_BOOKINGS__STRING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___INIT_BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___FIND_AVAILABLE_ROOM_TYPES__DATE_DATE);

		staffAdministrationEClass = createEClass(STAFF_ADMINISTRATION);
		createEReference(staffAdministrationEClass, STAFF_ADMINISTRATION__HOTEL);
		createEOperation(staffAdministrationEClass, STAFF_ADMINISTRATION___ADD_STAFF__STRING_STRING_STRING_STAFFTYPE);
		createEOperation(staffAdministrationEClass, STAFF_ADMINISTRATION___EDIT_STAFF__HOTEL_STAFF);
		createEOperation(staffAdministrationEClass, STAFF_ADMINISTRATION___REMOVE_STAFF__HOTEL_STAFF);

		roomManagerEClass = createEClass(ROOM_MANAGER);
		createEReference(roomManagerEClass, ROOM_MANAGER__HOTEL);
		createEOperation(roomManagerEClass, ROOM_MANAGER___FIND_ROOM__INT);
		createEOperation(roomManagerEClass, ROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM);
		createEOperation(roomManagerEClass, ROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOMS_TO_CLEAN);
		createEOperation(roomManagerEClass, ROOM_MANAGER___GET_ROOMS_TO_MAINTAIN);

		roomAdministrationEClass = createEClass(ROOM_ADMINISTRATION);
		createEReference(roomAdministrationEClass, ROOM_ADMINISTRATION__HOTEL);
		createEOperation(roomAdministrationEClass, ROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE_ELIST);
		createEOperation(roomAdministrationEClass, ROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM);
		createEOperation(roomAdministrationEClass, ROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM);
		createEOperation(roomAdministrationEClass, ROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE);
		createEOperation(roomAdministrationEClass, ROOM_ADMINISTRATION___CREATE_ROOM_TYPE__DOUBLE_INT_DOUBLE_ROOMAPPLIANCE_APPLIANCETYPE);
		createEOperation(roomAdministrationEClass, ROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE);

		applianceAdministrationEClass = createEClass(APPLIANCE_ADMINISTRATION);
		createEReference(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION__HOTEL);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE);
		createEOperation(applianceAdministrationEClass, APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVER__APPLIANCETYPE_APPLIANCESERVICE);

		guestManagerEClass = createEClass(GUEST_MANAGER);
		createEReference(guestManagerEClass, GUEST_MANAGER__HOTEL);
		createEOperation(guestManagerEClass, GUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(guestManagerEClass, GUEST_MANAGER___EDIT_GUEST_RECORD__STRING);
		createEOperation(guestManagerEClass, GUEST_MANAGER___REMOVE_GUEST_RECORD__STRING);
		createEOperation(guestManagerEClass, GUEST_MANAGER___FIND_GUEST_RECORD__STRING);
		createEOperation(guestManagerEClass, GUEST_MANAGER___FIND_GUEST_RECORDS__STRING_STRING);

		facilityAdministrationEClass = createEClass(FACILITY_ADMINISTRATION);
		createEReference(facilityAdministrationEClass, FACILITY_ADMINISTRATION__HOTEL);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE);
		createEOperation(facilityAdministrationEClass, FACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE);

		hotelAdministrationEClass = createEClass(HOTEL_ADMINISTRATION);
		createEReference(hotelAdministrationEClass, HOTEL_ADMINISTRATION__COMPANY);
		createEOperation(hotelAdministrationEClass, HOTEL_ADMINISTRATION___ADD_HOTEL__STRING);
		createEOperation(hotelAdministrationEClass, HOTEL_ADMINISTRATION___EDIT_HOTEL__COMPANY_HOTEL);
		createEOperation(hotelAdministrationEClass, HOTEL_ADMINISTRATION___REMOVE_HOTEL__COMPANY_HOTEL);

		billManagerEClass = createEClass(BILL_MANAGER);
		createEReference(billManagerEClass, BILL_MANAGER__HOTEL);
		createEOperation(billManagerEClass, BILL_MANAGER___ADD_PURCHASED_SERVICE__STRING_STRING_DOUBLE);
		createEOperation(billManagerEClass, BILL_MANAGER___FIND_BILL__INT);
		createEOperation(billManagerEClass, BILL_MANAGER___CREATE_RECEIPT__INT);
		createEOperation(billManagerEClass, BILL_MANAGER___GET_AMOUNT__INT);
		createEOperation(billManagerEClass, BILL_MANAGER___PAY__INT_DOUBLE);

		facilityManagerEClass = createEClass(FACILITY_MANAGER);
		createEReference(facilityManagerEClass, FACILITY_MANAGER__HOTEL);
		createEOperation(facilityManagerEClass, FACILITY_MANAGER___FIND_SERVICES__DATE_HOTEL_FACILITY_DATE);
		createEOperation(facilityManagerEClass, FACILITY_MANAGER___FIND_SERVICES__DATE);
		createEOperation(facilityManagerEClass, FACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD);

		// Create enums
		staffTypeEEnum = createEEnum(STAFF_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(companyEClass, Company.class, "Company", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompany_Owns(), this.getCompany_Hotel(), null, "owns", null, 1, -1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_RecordsOf(), this.getCompany_GuestRecord(), null, "recordsOf", null, 0, -1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_Name(), ecorePackage.getEString(), "name", null, 1, 1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(company_HotelEClass, Company_Hotel.class, "Company_Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompany_Hotel_ListOfRooms(), this.getHotel_Room(), null, "listOfRooms", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_Hotel_Employees(), this.getHotel_Staff(), null, "employees", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_Hotel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_Hotel_ListOfBookings(), this.getHotel_Booking(), null, "listOfBookings", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_Hotel_ListOfRoomTypes(), this.getRoom_RoomType(), null, "listOfRoomTypes", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_RoomEClass, Hotel_Room.class, "Hotel_Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Room_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Room_AccessedBy(), this.getRoom_RoomKey(), null, "accessedBy", null, 0, -1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Room_CleaningStatus(), ecorePackage.getEBoolean(), "cleaningStatus", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Room_MaintenceStatus(), ecorePackage.getEBoolean(), "maintenceStatus", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Room_RoomType(), this.getRoom_RoomType(), null, "roomType", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(room_RoomKeyEClass, Room_RoomKey.class, "Room_RoomKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomKey_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, Room_RoomKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(room_RoomTypeEClass, Room_RoomType.class, "Room_RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomType_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomType_MaxNumberOfGuests(), ecorePackage.getEInt(), "maxNumberOfGuests", null, 1, 1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomType_Area(), ecorePackage.getEDouble(), "area", null, 1, 1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType_ApplianceType(), this.getRoomAppliance_ApplianceType(), null, "applianceType", null, 0, -1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomType_Name(), ecorePackage.getEString(), "name", null, 1, 1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomAppliance_ApplianceTypeEClass, RoomAppliance_ApplianceType.class, "RoomAppliance_ApplianceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomAppliance_ApplianceType_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomAppliance_ApplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applianceType_ApplianceServiceEClass, ApplianceType_ApplianceService.class, "ApplianceType_ApplianceService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplianceType_ApplianceService_Name(), ecorePackage.getEString(), "name", null, 1, 1, ApplianceType_ApplianceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApplianceType_ApplianceService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, ApplianceType_ApplianceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(room_RoomApplianceEClass, Room_RoomAppliance.class, "Room_RoomAppliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomAppliance_Name(), ecorePackage.getEString(), "name", null, 1, 1, Room_RoomAppliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomAppliance_ApplianceType(), this.getRoomAppliance_ApplianceType(), null, "applianceType", null, 1, 1, Room_RoomAppliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_StaffEClass, Hotel_Staff.class, "Hotel_Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Staff_Ssn(), ecorePackage.getEString(), "ssn", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Staff_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Staff_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Staff_HasWorkTitel(), this.getStaffType(), "hasWorkTitel", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_BookingEClass, Hotel_Booking.class, "Hotel_Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Booking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_CheckedIn(), ecorePackage.getEBoolean(), "checkedIn", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_BookingID(), ecorePackage.getEInt(), "bookingID", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Booking_Includes(), this.getBooking_BookedService(), null, "includes", null, 0, -1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Booking_Rooms(), this.getHotel_Room(), null, "rooms", null, 1, -1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Booking_ResponsibleGuest(), this.getCompany_GuestRecord(), null, "responsibleGuest", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booking_BookedServiceEClass, Booking_BookedService.class, "Booking_BookedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookedService_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Booking_BookedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_BookedService_FacilityService(), this.getFacility_FacilityService(), null, "facilityService", null, 1, 1, Booking_BookedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facility_FacilityServiceEClass, Facility_FacilityService.class, "Facility_FacilityService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacility_FacilityService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Facility_FacilityService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFacility_FacilityService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Facility_FacilityService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(company_GuestRecordEClass, Company_GuestRecord.class, "Company_GuestRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompany_GuestRecord_Name(), ecorePackage.getEString(), "name", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_Adress(), ecorePackage.getEString(), "adress", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_Ssn(), ecorePackage.getEString(), "ssn", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_PaymentInformation(), ecorePackage.getEString(), "paymentInformation", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booking_BillEClass, Booking_Bill.class, "Booking_Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_Bill_PaidAmount(), ecorePackage.getEDouble(), "paidAmount", null, 1, 1, Booking_Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Bill_Contains(), this.getBooking_PurchasedService(), null, "contains", null, 0, -1, Booking_Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booking_PurchasedServiceEClass, Booking_PurchasedService.class, "Booking_PurchasedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_PurchasedService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Booking_PurchasedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_PurchasedService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Booking_PurchasedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_FacilityEClass, Hotel_Facility.class, "Hotel_Facility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Facility_Name(), ecorePackage.getEString(), "name", null, 1, 1, Hotel_Facility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Facility_FacilityType(), this.getFacility_FacilityType(), null, "facilityType", null, 1, 1, Hotel_Facility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facility_FacilityTypeEClass, Facility_FacilityType.class, "Facility_FacilityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacility_FacilityType_Name(), ecorePackage.getEString(), "name", null, 1, 1, Facility_FacilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iServiceBookingEClass, IServiceBooking.class, "IServiceBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIServiceBooking__BookFacilityService__Hotel_Booking_Hotel_Facility_Facility_FacilityService_Date_String(), null, "bookFacilityService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Facility(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServiceBooking__FindAvailableServices__Hotel_Facility_Date(), null, "findAvailableServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Facility(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServiceBooking__GetBookedServices__Hotel_Booking(), null, "getBookedServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServiceBooking__FindBookedService__int(), null, "findBookedService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookedServiceID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServiceBooking__CancelBookedService__Booking_BookedService(), null, "cancelBookedService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking_BookedService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingManagerEClass, BookingManager.class, "BookingManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingManager_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, BookingManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBookingManager__CreateBooking__Date_Date_EList_Company_GuestRecord_int(), null, "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "rooms", 1, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_GuestRecord(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "numberOfPeople", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__FindAvailableRooms__Date_Date_Room_RoomType_int(), null, "findAvailableRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "_people", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckIn__Hotel_Booking(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckOut__Hotel_Booking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__AssignKey__Hotel_Room_Hotel_Booking_Date(), null, "assignKey", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "expirationDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__FindBooking__Date_int(), null, "findBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__EditBooking__int(), null, "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CancelBooking__int(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__GetBookings__String(), null, "getBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBookingManager__InitBooking(), null, "initBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__FindAvailableRoomTypes__Date_Date(), null, "findAvailableRoomTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffAdministrationEClass, StaffAdministration.class, "StaffAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffAdministration_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, StaffAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStaffAdministration__AddStaff__String_String_String_StaffType(), null, "addStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStaffType(), "workTitel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffAdministration__EditStaff__Hotel_Staff(), null, "editStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Staff(), "staff", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffAdministration__RemoveStaff__Hotel_Staff(), null, "removeStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Staff(), "staff", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomManagerEClass, RoomManager.class, "RoomManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManager_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, RoomManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomManager__FindRoom__int(), null, "findRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__CleaningStatus__Hotel_Room(), null, "cleaningStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManager__MaintenanceStatus__Hotel_Room(), null, "maintenanceStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomManager__GetRoomsToClean(), null, "getRoomsToClean", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomManager__GetRoomsToMaintain(), null, "getRoomsToMaintain", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomAdministrationEClass, RoomAdministration.class, "RoomAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomAdministration_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, RoomAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRoomAdministration__AddRoom__int_Room_RoomType_EList(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomAppliance(), "appliances", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAdministration__RemoveRoom__Hotel_Room(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAdministration__EditRoom__Hotel_Room(), null, "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAdministration__EditRoomType__Room_RoomType(), null, "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAdministration__CreateRoomType__double_int_double_RoomAppliance_ApplianceType(), null, "createRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "maxNumberOfGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "area", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAppliance_ApplianceType(), "applianceTypes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomAdministration__RemoveRoomType__Room_RoomType(), null, "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(applianceAdministrationEClass, ApplianceAdministration.class, "ApplianceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplianceAdministration_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, ApplianceAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__AddAppliance__Hotel_Room(), null, "addAppliance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__RemoveAppliance__Room_RoomAppliance(), null, "removeAppliance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomAppliance(), "appliance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__AddApplianceType__String(), null, "addApplianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType(), null, "editApplianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAppliance_ApplianceType(), "applianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType(), null, "removeApplianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAppliance_ApplianceType(), "applianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__EditAppliance__Room_RoomAppliance(), null, "editAppliance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomAppliance(), "appliance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__AddApplianceService__ApplianceType_ApplianceService(), null, "addApplianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplianceType_ApplianceService(), "applianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService(), null, "editApplianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplianceType_ApplianceService(), "applianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getApplianceAdministration__RemoveApplianceServer__ApplianceType_ApplianceService(), null, "removeApplianceServer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplianceType_ApplianceService(), "applianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(guestManagerEClass, GuestManager.class, "GuestManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuestManager_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, GuestManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGuestManager__CreateGuestRecord__String_String_String_String_String_String(), null, "createGuestRecord", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "adress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "paymentInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGuestManager__EditGuestRecord__String(), null, "editGuestRecord", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGuestManager__RemoveGuestRecord__String(), null, "removeGuestRecord", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGuestManager__FindGuestRecord__String(), null, "findGuestRecord", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGuestManager__FindGuestRecords__String_String(), null, "findGuestRecords", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(facilityAdministrationEClass, FacilityAdministration.class, "FacilityAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacilityAdministration_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, FacilityAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__AddFacility__String_Facility_FacilityType(), null, "addFacility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__EditFacility__Hotel_Facility(), null, "editFacility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Facility(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__AddFacilityType__String(), null, "addFacilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__EditFacilityType__Facility_FacilityType(), null, "editFacilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__RemoveFacility__Hotel_Facility(), null, "removeFacility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Facility(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__RemoveFacilityType__Facility_FacilityType(), null, "removeFacilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__AddService__Facility_FacilityType_String_double(), null, "addService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__EditService__Facility_FacilityService(), null, "editService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityAdministration__RemoveService__Facility_FacilityService(), null, "removeService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(hotelAdministrationEClass, HotelAdministration.class, "HotelAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHotelAdministration_Company(), this.getCompany(), null, "company", null, 1, 1, HotelAdministration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getHotelAdministration__AddHotel__String(), null, "addHotel", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHotelAdministration__EditHotel__Company_Hotel(), null, "editHotel", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_Hotel(), "hotel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getHotelAdministration__RemoveHotel__Company_Hotel(), null, "removeHotel", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_Hotel(), "hotel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billManagerEClass, BillManager.class, "BillManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillManager_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, BillManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBillManager__AddPurchasedService__String_String_double(), null, "addPurchasedService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__FindBill__int(), null, "findBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__CreateReceipt__int(), null, "createReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__GetAmount__int(), null, "getAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBillManager__Pay__int_double(), null, "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(facilityManagerEClass, FacilityManager.class, "FacilityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFacilityManager_Hotel(), this.getCompany_Hotel(), null, "hotel", null, 1, 1, FacilityManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getFacilityManager__FindServices__Date_Hotel_Facility_Date(), null, "findServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Facility(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityManager__FindServices__Date(), null, "findServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFacilityManager__FindBookedServices__Company_GuestRecord(), null, "findBookedServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_GuestRecord(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(staffTypeEEnum, StaffType.class, "StaffType");
		addEEnumLiteral(staffTypeEEnum, StaffType.MANAGER);
		addEEnumLiteral(staffTypeEEnum, StaffType.RECEPTIONIST);
		addEEnumLiteral(staffTypeEEnum, StaffType.JANITOR);
		addEEnumLiteral(staffTypeEEnum, StaffType.HOUSE_KEEPER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  ((getBookingManager__FindAvailableRooms__Date_Date_Room_RoomType_int()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "originalName", "#people"
		   });
	}

} //ClassDiagramPackageImpl
