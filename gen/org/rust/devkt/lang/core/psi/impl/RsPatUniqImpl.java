// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;

import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsPatUniqImpl extends RsPatImpl implements RsPatUniq {

  public RsPatUniqImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitPatUniq(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public RsPat getPat() {
    return findNotNullChildByClass(RsPat.class);
  }

  @Override
  @NotNull
  public PsiElement getBox() {
    return findNotNullChildByType(BOX);
  }

}
