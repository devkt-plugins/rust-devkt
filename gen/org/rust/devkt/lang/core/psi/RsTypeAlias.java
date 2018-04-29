// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsTypeAlias extends RsElement {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeParamBounds getTypeParamBounds();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  RsVis getVis();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getEq();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getTypeKw();

  @NotNull
  PsiElement getIdentifier();

}
