// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsModItemImpl extends RsElementImpl implements RsModItem {

  public RsModItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitModItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsAttr> getAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsAttr.class);
  }

  @Override
  @NotNull
  public List<RsConstant> getConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsConstant.class);
  }

  @Override
  @NotNull
  public List<RsEnumItem> getEnumItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsEnumItem.class);
  }

  @Override
  @NotNull
  public List<RsExternCrateItem> getExternCrateItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsExternCrateItem.class);
  }

  @Override
  @NotNull
  public List<RsForeignModItem> getForeignModItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsForeignModItem.class);
  }

  @Override
  @NotNull
  public List<RsFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsFunction.class);
  }

  @Override
  @NotNull
  public List<RsImplItem> getImplItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsImplItem.class);
  }

  @Override
  @NotNull
  public List<RsMacroCall> getMacroCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroCall.class);
  }

  @Override
  @NotNull
  public List<RsMacroDefinition> getMacroDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroDefinition.class);
  }

  @Override
  @NotNull
  public List<RsModDeclItem> getModDeclItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsModDeclItem.class);
  }

  @Override
  @NotNull
  public List<RsModItem> getModItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsModItem.class);
  }

  @Override
  @NotNull
  public List<RsStructItem> getStructItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsStructItem.class);
  }

  @Override
  @NotNull
  public List<RsTraitItem> getTraitItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsTraitItem.class);
  }

  @Override
  @NotNull
  public List<RsTypeAlias> getTypeAliasList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsTypeAlias.class);
  }

  @Override
  @NotNull
  public List<RsUseItem> getUseItemList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsUseItem.class);
  }

  @Override
  @Nullable
  public RsVis getVis() {
    return findChildByClass(RsVis.class);
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return findNotNullChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public PsiElement getMod() {
    return findNotNullChildByType(MOD);
  }

}
