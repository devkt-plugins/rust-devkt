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

public class RsMembersImpl extends RsElementImpl implements RsMembers {

  public RsMembersImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMembers(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsConstant> getConstantList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsConstant.class);
  }

  @Override
  @NotNull
  public List<RsFunction> getFunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsFunction.class);
  }

  @Override
  @NotNull
  public List<RsInnerAttr> getInnerAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsInnerAttr.class);
  }

  @Override
  @NotNull
  public List<RsMacroCall> getMacroCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroCall.class);
  }

  @Override
  @NotNull
  public List<RsTypeAlias> getTypeAliasList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsTypeAlias.class);
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return findNotNullChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

}
