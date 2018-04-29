// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

public interface RsDotExpr extends RsExpr {

  @NotNull
  RsExpr getExpr();

  @Nullable
  RsFieldLookup getFieldLookup();

  @Nullable
  RsMethodCall getMethodCall();

  @NotNull
  PsiElement getDot();

}
