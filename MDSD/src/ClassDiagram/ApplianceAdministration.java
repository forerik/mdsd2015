/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appliance Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.ApplianceAdministration#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getApplianceAdministration()
 * @model
 * @generated
 */
public interface ApplianceAdministration extends EObject {
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
	 * @see ClassDiagram.ClassDiagramPackage#getApplianceAdministration_Hotel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company_Hotel getHotel();

	/**
	 * Sets the value of the '{@link ClassDiagram.ApplianceAdministration#getHotel <em>Hotel</em>}' reference.
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
	 * @model applianceServiceRequired="true" applianceServiceOrdered="false"
	 * @generated
	 */
	void addApplianceService(ApplianceType_ApplianceService applianceService);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applianceServiceRequired="true" applianceServiceOrdered="false"
	 * @generated
	 */
	void editApplianceService(ApplianceType_ApplianceService applianceService);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model applianceServiceRequired="true" applianceServiceOrdered="false"
	 * @generated
	 */
	void removeApplianceServer(ApplianceType_ApplianceService applianceService);

} // ApplianceAdministration
