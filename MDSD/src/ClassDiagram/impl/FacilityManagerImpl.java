/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Company_Hotel;
import ClassDiagram.FacilityManager;
import ClassDiagram.Hotel_Facility;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.FacilityManagerImpl#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacilityManagerImpl extends MinimalEObjectImpl.Container implements FacilityManager {
	/**
	 * The cached value of the '{@link #getHotel() <em>Hotel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotel()
	 * @generated
	 * @ordered
	 */
	protected Company_Hotel hotel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.FACILITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company_Hotel getHotel() {
		if (hotel != null && hotel.eIsProxy()) {
			InternalEObject oldHotel = (InternalEObject)hotel;
			hotel = (Company_Hotel)eResolveProxy(oldHotel);
			if (hotel != oldHotel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.FACILITY_MANAGER__HOTEL, oldHotel, hotel));
			}
		}
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company_Hotel basicGetHotel() {
		return hotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotel(Company_Hotel newHotel) {
		Company_Hotel oldHotel = hotel;
		hotel = newHotel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.FACILITY_MANAGER__HOTEL, oldHotel, hotel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findServices(Date start, Hotel_Facility facility, Date end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findServices(Date date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBookedServices(Company_GuestRecord guest) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.FACILITY_MANAGER__HOTEL:
				if (resolve) return getHotel();
				return basicGetHotel();
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
			case ClassDiagramPackage.FACILITY_MANAGER__HOTEL:
				setHotel((Company_Hotel)newValue);
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
			case ClassDiagramPackage.FACILITY_MANAGER__HOTEL:
				setHotel((Company_Hotel)null);
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
			case ClassDiagramPackage.FACILITY_MANAGER__HOTEL:
				return hotel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.FACILITY_MANAGER___FIND_SERVICES__DATE_HOTEL_FACILITY_DATE:
				findServices((Date)arguments.get(0), (Hotel_Facility)arguments.get(1), (Date)arguments.get(2));
				return null;
			case ClassDiagramPackage.FACILITY_MANAGER___FIND_SERVICES__DATE:
				findServices((Date)arguments.get(0));
				return null;
			case ClassDiagramPackage.FACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD:
				findBookedServices((Company_GuestRecord)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FacilityManagerImpl
