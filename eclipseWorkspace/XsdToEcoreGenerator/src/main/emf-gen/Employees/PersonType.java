/**
 */
package Employees;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Employees.PersonType#getFirstname <em>Firstname</em>}</li>
 * </ul>
 * </p>
 *
 * @see Employees.EmployeesPackage#getPersonType()
 * @model extendedMetaData="name='person_._type' kind='empty'"
 * @generated
 */
public interface PersonType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see Employees.EmployeesPackage#getPersonType_Firstname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='firstname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link Employees.PersonType#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

} // PersonType
