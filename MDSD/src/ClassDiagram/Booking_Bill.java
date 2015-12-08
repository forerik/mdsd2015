/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Booking_Bill#getPaidAmount <em>Paid Amount</em>}</li>
 *   <li>{@link ClassDiagram.Booking_Bill#getHasPurchaseditem <em>Has Purchaseditem</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getBooking_Bill()
 * @model
 * @generated
 */
public interface Booking_Bill extends EObject {
	/**
	 * Returns the value of the '<em><b>Paid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid Amount</em>' attribute.
	 * @see #setPaidAmount(double)
	 * @see ClassDiagram.ClassDiagramPackage#getBooking_Bill_PaidAmount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getPaidAmount();

	/**
	 * Sets the value of the '{@link ClassDiagram.Booking_Bill#getPaidAmount <em>Paid Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Amount</em>' attribute.
	 * @see #getPaidAmount()
	 * @generated
	 */
	void setPaidAmount(double value);

	/**
	 * Returns the value of the '<em><b>Has Purchaseditem</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Booking_PurchasedService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Purchaseditem</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Purchaseditem</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getBooking_Bill_HasPurchaseditem()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking_PurchasedService> getHasPurchaseditem();

} // Booking_Bill
