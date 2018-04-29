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

public class RsTypeReferenceImpl extends RsElementImpl implements RsTypeReference {

  public RsTypeReferenceImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeReference(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsArrayType getArrayType() {
    return findChildByClass(RsArrayType.class);
  }

  @Override
  @Nullable
  public RsBaseType getBaseType() {
    return findChildByClass(RsBaseType.class);
  }

  @Override
  @Nullable
  public RsFnPointerType getFnPointerType() {
    return findChildByClass(RsFnPointerType.class);
  }

  @Override
  @Nullable
  public RsForInType getForInType() {
    return findChildByClass(RsForInType.class);
  }

  @Override
  @Nullable
  public RsRefLikeType getRefLikeType() {
    return findChildByClass(RsRefLikeType.class);
  }

  @Override
  @Nullable
  public RsTraitType getTraitType() {
    return findChildByClass(RsTraitType.class);
  }

}
