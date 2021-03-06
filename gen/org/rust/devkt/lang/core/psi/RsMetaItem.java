// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMetaItem extends RsElement {

  @Nullable
  RsLitExpr getLitExpr();

  @Nullable
  RsMetaItemArgs getMetaItemArgs();

  @Nullable
  RsPath getPath();

  @Nullable
  PsiElement getEq();

  @NotNull
  PsiElement getIdentifier();

}
