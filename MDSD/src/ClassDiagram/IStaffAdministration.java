/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStaff Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIStaffAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IStaffAdministration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model firstnameRequired="true" firstnameOrdered="false" lastnameRequired="true" lastnameOrdered="false" ssnRequired="true" ssnOrdered="false"
	 * @generated
	 */
	void addStaff(String firstname, String lastname, String ssn);

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

} // IStaffAdministration
