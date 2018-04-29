// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMatchArm extends RsElement {

  @Nullable
  RsExpr getExpr();

  @Nullable
  RsMatchArmGuard getMatchArmGuard();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  List<RsPat> getPatList();

  @Nullable
  PsiElement getComma();

  @Nullable
  PsiElement getFatArrow();

}