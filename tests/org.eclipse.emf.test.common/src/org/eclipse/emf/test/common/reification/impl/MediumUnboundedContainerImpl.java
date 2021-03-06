/**
 * Copyright (c) 2013 Eclipse contributors and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.emf.test.common.reification.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.test.common.reification.Medium;
import org.eclipse.emf.test.common.reification.MediumUnboundedContainer;
import org.eclipse.emf.test.common.reification.ReificationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medium Unbounded Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MediumUnboundedContainerImpl extends UnboundedGenericContainerImpl<Medium> implements MediumUnboundedContainer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MediumUnboundedContainerImpl()
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
    return ReificationPackage.Literals.MEDIUM_UNBOUNDED_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * This is specialized for the more specific type known in this context.
   * @generated
   */
  @Override
  public NotificationChain basicSetContent(Medium newContent, NotificationChain msgs)
  {
    return super.basicSetContent(newContent, msgs);
  }

} //MediumUnboundedContainerImpl
