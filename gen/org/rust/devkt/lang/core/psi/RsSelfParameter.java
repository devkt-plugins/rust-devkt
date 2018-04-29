// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsSelfParameter extends RsElement {

  @Nullable
  RsLifetime getLifetime();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  PsiElement getAnd();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getMut();

  @NotNull
  PsiElement getSelf();

}
