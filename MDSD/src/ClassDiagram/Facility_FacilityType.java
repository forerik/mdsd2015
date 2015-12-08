/**
 */
package ClassDiagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Facility Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.Facility_FacilityType#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ClassDiagram.ClassDiagramPackage#getFacility_FacilityType()
 * @model
 * @generated
 */
public interface Facility_FacilityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see ClassDiagram.ClassDiagramPackage#getFacility_FacilityType_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link ClassDiagram.Facility_FacilityType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // Facility_FacilityType
