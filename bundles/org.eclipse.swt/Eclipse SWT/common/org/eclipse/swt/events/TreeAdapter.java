/*******************************************************************************
 * Copyright (c) 2000, 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.events;


/**
 * This adapter class provides default implementations for the
 * methods described by the <code>TreeListener</code> interface.
 * <p>
 * Classes that wish to deal with <code>TreeEvent</code>s can
 * extend this class and override only the methods which they are
 * interested in.
 * </p>
 * <p>
 * An alternative to this class are the static helper methods
 * {@link TreeListener#treeCollapsedAdapter(java.util.function.Consumer)}
 * and
 * {@link TreeListener#treeExpandedAdapter(java.util.function.Consumer)},
 * which accept a lambda expression or a method reference that implements the event consumer.
 * </p>
 *
 * @see TreeListener
 * @see TreeEvent
 * @see <a href="http://www.eclipse.org/swt/">Sample code and further information</a>
 */
public abstract class TreeAdapter implements TreeListener {

/**
 * Sent when a tree branch is collapsed.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the tree operation
 */
@Override
public void treeCollapsed(TreeEvent e) {
}

/**
 * Sent when a tree branch is expanded.
 * The default behavior is to do nothing.
 *
 * @param e an event containing information about the tree operation
 */
@Override
public void treeExpanded(TreeEvent e) {
}
}
