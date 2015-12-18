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
 *   <li>{@link ClassDiagram.Company#getOwns <em>Owns</em>}</li>
 *   <li>{@link ClassDiagram.Company#getRecordsOf <em>Records Of</em>}</li>
 *   <li>{@link ClassDiagram.Company#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends EObject {
	/**
	 * Returns the value of the '<em><b>Owns</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Company_Hotel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_Owns()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Company_Hotel> getOwns();

	/**
	 * Returns the value of the '<em><b>Records Of</b></em>' reference list.
	 * The list contents are of type {@link ClassDiagram.Company_GuestRecord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records Of</em>' reference list.
	 * @see ClassDiagram.ClassDiagramPackage#getCompany_RecordsOf()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Company_GuestRecord> getRecordsOf();

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
