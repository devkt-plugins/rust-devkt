// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsRangeExprImpl extends RsExprImpl implements RsRangeExpr {

  public RsRangeExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitRangeExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getDotdot() {
    return findChildByType(DOTDOT);
  }

  @Override
  @Nullable
  public PsiElement getDotdotdot() {
    return findChildByType(DOTDOTDOT);
  }

  @Override
  @Nullable
  public PsiElement getDotdoteq() {
    return findChildByType(DOTDOTEQ);
  }

}
