/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company Hotel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Company_Hotel#getListOfRooms <em>List Of Rooms</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getEmployees <em>Employees</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getListOfBookings <em>List Of Bookings</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel()
 * @model
 * @generated
 */
public interface Company_Hotel extends EObject {
	/**
	 * Returns the value of the '<em><b>List Of Rooms</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Rooms</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_ListOfRooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getListOfRooms();

	/**
	 * Returns the value of the '<em><b>Employees</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Staff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_Employees()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Staff> getEmployees();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Company_Hotel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>List Of Bookings</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Bookings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Bookings</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_ListOfBookings()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Booking> getListOfBookings();

} // Company_Hotel
