/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.devkt.lang

import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.kotlin.com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

object RsFileType : LanguageFileType(RsLanguage) {
	const val EXTENSION: String = "rs"
	override fun getName(): String = "Rust"
	override fun getIcon(): Icon = RsIcons.RUST_FILE
	override fun getDefaultExtension(): String = EXTENSION
	override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"
	override fun getDescription(): String = "Rust Files"
}

