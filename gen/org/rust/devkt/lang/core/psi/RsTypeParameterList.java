// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsTypeParameterList extends RsElement {

  @NotNull
  List<RsLifetimeParameter> getLifetimeParameterList();

  @NotNull
  List<RsTypeParameter> getTypeParameterList();

  @NotNull
  PsiElement getGt();

  @NotNull
  PsiElement getLt();

}
