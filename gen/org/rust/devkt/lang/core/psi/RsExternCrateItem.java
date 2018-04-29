// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsExternCrateItem extends RsElement {

  @Nullable
  RsAlias getAlias();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsVis getVis();

  @Nullable
  PsiElement getSemicolon();

  @NotNull
  PsiElement getCrate();

  @NotNull
  PsiElement getExtern();

  @NotNull
  PsiElement getIdentifier();

}
