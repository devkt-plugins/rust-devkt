// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsImplItem extends RsElement {

  @Nullable
  RsMembers getMembers();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTraitRef getTraitRef();

  @Nullable
  RsTypeParameterList getTypeParameterList();

  @Nullable
  RsTypeReference getTypeReference();

  @Nullable
  RsVis getVis();

  @Nullable
  RsWhereClause getWhereClause();

  @Nullable
  PsiElement getDotdot();

  @Nullable
  PsiElement getExcl();

  @Nullable
  PsiElement getFor();

  @NotNull
  PsiElement getImpl();

  @Nullable
  PsiElement getUnsafe();

}
