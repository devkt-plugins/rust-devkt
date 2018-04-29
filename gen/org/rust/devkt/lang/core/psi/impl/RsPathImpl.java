// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;

import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsPathImpl extends RsElementImpl implements RsPath {

  public RsPathImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitPath(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsPath getPath() {
    return findChildByClass(RsPath.class);
  }

  @Override
  @Nullable
  public RsRetType getRetType() {
    return findChildByClass(RsRetType.class);
  }

  @Override
  @Nullable
  public RsTypeArgumentList getTypeArgumentList() {
    return findChildByClass(RsTypeArgumentList.class);
  }

  @Override
  @Nullable
  public RsTypeQual getTypeQual() {
    return findChildByClass(RsTypeQual.class);
  }

  @Override
  @Nullable
  public RsValueParameterList getValueParameterList() {
    return findChildByClass(RsValueParameterList.class);
  }

  @Override
  @Nullable
  public PsiElement getColoncolon() {
    return findChildByType(COLONCOLON);
  }

  @Override
  @Nullable
  public PsiElement getCself() {
    return findChildByType(CSELF);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getSelf() {
    return findChildByType(SELF);
  }

  @Override
  @Nullable
  public PsiElement getSuper() {
    return findChildByType(SUPER);
  }

}
