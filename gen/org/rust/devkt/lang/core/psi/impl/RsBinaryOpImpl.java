// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi.impl;

import org.jetbrains.annotations.*;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiElementVisitor;

import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import org.rust.devkt.lang.core.psi.ext.RsElementImpl;
import org.rust.devkt.lang.core.psi.*;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;

public class RsBinaryOpImpl extends RsElementImpl implements RsBinaryOp {

  public RsBinaryOpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RsVisitor visitor) {
    visitor.visitBinaryOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RsVisitor) accept((RsVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getAnd() {
    return findChildByType(AND);
  }

  @Override
  @Nullable
  public PsiElement getAndand() {
    return findChildByType(ANDAND);
  }

  @Override
  @Nullable
  public PsiElement getAndeq() {
    return findChildByType(ANDEQ);
  }

  @Override
  @Nullable
  public PsiElement getDiv() {
    return findChildByType(DIV);
  }

  @Override
  @Nullable
  public PsiElement getDiveq() {
    return findChildByType(DIVEQ);
  }

  @Override
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

  @Override
  @Nullable
  public PsiElement getEqeq() {
    return findChildByType(EQEQ);
  }

  @Override
  @Nullable
  public PsiElement getExcleq() {
    return findChildByType(EXCLEQ);
  }

  @Override
  @Nullable
  public PsiElement getGt() {
    return findChildByType(GT);
  }

  @Override
  @Nullable
  public PsiElement getGteq() {
    return findChildByType(GTEQ);
  }

  @Override
  @Nullable
  public PsiElement getGtgt() {
    return findChildByType(GTGT);
  }

  @Override
  @Nullable
  public PsiElement getGtgteq() {
    return findChildByType(GTGTEQ);
  }

  @Override
  @Nullable
  public PsiElement getLt() {
    return findChildByType(LT);
  }

  @Override
  @Nullable
  public PsiElement getLteq() {
    return findChildByType(LTEQ);
  }

  @Override
  @Nullable
  public PsiElement getLtlt() {
    return findChildByType(LTLT);
  }

  @Override
  @Nullable
  public PsiElement getLtlteq() {
    return findChildByType(LTLTEQ);
  }

  @Override
  @Nullable
  public PsiElement getMinus() {
    return findChildByType(MINUS);
  }

  @Override
  @Nullable
  public PsiElement getMinuseq() {
    return findChildByType(MINUSEQ);
  }

  @Override
  @Nullable
  public PsiElement getMul() {
    return findChildByType(MUL);
  }

  @Override
  @Nullable
  public PsiElement getMuleq() {
    return findChildByType(MULEQ);
  }

  @Override
  @Nullable
  public PsiElement getOr() {
    return findChildByType(OR);
  }

  @Override
  @Nullable
  public PsiElement getOreq() {
    return findChildByType(OREQ);
  }

  @Override
  @Nullable
  public PsiElement getOror() {
    return findChildByType(OROR);
  }

  @Override
  @Nullable
  public PsiElement getPlus() {
    return findChildByType(PLUS);
  }

  @Override
  @Nullable
  public PsiElement getPluseq() {
    return findChildByType(PLUSEQ);
  }

  @Override
  @Nullable
  public PsiElement getRem() {
    return findChildByType(REM);
  }

  @Override
  @Nullable
  public PsiElement getRemeq() {
    return findChildByType(REMEQ);
  }

  @Override
  @Nullable
  public PsiElement getXor() {
    return findChildByType(XOR);
  }

  @Override
  @Nullable
  public PsiElement getXoreq() {
    return findChildByType(XOREQ);
  }

}
