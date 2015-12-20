/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_Hotel;
import ClassDiagram.Hotel_Room;
import ClassDiagram.RoomManager;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.RoomManagerImpl#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomManagerImpl extends MinimalEObjectImpl.Container implements RoomManager {
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
	protected RoomManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ROOM_MANAGER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ROOM_MANAGER__HOTEL, oldHotel, hotel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_MANAGER__HOTEL, oldHotel, hotel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Hotel_Room findRoom(int roomNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		for (Hotel_Room room : hotel.getListOfRooms()) {
			if (room.getRoomNumber() == roomNumber)
				return room;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean roomExists(EList<Hotel_Room> rooms, int roomNumber) {
		
		for (Hotel_Room room : rooms) {
			if (room.getRoomNumber() == roomNumber) {
				return true;
			}
		}
		
		return false;
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cleaningStatus(Hotel_Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void maintenanceStatus(Hotel_Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomsToClean() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomsToMaintain() {
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
			case ClassDiagramPackage.ROOM_MANAGER__HOTEL:
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
			case ClassDiagramPackage.ROOM_MANAGER__HOTEL:
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
			case ClassDiagramPackage.ROOM_MANAGER__HOTEL:
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
			case ClassDiagramPackage.ROOM_MANAGER__HOTEL:
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.ROOM_MANAGER___FIND_ROOM__INT:
				findRoom((Integer)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_MANAGER___CLEANING_STATUS__HOTEL_ROOM:
				cleaningStatus((Hotel_Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_MANAGER___MAINTENANCE_STATUS__HOTEL_ROOM:
				maintenanceStatus((Hotel_Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_MANAGER___GET_ROOMS_TO_CLEAN:
				getRoomsToClean();
				return null;
			case ClassDiagramPackage.ROOM_MANAGER___GET_ROOMS_TO_MAINTAIN:
				getRoomsToMaintain();
				return null;
			case ClassDiagramPackage.ROOM_MANAGER___ROOM_EXISTS__ELIST_INT:
				roomExists((EList<Hotel_Room>)arguments.get(0), (Integer)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomManagerImpl
