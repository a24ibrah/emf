/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootImpl.java,v 1.1 2004/03/30 00:12:06 elena Exp $
 */
package org.eclipse.emf.test.models.dbitem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.test.models.dbitem.DbType;
import org.eclipse.emf.test.models.dbitem.DbitemPackage;
import org.eclipse.emf.test.models.dbitem.DocumentRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.models.dbitem.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.dbitem.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.dbitem.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.dbitem.impl.DocumentRootImpl#getDbitem <em>Dbitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected FeatureMap mixed = null;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap xMLNSPrefixMap = null;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap xSISchemaLocation = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return DbitemPackage.eINSTANCE.getDocumentRoot();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BasicFeatureMap(this, DbitemPackage.DOCUMENT_ROOT__MIXED);
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, DbitemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap(EcorePackage.eINSTANCE.getEStringToStringMapEntry(), EStringToStringMapEntryImpl.class, this, DbitemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DbType getDbitem()
  {
    return (DbType)getMixed().get(DbitemPackage.eINSTANCE.getDocumentRoot_Dbitem(), true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDbitem(DbType newDbitem, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)getMixed()).basicAdd(DbitemPackage.eINSTANCE.getDocumentRoot_Dbitem(), newDbitem, null);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDbitem(DbType newDbitem)
  {
    ((FeatureMap.Internal)getMixed()).set(DbitemPackage.eINSTANCE.getDocumentRoot_Dbitem(), newDbitem);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs)
  {
    if (featureID >= 0)
    {
      switch (eDerivedStructuralFeatureID(featureID, baseClass))
      {
        case DbitemPackage.DOCUMENT_ROOT__MIXED:
          return ((InternalEList)getMixed()).basicRemove(otherEnd, msgs);
        case DbitemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
          return ((InternalEList)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
        case DbitemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
          return ((InternalEList)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
        case DbitemPackage.DOCUMENT_ROOT__DBITEM:
          return basicSetDbitem(null, msgs);
        default:
          return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
      }
    }
    return eBasicSetContainer(null, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case DbitemPackage.DOCUMENT_ROOT__MIXED:
        return getMixed();
      case DbitemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return getXMLNSPrefixMap();
      case DbitemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return getXSISchemaLocation();
      case DbitemPackage.DOCUMENT_ROOT__DBITEM:
        return getDbitem();
    }
    return eDynamicGet(eFeature, resolve);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(EStructuralFeature eFeature, Object newValue)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case DbitemPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        getMixed().addAll((Collection)newValue);
        return;
      case DbitemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        getXMLNSPrefixMap().addAll((Collection)newValue);
        return;
      case DbitemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        getXSISchemaLocation().addAll((Collection)newValue);
        return;
      case DbitemPackage.DOCUMENT_ROOT__DBITEM:
        setDbitem((DbType)newValue);
        return;
    }
    eDynamicSet(eFeature, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case DbitemPackage.DOCUMENT_ROOT__MIXED:
        getMixed().clear();
        return;
      case DbitemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case DbitemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case DbitemPackage.DOCUMENT_ROOT__DBITEM:
        setDbitem((DbType)null);
        return;
    }
    eDynamicUnset(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case DbitemPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.isEmpty();
      case DbitemPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case DbitemPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case DbitemPackage.DOCUMENT_ROOT__DBITEM:
        return getDbitem() != null;
    }
    return eDynamicIsSet(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
