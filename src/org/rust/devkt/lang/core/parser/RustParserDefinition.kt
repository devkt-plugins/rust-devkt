/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.devkt.lang.core.parser

import org.jetbrains.kotlin.com.intellij.lang.*
import org.jetbrains.kotlin.com.intellij.lexer.Lexer
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.psi.*
import org.jetbrains.kotlin.com.intellij.psi.tree.IFileElementType
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet
import org.rust.devkt.lang.RsFile
import org.rust.devkt.lang.RsLanguage
import org.rust.devkt.lang.core.lexer.RsLexer
import org.rust.devkt.lang.core.psi.*
import org.rust.devkt.lang.core.psi.RsElementTypes.STRING_LITERAL

object RustParserDefinition : ParserDefinition {
	override fun createFile(viewProvider: FileViewProvider): PsiFile? =
			RsFile(viewProvider)

	override fun spaceExistanceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
		if (left.elementType in RS_EOL_COMMENTS) return ParserDefinition.SpaceRequirements.MUST_LINE_BREAK
		return LanguageUtil.canStickTokensTogetherByLexer(left, right, RsLexer())
	}

	override fun createElement(node: ASTNode): PsiElement =
			RsElementTypes.Factory.createElement(node)

	override fun getFileNodeType(): IFileElementType = FILE
	override fun getStringLiteralElements() = TokenSet.create(STRING_LITERAL)
	override fun getCommentTokens() = RS_COMMENTS
	override fun createLexer(project: Project?): Lexer = RsLexer()
	override fun createParser(project: Project?): PsiParser = RustParser()

	@JvmField
	val BLOCK_COMMENT = RsTokenType("<BLOCK_COMMENT>")
	@JvmField
	val EOL_COMMENT = RsTokenType("<EOL_COMMENT>")
	@JvmField
	val INNER_BLOCK_DOC_COMMENT = RsTokenType("<INNER_BLOCK_DOC_COMMENT>")
	@JvmField
	val OUTER_BLOCK_DOC_COMMENT = RsTokenType("<OUTER_BLOCK_DOC_COMMENT>")
	@JvmField
	val INNER_EOL_DOC_COMMENT = RsTokenType("<INNER_EOL_DOC_COMMENT>")
	@JvmField
	val OUTER_EOL_DOC_COMMENT = RsTokenType("<OUTER_EOL_DOC_COMMENT>")
	private val FILE = IFileElementType(RsLanguage)
}
