package org.rust.devkt.lang

import org.ice1000.devkt.openapi.*
import org.ice1000.devkt.openapi.util.CompletionElement
import org.ice1000.devkt.ui.DevKtDocumentHandler
import org.jetbrains.kotlin.com.intellij.openapi.project.Project
import org.jetbrains.kotlin.com.intellij.psi.PsiElement
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType
import org.rust.devkt.lang.core.lexer.RsHighlightingLexer
import org.rust.devkt.lang.core.parser.RustParserDefinition
import org.rust.devkt.lang.core.psi.*
import javax.swing.Icon

class Rust<T> : ExtendedDevKtLanguage<T>(RsLanguage, RustParserDefinition) {
	override fun satisfies(fileName: String) = fileName.endsWith(".${RsFileType.EXTENSION}")
	override val icon: Icon get() = RsIcons.RUST_FILE
	override val lineCommentStart get() = "//"
	override val blockComment = "/*" to "*/"
	override val initialCompletionElementList = listOf(
			"as", "box", "break", "const", "continue", "crate", "cself",
			"default", "else", "enum", "extern", "fn", "for", "if", "impl",
			"in", "macro", "let", "loop", "match", "mod", "move", "mut",
			"pub", "ref", "return", "self", "static", "struct", "super",
			"trait", "type", "union", "unsafe", "use", "where", "while",
			"default", "union", "auto", "dyn"
	).mapTo(mutableSetOf(
			object : CompletionElement("println!", "p") {
				override fun afterInsert(documentHandler: DevKtDocumentHandler<*>) = documentHandler.insert("(")
			},
			object : CompletionElement("fn main() ", "main") {
				override fun afterInsert(documentHandler: DevKtDocumentHandler<*>) = documentHandler.insert("{")
			})
	) { CompletionElement(it, type = "Keyword") }

	override fun shouldAddAsCompletion(element: PsiElement) = element is RsValueParameter
	override fun createLexer(project: Project) = RsHighlightingLexer()
	override fun attributesOf(type: IElementType, colorScheme: ColorScheme<T>) = when (type) {
		RsElementTypes.COMMA -> colorScheme.comma
		RsElementTypes.COLON -> colorScheme.colon
		RsElementTypes.SEMICOLON -> colorScheme.semicolon
		RsElementTypes.INTEGER_LITERAL,
		RsElementTypes.FLOAT_LITERAL -> colorScheme.numbers
		RsElementTypes.SHEBANG_LINE -> colorScheme.lineComments
		RustParserDefinition.EOL_COMMENT -> colorScheme.lineComments
		RustParserDefinition.BLOCK_COMMENT -> colorScheme.blockComments
		RsElementTypes.BOOL_LITERAL -> colorScheme.keywords
		in RS_STRING_LITERALS -> colorScheme.string
		in RS_RAW_LITERALS -> colorScheme.string
		in RS_KEYWORDS -> colorScheme.keywords
		in RS_OPERATORS -> colorScheme.operators
		else -> super.attributesOf(type, colorScheme)
	}


	override fun annotate(element: PsiElement, document: AnnotationHolder<T>, colorScheme: ColorScheme<T>) {
		super.annotate(element, document, colorScheme)
		when {
			element.nodeType in RS_CONTEXTUAL_KEYWORDS -> document.highlight(element, colorScheme.keywords)
			element.nodeType in RS_DOC_COMMENTS -> document.highlight(element, colorScheme.docComments)
			element is RsAttr -> document.highlight(element, colorScheme.metaData)
			element is RsFunction -> document.highlight(element.identifier, colorScheme.function)
			element is RsPatBinding -> document.highlight(element.identifier, colorScheme.variable)
			element is RsBaseType -> generateSequence(element.path) { it.path }.forEach { path(it, document, colorScheme) }
			element is RsModDeclItem -> document.highlight(element.identifier, colorScheme.namespace)
			element is RsLifetimeParameter -> document.highlight(element, colorScheme.typeParam)
			element is RsTypeParameter -> document.highlight(element.identifier, colorScheme.typeParam)
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

	private fun path(it: RsPath, document: AnnotationHolder<T>, colorScheme: ColorScheme<T>) {
		it.identifier?.let { document.highlight(it, colorScheme.userTypeRef) }
	}
}
