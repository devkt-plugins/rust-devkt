// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsExprStmtOrLastExprImpl extends RsExprImpl implements RsExprStmtOrLastExpr {

  public RsExprStmtOrLastExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitExprStmtOrLastExpr(this);
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
  public RsExprStmt getExprStmt() {
    return findChildByClass(RsExprStmt.class);
  }

}
