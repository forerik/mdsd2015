/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.RoomAppliance_ApplianceType;
import ClassDiagram.Room_RoomAppliance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Room Appliance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Room_RoomApplianceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.Room_RoomApplianceImpl#getApplianceType <em>Appliance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Room_RoomApplianceImpl extends MinimalEObjectImpl.Container implements Room_RoomAppliance {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplianceType() <em>Appliance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplianceType()
	 * @generated
	 * @ordered
	 */
	protected RoomAppliance_ApplianceType applianceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Room_RoomApplianceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ROOM_ROOM_APPLIANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_ROOM_APPLIANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAppliance_ApplianceType getApplianceType() {
		if (applianceType != null && applianceType.eIsProxy()) {
			InternalEObject oldApplianceType = (InternalEObject)applianceType;
			applianceType = (RoomAppliance_ApplianceType)eResolveProxy(oldApplianceType);
			if (applianceType != oldApplianceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE, oldApplianceType, applianceType));
			}
		}
		return applianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAppliance_ApplianceType basicGetApplianceType() {
		return applianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplianceType(RoomAppliance_ApplianceType newApplianceType) {
		RoomAppliance_ApplianceType oldApplianceType = applianceType;
		applianceType = newApplianceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE, oldApplianceType, applianceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__NAME:
				return getName();
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE:
				if (resolve) return getApplianceType();
				return basicGetApplianceType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__NAME:
				setName((String)newValue);
				return;
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE:
				setApplianceType((RoomAppliance_ApplianceType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE:
				setApplianceType((RoomAppliance_ApplianceType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__APPLIANCE_TYPE:
				return applianceType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Room_RoomApplianceImpl
