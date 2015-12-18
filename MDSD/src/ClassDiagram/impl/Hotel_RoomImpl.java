/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Room;
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
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#getAccessedBy <em>Accessed By</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#isCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#isMaintenceStatus <em>Maintence Status</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_RoomImpl#getRoomType <em>Room Type</em>}</li>
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
	 * The cached value of the '{@link #getAccessedBy() <em>Accessed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Room_RoomKey> accessedBy;

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
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected Room_RoomType roomType;

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
	public EList<Room_RoomKey> getAccessedBy() {
		if (accessedBy == null) {
			accessedBy = new EObjectResolvingEList<Room_RoomKey>(Room_RoomKey.class, this, ClassDiagramPackage.HOTEL_ROOM__ACCESSED_BY);
		}
		return accessedBy;
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
	public Room_RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (Room_RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.HOTEL_ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room_RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(Room_RoomType newRoomType) {
		Room_RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_ROOM__ROOM_TYPE, oldRoomType, roomType));
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
			case ClassDiagramPackage.HOTEL_ROOM__ACCESSED_BY:
				return getAccessedBy();
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				return isCleaningStatus();
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				return isMaintenceStatus();
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
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
			case ClassDiagramPackage.HOTEL_ROOM__ACCESSED_BY:
				getAccessedBy().clear();
				getAccessedBy().addAll((Collection<? extends Room_RoomKey>)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				setCleaningStatus((Boolean)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				setMaintenceStatus((Boolean)newValue);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_TYPE:
				setRoomType((Room_RoomType)newValue);
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
			case ClassDiagramPackage.HOTEL_ROOM__ACCESSED_BY:
				getAccessedBy().clear();
				return;
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				setCleaningStatus(CLEANING_STATUS_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				setMaintenceStatus(MAINTENCE_STATUS_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_TYPE:
				setRoomType((Room_RoomType)null);
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
			case ClassDiagramPackage.HOTEL_ROOM__ACCESSED_BY:
				return accessedBy != null && !accessedBy.isEmpty();
			case ClassDiagramPackage.HOTEL_ROOM__CLEANING_STATUS:
				return cleaningStatus != CLEANING_STATUS_EDEFAULT;
			case ClassDiagramPackage.HOTEL_ROOM__MAINTENCE_STATUS:
				return maintenceStatus != MAINTENCE_STATUS_EDEFAULT;
			case ClassDiagramPackage.HOTEL_ROOM__ROOM_TYPE:
				return roomType != null;
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
