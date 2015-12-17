/**
 */
package ClassDiagram.impl;

import ClassDiagram.BookingManager;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_Hotel;
import ClassDiagram.Hotel_Facility;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Hotel_Staff;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company Hotel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getConsistsOfRooms <em>Consists Of Rooms</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getConsistsOfFacilities <em>Consists Of Facilities</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getBookingmanager <em>Bookingmanager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Company_HotelImpl extends MinimalEObjectImpl.Container implements Company_Hotel {
	/**
	 * The cached value of the '{@link #getConsistsOfRooms() <em>Consists Of Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOfRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Room> consistsOfRooms;

	/**
	 * The cached value of the '{@link #getConsistsOfFacilities() <em>Consists Of Facilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOfFacilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Facility> consistsOfFacilities;

	/**
	 * The cached value of the '{@link #getEmployees() <em>Employees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Staff> employees;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookingmanager() <em>Bookingmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingmanager()
	 * @generated
	 * @ordered
	 */
	protected BookingManager bookingmanager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Company_HotelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.COMPANY_HOTEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Room> getConsistsOfRooms() {
		if (consistsOfRooms == null) {
			consistsOfRooms = new EObjectResolvingEList<Hotel_Room>(Hotel_Room.class, this, ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_ROOMS);
		}
		return consistsOfRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Facility> getConsistsOfFacilities() {
		if (consistsOfFacilities == null) {
			consistsOfFacilities = new EObjectResolvingEList<Hotel_Facility>(Hotel_Facility.class, this, ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_FACILITIES);
		}
		return consistsOfFacilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Staff> getEmployees() {
		if (employees == null) {
			employees = new EObjectResolvingEList<Hotel_Staff>(Hotel_Staff.class, this, ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES);
		}
		return employees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY_HOTEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManager getBookingmanager() {
		if (bookingmanager != null && bookingmanager.eIsProxy()) {
			InternalEObject oldBookingmanager = (InternalEObject)bookingmanager;
			bookingmanager = (BookingManager)eResolveProxy(oldBookingmanager);
			if (bookingmanager != oldBookingmanager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.COMPANY_HOTEL__BOOKINGMANAGER, oldBookingmanager, bookingmanager));
			}
		}
		return bookingmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManager basicGetBookingmanager() {
		return bookingmanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingmanager(BookingManager newBookingmanager) {
		BookingManager oldBookingmanager = bookingmanager;
		bookingmanager = newBookingmanager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY_HOTEL__BOOKINGMANAGER, oldBookingmanager, bookingmanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_ROOMS:
				return getConsistsOfRooms();
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_FACILITIES:
				return getConsistsOfFacilities();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				return getEmployees();
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				return getName();
			case ClassDiagramPackage.COMPANY_HOTEL__BOOKINGMANAGER:
				if (resolve) return getBookingmanager();
				return basicGetBookingmanager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_ROOMS:
				getConsistsOfRooms().clear();
				getConsistsOfRooms().addAll((Collection<? extends Hotel_Room>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_FACILITIES:
				getConsistsOfFacilities().clear();
				getConsistsOfFacilities().addAll((Collection<? extends Hotel_Facility>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Hotel_Staff>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				setName((String)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__BOOKINGMANAGER:
				setBookingmanager((BookingManager)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_ROOMS:
				getConsistsOfRooms().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_FACILITIES:
				getConsistsOfFacilities().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				getEmployees().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__BOOKINGMANAGER:
				setBookingmanager((BookingManager)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_ROOMS:
				return consistsOfRooms != null && !consistsOfRooms.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF_FACILITIES:
				return consistsOfFacilities != null && !consistsOfFacilities.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.COMPANY_HOTEL__BOOKINGMANAGER:
				return bookingmanager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Company_HotelImpl
