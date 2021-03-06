/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Hotel_Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#getAccessedBy <em>Accessed By</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#isCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#isMaintenceStatus <em>Maintence Status</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#getRoomType <em>Room Type</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room()
 * @model
 * @generated
 */
public interface Hotel_Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Accessed By</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Room_RoomKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessed By</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_AccessedBy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room_RoomKey> getAccessedBy();

	/**
	 * Returns the value of the '<em><b>Cleaning Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cleaning Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cleaning Status</em>' attribute.
	 * @see #setCleaningStatus(boolean)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_CleaningStatus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCleaningStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Room#isCleaningStatus <em>Cleaning Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleaning Status</em>' attribute.
	 * @see #isCleaningStatus()
	 * @generated
	 */
	void setCleaningStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Maintence Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintence Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintence Status</em>' attribute.
	 * @see #setMaintenceStatus(boolean)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_MaintenceStatus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isMaintenceStatus();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Room#isMaintenceStatus <em>Maintence Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintence Status</em>' attribute.
	 * @see #isMaintenceStatus()
	 * @generated
	 */
	void setMaintenceStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(Room_RoomType)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room_RoomType getRoomType();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(Room_RoomType value);

} // Hotel_Room
