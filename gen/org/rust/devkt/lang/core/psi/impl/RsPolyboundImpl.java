// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;

import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsPolyboundImpl extends RsElementImpl implements RsPolybound {

  public RsPolyboundImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitPolybound(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsBound getBound() {
    return findNotNullChildByClass(RsBound.class);
  }

  @Override
  @Nullable
  public RsForLifetimes getForLifetimes() {
    return findChildByClass(RsForLifetimes.class);
  }

  @Override
  @Nullable
  public PsiElement getQ() {
    return findChildByType(Q);
  }

}
