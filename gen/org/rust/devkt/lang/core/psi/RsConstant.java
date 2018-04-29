// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsConstant extends RsElement {

  @Nullable
  RsExpr getExpr();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  RsVis getVis();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEq();

  @Nullable
  PsiElement getSemicolon();

  @Nullable
  PsiElement getConst();

  @NotNull
  PsiElement getIdentifier();

  @Nullable
  PsiElement getMut();

  @Nullable
  PsiElement getStatic();

}
