// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.annotations.*;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsWherePred extends RsElement {

  @Nullable
  RsForLifetimes getForLifetimes();

  @Nullable
  RsLifetime getLifetime();

  @Nullable
  RsLifetimeParamBounds getLifetimeParamBounds();

  @Nullable
  RsTypeParamBounds getTypeParamBounds();

  @Nullable
  RsTypeReference getTypeReference();

}
