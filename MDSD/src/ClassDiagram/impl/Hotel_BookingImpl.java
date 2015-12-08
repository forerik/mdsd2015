/**
 */
package ClassDiagram.impl;

import ClassDiagram.Booking_BookedService;
import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Hotel_Booking;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hotel Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#getBookedServices <em>Booked Services</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link ClassDiagram.impl.Hotel_BookingImpl#getBookedservice <em>Bookedservice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Hotel_BookingImpl extends MinimalEObjectImpl.Container implements Hotel_Booking {
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

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
	 * The default value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedIn = CHECKED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected int bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookedServices() <em>Booked Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking_BookedService> bookedServices;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected EList<Company_GuestRecord> contact;

	/**
	 * The cached value of the '{@link #getBookedservice() <em>Bookedservice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedservice()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking_BookedService> bookedservice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hotel_BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.HOTEL_BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_BOOKING__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_BOOKING__END_DATE, oldEndDate, endDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_BOOKING__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		return checkedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedIn(boolean newCheckedIn) {
		boolean oldCheckedIn = checkedIn;
		checkedIn = newCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_BOOKING__CHECKED_IN, oldCheckedIn, checkedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(int newBookingID) {
		int oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.HOTEL_BOOKING__BOOKING_ID, oldBookingID, bookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking_BookedService> getBookedServices() {
		if (bookedServices == null) {
			bookedServices = new EObjectResolvingEList<Booking_BookedService>(Booking_BookedService.class, this, ClassDiagramPackage.HOTEL_BOOKING__BOOKED_SERVICES);
		}
		return bookedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Company_GuestRecord> getContact() {
		if (contact == null) {
			contact = new EObjectResolvingEList<Company_GuestRecord>(Company_GuestRecord.class, this, ClassDiagramPackage.HOTEL_BOOKING__CONTACT);
		}
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Booking_BookedService> getBookedservice() {
		if (bookedservice == null) {
			bookedservice = new EObjectResolvingEList<Booking_BookedService>(Booking_BookedService.class, this, ClassDiagramPackage.HOTEL_BOOKING__BOOKEDSERVICE);
		}
		return bookedservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.HOTEL_BOOKING__START_DATE:
				return getStartDate();
			case ClassDiagramPackage.HOTEL_BOOKING__END_DATE:
				return getEndDate();
			case ClassDiagramPackage.HOTEL_BOOKING__PRICE:
				return getPrice();
			case ClassDiagramPackage.HOTEL_BOOKING__CHECKED_IN:
				return isCheckedIn();
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKING_ID:
				return getBookingID();
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKED_SERVICES:
				return getBookedServices();
			case ClassDiagramPackage.HOTEL_BOOKING__CONTACT:
				return getContact();
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKEDSERVICE:
				return getBookedservice();
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
			case ClassDiagramPackage.HOTEL_BOOKING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__PRICE:
				setPrice((Double)newValue);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__CHECKED_IN:
				setCheckedIn((Boolean)newValue);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKING_ID:
				setBookingID((Integer)newValue);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKED_SERVICES:
				getBookedServices().clear();
				getBookedServices().addAll((Collection<? extends Booking_BookedService>)newValue);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__CONTACT:
				getContact().clear();
				getContact().addAll((Collection<? extends Company_GuestRecord>)newValue);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKEDSERVICE:
				getBookedservice().clear();
				getBookedservice().addAll((Collection<? extends Booking_BookedService>)newValue);
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
			case ClassDiagramPackage.HOTEL_BOOKING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__CHECKED_IN:
				setCheckedIn(CHECKED_IN_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKING_ID:
				setBookingID(BOOKING_ID_EDEFAULT);
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKED_SERVICES:
				getBookedServices().clear();
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__CONTACT:
				getContact().clear();
				return;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKEDSERVICE:
				getBookedservice().clear();
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
			case ClassDiagramPackage.HOTEL_BOOKING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ClassDiagramPackage.HOTEL_BOOKING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ClassDiagramPackage.HOTEL_BOOKING__PRICE:
				return price != PRICE_EDEFAULT;
			case ClassDiagramPackage.HOTEL_BOOKING__CHECKED_IN:
				return checkedIn != CHECKED_IN_EDEFAULT;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKING_ID:
				return bookingID != BOOKING_ID_EDEFAULT;
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKED_SERVICES:
				return bookedServices != null && !bookedServices.isEmpty();
			case ClassDiagramPackage.HOTEL_BOOKING__CONTACT:
				return contact != null && !contact.isEmpty();
			case ClassDiagramPackage.HOTEL_BOOKING__BOOKEDSERVICE:
				return bookedservice != null && !bookedservice.isEmpty();
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", price: ");
		result.append(price);
		result.append(", checkedIn: ");
		result.append(checkedIn);
		result.append(", bookingID: ");
		result.append(bookingID);
		result.append(')');
		return result.toString();
	}

} //Hotel_BookingImpl
