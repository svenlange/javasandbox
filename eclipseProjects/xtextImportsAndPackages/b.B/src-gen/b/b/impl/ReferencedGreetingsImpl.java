/**
 */
package b.b.impl;

import a.a.Greeting;

import b.b.BPackage;
import b.b.ReferencedGreetings;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Greetings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link b.b.impl.ReferencedGreetingsImpl#getGreet <em>Greet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencedGreetingsImpl extends MinimalEObjectImpl.Container implements ReferencedGreetings
{
  /**
   * The cached value of the '{@link #getGreet() <em>Greet</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGreet()
   * @generated
   * @ordered
   */
  protected Greeting greet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferencedGreetingsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BPackage.Literals.REFERENCED_GREETINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting getGreet()
  {
    if (greet != null && greet.eIsProxy())
    {
      InternalEObject oldGreet = (InternalEObject)greet;
      greet = (Greeting)eResolveProxy(oldGreet);
      if (greet != oldGreet)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPackage.REFERENCED_GREETINGS__GREET, oldGreet, greet));
      }
    }
    return greet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting basicGetGreet()
  {
    return greet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGreet(Greeting newGreet)
  {
    Greeting oldGreet = greet;
    greet = newGreet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BPackage.REFERENCED_GREETINGS__GREET, oldGreet, greet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BPackage.REFERENCED_GREETINGS__GREET:
        if (resolve) return getGreet();
        return basicGetGreet();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BPackage.REFERENCED_GREETINGS__GREET:
        setGreet((Greeting)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BPackage.REFERENCED_GREETINGS__GREET:
        setGreet((Greeting)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BPackage.REFERENCED_GREETINGS__GREET:
        return greet != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferencedGreetingsImpl
