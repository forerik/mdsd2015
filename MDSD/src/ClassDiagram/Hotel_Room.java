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
 *   <li>{@link ClassDiagram.Hotel_Room#getRoomAppliances <em>Room Appliances</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#getHasType <em>Has Type</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#getHasKey <em>Has Key</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#isCleaningStatus <em>Cleaning Status</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Room#isMaintenceStatus <em>Maintence Status</em>}</li>
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
	 * Returns the value of the '<em><b>Room Appliances</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Room_RoomAppliance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Appliances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Appliances</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_RoomAppliances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room_RoomAppliance> getRoomAppliances();

	/**
	 * Returns the value of the '<em><b>Has Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Type</em>' reference.
	 * @see #setHasType(Room_RoomType)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_HasType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room_RoomType getHasType();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Room#getHasType <em>Has Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Type</em>' reference.
	 * @see #getHasType()
	 * @generated
	 */
	void setHasType(Room_RoomType value);

	/**
	 * Returns the value of the '<em><b>Has Key</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Room_RoomKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Room_HasKey()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room_RoomKey> getHasKey();

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

} // Hotel_Room
