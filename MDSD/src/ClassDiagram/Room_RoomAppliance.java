/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Room Appliance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Room_RoomAppliance#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.Room_RoomAppliance#getApplianceType <em>Appliance Type</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomAppliance()
 * @model
 * @generated
 */
public interface Room_RoomAppliance extends EObject {
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
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomAppliance_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room_RoomAppliance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Appliance Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appliance Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appliance Type</em>' reference.
	 * @see #setApplianceType(RoomAppliance_ApplianceType)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomAppliance_ApplianceType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomAppliance_ApplianceType getApplianceType();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room_RoomAppliance#getApplianceType <em>Appliance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appliance Type</em>' reference.
	 * @see #getApplianceType()
	 * @generated
	 */
	void setApplianceType(RoomAppliance_ApplianceType value);

} // Room_RoomAppliance
