/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.FacilityManager;
import ClassDiagram.Facility_FacilityService;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FacilityManagerImpl extends MinimalEObjectImpl.Container implements FacilityManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.FACILITY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBookedService(Date date, Facility_FacilityService facilityService) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void findBookedServices(Company_GuestRecord guest) {
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
			case ClassDiagramPackage.FACILITY_MANAGER___FIND_BOOKED_SERVICE__DATE_FACILITY_FACILITYSERVICE:
				findBookedService((Date)arguments.get(0), (Facility_FacilityService)arguments.get(1));
				return null;
			case ClassDiagramPackage.FACILITY_MANAGER___FIND_BOOKED_SERVICES__COMPANY_GUESTRECORD:
				findBookedServices((Company_GuestRecord)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FacilityManagerImpl
