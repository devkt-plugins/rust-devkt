/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.devkt.lang.doc.lexer

import org.jetbrains.kotlin.com.intellij.lexer.*
import org.jetbrains.kotlin.com.intellij.openapi.util.text.StringUtil
import org.jetbrains.kotlin.com.intellij.psi.TokenType.WHITE_SPACE
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet
import org.rust.devkt.lang.doc.psi.RsDocElementTypes.*
import org.rust.devkt.lang.doc.psi.RsDocKind

class RsDocHighlightingLexer(kind: RsDocKind) :
		MergingLexerAdapter(
				FlexAdapter(_RustDocHighlightingLexer(null, kind.isBlock)),
				TOKENS_TO_MERGE) {

	override fun getMergeFunction() = MergeFunction { type, lexer ->
		if (type == DOC_TEXT) {
			while (lexer.tokenType == type || isOnNonEolWS(lexer)) lexer.advance()
			type
		} else super.getMergeFunction().merge(type, lexer)
	}

	private fun isOnNonEolWS(lexer: Lexer) =
			lexer.tokenType == WHITE_SPACE && !StringUtil.containsLineBreak(lexer.tokenSequence)

	companion object {
		private val TOKENS_TO_MERGE = TokenSet.create(WHITE_SPACE, DOC_CODE_SPAN, DOC_CODE_FENCE)
	}
}
