/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFacility Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIFacilityManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFacilityManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dateRequired="true" dateOrdered="false" facilityServiceRequired="true" facilityServiceOrdered="false"
	 * @generated
	 */
	void findBookedService(Date date, Facility_FacilityService facilityService);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void findBookedServices(Company_GuestRecord guest);

} // IFacilityManager
