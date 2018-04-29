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

public class RsMacroBindingGroupImpl extends RsElementImpl implements RsMacroBindingGroup {

  public RsMacroBindingGroupImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroBindingGroup(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsMacroBindingGroupSeparator getMacroBindingGroupSeparator() {
    return findChildByClass(RsMacroBindingGroupSeparator.class);
  }

  @Override
  @Nullable
  public RsMacroPatternContents getMacroPatternContents() {
    return findChildByClass(RsMacroPatternContents.class);
  }

  @Override
  @NotNull
  public PsiElement getDollar() {
    return findNotNullChildByType(DOLLAR);
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return findNotNullChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getMul() {
    return findChildByType(MUL);
  }

  @Override
  @Nullable
  public PsiElement getPlus() {
    return findChildByType(PLUS);
  }

  @Override
  @Nullable
  public PsiElement getQ() {
    return findChildByType(Q);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

}
