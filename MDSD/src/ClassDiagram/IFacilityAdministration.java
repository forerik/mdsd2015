/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFacility Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIFacilityAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFacilityAdministration extends EObject {
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
	 * @model facilityRequired="true" facilityOrdered="false"
	 * @generated
	 */
	void removeFacility(Hotel_Facility facility);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kindRequired="true" kindOrdered="false"
	 * @generated
	 */
	void addFacilityType(String kind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityTypeRequired="true" facilityTypeOrdered="false"
	 * @generated
	 */
	void editFacilityType(Facility_FacilityType facilityType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model facilityTypeRequired="true" facilityTypeOrdered="false"
	 * @generated
	 */
	void removeFacilityType(Facility_FacilityType facilityType);

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

} // IFacilityAdministration
