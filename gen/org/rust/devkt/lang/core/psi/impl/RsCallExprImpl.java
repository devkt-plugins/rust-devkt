// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsCallExprImpl extends RsExprImpl implements RsCallExpr {

  public RsCallExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitCallExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsExpr getExpr() {
    return findNotNullChildByClass(RsExpr.class);
  }

  @Override
  @NotNull
  public RsValueArgumentList getValueArgumentList() {
    return findNotNullChildByClass(RsValueArgumentList.class);
  }

}
