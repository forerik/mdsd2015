/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.FacilityAdministration;
import ClassDiagram.Facility_FacilityService;
import ClassDiagram.Facility_FacilityType;
import ClassDiagram.Hotel_Facility;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FacilityAdministrationImpl extends MinimalEObjectImpl.Container implements FacilityAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.FACILITY_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFacility(String name, Facility_FacilityType facilityType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editFacility(Hotel_Facility facility) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFacility(Hotel_Facility facility) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFacilityType(String kind) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editFacilityType(Facility_FacilityType facilityType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFacilityType(Facility_FacilityType facilityType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(Facility_FacilityType facility, String name, double price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editService(Facility_FacilityService service) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService(Facility_FacilityService service) {
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
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___ADD_FACILITY__STRING_FACILITY_FACILITYTYPE:
				addFacility((String)arguments.get(0), (Facility_FacilityType)arguments.get(1));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___EDIT_FACILITY__HOTEL_FACILITY:
				editFacility((Hotel_Facility)arguments.get(0));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___REMOVE_FACILITY__HOTEL_FACILITY:
				removeFacility((Hotel_Facility)arguments.get(0));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___ADD_FACILITY_TYPE__STRING:
				addFacilityType((String)arguments.get(0));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___EDIT_FACILITY_TYPE__FACILITY_FACILITYTYPE:
				editFacilityType((Facility_FacilityType)arguments.get(0));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___REMOVE_FACILITY_TYPE__FACILITY_FACILITYTYPE:
				removeFacilityType((Facility_FacilityType)arguments.get(0));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___ADD_SERVICE__FACILITY_FACILITYTYPE_STRING_DOUBLE:
				addService((Facility_FacilityType)arguments.get(0), (String)arguments.get(1), (Double)arguments.get(2));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___EDIT_SERVICE__FACILITY_FACILITYSERVICE:
				editService((Facility_FacilityService)arguments.get(0));
				return null;
			case ClassDiagramPackage.FACILITY_ADMINISTRATION___REMOVE_SERVICE__FACILITY_FACILITYSERVICE:
				removeService((Facility_FacilityService)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FacilityAdministrationImpl
