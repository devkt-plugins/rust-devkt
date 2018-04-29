package org.rust.devkt.lang;

import org.jetbrains.kotlin.com.intellij.extapi.psi.PsiFileBase
import org.jetbrains.kotlin.com.intellij.openapi.fileTypes.FileType
import org.jetbrains.kotlin.com.intellij.psi.FileViewProvider

class RsFile(
		fileViewProvider: FileViewProvider
) : PsiFileBase(fileViewProvider, RsLanguage) {
	override fun getFileType(): FileType = RsFileType
}
