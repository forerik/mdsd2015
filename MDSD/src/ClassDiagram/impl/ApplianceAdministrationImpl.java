/**
 */
package ClassDiagram.impl;

import ClassDiagram.ApplianceAdministration;
import ClassDiagram.ApplianceType_ApplianceService;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Hotel_Room;
import ClassDiagram.RoomAppliance_ApplianceType;
import ClassDiagram.Room_RoomAppliance;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appliance Administration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApplianceAdministrationImpl extends MinimalEObjectImpl.Container implements ApplianceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplianceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.APPLIANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addAppliance(Hotel_Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeAppliance(Room_RoomAppliance appliance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addApplianceType(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editApplianceType(RoomAppliance_ApplianceType applianceType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeApplianceType(RoomAppliance_ApplianceType applianceType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editAppliance(Room_RoomAppliance appliance) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addApplianceService(String name, double price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editApplianceService(ApplianceType_ApplianceService service) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeApplianceService(ApplianceType_ApplianceService service) {
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
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___ADD_APPLIANCE__HOTEL_ROOM:
				addAppliance((Hotel_Room)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE__ROOM_ROOMAPPLIANCE:
				removeAppliance((Room_RoomAppliance)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_TYPE__STRING:
				addApplianceType((String)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE:
				editApplianceType((RoomAppliance_ApplianceType)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_TYPE__ROOMAPPLIANCE_APPLIANCETYPE:
				removeApplianceType((RoomAppliance_ApplianceType)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE__ROOM_ROOMAPPLIANCE:
				editAppliance((Room_RoomAppliance)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___ADD_APPLIANCE_SERVICE__STRING_DOUBLE:
				addApplianceService((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___EDIT_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE:
				editApplianceService((ApplianceType_ApplianceService)arguments.get(0));
				return null;
			case ClassDiagramPackage.APPLIANCE_ADMINISTRATION___REMOVE_APPLIANCE_SERVICE__APPLIANCETYPE_APPLIANCESERVICE:
				removeApplianceService((ApplianceType_ApplianceService)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApplianceAdministrationImpl
