// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import org.rust.devkt.lang.core.psi.ext.RsElement;

public interface RsTupleFieldDecl extends RsElement {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  RsTypeReference getTypeReference();

  @Nullable
  RsVis getVis();

}
