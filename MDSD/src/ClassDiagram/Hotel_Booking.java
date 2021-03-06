/**
 */
package ClassDiagram;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hotel Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Hotel_Booking#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#getIncludes <em>Includes</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#getRooms <em>Rooms</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#getResponsibleGuest <em>Responsible Guest</em>}</li>
 *   <li>{@link ClassDiagram.Hotel_Booking#getBill <em>Bill</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking()
 * @model
 * @generated
 */
public interface Hotel_Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_StartDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Booking#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_EndDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Booking#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

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
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Booking#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In</em>' attribute.
	 * @see #setCheckedIn(boolean)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_CheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedIn();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Booking#isCheckedIn <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked In</em>' attribute.
	 * @see #isCheckedIn()
	 * @generated
	 */
	void setCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_BookingID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Booking#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Booking_BookedService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_Includes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking_BookedService> getIncludes();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Hotel_Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_Rooms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Hotel_Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Responsible Guest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Guest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Guest</em>' reference.
	 * @see #setResponsibleGuest(Company_GuestRecord)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_ResponsibleGuest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company_GuestRecord getResponsibleGuest();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Booking#getResponsibleGuest <em>Responsible Guest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Guest</em>' reference.
	 * @see #getResponsibleGuest()
	 * @generated
	 */
	void setResponsibleGuest(Company_GuestRecord value);

	/**
	 * Returns the value of the '<em><b>Bill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' reference.
	 * @see #setBill(Booking_Bill)
	 * @see ClassDiagram.ClassDiagramPackage#getHotel_Booking_Bill()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Booking_Bill getBill();

	/**
	 * Sets the value of the '{@link ClassDiagram.Hotel_Booking#getBill <em>Bill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill</em>' reference.
	 * @see #getBill()
	 * @generated
	 */
	void setBill(Booking_Bill value);

} // Hotel_Booking
