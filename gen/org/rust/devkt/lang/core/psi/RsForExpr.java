// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsForExpr extends RsExpr {

  @Nullable
  RsBlock getBlock();

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsLabelDecl getLabelDecl();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsPat getPat();

  @NotNull
  PsiElement getFor();

  @Nullable
  PsiElement getIn();

}
