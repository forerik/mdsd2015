/**
 */
package ClassDiagram.impl;

import ClassDiagram.ClassDiagramPackage;
import ClassDiagram.Company;
import ClassDiagram.Company_GuestRecord;
import ClassDiagram.Company_Hotel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ClassDiagram.impl.CompanyImpl#getHasHotel <em>Has Hotel</em>}</li>
 *   <li>{@link ClassDiagram.impl.CompanyImpl#getHasGuest <em>Has Guest</em>}</li>
 *   <li>{@link ClassDiagram.impl.CompanyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends MinimalEObjectImpl.Container implements Company {
	/**
	 * The cached value of the '{@link #getHasHotel() <em>Has Hotel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHotel()
	 * @generated
	 * @ordered
	 */
	protected EList<Company_Hotel> hasHotel;

	/**
	 * The cached value of the '{@link #getHasGuest() <em>Has Guest</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasGuest()
	 * @generated
	 * @ordered
	 */
	protected EList<Company_GuestRecord> hasGuest;

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
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassDiagramPackage.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Company_Hotel> getHasHotel() {
		if (hasHotel == null) {
			hasHotel = new EObjectResolvingEList<Company_Hotel>(Company_Hotel.class, this, ClassDiagramPackage.COMPANY__HAS_HOTEL);
		}
		return hasHotel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Company_GuestRecord> getHasGuest() {
		if (hasGuest == null) {
			hasGuest = new EObjectResolvingEList<Company_GuestRecord>(Company_GuestRecord.class, this, ClassDiagramPackage.COMPANY__HAS_GUEST);
		}
		return hasGuest;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassDiagramPackage.COMPANY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassDiagramPackage.COMPANY__HAS_HOTEL:
				return getHasHotel();
			case ClassDiagramPackage.COMPANY__HAS_GUEST:
				return getHasGuest();
			case ClassDiagramPackage.COMPANY__NAME:
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
			case ClassDiagramPackage.COMPANY__HAS_HOTEL:
				getHasHotel().clear();
				getHasHotel().addAll((Collection<? extends Company_Hotel>)newValue);
				return;
			case ClassDiagramPackage.COMPANY__HAS_GUEST:
				getHasGuest().clear();
				getHasGuest().addAll((Collection<? extends Company_GuestRecord>)newValue);
				return;
			case ClassDiagramPackage.COMPANY__NAME:
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
			case ClassDiagramPackage.COMPANY__HAS_HOTEL:
				getHasHotel().clear();
				return;
			case ClassDiagramPackage.COMPANY__HAS_GUEST:
				getHasGuest().clear();
				return;
			case ClassDiagramPackage.COMPANY__NAME:
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
			case ClassDiagramPackage.COMPANY__HAS_HOTEL:
				return hasHotel != null && !hasHotel.isEmpty();
			case ClassDiagramPackage.COMPANY__HAS_GUEST:
				return hasGuest != null && !hasGuest.isEmpty();
			case ClassDiagramPackage.COMPANY__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CompanyImpl
