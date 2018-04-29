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

public class RsTypeAliasImpl extends RsElementImpl implements RsTypeAlias {

  public RsTypeAliasImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeAlias(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @Nullable
  public RsTypeParamBounds getTypeParamBounds() {
    return findChildByClass(RsTypeParamBounds.class);
  }

  @Override
  @Nullable
  public RsTypeParameterList getTypeParameterList() {
    return findChildByClass(RsTypeParameterList.class);
  }

  @Override
  @Nullable
  public RsTypeReference getTypeReference() {
    return findChildByClass(RsTypeReference.class);
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
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

  @Override
  @NotNull
  public PsiElement getTypeKw() {
    return findNotNullChildByType(TYPE_KW);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

}
