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
 *   <li>{@link ClassDiagram.Company_Hotel#getHasBooking <em>Has Booking</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getHasRoom <em>Has Room</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getHasFacility <em>Has Facility</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getEmployee <em>Employee</em>}</li>
 *   <li>{@link ClassDiagram.Company_Hotel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel()
 * @model
 * @generated
 */
public interface Company_Hotel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Booking</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Booking</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_HasBooking()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Booking> getHasBooking();

	/**
	 * Returns the value of the '<em><b>Has Room</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Room</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Room</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_HasRoom()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getHasRoom();

	/**
	 * Returns the value of the '<em><b>Has Facility</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Facility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Facility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Facility</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_HasFacility()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Facility> getHasFacility();

	/**
	 * Returns the value of the '<em><b>Employee</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Staff}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employee</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Hotel_Employee()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Hotel_Staff> getEmployee();

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

} // Company_Hotel
