/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.devkt.lang.core.psi.ext

import org.jetbrains.kotlin.com.intellij.extapi.psi.ASTWrapperPsiElement
import org.jetbrains.kotlin.com.intellij.lang.ASTNode
import org.jetbrains.kotlin.com.intellij.psi.PsiElement

interface RsElement : PsiElement

abstract class RsElementImpl(node: ASTNode) : ASTWrapperPsiElement(node)
