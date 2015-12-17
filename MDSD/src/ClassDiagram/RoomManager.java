/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getRoomManager()
 * @model
 * @generated
 */
public interface RoomManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated
	 */
	void findRoom(int roomNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void cleaningStatus(Hotel_Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void maintenanceStatus(Hotel_Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getRoomsToClean();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getRoomsToMaintain();

} // RoomManager
