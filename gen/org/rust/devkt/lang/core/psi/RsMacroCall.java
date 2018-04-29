// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsMacroCall extends RsElement {

  @Nullable
  RsAssertMacroArgument getAssertMacroArgument();

  @Nullable
  RsFormatMacroArgument getFormatMacroArgument();

  @Nullable
  RsLogMacroArgument getLogMacroArgument();

  @Nullable
  RsMacroArgument getMacroArgument();

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @Nullable
  RsTryMacroArgument getTryMacroArgument();

  @Nullable
  RsVecMacroArgument getVecMacroArgument();

  @Nullable
  RsVis getVis();

  @NotNull
  PsiElement getExcl();

}
