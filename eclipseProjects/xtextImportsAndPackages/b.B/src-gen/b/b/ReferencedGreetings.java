/**
 */
package b.b;

import a.a.Greeting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Greetings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link b.b.ReferencedGreetings#getGreet <em>Greet</em>}</li>
 * </ul>
 * </p>
 *
 * @see b.b.BPackage#getReferencedGreetings()
 * @model
 * @generated
 */
public interface ReferencedGreetings extends EObject
{
  /**
   * Returns the value of the '<em><b>Greet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greet</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greet</em>' reference.
   * @see #setGreet(Greeting)
   * @see b.b.BPackage#getReferencedGreetings_Greet()
   * @model
   * @generated
   */
  Greeting getGreet();

  /**
   * Sets the value of the '{@link b.b.ReferencedGreetings#getGreet <em>Greet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greet</em>' reference.
   * @see #getGreet()
   * @generated
   */
  void setGreet(Greeting value);

} // ReferencedGreetings
