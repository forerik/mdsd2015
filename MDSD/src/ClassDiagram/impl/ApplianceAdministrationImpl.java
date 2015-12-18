/**
 */
package ClassDiagram.impl;

import ClassDiagram.ApplianceAdministration;
import ClassDiagram.ApplianceType_ApplianceService;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_Hotel;
import ClassDiagram.Hotel_Room;
import ClassDiagram.RoomAppliance_ApplianceType;
import ClassDiagram.Room_RoomAppliance;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appliance Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.ApplianceAdministrationImpl#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplianceAdministrationImpl extends MinimalEObjectImpl.Container implements ApplianceAdministration {
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
	protected ApplianceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.APPLIANCE_ADMINISTRATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.APPLIANCE_ADMINISTRATION__HOTEL, oldHotel, hotel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.APPLIANCE_ADMINISTRATION__HOTEL, oldHotel, hotel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAppliance(Hotel_Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAppliance(Room_RoomAppliance appliance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addApplianceType(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editApplianceType(RoomAppliance_ApplianceType applianceType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeApplianceType(RoomAppliance_ApplianceType applianceType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editAppliance(Room_RoomAppliance appliance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addApplianceService(ApplianceType_ApplianceService applianceService) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editApplianceService(ApplianceType_ApplianceService applianceService) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeApplianceServer(ApplianceType_ApplianceService applianceService) {
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
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION__HOTEL:
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
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION__HOTEL:
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
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION__HOTEL:
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
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION__HOTEL:
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
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM:
				addAppliance((Hotel_Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE:
				removeAppliance((Room_RoomAppliance)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING:
				addApplianceType((String)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE:
				editApplianceType((RoomAppliance_ApplianceType)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE:
				removeApplianceType((RoomAppliance_ApplianceType)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE:
				editAppliance((Room_RoomAppliance)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE:
				addApplianceService((ApplianceType_ApplianceService)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE:
				editApplianceService((ApplianceType_ApplianceService)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVER__APPLIANCETYPE_APPLIANCESERVICE:
				removeApplianceServer((ApplianceType_ApplianceService)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApplianceAdministrationImpl
