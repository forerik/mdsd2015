/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_Hotel;
import ClassDiagram.Hotel_Booking;
import ClassDiagram.Hotel_Facility;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Hotel_Staff;

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
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getHasBooking <em>Has Booking</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getHasRoom <em>Has Room</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getHasFacility <em>Has Facility</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getEmployee <em>Employee</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Company_HotelImpl extends MinimalEObjectImpl.Container implements Company_Hotel {
	/**
	 * The cached value of the '{@link #getHasBooking() <em>Has Booking</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBooking()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Booking> hasBooking;

	/**
	 * The cached value of the '{@link #getHasRoom() <em>Has Room</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Room> hasRoom;

	/**
	 * The cached value of the '{@link #getHasFacility() <em>Has Facility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Facility> hasFacility;

	/**
	 * The cached value of the '{@link #getEmployee() <em>Employee</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployee()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Staff> employee;

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
	public EList<Hotel_Booking> getHasBooking() {
		if (hasBooking == null) {
			hasBooking = new EObjectResolvingEList<Hotel_Booking>(Hotel_Booking.class, this, ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKING);
		}
		return hasBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Room> getHasRoom() {
		if (hasRoom == null) {
			hasRoom = new EObjectResolvingEList<Hotel_Room>(Hotel_Room.class, this, ClassDiagramPackage.COMPANY_HOTEL__HAS_ROOM);
		}
		return hasRoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Facility> getHasFacility() {
		if (hasFacility == null) {
			hasFacility = new EObjectResolvingEList<Hotel_Facility>(Hotel_Facility.class, this, ClassDiagramPackage.COMPANY_HOTEL__HAS_FACILITY);
		}
		return hasFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Staff> getEmployee() {
		if (employee == null) {
			employee = new EObjectResolvingEList<Hotel_Staff>(Hotel_Staff.class, this, ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEE);
		}
		return employee;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKING:
				return getHasBooking();
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_ROOM:
				return getHasRoom();
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_FACILITY:
				return getHasFacility();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEE:
				return getEmployee();
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				return getName();
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
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKING:
				getHasBooking().clear();
				getHasBooking().addAll((Collection<? extends Hotel_Booking>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_ROOM:
				getHasRoom().clear();
				getHasRoom().addAll((Collection<? extends Hotel_Room>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_FACILITY:
				getHasFacility().clear();
				getHasFacility().addAll((Collection<? extends Hotel_Facility>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEE:
				getEmployee().clear();
				getEmployee().addAll((Collection<? extends Hotel_Staff>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				setName((String)newValue);
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
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKING:
				getHasBooking().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_ROOM:
				getHasRoom().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_FACILITY:
				getHasFacility().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEE:
				getEmployee().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				setName(NAME_EDEFAULT);
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
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKING:
				return hasBooking != null && !hasBooking.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_ROOM:
				return hasRoom != null && !hasRoom.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_FACILITY:
				return hasFacility != null && !hasFacility.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEE:
				return employee != null && !employee.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
