// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsPath extends RsElement {

  @Nullable
  RsPath getPath();

  @Nullable
  RsRetType getRetType();

  @Nullable
  RsTypeArgumentList getTypeArgumentList();

  @Nullable
  RsTypeQual getTypeQual();

  @Nullable
  RsValueParameterList getValueParameterList();

  @Nullable
  PsiElement getColoncolon();

  @Nullable
  PsiElement getCself();

  @Nullable
  PsiElement getIdentifier();

  @Nullable
  PsiElement getSelf();

  @Nullable
  PsiElement getSuper();

}
