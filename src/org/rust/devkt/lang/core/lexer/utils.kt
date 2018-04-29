/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.devkt.lang.core.lexer

import org.jetbrains.kotlin.com.intellij.lexer.Lexer
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType

const val BYTE_ESCAPE_LENGTH = "\\x00".length
const val UNICODE_ESCAPE_MIN_LENGTH = "\\u{0}".length
const val UNICODE_ESCAPE_MAX_LENGTH = "\\u{000000}".length
fun isHexDigit(char: Char) = char.isDigit() || char in 'a'..'f' || char in 'A'..'F'

fun CharSequence.tokenize(lexer: Lexer): Sequence<Pair<IElementType, String>> =
		generateSequence({
			lexer.start(this)
			lexer.tokenType?.to(lexer.tokenText)
		}, {
			lexer.advance()
			lexer.tokenType?.to(lexer.tokenText)
		})

