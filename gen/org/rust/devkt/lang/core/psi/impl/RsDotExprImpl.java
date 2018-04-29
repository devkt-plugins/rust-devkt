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

public class RsDotExprImpl extends RsExprImpl implements RsDotExpr {

  public RsDotExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitDotExpr(this);
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
  @Nullable
  public RsFieldLookup getFieldLookup() {
    return findChildByClass(RsFieldLookup.class);
  }

  @Override
  @Nullable
  public RsMethodCall getMethodCall() {
    return findChildByClass(RsMethodCall.class);
  }

  @Override
  @NotNull
  public PsiElement getDot() {
    return findNotNullChildByType(DOT);
  }

}
