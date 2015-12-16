/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Staff;
import ClassDiagram.StaffAdministration;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StaffAdministrationImpl extends MinimalEObjectImpl.Container implements StaffAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.STAFF_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addStaff(String firstname, String lastname, String ssn) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editStaff(Hotel_Staff staff) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeStaff(Hotel_Staff staff) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassDiagramPackage.STAFF_ADMINISTRATION___ADD_STAFF__STRING_STRING_STRING:
				addStaff((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case ClassDiagramPackage.STAFF_ADMINISTRATION___EDIT_STAFF__HOTEL_STAFF:
				editStaff((Hotel_Staff)arguments.get(0));
				return null;
			case ClassDiagramPackage.STAFF_ADMINISTRATION___REMOVE_STAFF__HOTEL_STAFF:
				removeStaff((Hotel_Staff)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffAdministrationImpl
