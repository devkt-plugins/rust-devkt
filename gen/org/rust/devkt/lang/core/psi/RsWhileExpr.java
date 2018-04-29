// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsWhileExpr extends RsExpr {

  @Nullable
  RsBlock getBlock();

  @Nullable
  RsCondition getCondition();

  @Nullable
  RsLabelDecl getLabelDecl();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getWhile();

}
