/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

import ClassDiagram.impl.Booking_BillImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.BillManager#getHotel <em>Hotel</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBillManager()
 * @model
 * @generated
 */
public interface BillManager extends EObject {
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
	 * @see ClassDiagram.ClassDiagramPackage#getBillManager_Hotel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Company_Hotel getHotel();

	/**
	 * Sets the value of the '{@link ClassDiagram.BillManager#getHotel <em>Hotel</em>}' reference.
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
	 * @model bookingIDRequired="true" bookingIDOrdered="false" itemRequired="true" itemOrdered="false" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	void addPurchasedService(String bookingID, String item, double amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated NOT
	 */
	Booking_Bill findBill(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void createReceipt(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	double getAmount(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDRequired="true" bookingIDOrdered="false" amountRequired="true" amountOrdered="false"
	 * @generated NOT
	 */
	void pay(int bookingID, double amount);

} // BillManager
