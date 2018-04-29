// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMembers extends RsElement {

  @NotNull
  List<RsConstant> getConstantList();

  @NotNull
  List<RsFunction> getFunctionList();

  @NotNull
  List<RsInnerAttr> getInnerAttrList();

  @NotNull
  List<RsMacroCall> getMacroCallList();

  @NotNull
  List<RsTypeAlias> getTypeAliasList();

  @NotNull
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
