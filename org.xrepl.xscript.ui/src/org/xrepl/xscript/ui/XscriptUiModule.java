/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.xrepl.xscript.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.xrepl.Evaluator;
import org.xrepl.XreplResourceSetProvider;
import org.xrepl.ui.WorkspaceAwareEvaluator;
import org.xrepl.ui.XreplWorkspaceResourceSetProvider;
import org.xrepl.ui.console.XreplConsole;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class XscriptUiModule extends org.xrepl.xscript.ui.AbstractXscriptUiModule {
	public XscriptUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named(XreplConsole.CONSOLE_TITLE)).toInstance("Xscript");
		binder.bind(Evaluator.class).to(WorkspaceAwareEvaluator.class);
		binder.bind(XreplResourceSetProvider.class).to(XreplWorkspaceResourceSetProvider.class);
	}
	
	
}