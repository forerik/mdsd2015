/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company_GuestRecord;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company Guest Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.Company_GuestRecordImpl#getName <em>Name</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_GuestRecordImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_GuestRecordImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_GuestRecordImpl#getSsn <em>Ssn</em>}</li>
 *   <li>{@link ClassDiagram.impl.Company_GuestRecordImpl#getPaymentInformation <em>Payment Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Company_GuestRecordImpl extends MinimalEObjectImpl.Container implements Company_GuestRecord {
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
	 * The default value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected String adress = ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsn() <em>Ssn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsn()
	 * @generated
	 * @ordered
	 */
	protected static final String SSN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsn() <em>Ssn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsn()
	 * @generated
	 * @ordered
	 */
	protected String ssn = SSN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentInformation() <em>Payment Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentInformation()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_INFORMATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentInformation() <em>Payment Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentInformation()
	 * @generated
	 * @ordered
	 */
	protected String paymentInformation = PAYMENT_INFORMATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Company_GuestRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.COMPANY_GUEST_RECORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY_GUEST_RECORD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdress(String newAdress) {
		String oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY_GUEST_RECORD__ADRESS, oldAdress, adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY_GUEST_RECORD__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsn(String newSsn) {
		String oldSsn = ssn;
		ssn = newSsn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY_GUEST_RECORD__SSN, oldSsn, ssn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentInformation() {
		return paymentInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentInformation(String newPaymentInformation) {
		String oldPaymentInformation = paymentInformation;
		paymentInformation = newPaymentInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY_GUEST_RECORD__PAYMENT_INFORMATION, oldPaymentInformation, paymentInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__NAME:
				return getName();
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__ADRESS:
				return getAdress();
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PHONE_NUMBER:
				return getPhoneNumber();
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__SSN:
				return getSsn();
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PAYMENT_INFORMATION:
				return getPaymentInformation();
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
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__NAME:
				setName((String)newValue);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__ADRESS:
				setAdress((String)newValue);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__SSN:
				setSsn((String)newValue);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PAYMENT_INFORMATION:
				setPaymentInformation((String)newValue);
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
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__SSN:
				setSsn(SSN_EDEFAULT);
				return;
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PAYMENT_INFORMATION:
				setPaymentInformation(PAYMENT_INFORMATION_EDEFAULT);
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
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__SSN:
				return SSN_EDEFAULT == null ? ssn != null : !SSN_EDEFAULT.equals(ssn);
			case ClassDiagramPackage.COMPANY_GUEST_RECORD__PAYMENT_INFORMATION:
				return PAYMENT_INFORMATION_EDEFAULT == null ? paymentInformation != null : !PAYMENT_INFORMATION_EDEFAULT.equals(paymentInformation);
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
		result.append(", adress: ");
		result.append(adress);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", ssn: ");
		result.append(ssn);
		result.append(", paymentInformation: ");
		result.append(paymentInformation);
		result.append(')');
		return result.toString();
	}

} //Company_GuestRecordImpl
