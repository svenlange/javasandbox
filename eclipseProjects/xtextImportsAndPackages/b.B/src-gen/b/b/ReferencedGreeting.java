/**
 */
package b.b;

import a.a.Greeting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link b.b.ReferencedGreeting#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see b.b.BPackage#getReferencedGreeting()
 * @model
 * @generated
 */
public interface ReferencedGreeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Greeting)
   * @see b.b.BPackage#getReferencedGreeting_Name()
   * @model
   * @generated
   */
  Greeting getName();

  /**
   * Sets the value of the '{@link b.b.ReferencedGreeting#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Greeting value);

} // ReferencedGreeting
