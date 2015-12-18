/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.FacilityAdministration#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getFacilityAdministration()
 * @model
 * @generated
 */
public interface FacilityAdministration extends EObject {
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
	 * @see ClassDiagram.ClassDiagramPackage#getFacilityAdministration_Hotel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company_Hotel getHotel();

	/**
	 * Sets the value of the '{@link ClassDiagram.FacilityAdministration#getHotel <em>Hotel</em>}' reference.
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
	 * @model nameRequired="true" nameOrdered="false" facilityTypeRequired="true" facilityTypeOrdered="false"
	 * @generated
	 */
	void addFacility(String name, Facility_FacilityType facilityType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityRequired="true" facilityOrdered="false"
	 * @generated
	 */
	void editFacility(Hotel_Facility facility);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void addFacilityType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityRequired="true" facilityOrdered="false"
	 * @generated
	 */
	void editFacilityType(Facility_FacilityType facility);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityRequired="true" facilityOrdered="false"
	 * @generated
	 */
	void removeFacility(Hotel_Facility facility);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityRequired="true" facilityOrdered="false"
	 * @generated
	 */
	void removeFacilityType(Facility_FacilityType facility);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityRequired="true" facilityOrdered="false" nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addService(Facility_FacilityType facility, String name, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void editService(Facility_FacilityService service);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void removeService(Facility_FacilityService service);

} // FacilityAdministration
