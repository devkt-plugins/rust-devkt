// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsPatStruct extends RsPat {

  @NotNull
  List<RsPatField> getPatFieldList();

  @NotNull
  RsPath getPath();

  @Nullable
  PsiElement getDotdot();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

}
