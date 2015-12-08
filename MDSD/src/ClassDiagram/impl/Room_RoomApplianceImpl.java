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
 *   <li>{@link ClassDiagram.impl.Room_RoomApplianceImpl#getHasApplianceType <em>Has Appliance Type</em>}</li>
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
	 * The cached value of the '{@link #getHasApplianceType() <em>Has Appliance Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasApplianceType()
	 * @generated
	 * @ordered
	 */
	protected RoomAppliance_ApplianceType hasApplianceType;

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
	public RoomAppliance_ApplianceType getHasApplianceType() {
		if (hasApplianceType != null && hasApplianceType.eIsProxy()) {
			InternalEObject oldHasApplianceType = (InternalEObject)hasApplianceType;
			hasApplianceType = (RoomAppliance_ApplianceType)eResolveProxy(oldHasApplianceType);
			if (hasApplianceType != oldHasApplianceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassDiagramPackage.ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE, oldHasApplianceType, hasApplianceType));
			}
		}
		return hasApplianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomAppliance_ApplianceType basicGetHasApplianceType() {
		return hasApplianceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasApplianceType(RoomAppliance_ApplianceType newHasApplianceType) {
		RoomAppliance_ApplianceType oldHasApplianceType = hasApplianceType;
		hasApplianceType = newHasApplianceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE, oldHasApplianceType, hasApplianceType));
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
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE:
				if (resolve) return getHasApplianceType();
				return basicGetHasApplianceType();
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
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE:
				setHasApplianceType((RoomAppliance_ApplianceType)newValue);
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
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE:
				setHasApplianceType((RoomAppliance_ApplianceType)null);
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
			case ClassDiagramPackage.ROOM_ROOM_APPLIANCE__HAS_APPLIANCE_TYPE:
				return hasApplianceType != null;
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
