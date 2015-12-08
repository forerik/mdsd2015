/**
 */
package ClassDiagram.impl;

import ClassDiagram.Booking_BookedService;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Facility_FacilityService;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Facility;
import ClassDiagram.ServiceBooking;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceBookingImpl extends MinimalEObjectImpl.Container implements ServiceBooking {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.SERVICE_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bookFacilityService(Hotel_Booking booking, Hotel_Facility facility, Facility_FacilityService service, Date date, String guest) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findAvailableServices(Hotel_Facility facility, Date date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookedServices(Hotel_Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBookedService(int bookedServiceID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBookedService(Booking_BookedService service) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.SERVICE_BOOKING___BOOK_FACILITY_SERVICE__HOTEL_BOOKING_HOTEL_FACILITY_FACILITY_FACILITYSERVICE_DATE_STRING:
				bookFacilityService((Hotel_Booking)arguments.get(0), (Hotel_Facility)arguments.get(1), (Facility_FacilityService)arguments.get(2), (Date)arguments.get(3), (String)arguments.get(4));
				return null;
			case ClassDiagramPackage.SERVICE_BOOKING___FIND_AVAILABLE_SERVICES__HOTEL_FACILITY_DATE:
				findAvailableServices((Hotel_Facility)arguments.get(0), (Date)arguments.get(1));
				return null;
			case ClassDiagramPackage.SERVICE_BOOKING___GET_BOOKED_SERVICES__HOTEL_BOOKING:
				getBookedServices((Hotel_Booking)arguments.get(0));
				return null;
			case ClassDiagramPackage.SERVICE_BOOKING___FIND_BOOKED_SERVICE__INT:
				findBookedService((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.SERVICE_BOOKING___CANCEL_BOOKED_SERVICE__BOOKING_BOOKEDSERVICE:
				cancelBookedService((Booking_BookedService)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceBookingImpl
