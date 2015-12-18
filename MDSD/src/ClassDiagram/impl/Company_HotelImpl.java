/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_Hotel;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Hotel_Staff;
import ClassDiagram.Room_RoomType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getListOfRooms <em>List Of Rooms</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getListOfBookings <em>List Of Bookings</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getListOfRoomTypes <em>List Of Room Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Company_HotelImpl extends MinimalEObjectImpl.Container implements Company_Hotel {
	/**
	 * The cached value of the '{@link #getListOfRooms() <em>List Of Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Room> listOfRooms;

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
	 * The cached value of the '{@link #getListOfBookings() <em>List Of Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Booking> listOfBookings;

	/**
	 * The cached value of the '{@link #getListOfRoomTypes() <em>List Of Room Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfRoomTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Room_RoomType> listOfRoomTypes;

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
	public EList<Hotel_Room> getListOfRooms() {
		if (listOfRooms == null) {
			listOfRooms = new EObjectResolvingEList<Hotel_Room>(Hotel_Room.class, this, ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOMS);
		}
		return listOfRooms;
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
	public EList<Hotel_Booking> getListOfBookings() {
		if (listOfBookings == null) {
			listOfBookings = new EObjectResolvingEList<Hotel_Booking>(Hotel_Booking.class, this, ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_BOOKINGS);
		}
		return listOfBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room_RoomType> getListOfRoomTypes() {
		if (listOfRoomTypes == null) {
			listOfRoomTypes = new EObjectResolvingEList<Room_RoomType>(Room_RoomType.class, this, ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOM_TYPES);
		}
		return listOfRoomTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOMS:
				return getListOfRooms();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				return getEmployees();
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				return getName();
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_BOOKINGS:
				return getListOfBookings();
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOM_TYPES:
				return getListOfRoomTypes();
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
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOMS:
				getListOfRooms().clear();
				getListOfRooms().addAll((Collection<? extends Hotel_Room>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Hotel_Staff>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				setName((String)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_BOOKINGS:
				getListOfBookings().clear();
				getListOfBookings().addAll((Collection<? extends Hotel_Booking>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOM_TYPES:
				getListOfRoomTypes().clear();
				getListOfRoomTypes().addAll((Collection<? extends Room_RoomType>)newValue);
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
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOMS:
				getListOfRooms().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				getEmployees().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_BOOKINGS:
				getListOfBookings().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOM_TYPES:
				getListOfRoomTypes().clear();
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
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOMS:
				return listOfRooms != null && !listOfRooms.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				return employees != null && !employees.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_BOOKINGS:
				return listOfBookings != null && !listOfBookings.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__LIST_OF_ROOM_TYPES:
				return listOfRoomTypes != null && !listOfRoomTypes.isEmpty();
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
