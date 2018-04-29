// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsEnumItemImpl extends RsElementImpl implements RsEnumItem {

  public RsEnumItemImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitEnumItem(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsEnumBody getEnumBody() {
    return findChildByClass(RsEnumBody.class);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @Nullable
  public RsTypeParameterList getTypeParameterList() {
    return findChildByClass(RsTypeParameterList.class);
  }

  @Override
  @Nullable
  public RsVis getVis() {
    return findChildByClass(RsVis.class);
  }

  @Override
  @Nullable
  public RsWhereClause getWhereClause() {
    return findChildByClass(RsWhereClause.class);
  }

  @Override
  @NotNull
  public PsiElement getEnum() {
    return findNotNullChildByType(ENUM);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

}
