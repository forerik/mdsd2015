/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Room;
import ClassDiagram.RoomAdministration;
import ClassDiagram.Room_RoomType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoomAdministrationImpl extends MinimalEObjectImpl.Container implements RoomAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ROOM_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom(int roomNumber, Room_RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(Hotel_Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoom(Hotel_Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createRoomType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRoomType(Room_RoomType roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomType(Room_RoomType roomType) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.ROOM_ADMINISTRATION___ADD_ROOM__INT_ROOM_ROOMTYPE:
				addRoom((Integer)arguments.get(0), (Room_RoomType)arguments.get(1));
				return null;
			case ClassDiagramPackage.ROOM_ADMINISTRATION___REMOVE_ROOM__HOTEL_ROOM:
				removeRoom((Hotel_Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_ADMINISTRATION___EDIT_ROOM__HOTEL_ROOM:
				editRoom((Hotel_Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_ADMINISTRATION___CREATE_ROOM_TYPE:
				createRoomType();
				return null;
			case ClassDiagramPackage.ROOM_ADMINISTRATION___EDIT_ROOM_TYPE__ROOM_ROOMTYPE:
				editRoomType((Room_RoomType)arguments.get(0));
				return null;
			case ClassDiagramPackage.ROOM_ADMINISTRATION___REMOVE_ROOM_TYPE__ROOM_ROOMTYPE:
				removeRoomType((Room_RoomType)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomAdministrationImpl
