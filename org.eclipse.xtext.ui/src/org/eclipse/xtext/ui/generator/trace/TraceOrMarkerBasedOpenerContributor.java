/*******************************************************************************
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.generator.trace;

import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class TraceOrMarkerBasedOpenerContributor extends OppositeFileOpenerContributor {

	@Inject
	private DerivedResourceMarkerBasedOpenerContributor derivedResourceMarkerBasedOpenerCollector;

	@Inject
	private TraceBasedOpenerContributor traceBasedOpenerCollector;

	@Override
	public boolean collectGeneratedFileOpeners(IEditorPart editor, IAcceptor<FileOpener> acceptor) {
		if (traceBasedOpenerCollector.collectGeneratedFileOpeners(editor, acceptor))
			return true;
		return derivedResourceMarkerBasedOpenerCollector.collectGeneratedFileOpeners(editor, acceptor);
	}

	@Override
	public boolean collectSourceFileOpeners(IEditorPart editor, IAcceptor<FileOpener> acceptor) {
		if (traceBasedOpenerCollector.collectSourceFileOpeners(editor, acceptor))
			return true;
		return derivedResourceMarkerBasedOpenerCollector.collectSourceFileOpeners(editor, acceptor);
	}

}
