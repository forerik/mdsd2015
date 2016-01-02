/**
 */
package ClassDiagram.util;

import ClassDiagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ClassDiagram.ClassDiagramPackage
 * @generated
 */
public class ClassDiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ClassDiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassDiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDiagramSwitch<Adapter> modelSwitch =
		new ClassDiagramSwitch<Adapter>() {
			@Override
			public Adapter caseCompany(Company object) {
				return createCompanyAdapter();
			}
			@Override
			public Adapter caseCompany_Hotel(Company_Hotel object) {
				return createCompany_HotelAdapter();
			}
			@Override
			public Adapter caseHotel_Room(Hotel_Room object) {
				return createHotel_RoomAdapter();
			}
			@Override
			public Adapter caseRoom_RoomKey(Room_RoomKey object) {
				return createRoom_RoomKeyAdapter();
			}
			@Override
			public Adapter caseRoom_RoomType(Room_RoomType object) {
				return createRoom_RoomTypeAdapter();
			}
			@Override
			public Adapter caseRoomAppliance_ApplianceType(RoomAppliance_ApplianceType object) {
				return createRoomAppliance_ApplianceTypeAdapter();
			}
			@Override
			public Adapter caseApplianceType_ApplianceService(ApplianceType_ApplianceService object) {
				return createApplianceType_ApplianceServiceAdapter();
			}
			@Override
			public Adapter caseRoom_RoomAppliance(Room_RoomAppliance object) {
				return createRoom_RoomApplianceAdapter();
			}
			@Override
			public Adapter caseHotel_Staff(Hotel_Staff object) {
				return createHotel_StaffAdapter();
			}
			@Override
			public Adapter caseHotel_Booking(Hotel_Booking object) {
				return createHotel_BookingAdapter();
			}
			@Override
			public Adapter caseBooking_BookedService(Booking_BookedService object) {
				return createBooking_BookedServiceAdapter();
			}
			@Override
			public Adapter caseFacility_FacilityService(Facility_FacilityService object) {
				return createFacility_FacilityServiceAdapter();
			}
			@Override
			public Adapter caseCompany_GuestRecord(Company_GuestRecord object) {
				return createCompany_GuestRecordAdapter();
			}
			@Override
			public Adapter caseBooking_Bill(Booking_Bill object) {
				return createBooking_BillAdapter();
			}
			@Override
			public Adapter caseBooking_PurchasedService(Booking_PurchasedService object) {
				return createBooking_PurchasedServiceAdapter();
			}
			@Override
			public Adapter caseHotel_Facility(Hotel_Facility object) {
				return createHotel_FacilityAdapter();
			}
			@Override
			public Adapter caseFacility_FacilityType(Facility_FacilityType object) {
				return createFacility_FacilityTypeAdapter();
			}
			@Override
			public Adapter caseIServiceBooking(IServiceBooking object) {
				return createIServiceBookingAdapter();
			}
			@Override
			public Adapter caseBookingManager(BookingManager object) {
				return createBookingManagerAdapter();
			}
			@Override
			public Adapter caseRoomManager(RoomManager object) {
				return createRoomManagerAdapter();
			}
			@Override
			public Adapter caseGuestManager(GuestManager object) {
				return createGuestManagerAdapter();
			}
			@Override
			public Adapter caseStaffAdministration(StaffAdministration object) {
				return createStaffAdministrationAdapter();
			}
			@Override
			public Adapter caseRoomAdministration(RoomAdministration object) {
				return createRoomAdministrationAdapter();
			}
			@Override
			public Adapter caseApplianceAdministration(ApplianceAdministration object) {
				return createApplianceAdministrationAdapter();
			}
			@Override
			public Adapter caseFacilityAdministration(FacilityAdministration object) {
				return createFacilityAdministrationAdapter();
			}
			@Override
			public Adapter caseHotelAdministration(HotelAdministration object) {
				return createHotelAdministrationAdapter();
			}
			@Override
			public Adapter caseBillManager(BillManager object) {
				return createBillManagerAdapter();
			}
			@Override
			public Adapter caseFacilityManager(FacilityManager object) {
				return createFacilityManagerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Company
	 * @generated
	 */
	public Adapter createCompanyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Company_Hotel <em>Company Hotel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Company_Hotel
	 * @generated
	 */
	public Adapter createCompany_HotelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Hotel_Booking <em>Hotel Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Hotel_Booking
	 * @generated
	 */
	public Adapter createHotel_BookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Booking_BookedService <em>Booking Booked Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Booking_BookedService
	 * @generated
	 */
	public Adapter createBooking_BookedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Company_GuestRecord <em>Company Guest Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Company_GuestRecord
	 * @generated
	 */
	public Adapter createCompany_GuestRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Booking_Bill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Booking_Bill
	 * @generated
	 */
	public Adapter createBooking_BillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Booking_PurchasedService <em>Booking Purchased Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Booking_PurchasedService
	 * @generated
	 */
	public Adapter createBooking_PurchasedServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Hotel_Room <em>Hotel Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Hotel_Room
	 * @generated
	 */
	public Adapter createHotel_RoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Room_RoomAppliance <em>Room Room Appliance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Room_RoomAppliance
	 * @generated
	 */
	public Adapter createRoom_RoomApplianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.RoomAppliance_ApplianceType <em>Room Appliance Appliance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.RoomAppliance_ApplianceType
	 * @generated
	 */
	public Adapter createRoomAppliance_ApplianceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.ApplianceType_ApplianceService <em>Appliance Type Appliance Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.ApplianceType_ApplianceService
	 * @generated
	 */
	public Adapter createApplianceType_ApplianceServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Room_RoomType <em>Room Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Room_RoomType
	 * @generated
	 */
	public Adapter createRoom_RoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Room_RoomKey <em>Room Room Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Room_RoomKey
	 * @generated
	 */
	public Adapter createRoom_RoomKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Hotel_Facility <em>Hotel Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Hotel_Facility
	 * @generated
	 */
	public Adapter createHotel_FacilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Facility_FacilityType <em>Facility Facility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Facility_FacilityType
	 * @generated
	 */
	public Adapter createFacility_FacilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Facility_FacilityService <em>Facility Facility Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Facility_FacilityService
	 * @generated
	 */
	public Adapter createFacility_FacilityServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.Hotel_Staff <em>Hotel Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.Hotel_Staff
	 * @generated
	 */
	public Adapter createHotel_StaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.BookingManager <em>Booking Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.BookingManager
	 * @generated
	 */
	public Adapter createBookingManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.IServiceBooking <em>IService Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.IServiceBooking
	 * @generated
	 */
	public Adapter createIServiceBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.FacilityManager <em>Facility Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.FacilityManager
	 * @generated
	 */
	public Adapter createFacilityManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.HotelAdministration <em>Hotel Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.HotelAdministration
	 * @generated
	 */
	public Adapter createHotelAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.BillManager <em>Bill Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.BillManager
	 * @generated
	 */
	public Adapter createBillManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.StaffAdministration <em>Staff Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.StaffAdministration
	 * @generated
	 */
	public Adapter createStaffAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.RoomManager <em>Room Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.RoomManager
	 * @generated
	 */
	public Adapter createRoomManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.RoomAdministration <em>Room Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.RoomAdministration
	 * @generated
	 */
	public Adapter createRoomAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.ApplianceAdministration <em>Appliance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.ApplianceAdministration
	 * @generated
	 */
	public Adapter createApplianceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.GuestManager <em>Guest Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.GuestManager
	 * @generated
	 */
	public Adapter createGuestManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ClassDiagram.FacilityAdministration <em>Facility Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ClassDiagram.FacilityAdministration
	 * @generated
	 */
	public Adapter createFacilityAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ClassDiagramAdapterFactory
