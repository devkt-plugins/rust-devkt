// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsTypeQual extends RsElement {

  @Nullable
  RsTraitRef getTraitRef();

  @NotNull
  RsTypeReference getTypeReference();

  @NotNull
  PsiElement getColoncolon();

  @NotNull
  PsiElement getGt();

  @NotNull
  PsiElement getLt();

  @Nullable
  PsiElement getAs();

}
