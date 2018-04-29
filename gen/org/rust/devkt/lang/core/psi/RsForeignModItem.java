// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsForeignModItem extends RsElement {

  @NotNull
  List<RsAttr> getAttrList();

  @NotNull
  List<RsConstant> getConstantList();

  @NotNull
  RsExternAbi getExternAbi();

  @NotNull
  List<RsFunction> getFunctionList();

  @NotNull
  List<RsTypeAlias> getTypeAliasList();

  @Nullable
  RsVis getVis();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

}
