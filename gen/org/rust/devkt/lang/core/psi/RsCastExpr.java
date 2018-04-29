// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsCastExpr extends RsExpr {

  @NotNull
  RsExpr getExpr();

  @NotNull
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getAs();

}
