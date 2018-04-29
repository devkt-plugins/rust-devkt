// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;

public interface RsStructLiteral extends RsExpr {

  @NotNull
  List<RsOuterAttr> getOuterAttrList();

  @NotNull
  RsPath getPath();

  @NotNull
  RsStructLiteralBody getStructLiteralBody();

}
