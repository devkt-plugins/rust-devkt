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

public class RsBinaryExprImpl extends RsExprImpl implements RsBinaryExpr {

  public RsBinaryExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitBinaryExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsBinaryOp getBinaryOp() {
    return findNotNullChildByClass(RsBinaryOp.class);
  }

  @Override
  @NotNull
  public List<RsExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsExpr.class);
  }

  @Override
  @NotNull
  public RsExpr getLeft() {
    List<RsExpr> p1 = getExprList();
    return p1.get(0);
  }

  @Override
  @Nullable
  public RsExpr getRight() {
    List<RsExpr> p1 = getExprList();
    return p1.size() < 2 ? null : p1.get(1);
  }

}
