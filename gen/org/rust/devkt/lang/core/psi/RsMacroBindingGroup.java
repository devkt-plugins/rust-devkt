// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMacroBindingGroup extends RsElement {

  @Nullable
  RsMacroBindingGroupSeparator getMacroBindingGroupSeparator();

  @Nullable
  RsMacroPatternContents getMacroPatternContents();

  @NotNull
  PsiElement getDollar();

  @NotNull
  PsiElement getLparen();

  @Nullable
  PsiElement getMul();

  @Nullable
  PsiElement getPlus();

  @Nullable
  PsiElement getQ();

  @Nullable
  PsiElement getRparen();

}
