// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsPatTup extends RsPat {

  @NotNull
  List<RsPat> getPatList();

  @Nullable
  PsiElement getDotdot();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
