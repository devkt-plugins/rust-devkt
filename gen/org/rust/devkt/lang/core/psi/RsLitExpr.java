// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsLitExpr extends RsExpr {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  PsiElement getBoolLiteral();

  @Nullable
  PsiElement getByteLiteral();

  @Nullable
  PsiElement getByteStringLiteral();

  @Nullable
  PsiElement getCharLiteral();

  @Nullable
  PsiElement getFloatLiteral();

  @Nullable
  PsiElement getIntegerLiteral();

  @Nullable
  PsiElement getRawByteStringLiteral();

  @Nullable
  PsiElement getRawStringLiteral();

  @Nullable
  PsiElement getStringLiteral();

}
