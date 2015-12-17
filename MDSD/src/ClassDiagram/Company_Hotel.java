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
 *   <li>{@link ClassDiagram.Company_Hotel#getConsistsOfRooms <em>Consists Of Rooms</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getConsistsOfFacilities <em>Consists Of Facilities</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getEmployees <em>Employees</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getBookingmanager <em>Bookingmanager</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel()
 * @model
 * @generated
 */
public interface Company_Hotel extends EObject {
	/**
	 * Returns the value of the '<em><b>Consists Of Rooms</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of Rooms</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_ConsistsOfRooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getConsistsOfRooms();

	/**
	 * Returns the value of the '<em><b>Consists Of Facilities</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Facility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consists Of Facilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of Facilities</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_ConsistsOfFacilities()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Facility> getConsistsOfFacilities();

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
	 * Returns the value of the '<em><b>Bookingmanager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookingmanager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookingmanager</em>' reference.
	 * @see #setBookingmanager(BookingManager)
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_Bookingmanager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BookingManager getBookingmanager();

	/**
	 * Sets the value of the '{@link ClassDiagram.Company_Hotel#getBookingmanager <em>Bookingmanager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookingmanager</em>' reference.
	 * @see #getBookingmanager()
	 * @generated
	 */
	void setBookingmanager(BookingManager value);

} // Company_Hotel
