/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Staff;
import ClassDiagram.StaffType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Hotel_StaffImpl#getSsn <em>Ssn</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_StaffImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_StaffImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_StaffImpl#getStafftype <em>Stafftype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Hotel_StaffImpl extends MinimalEObjectImpl.Container implements Hotel_Staff {
	/**
	 * The default value of the '{@link #getSsn() <em>Ssn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsn()
	 * @generated
	 * @ordered
	 */
	protected static final String SSN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsn() <em>Ssn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsn()
	 * @generated
	 * @ordered
	 */
	protected String ssn = SSN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStafftype() <em>Stafftype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStafftype()
	 * @generated
	 * @ordered
	 */
	protected static final StaffType STAFFTYPE_EDEFAULT = StaffType.MANAGER;

	/**
	 * The cached value of the '{@link #getStafftype() <em>Stafftype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStafftype()
	 * @generated
	 * @ordered
	 */
	protected StaffType stafftype = STAFFTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.HOTEL_STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsn(String newSsn) {
		String oldSsn = ssn;
		ssn = newSsn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_STAFF__SSN, oldSsn, ssn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_STAFF__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_STAFF__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffType getStafftype() {
		return stafftype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStafftype(StaffType newStafftype) {
		StaffType oldStafftype = stafftype;
		stafftype = newStafftype == null ? STAFFTYPE_EDEFAULT : newStafftype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_STAFF__STAFFTYPE, oldStafftype, stafftype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.HOTEL_STAFF__SSN:
				return getSsn();
			case ClassDiagramPackage.HOTEL_STAFF__FIRST_NAME:
				return getFirstName();
			case ClassDiagramPackage.HOTEL_STAFF__LAST_NAME:
				return getLastName();
			case ClassDiagramPackage.HOTEL_STAFF__STAFFTYPE:
				return getStafftype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.HOTEL_STAFF__SSN:
				setSsn((String)newValue);
				return;
			case ClassDiagramPackage.HOTEL_STAFF__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ClassDiagramPackage.HOTEL_STAFF__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ClassDiagramPackage.HOTEL_STAFF__STAFFTYPE:
				setStafftype((StaffType)newValue);
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
			case ClassDiagramPackage.HOTEL_STAFF__SSN:
				setSsn(SSN_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_STAFF__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_STAFF__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_STAFF__STAFFTYPE:
				setStafftype(STAFFTYPE_EDEFAULT);
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
			case ClassDiagramPackage.HOTEL_STAFF__SSN:
				return SSN_EDEFAULT == null ? ssn != null : !SSN_EDEFAULT.equals(ssn);
			case ClassDiagramPackage.HOTEL_STAFF__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ClassDiagramPackage.HOTEL_STAFF__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ClassDiagramPackage.HOTEL_STAFF__STAFFTYPE:
				return stafftype != STAFFTYPE_EDEFAULT;
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
		result.append(" (ssn: ");
		result.append(ssn);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", stafftype: ");
		result.append(stafftype);
		result.append(')');
		return result.toString();
	}

} //Hotel_StaffImpl
