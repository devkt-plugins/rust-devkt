// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;

import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsTypeQualImpl extends RsElementImpl implements RsTypeQual {

  public RsTypeQualImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeQual(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsTraitRef getTraitRef() {
    return findChildByClass(RsTraitRef.class);
  }

  @Override
  @NotNull
  public RsTypeReference getTypeReference() {
    return findNotNullChildByClass(RsTypeReference.class);
  }

  @Override
  @NotNull
  public PsiElement getColoncolon() {
    return findNotNullChildByType(COLONCOLON);
  }

  @Override
  @NotNull
  public PsiElement getGt() {
    return findNotNullChildByType(GT);
  }

  @Override
  @NotNull
  public PsiElement getLt() {
    return findNotNullChildByType(LT);
  }

  @Override
  @Nullable
  public PsiElement getAs() {
    return findChildByType(AS);
  }

}
