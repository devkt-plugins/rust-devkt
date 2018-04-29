// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsContExpr extends RsExpr {

  @Nullable
  RsLabel getLabel();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  PsiElement getContinue();

}
