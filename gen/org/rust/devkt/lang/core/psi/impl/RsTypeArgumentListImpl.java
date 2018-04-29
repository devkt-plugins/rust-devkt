// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsTypeArgumentListImpl extends RsElementImpl implements RsTypeArgumentList {

  public RsTypeArgumentListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeArgumentList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsAssocTypeBinding> getAssocTypeBindingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsAssocTypeBinding.class);
  }

  @Override
  @NotNull
  public List<RsLifetime> getLifetimeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsLifetime.class);
  }

  @Override
  @NotNull
  public List<RsTypeReference> getTypeReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsTypeReference.class);
  }

  @Override
  @Nullable
  public PsiElement getGt() {
    return findChildByType(GT);
  }

  @Override
  @NotNull
  public PsiElement getLt() {
    return findNotNullChildByType(LT);
  }

}
