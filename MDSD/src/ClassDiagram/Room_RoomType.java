/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Room Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Room_RoomType#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.Room_RoomType#getMaxNumberOfGuests <em>Max Number Of Guests</em>}</li>
 *   <li>{@link ClassDiagram.Room_RoomType#getArea <em>Area</em>}</li>
 *   <li>{@link ClassDiagram.Room_RoomType#getApplianceType <em>Appliance Type</em>}</li>
 *   <li>{@link ClassDiagram.Room_RoomType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomType()
 * @model
 * @generated
 */
public interface Room_RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomType_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room_RoomType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Number Of Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Guests</em>' attribute.
	 * @see #setMaxNumberOfGuests(int)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomType_MaxNumberOfGuests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMaxNumberOfGuests();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room_RoomType#getMaxNumberOfGuests <em>Max Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Guests</em>' attribute.
	 * @see #getMaxNumberOfGuests()
	 * @generated
	 */
	void setMaxNumberOfGuests(int value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(double)
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomType_Area()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getArea();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room_RoomType#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(double value);

	/**
	 * Returns the value of the '<em><b>Appliance Type</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.RoomAppliance_ApplianceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appliance Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appliance Type</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomType_ApplianceType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomAppliance_ApplianceType> getApplianceType();

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
	 * @see ClassDiagram.ClassDiagramPackage#getRoom_RoomType_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Room_RoomType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Room_RoomType
