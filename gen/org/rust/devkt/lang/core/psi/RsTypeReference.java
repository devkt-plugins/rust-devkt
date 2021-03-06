// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsTypeReference extends RsElement {

  @Nullable
  RsArrayType getArrayType();

  @Nullable
  RsBaseType getBaseType();

  @Nullable
  RsFnPointerType getFnPointerType();

  @Nullable
  RsForInType getForInType();

  @Nullable
  RsRefLikeType getRefLikeType();

  @Nullable
  RsTraitType getTraitType();

}
