/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Hotel_Staff#getSsn <em>Ssn</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Staff#getFirstName <em>First Name</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Staff#getLastName <em>Last Name</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Staff#getHasWorkTitel <em>Has Work Titel</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getHotel_Staff()
 * @model
 * @generated
 */
public interface Hotel_Staff extends EObject {
	/**
	 * Returns the value of the '<em><b>Ssn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssn</em>' attribute.
	 * @see #setSsn(String)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Staff_Ssn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSsn();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Staff#getSsn <em>Ssn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssn</em>' attribute.
	 * @see #getSsn()
	 * @generated
	 */
	void setSsn(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Staff_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Staff#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Staff_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Staff#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Has Work Titel</b></em>' attribute.
	 * The literals are from the enumeration {@link ClassDiagram.StaffType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Work Titel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Work Titel</em>' attribute.
	 * @see ClassDiagram.StaffType
	 * @see #setHasWorkTitel(StaffType)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Staff_HasWorkTitel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffType getHasWorkTitel();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Staff#getHasWorkTitel <em>Has Work Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Work Titel</em>' attribute.
	 * @see ClassDiagram.StaffType
	 * @see #getHasWorkTitel()
	 * @generated
	 */
	void setHasWorkTitel(StaffType value);

} // Hotel_Staff
