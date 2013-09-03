/**
 * Copyright (c) 2013 Puppet Labs, Inc. and other contributors, as listed below.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Puppet Labs
 */
package com.puppetlabs.xtext.serializer.acceptor;

import com.puppetlabs.xtext.serializer.ICommentReconcilement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic;
import org.eclipse.xtext.serializer.sequencer.IHiddenTokenSequencer;

/**
 * Extends the IHiddenTokenSequencer with initialization that includes
 * an ICommentReconciliator.
 * 
 */
public interface IHiddenTokenSequencer2 extends IHiddenTokenSequencer {

	void init(EObject context, EObject semanticObject, ISequenceAcceptor sequenceAcceptor,
			ISerializationDiagnostic.Acceptor errorAcceptor, ICommentReconcilement commentReconciliator);

}
