// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMacroDefinition extends RsElement {

  @Nullable
  RsMacroDefinitionBody getMacroDefinitionBody();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsVis getVis();

  @Nullable
  PsiElement getExcl();

  @Nullable
  PsiElement getIdentifier();

}
