/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IHotel Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ClassDiagram.ClassDiagramPackage#getIHotelAdministration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IHotelAdministration extends EObject {
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

} // IHotelAdministration
