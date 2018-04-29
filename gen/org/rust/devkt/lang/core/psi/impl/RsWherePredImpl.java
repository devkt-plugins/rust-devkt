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

public class RsWherePredImpl extends RsElementImpl implements RsWherePred {

  public RsWherePredImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitWherePred(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsForLifetimes getForLifetimes() {
    return findChildByClass(RsForLifetimes.class);
  }

  @Override
  @Nullable
  public RsLifetime getLifetime() {
    return findChildByClass(RsLifetime.class);
  }

  @Override
  @Nullable
  public RsLifetimeParamBounds getLifetimeParamBounds() {
    return findChildByClass(RsLifetimeParamBounds.class);
  }

  @Override
  @Nullable
  public RsTypeParamBounds getTypeParamBounds() {
    return findChildByClass(RsTypeParamBounds.class);
  }

  @Override
  @Nullable
  public RsTypeReference getTypeReference() {
    return findChildByClass(RsTypeReference.class);
  }

}
