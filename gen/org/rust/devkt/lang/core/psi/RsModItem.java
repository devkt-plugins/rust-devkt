// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsModItem extends RsElement {

  @NotNull
  List<RsAttr> getAttrList();

  @NotNull
  List<RsConstant> getConstantList();

  @NotNull
  List<RsEnumItem> getEnumItemList();

  @NotNull
  List<RsExternCrateItem> getExternCrateItemList();

  @NotNull
  List<RsForeignModItem> getForeignModItemList();

  @NotNull
  List<RsFunction> getFunctionList();

  @NotNull
  List<RsImplItem> getImplItemList();

  @NotNull
  List<RsMacroCall> getMacroCallList();

  @NotNull
  List<RsMacroDefinition> getMacroDefinitionList();

  @NotNull
  List<RsModDeclItem> getModDeclItemList();

  @NotNull
  List<RsModItem> getModItemList();

  @NotNull
  List<RsStructItem> getStructItemList();

  @NotNull
  List<RsTraitItem> getTraitItemList();

  @NotNull
  List<RsTypeAlias> getTypeAliasList();

  @NotNull
  List<RsUseItem> getUseItemList();

  @Nullable
  RsVis getVis();

  @NotNull
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiElement getMod();

}
