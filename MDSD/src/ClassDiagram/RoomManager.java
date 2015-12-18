/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.RoomManager#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getRoomManager()
 * @model
 * @generated
 */
public interface RoomManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Hotel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hotel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hotel</em>' reference.
	 * @see #setHotel(Company_Hotel)
	 * @see ClassDiagram.ClassDiagramPackage#getRoomManager_Hotel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company_Hotel getHotel();

	/**
	 * Sets the value of the '{@link ClassDiagram.RoomManager#getHotel <em>Hotel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hotel</em>' reference.
	 * @see #getHotel()
	 * @generated
	 */
	void setHotel(Company_Hotel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model roomNumberRequired="true" roomNumberOrdered="false"
	 * @generated NOT
	 */
	Hotel_Room findRoom(int roomNumber);

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
