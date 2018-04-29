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

public class RsMacroExpansionContentsImpl extends RsElementImpl implements RsMacroExpansionContents {

  public RsMacroExpansionContentsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroExpansionContents(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RsMacroExpansion> getMacroExpansionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroExpansion.class);
  }

  @Override
  @NotNull
  public List<RsMacroExpansionReferenceGroup> getMacroExpansionReferenceGroupList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroExpansionReferenceGroup.class);
  }

  @Override
  @NotNull
  public List<RsMacroReference> getMacroReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RsMacroReference.class);
  }

}
