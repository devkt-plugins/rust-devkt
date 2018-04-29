// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsLetDecl extends RsStmt {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsPat getPat();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEq();

  @NotNull
  PsiElement getLet();

}
