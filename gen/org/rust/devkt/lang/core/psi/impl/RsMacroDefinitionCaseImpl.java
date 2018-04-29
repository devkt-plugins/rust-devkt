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

public class RsMacroDefinitionCaseImpl extends RsElementImpl implements RsMacroDefinitionCase {

  public RsMacroDefinitionCaseImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitMacroDefinitionCase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RsMacroExpansion getMacroExpansion() {
    return findChildByClass(RsMacroExpansion.class);
  }

  @Override
  @NotNull
  public RsMacroPattern getMacroPattern() {
    return findNotNullChildByClass(RsMacroPattern.class);
  }

  @Override
  @Nullable
  public PsiElement getFatArrow() {
    return findChildByType(FAT_ARROW);
  }

}
