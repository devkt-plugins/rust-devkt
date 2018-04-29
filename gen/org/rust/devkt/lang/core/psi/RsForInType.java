// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsForInType extends RsElement {

  @Nullable
  RsFnPointerType getFnPointerType();

  @NotNull
  RsForLifetimes getForLifetimes();

  @Nullable
  RsTraitRef getTraitRef();

}
