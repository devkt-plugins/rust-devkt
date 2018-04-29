// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsFunction extends RsElement {

  @Nullable
  RsBlock getBlock();

  @Nullable
  RsExternAbi getExternAbi();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsRetType getRetType();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsValueParameterList getValueParameterList();

  @Nullable
  RsVis getVis();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getSemicolon();

  @Nullable
  PsiElement getConst();

  @NotNull
  PsiElement getFn();

  @NotNull
  PsiElement getIdentifier();

  @Nullable
  PsiElement getUnsafe();

}
