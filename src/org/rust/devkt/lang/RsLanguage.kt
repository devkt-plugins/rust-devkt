/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.devkt.lang

import org.jetbrains.kotlin.com.intellij.lang.Language

object RsLanguage : Language("Rust", "text/rust", "text/x-rust", "application/x-rust") {
	override fun isCaseSensitive() = true
	override fun getDisplayName() = "Rust"
	override fun getAssociatedFileType() = RsFileType
}

