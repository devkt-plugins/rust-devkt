// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsIfExpr extends RsExpr {

  @Nullable
  RsBlock getBlock();

  @Nullable
  RsCondition getCondition();

  @Nullable
  RsElseBranch getElseBranch();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getIf();

}
