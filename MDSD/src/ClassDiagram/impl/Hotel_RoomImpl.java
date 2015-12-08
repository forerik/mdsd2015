/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Room;
import ClassDiagram.Room_RoomAppliance;
import ClassDiagram.Room_RoomKey;
import ClassDiagram.Room_RoomType;

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
 * An implementation of the model object '<em><b>Hotel Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#getRoomAppliances <em>Room Appliances</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#getHasType <em>Has Type</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#getHasKey <em>Has Key</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#isCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#isMaintenceStatus <em>Maintence Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Hotel_RoomImpl extends MinimalEObjectImpl.Container implements Hotel_Room {
	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomAppliances() <em>Room Appliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomAppliances()
	 * @generated
	 * @ordered
	 */
	protected EList<Room_RoomAppliance> roomAppliances;

	/**
	 * The cached value of the '{@link #getHasType() <em>Has Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasType()
	 * @generated
	 * @ordered
	 */
	protected Room_RoomType hasType;

	/**
	 * The cached value of the '{@link #getHasKey() <em>Has Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Room_RoomKey> hasKey;

	/**
	 * The default value of the '{@link #isCleaningStatus() <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleaningStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEANING_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCleaningStatus() <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleaningStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean cleaningStatus = CLEANING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaintenceStatus() <em>Maintence Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaintenceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAINTENCE_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaintenceStatus() <em>Maintence Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaintenceStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean maintenceStatus = MAINTENCE_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.HOTEL_ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room_RoomAppliance> getRoomAppliances() {
		if (roomAppliances == null) {
			roomAppliances = new EObjectResolvingEList<Room_RoomAppliance>(Room_RoomAppliance.class, this, ClassDiagramPackage.HOTEL_ROOM__ROOM_APPLIANCES);
		}
		return roomAppliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room_RoomType getHasType() {
		if (hasType != null && hasType.eIsProxy()) {
			InternalEObject oldHasType = (InternalEObject)hasType;
			hasType = (Room_RoomType)eResolveProxy(oldHasType);
			if (hasType != oldHasType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.HOTEL_ROOM__HAS_TYPE, oldHasType, hasType));
			}
		}
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room_RoomType basicGetHasType() {
		return hasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasType(Room_RoomType newHasType) {
		Room_RoomType oldHasType = hasType;
		hasType = newHasType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_ROOM__HAS_TYPE, oldHasType, hasType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room_RoomKey> getHasKey() {
		if (hasKey == null) {
			hasKey = new EObjectResolvingEList<Room_RoomKey>(Room_RoomKey.class, this, ClassDiagramPackage.HOTEL_ROOM__HAS_KEY);
		}
		return hasKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleaningStatus() {
		return cleaningStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleaningStatus(boolean newCleaningStatus) {
		boolean oldCleaningStatus = cleaningStatus;
		cleaningStatus = newCleaningStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS, oldCleaningStatus, cleaningStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaintenceStatus() {
		return maintenceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintenceStatus(boolean newMaintenceStatus) {
		boolean oldMaintenceStatus = maintenceStatus;
		maintenceStatus = newMaintenceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS, oldMaintenceStatus, maintenceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_APPLIANCES:
				return getRoomAppliances();
			case ClassDiagramPackage.HOTEL_ROOM__HAS_TYPE:
				if (resolve) return getHasType();
				return basicGetHasType();
			case ClassDiagramPackage.HOTEL_ROOM__HAS_KEY:
				return getHasKey();
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				return isCleaningStatus();
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				return isMaintenceStatus();
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
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_APPLIANCES:
				getRoomAppliances().clear();
				getRoomAppliances().addAll((Collection<? extends Room_RoomAppliance>)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__HAS_TYPE:
				setHasType((Room_RoomType)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__HAS_KEY:
				getHasKey().clear();
				getHasKey().addAll((Collection<? extends Room_RoomKey>)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				setCleaningStatus((Boolean)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				setMaintenceStatus((Boolean)newValue);
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
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_APPLIANCES:
				getRoomAppliances().clear();
				return;
			case ClassDiagramPackage.HOTEL_ROOM__HAS_TYPE:
				setHasType((Room_RoomType)null);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__HAS_KEY:
				getHasKey().clear();
				return;
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				setCleaningStatus(CLEANING_STATUS_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				setMaintenceStatus(MAINTENCE_STATUS_EDEFAULT);
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
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_APPLIANCES:
				return roomAppliances != null && !roomAppliances.isEmpty();
			case ClassDiagramPackage.HOTEL_ROOM__HAS_TYPE:
				return hasType != null;
			case ClassDiagramPackage.HOTEL_ROOM__HAS_KEY:
				return hasKey != null && !hasKey.isEmpty();
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				return cleaningStatus != CLEANING_STATUS_EDEFAULT;
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				return maintenceStatus != MAINTENCE_STATUS_EDEFAULT;
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
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", cleaningStatus: ");
		result.append(cleaningStatus);
		result.append(", maintenceStatus: ");
		result.append(maintenceStatus);
		result.append(')');
		return result.toString();
	}

} //Hotel_RoomImpl
