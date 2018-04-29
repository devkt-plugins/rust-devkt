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

public class RsFnPointerTypeImpl extends RsElementImpl implements RsFnPointerType {

  public RsFnPointerTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitFnPointerType(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsExternAbi getExternAbi() {
    return findChildByClass(RsExternAbi.class);
  }

  @Override
  @Nullable
  public RsRetType getRetType() {
    return findChildByClass(RsRetType.class);
  }

  @Override
  @NotNull
  public RsValueParameterList getValueParameterList() {
    return findNotNullChildByClass(RsValueParameterList.class);
  }

  @Override
  @NotNull
  public PsiElement getFn() {
    return findNotNullChildByType(FN);
  }

  @Override
  @Nullable
  public PsiElement getUnsafe() {
    return findChildByType(UNSAFE);
  }

}
