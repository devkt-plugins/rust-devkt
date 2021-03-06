// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;
import org.jetbrains.kotlin.com.intellij.psi.util.PsiTreeUtil;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsMacroPatternContentsImpl extends RsElementImpl implements RsMacroPatternContents {

  public RsMacroPatternContentsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroPatternContents(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsMacroBinding> getMacroBindingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroBinding.class);
  }

  @Override
  @NotNull
  public List<RsMacroBindingGroup> getMacroBindingGroupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroBindingGroup.class);
  }

  @Override
  @NotNull
  public List<RsMacroPattern> getMacroPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroPattern.class);
  }

}
