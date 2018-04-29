// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsRefLikeType extends RsElement {

  @Nullable
  RsLifetime getLifetime();

  @NotNull
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getMul();

  @Nullable
  PsiElement getConst();

  @Nullable
  PsiElement getMut();

}
