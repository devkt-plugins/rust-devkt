// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsArrayType extends RsElement {

  @Nullable
  RsExpr getExpr();

  @NotNull
  RsTypeReference getTypeReference();

  @NotNull
  PsiElement getLbrack();

  @NotNull
  PsiElement getRbrack();

  @Nullable
  PsiElement getSemicolon();

}
