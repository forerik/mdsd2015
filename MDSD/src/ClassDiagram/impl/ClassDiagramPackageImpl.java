/**
 */
package ClassDiagram.impl;

import ClassDiagram.ApplianceAdministration;
import ClassDiagram.ApplianceType_ApplianceService;
import ClassDiagram.BillManager;
import ClassDiagram.Booking;
import ClassDiagram.BookingManager;
import ClassDiagram.Booking_Availablerooms;
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
import ClassDiagram.GuestBooking;
import ClassDiagram.GuestManager;
import ClassDiagram.HotelAdministration;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Facility;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Hotel_Staff;
import ClassDiagram.IApplianceAdministration;
import ClassDiagram.IBillManager;
import ClassDiagram.IBooking;
import ClassDiagram.IFacilityAdministration;
import ClassDiagram.IFacilityManager;
import ClassDiagram.IGuestManager;
import ClassDiagram.IHotelAdministration;
import ClassDiagram.IRoomAdministration;
import ClassDiagram.IRoomManager;
import ClassDiagram.IServiceBooking;
import ClassDiagram.IStaffAdministration;
import ClassDiagram.RoomAdministration;
import ClassDiagram.RoomAppliance_ApplianceType;
import ClassDiagram.RoomManager;
import ClassDiagram.Room_RoomAppliance;
import ClassDiagram.Room_RoomKey;
import ClassDiagram.Room_RoomType;
import ClassDiagram.ServiceBooking;
import ClassDiagram.StaffAdministration;
import ClassDiagram.StaffBooking;
import ClassDiagram.StaffType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booking_AvailableroomsEClass = null;

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
	private EClass company_GuestRecordEClass = null;

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
	private EClass hotel_RoomEClass = null;

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
	private EClass room_RoomTypeEClass = null;

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
	private EClass facility_FacilityServiceEClass = null;

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
	private EClass iRoomManagerEClass = null;

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
	private EClass iGuestManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBillManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFacilityManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iApplianceAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRoomAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iFacilityAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaffAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iHotelAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingEClass = null;

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
	private EClass guestBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffBookingEClass = null;

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
	private EClass serviceBookingEClass = null;

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
	private EClass guestManagerEClass = null;

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
	private EClass hotelAdministrationEClass = null;

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
	private EEnum staffTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booking_extraGuestsEDataType = null;

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
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking_Availablerooms() {
		return booking_AvailableroomsEClass;
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
	public EReference getCompany_HasHotel() {
		return (EReference)companyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_HasGuest() {
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
	public EReference getCompany_Hotel_HasBooking() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Hotel_HasRoom() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Hotel_HasFacility() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompany_Hotel_Employee() {
		return (EReference)company_HotelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompany_Hotel_Name() {
		return (EAttribute)company_HotelEClass.getEStructuralFeatures().get(4);
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
	public EReference getHotel_Booking_BookedServices() {
		return (EReference)hotel_BookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Booking_Contact() {
		return (EReference)hotel_BookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Booking_Bookedservice() {
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
	public EAttribute getBooking_BookedService_Price() {
		return (EAttribute)booking_BookedServiceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCompany_GuestRecord_Payment() {
		return (EAttribute)company_GuestRecordEClass.getEStructuralFeatures().get(4);
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
	public EReference getBooking_Bill_HasPurchaseditem() {
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
	public EReference getHotel_Room_RoomAppliances() {
		return (EReference)hotel_RoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Room_HasType() {
		return (EReference)hotel_RoomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHotel_Room_HasKey() {
		return (EReference)hotel_RoomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Room_CleaningStatus() {
		return (EAttribute)hotel_RoomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotel_Room_MaintenceStatus() {
		return (EAttribute)hotel_RoomEClass.getEStructuralFeatures().get(5);
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
	public EReference getRoom_RoomAppliance_HasApplianceType() {
		return (EReference)room_RoomApplianceEClass.getEStructuralFeatures().get(1);
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
	public EReference getRoom_RoomType_HasAppliance() {
		return (EReference)room_RoomTypeEClass.getEStructuralFeatures().get(3);
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
	public EReference getHotel_Facility_HasType() {
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
	public EAttribute getFacility_FacilityType_Kind() {
		return (EAttribute)facility_FacilityTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getHotel_Staff_Stafftype() {
		return (EAttribute)hotel_StaffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomManager() {
		return iRoomManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManager__FindRoom__int() {
		return iRoomManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManager__CleaningStatus__Hotel_Room() {
		return iRoomManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManager__MaintenanceStatus__Hotel_Room() {
		return iRoomManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManager__GetRoomsToClean() {
		return iRoomManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomManager__GetRoomsToMaintain() {
		return iRoomManagerEClass.getEOperations().get(4);
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
	public EOperation getBookingManager__FindBooking__Date_String() {
		return bookingManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CheckIn__Hotel_Booking() {
		return bookingManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__CheckOut__Hotel_Booking() {
		return bookingManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBookingManager__AssignKey__Hotel_Room_Hotel_Booking_Date() {
		return bookingManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGuestManager() {
		return iGuestManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuestManager__CreateGuestRecord__String_String_String_String_String() {
		return iGuestManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuestManager__EditGuestRecord__Company_GuestRecord() {
		return iGuestManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuestManager__RemoveGuestRecord__Company_GuestRecord() {
		return iGuestManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuestManager__FindGuest__String() {
		return iGuestManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuestManager__FindGuests__String_String() {
		return iGuestManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBillManager() {
		return iBillManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillManager__AddPurchesedService__Booking_Bill_String_double() {
		return iBillManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillManager__FindBill__Hotel_Booking() {
		return iBillManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillManager__CreateReceipt__Booking_Bill() {
		return iBillManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillManager__GetAmount__Booking_Bill() {
		return iBillManagerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBillManager__Pay__Booking_Bill_double() {
		return iBillManagerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFacilityManager() {
		return iFacilityManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityManager__FindBookedService__Date_Facility_FacilityService() {
		return iFacilityManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityManager__FindBookedServices__Company_GuestRecord() {
		return iFacilityManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIApplianceAdministration() {
		return iApplianceAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__AddAppliance__Hotel_Room() {
		return iApplianceAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__RemoveAppliance__Room_RoomAppliance() {
		return iApplianceAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__AddApplianceType__String() {
		return iApplianceAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType() {
		return iApplianceAdministrationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType() {
		return iApplianceAdministrationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__EditAppliance__Room_RoomAppliance() {
		return iApplianceAdministrationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__AddApplianceService__String_double() {
		return iApplianceAdministrationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService() {
		return iApplianceAdministrationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIApplianceAdministration__RemoveApplianceService__ApplianceType_ApplianceService() {
		return iApplianceAdministrationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRoomAdministration() {
		return iRoomAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomAdministration__AddRoom__int_Room_RoomType() {
		return iRoomAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomAdministration__RemoveRoom__Hotel_Room() {
		return iRoomAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomAdministration__EditRoom__Hotel_Room() {
		return iRoomAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomAdministration__CreateRoomType() {
		return iRoomAdministrationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomAdministration__EditRoomType__Room_RoomType() {
		return iRoomAdministrationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRoomAdministration__RemoveRoomType__Room_RoomType() {
		return iRoomAdministrationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFacilityAdministration() {
		return iFacilityAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__AddFacility__String_Facility_FacilityType() {
		return iFacilityAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__EditFacility__Hotel_Facility() {
		return iFacilityAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__RemoveFacility__Hotel_Facility() {
		return iFacilityAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__AddFacilityType__String() {
		return iFacilityAdministrationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__EditFacilityType__Facility_FacilityType() {
		return iFacilityAdministrationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__RemoveFacilityType__Facility_FacilityType() {
		return iFacilityAdministrationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__AddService__Facility_FacilityType_String_double() {
		return iFacilityAdministrationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__EditService__Facility_FacilityService() {
		return iFacilityAdministrationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIFacilityAdministration__RemoveService__Facility_FacilityService() {
		return iFacilityAdministrationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStaffAdministration() {
		return iStaffAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdministration__AddStaff() {
		return iStaffAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdministration__EditStaff() {
		return iStaffAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaffAdministration__RemoveStaff() {
		return iStaffAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIHotelAdministration() {
		return iHotelAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministration__AddHotel() {
		return iHotelAdministrationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministration__EditHotel() {
		return iHotelAdministrationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIHotelAdministration__RemoveHotel() {
		return iHotelAdministrationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBooking() {
		return iBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__CreateBooking__Date_Date_Hotel_Room_Company_GuestRecord() {
		return iBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__FindAvailableRooms__Date_Date_Room_RoomType() {
		return iBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__EditBooking__Hotel_Booking() {
		return iBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__CancelBooking__Hotel_Booking() {
		return iBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__FindBooking__int() {
		return iBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetBookings__Company_GuestRecord() {
		return iBookingEClass.getEOperations().get(5);
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
	public EClass getGuestBooking() {
		return guestBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffBooking() {
		return staffBookingEClass;
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
	public EClass getServiceBooking() {
		return serviceBookingEClass;
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
	public EClass getGuestManager() {
		return guestManagerEClass;
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
	public EClass getHotelAdministration() {
		return hotelAdministrationEClass;
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
	public EClass getRoomManager() {
		return roomManagerEClass;
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
	public EClass getApplianceAdministration() {
		return applianceAdministrationEClass;
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
	public EDataType getBooking_extraGuests() {
		return booking_extraGuestsEDataType;
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
		bookingEClass = createEClass(BOOKING);

		booking_AvailableroomsEClass = createEClass(BOOKING_AVAILABLEROOMS);

		companyEClass = createEClass(COMPANY);
		createEReference(companyEClass, COMPANY__HAS_HOTEL);
		createEReference(companyEClass, COMPANY__HAS_GUEST);
		createEAttribute(companyEClass, COMPANY__NAME);

		company_HotelEClass = createEClass(COMPANY_HOTEL);
		createEReference(company_HotelEClass, COMPANY_HOTEL__HAS_BOOKING);
		createEReference(company_HotelEClass, COMPANY_HOTEL__HAS_ROOM);
		createEReference(company_HotelEClass, COMPANY_HOTEL__HAS_FACILITY);
		createEReference(company_HotelEClass, COMPANY_HOTEL__EMPLOYEE);
		createEAttribute(company_HotelEClass, COMPANY_HOTEL__NAME);

		hotel_BookingEClass = createEClass(HOTEL_BOOKING);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__START_DATE);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__END_DATE);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__PRICE);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__CHECKED_IN);
		createEAttribute(hotel_BookingEClass, HOTEL_BOOKING__BOOKING_ID);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__BOOKED_SERVICES);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__CONTACT);
		createEReference(hotel_BookingEClass, HOTEL_BOOKING__BOOKEDSERVICE);

		booking_BookedServiceEClass = createEClass(BOOKING_BOOKED_SERVICE);
		createEAttribute(booking_BookedServiceEClass, BOOKING_BOOKED_SERVICE__DATE);
		createEAttribute(booking_BookedServiceEClass, BOOKING_BOOKED_SERVICE__PRICE);

		company_GuestRecordEClass = createEClass(COMPANY_GUEST_RECORD);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__NAME);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__ADRESS);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__PHONE_NUMBER);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__SSN);
		createEAttribute(company_GuestRecordEClass, COMPANY_GUEST_RECORD__PAYMENT);

		booking_BillEClass = createEClass(BOOKING_BILL);
		createEAttribute(booking_BillEClass, BOOKING_BILL__PAID_AMOUNT);
		createEReference(booking_BillEClass, BOOKING_BILL__HAS_PURCHASEDITEM);

		booking_PurchasedServiceEClass = createEClass(BOOKING_PURCHASED_SERVICE);
		createEAttribute(booking_PurchasedServiceEClass, BOOKING_PURCHASED_SERVICE__NAME);
		createEAttribute(booking_PurchasedServiceEClass, BOOKING_PURCHASED_SERVICE__PRICE);

		hotel_RoomEClass = createEClass(HOTEL_ROOM);
		createEAttribute(hotel_RoomEClass, HOTEL_ROOM__ROOM_NUMBER);
		createEReference(hotel_RoomEClass, HOTEL_ROOM__ROOM_APPLIANCES);
		createEReference(hotel_RoomEClass, HOTEL_ROOM__HAS_TYPE);
		createEReference(hotel_RoomEClass, HOTEL_ROOM__HAS_KEY);
		createEAttribute(hotel_RoomEClass, HOTEL_ROOM__CLEANING_STATUS);
		createEAttribute(hotel_RoomEClass, HOTEL_ROOM__MAINTENCE_STATUS);

		room_RoomApplianceEClass = createEClass(ROOM_ROOM_APPLIANCE);
		createEAttribute(room_RoomApplianceEClass, ROOM_ROOM_APPLIANCE__NAME);
		createEReference(room_RoomApplianceEClass, ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE);

		roomAppliance_ApplianceTypeEClass = createEClass(ROOM_APPLIANCE_APPLIANCE_TYPE);
		createEAttribute(roomAppliance_ApplianceTypeEClass, ROOM_APPLIANCE_APPLIANCE_TYPE__NAME);

		applianceType_ApplianceServiceEClass = createEClass(APPLIANCE_TYPE_APPLIANCE_SERVICE);
		createEAttribute(applianceType_ApplianceServiceEClass, APPLIANCE_TYPE_APPLIANCE_SERVICE__NAME);
		createEAttribute(applianceType_ApplianceServiceEClass, APPLIANCE_TYPE_APPLIANCE_SERVICE__PRICE);

		room_RoomTypeEClass = createEClass(ROOM_ROOM_TYPE);
		createEAttribute(room_RoomTypeEClass, ROOM_ROOM_TYPE__PRICE);
		createEAttribute(room_RoomTypeEClass, ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS);
		createEAttribute(room_RoomTypeEClass, ROOM_ROOM_TYPE__AREA);
		createEReference(room_RoomTypeEClass, ROOM_ROOM_TYPE__HAS_APPLIANCE);

		room_RoomKeyEClass = createEClass(ROOM_ROOM_KEY);
		createEAttribute(room_RoomKeyEClass, ROOM_ROOM_KEY__EXPIRATION_DATE);

		hotel_FacilityEClass = createEClass(HOTEL_FACILITY);
		createEAttribute(hotel_FacilityEClass, HOTEL_FACILITY__NAME);
		createEReference(hotel_FacilityEClass, HOTEL_FACILITY__HAS_TYPE);

		facility_FacilityTypeEClass = createEClass(FACILITY_FACILITY_TYPE);
		createEAttribute(facility_FacilityTypeEClass, FACILITY_FACILITY_TYPE__KIND);

		facility_FacilityServiceEClass = createEClass(FACILITY_FACILITY_SERVICE);
		createEAttribute(facility_FacilityServiceEClass, FACILITY_FACILITY_SERVICE__NAME);
		createEAttribute(facility_FacilityServiceEClass, FACILITY_FACILITY_SERVICE__PRICE);

		hotel_StaffEClass = createEClass(HOTEL_STAFF);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__SSN);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__FIRST_NAME);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__LAST_NAME);
		createEAttribute(hotel_StaffEClass, HOTEL_STAFF__STAFFTYPE);

		iRoomManagerEClass = createEClass(IROOM_MANAGER);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___FIND_ROOM__INT);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___GET_ROOMS_TO_CLEAN);
		createEOperation(iRoomManagerEClass, IROOM_MANAGER___GET_ROOMS_TO_MAINTAIN);

		bookingManagerEClass = createEClass(BOOKING_MANAGER);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___FIND_BOOKING__DATE_STRING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_IN__HOTEL_BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___CHECK_OUT__HOTEL_BOOKING);
		createEOperation(bookingManagerEClass, BOOKING_MANAGER___ASSIGN_KEY__HOTEL_ROOM_HOTEL_BOOKING_DATE);

		iGuestManagerEClass = createEClass(IGUEST_MANAGER);
		createEOperation(iGuestManagerEClass, IGUEST_MANAGER___CREATE_GUEST_RECORD__STRING_STRING_STRING_STRING_STRING);
		createEOperation(iGuestManagerEClass, IGUEST_MANAGER___EDIT_GUEST_RECORD__COMPANY_GUESTRECORD);
		createEOperation(iGuestManagerEClass, IGUEST_MANAGER___REMOVE_GUEST_RECORD__COMPANY_GUESTRECORD);
		createEOperation(iGuestManagerEClass, IGUEST_MANAGER___FIND_GUEST__STRING);
		createEOperation(iGuestManagerEClass, IGUEST_MANAGER___FIND_GUESTS__STRING_STRING);

		iBillManagerEClass = createEClass(IBILL_MANAGER);
		createEOperation(iBillManagerEClass, IBILL_MANAGER___ADD_PURCHESED_SERVICE__BOOKING_BILL_STRING_DOUBLE);
		createEOperation(iBillManagerEClass, IBILL_MANAGER___FIND_BILL__HOTEL_BOOKING);
		createEOperation(iBillManagerEClass, IBILL_MANAGER___CREATE_RECEIPT__BOOKING_BILL);
		createEOperation(iBillManagerEClass, IBILL_MANAGER___GET_AMOUNT__BOOKING_BILL);
		createEOperation(iBillManagerEClass, IBILL_MANAGER___PAY__BOOKING_BILL_DOUBLE);

		iFacilityManagerEClass = createEClass(IFACILITY_MANAGER);
		createEOperation(iFacilityManagerEClass, IFACILITY_MANAGER___FIND_BOOKED_SERVICE__DATE_FACILITY_FACILITYSERVICE);
		createEOperation(iFacilityManagerEClass, IFACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD);

		iApplianceAdministrationEClass = createEClass(IAPPLIANCE_ADMINISTRATION);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__STRING_DOUBLE);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE);
		createEOperation(iApplianceAdministrationEClass, IAPPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE);

		iRoomAdministrationEClass = createEClass(IROOM_ADMINISTRATION);
		createEOperation(iRoomAdministrationEClass, IROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE);
		createEOperation(iRoomAdministrationEClass, IROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM);
		createEOperation(iRoomAdministrationEClass, IROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM);
		createEOperation(iRoomAdministrationEClass, IROOM_ADMINISTRATION___CREATE_ROOM_TYPE);
		createEOperation(iRoomAdministrationEClass, IROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE);
		createEOperation(iRoomAdministrationEClass, IROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE);

		iFacilityAdministrationEClass = createEClass(IFACILITY_ADMINISTRATION);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE);
		createEOperation(iFacilityAdministrationEClass, IFACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE);

		iStaffAdministrationEClass = createEClass(ISTAFF_ADMINISTRATION);
		createEOperation(iStaffAdministrationEClass, ISTAFF_ADMINISTRATION___ADD_STAFF);
		createEOperation(iStaffAdministrationEClass, ISTAFF_ADMINISTRATION___EDIT_STAFF);
		createEOperation(iStaffAdministrationEClass, ISTAFF_ADMINISTRATION___REMOVE_STAFF);

		iHotelAdministrationEClass = createEClass(IHOTEL_ADMINISTRATION);
		createEOperation(iHotelAdministrationEClass, IHOTEL_ADMINISTRATION___ADD_HOTEL);
		createEOperation(iHotelAdministrationEClass, IHOTEL_ADMINISTRATION___EDIT_HOTEL);
		createEOperation(iHotelAdministrationEClass, IHOTEL_ADMINISTRATION___REMOVE_HOTEL);

		iBookingEClass = createEClass(IBOOKING);
		createEOperation(iBookingEClass, IBOOKING___CREATE_BOOKING__DATE_DATE_HOTEL_ROOM_COMPANY_GUESTRECORD);
		createEOperation(iBookingEClass, IBOOKING___FIND_AVAILABLE_ROOMS__DATE_DATE_ROOM_ROOMTYPE);
		createEOperation(iBookingEClass, IBOOKING___EDIT_BOOKING__HOTEL_BOOKING);
		createEOperation(iBookingEClass, IBOOKING___CANCEL_BOOKING__HOTEL_BOOKING);
		createEOperation(iBookingEClass, IBOOKING___FIND_BOOKING__INT);
		createEOperation(iBookingEClass, IBOOKING___GET_BOOKINGS__COMPANY_GUESTRECORD);

		iServiceBookingEClass = createEClass(ISERVICE_BOOKING);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___BOOK_FACILITY_SERVICE__HOTEL_BOOKING_HOTEL_FACILITY_FACILITY_FACILITYSERVICE_DATE_STRING);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___FIND_AVAILABLE_SERVICES__HOTEL_FACILITY_DATE);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___GET_BOOKED_SERVICES__HOTEL_BOOKING);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___FIND_BOOKED_SERVICE__INT);
		createEOperation(iServiceBookingEClass, ISERVICE_BOOKING___CANCEL_BOOKED_SERVICE__BOOKING_BOOKEDSERVICE);

		guestBookingEClass = createEClass(GUEST_BOOKING);

		staffBookingEClass = createEClass(STAFF_BOOKING);

		facilityAdministrationEClass = createEClass(FACILITY_ADMINISTRATION);

		serviceBookingEClass = createEClass(SERVICE_BOOKING);

		facilityManagerEClass = createEClass(FACILITY_MANAGER);

		guestManagerEClass = createEClass(GUEST_MANAGER);

		billManagerEClass = createEClass(BILL_MANAGER);

		hotelAdministrationEClass = createEClass(HOTEL_ADMINISTRATION);

		staffAdministrationEClass = createEClass(STAFF_ADMINISTRATION);

		roomManagerEClass = createEClass(ROOM_MANAGER);

		roomAdministrationEClass = createEClass(ROOM_ADMINISTRATION);

		applianceAdministrationEClass = createEClass(APPLIANCE_ADMINISTRATION);

		// Create enums
		staffTypeEEnum = createEEnum(STAFF_TYPE);

		// Create data types
		booking_extraGuestsEDataType = createEDataType(BOOKING_EXTRA_GUESTS);
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
		guestBookingEClass.getESuperTypes().add(this.getIBooking());
		staffBookingEClass.getESuperTypes().add(this.getBookingManager());
		facilityAdministrationEClass.getESuperTypes().add(this.getIFacilityAdministration());
		serviceBookingEClass.getESuperTypes().add(this.getIServiceBooking());
		facilityManagerEClass.getESuperTypes().add(this.getIFacilityManager());
		guestManagerEClass.getESuperTypes().add(this.getIGuestManager());
		billManagerEClass.getESuperTypes().add(this.getIBillManager());
		hotelAdministrationEClass.getESuperTypes().add(this.getIHotelAdministration());
		staffAdministrationEClass.getESuperTypes().add(this.getIStaffAdministration());
		roomManagerEClass.getESuperTypes().add(this.getIRoomManager());
		roomAdministrationEClass.getESuperTypes().add(this.getIRoomAdministration());
		applianceAdministrationEClass.getESuperTypes().add(this.getIApplianceAdministration());

		// Initialize classes, features, and operations; add parameters
		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booking_AvailableroomsEClass, Booking_Availablerooms.class, "Booking_Availablerooms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(companyEClass, Company.class, "Company", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompany_HasHotel(), this.getCompany_Hotel(), null, "hasHotel", null, 1, -1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_HasGuest(), this.getCompany_GuestRecord(), null, "hasGuest", null, 0, -1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_Name(), ecorePackage.getEString(), "name", null, 1, 1, Company.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(company_HotelEClass, Company_Hotel.class, "Company_Hotel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompany_Hotel_HasBooking(), this.getHotel_Booking(), null, "hasBooking", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_Hotel_HasRoom(), this.getHotel_Room(), null, "hasRoom", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_Hotel_HasFacility(), this.getHotel_Facility(), null, "hasFacility", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompany_Hotel_Employee(), this.getHotel_Staff(), null, "employee", null, 0, -1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_Hotel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Company_Hotel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_BookingEClass, Hotel_Booking.class, "Hotel_Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Booking_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_CheckedIn(), ecorePackage.getEBoolean(), "checkedIn", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Booking_BookingID(), ecorePackage.getEInt(), "bookingID", null, 1, 1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Booking_BookedServices(), this.getBooking_BookedService(), null, "bookedServices", null, 0, -1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Booking_Contact(), this.getCompany_GuestRecord(), null, "contact", null, 0, -1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Booking_Bookedservice(), this.getBooking_BookedService(), null, "bookedservice", null, 0, -1, Hotel_Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booking_BookedServiceEClass, Booking_BookedService.class, "Booking_BookedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookedService_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Booking_BookedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_BookedService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Booking_BookedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(company_GuestRecordEClass, Company_GuestRecord.class, "Company_GuestRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompany_GuestRecord_Name(), ecorePackage.getEString(), "name", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_Adress(), ecorePackage.getEString(), "adress", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_Ssn(), ecorePackage.getEString(), "ssn", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCompany_GuestRecord_Payment(), ecorePackage.getEString(), "payment", null, 1, 1, Company_GuestRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booking_BillEClass, Booking_Bill.class, "Booking_Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_Bill_PaidAmount(), ecorePackage.getEDouble(), "paidAmount", null, 1, 1, Booking_Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Bill_HasPurchaseditem(), this.getBooking_PurchasedService(), null, "hasPurchaseditem", null, 0, -1, Booking_Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(booking_PurchasedServiceEClass, Booking_PurchasedService.class, "Booking_PurchasedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_PurchasedService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Booking_PurchasedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_PurchasedService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Booking_PurchasedService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_RoomEClass, Hotel_Room.class, "Hotel_Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Room_RoomNumber(), ecorePackage.getEInt(), "roomNumber", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Room_RoomAppliances(), this.getRoom_RoomAppliance(), null, "roomAppliances", null, 0, -1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Room_HasType(), this.getRoom_RoomType(), null, "hasType", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Room_HasKey(), this.getRoom_RoomKey(), null, "hasKey", null, 0, -1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Room_CleaningStatus(), ecorePackage.getEBoolean(), "cleaningStatus", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Room_MaintenceStatus(), ecorePackage.getEBoolean(), "maintenceStatus", null, 1, 1, Hotel_Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(room_RoomApplianceEClass, Room_RoomAppliance.class, "Room_RoomAppliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomAppliance_Name(), ecorePackage.getEString(), "name", null, 1, 1, Room_RoomAppliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomAppliance_HasApplianceType(), this.getRoomAppliance_ApplianceType(), null, "hasApplianceType", null, 1, 1, Room_RoomAppliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomAppliance_ApplianceTypeEClass, RoomAppliance_ApplianceType.class, "RoomAppliance_ApplianceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomAppliance_ApplianceType_Name(), ecorePackage.getEString(), "name", null, 1, 1, RoomAppliance_ApplianceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applianceType_ApplianceServiceEClass, ApplianceType_ApplianceService.class, "ApplianceType_ApplianceService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplianceType_ApplianceService_Name(), ecorePackage.getEString(), "name", null, 1, 1, ApplianceType_ApplianceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getApplianceType_ApplianceService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, ApplianceType_ApplianceService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(room_RoomTypeEClass, Room_RoomType.class, "Room_RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomType_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomType_MaxNumberOfGuests(), ecorePackage.getEInt(), "maxNumberOfGuests", null, 1, 1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_RoomType_Area(), ecorePackage.getEDouble(), "area", null, 1, 1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomType_HasAppliance(), this.getRoom_RoomAppliance(), null, "hasAppliance", null, 0, -1, Room_RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(room_RoomKeyEClass, Room_RoomKey.class, "Room_RoomKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomKey_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, Room_RoomKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_FacilityEClass, Hotel_Facility.class, "Hotel_Facility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Facility_Name(), ecorePackage.getEString(), "name", null, 1, 1, Hotel_Facility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHotel_Facility_HasType(), this.getFacility_FacilityType(), null, "hasType", null, 1, 1, Hotel_Facility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facility_FacilityTypeEClass, Facility_FacilityType.class, "Facility_FacilityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacility_FacilityType_Kind(), ecorePackage.getEString(), "kind", null, 1, 1, Facility_FacilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facility_FacilityServiceEClass, Facility_FacilityService.class, "Facility_FacilityService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacility_FacilityService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Facility_FacilityService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFacility_FacilityService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Facility_FacilityService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotel_StaffEClass, Hotel_Staff.class, "Hotel_Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotel_Staff_Ssn(), ecorePackage.getEString(), "ssn", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Staff_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Staff_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotel_Staff_Stafftype(), this.getStaffType(), "stafftype", null, 1, 1, Hotel_Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iRoomManagerEClass, IRoomManager.class, "IRoomManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIRoomManager__FindRoom__int(), null, "findRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManager__CleaningStatus__Hotel_Room(), null, "cleaningStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomManager__MaintenanceStatus__Hotel_Room(), null, "maintenanceStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomManager__GetRoomsToClean(), null, "getRoomsToClean", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomManager__GetRoomsToMaintain(), null, "getRoomsToMaintain", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingManagerEClass, BookingManager.class, "BookingManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBookingManager__FindBooking__Date_String(), null, "findBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "guestSSN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckIn__Hotel_Booking(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__CheckOut__Hotel_Booking(), null, "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBookingManager__AssignKey__Hotel_Room_Hotel_Booking_Date(), null, "assignKey", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "rooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "expirationDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iGuestManagerEClass, IGuestManager.class, "IGuestManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIGuestManager__CreateGuestRecord__String_String_String_String_String(), null, "createGuestRecord", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "adress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuestManager__EditGuestRecord__Company_GuestRecord(), null, "editGuestRecord", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_GuestRecord(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuestManager__RemoveGuestRecord__Company_GuestRecord(), null, "removeGuestRecord", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_GuestRecord(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuestManager__FindGuest__String(), null, "findGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ssn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuestManager__FindGuests__String_String(), null, "findGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBillManagerEClass, IBillManager.class, "IBillManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBillManager__AddPurchesedService__Booking_Bill_String_double(), null, "addPurchesedService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking_Bill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "item", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillManager__FindBill__Hotel_Booking(), null, "findBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillManager__CreateReceipt__Booking_Bill(), null, "createReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking_Bill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillManager__GetAmount__Booking_Bill(), null, "getAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking_Bill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBillManager__Pay__Booking_Bill_double(), null, "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getBooking_Bill(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iFacilityManagerEClass, IFacilityManager.class, "IFacilityManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIFacilityManager__FindBookedService__Date_Facility_FacilityService(), null, "findBookedService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityService(), "facilityService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityManager__FindBookedServices__Company_GuestRecord(), null, "findBookedServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_GuestRecord(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iApplianceAdministrationEClass, IApplianceAdministration.class, "IApplianceAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIApplianceAdministration__AddAppliance__Hotel_Room(), null, "addAppliance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__RemoveAppliance__Room_RoomAppliance(), null, "removeAppliance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomAppliance(), "appliance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__AddApplianceType__String(), null, "addApplianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__EditApplianceType__RoomAppliance_ApplianceType(), null, "editApplianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAppliance_ApplianceType(), "applianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__RemoveApplianceType__RoomAppliance_ApplianceType(), null, "removeApplianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoomAppliance_ApplianceType(), "applianceType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__EditAppliance__Room_RoomAppliance(), null, "editAppliance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomAppliance(), "appliance", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__AddApplianceService__String_double(), null, "addApplianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__EditApplianceService__ApplianceType_ApplianceService(), null, "editApplianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplianceType_ApplianceService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIApplianceAdministration__RemoveApplianceService__ApplianceType_ApplianceService(), null, "removeApplianceService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getApplianceType_ApplianceService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRoomAdministrationEClass, IRoomAdministration.class, "IRoomAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIRoomAdministration__AddRoom__int_Room_RoomType(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomAdministration__RemoveRoom__Hotel_Room(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomAdministration__EditRoom__Hotel_Room(), null, "editRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRoomAdministration__CreateRoomType(), null, "createRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomAdministration__EditRoomType__Room_RoomType(), null, "editRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRoomAdministration__RemoveRoomType__Room_RoomType(), null, "removeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iFacilityAdministrationEClass, IFacilityAdministration.class, "IFacilityAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIFacilityAdministration__AddFacility__String_Facility_FacilityType(), null, "addFacility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__EditFacility__Hotel_Facility(), null, "editFacility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Facility(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__RemoveFacility__Hotel_Facility(), null, "removeFacility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Facility(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__AddFacilityType__String(), null, "addFacilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "kind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__EditFacilityType__Facility_FacilityType(), null, "editFacilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__RemoveFacilityType__Facility_FacilityType(), null, "removeFacilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facilityType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__AddService__Facility_FacilityType_String_double(), null, "addService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityType(), "facility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__EditService__Facility_FacilityService(), null, "editService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIFacilityAdministration__RemoveService__Facility_FacilityService(), null, "removeService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFacility_FacilityService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iStaffAdministrationEClass, IStaffAdministration.class, "IStaffAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIStaffAdministration__AddStaff(), null, "addStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStaffAdministration__EditStaff(), null, "editStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStaffAdministration__RemoveStaff(), null, "removeStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iHotelAdministrationEClass, IHotelAdministration.class, "IHotelAdministration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIHotelAdministration__AddHotel(), null, "addHotel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIHotelAdministration__EditHotel(), null, "editHotel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIHotelAdministration__RemoveHotel(), null, "removeHotel", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookingEClass, IBooking.class, "IBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBooking__CreateBooking__Date_Date_Hotel_Room_Company_GuestRecord(), null, "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Room(), "rooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_GuestRecord(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__FindAvailableRooms__Date_Date_Room_RoomType(), null, "findAvailableRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "start", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "end", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRoom_RoomType(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__EditBooking__Hotel_Booking(), null, "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__CancelBooking__Hotel_Booking(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotel_Booking(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__FindBooking__int(), null, "findBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__GetBookings__Company_GuestRecord(), null, "getBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCompany_GuestRecord(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iServiceBookingEClass, IServiceBooking.class, "IServiceBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIServiceBooking__BookFacilityService__Hotel_Booking_Hotel_Facility_Facility_FacilityService_Date_String(), null, "bookFacilityService", 1, 1, IS_UNIQUE, !IS_ORDERED);
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

		initEClass(guestBookingEClass, GuestBooking.class, "GuestBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staffBookingEClass, StaffBooking.class, "StaffBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facilityAdministrationEClass, FacilityAdministration.class, "FacilityAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceBookingEClass, ServiceBooking.class, "ServiceBooking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facilityManagerEClass, FacilityManager.class, "FacilityManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(guestManagerEClass, GuestManager.class, "GuestManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(billManagerEClass, BillManager.class, "BillManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hotelAdministrationEClass, HotelAdministration.class, "HotelAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staffAdministrationEClass, StaffAdministration.class, "StaffAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomManagerEClass, RoomManager.class, "RoomManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomAdministrationEClass, RoomAdministration.class, "RoomAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applianceAdministrationEClass, ApplianceAdministration.class, "ApplianceAdministration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(staffTypeEEnum, StaffType.class, "StaffType");
		addEEnumLiteral(staffTypeEEnum, StaffType.MANAGER);
		addEEnumLiteral(staffTypeEEnum, StaffType.RECEPTIONIST);
		addEEnumLiteral(staffTypeEEnum, StaffType.JANITOR);
		addEEnumLiteral(staffTypeEEnum, StaffType.HOUSE_KEEPER);

		// Initialize data types

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
		  (booking_AvailableroomsEClass, 
		   source, 
		   new String[] {
			 "originalName", "Available rooms"
		   });
	}

} //ClassDiagramPackageImpl
