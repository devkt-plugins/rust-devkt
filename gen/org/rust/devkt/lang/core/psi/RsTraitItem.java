// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsTraitItem extends RsElement {

  @Nullable
  RsMembers getMembers();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeParamBounds getTypeParamBounds();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsVis getVis();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getIdentifier();

  @NotNull
  PsiElement getTrait();

  @Nullable
  PsiElement getUnsafe();

}
