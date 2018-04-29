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

public class RsMacroCallNoSemicolonsImpl extends RsElementImpl implements RsMacroCallNoSemicolons {

  public RsMacroCallNoSemicolonsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroCallNoSemicolons(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsAssertMacroArgument getAssertMacroArgument() {
    return findChildByClass(RsAssertMacroArgument.class);
  }

  @Override
  @Nullable
  public RsFormatMacroArgument getFormatMacroArgument() {
    return findChildByClass(RsFormatMacroArgument.class);
  }

  @Override
  @Nullable
  public RsLogMacroArgument getLogMacroArgument() {
    return findChildByClass(RsLogMacroArgument.class);
  }

  @Override
  @Nullable
  public RsMacroArgument getMacroArgument() {
    return findChildByClass(RsMacroArgument.class);
  }

  @Override
  @NotNull
  public List<RsOuterAttr> getOuterAttrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsOuterAttr.class);
  }

  @Override
  @Nullable
  public RsTryMacroArgument getTryMacroArgument() {
    return findChildByClass(RsTryMacroArgument.class);
  }

  @Override
  @Nullable
  public RsVecMacroArgument getVecMacroArgument() {
    return findChildByClass(RsVecMacroArgument.class);
  }

  @Override
  @Nullable
  public RsVis getVis() {
    return findChildByClass(RsVis.class);
  }

  @Override
  @NotNull
  public PsiElement getExcl() {
    return findNotNullChildByType(EXCL);
  }

}
