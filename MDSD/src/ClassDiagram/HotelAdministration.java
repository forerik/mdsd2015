/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.HotelAdministration#getCompany <em>Company</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getHotelAdministration()
 * @model
 * @generated
 */
public interface HotelAdministration extends EObject {
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
	 * @see ClassDiagram.ClassDiagramPackage#getHotelAdministration_Company()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company getCompany();

	/**
	 * Sets the value of the '{@link ClassDiagram.HotelAdministration#getCompany <em>Company</em>}' reference.
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
	 * @model nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	void addHotel(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model hotelRequired="true" hotelOrdered="false"
	 * @generated
	 */
	void editHotel(Company_Hotel hotel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model hotelRequired="true" hotelOrdered="false"
	 * @generated
	 */
	void removeHotel(Company_Hotel hotel);

} // HotelAdministration
