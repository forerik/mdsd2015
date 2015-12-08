/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Room_RoomAppliance;
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
 *   <li>{@link ClassDiagram.impl.Room_RoomTypeImpl#getHasAppliance <em>Has Appliance</em>}</li>
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
	 * The cached value of the '{@link #getHasAppliance() <em>Has Appliance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAppliance()
	 * @generated
	 * @ordered
	 */
	protected EList<Room_RoomAppliance> hasAppliance;

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
	public EList<Room_RoomAppliance> getHasAppliance() {
		if (hasAppliance == null) {
			hasAppliance = new EObjectResolvingEList<Room_RoomAppliance>(Room_RoomAppliance.class, this, ClassDiagramPackage.ROOM_ROOM_TYPE__HAS_APPLIANCE);
		}
		return hasAppliance;
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
			case ClassDiagramPackage.ROOM_ROOM_TYPE__HAS_APPLIANCE:
				return getHasAppliance();
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
			case ClassDiagramPackage.ROOM_ROOM_TYPE__HAS_APPLIANCE:
				getHasAppliance().clear();
				getHasAppliance().addAll((Collection<? extends Room_RoomAppliance>)newValue);
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
			case ClassDiagramPackage.ROOM_ROOM_TYPE__HAS_APPLIANCE:
				getHasAppliance().clear();
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
			case ClassDiagramPackage.ROOM_ROOM_TYPE__HAS_APPLIANCE:
				return hasAppliance != null && !hasAppliance.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //Room_RoomTypeImpl
