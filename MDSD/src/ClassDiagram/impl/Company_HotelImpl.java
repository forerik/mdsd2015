/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_Hotel;
import ClassDiagram.Hotel_Booking;
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
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getHasBookings <em>Has Bookings</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getEmployees <em>Employees</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_HotelImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Company_HotelImpl extends MinimalEObjectImpl.Container implements Company_Hotel {
	/**
	 * The cached value of the '{@link #getHasBookings() <em>Has Bookings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Booking> hasBookings;

	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Hotel_Room> consistsOf;

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
	public EList<Hotel_Booking> getHasBookings() {
		if (hasBookings == null) {
			hasBookings = new EObjectResolvingEList<Hotel_Booking>(Hotel_Booking.class, this, ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKINGS);
		}
		return hasBookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hotel_Room> getConsistsOf() {
		if (consistsOf == null) {
			consistsOf = new EObjectResolvingEList<Hotel_Room>(Hotel_Room.class, this, ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF);
		}
		return consistsOf;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKINGS:
				return getHasBookings();
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF:
				return getConsistsOf();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				return getEmployees();
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
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKINGS:
				getHasBookings().clear();
				getHasBookings().addAll((Collection<? extends Hotel_Booking>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF:
				getConsistsOf().clear();
				getConsistsOf().addAll((Collection<? extends Hotel_Room>)newValue);
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				getEmployees().clear();
				getEmployees().addAll((Collection<? extends Hotel_Staff>)newValue);
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
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKINGS:
				getHasBookings().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF:
				getConsistsOf().clear();
				return;
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				getEmployees().clear();
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
			case ClassDiagramPackage.COMPANY_HOTEL__HAS_BOOKINGS:
				return hasBookings != null && !hasBookings.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__CONSISTS_OF:
				return consistsOf != null && !consistsOf.isEmpty();
			case ClassDiagramPackage.COMPANY_HOTEL__EMPLOYEES:
				return employees != null && !employees.isEmpty();
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
