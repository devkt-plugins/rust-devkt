// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsUnaryExpr extends RsExpr {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getExcl();

  @Nullable
  PsiElement getMinus();

  @Nullable
  PsiElement getMul();

  @Nullable
  PsiElement getBox();

  @Nullable
  PsiElement getMut();

}
