// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsBreakExprImpl extends RsExprImpl implements RsBreakExpr {

  public RsBreakExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitBreakExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsExpr getExpr() {
    return findChildByClass(RsExpr.class);
  }

  @Override
  @Nullable
  public RsLabel getLabel() {
    return findChildByClass(RsLabel.class);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @NotNull
  public PsiElement getBreak() {
    return findNotNullChildByType(BREAK);
  }

}
