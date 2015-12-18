/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.RoomAppliance_ApplianceType;
import ClassDiagram.Room_RoomType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Room Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Room_RoomTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.impl.Room_RoomTypeImpl#getMaxNumberOfGuests <em>Max Number Of Guests</em>}</li>
 *   <li>{@link ClassDiagram.impl.Room_RoomTypeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link ClassDiagram.impl.Room_RoomTypeImpl#getApplianceType <em>Appliance Type</em>}</li>
 *   <li>{@link ClassDiagram.impl.Room_RoomTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Room_RoomTypeImpl extends MinimalEObjectImpl.Container implements Room_RoomType {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberOfGuests() <em>Max Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_OF_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNumberOfGuests() <em>Max Number Of Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfGuests()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberOfGuests = MAX_NUMBER_OF_GUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final double AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected double area = AREA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplianceType() <em>Appliance Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplianceType()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomAppliance_ApplianceType> applianceType;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Room_RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.ROOM_ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_ROOM_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberOfGuests() {
		return maxNumberOfGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberOfGuests(int newMaxNumberOfGuests) {
		int oldMaxNumberOfGuests = maxNumberOfGuests;
		maxNumberOfGuests = newMaxNumberOfGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS, oldMaxNumberOfGuests, maxNumberOfGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(double newArea) {
		double oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_ROOM_TYPE__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomAppliance_ApplianceType> getApplianceType() {
		if (applianceType == null) {
			applianceType = new EObjectResolvingEList<RoomAppliance_ApplianceType>(RoomAppliance_ApplianceType.class, this, ClassDiagramPackage.ROOM_ROOM_TYPE__APPLIANCE_TYPE);
		}
		return applianceType;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.ROOM_ROOM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_ROOM_TYPE__PRICE:
				return getPrice();
			case ClassDiagramPackage.ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS:
				return getMaxNumberOfGuests();
			case ClassDiagramPackage.ROOM_ROOM_TYPE__AREA:
				return getArea();
			case ClassDiagramPackage.ROOM_ROOM_TYPE__APPLIANCE_TYPE:
				return getApplianceType();
			case ClassDiagramPackage.ROOM_ROOM_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassDiagramPackage.ROOM_ROOM_TYPE__PRICE:
				setPrice((Double)newValue);
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS:
				setMaxNumberOfGuests((Integer)newValue);
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__AREA:
				setArea((Double)newValue);
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__APPLIANCE_TYPE:
				getApplianceType().clear();
				getApplianceType().addAll((Collection<? extends RoomAppliance_ApplianceType>)newValue);
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__NAME:
				setName((String)newValue);
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
			case ClassDiagramPackage.ROOM_ROOM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS:
				setMaxNumberOfGuests(MAX_NUMBER_OF_GUESTS_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__APPLIANCE_TYPE:
				getApplianceType().clear();
				return;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case ClassDiagramPackage.ROOM_ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__MAX_NUMBER_OF_GUESTS:
				return maxNumberOfGuests != MAX_NUMBER_OF_GUESTS_EDEFAULT;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__AREA:
				return area != AREA_EDEFAULT;
			case ClassDiagramPackage.ROOM_ROOM_TYPE__APPLIANCE_TYPE:
				return applianceType != null && !applianceType.isEmpty();
			case ClassDiagramPackage.ROOM_ROOM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (price: ");
		result.append(price);
		result.append(", maxNumberOfGuests: ");
		result.append(maxNumberOfGuests);
		result.append(", area: ");
		result.append(area);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //Room_RoomTypeImpl
