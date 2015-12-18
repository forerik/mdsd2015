/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.StaffAdministration#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getStaffAdministration()
 * @model
 * @generated
 */
public interface StaffAdministration extends EObject {
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
	 * @see ClassDiagram.ClassDiagramPackage#getStaffAdministration_Hotel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company_Hotel getHotel();

	/**
	 * Sets the value of the '{@link ClassDiagram.StaffAdministration#getHotel <em>Hotel</em>}' reference.
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
	 * @model firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" ssnRequired="true" ssnOrdered="false" workTitelRequired="true" workTitelOrdered="false"
	 * @generated
	 */
	void addStaff(String firstName, String lastName, String ssn, StaffType workTitel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model staffRequired="true" staffOrdered="false"
	 * @generated
	 */
	void editStaff(Hotel_Staff staff);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model staffRequired="true" staffOrdered="false"
	 * @generated
	 */
	void removeStaff(Hotel_Staff staff);

} // StaffAdministration
