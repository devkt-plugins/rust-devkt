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

public class RsTypeParameterListImpl extends RsElementImpl implements RsTypeParameterList {

  public RsTypeParameterListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitTypeParameterList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsLifetimeParameter> getLifetimeParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsLifetimeParameter.class);
  }

  @Override
  @NotNull
  public List<RsTypeParameter> getTypeParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsTypeParameter.class);
  }

  @Override
  @NotNull
  public PsiElement getGt() {
    return findNotNullChildByType(GT);
  }

  @Override
  @NotNull
  public PsiElement getLt() {
    return findNotNullChildByType(LT);
  }

}
