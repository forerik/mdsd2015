/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Booked Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Booking_BookedService#getDate <em>Date</em>}</li>
 *   <li>{@link ClassDiagram.Booking_BookedService#getFacilityService <em>Facility Service</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBooking_BookedService()
 * @model
 * @generated
 */
public interface Booking_BookedService extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getBooking_BookedService_Date()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link ClassDiagram.Booking_BookedService#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Facility Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Service</em>' reference.
	 * @see #setFacilityService(Facility_FacilityService)
	 * @see ClassDiagram.ClassDiagramPackage#getBooking_BookedService_FacilityService()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Facility_FacilityService getFacilityService();

	/**
	 * Sets the value of the '{@link ClassDiagram.Booking_BookedService#getFacilityService <em>Facility Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Service</em>' reference.
	 * @see #getFacilityService()
	 * @generated
	 */
	void setFacilityService(Facility_FacilityService value);

} // Booking_BookedService
