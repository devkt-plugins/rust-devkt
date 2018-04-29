// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsTupleType extends RsElement {

  @NotNull
  List<RsTypeReference> getTypeReferenceList();

  @NotNull
  PsiElement getLparen();

  @NotNull
  PsiElement getRparen();

}
