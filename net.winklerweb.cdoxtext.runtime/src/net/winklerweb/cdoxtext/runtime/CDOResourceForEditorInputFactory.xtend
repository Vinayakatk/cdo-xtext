/**
 * Copyright (c) 2013-2014 Stefan Winkler (Kiel, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Stefan Winkler - initial contribution
 * 
 */
package net.winklerweb.cdoxtext.runtime

import java.net.URI
import org.eclipse.ui.IEditorInput
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory
import org.eclipse.emf.cdo.internal.ui.CDOLobEditorInput

class CDOResourceForEditorInputFactory extends ResourceForIEditorInputFactory implements IResourceForEditorInputFactory {
	 
	/** 
	 * Create an XtextResource for a given CDOLobEditorInput
	 */
	override createResource(IEditorInput input) {
		if(!(input instanceof CDOLobEditorInput)) {
			return this.createResource(input);
		}
		
		val cdoEditorInput = input as CDOLobEditorInput
		val emfUri = cdoEditorInput.resource.URI
		val uri = URI::create(emfUri.toString)
		
		return createResource(uri)
	}
}