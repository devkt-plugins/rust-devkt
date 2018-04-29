package org.rust.devkt.lang;

import org.ice1000.devkt.openapi.ui.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author ice1000
 */
interface RsIcons {
	@NotNull Icon RUST_FILE = IconLoader.getIcon("/icons/rust-file.png");
	@NotNull Icon RUST = IconLoader.getIcon("/icons/rust.png");
}
