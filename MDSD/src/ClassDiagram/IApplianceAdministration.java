/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAppliance Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIApplianceAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IApplianceAdministration extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void addAppliance(Hotel_Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applianceRequired="true" applianceOrdered="false"
	 * @generated
	 */
	void removeAppliance(Room_RoomAppliance appliance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void addApplianceType(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applianceTypeRequired="true" applianceTypeOrdered="false"
	 * @generated
	 */
	void editApplianceType(RoomAppliance_ApplianceType applianceType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applianceTypeRequired="true" applianceTypeOrdered="false"
	 * @generated
	 */
	void removeApplianceType(RoomAppliance_ApplianceType applianceType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applianceRequired="true" applianceOrdered="false"
	 * @generated
	 */
	void editAppliance(Room_RoomAppliance appliance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addApplianceService(String name, double price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void editApplianceService(ApplianceType_ApplianceService service);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void removeApplianceService(ApplianceType_ApplianceService service);

} // IApplianceAdministration
