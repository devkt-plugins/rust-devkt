// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMacroPattern extends RsElement {

  @NotNull
  RsMacroPatternContents getMacroPatternContents();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getLbrack();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getRbrack();

  @Nullable
  PsiElement getRparen();

}
