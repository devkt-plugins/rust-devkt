// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsTupleExpr extends RsExpr {

  @NotNull
  List<RsExpr> getExprList();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
