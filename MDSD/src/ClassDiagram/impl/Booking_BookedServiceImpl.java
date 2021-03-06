/**
 */
package ClassDiagram.impl;

import ClassDiagram.Booking_BookedService;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Facility_FacilityService;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Booked Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Booking_BookedServiceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.Booking_BookedServiceImpl#getFacilityService <em>Facility Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Booking_BookedServiceImpl extends MinimalEObjectImpl.Container implements Booking_BookedService {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFacilityService() <em>Facility Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityService()
	 * @generated
	 * @ordered
	 */
	protected Facility_FacilityService facilityService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Booking_BookedServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.BOOKING_BOOKED_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOKING_BOOKED_SERVICE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility_FacilityService getFacilityService() {
		if (facilityService != null && facilityService.eIsProxy()) {
			InternalEObject oldFacilityService = (InternalEObject)facilityService;
			facilityService = (Facility_FacilityService)eResolveProxy(oldFacilityService);
			if (facilityService != oldFacilityService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.BOOKING_BOOKED_SERVICE__FACILITY_SERVICE, oldFacilityService, facilityService));
			}
		}
		return facilityService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility_FacilityService basicGetFacilityService() {
		return facilityService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilityService(Facility_FacilityService newFacilityService) {
		Facility_FacilityService oldFacilityService = facilityService;
		facilityService = newFacilityService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.BOOKING_BOOKED_SERVICE__FACILITY_SERVICE, oldFacilityService, facilityService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__DATE:
				return getDate();
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__FACILITY_SERVICE:
				if (resolve) return getFacilityService();
				return basicGetFacilityService();
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
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__DATE:
				setDate((Date)newValue);
				return;
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__FACILITY_SERVICE:
				setFacilityService((Facility_FacilityService)newValue);
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
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__FACILITY_SERVICE:
				setFacilityService((Facility_FacilityService)null);
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
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ClassDiagramPackage.BOOKING_BOOKED_SERVICE__FACILITY_SERVICE:
				return facilityService != null;
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
		result.append(" (date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //Booking_BookedServiceImpl
