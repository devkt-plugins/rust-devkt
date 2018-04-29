// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsLambdaExpr extends RsExpr {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsRetType getRetType();

  @NotNull
  RsValueParameterList getValueParameterList();

  @Nullable
  PsiElement getMove();

}
