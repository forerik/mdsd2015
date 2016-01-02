/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.GuestManager#getCompany <em>Company</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getGuestManager()
 * @model
 * @generated
 */
public interface GuestManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Company</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company</em>' reference.
	 * @see #setCompany(Company)
	 * @see ClassDiagram.ClassDiagramPackage#getGuestManager_Company()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company getCompany();

	/**
	 * Sets the value of the '{@link ClassDiagram.GuestManager#getCompany <em>Company</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company</em>' reference.
	 * @see #getCompany()
	 * @generated
	 */
	void setCompany(Company value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" adressRequired="true" adressOrdered="false" phoneNumberRequired="true" phoneNumberOrdered="false" paymentInformationRequired="true" paymentInformationOrdered="false"
	 * @generated
	 */
	void createGuestRecord(String ssn, String firstName, String lastName, String adress, String phoneNumber, String paymentInformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void editGuestRecord(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void removeGuestRecord(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model ssnRequired="true" ssnOrdered="false"
	 * @generated NOT
	 */
	Company_GuestRecord findGuestRecord(String ssn);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void findGuestRecords(String firstName, String lastName);

} // GuestManager
