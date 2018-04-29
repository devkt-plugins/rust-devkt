// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsPatField extends RsElement {

  @Nullable
  RsPat getPat();

  @Nullable
  RsPatBinding getPatBinding();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getBox();

  @Nullable
  PsiElement getIdentifier();

}
