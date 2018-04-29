// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsFnPointerType extends RsElement {

  @Nullable
  RsExternAbi getExternAbi();

  @Nullable
  RsRetType getRetType();

  @NotNull
  RsValueParameterList getValueParameterList();

  @NotNull
  PsiElement getFn();

  @Nullable
  PsiElement getUnsafe();

}
