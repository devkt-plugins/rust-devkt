package org.rust.devkt.lang

import org.ice1000.devkt.openapi.*
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType
import org.rust.devkt.lang.core.lexer.RsHighlightingLexer
import org.rust.devkt.lang.core.parser.RustParserDefinition
import org.rust.devkt.lang.core.psi.*
import javax.swing.Icon

class Rust<T> : ExtendedDevKtLanguage<T>(RsLanguage, RustParserDefinition) {
	override fun satisfies(fileName: String) = fileName.endsWith(".rs")
	override val icon: Icon get() = RsIcons.RUST_FILE
	override val lineCommentStart get() = "//"
	override val blockComment = "/*" to "*/"
	override fun createLexer(project: Project) = RsHighlightingLexer()
	override fun attributesOf(type: IElementType, colorScheme: ColorScheme<T>) = when (type) {
		RsElementTypes.COMMA -> colorScheme.comma
		RsElementTypes.COLON -> colorScheme.colon
		RsElementTypes.SEMICOLON -> colorScheme.semicolon
		RsElementTypes.INTEGER_LITERAL,
		RsElementTypes.FLOAT_LITERAL -> colorScheme.numbers
		RsElementTypes.STRING_LITERAL -> colorScheme.string
		RustParserDefinition.EOL_COMMENT -> colorScheme.lineComments
		RustParserDefinition.BLOCK_COMMENT -> colorScheme.blockComments
		in RS_KEYWORDS -> colorScheme.keywords
		else -> super.attributesOf(type, colorScheme)
	}

	override fun annotate(element: PsiElement, document: AnnotationHolder<T>, colorScheme: ColorScheme<T>) {
		super.annotate(element, document, colorScheme)
		when {
			element.nodeType in RS_CONTEXTUAL_KEYWORDS -> document.highlight(element, colorScheme.keywords)
			element.nodeType in RS_DOC_COMMENTS -> document.highlight(element, colorScheme.docComments)
			element is RsAttr -> document.highlight(element, colorScheme.metaData)
			element is RsMacroCall -> {
				document.highlight(element.excl, colorScheme.macro)
				element.excl.prevSibling?.let { document.highlight(it, colorScheme.macro) }
			}
			element is RsMacroCallNoSemicolons -> {
				document.highlight(element.excl, colorScheme.macro)
				element.excl.prevSibling?.let { document.highlight(it, colorScheme.macro) }
			}
		}
	}
}