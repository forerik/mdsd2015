/**
 */
package ClassDiagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Company#getHasHotel <em>Has Hotel</em>}</li>
 *   <li>{@link ClassDiagram.Company#getHasGuest <em>Has Guest</em>}</li>
 *   <li>{@link ClassDiagram.Company#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Hotel</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Company_Hotel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Hotel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Hotel</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_HasHotel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Company_Hotel> getHasHotel();

	/**
	 * Returns the value of the '<em><b>Has Guest</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Company_GuestRecord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Guest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Guest</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_HasGuest()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Company_GuestRecord> getHasGuest();

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
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ClassDiagram.Company#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Company
