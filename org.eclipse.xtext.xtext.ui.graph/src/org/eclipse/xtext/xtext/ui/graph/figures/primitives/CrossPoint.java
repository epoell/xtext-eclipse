/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Jan Koehnlein - Initial API and implementation
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui.graph.figures.primitives;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;

/**
 * A point where the railroad track could fork, i.e. start or end of
 * {@link Connection}.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
public class CrossPoint extends Figure {

	public CrossPoint() {
		setOpaque(true);
		setBackgroundColor(ColorConstants.blue);
	}

}
