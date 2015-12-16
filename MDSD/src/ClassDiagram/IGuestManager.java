/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IGuest Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIGuestManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IGuestManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" adressRequired="true" adressOrdered="false" phoneNumberRequired="true" phoneNumberOrdered="false"
	 * @generated
	 */
	void createGuestRecord(String ssn, String firstName, String lastName, String adress, String phoneNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void editGuestRecord(Company_GuestRecord guest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void removeGuestRecord(Company_GuestRecord guest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void findGuestRecord(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void findGuestRecords(String firstName, String lastName);

} // IGuestManager
