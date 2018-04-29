// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMetaItemArgs extends RsElement {

  @NotNull
  List<RsLitExpr> getLitExprList();

  @NotNull
  List<RsMetaItem> getMetaItemList();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
