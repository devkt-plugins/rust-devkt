// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsEnumItem extends RsElement {

  @Nullable
  RsEnumBody getEnumBody();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsVis getVis();

  @Nullable
  RsWhereClause getWhereClause();

  @NotNull
  PsiElement getEnum();

  @Nullable
  PsiElement getIdentifier();

}
