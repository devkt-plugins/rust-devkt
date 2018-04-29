// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.parser;

import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder;
import org.jetbrains.kotlin.com.intellij.lang.PsiBuilder.Marker;
import static org.rust.devkt.lang.core.psi.RsElementTypes.*;
import static org.rust.devkt.lang.core.parser.RustParserUtil.*;
import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.jetbrains.kotlin.com.intellij.psi.tree.TokenSet;
import org.jetbrains.kotlin.com.intellij.lang.PsiParser;
import org.jetbrains.kotlin.com.intellij.lang.LightPsiParser;
import static org.rust.devkt.lang.core.parser.RustParserUtil.PathParsingMode.*;
import static org.rust.devkt.lang.core.parser.RustParserUtil.BinaryMode.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RustParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ALIAS) {
      r = Alias(b, 0);
    }
    else if (t == ARRAY_TYPE) {
      r = ArrayType(b, 0);
    }
    else if (t == ASSERT_MACRO_ARGUMENT) {
      r = AssertMacroArgument(b, 0);
    }
    else if (t == ASSOC_TYPE_BINDING) {
      r = AssocTypeBinding(b, 0);
    }
    else if (t == BASE_TYPE) {
      r = BaseType(b, 0);
    }
    else if (t == BINDING_MODE) {
      r = BindingMode(b, 0);
    }
    else if (t == BLOCK_FIELDS) {
      r = BlockFields(b, 0);
    }
    else if (t == BOUND) {
      r = Bound(b, 0);
    }
    else if (t == COMPACT_TT) {
      r = CompactTT(b, 0);
    }
    else if (t == CONDITION) {
      r = Condition(b, 0);
    }
    else if (t == CONSTANT) {
      r = Constant(b, 0);
    }
    else if (t == ELSE_BRANCH) {
      r = ElseBranch(b, 0);
    }
    else if (t == EMPTY_STMT) {
      r = EmptyStmt(b, 0);
    }
    else if (t == ENUM_BODY) {
      r = EnumBody(b, 0);
    }
    else if (t == ENUM_ITEM) {
      r = EnumItem(b, 0);
    }
    else if (t == ENUM_VARIANT) {
      r = EnumVariant(b, 0);
    }
    else if (t == EXPR) {
      r = Expr(b, 0, -1);
    }
    else if (t == EXPR_STMT_OR_LAST_EXPR) {
      r = ExprStmtOrLastExpr(b, 0);
    }
    else if (t == EXTERN_ABI) {
      r = ExternAbi(b, 0);
    }
    else if (t == EXTERN_CRATE_ITEM) {
      r = ExternCrateItem(b, 0);
    }
    else if (t == FIELD_DECL) {
      r = FieldDecl(b, 0);
    }
    else if (t == FIELD_LOOKUP) {
      r = FieldLookup(b, 0);
    }
    else if (t == FN_POINTER_TYPE) {
      r = FnPointerType(b, 0);
    }
    else if (t == FOR_IN_TYPE) {
      r = ForInType(b, 0);
    }
    else if (t == FOR_LIFETIMES) {
      r = ForLifetimes(b, 0);
    }
    else if (t == FOREIGN_MOD_ITEM) {
      r = ForeignModItem(b, 0);
    }
    else if (t == FORMAT_MACRO_ARG) {
      r = FormatMacroArg(b, 0);
    }
    else if (t == FORMAT_MACRO_ARGUMENT) {
      r = FormatMacroArgument(b, 0);
    }
    else if (t == FUNCTION) {
      r = Function(b, 0);
    }
    else if (t == IMPL_ITEM) {
      r = ImplItem(b, 0);
    }
    else if (t == INNER_ATTR) {
      r = InnerAttr(b, 0);
    }
    else if (t == LABEL) {
      r = Label(b, 0);
    }
    else if (t == LABEL_DECL) {
      r = LabelDecl(b, 0);
    }
    else if (t == LET_DECL) {
      r = LetDecl(b, 0);
    }
    else if (t == LIFETIME) {
      r = Lifetime(b, 0);
    }
    else if (t == LIFETIME_PARAM_BOUNDS) {
      r = LifetimeParamBounds(b, 0);
    }
    else if (t == LIFETIME_PARAMETER) {
      r = LifetimeParameter(b, 0);
    }
    else if (t == LOG_MACRO_ARGUMENT) {
      r = LogMacroArgument(b, 0);
    }
    else if (t == MACRO_ARGUMENT) {
      r = MacroArgument(b, 0);
    }
    else if (t == MACRO_BINDING) {
      r = MacroBinding(b, 0);
    }
    else if (t == MACRO_BINDING_GROUP) {
      r = MacroBindingGroup(b, 0);
    }
    else if (t == MACRO_BINDING_GROUP_SEPARATOR) {
      r = MacroBindingGroupSeparator(b, 0);
    }
    else if (t == MACRO_CALL) {
      r = MacroCall(b, 0);
    }
    else if (t == MACRO_CALL_NO_SEMICOLONS) {
      r = MacroCallNoSemicolons(b, 0);
    }
    else if (t == MACRO_DEFINITION) {
      r = MacroDefinition(b, 0);
    }
    else if (t == MACRO_DEFINITION_BODY) {
      r = MacroDefinitionBody(b, 0);
    }
    else if (t == MACRO_DEFINITION_CASE) {
      r = MacroDefinitionCase(b, 0);
    }
    else if (t == MACRO_EXPANSION) {
      r = MacroExpansion(b, 0);
    }
    else if (t == MACRO_EXPANSION_CONTENTS) {
      r = MacroExpansionContents(b, 0);
    }
    else if (t == MACRO_EXPANSION_GROUP_SEPARATOR) {
      r = MacroExpansionGroupSeparator(b, 0);
    }
    else if (t == MACRO_EXPANSION_REFERENCE_GROUP) {
      r = MacroExpansionReferenceGroup(b, 0);
    }
    else if (t == MACRO_PATTERN) {
      r = MacroPattern(b, 0);
    }
    else if (t == MACRO_PATTERN_CONTENTS) {
      r = MacroPatternContents(b, 0);
    }
    else if (t == MACRO_REFERENCE) {
      r = MacroReference(b, 0);
    }
    else if (t == MATCH_ARM) {
      r = MatchArm(b, 0);
    }
    else if (t == MATCH_ARM_GUARD) {
      r = MatchArmGuard(b, 0);
    }
    else if (t == MATCH_BODY) {
      r = MatchBody(b, 0);
    }
    else if (t == MEMBERS) {
      r = Members(b, 0);
    }
    else if (t == META_ITEM) {
      r = MetaItem(b, 0);
    }
    else if (t == META_ITEM_ARGS) {
      r = MetaItemArgs(b, 0);
    }
    else if (t == META_VAR_IDENTIFIER) {
      r = MetaVarIdentifier(b, 0);
    }
    else if (t == METHOD_CALL) {
      r = MethodCall(b, 0);
    }
    else if (t == MOD_DECL_ITEM) {
      r = ModDeclItem(b, 0);
    }
    else if (t == MOD_ITEM) {
      r = ModItem(b, 0);
    }
    else if (t == OUTER_ATTR) {
      r = OuterAttr(b, 0);
    }
    else if (t == PAT) {
      r = Pat(b, 0);
    }
    else if (t == PAT_BINDING) {
      r = PatBinding(b, 0);
    }
    else if (t == PAT_CONST) {
      r = PatConst(b, 0);
    }
    else if (t == PAT_ENUM) {
      r = PatEnum(b, 0);
    }
    else if (t == PAT_FIELD) {
      r = PatField(b, 0);
    }
    else if (t == PAT_IDENT) {
      r = PatIdent(b, 0);
    }
    else if (t == PAT_MACRO) {
      r = PatMacro(b, 0);
    }
    else if (t == PAT_RANGE) {
      r = PatRange(b, 0);
    }
    else if (t == PAT_REF) {
      r = PatRef(b, 0);
    }
    else if (t == PAT_STRUCT) {
      r = PatStruct(b, 0);
    }
    else if (t == PAT_TUP) {
      r = PatTup(b, 0);
    }
    else if (t == PAT_UNIQ) {
      r = PatUniq(b, 0);
    }
    else if (t == PAT_VEC) {
      r = PatVec(b, 0);
    }
    else if (t == PAT_WILD) {
      r = PatWild(b, 0);
    }
    else if (t == POLYBOUND) {
      r = Polybound(b, 0);
    }
    else if (t == REF_LIKE_TYPE) {
      r = RefLikeType(b, 0);
    }
    else if (t == RET_TYPE) {
      r = RetType(b, 0);
    }
    else if (t == SELF_PARAMETER) {
      r = SelfParameter(b, 0);
    }
    else if (t == STMT) {
      r = Stmt(b, 0);
    }
    else if (t == STRUCT_ITEM) {
      r = StructItem(b, 0);
    }
    else if (t == STRUCT_LITERAL_BODY) {
      r = StructLiteralBody(b, 0);
    }
    else if (t == STRUCT_LITERAL_FIELD) {
      r = StructLiteralField(b, 0);
    }
    else if (t == TT) {
      r = TT(b, 0);
    }
    else if (t == TRAIT_ITEM) {
      r = TraitItem(b, 0);
    }
    else if (t == TRAIT_REF) {
      r = TraitRef(b, 0);
    }
    else if (t == TRY_MACRO_ARGUMENT) {
      r = TryMacroArgument(b, 0);
    }
    else if (t == TUPLE_FIELD_DECL) {
      r = TupleFieldDecl(b, 0);
    }
    else if (t == TUPLE_FIELDS) {
      r = TupleFields(b, 0);
    }
    else if (t == TUPLE_TYPE) {
      r = TupleType(b, 0);
    }
    else if (t == TYPE_ALIAS) {
      r = TypeAlias(b, 0);
    }
    else if (t == TYPE_ARGUMENT_LIST) {
      r = TypeArgumentList(b, 0);
    }
    else if (t == TYPE_PARAM_BOUNDS) {
      r = TypeParamBounds(b, 0);
    }
    else if (t == TYPE_PARAMETER) {
      r = TypeParameter(b, 0);
    }
    else if (t == TYPE_PARAMETER_LIST) {
      r = TypeParameterList(b, 0);
    }
    else if (t == TYPE_QUAL) {
      r = TypeQual(b, 0);
    }
    else if (t == TYPE_REFERENCE) {
      r = TypeReference(b, 0);
    }
    else if (t == USE_GROUP) {
      r = UseGroup(b, 0);
    }
    else if (t == USE_ITEM) {
      r = UseItem(b, 0);
    }
    else if (t == USE_SPECK) {
      r = UseSpeck(b, 0);
    }
    else if (t == VALUE_ARGUMENT_LIST) {
      r = ValueArgumentList(b, 0);
    }
    else if (t == VARIANT_DISCRIMINANT) {
      r = VariantDiscriminant(b, 0);
    }
    else if (t == VEC_MACRO_ARGUMENT) {
      r = VecMacroArgument(b, 0);
    }
    else if (t == VIS) {
      r = Vis(b, 0);
    }
    else if (t == VIS_RESTRICTION) {
      r = VisRestriction(b, 0);
    }
    else if (t == WHERE_CLAUSE) {
      r = WhereClause(b, 0);
    }
    else if (t == WHERE_PRED) {
      r = WherePred(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return File(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(INNER_ATTR, OUTER_ATTR),
    create_token_set_(EMPTY_STMT, EXPR_STMT, LET_DECL, STMT),
    create_token_set_(PAT, PAT_CONST, PAT_ENUM, PAT_IDENT,
      PAT_MACRO, PAT_RANGE, PAT_REF, PAT_STRUCT,
      PAT_TUP, PAT_UNIQ, PAT_VEC, PAT_WILD),
    create_token_set_(ARRAY_EXPR, BINARY_EXPR, BLOCK_EXPR, BREAK_EXPR,
      CALL_EXPR, CAST_EXPR, CONT_EXPR, DOT_EXPR,
      EXPR, EXPR_STMT_OR_LAST_EXPR, FOR_EXPR, IF_EXPR,
      INDEX_EXPR, LAMBDA_EXPR, LIT_EXPR, LOOP_EXPR,
      MACRO_EXPR, MATCH_EXPR, PAREN_EXPR, PATH_EXPR,
      RANGE_EXPR, RET_EXPR, STRUCT_LITERAL, TRY_EXPR,
      TUPLE_EXPR, TUPLE_OR_PAREN_EXPR, UNARY_EXPR, UNIT_EXPR,
      WHILE_EXPR),
  };

  /* ********************************************************** */
  // '+' | '-'
  public static boolean AddBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddBinOp")) return false;
    if (!nextTokenIs(b, "<add bin op>", PLUS, MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP, "<add bin op>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // as identifier
  public static boolean Alias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Alias")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, IDENTIFIER);
    exit_section_(b, m, ALIAS, r);
    return r;
  }

  /* ********************************************************** */
  // [ RestrictedPat ':' ] TypeReference
  public static boolean AnonParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_PARAMETER, "<anon parameter>");
    r = AnonParameter_0(b, l + 1);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ RestrictedPat ':' ]
  private static boolean AnonParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonParameter_0")) return false;
    AnonParameter_0_0(b, l + 1);
    return true;
  }

  // RestrictedPat ':'
  private static boolean AnonParameter_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnonParameter_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RestrictedPat(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<structLiterals 'ON' <<stmtMode 'OFF' Expr>> >>
  public static boolean AnyExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AnyExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<any expr>");
    r = structLiterals(b, l + 1, ON, AnyExpr_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ AnyExpr ( ';' AnyExpr | (',' AnyExpr)* ','? ) ]
  static boolean ArrayInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer")) return false;
    ArrayInitializer_0(b, l + 1);
    return true;
  }

  // AnyExpr ( ';' AnyExpr | (',' AnyExpr)* ','? )
  private static boolean ArrayInitializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyExpr(b, l + 1);
    r = r && ArrayInitializer_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' AnyExpr | (',' AnyExpr)* ','?
  private static boolean ArrayInitializer_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayInitializer_0_1_0(b, l + 1);
    if (!r) r = ArrayInitializer_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';' AnyExpr
  private static boolean ArrayInitializer_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' AnyExpr)* ','?
  private static boolean ArrayInitializer_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayInitializer_0_1_1_0(b, l + 1);
    r = r && ArrayInitializer_0_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' AnyExpr)*
  private static boolean ArrayInitializer_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_0_1_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ArrayInitializer_0_1_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayInitializer_0_1_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' AnyExpr
  private static boolean ArrayInitializer_0_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_0_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean ArrayInitializer_0_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayInitializer_0_1_1_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // '[' TypeReference [';' AnyExpr] ']'
  public static boolean ArrayType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && TypeReference(b, l + 1);
    r = r && ArrayType_2(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, ARRAY_TYPE, r);
    return r;
  }

  // [';' AnyExpr]
  private static boolean ArrayType_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType_2")) return false;
    ArrayType_2_0(b, l + 1);
    return true;
  }

  // ';' AnyExpr
  private static boolean ArrayType_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayType_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ("assert" | "debug_assert" | "assert_eq" | "assert_ne" | "debug_assert_eq" | "debug_assert_ne")
  //   '!' AssertMacroArgument
  static boolean AssertMacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertMacro")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = AssertMacro_0(b, l + 1);
    r = r && consumeToken(b, EXCL);
    p = r; // pin = 2
    r = r && AssertMacroArgument(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "assert" | "debug_assert" | "assert_eq" | "assert_ne" | "debug_assert_eq" | "debug_assert_ne"
  private static boolean AssertMacro_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertMacro_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "assert");
    if (!r) r = consumeToken(b, "debug_assert");
    if (!r) r = consumeToken(b, "assert_eq");
    if (!r) r = consumeToken(b, "assert_ne");
    if (!r) r = consumeToken(b, "debug_assert_eq");
    if (!r) r = consumeToken(b, "debug_assert_ne");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<any_braces (AnyExpr [ ',' <<comma_separated_list FormatMacroArg>> ])>>
  public static boolean AssertMacroArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertMacroArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSERT_MACRO_ARGUMENT, "<assert macro argument>");
    r = any_braces(b, l + 1, AssertMacroArgument_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // AnyExpr [ ',' <<comma_separated_list FormatMacroArg>> ]
  private static boolean AssertMacroArgument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertMacroArgument_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyExpr(b, l + 1);
    r = r && AssertMacroArgument_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ',' <<comma_separated_list FormatMacroArg>> ]
  private static boolean AssertMacroArgument_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertMacroArgument_0_0_1")) return false;
    AssertMacroArgument_0_0_1_0(b, l + 1);
    return true;
  }

  // ',' <<comma_separated_list FormatMacroArg>>
  private static boolean AssertMacroArgument_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssertMacroArgument_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && comma_separated_list(b, l + 1, FormatMacroArg_parser_);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // gtgteq | ltlteq | '|=' | '^=' | '&=' | '=' | '+=' | '-=' | '*=' | '/=' | '%='
  public static boolean AssignBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssignBinOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BINARY_OP, "<assign bin op>");
    r = gtgteq(b, l + 1);
    if (!r) r = ltlteq(b, l + 1);
    if (!r) r = consumeToken(b, OREQ);
    if (!r) r = consumeToken(b, XOREQ);
    if (!r) r = consumeToken(b, ANDEQ);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, PLUSEQ);
    if (!r) r = consumeToken(b, MINUSEQ);
    if (!r) r = consumeToken(b, MULEQ);
    if (!r) r = consumeToken(b, DIVEQ);
    if (!r) r = consumeToken(b, REMEQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier '=' TypeReference
  public static boolean AssocTypeBinding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AssocTypeBinding")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ASSOC_TYPE_BINDING, null);
    r = consumeTokens(b, 2, IDENTIFIER, EQ);
    p = r; // pin = 2
    r = r && TypeReference(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // OuterAttr* Vis?
  static boolean AttrsAndVis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttrsAndVis")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AttrsAndVis_0(b, l + 1);
    r = r && AttrsAndVis_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OuterAttr*
  private static boolean AttrsAndVis_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttrsAndVis_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "AttrsAndVis_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Vis?
  private static boolean AttrsAndVis_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttrsAndVis_1")) return false;
    Vis(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // TrivialBaseTypeInner | PathGenericArgsWithoutColons
  public static boolean BaseType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BaseType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_TYPE, "<base type>");
    r = TrivialBaseTypeInner(b, l + 1);
    if (!r) r = PathGenericArgsWithoutColons(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ref mut? | mut
  public static boolean BindingMode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindingMode")) return false;
    if (!nextTokenIs(b, "<binding mode>", MUT, REF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINDING_MODE, "<binding mode>");
    r = BindingMode_0(b, l + 1);
    if (!r) r = consumeToken(b, MUT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ref mut?
  private static boolean BindingMode_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindingMode_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, REF);
    r = r && BindingMode_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mut?
  private static boolean BindingMode_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BindingMode_0_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  /* ********************************************************** */
  // '&'
  public static boolean BitAndBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitAndBinOp")) return false;
    if (!nextTokenIs(b, AND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    exit_section_(b, m, BINARY_OP, r);
    return r;
  }

  /* ********************************************************** */
  // '|'
  public static boolean BitOrBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitOrBinOp")) return false;
    if (!nextTokenIs(b, OR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    exit_section_(b, m, BINARY_OP, r);
    return r;
  }

  /* ********************************************************** */
  // ltlt | gtgt
  public static boolean BitShiftBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitShiftBinOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BINARY_OP, "<bit shift bin op>");
    r = ltlt(b, l + 1);
    if (!r) r = gtgt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '^'
  public static boolean BitXorBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitXorBinOp")) return false;
    if (!nextTokenIs(b, XOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XOR);
    exit_section_(b, m, BINARY_OP, r);
    return r;
  }

  /* ********************************************************** */
  // !'}' (ExprStmtOrLastExpr | Stmt | Item)
  static boolean BlockElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockElement")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = BlockElement_0(b, l + 1);
    p = r; // pin = 1
    r = r && BlockElement_1(b, l + 1);
    exit_section_(b, l, m, r, p, BlockElement_recover_parser_);
    return r || p;
  }

  // !'}'
  private static boolean BlockElement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockElement_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ExprStmtOrLastExpr | Stmt | Item
  private static boolean BlockElement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockElement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExprStmtOrLastExpr(b, l + 1);
    if (!r) r = Stmt(b, l + 1);
    if (!r) r = Item(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('}' | Item_first | Expr_first | let | ';')
  static boolean BlockElement_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockElement_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !BlockElement_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}' | Item_first | Expr_first | let | ';'
  private static boolean BlockElement_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockElement_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, RBRACE);
    if (!r) r = Item_first(b, l + 1);
    if (!r) r = Expr_first(b, l + 1);
    if (!r) r = consumeTokenFast(b, LET);
    if (!r) r = consumeTokenFast(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' (FieldDecl (',' | &'}'))* '}'
  public static boolean BlockFields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockFields")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_FIELDS, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, BlockFields_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (FieldDecl (',' | &'}'))*
  private static boolean BlockFields_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockFields_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BlockFields_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockFields_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // FieldDecl (',' | &'}')
  private static boolean BlockFields_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockFields_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FieldDecl(b, l + 1);
    r = r && BlockFields_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' | &'}'
  private static boolean BlockFields_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockFields_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = BlockFields_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'}'
  private static boolean BlockFields_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockFields_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WhereClause? BlockFields
  static boolean BlockStructTail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStructTail")) return false;
    if (!nextTokenIs(b, "", LBRACE, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockStructTail_0(b, l + 1);
    r = r && BlockFields(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WhereClause?
  private static boolean BlockStructTail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStructTail_0")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // andand
  public static boolean BoolAndBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoolAndBinOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BINARY_OP, "<bool and bin op>");
    r = andand(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // oror
  public static boolean BoolOrBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoolOrBinOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BINARY_OP, "<bool or bin op>");
    r = oror(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Lifetime | TraitRef
  public static boolean Bound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Bound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOUND, "<bound>");
    r = Lifetime(b, l + 1);
    if (!r) r = TraitRef(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '::' TypeArgumentListImpl
  public static boolean ColonTypeArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ColonTypeArgumentList")) return false;
    if (!nextTokenIs(b, COLONCOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLONCOLON);
    r = r && TypeArgumentListImpl(b, l + 1);
    exit_section_(b, m, TYPE_ARGUMENT_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // '==' | '!='
  public static boolean CompBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompBinOp")) return false;
    if (!nextTokenIs(b, "<comp bin op>", EXCLEQ, EQEQ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP, "<comp bin op>");
    r = consumeToken(b, EQEQ);
    if (!r) r = consumeToken(b, EXCLEQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (<<any_braces CompactTT>> | <<unpairedToken>>)*
  public static boolean CompactTT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompactTT")) return false;
    Marker m = enter_section_(b, l, _COLLAPSE_, COMPACT_TT, "<compact tt>");
    int c = current_position_(b);
    while (true) {
      if (!CompactTT_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CompactTT", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // <<any_braces CompactTT>> | <<unpairedToken>>
  private static boolean CompactTT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompactTT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = any_braces(b, l + 1, CompactTT_parser_);
    if (!r) r = unpairedToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ let Pat '=' ] NoStructLitExpr
  public static boolean Condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = Condition_0(b, l + 1);
    r = r && NoStructLitExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ let Pat '=' ]
  private static boolean Condition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition_0")) return false;
    Condition_0_0(b, l + 1);
    return true;
  }

  // let Pat '='
  private static boolean Condition_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Condition_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LET);
    r = r && Pat(b, l + 1);
    r = r && consumeToken(b, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OuterAttr* default_? Vis? (static mut? | const) identifier TypeAscription [ '=' AnyExpr ] ';'
  public static boolean Constant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONSTANT, "<constant>");
    r = Constant_0(b, l + 1);
    r = r && Constant_1(b, l + 1);
    r = r && Constant_2(b, l + 1);
    r = r && Constant_3(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    p = r; // pin = identifier
    r = r && report_error_(b, TypeAscription(b, l + 1));
    r = p && report_error_(b, Constant_6(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean Constant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Constant_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // default_?
  private static boolean Constant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_1")) return false;
    default_(b, l + 1);
    return true;
  }

  // Vis?
  private static boolean Constant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_2")) return false;
    Vis(b, l + 1);
    return true;
  }

  // static mut? | const
  private static boolean Constant_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constant_3_0(b, l + 1);
    if (!r) r = consumeToken(b, CONST);
    exit_section_(b, m, null, r);
    return r;
  }

  // static mut?
  private static boolean Constant_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STATIC);
    r = r && Constant_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mut?
  private static boolean Constant_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_3_0_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  // [ '=' AnyExpr ]
  private static boolean Constant_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_6")) return false;
    Constant_6_0(b, l + 1);
    return true;
  }

  // '=' AnyExpr
  private static boolean Constant_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Constant_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // else ( IfExpr | SimpleBlock )
  public static boolean ElseBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseBranch")) return false;
    if (!nextTokenIs(b, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && ElseBranch_1(b, l + 1);
    exit_section_(b, m, ELSE_BRANCH, r);
    return r;
  }

  // IfExpr | SimpleBlock
  private static boolean ElseBranch_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseBranch_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IfExpr(b, l + 1);
    if (!r) r = SimpleBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ';'
  public static boolean EmptyStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyStmt")) return false;
    if (!nextTokenIs(b, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, EMPTY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [ <<comma_separated_list EnumVariant>> ] '}'
  public static boolean EnumBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_BODY, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, EnumBody_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [ <<comma_separated_list EnumVariant>> ]
  private static boolean EnumBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumBody_1")) return false;
    comma_separated_list(b, l + 1, EnumVariant_parser_);
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis enum identifier TypeParameterList? WhereClause? EnumBody
  public static boolean EnumItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_ITEM, "<enum item>");
    r = AttrsAndVis(b, l + 1);
    r = r && consumeTokens(b, 1, ENUM, IDENTIFIER);
    p = r; // pin = enum
    r = r && report_error_(b, EnumItem_3(b, l + 1));
    r = p && report_error_(b, EnumItem_4(b, l + 1)) && r;
    r = p && EnumBody(b, l + 1) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TypeParameterList?
  private static boolean EnumItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumItem_3")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  // WhereClause?
  private static boolean EnumItem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumItem_4")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OuterAttr* identifier VariantArgs?
  public static boolean EnumVariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant")) return false;
    if (!nextTokenIs(b, "<enum variant>", SHA, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ENUM_VARIANT, "<enum variant>");
    r = EnumVariant_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    p = r; // pin = 2
    r = r && EnumVariant_2(b, l + 1);
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean EnumVariant_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumVariant_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // VariantArgs?
  private static boolean EnumVariant_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumVariant_2")) return false;
    VariantArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ExplicitTraitTypeInner
  public static boolean ExplicitTraitType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitTraitType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_TYPE, "<explicit trait type>");
    r = ExplicitTraitTypeInner(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (impl | dyn) Polybound ('+' Polybound)*
  static boolean ExplicitTraitTypeInner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitTraitTypeInner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExplicitTraitTypeInner_0(b, l + 1);
    r = r && Polybound(b, l + 1);
    r = r && ExplicitTraitTypeInner_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // impl | dyn
  private static boolean ExplicitTraitTypeInner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitTraitTypeInner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IMPL);
    if (!r) r = dyn(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('+' Polybound)*
  private static boolean ExplicitTraitTypeInner_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitTraitTypeInner_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ExplicitTraitTypeInner_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ExplicitTraitTypeInner_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+' Polybound
  private static boolean ExplicitTraitTypeInner_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExplicitTraitTypeInner_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && Polybound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StmtModeExpr (ExprStmtUpper | LastExprUpper)
  public static boolean ExprStmtOrLastExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprStmtOrLastExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR_STMT_OR_LAST_EXPR, "<expr stmt or last expr>");
    r = StmtModeExpr(b, l + 1);
    r = r && ExprStmtOrLastExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ExprStmtUpper | LastExprUpper
  private static boolean ExprStmtOrLastExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprStmtOrLastExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExprStmtUpper(b, l + 1);
    if (!r) r = LastExprUpper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ';' | () <<isBlock>> !('}')
  public static boolean ExprStmtUpper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprStmtUpper")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_ | _UPPER_, EXPR_STMT, "<expr stmt upper>");
    r = consumeToken(b, SEMICOLON);
    if (!r) r = ExprStmtUpper_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // () <<isBlock>> !('}')
  private static boolean ExprStmtUpper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprStmtUpper_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ExprStmtUpper_1_0(b, l + 1);
    r = r && isBlock(b, l + 1);
    r = r && ExprStmtUpper_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ()
  private static boolean ExprStmtUpper_1_0(PsiBuilder b, int l) {
    return true;
  }

  // !('}')
  private static boolean ExprStmtUpper_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprStmtUpper_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // return | '|' | Path_first | '{' | '[' | '(' | '..' | '...' | '..=' | true | false | box | QUOTE_IDENTIFIER
  //   | '-' | '*' | '!' | '&' | move | LitExpr | while | if | for | continue | break  | loop | match | unsafe
  static boolean Expr_first(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expr_first")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, OR);
    if (!r) r = Path_first(b, l + 1);
    if (!r) r = consumeToken(b, LBRACE);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, DOTDOT);
    if (!r) r = consumeToken(b, DOTDOTDOT);
    if (!r) r = consumeToken(b, DOTDOTEQ);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, BOX);
    if (!r) r = consumeToken(b, QUOTE_IDENTIFIER);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, EXCL);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, MOVE);
    if (!r) r = LitExpr(b, l + 1);
    if (!r) r = consumeToken(b, WHILE);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, LOOP);
    if (!r) r = consumeToken(b, MATCH);
    if (!r) r = consumeToken(b, UNSAFE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // extern STRING_LITERAL?
  public static boolean ExternAbi(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternAbi")) return false;
    if (!nextTokenIs(b, EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTERN);
    r = r && ExternAbi_1(b, l + 1);
    exit_section_(b, m, EXTERN_ABI, r);
    return r;
  }

  // STRING_LITERAL?
  private static boolean ExternAbi_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternAbi_1")) return false;
    consumeToken(b, STRING_LITERAL);
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis extern crate identifier Alias? ';'
  public static boolean ExternCrateItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternCrateItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, EXTERN_CRATE_ITEM, "<extern crate item>");
    r = AttrsAndVis(b, l + 1);
    r = r && consumeTokens(b, 3, EXTERN, CRATE, IDENTIFIER);
    p = r; // pin = identifier
    r = r && report_error_(b, ExternCrateItem_4(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // Alias?
  private static boolean ExternCrateItem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExternCrateItem_4")) return false;
    Alias(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis identifier TypeAscription
  public static boolean FieldDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldDecl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FIELD_DECL, "<field decl>");
    r = AttrsAndVis(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    p = r; // pin = 2
    r = r && TypeAscription(b, l + 1);
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, Field_recover_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // identifier | INTEGER_LITERAL
  public static boolean FieldLookup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FieldLookup")) return false;
    if (!nextTokenIs(b, "<field lookup>", INTEGER_LITERAL, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_LOOKUP, "<field lookup>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, INTEGER_LITERAL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !('}' | ',')
  static boolean Field_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Field_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !Field_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}' | ','
  private static boolean Field_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Field_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, RBRACE);
    if (!r) r = consumeTokenFast(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ SHEBANG_LINE ] InnerAttr* Items
  static boolean File(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = File_0(b, l + 1);
    r = r && File_1(b, l + 1);
    r = r && Items(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ SHEBANG_LINE ]
  private static boolean File_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_0")) return false;
    consumeToken(b, SHEBANG_LINE);
    return true;
  }

  // InnerAttr*
  private static boolean File_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "File_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "File_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // [ Pat ':' ] TypeReference
  public static boolean FnParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_PARAMETER, "<fn parameter>");
    r = FnParameter_0(b, l + 1);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ Pat ':' ]
  private static boolean FnParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter_0")) return false;
    FnParameter_0_0(b, l + 1);
    return true;
  }

  // Pat ':'
  private static boolean FnParameter_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pat(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(Pat_first | ')' | '...')
  static boolean FnParameter_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !FnParameter_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pat_first | ')' | '...'
  private static boolean FnParameter_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pat_first(b, l + 1);
    if (!r) r = consumeTokenFast(b, RPAREN);
    if (!r) r = consumeTokenFast(b, DOTDOTDOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FnParameter (',' | &')')
  static boolean FnParameter_with_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter_with_recover")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = FnParameter(b, l + 1);
    p = r; // pin = 1
    r = r && FnParameter_with_recover_1(b, l + 1);
    exit_section_(b, l, m, r, p, FnParameter_recover_parser_);
    return r || p;
  }

  // ',' | &')'
  private static boolean FnParameter_with_recover_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter_with_recover_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COMMA);
    if (!r) r = FnParameter_with_recover_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &')'
  private static boolean FnParameter_with_recover_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameter_with_recover_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeTokenFast(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' !',' [ SelfParameter (',' | &')') ]
  //                                    FnParameter_with_recover* ['...' ','? ]
  //                           ')'
  public static boolean FnParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VALUE_PARAMETER_LIST, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, FnParameters_1(b, l + 1));
    r = p && report_error_(b, FnParameters_2(b, l + 1)) && r;
    r = p && report_error_(b, FnParameters_3(b, l + 1)) && r;
    r = p && report_error_(b, FnParameters_4(b, l + 1)) && r;
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !','
  private static boolean FnParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, COMMA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ SelfParameter (',' | &')') ]
  private static boolean FnParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_2")) return false;
    FnParameters_2_0(b, l + 1);
    return true;
  }

  // SelfParameter (',' | &')')
  private static boolean FnParameters_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SelfParameter(b, l + 1);
    r = r && FnParameters_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' | &')'
  private static boolean FnParameters_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = FnParameters_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &')'
  private static boolean FnParameters_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_2_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // FnParameter_with_recover*
  private static boolean FnParameters_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!FnParameter_with_recover(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FnParameters_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ['...' ','? ]
  private static boolean FnParameters_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_4")) return false;
    FnParameters_4_0(b, l + 1);
    return true;
  }

  // '...' ','?
  private static boolean FnParameters_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOTDOT);
    r = r && FnParameters_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean FnParameters_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParameters_4_0_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // [ unsafe? ExternAbi? ] fn FnTypeParameters RetType?
  public static boolean FnPointerType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnPointerType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_POINTER_TYPE, "<fn pointer type>");
    r = FnPointerType_0(b, l + 1);
    r = r && consumeToken(b, FN);
    r = r && FnTypeParameters(b, l + 1);
    r = r && FnPointerType_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ unsafe? ExternAbi? ]
  private static boolean FnPointerType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnPointerType_0")) return false;
    FnPointerType_0_0(b, l + 1);
    return true;
  }

  // unsafe? ExternAbi?
  private static boolean FnPointerType_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnPointerType_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FnPointerType_0_0_0(b, l + 1);
    r = r && FnPointerType_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unsafe?
  private static boolean FnPointerType_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnPointerType_0_0_0")) return false;
    consumeToken(b, UNSAFE);
    return true;
  }

  // ExternAbi?
  private static boolean FnPointerType_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnPointerType_0_0_1")) return false;
    ExternAbi(b, l + 1);
    return true;
  }

  // RetType?
  private static boolean FnPointerType_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnPointerType_3")) return false;
    RetType(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<variadic_params_impl AnonParameter>>
  public static boolean FnTypeParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnTypeParameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variadic_params_impl(b, l + 1, AnonParameter_parser_);
    exit_section_(b, m, VALUE_PARAMETER_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // ForLifetimes (FnPointerType | TraitRef)
  public static boolean ForInType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInType")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForLifetimes(b, l + 1);
    r = r && ForInType_1(b, l + 1);
    exit_section_(b, m, FOR_IN_TYPE, r);
    return r;
  }

  // FnPointerType | TraitRef
  private static boolean ForInType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInType_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FnPointerType(b, l + 1);
    if (!r) r = TraitRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // for '<' LifetimesParams '>'
  public static boolean ForLifetimes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForLifetimes")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR, LT);
    r = r && LifetimesParams(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, FOR_LIFETIMES, r);
    return r;
  }

  /* ********************************************************** */
  // Constant | Function | TypeAlias
  static boolean ForeignDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeignDecl")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constant(b, l + 1);
    if (!r) r = Function(b, l + 1);
    if (!r) r = TypeAlias(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttrsAndVis ExternAbi '{' InnerAttr* ForeignDecl* '}'
  public static boolean ForeignModItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeignModItem")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOREIGN_MOD_ITEM, "<foreign mod item>");
    r = AttrsAndVis(b, l + 1);
    r = r && ExternAbi(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && ForeignModItem_3(b, l + 1);
    r = r && ForeignModItem_4(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // InnerAttr*
  private static boolean ForeignModItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeignModItem_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForeignModItem_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ForeignDecl*
  private static boolean ForeignModItem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForeignModItem_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!ForeignDecl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForeignModItem_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ("format" | "format_args" | "write" | "writeln" | "print" | "println" | "eprint" | "eprintln" | "panic" | "unimplemented" | "unreachable")
  //   '!' FormatMacroArgument
  static boolean FormatLikeMacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormatLikeMacro")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = FormatLikeMacro_0(b, l + 1);
    r = r && consumeToken(b, EXCL);
    p = r; // pin = 2
    r = r && FormatMacroArgument(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "format" | "format_args" | "write" | "writeln" | "print" | "println" | "eprint" | "eprintln" | "panic" | "unimplemented" | "unreachable"
  private static boolean FormatLikeMacro_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormatLikeMacro_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "format");
    if (!r) r = consumeToken(b, "format_args");
    if (!r) r = consumeToken(b, "write");
    if (!r) r = consumeToken(b, "writeln");
    if (!r) r = consumeToken(b, "print");
    if (!r) r = consumeToken(b, "println");
    if (!r) r = consumeToken(b, "eprint");
    if (!r) r = consumeToken(b, "eprintln");
    if (!r) r = consumeToken(b, "panic");
    if (!r) r = consumeToken(b, "unimplemented");
    if (!r) r = consumeToken(b, "unreachable");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ identifier '=' ] AnyExpr
  public static boolean FormatMacroArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormatMacroArg")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAT_MACRO_ARG, "<format macro arg>");
    r = FormatMacroArg_0(b, l + 1);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ identifier '=' ]
  private static boolean FormatMacroArg_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormatMacroArg_0")) return false;
    parseTokens(b, 0, IDENTIFIER, EQ);
    return true;
  }

  /* ********************************************************** */
  // <<any_braces [ <<comma_separated_list FormatMacroArg>> ] >>
  public static boolean FormatMacroArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormatMacroArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAT_MACRO_ARGUMENT, "<format macro argument>");
    r = any_braces(b, l + 1, FormatMacroArgument_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <<comma_separated_list FormatMacroArg>> ]
  private static boolean FormatMacroArgument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FormatMacroArgument_0_0")) return false;
    comma_separated_list(b, l + 1, FormatMacroArg_parser_);
    return true;
  }

  /* ********************************************************** */
  // OuterAttr*
  //              default_?
  //              Vis?
  //              const? unsafe? ExternAbi?
  //              fn identifier
  //              TypeParameterList?
  //              FnParameters
  //              RetType?
  //              WhereClause?
  //              (';' | InnerAttrsAndBlock)
  public static boolean Function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION, "<function>");
    r = Function_0(b, l + 1);
    r = r && Function_1(b, l + 1);
    r = r && Function_2(b, l + 1);
    r = r && Function_3(b, l + 1);
    r = r && Function_4(b, l + 1);
    r = r && Function_5(b, l + 1);
    r = r && consumeTokens(b, 2, FN, IDENTIFIER);
    p = r; // pin = identifier
    r = r && report_error_(b, Function_8(b, l + 1));
    r = p && report_error_(b, FnParameters(b, l + 1)) && r;
    r = p && report_error_(b, Function_10(b, l + 1)) && r;
    r = p && report_error_(b, Function_11(b, l + 1)) && r;
    r = p && Function_12(b, l + 1) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean Function_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Function_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // default_?
  private static boolean Function_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_1")) return false;
    default_(b, l + 1);
    return true;
  }

  // Vis?
  private static boolean Function_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_2")) return false;
    Vis(b, l + 1);
    return true;
  }

  // const?
  private static boolean Function_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_3")) return false;
    consumeToken(b, CONST);
    return true;
  }

  // unsafe?
  private static boolean Function_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_4")) return false;
    consumeToken(b, UNSAFE);
    return true;
  }

  // ExternAbi?
  private static boolean Function_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_5")) return false;
    ExternAbi(b, l + 1);
    return true;
  }

  // TypeParameterList?
  private static boolean Function_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_8")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  // RetType?
  private static boolean Function_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_10")) return false;
    RetType(b, l + 1);
    return true;
  }

  // WhereClause?
  private static boolean Function_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_11")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  // ';' | InnerAttrsAndBlock
  private static boolean Function_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Function_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = InnerAttrsAndBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttrsAndVis default_? unsafe? impl TypeParameterList? ( TraitImpl | InherentImpl ) WhereClause? Members
  public static boolean ImplItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IMPL_ITEM, "<impl item>");
    r = AttrsAndVis(b, l + 1);
    r = r && ImplItem_1(b, l + 1);
    r = r && ImplItem_2(b, l + 1);
    r = r && consumeToken(b, IMPL);
    p = r; // pin = impl
    r = r && report_error_(b, ImplItem_4(b, l + 1));
    r = p && report_error_(b, ImplItem_5(b, l + 1)) && r;
    r = p && report_error_(b, ImplItem_6(b, l + 1)) && r;
    r = p && Members(b, l + 1) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // default_?
  private static boolean ImplItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplItem_1")) return false;
    default_(b, l + 1);
    return true;
  }

  // unsafe?
  private static boolean ImplItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplItem_2")) return false;
    consumeToken(b, UNSAFE);
    return true;
  }

  // TypeParameterList?
  private static boolean ImplItem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplItem_4")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  // TraitImpl | InherentImpl
  private static boolean ImplItem_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplItem_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TraitImpl(b, l + 1);
    if (!r) r = InherentImpl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WhereClause?
  private static boolean ImplItem_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplItem_6")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ImplicitTraitTypeInner
  public static boolean ImplicitTraitType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitTraitType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_TYPE, "<implicit trait type>");
    r = ImplicitTraitTypeInner(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Polybound ('+' Polybound)+
  static boolean ImplicitTraitTypeInner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitTraitTypeInner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Polybound(b, l + 1);
    r = r && ImplicitTraitTypeInner_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('+' Polybound)+
  private static boolean ImplicitTraitTypeInner_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitTraitTypeInner_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ImplicitTraitTypeInner_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!ImplicitTraitTypeInner_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ImplicitTraitTypeInner_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' Polybound
  private static boolean ImplicitTraitTypeInner_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ImplicitTraitTypeInner_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && Polybound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' Expr ']'
  static boolean IndexArg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IndexArg")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && Expr(b, l + 1, -1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeReference !for
  static boolean InherentImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InherentImpl")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeReference(b, l + 1);
    r = r && InherentImpl_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !for
  private static boolean InherentImpl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InherentImpl_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, FOR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '#' '!' '[' MetaItem ']'
  public static boolean InnerAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InnerAttr")) return false;
    if (!nextTokenIs(b, SHA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SHA, EXCL, LBRACK);
    r = r && MetaItem(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, INNER_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // '{' InnerAttr* BlockElement* '}'
  public static boolean InnerAttrsAndBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InnerAttrsAndBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, InnerAttrsAndBlock_1(b, l + 1));
    r = p && report_error_(b, InnerAttrsAndBlock_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // InnerAttr*
  private static boolean InnerAttrsAndBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InnerAttrsAndBlock_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InnerAttrsAndBlock_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // BlockElement*
  private static boolean InnerAttrsAndBlock_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "InnerAttrsAndBlock_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BlockElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "InnerAttrsAndBlock_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // Constant
  //                | TypeAlias
  //                | Function
  //                | TraitItem
  //                | ImplItem
  //                | ModItem
  //                | ModDeclItem
  //                | ForeignModItem
  //                | StructItem
  //                | EnumItem
  //                | UseItem
  //                | ExternCrateItem
  //                | MacroDefinition
  //                | MacroCall
  static boolean Item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Constant(b, l + 1);
    if (!r) r = TypeAlias(b, l + 1);
    if (!r) r = Function(b, l + 1);
    if (!r) r = TraitItem(b, l + 1);
    if (!r) r = ImplItem(b, l + 1);
    if (!r) r = ModItem(b, l + 1);
    if (!r) r = ModDeclItem(b, l + 1);
    if (!r) r = ForeignModItem(b, l + 1);
    if (!r) r = StructItem(b, l + 1);
    if (!r) r = EnumItem(b, l + 1);
    if (!r) r = UseItem(b, l + 1);
    if (!r) r = ExternCrateItem(b, l + 1);
    if (!r) r = MacroDefinition(b, l + 1);
    if (!r) r = MacroCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '#' | pub | crate | fn | const | extern | unsafe | struct | enum | use | identifier | mod | trait
  //   | static | TYPE_KW | impl | "union" | "default" | "auto" | "dyn"
  static boolean Item_first(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_first")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SHA);
    if (!r) r = consumeToken(b, PUB);
    if (!r) r = consumeToken(b, CRATE);
    if (!r) r = consumeToken(b, FN);
    if (!r) r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, EXTERN);
    if (!r) r = consumeToken(b, UNSAFE);
    if (!r) r = consumeToken(b, STRUCT);
    if (!r) r = consumeToken(b, ENUM);
    if (!r) r = consumeToken(b, USE);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, TRAIT);
    if (!r) r = consumeToken(b, STATIC);
    if (!r) r = consumeToken(b, TYPE_KW);
    if (!r) r = consumeToken(b, IMPL);
    if (!r) r = consumeToken(b, "union");
    if (!r) r = consumeToken(b, "default");
    if (!r) r = consumeToken(b, "auto");
    if (!r) r = consumeToken(b, "dyn");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('}' | Item_first )
  static boolean Item_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !Item_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}' | Item_first
  private static boolean Item_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, RBRACE);
    if (!r) r = Item_first(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('}' | <<eof>>) Item
  static boolean Item_with_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_with_recover")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = Item_with_recover_0(b, l + 1);
    p = r; // pin = 1
    r = r && Item(b, l + 1);
    exit_section_(b, l, m, r, p, Item_recover_parser_);
    return r || p;
  }

  // !('}' | <<eof>>)
  private static boolean Item_with_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_with_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !Item_with_recover_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}' | <<eof>>
  private static boolean Item_with_recover_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Item_with_recover_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, RBRACE);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Item_with_recover*
  static boolean Items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Items")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Item_with_recover(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Items", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // QUOTE_IDENTIFIER
  public static boolean Label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Label")) return false;
    if (!nextTokenIs(b, QUOTE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTE_IDENTIFIER);
    exit_section_(b, m, LABEL, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTE_IDENTIFIER ':'
  public static boolean LabelDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LabelDecl")) return false;
    if (!nextTokenIs(b, QUOTE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, QUOTE_IDENTIFIER, COLON);
    exit_section_(b, m, LABEL_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // Pat TypeAscription?
  public static boolean LambdaParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_PARAMETER, "<lambda parameter>");
    r = Pat(b, l + 1);
    r = r && LambdaParameter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypeAscription?
  private static boolean LambdaParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaParameter_1")) return false;
    TypeAscription(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '|' !',' [ <<comma_separated_list LambdaParameter>> ] '|'
  public static boolean LambdaParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaParameters")) return false;
    if (!nextTokenIs(b, OR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && LambdaParameters_1(b, l + 1);
    r = r && LambdaParameters_2(b, l + 1);
    r = r && consumeToken(b, OR);
    exit_section_(b, m, VALUE_PARAMETER_LIST, r);
    return r;
  }

  // !','
  private static boolean LambdaParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaParameters_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, COMMA);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ <<comma_separated_list LambdaParameter>> ]
  private static boolean LambdaParameters_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaParameters_2")) return false;
    comma_separated_list(b, l + 1, LambdaParameter_parser_);
    return true;
  }

  /* ********************************************************** */
  // () &'}'
  public static boolean LastExprUpper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LastExprUpper")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _UPPER_, EXPR, "<last expr upper>");
    r = LastExprUpper_0(b, l + 1);
    p = r; // pin = 1
    r = r && LastExprUpper_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ()
  private static boolean LastExprUpper_0(PsiBuilder b, int l) {
    return true;
  }

  // &'}'
  private static boolean LastExprUpper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LastExprUpper_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OuterAttr* let Pat TypeAscription? [ '=' AnyExpr ] ';'
  public static boolean LetDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetDecl")) return false;
    if (!nextTokenIs(b, "<let decl>", SHA, LET)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LET_DECL, "<let decl>");
    r = LetDecl_0(b, l + 1);
    r = r && consumeToken(b, LET);
    p = r; // pin = let
    r = r && report_error_(b, Pat(b, l + 1));
    r = p && report_error_(b, LetDecl_3(b, l + 1)) && r;
    r = p && report_error_(b, LetDecl_4(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean LetDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetDecl_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LetDecl_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TypeAscription?
  private static boolean LetDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetDecl_3")) return false;
    TypeAscription(b, l + 1);
    return true;
  }

  // [ '=' AnyExpr ]
  private static boolean LetDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetDecl_4")) return false;
    LetDecl_4_0(b, l + 1);
    return true;
  }

  // '=' AnyExpr
  private static boolean LetDecl_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LetDecl_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // QUOTE_IDENTIFIER {
  // }
  public static boolean Lifetime(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Lifetime")) return false;
    if (!nextTokenIs(b, QUOTE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUOTE_IDENTIFIER);
    r = r && Lifetime_1(b, l + 1);
    exit_section_(b, m, LIFETIME, r);
    return r;
  }

  // {
  // }
  private static boolean Lifetime_1(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // ':' Lifetime ('+' Lifetime)*
  public static boolean LifetimeParamBounds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LifetimeParamBounds")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && Lifetime(b, l + 1);
    r = r && LifetimeParamBounds_2(b, l + 1);
    exit_section_(b, m, LIFETIME_PARAM_BOUNDS, r);
    return r;
  }

  // ('+' Lifetime)*
  private static boolean LifetimeParamBounds_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LifetimeParamBounds_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!LifetimeParamBounds_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LifetimeParamBounds_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+' Lifetime
  private static boolean LifetimeParamBounds_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LifetimeParamBounds_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && Lifetime(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OuterAttr* QUOTE_IDENTIFIER LifetimeParamBounds? {
  // }
  public static boolean LifetimeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LifetimeParameter")) return false;
    if (!nextTokenIs(b, "<lifetime parameter>", SHA, QUOTE_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIFETIME_PARAMETER, "<lifetime parameter>");
    r = LifetimeParameter_0(b, l + 1);
    r = r && consumeToken(b, QUOTE_IDENTIFIER);
    r = r && LifetimeParameter_2(b, l + 1);
    r = r && LifetimeParameter_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean LifetimeParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LifetimeParameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LifetimeParameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LifetimeParamBounds?
  private static boolean LifetimeParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LifetimeParameter_2")) return false;
    LifetimeParamBounds(b, l + 1);
    return true;
  }

  // {
  // }
  private static boolean LifetimeParameter_3(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // <<list_element LifetimeParameter>>*
  static boolean LifetimesParams(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LifetimesParams")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_element(b, l + 1, LifetimeParameter_parser_)) break;
      if (!empty_element_parsed_guard_(b, "LifetimesParams", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ( "trace" | "log" | "warn" | "debug" | "error" | "info" )
  //   '!' LogMacroArgument
  static boolean LogMacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacro")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = LogMacro_0(b, l + 1);
    r = r && consumeToken(b, EXCL);
    p = r; // pin = 2
    r = r && LogMacroArgument(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // "trace" | "log" | "warn" | "debug" | "error" | "info"
  private static boolean LogMacro_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacro_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "trace");
    if (!r) r = consumeToken(b, "log");
    if (!r) r = consumeToken(b, "warn");
    if (!r) r = consumeToken(b, "debug");
    if (!r) r = consumeToken(b, "error");
    if (!r) r = consumeToken(b, "info");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<any_braces (('target' ':' Expr ','?)? (<<comma_separated_list FormatMacroArg>>)?)>>
  public static boolean LogMacroArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacroArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOG_MACRO_ARGUMENT, "<log macro argument>");
    r = any_braces(b, l + 1, LogMacroArgument_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('target' ':' Expr ','?)? (<<comma_separated_list FormatMacroArg>>)?
  private static boolean LogMacroArgument_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacroArgument_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LogMacroArgument_0_0_0(b, l + 1);
    r = r && LogMacroArgument_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('target' ':' Expr ','?)?
  private static boolean LogMacroArgument_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacroArgument_0_0_0")) return false;
    LogMacroArgument_0_0_0_0(b, l + 1);
    return true;
  }

  // 'target' ':' Expr ','?
  private static boolean LogMacroArgument_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacroArgument_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "target");
    r = r && consumeToken(b, COLON);
    r = r && Expr(b, l + 1, -1);
    r = r && LogMacroArgument_0_0_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean LogMacroArgument_0_0_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacroArgument_0_0_0_0_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // (<<comma_separated_list FormatMacroArg>>)?
  private static boolean LogMacroArgument_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LogMacroArgument_0_0_1")) return false;
    LogMacroArgument_0_0_1_0(b, l + 1);
    return true;
  }

  // <<comma_separated_list FormatMacroArg>>
  private static boolean LogMacroArgument_0_0_1_0(PsiBuilder b, int l) {
    return comma_separated_list(b, l + 1, FormatMacroArg_parser_);
  }

  /* ********************************************************** */
  // <<any_braces CompactTT>>
  public static boolean MacroArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_ARGUMENT, "<macro argument>");
    r = any_braces(b, l + 1, CompactTT_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '$' MetaVarIdentifier ':' identifier
  public static boolean MacroBinding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroBinding")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MACRO_BINDING, null);
    r = consumeToken(b, DOLLAR);
    r = r && MetaVarIdentifier(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeTokens(b, -1, COLON, IDENTIFIER));
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // '$' '(' MacroPatternContents ')' MacroBindingGroupSeparator? ('*' | '+' | '?')
  public static boolean MacroBindingGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroBindingGroup")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MACRO_BINDING_GROUP, null);
    r = consumeTokens(b, 2, DOLLAR, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, MacroPatternContents(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && report_error_(b, MacroBindingGroup_4(b, l + 1)) && r;
    r = p && MacroBindingGroup_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MacroBindingGroupSeparator?
  private static boolean MacroBindingGroup_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroBindingGroup_4")) return false;
    MacroBindingGroupSeparator(b, l + 1);
    return true;
  }

  // '*' | '+' | '?'
  private static boolean MacroBindingGroup_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroBindingGroup_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, Q);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<macroBindingGroupSeparatorToken>>
  public static boolean MacroBindingGroupSeparator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroBindingGroupSeparator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_BINDING_GROUP_SEPARATOR, "<macro binding group separator>");
    r = macroBindingGroupSeparatorToken(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MacroHead <<macroSemicolon>>
  public static boolean MacroCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroCall")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_CALL, "<macro call>");
    r = MacroHead(b, l + 1);
    r = r && macroSemicolon(b, l + 1);
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // MacroHead
  public static boolean MacroCallNoSemicolons(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroCallNoSemicolons")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_CALL_NO_SEMICOLONS, "<macro call no semicolons>");
    r = MacroHead(b, l + 1);
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AttrsAndVis "macro_rules" '!' identifier MacroDefinitionBody <<macroSemicolon>>
  public static boolean MacroDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MACRO_DEFINITION, "<macro definition>");
    r = AttrsAndVis(b, l + 1);
    r = r && consumeToken(b, "macro_rules");
    p = r; // pin = 2
    r = r && report_error_(b, consumeTokens(b, -1, EXCL, IDENTIFIER));
    r = p && report_error_(b, MacroDefinitionBody(b, l + 1)) && r;
    r = p && macroSemicolon(b, l + 1) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<any_braces (MacroDefinitionCase ';'?)*>>
  public static boolean MacroDefinitionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroDefinitionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_DEFINITION_BODY, "<macro definition body>");
    r = any_braces(b, l + 1, MacroDefinitionBody_0_0_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (MacroDefinitionCase ';'?)*
  private static boolean MacroDefinitionBody_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroDefinitionBody_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MacroDefinitionBody_0_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MacroDefinitionBody_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // MacroDefinitionCase ';'?
  private static boolean MacroDefinitionBody_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroDefinitionBody_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MacroDefinitionCase(b, l + 1);
    r = r && MacroDefinitionBody_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ';'?
  private static boolean MacroDefinitionBody_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroDefinitionBody_0_0_0_1")) return false;
    consumeToken(b, SEMICOLON);
    return true;
  }

  /* ********************************************************** */
  // MacroPattern '=>' MacroExpansion
  public static boolean MacroDefinitionCase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroDefinitionCase")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MACRO_DEFINITION_CASE, "<macro definition case>");
    r = MacroPattern(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, FAT_ARROW));
    r = p && MacroExpansion(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<any_braces MacroExpansionContents>>
  public static boolean MacroExpansion(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpansion")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_EXPANSION, "<macro expansion>");
    r = any_braces(b, l + 1, MacroExpansionContents_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (MacroExpansion | MacroReference | MacroExpansionReferenceGroup | <<unpairedToken>>)*
  public static boolean MacroExpansionContents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpansionContents")) return false;
    Marker m = enter_section_(b, l, _NONE_, MACRO_EXPANSION_CONTENTS, "<macro expansion contents>");
    int c = current_position_(b);
    while (true) {
      if (!MacroExpansionContents_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MacroExpansionContents", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // MacroExpansion | MacroReference | MacroExpansionReferenceGroup | <<unpairedToken>>
  private static boolean MacroExpansionContents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpansionContents_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MacroExpansion(b, l + 1);
    if (!r) r = MacroReference(b, l + 1);
    if (!r) r = MacroExpansionReferenceGroup(b, l + 1);
    if (!r) r = unpairedToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<macroBindingGroupSeparatorToken>>
  public static boolean MacroExpansionGroupSeparator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpansionGroupSeparator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_EXPANSION_GROUP_SEPARATOR, "<macro expansion group separator>");
    r = macroBindingGroupSeparatorToken(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '$' '(' MacroExpansionContents ')' MacroExpansionGroupSeparator? ('*' | '+' | '?')
  public static boolean MacroExpansionReferenceGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpansionReferenceGroup")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MACRO_EXPANSION_REFERENCE_GROUP, null);
    r = consumeTokens(b, 2, DOLLAR, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, MacroExpansionContents(b, l + 1));
    r = p && report_error_(b, consumeToken(b, RPAREN)) && r;
    r = p && report_error_(b, MacroExpansionReferenceGroup_4(b, l + 1)) && r;
    r = p && MacroExpansionReferenceGroup_5(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MacroExpansionGroupSeparator?
  private static boolean MacroExpansionReferenceGroup_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpansionReferenceGroup_4")) return false;
    MacroExpansionGroupSeparator(b, l + 1);
    return true;
  }

  // '*' | '+' | '?'
  private static boolean MacroExpansionReferenceGroup_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpansionReferenceGroup_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, Q);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttrsAndVis &(identifier '!') (SpecialMacro | identifier '!' identifier? MacroArgument)
  static boolean MacroHead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroHead")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AttrsAndVis(b, l + 1);
    r = r && MacroHead_1(b, l + 1);
    r = r && MacroHead_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &(identifier '!')
  private static boolean MacroHead_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroHead_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = MacroHead_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier '!'
  private static boolean MacroHead_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroHead_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EXCL);
    exit_section_(b, m, null, r);
    return r;
  }

  // SpecialMacro | identifier '!' identifier? MacroArgument
  private static boolean MacroHead_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroHead_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SpecialMacro(b, l + 1);
    if (!r) r = MacroHead_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier '!' identifier? MacroArgument
  private static boolean MacroHead_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroHead_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EXCL);
    r = r && MacroHead_2_1_2(b, l + 1);
    r = r && MacroArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier?
  private static boolean MacroHead_2_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroHead_2_1_2")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // <<any_braces MacroPatternContents >>
  public static boolean MacroPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_PATTERN, "<macro pattern>");
    r = any_braces(b, l + 1, MacroPatternContents_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (MacroPattern | MacroBinding | MacroBindingGroup | <<unpairedToken>>)*
  public static boolean MacroPatternContents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroPatternContents")) return false;
    Marker m = enter_section_(b, l, _NONE_, MACRO_PATTERN_CONTENTS, "<macro pattern contents>");
    int c = current_position_(b);
    while (true) {
      if (!MacroPatternContents_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MacroPatternContents", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // MacroPattern | MacroBinding | MacroBindingGroup | <<unpairedToken>>
  private static boolean MacroPatternContents_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroPatternContents_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MacroPattern(b, l + 1);
    if (!r) r = MacroBinding(b, l + 1);
    if (!r) r = MacroBindingGroup(b, l + 1);
    if (!r) r = unpairedToken(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '$' MetaVarIdentifier
  public static boolean MacroReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroReference")) return false;
    if (!nextTokenIs(b, DOLLAR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOLLAR);
    r = r && MetaVarIdentifier(b, l + 1);
    exit_section_(b, m, MACRO_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // OuterAttr* '|'? Pat ('|' Pat)* MatchArmGuard? '=>' StmtModeExpr (',' | (&'}' | <<isBlock>>))
  public static boolean MatchArm(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MATCH_ARM, "<match arm>");
    r = MatchArm_0(b, l + 1);
    r = r && MatchArm_1(b, l + 1);
    r = r && Pat(b, l + 1);
    p = r; // pin = 3
    r = r && report_error_(b, MatchArm_3(b, l + 1));
    r = p && report_error_(b, MatchArm_4(b, l + 1)) && r;
    r = p && report_error_(b, consumeToken(b, FAT_ARROW)) && r;
    r = p && report_error_(b, StmtModeExpr(b, l + 1)) && r;
    r = p && MatchArm_7(b, l + 1) && r;
    exit_section_(b, l, m, r, p, MatchArm_recover_parser_);
    return r || p;
  }

  // OuterAttr*
  private static boolean MatchArm_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchArm_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '|'?
  private static boolean MatchArm_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_1")) return false;
    consumeToken(b, OR);
    return true;
  }

  // ('|' Pat)*
  private static boolean MatchArm_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MatchArm_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchArm_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '|' Pat
  private static boolean MatchArm_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && Pat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MatchArmGuard?
  private static boolean MatchArm_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_4")) return false;
    MatchArmGuard(b, l + 1);
    return true;
  }

  // ',' | (&'}' | <<isBlock>>)
  private static boolean MatchArm_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = MatchArm_7_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'}' | <<isBlock>>
  private static boolean MatchArm_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_7_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MatchArm_7_1_0(b, l + 1);
    if (!r) r = isBlock(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'}'
  private static boolean MatchArm_7_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_7_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if AnyExpr
  public static boolean MatchArmGuard(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArmGuard")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, MATCH_ARM_GUARD, r);
    return r;
  }

  /* ********************************************************** */
  // !(Pat_first | OuterAttr_first | '}' | '|')
  static boolean MatchArm_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !MatchArm_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pat_first | OuterAttr_first | '}' | '|'
  private static boolean MatchArm_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchArm_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pat_first(b, l + 1);
    if (!r) r = OuterAttr_first(b, l + 1);
    if (!r) r = consumeTokenFast(b, RBRACE);
    if (!r) r = consumeTokenFast(b, OR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' MatchArm* '}'
  public static boolean MatchBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MATCH_BODY, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, MatchBody_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // MatchArm*
  private static boolean MatchBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!MatchArm(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // !'}' ( Function | Constant | TypeAlias | MacroCall )
  static boolean Member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Member")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = Member_0(b, l + 1);
    p = r; // pin = 1
    r = r && Member_1(b, l + 1);
    exit_section_(b, l, m, r, p, Member_recover_parser_);
    return r || p;
  }

  // !'}'
  private static boolean Member_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Member_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Function | Constant | TypeAlias | MacroCall
  private static boolean Member_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Member_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Function(b, l + 1);
    if (!r) r = Constant(b, l + 1);
    if (!r) r = TypeAlias(b, l + 1);
    if (!r) r = MacroCall(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('#' | Vis | extern | const | static | unsafe | fn | (identifier '!') | TYPE_KW | "default" | '}')
  static boolean Member_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Member_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !Member_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '#' | Vis | extern | const | static | unsafe | fn | (identifier '!') | TYPE_KW | "default" | '}'
  private static boolean Member_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Member_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, SHA);
    if (!r) r = Vis(b, l + 1);
    if (!r) r = consumeTokenFast(b, EXTERN);
    if (!r) r = consumeTokenFast(b, CONST);
    if (!r) r = consumeTokenFast(b, STATIC);
    if (!r) r = consumeTokenFast(b, UNSAFE);
    if (!r) r = consumeTokenFast(b, FN);
    if (!r) r = Member_recover_0_7(b, l + 1);
    if (!r) r = consumeTokenFast(b, TYPE_KW);
    if (!r) r = consumeTokenFast(b, "default");
    if (!r) r = consumeTokenFast(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier '!'
  private static boolean Member_recover_0_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Member_recover_0_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EXCL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' InnerAttr* Member* '}'
  public static boolean Members(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Members")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MEMBERS, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, Members_1(b, l + 1));
    r = p && report_error_(b, Members_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // InnerAttr*
  private static boolean Members_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Members_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Members_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Member*
  private static boolean Members_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Members_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Member(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Members_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // identifier [ '=' (LitExpr | PathIdent) | MetaItemArgs ]
  public static boolean MetaItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItem")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && MetaItem_1(b, l + 1);
    exit_section_(b, m, META_ITEM, r);
    return r;
  }

  // [ '=' (LitExpr | PathIdent) | MetaItemArgs ]
  private static boolean MetaItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItem_1")) return false;
    MetaItem_1_0(b, l + 1);
    return true;
  }

  // '=' (LitExpr | PathIdent) | MetaItemArgs
  private static boolean MetaItem_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItem_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MetaItem_1_0_0(b, l + 1);
    if (!r) r = MetaItemArgs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '=' (LitExpr | PathIdent)
  private static boolean MetaItem_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItem_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && MetaItem_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LitExpr | PathIdent
  private static boolean MetaItem_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItem_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LitExpr(b, l + 1);
    if (!r) r = PathIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' [ <<comma_separated_list (MetaItem | LitExpr)>> ] ')'
  public static boolean MetaItemArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItemArgs")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && MetaItemArgs_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, META_ITEM_ARGS, r);
    return r;
  }

  // [ <<comma_separated_list (MetaItem | LitExpr)>> ]
  private static boolean MetaItemArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItemArgs_1")) return false;
    comma_separated_list(b, l + 1, MetaItemArgs_1_0_0_parser_);
    return true;
  }

  // MetaItem | LitExpr
  private static boolean MetaItemArgs_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaItemArgs_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MetaItem(b, l + 1);
    if (!r) r = LitExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<macroIdentifier>>
  public static boolean MetaVarIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MetaVarIdentifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, META_VAR_IDENTIFIER, "<meta var identifier>");
    r = macroIdentifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ColonTypeArgumentList? ValueArgumentList
  public static boolean MethodCall(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && MethodCall_1(b, l + 1);
    r = r && ValueArgumentList(b, l + 1);
    exit_section_(b, m, METHOD_CALL, r);
    return r;
  }

  // ColonTypeArgumentList?
  private static boolean MethodCall_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodCall_1")) return false;
    ColonTypeArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // () (MethodCall | FieldLookup)
  static boolean MethodOrField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodOrField")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = MethodOrField_0(b, l + 1);
    p = r; // pin = 1
    r = r && MethodOrField_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ()
  private static boolean MethodOrField_0(PsiBuilder b, int l) {
    return true;
  }

  // MethodCall | FieldLookup
  private static boolean MethodOrField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodOrField_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MethodCall(b, l + 1);
    if (!r) r = FieldLookup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttrsAndVis mod identifier ';'
  public static boolean ModDeclItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModDeclItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MOD_DECL_ITEM, "<mod decl item>");
    r = AttrsAndVis(b, l + 1);
    r = r && consumeTokens(b, 2, MOD, IDENTIFIER, SEMICOLON);
    p = r; // pin = identifier
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // AttrsAndVis mod identifier '{' InnerAttr* Items '}'
  public static boolean ModItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MOD_ITEM, "<mod item>");
    r = AttrsAndVis(b, l + 1);
    r = r && consumeTokens(b, 3, MOD, IDENTIFIER, LBRACE);
    p = r; // pin = 4
    r = r && report_error_(b, ModItem_4(b, l + 1));
    r = p && report_error_(b, Items(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // InnerAttr*
  private static boolean ModItem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModItem_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!InnerAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ModItem_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '*' | '/' | '%'
  public static boolean MulBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulBinOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINARY_OP, "<mul bin op>");
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, REM);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<structLiterals 'OFF' <<stmtMode 'OFF' Expr>> >>
  public static boolean NoStructLitExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NoStructLitExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<no struct lit expr>");
    r = structLiterals(b, l + 1, OFF, NoStructLitExpr_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '#'     '[' MetaItem ']'
  public static boolean OuterAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OuterAttr")) return false;
    if (!nextTokenIs(b, SHA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SHA, LBRACK);
    r = r && MetaItem(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, OUTER_ATTR, r);
    return r;
  }

  /* ********************************************************** */
  // '#'
  static boolean OuterAttr_first(PsiBuilder b, int l) {
    return consumeToken(b, SHA);
  }

  /* ********************************************************** */
  // ')'
  public static boolean ParenExprUpper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenExprUpper")) return false;
    if (!nextTokenIs(b, RPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, PAREN_EXPR, null);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PatWild
  //       | PatRef
  //       | PatTup
  //       | PatVec
  //       | PatMacro
  //       | PatStruct
  //       | PatEnum
  //       | PatIdent
  //       | (PatConst !('..' | '...' | '..='))
  //       | PatRange
  //       | PatUniq
  public static boolean Pat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PAT, "<pat>");
    r = PatWild(b, l + 1);
    if (!r) r = PatRef(b, l + 1);
    if (!r) r = PatTup(b, l + 1);
    if (!r) r = PatVec(b, l + 1);
    if (!r) r = PatMacro(b, l + 1);
    if (!r) r = PatStruct(b, l + 1);
    if (!r) r = PatEnum(b, l + 1);
    if (!r) r = PatIdent(b, l + 1);
    if (!r) r = Pat_8(b, l + 1);
    if (!r) r = PatRange(b, l + 1);
    if (!r) r = PatUniq(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PatConst !('..' | '...' | '..=')
  private static boolean Pat_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatConst(b, l + 1);
    r = r && Pat_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !('..' | '...' | '..=')
  private static boolean Pat_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_8_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !Pat_8_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '..' | '...' | '..='
  private static boolean Pat_8_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_8_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOT);
    if (!r) r = consumeToken(b, DOTDOTDOT);
    if (!r) r = consumeToken(b, DOTDOTEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BindingMode? identifier !'...' !'::'
  public static boolean PatBinding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatBinding")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_BINDING, "<pat binding>");
    r = PatBinding_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && PatBinding_2(b, l + 1);
    r = r && PatBinding_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // BindingMode?
  private static boolean PatBinding_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatBinding_0")) return false;
    BindingMode(b, l + 1);
    return true;
  }

  // !'...'
  private static boolean PatBinding_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatBinding_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, DOTDOTDOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !'::'
  private static boolean PatBinding_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatBinding_3")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, COLONCOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PathExpr | LitExpr | &('-' LitExpr) UnaryExpr
  public static boolean PatConst(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatConst")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_CONST, "<pat const>");
    r = PathExpr(b, l + 1);
    if (!r) r = LitExpr(b, l + 1);
    if (!r) r = PatConst_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // &('-' LitExpr) UnaryExpr
  private static boolean PatConst_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatConst_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatConst_2_0(b, l + 1);
    r = r && UnaryExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &('-' LitExpr)
  private static boolean PatConst_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatConst_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = PatConst_2_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '-' LitExpr
  private static boolean PatConst_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatConst_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && LitExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PathGenericArgsWithColonsNoTypeQual '(' SeqPat ')'
  public static boolean PatEnum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatEnum")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_ENUM, "<pat enum>");
    r = PathGenericArgsWithColonsNoTypeQual(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && SeqPat(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ':' Pat | box? PatBinding
  public static boolean PatField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatField")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_FIELD, "<pat field>");
    r = PatField_0(b, l + 1);
    if (!r) r = PatField_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier ':' Pat
  private static boolean PatField_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatField_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && Pat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // box? PatBinding
  private static boolean PatField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatField_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatField_1_0(b, l + 1);
    r = r && PatBinding(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // box?
  private static boolean PatField_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatField_1_0")) return false;
    consumeToken(b, BOX);
    return true;
  }

  /* ********************************************************** */
  // PatField (',' | & '}')
  static boolean PatField_with_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatField_with_recover")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PatField(b, l + 1);
    r = r && PatField_with_recover_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' | & '}'
  private static boolean PatField_with_recover_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatField_with_recover_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COMMA);
    if (!r) r = PatField_with_recover_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // & '}'
  private static boolean PatField_with_recover_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatField_with_recover_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeTokenFast(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PatBinding [ '@' Pat ]
  public static boolean PatIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_IDENT, "<pat ident>");
    r = PatBinding(b, l + 1);
    r = r && PatIdent_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '@' Pat ]
  private static boolean PatIdent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatIdent_1")) return false;
    PatIdent_1_0(b, l + 1);
    return true;
  }

  // '@' Pat
  private static boolean PatIdent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatIdent_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && Pat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // MacroCallNoSemicolons
  public static boolean PatMacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatMacro")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_MACRO, "<pat macro>");
    r = MacroCallNoSemicolons(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PatConst ('..' | '...' | '..=') PatConst
  public static boolean PatRange(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatRange")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _COLLAPSE_, PAT_RANGE, "<pat range>");
    r = PatConst(b, l + 1);
    r = r && PatRange_1(b, l + 1);
    p = r; // pin = 2
    r = r && PatConst(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '..' | '...' | '..='
  private static boolean PatRange_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatRange_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOT);
    if (!r) r = consumeToken(b, DOTDOTDOT);
    if (!r) r = consumeToken(b, DOTDOTEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '&' mut? Pat
  public static boolean PatRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatRef")) return false;
    if (!nextTokenIs(b, AND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && PatRef_1(b, l + 1);
    r = r && Pat(b, l + 1);
    exit_section_(b, m, PAT_REF, r);
    return r;
  }

  // mut?
  private static boolean PatRef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatRef_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  /* ********************************************************** */
  // PathGenericArgsWithColonsNoTypeQual '{' PatField_with_recover* '..'? '}'
  public static boolean PatStruct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatStruct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_STRUCT, "<pat struct>");
    r = PathGenericArgsWithColonsNoTypeQual(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && PatStruct_2(b, l + 1);
    r = r && PatStruct_3(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PatField_with_recover*
  private static boolean PatStruct_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatStruct_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PatField_with_recover(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PatStruct_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '..'?
  private static boolean PatStruct_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatStruct_3")) return false;
    consumeToken(b, DOTDOT);
    return true;
  }

  /* ********************************************************** */
  // '(' SeqPat ')'
  public static boolean PatTup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatTup")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && SeqPat(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PAT_TUP, r);
    return r;
  }

  /* ********************************************************** */
  // box Pat
  public static boolean PatUniq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatUniq")) return false;
    if (!nextTokenIs(b, BOX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BOX);
    r = r && Pat(b, l + 1);
    exit_section_(b, m, PAT_UNIQ, r);
    return r;
  }

  /* ********************************************************** */
  // '[' SeqPat ']'
  public static boolean PatVec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatVec")) return false;
    if (!nextTokenIs(b, LBRACK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && SeqPat(b, l + 1);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, PAT_VEC, r);
    return r;
  }

  /* ********************************************************** */
  // '_'
  public static boolean PatWild(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PatWild")) return false;
    if (!nextTokenIs(b, UNDERSCORE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNDERSCORE);
    exit_section_(b, m, PAT_WILD, r);
    return r;
  }

  /* ********************************************************** */
  // '_' | '&' | '(' | '[' | Path_first | LitExpr  | box | '-' | ref | mut
  static boolean Pat_first(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_first")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, AND);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, LBRACK);
    if (!r) r = Path_first(b, l + 1);
    if (!r) r = LitExpr(b, l + 1);
    if (!r) r = consumeToken(b, BOX);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, REF);
    if (!r) r = consumeToken(b, MUT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Pat (',' | &(')' | ']' | '..'))
  static boolean Pat_with_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_with_recover")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pat(b, l + 1);
    r = r && Pat_with_recover_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' | &(')' | ']' | '..')
  private static boolean Pat_with_recover_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_with_recover_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COMMA);
    if (!r) r = Pat_with_recover_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &(')' | ']' | '..')
  private static boolean Pat_with_recover_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_with_recover_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = Pat_with_recover_1_1_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ')' | ']' | '..'
  private static boolean Pat_with_recover_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pat_with_recover_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, RPAREN);
    if (!r) r = consumeTokenFast(b, RBRACK);
    if (!r) r = consumeTokenFast(b, DOTDOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<typeQuals 'ON' <<pathMode 'COLONS' PathImpl>>>>
  public static boolean PathGenericArgsWithColons(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathGenericArgsWithColons")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATH, "<path generic args with colons>");
    r = typeQuals(b, l + 1, ON, PathGenericArgsWithColons_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<typeQuals 'OFF' <<pathMode 'COLONS' PathImpl>>>>
  public static boolean PathGenericArgsWithColonsNoTypeQual(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathGenericArgsWithColonsNoTypeQual")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATH, "<path generic args with colons no type qual>");
    r = typeQuals(b, l + 1, OFF, PathGenericArgsWithColonsNoTypeQual_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<typeQuals 'ON' <<pathMode 'NO_COLONS' PathImpl>>>>
  public static boolean PathGenericArgsWithoutColons(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathGenericArgsWithoutColons")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATH, "<path generic args without colons>");
    r = typeQuals(b, l + 1, ON, PathGenericArgsWithoutColons_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<typeQuals 'OFF' <<pathMode 'NO_COLONS' PathImpl>>>>
  public static boolean PathGenericArgsWithoutColonsNoTypeQual(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathGenericArgsWithoutColonsNoTypeQual")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATH, "<path generic args without colons no type qual>");
    r = typeQuals(b, l + 1, OFF, PathGenericArgsWithoutColonsNoTypeQual_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PathIdentInner
  public static boolean PathIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATH, "<path ident>");
    r = PathIdentInner(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !("union" identifier) identifier | self | super | 'Self'
  static boolean PathIdentInner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathIdentInner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathIdentInner_0(b, l + 1);
    if (!r) r = consumeToken(b, SELF);
    if (!r) r = consumeToken(b, SUPER);
    if (!r) r = consumeToken(b, CSELF);
    exit_section_(b, m, null, r);
    return r;
  }

  // !("union" identifier) identifier
  private static boolean PathIdentInner_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathIdentInner_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathIdentInner_0_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // !("union" identifier)
  private static boolean PathIdentInner_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathIdentInner_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !PathIdentInner_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "union" identifier
  private static boolean PathIdentInner_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathIdentInner_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "union");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PathStart PathSegment*
  static boolean PathImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathImpl")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathStart(b, l + 1);
    r = r && PathImpl_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PathSegment*
  private static boolean PathImpl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathImpl_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!PathSegment(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PathImpl_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TypeReference !'='
  public static boolean PathParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE_PARAMETER, "<path parameter>");
    r = TypeReference(b, l + 1);
    r = r && PathParameter_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !'='
  private static boolean PathParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathParameter_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, EQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' [ <<comma_separated_list PathParameter>> ] ')'
  public static boolean PathParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathParameters")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VALUE_PARAMETER_LIST, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, PathParameters_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [ <<comma_separated_list PathParameter>> ]
  private static boolean PathParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathParameters_1")) return false;
    comma_separated_list(b, l + 1, PathParameter_parser_);
    return true;
  }

  /* ********************************************************** */
  // '::' PathIdentInner PathTypeArguments?
  public static boolean PathSegment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathSegment")) return false;
    if (!nextTokenIs(b, COLONCOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, PATH, null);
    r = consumeToken(b, COLONCOLON);
    r = r && PathIdentInner(b, l + 1);
    r = r && PathSegment_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PathTypeArguments?
  private static boolean PathSegment_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathSegment_2")) return false;
    PathTypeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('::' | <<checkTypeQualAllowed>> TypeQual)? PathIdentInner PathTypeArguments?
  public static boolean PathStart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathStart")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATH, "<path start>");
    r = PathStart_0(b, l + 1);
    r = r && PathIdentInner(b, l + 1);
    r = r && PathStart_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('::' | <<checkTypeQualAllowed>> TypeQual)?
  private static boolean PathStart_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathStart_0")) return false;
    PathStart_0_0(b, l + 1);
    return true;
  }

  // '::' | <<checkTypeQualAllowed>> TypeQual
  private static boolean PathStart_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathStart_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLONCOLON);
    if (!r) r = PathStart_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<checkTypeQualAllowed>> TypeQual
  private static boolean PathStart_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathStart_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = checkTypeQualAllowed(b, l + 1);
    r = r && TypeQual(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PathTypeArguments?
  private static boolean PathStart_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathStart_2")) return false;
    PathTypeArguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<isPathMode 'COLONS'>> ColonTypeArgumentList
  //                             | <<isPathMode 'NO_COLONS '>> ( TypeArgumentList | PathParameters RetType? )
  static boolean PathTypeArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathTypeArguments")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathTypeArguments_0(b, l + 1);
    if (!r) r = PathTypeArguments_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<isPathMode 'COLONS'>> ColonTypeArgumentList
  private static boolean PathTypeArguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathTypeArguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isPathMode(b, l + 1, COLONS);
    r = r && ColonTypeArgumentList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<isPathMode 'NO_COLONS '>> ( TypeArgumentList | PathParameters RetType? )
  private static boolean PathTypeArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathTypeArguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isPathMode(b, l + 1, NO_COLONS );
    r = r && PathTypeArguments_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeArgumentList | PathParameters RetType?
  private static boolean PathTypeArguments_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathTypeArguments_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeArgumentList(b, l + 1);
    if (!r) r = PathTypeArguments_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PathParameters RetType?
  private static boolean PathTypeArguments_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathTypeArguments_1_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathParameters(b, l + 1);
    r = r && PathTypeArguments_1_1_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // RetType?
  private static boolean PathTypeArguments_1_1_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathTypeArguments_1_1_1_1")) return false;
    RetType(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<typeQuals 'OFF' <<pathMode 'NO_TYPES' PathImpl>>>>
  public static boolean PathWithoutTypes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathWithoutTypes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, PATH, "<path without types>");
    r = typeQuals(b, l + 1, OFF, PathWithoutTypes_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier | self | 'Self' | super | '::' | '<'
  static boolean Path_first(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Path_first")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, SELF);
    if (!r) r = consumeToken(b, CSELF);
    if (!r) r = consumeToken(b, SUPER);
    if (!r) r = consumeToken(b, COLONCOLON);
    if (!r) r = consumeToken(b, LT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ ForLifetimes | '?' ] Bound
  public static boolean Polybound(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Polybound")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POLYBOUND, "<polybound>");
    r = Polybound_0(b, l + 1);
    r = r && Bound(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ForLifetimes | '?' ]
  private static boolean Polybound_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Polybound_0")) return false;
    Polybound_0_0(b, l + 1);
    return true;
  }

  // ForLifetimes | '?'
  private static boolean Polybound_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Polybound_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ForLifetimes(b, l + 1);
    if (!r) r = consumeToken(b, Q);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( '&' Lifetime? mut? | '*' [ const | mut ] ) TypeReference
  public static boolean RefLikeType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType")) return false;
    if (!nextTokenIs(b, "<ref like type>", AND, MUL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, REF_LIKE_TYPE, "<ref like type>");
    r = RefLikeType_0(b, l + 1);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '&' Lifetime? mut? | '*' [ const | mut ]
  private static boolean RefLikeType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RefLikeType_0_0(b, l + 1);
    if (!r) r = RefLikeType_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&' Lifetime? mut?
  private static boolean RefLikeType_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && RefLikeType_0_0_1(b, l + 1);
    r = r && RefLikeType_0_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Lifetime?
  private static boolean RefLikeType_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType_0_0_1")) return false;
    Lifetime(b, l + 1);
    return true;
  }

  // mut?
  private static boolean RefLikeType_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType_0_0_2")) return false;
    consumeToken(b, MUT);
    return true;
  }

  // '*' [ const | mut ]
  private static boolean RefLikeType_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    r = r && RefLikeType_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ const | mut ]
  private static boolean RefLikeType_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType_0_1_1")) return false;
    RefLikeType_0_1_1_0(b, l + 1);
    return true;
  }

  // const | mut
  private static boolean RefLikeType_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RefLikeType_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONST);
    if (!r) r = consumeToken(b, MUT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('<<' | '<=') '<' | !('>>' | '>=')  '>' | lteq | gteq
  public static boolean RelCompBinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, BINARY_OP, "<rel comp bin op>");
    r = RelCompBinOp_0(b, l + 1);
    if (!r) r = RelCompBinOp_1(b, l + 1);
    if (!r) r = lteq(b, l + 1);
    if (!r) r = gteq(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !('<<' | '<=') '<'
  private static boolean RelCompBinOp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinOp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelCompBinOp_0_0(b, l + 1);
    r = r && consumeToken(b, LT);
    exit_section_(b, m, null, r);
    return r;
  }

  // !('<<' | '<=')
  private static boolean RelCompBinOp_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinOp_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !RelCompBinOp_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '<<' | '<='
  private static boolean RelCompBinOp_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinOp_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<<");
    if (!r) r = consumeToken(b, "<=");
    exit_section_(b, m, null, r);
    return r;
  }

  // !('>>' | '>=')  '>'
  private static boolean RelCompBinOp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinOp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelCompBinOp_1_0(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // !('>>' | '>=')
  private static boolean RelCompBinOp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinOp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !RelCompBinOp_1_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '>>' | '>='
  private static boolean RelCompBinOp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinOp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ">>");
    if (!r) r = consumeToken(b, ">=");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // &( [ mut | '&' '&'? ] ( identifier | '_' ) ) Pat
  static boolean RestrictedPat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RestrictedPat_0(b, l + 1);
    r = r && Pat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &( [ mut | '&' '&'? ] ( identifier | '_' ) )
  private static boolean RestrictedPat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = RestrictedPat_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ mut | '&' '&'? ] ( identifier | '_' )
  private static boolean RestrictedPat_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RestrictedPat_0_0_0(b, l + 1);
    r = r && RestrictedPat_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ mut | '&' '&'? ]
  private static boolean RestrictedPat_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat_0_0_0")) return false;
    RestrictedPat_0_0_0_0(b, l + 1);
    return true;
  }

  // mut | '&' '&'?
  private static boolean RestrictedPat_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUT);
    if (!r) r = RestrictedPat_0_0_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&' '&'?
  private static boolean RestrictedPat_0_0_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat_0_0_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && RestrictedPat_0_0_0_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&'?
  private static boolean RestrictedPat_0_0_0_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat_0_0_0_0_1_1")) return false;
    consumeToken(b, AND);
    return true;
  }

  // identifier | '_'
  private static boolean RestrictedPat_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RestrictedPat_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, UNDERSCORE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '->' TypeReferenceNoImplicitTraitType
  public static boolean RetType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RetType")) return false;
    if (!nextTokenIs(b, ARROW)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RET_TYPE, null);
    r = consumeToken(b, ARROW);
    p = r; // pin = 1
    r = r && TypeReferenceNoImplicitTraitType(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // ScalarTypeReferenceInner
  public static boolean ScalarTypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScalarTypeReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE_REFERENCE, "<scalar type reference>");
    r = ScalarTypeReferenceInner(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayType
  //                                    | RefLikeType
  //                                    | FnPointerType
  //                                    | BaseType
  //                                    | <<tupleOrParenType ScalarTypeReferenceInner TupleType_upper>>
  //                                    | ForInType
  static boolean ScalarTypeReferenceInner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ScalarTypeReferenceInner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayType(b, l + 1);
    if (!r) r = RefLikeType(b, l + 1);
    if (!r) r = FnPointerType(b, l + 1);
    if (!r) r = BaseType(b, l + 1);
    if (!r) r = tupleOrParenType(b, l + 1, ScalarTypeReferenceInner_parser_, TupleType_upper_parser_);
    if (!r) r = ForInType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ '&' Lifetime? ] mut? self TypeAscription? {
  // }
  public static boolean SelfParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELF_PARAMETER, "<self parameter>");
    r = SelfParameter_0(b, l + 1);
    r = r && SelfParameter_1(b, l + 1);
    r = r && consumeToken(b, SELF);
    r = r && SelfParameter_3(b, l + 1);
    r = r && SelfParameter_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '&' Lifetime? ]
  private static boolean SelfParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfParameter_0")) return false;
    SelfParameter_0_0(b, l + 1);
    return true;
  }

  // '&' Lifetime?
  private static boolean SelfParameter_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfParameter_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && SelfParameter_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Lifetime?
  private static boolean SelfParameter_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfParameter_0_0_1")) return false;
    Lifetime(b, l + 1);
    return true;
  }

  // mut?
  private static boolean SelfParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfParameter_1")) return false;
    consumeToken(b, MUT);
    return true;
  }

  // TypeAscription?
  private static boolean SelfParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SelfParameter_3")) return false;
    TypeAscription(b, l + 1);
    return true;
  }

  // {
  // }
  private static boolean SelfParameter_4(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // Pat_with_recover* ['..' [',' Pat_with_recover+] ]
  static boolean SeqPat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqPat")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SeqPat_0(b, l + 1);
    r = r && SeqPat_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pat_with_recover*
  private static boolean SeqPat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqPat_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!Pat_with_recover(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SeqPat_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ['..' [',' Pat_with_recover+] ]
  private static boolean SeqPat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqPat_1")) return false;
    SeqPat_1_0(b, l + 1);
    return true;
  }

  // '..' [',' Pat_with_recover+]
  private static boolean SeqPat_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqPat_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOT);
    r = r && SeqPat_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [',' Pat_with_recover+]
  private static boolean SeqPat_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqPat_1_0_1")) return false;
    SeqPat_1_0_1_0(b, l + 1);
    return true;
  }

  // ',' Pat_with_recover+
  private static boolean SeqPat_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqPat_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && SeqPat_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // Pat_with_recover+
  private static boolean SeqPat_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SeqPat_1_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pat_with_recover(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!Pat_with_recover(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SeqPat_1_0_1_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' BlockElement* '}'
  public static boolean SimpleBlock(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleBlock")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, SimpleBlock_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // BlockElement*
  private static boolean SimpleBlock_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SimpleBlock_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!BlockElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SimpleBlock_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // TryMacro | FormatLikeMacro | AssertMacro | VecMacro | LogMacro
  static boolean SpecialMacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SpecialMacro")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TryMacro(b, l + 1);
    if (!r) r = FormatLikeMacro(b, l + 1);
    if (!r) r = AssertMacro(b, l + 1);
    if (!r) r = VecMacro(b, l + 1);
    if (!r) r = LogMacro(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LetDecl | EmptyStmt | never ';'
  public static boolean Stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, STMT, "<stmt>");
    r = LetDecl(b, l + 1);
    if (!r) r = EmptyStmt(b, l + 1);
    if (!r) r = Stmt_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never ';'
  private static boolean Stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<structLiterals 'ON' <<stmtMode 'ON' Expr>> >>
  public static boolean StmtModeExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StmtModeExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<stmt mode expr>");
    r = structLiterals(b, l + 1, ON, StmtModeExpr_0_1_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<stmtMode 'OFF' Expr>>
  public static boolean StmtModeExprOff(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StmtModeExprOff")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<stmt mode expr off>");
    r = stmtMode(b, l + 1, OFF, Expr_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // AttrsAndVis (struct | union) identifier TypeParameterList?
  //                ( TupleStructTail | BlockStructTail | UnitStructTail )
  public static boolean StructItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_ITEM, "<struct item>");
    r = AttrsAndVis(b, l + 1);
    r = r && StructItem_1(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, consumeToken(b, IDENTIFIER));
    r = p && report_error_(b, StructItem_3(b, l + 1)) && r;
    r = p && StructItem_4(b, l + 1) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // struct | union
  private static boolean StructItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructItem_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRUCT);
    if (!r) r = union(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeParameterList?
  private static boolean StructItem_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructItem_3")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  // TupleStructTail | BlockStructTail | UnitStructTail
  private static boolean StructItem_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructItem_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TupleStructTail(b, l + 1);
    if (!r) r = BlockStructTail(b, l + 1);
    if (!r) r = UnitStructTail(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' StructLiteralField_with_recover* ('..'  AnyExpr)? '}'
  public static boolean StructLiteralBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralBody")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_LITERAL_BODY, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, StructLiteralBody_1(b, l + 1));
    r = p && report_error_(b, StructLiteralBody_2(b, l + 1)) && r;
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // StructLiteralField_with_recover*
  private static boolean StructLiteralBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!StructLiteralField_with_recover(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructLiteralBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ('..'  AnyExpr)?
  private static boolean StructLiteralBody_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralBody_2")) return false;
    StructLiteralBody_2_0(b, l + 1);
    return true;
  }

  // '..'  AnyExpr
  private static boolean StructLiteralBody_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralBody_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOT);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OuterAttr* identifier [ ':' AnyExpr ]
  public static boolean StructLiteralField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField")) return false;
    if (!nextTokenIs(b, "<struct literal field>", SHA, IDENTIFIER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_LITERAL_FIELD, "<struct literal field>");
    r = StructLiteralField_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    p = r; // pin = 2
    r = r && StructLiteralField_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean StructLiteralField_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructLiteralField_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [ ':' AnyExpr ]
  private static boolean StructLiteralField_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_2")) return false;
    StructLiteralField_2_0(b, l + 1);
    return true;
  }

  // ':' AnyExpr
  private static boolean StructLiteralField_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(identifier | ',' | '}' | '..' | '#')
  static boolean StructLiteralField_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !StructLiteralField_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier | ',' | '}' | '..' | '#'
  private static boolean StructLiteralField_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, IDENTIFIER);
    if (!r) r = consumeTokenFast(b, COMMA);
    if (!r) r = consumeTokenFast(b, RBRACE);
    if (!r) r = consumeTokenFast(b, DOTDOT);
    if (!r) r = consumeTokenFast(b, SHA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // StructLiteralField (',' | &'}')
  static boolean StructLiteralField_with_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_with_recover")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = StructLiteralField(b, l + 1);
    p = r; // pin = 1
    r = r && StructLiteralField_with_recover_1(b, l + 1);
    exit_section_(b, l, m, r, p, StructLiteralField_recover_parser_);
    return r || p;
  }

  // ',' | &'}'
  private static boolean StructLiteralField_with_recover_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_with_recover_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COMMA);
    if (!r) r = StructLiteralField_with_recover_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'}'
  private static boolean StructLiteralField_with_recover_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteralField_with_recover_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeTokenFast(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<any_braces TT*>> | <<unpairedToken>>
  public static boolean TT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TT, "<tt>");
    r = any_braces(b, l + 1, TT_0_0_parser_);
    if (!r) r = unpairedToken(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TT*
  private static boolean TT_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TT_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TT(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TT_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // '!'? TraitRef for ('..' | TypeReference)
  static boolean TraitImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitImpl")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = TraitImpl_0(b, l + 1);
    r = r && TraitRef(b, l + 1);
    r = r && consumeToken(b, FOR);
    p = r; // pin = 3
    r = r && TraitImpl_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // '!'?
  private static boolean TraitImpl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitImpl_0")) return false;
    consumeToken(b, EXCL);
    return true;
  }

  // '..' | TypeReference
  private static boolean TraitImpl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitImpl_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOTDOT);
    if (!r) r = TypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AttrsAndVis unsafe? auto? trait identifier TypeParameterList? TypeParamBounds? WhereClause? Members
  public static boolean TraitItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_ITEM, "<trait item>");
    r = AttrsAndVis(b, l + 1);
    r = r && TraitItem_1(b, l + 1);
    r = r && TraitItem_2(b, l + 1);
    r = r && consumeTokens(b, 1, TRAIT, IDENTIFIER);
    p = r; // pin = trait
    r = r && report_error_(b, TraitItem_5(b, l + 1));
    r = p && report_error_(b, TraitItem_6(b, l + 1)) && r;
    r = p && report_error_(b, TraitItem_7(b, l + 1)) && r;
    r = p && Members(b, l + 1) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // unsafe?
  private static boolean TraitItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitItem_1")) return false;
    consumeToken(b, UNSAFE);
    return true;
  }

  // auto?
  private static boolean TraitItem_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitItem_2")) return false;
    auto(b, l + 1);
    return true;
  }

  // TypeParameterList?
  private static boolean TraitItem_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitItem_5")) return false;
    TypeParameterList(b, l + 1);
    return true;
  }

  // TypeParamBounds?
  private static boolean TraitItem_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitItem_6")) return false;
    TypeParamBounds(b, l + 1);
    return true;
  }

  // WhereClause?
  private static boolean TraitItem_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitItem_7")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // PathGenericArgsWithoutColonsNoTypeQual
  public static boolean TraitRef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitRef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRAIT_REF, "<trait ref>");
    r = PathGenericArgsWithoutColonsNoTypeQual(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('+' Polybound)+
  static boolean TraitType_upper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitType_upper")) return false;
    if (!nextTokenIs(b, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TraitType_upper_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!TraitType_upper_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TraitType_upper", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' Polybound
  private static boolean TraitType_upper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TraitType_upper_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && Polybound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TrivialBaseTypeInner
  public static boolean TrivialBaseType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TrivialBaseType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASE_TYPE, "<trivial base type>");
    r = TrivialBaseTypeInner(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' ')' | '_' | '!'
  static boolean TrivialBaseTypeInner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TrivialBaseTypeInner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, LPAREN, RPAREN);
    if (!r) r = consumeToken(b, UNDERSCORE);
    if (!r) r = consumeToken(b, EXCL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "try" '!' TryMacroArgument
  static boolean TryMacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryMacro")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "try");
    r = r && consumeToken(b, EXCL);
    p = r; // pin = 2
    r = r && TryMacroArgument(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<any_braces AnyExpr>>
  public static boolean TryMacroArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryMacroArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRY_MACRO_ARGUMENT, "<try macro argument>");
    r = any_braces(b, l + 1, AnyExpr_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ',' [ AnyExpr (',' AnyExpr)* ','? ] ')'
  public static boolean TupleExprUpper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExprUpper")) return false;
    if (!nextTokenIs(b, COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _UPPER_, TUPLE_EXPR, null);
    r = consumeToken(b, COMMA);
    r = r && TupleExprUpper_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ AnyExpr (',' AnyExpr)* ','? ]
  private static boolean TupleExprUpper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExprUpper_1")) return false;
    TupleExprUpper_1_0(b, l + 1);
    return true;
  }

  // AnyExpr (',' AnyExpr)* ','?
  private static boolean TupleExprUpper_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExprUpper_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AnyExpr(b, l + 1);
    r = r && TupleExprUpper_1_0_1(b, l + 1);
    r = r && TupleExprUpper_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' AnyExpr)*
  private static boolean TupleExprUpper_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExprUpper_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TupleExprUpper_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleExprUpper_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' AnyExpr
  private static boolean TupleExprUpper_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExprUpper_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean TupleExprUpper_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExprUpper_1_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis TypeReference
  public static boolean TupleFieldDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleFieldDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_FIELD_DECL, "<tuple field decl>");
    r = AttrsAndVis(b, l + 1);
    r = r && TypeReference(b, l + 1);
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, false, TupleField_recover_parser_);
    return r;
  }

  /* ********************************************************** */
  // !(')' | ',')
  static boolean TupleField_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleField_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !TupleField_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ')' | ','
  private static boolean TupleField_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleField_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, RPAREN);
    if (!r) r = consumeTokenFast(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' (TupleFieldDecl (',' | &')'))* ')'
  public static boolean TupleFields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleFields")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_FIELDS, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, TupleFields_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (TupleFieldDecl (',' | &')'))*
  private static boolean TupleFields_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleFields_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TupleFields_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleFields_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TupleFieldDecl (',' | &')')
  private static boolean TupleFields_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleFields_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TupleFieldDecl(b, l + 1);
    r = r && TupleFields_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' | &')'
  private static boolean TupleFields_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleFields_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = TupleFields_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &')'
  private static boolean TupleFields_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleFields_1_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TupleFields WhereClause? ';'
  static boolean TupleStructTail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStructTail")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = TupleFields(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, TupleStructTail_1(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // WhereClause?
  private static boolean TupleStructTail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleStructTail_1")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' [ <<comma_separated_list TypeReference>> ] ')'
  public static boolean TupleType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && TupleType_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TUPLE_TYPE, r);
    return r;
  }

  // [ <<comma_separated_list TypeReference>> ]
  private static boolean TupleType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_1")) return false;
    comma_separated_list(b, l + 1, TypeReference_parser_);
    return true;
  }

  /* ********************************************************** */
  // (',' TypeReference)* ','? ')'
  static boolean TupleType_upper(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_upper")) return false;
    if (!nextTokenIs(b, "", RPAREN, COMMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TupleType_upper_0(b, l + 1);
    r = r && TupleType_upper_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' TypeReference)*
  private static boolean TupleType_upper_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_upper_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TupleType_upper_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleType_upper_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' TypeReference
  private static boolean TupleType_upper_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_upper_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean TupleType_upper_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleType_upper_1")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // OuterAttr* default_? Vis? TYPE_KW identifier
  //               [ TypeParameterList WhereClause? | WhereClause | TypeParamBounds ]
  //               [ '=' TypeReference ] ';'
  public static boolean TypeAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ALIAS, "<type alias>");
    r = TypeAlias_0(b, l + 1);
    r = r && TypeAlias_1(b, l + 1);
    r = r && TypeAlias_2(b, l + 1);
    r = r && consumeTokens(b, 2, TYPE_KW, IDENTIFIER);
    p = r; // pin = identifier
    r = r && report_error_(b, TypeAlias_5(b, l + 1));
    r = p && report_error_(b, TypeAlias_6(b, l + 1)) && r;
    r = p && consumeToken(b, SEMICOLON) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean TypeAlias_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeAlias_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // default_?
  private static boolean TypeAlias_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_1")) return false;
    default_(b, l + 1);
    return true;
  }

  // Vis?
  private static boolean TypeAlias_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_2")) return false;
    Vis(b, l + 1);
    return true;
  }

  // [ TypeParameterList WhereClause? | WhereClause | TypeParamBounds ]
  private static boolean TypeAlias_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_5")) return false;
    TypeAlias_5_0(b, l + 1);
    return true;
  }

  // TypeParameterList WhereClause? | WhereClause | TypeParamBounds
  private static boolean TypeAlias_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeAlias_5_0_0(b, l + 1);
    if (!r) r = WhereClause(b, l + 1);
    if (!r) r = TypeParamBounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TypeParameterList WhereClause?
  private static boolean TypeAlias_5_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_5_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeParameterList(b, l + 1);
    r = r && TypeAlias_5_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WhereClause?
  private static boolean TypeAlias_5_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_5_0_0_1")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  // [ '=' TypeReference ]
  private static boolean TypeAlias_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_6")) return false;
    TypeAlias_6_0(b, l + 1);
    return true;
  }

  // '=' TypeReference
  private static boolean TypeAlias_6_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_6_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeArgumentListImpl
  public static boolean TypeArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentList")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeArgumentListImpl(b, l + 1);
    exit_section_(b, m, TYPE_ARGUMENT_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // '<' !'=' ( <<list_element Lifetime>>*
  //                                             <<list_element (!(identifier '=') TypeReference)>>*
  //                                             <<list_element AssocTypeBinding>>*) '>'
  static boolean TypeArgumentListImpl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LT);
    r = r && TypeArgumentListImpl_1(b, l + 1);
    p = r; // pin = 2
    r = r && report_error_(b, TypeArgumentListImpl_2(b, l + 1));
    r = p && consumeToken(b, GT) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !'='
  private static boolean TypeArgumentListImpl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, EQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<list_element Lifetime>>*
  //                                             <<list_element (!(identifier '=') TypeReference)>>*
  //                                             <<list_element AssocTypeBinding>>*
  private static boolean TypeArgumentListImpl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeArgumentListImpl_2_0(b, l + 1);
    r = r && TypeArgumentListImpl_2_1(b, l + 1);
    r = r && TypeArgumentListImpl_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<list_element Lifetime>>*
  private static boolean TypeArgumentListImpl_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_2_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_element(b, l + 1, Lifetime_parser_)) break;
      if (!empty_element_parsed_guard_(b, "TypeArgumentListImpl_2_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // <<list_element (!(identifier '=') TypeReference)>>*
  private static boolean TypeArgumentListImpl_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_2_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_element(b, l + 1, TypeArgumentListImpl_2_1_0_0_parser_)) break;
      if (!empty_element_parsed_guard_(b, "TypeArgumentListImpl_2_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !(identifier '=') TypeReference
  private static boolean TypeArgumentListImpl_2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_2_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeArgumentListImpl_2_1_0_0_0(b, l + 1);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(identifier '=')
  private static boolean TypeArgumentListImpl_2_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_2_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !TypeArgumentListImpl_2_1_0_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // identifier '='
  private static boolean TypeArgumentListImpl_2_1_0_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_2_1_0_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, EQ);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<list_element AssocTypeBinding>>*
  private static boolean TypeArgumentListImpl_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeArgumentListImpl_2_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_element(b, l + 1, AssocTypeBinding_parser_)) break;
      if (!empty_element_parsed_guard_(b, "TypeArgumentListImpl_2_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ':' TypeReference
  static boolean TypeAscription(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAscription")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ':' [ Polybound ('+' Polybound)* '+'? ]
  public static boolean TypeParamBounds(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParamBounds")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeParamBounds_1(b, l + 1);
    exit_section_(b, m, TYPE_PARAM_BOUNDS, r);
    return r;
  }

  // [ Polybound ('+' Polybound)* '+'? ]
  private static boolean TypeParamBounds_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParamBounds_1")) return false;
    TypeParamBounds_1_0(b, l + 1);
    return true;
  }

  // Polybound ('+' Polybound)* '+'?
  private static boolean TypeParamBounds_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParamBounds_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Polybound(b, l + 1);
    r = r && TypeParamBounds_1_0_1(b, l + 1);
    r = r && TypeParamBounds_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('+' Polybound)*
  private static boolean TypeParamBounds_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParamBounds_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!TypeParamBounds_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeParamBounds_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '+' Polybound
  private static boolean TypeParamBounds_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParamBounds_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && Polybound(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+'?
  private static boolean TypeParamBounds_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParamBounds_1_0_2")) return false;
    consumeToken(b, PLUS);
    return true;
  }

  /* ********************************************************** */
  // OuterAttr* identifier TypeParamBounds? [ '=' TypeReference ] {
  // }
  public static boolean TypeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter")) return false;
    if (!nextTokenIs(b, "<type parameter>", SHA, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_PARAMETER, "<type parameter>");
    r = TypeParameter_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && TypeParameter_2(b, l + 1);
    r = r && TypeParameter_3(b, l + 1);
    r = r && TypeParameter_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean TypeParameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeParameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TypeParamBounds?
  private static boolean TypeParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_2")) return false;
    TypeParamBounds(b, l + 1);
    return true;
  }

  // [ '=' TypeReference ]
  private static boolean TypeParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_3")) return false;
    TypeParameter_3_0(b, l + 1);
    return true;
  }

  // '=' TypeReference
  private static boolean TypeParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && TypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // {
  // }
  private static boolean TypeParameter_4(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // '<' <<list_element (LifetimeParameter | TypeParameter)>>* '>'
  public static boolean TypeParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeParameterList_1(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, TYPE_PARAMETER_LIST, r);
    return r;
  }

  // <<list_element (LifetimeParameter | TypeParameter)>>*
  private static boolean TypeParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!list_element(b, l + 1, TypeParameterList_1_0_0_parser_)) break;
      if (!empty_element_parsed_guard_(b, "TypeParameterList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LifetimeParameter | TypeParameter
  private static boolean TypeParameterList_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeParameterList_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LifetimeParameter(b, l + 1);
    if (!r) r = TypeParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<' TypeReference [ as TraitRef] '>' '::'
  public static boolean TypeQual(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeQual")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeReference(b, l + 1);
    r = r && TypeQual_2(b, l + 1);
    r = r && consumeTokens(b, 0, GT, COLONCOLON);
    exit_section_(b, m, TYPE_QUAL, r);
    return r;
  }

  // [ as TraitRef]
  private static boolean TypeQual_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeQual_2")) return false;
    TypeQual_2_0(b, l + 1);
    return true;
  }

  // as TraitRef
  private static boolean TypeQual_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeQual_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AS);
    r = r && TraitRef(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeReferenceInner
  public static boolean TypeReference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeReference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE_REFERENCE, "<type reference>");
    r = TypeReferenceInner(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayType
  //                                | RefLikeType
  //                                | FnPointerType
  //                                // External rule to find the difference between `(T)` and `(T,)`
  //                                | <<tupleOrParenType TypeReferenceInner TupleType_upper>>
  //                                | ExplicitTraitType
  //                                | TrivialBaseType
  //                                // External rule to find the difference between `T` and `T+T`
  //                                | <<baseOrTraitType PathGenericArgsWithoutColons ImplicitTraitType TraitType_upper>>
  //                                | ForInType
  static boolean TypeReferenceInner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeReferenceInner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayType(b, l + 1);
    if (!r) r = RefLikeType(b, l + 1);
    if (!r) r = FnPointerType(b, l + 1);
    if (!r) r = tupleOrParenType(b, l + 1, TypeReferenceInner_parser_, TupleType_upper_parser_);
    if (!r) r = ExplicitTraitType(b, l + 1);
    if (!r) r = TrivialBaseType(b, l + 1);
    if (!r) r = baseOrTraitType(b, l + 1, PathGenericArgsWithoutColons_parser_, ImplicitTraitType_parser_, TraitType_upper_parser_);
    if (!r) r = ForInType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TypeReferenceNoImplicitTraitTypeInner
  public static boolean TypeReferenceNoImplicitTraitType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeReferenceNoImplicitTraitType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, TYPE_REFERENCE, "<type reference no implicit trait type>");
    r = TypeReferenceNoImplicitTraitTypeInner(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ArrayType
  //                                | RefLikeType
  //                                | FnPointerType
  //                                // External rule to find the difference between `(T)` and `(T,)`
  //                                | <<tupleOrParenType TypeReferenceInner TupleType_upper>>
  //                                | ExplicitTraitType
  //                                | BaseType
  //                                | ForInType
  static boolean TypeReferenceNoImplicitTraitTypeInner(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeReferenceNoImplicitTraitTypeInner")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ArrayType(b, l + 1);
    if (!r) r = RefLikeType(b, l + 1);
    if (!r) r = FnPointerType(b, l + 1);
    if (!r) r = tupleOrParenType(b, l + 1, TypeReferenceInner_parser_, TupleType_upper_parser_);
    if (!r) r = ExplicitTraitType(b, l + 1);
    if (!r) r = BaseType(b, l + 1);
    if (!r) r = ForInType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // WhereClause? ';'
  static boolean UnitStructTail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitStructTail")) return false;
    if (!nextTokenIs(b, "", SEMICOLON, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnitStructTail_0(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // WhereClause?
  private static boolean UnitStructTail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitStructTail_0")) return false;
    WhereClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' UseSpeck_with_recover* '}'
  public static boolean UseGroup(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseGroup")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USE_GROUP, null);
    r = consumeToken(b, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, UseGroup_1(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // UseSpeck_with_recover*
  private static boolean UseGroup_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseGroup_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!UseSpeck_with_recover(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UseGroup_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // AttrsAndVis use UseSpeck ';'
  public static boolean UseItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseItem")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, USE_ITEM, "<use item>");
    r = AttrsAndVis(b, l + 1);
    r = r && consumeToken(b, USE);
    p = r; // pin = use
    r = r && report_error_(b, UseSpeck(b, l + 1));
    r = p && consumeToken(b, SEMICOLON) && r;
    register_hook_(b, LEFT_BINDER, ADJACENT_LINE_COMMENTS);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // PathWithoutTypes [ Alias | '::' UseSpeckProjection ]
  //            | '::'? UseSpeckProjection
  public static boolean UseSpeck(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, USE_SPECK, "<use speck>");
    r = UseSpeck_0(b, l + 1);
    if (!r) r = UseSpeck_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PathWithoutTypes [ Alias | '::' UseSpeckProjection ]
  private static boolean UseSpeck_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PathWithoutTypes(b, l + 1);
    r = r && UseSpeck_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ Alias | '::' UseSpeckProjection ]
  private static boolean UseSpeck_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_0_1")) return false;
    UseSpeck_0_1_0(b, l + 1);
    return true;
  }

  // Alias | '::' UseSpeckProjection
  private static boolean UseSpeck_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Alias(b, l + 1);
    if (!r) r = UseSpeck_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '::' UseSpeckProjection
  private static boolean UseSpeck_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLONCOLON);
    r = r && UseSpeckProjection(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '::'? UseSpeckProjection
  private static boolean UseSpeck_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UseSpeck_1_0(b, l + 1);
    r = r && UseSpeckProjection(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '::'?
  private static boolean UseSpeck_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_1_0")) return false;
    consumeToken(b, COLONCOLON);
    return true;
  }

  /* ********************************************************** */
  // '*' | UseGroup
  static boolean UseSpeckProjection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeckProjection")) return false;
    if (!nextTokenIs(b, "", MUL, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    if (!r) r = UseGroup(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !('}' | self | identifier | '::' | '*' )
  static boolean UseSpeck_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !UseSpeck_recover_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '}' | self | identifier | '::' | '*'
  private static boolean UseSpeck_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, RBRACE);
    if (!r) r = consumeTokenFast(b, SELF);
    if (!r) r = consumeTokenFast(b, IDENTIFIER);
    if (!r) r = consumeTokenFast(b, COLONCOLON);
    if (!r) r = consumeTokenFast(b, MUL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !'}' UseSpeck (','|&'}')
  static boolean UseSpeck_with_recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_with_recover")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = UseSpeck_with_recover_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, UseSpeck(b, l + 1));
    r = p && UseSpeck_with_recover_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, UseSpeck_recover_parser_);
    return r || p;
  }

  // !'}'
  private static boolean UseSpeck_with_recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_with_recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeTokenFast(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ','|&'}'
  private static boolean UseSpeck_with_recover_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_with_recover_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenFast(b, COMMA);
    if (!r) r = UseSpeck_with_recover_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'}'
  private static boolean UseSpeck_with_recover_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseSpeck_with_recover_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeTokenFast(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' <<comma_separated_list AnyExpr>>? ')'
  public static boolean ValueArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueArgumentList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VALUE_ARGUMENT_LIST, null);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, ValueArgumentList_1(b, l + 1));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // <<comma_separated_list AnyExpr>>?
  private static boolean ValueArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ValueArgumentList_1")) return false;
    comma_separated_list(b, l + 1, AnyExpr_parser_);
    return true;
  }

  /* ********************************************************** */
  // BlockFields | TupleFields | VariantDiscriminant
  static boolean VariantArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariantArgs")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BlockFields(b, l + 1);
    if (!r) r = TupleFields(b, l + 1);
    if (!r) r = VariantDiscriminant(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' AnyExpr
  public static boolean VariantDiscriminant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VariantDiscriminant")) return false;
    if (!nextTokenIs(b, EQ)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIANT_DISCRIMINANT, null);
    r = consumeToken(b, EQ);
    p = r; // pin = 1
    r = r && AnyExpr(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // "vec" '!' VecMacroArgument
  static boolean VecMacro(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VecMacro")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, "vec");
    r = r && consumeToken(b, EXCL);
    p = r; // pin = 2
    r = r && VecMacroArgument(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // <<any_braces ArrayInitializer >>
  public static boolean VecMacroArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VecMacroArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VEC_MACRO_ARGUMENT, "<vec macro argument>");
    r = any_braces(b, l + 1, ArrayInitializer_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // crate | pub VisRestriction?
  public static boolean Vis(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Vis")) return false;
    if (!nextTokenIs(b, "<vis>", CRATE, PUB)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VIS, "<vis>");
    r = consumeToken(b, CRATE);
    if (!r) r = Vis_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pub VisRestriction?
  private static boolean Vis_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Vis_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PUB);
    r = r && Vis_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VisRestriction?
  private static boolean Vis_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Vis_1_1")) return false;
    VisRestriction(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' ( crate | ((&(self ')' | super ')') | in) PathWithoutTypes) ) ')'
  public static boolean VisRestriction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisRestriction")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && VisRestriction_1(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, VIS_RESTRICTION, r);
    return r;
  }

  // crate | ((&(self ')' | super ')') | in) PathWithoutTypes)
  private static boolean VisRestriction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisRestriction_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CRATE);
    if (!r) r = VisRestriction_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (&(self ')' | super ')') | in) PathWithoutTypes
  private static boolean VisRestriction_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisRestriction_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VisRestriction_1_1_0(b, l + 1);
    r = r && PathWithoutTypes(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &(self ')' | super ')') | in
  private static boolean VisRestriction_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisRestriction_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VisRestriction_1_1_0_0(b, l + 1);
    if (!r) r = consumeToken(b, IN);
    exit_section_(b, m, null, r);
    return r;
  }

  // &(self ')' | super ')')
  private static boolean VisRestriction_1_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisRestriction_1_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = VisRestriction_1_1_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // self ')' | super ')'
  private static boolean VisRestriction_1_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VisRestriction_1_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, SELF, RPAREN);
    if (!r) r = parseTokens(b, 0, SUPER, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // where <<comma_separated_list WherePred>>?
  public static boolean WhereClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereClause")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && WhereClause_1(b, l + 1);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
  }

  // <<comma_separated_list WherePred>>?
  private static boolean WhereClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhereClause_1")) return false;
    comma_separated_list(b, l + 1, WherePred_parser_);
    return true;
  }

  /* ********************************************************** */
  // Lifetime LifetimeParamBounds | ForLifetimes? TypeReference TypeParamBounds
  public static boolean WherePred(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WherePred")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHERE_PRED, "<where pred>");
    r = WherePred_0(b, l + 1);
    if (!r) r = WherePred_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Lifetime LifetimeParamBounds
  private static boolean WherePred_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WherePred_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Lifetime(b, l + 1);
    r = r && LifetimeParamBounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ForLifetimes? TypeReference TypeParamBounds
  private static boolean WherePred_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WherePred_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = WherePred_1_0(b, l + 1);
    r = r && TypeReference(b, l + 1);
    r = r && TypeParamBounds(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ForLifetimes?
  private static boolean WherePred_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WherePred_1_0")) return false;
    ForLifetimes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // <<andandImpl>>  | never ANDAND
  static boolean andand(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andand")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<&&>");
    r = andandImpl(b, l + 1);
    if (!r) r = andand_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never ANDAND
  private static boolean andand_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andand_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, ANDAND);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <<param>> ')'
  // | '{' <<param>> '}'
  // | '[' <<param>> ']'
  static boolean any_braces(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "any_braces")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = any_braces_0(b, l + 1, _param);
    if (!r) r = any_braces_1(b, l + 1, _param);
    if (!r) r = any_braces_2(b, l + 1, _param);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' <<param>> ')'
  private static boolean any_braces_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "any_braces_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' <<param>> '}'
  private static boolean any_braces_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "any_braces_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' <<param>> ']'
  private static boolean any_braces_2(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "any_braces_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACK);
    r = r && _param.parse(b, l);
    r = r && consumeToken(b, RBRACK);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<autoKeyword>>
  static boolean auto(PsiBuilder b, int l) {
    return autoKeyword(b, l + 1);
  }

  /* ********************************************************** */
  // <<param>> ( ',' <<param>> )* ','?
  static boolean comma_separated_list(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && comma_separated_list_1(b, l + 1, _param);
    r = r && comma_separated_list_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' <<param>> )*
  private static boolean comma_separated_list_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!comma_separated_list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "comma_separated_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' <<param>>
  private static boolean comma_separated_list_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean comma_separated_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comma_separated_list_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // <<defaultKeyword>>
  static boolean default_(PsiBuilder b, int l) {
    return defaultKeyword(b, l + 1);
  }

  /* ********************************************************** */
  // <<dynKeyword>>
  static boolean dyn(PsiBuilder b, int l) {
    return dynKeyword(b, l + 1);
  }

  /* ********************************************************** */
  // <<gteqImpl>>    | never GTEQ
  static boolean gteq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gteq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<>=>");
    r = gteqImpl(b, l + 1);
    if (!r) r = gteq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never GTEQ
  private static boolean gteq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gteq_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, GTEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<gtgtImpl>>    | never GTGT
  static boolean gtgt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gtgt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<>>>");
    r = gtgtImpl(b, l + 1);
    if (!r) r = gtgt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never GTGT
  private static boolean gtgt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gtgt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, GTGT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<gtgteqImpl>>  | never GTGTEQ
  static boolean gtgteq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gtgteq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<>>=>");
    r = gtgteqImpl(b, l + 1);
    if (!r) r = gtgteq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never GTGTEQ
  private static boolean gtgteq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gtgteq_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, GTGTEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<param>> !'+' (',' | &'>')
  static boolean list_element(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "list_element")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = _param.parse(b, l);
    r = r && list_element_1(b, l + 1);
    p = r; // pin = 2
    r = r && list_element_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // !'+'
  private static boolean list_element_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_element_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, PLUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ',' | &'>'
  private static boolean list_element_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_element_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = list_element_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'>'
  private static boolean list_element_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list_element_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, GT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<lteqImpl>>    | never LTEQ
  static boolean lteq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lteq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<<=>");
    r = lteqImpl(b, l + 1);
    if (!r) r = lteq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never LTEQ
  private static boolean lteq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lteq_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, LTEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<ltltImpl>>    | never LTLT
  static boolean ltlt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ltlt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<<<>");
    r = ltltImpl(b, l + 1);
    if (!r) r = ltlt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never LTLT
  private static boolean ltlt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ltlt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, LTLT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<ltlteqImpl>>  | never LTLTEQ
  static boolean ltlteq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ltlteq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<<<=>");
    r = ltlteqImpl(b, l + 1);
    if (!r) r = ltlteq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never LTLTEQ
  private static boolean ltlteq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ltlteq_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, LTLTEQ);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !()
  static boolean never(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "never")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !never_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ()
  private static boolean never_0(PsiBuilder b, int l) {
    return true;
  }

  /* ********************************************************** */
  // <<ororImpl>>    | never OROR
  static boolean oror(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oror")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null, "<||>");
    r = ororImpl(b, l + 1);
    if (!r) r = oror_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // never OROR
  private static boolean oror_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "oror_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = never(b, l + 1);
    r = r && consumeToken(b, OROR);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<unionKeyword>>
  static boolean union(PsiBuilder b, int l) {
    return unionKeyword(b, l + 1);
  }

  /* ********************************************************** */
  // '(' [ <<param>> (',' <<param>>)*  [ ',' '...'? ] ] ')'
  static boolean variadic_params_impl(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "variadic_params_impl")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, LPAREN);
    p = r; // pin = 1
    r = r && report_error_(b, variadic_params_impl_1(b, l + 1, _param));
    r = p && consumeToken(b, RPAREN) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // [ <<param>> (',' <<param>>)*  [ ',' '...'? ] ]
  private static boolean variadic_params_impl_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "variadic_params_impl_1")) return false;
    variadic_params_impl_1_0(b, l + 1, _param);
    return true;
  }

  // <<param>> (',' <<param>>)*  [ ',' '...'? ]
  private static boolean variadic_params_impl_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "variadic_params_impl_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && variadic_params_impl_1_0_1(b, l + 1, _param);
    r = r && variadic_params_impl_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' <<param>>)*
  private static boolean variadic_params_impl_1_0_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "variadic_params_impl_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variadic_params_impl_1_0_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "variadic_params_impl_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' <<param>>
  private static boolean variadic_params_impl_1_0_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "variadic_params_impl_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ',' '...'? ]
  private static boolean variadic_params_impl_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variadic_params_impl_1_0_2")) return false;
    variadic_params_impl_1_0_2_0(b, l + 1);
    return true;
  }

  // ',' '...'?
  private static boolean variadic_params_impl_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variadic_params_impl_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && variadic_params_impl_1_0_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '...'?
  private static boolean variadic_params_impl_1_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variadic_params_impl_1_0_2_0_1")) return false;
    consumeToken(b, DOTDOTDOT);
    return true;
  }

  /* ********************************************************** */
  // Expression root: Expr
  // Operator priority table:
  // 0: ATOM(RetExpr)
  // 1: PREFIX(LambdaExpr)
  // 2: BINARY(AssignBinExpr)
  // 3: ATOM(WhileExpr)
  // 4: ATOM(IfExpr)
  // 5: ATOM(ForExpr)
  // 6: ATOM(LoopExpr)
  // 7: ATOM(MatchExpr)
  // 8: ATOM(BlockExpr)
  // 9: ATOM(ContExpr)
  // 10: ATOM(BreakExpr)
  // 11: POSTFIX(FullRangeExpr)
  // 12: ATOM(OpenRangeExpr)
  // 13: BINARY(BoolOrBinExpr)
  // 14: BINARY(BoolAndBinExpr)
  // 15: BINARY(CompBinExpr)
  // 16: BINARY(RelCompBinExpr)
  // 17: BINARY(BitOrBinExpr)
  // 18: BINARY(BitXorBinExpr)
  // 19: BINARY(BitAndBinExpr)
  // 20: BINARY(BitShiftBinExpr)
  // 21: BINARY(AddBinExpr)
  // 22: BINARY(MulBinExpr)
  // 23: POSTFIX(CastExpr)
  // 24: PREFIX(UnaryExpr)
  // 25: POSTFIX(TryExpr)
  // 26: ATOM(LitExpr) ATOM(MacroExpr) ATOM(StructLiteral) POSTFIX(DotExpr)
  //    POSTFIX(IndexExpr) ATOM(PathExpr) POSTFIX(CallExpr) ATOM(ArrayExpr)
  //    ATOM(UnitExpr) ATOM(TupleOrParenExpr)
  public static boolean Expr(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expr")) return false;
    addVariant(b, "<expr>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = RetExpr(b, l + 1);
    if (!r) r = LambdaExpr(b, l + 1);
    if (!r) r = WhileExpr(b, l + 1);
    if (!r) r = IfExpr(b, l + 1);
    if (!r) r = ForExpr(b, l + 1);
    if (!r) r = LoopExpr(b, l + 1);
    if (!r) r = MatchExpr(b, l + 1);
    if (!r) r = BlockExpr(b, l + 1);
    if (!r) r = ContExpr(b, l + 1);
    if (!r) r = BreakExpr(b, l + 1);
    if (!r) r = OpenRangeExpr(b, l + 1);
    if (!r) r = UnaryExpr(b, l + 1);
    if (!r) r = LitExpr(b, l + 1);
    if (!r) r = MacroExpr(b, l + 1);
    if (!r) r = StructLiteral(b, l + 1);
    if (!r) r = PathExpr(b, l + 1);
    if (!r) r = ArrayExpr(b, l + 1);
    if (!r) r = UnitExpr(b, l + 1);
    if (!r) r = TupleOrParenExpr(b, l + 1);
    p = r;
    r = r && Expr_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean Expr_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "Expr_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 2 && AssignBinOp(b, l + 1)) {
        r = Expr(b, l, 1);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 11 && FullRangeExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, RANGE_EXPR, r, true, null);
      }
      else if (g < 13 && BoolOrBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 13);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 14 && BoolAndBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 14);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 15 && CompBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 15);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 16 && RelCompBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 16);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 17 && BitOrBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 17);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 18 && BitXorBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 18);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 19 && BitAndBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 19);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 20 && BitShiftBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 20);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 21 && AddBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 21);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 22 && MulBinExpr_0(b, l + 1)) {
        r = Expr(b, l, 22);
        exit_section_(b, l, m, BINARY_EXPR, r, true, null);
      }
      else if (g < 23 && CastExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CAST_EXPR, r, true, null);
      }
      else if (g < 25 && consumeTokenSmart(b, Q)) {
        r = true;
        exit_section_(b, l, m, TRY_EXPR, r, true, null);
      }
      else if (g < 26 && DotExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, DOT_EXPR, r, true, null);
      }
      else if (g < 26 && IndexArg(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, INDEX_EXPR, r, true, null);
      }
      else if (g < 26 && CallExpr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, CALL_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // OuterAttr* return Expr?
  public static boolean RetExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RetExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RET_EXPR, "<ret expr>");
    r = RetExpr_0(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && RetExpr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean RetExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RetExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RetExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Expr?
  private static boolean RetExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RetExpr_2")) return false;
    Expr(b, l + 1, -1);
    return true;
  }

  public static boolean LambdaExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = LambdaExpr_0(b, l + 1);
    p = r;
    r = p && Expr(b, l, 1);
    exit_section_(b, l, m, LAMBDA_EXPR, r, p, null);
    return r || p;
  }

  // OuterAttr* move? LambdaParameters RetType?
  private static boolean LambdaExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LambdaExpr_0_0(b, l + 1);
    r = r && LambdaExpr_0_1(b, l + 1);
    r = r && LambdaParameters(b, l + 1);
    r = r && LambdaExpr_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OuterAttr*
  private static boolean LambdaExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpr_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LambdaExpr_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // move?
  private static boolean LambdaExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpr_0_1")) return false;
    consumeTokenSmart(b, MOVE);
    return true;
  }

  // RetType?
  private static boolean LambdaExpr_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LambdaExpr_0_3")) return false;
    RetType(b, l + 1);
    return true;
  }

  // OuterAttr* LabelDecl? while Condition SimpleBlock
  public static boolean WhileExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, WHILE_EXPR, "<while expr>");
    r = WhileExpr_0(b, l + 1);
    r = r && WhileExpr_1(b, l + 1);
    r = r && consumeToken(b, WHILE);
    p = r; // pin = while
    r = r && report_error_(b, Condition(b, l + 1));
    r = p && SimpleBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean WhileExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "WhileExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LabelDecl?
  private static boolean WhileExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileExpr_1")) return false;
    LabelDecl(b, l + 1);
    return true;
  }

  // OuterAttr* if Condition SimpleBlock ElseBranch?
  public static boolean IfExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, IF)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, IF_EXPR, "<if expr>");
    r = IfExpr_0(b, l + 1);
    r = r && consumeToken(b, IF);
    p = r; // pin = if
    r = r && report_error_(b, Condition(b, l + 1));
    r = p && report_error_(b, SimpleBlock(b, l + 1)) && r;
    r = p && IfExpr_4(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean IfExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "IfExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ElseBranch?
  private static boolean IfExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfExpr_4")) return false;
    ElseBranch(b, l + 1);
    return true;
  }

  // OuterAttr* LabelDecl? for Pat in NoStructLitExpr SimpleBlock
  public static boolean ForExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_EXPR, "<for expr>");
    r = ForExpr_0(b, l + 1);
    r = r && ForExpr_1(b, l + 1);
    r = r && consumeToken(b, FOR);
    p = r; // pin = for
    r = r && report_error_(b, Pat(b, l + 1));
    r = p && report_error_(b, consumeToken(b, IN)) && r;
    r = p && report_error_(b, NoStructLitExpr(b, l + 1)) && r;
    r = p && SimpleBlock(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean ForExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LabelDecl?
  private static boolean ForExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForExpr_1")) return false;
    LabelDecl(b, l + 1);
    return true;
  }

  // OuterAttr* LabelDecl? loop SimpleBlock
  public static boolean LoopExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LOOP_EXPR, "<loop expr>");
    r = LoopExpr_0(b, l + 1);
    r = r && LoopExpr_1(b, l + 1);
    r = r && consumeToken(b, LOOP);
    p = r; // pin = loop
    r = r && SimpleBlock(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean LoopExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LoopExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // LabelDecl?
  private static boolean LoopExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LoopExpr_1")) return false;
    LabelDecl(b, l + 1);
    return true;
  }

  // OuterAttr* match NoStructLitExpr MatchBody
  public static boolean MatchExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, MATCH)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, MATCH_EXPR, "<match expr>");
    r = MatchExpr_0(b, l + 1);
    r = r && consumeToken(b, MATCH);
    p = r; // pin = match
    r = r && report_error_(b, NoStructLitExpr(b, l + 1));
    r = p && MatchBody(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean MatchExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MatchExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MatchExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OuterAttr* [ unsafe &'{' ] SimpleBlock
  public static boolean BlockExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BLOCK_EXPR, "<block expr>");
    r = BlockExpr_0(b, l + 1);
    r = r && BlockExpr_1(b, l + 1);
    r = r && SimpleBlock(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean BlockExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BlockExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // [ unsafe &'{' ]
  private static boolean BlockExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockExpr_1")) return false;
    BlockExpr_1_0(b, l + 1);
    return true;
  }

  // unsafe &'{'
  private static boolean BlockExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockExpr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, UNSAFE);
    r = r && BlockExpr_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // &'{'
  private static boolean BlockExpr_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockExpr_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeTokenSmart(b, LBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr* continue Label?
  public static boolean ContExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONT_EXPR, "<cont expr>");
    r = ContExpr_0(b, l + 1);
    r = r && consumeToken(b, CONTINUE);
    r = r && ContExpr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean ContExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ContExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Label?
  private static boolean ContExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContExpr_2")) return false;
    Label(b, l + 1);
    return true;
  }

  // OuterAttr* break Label? AnyExpr?
  public static boolean BreakExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BREAK_EXPR, "<break expr>");
    r = BreakExpr_0(b, l + 1);
    r = r && consumeToken(b, BREAK);
    r = r && BreakExpr_2(b, l + 1);
    r = r && BreakExpr_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean BreakExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BreakExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // Label?
  private static boolean BreakExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakExpr_2")) return false;
    Label(b, l + 1);
    return true;
  }

  // AnyExpr?
  private static boolean BreakExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakExpr_3")) return false;
    AnyExpr(b, l + 1);
    return true;
  }

  // '..' (<<checkBraceAllowed>> Expr)? | '...' (<<checkBraceAllowed>> Expr) | '..=' (<<checkBraceAllowed>> Expr)
  private static boolean FullRangeExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FullRangeExpr_0_0(b, l + 1);
    if (!r) r = FullRangeExpr_0_1(b, l + 1);
    if (!r) r = FullRangeExpr_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '..' (<<checkBraceAllowed>> Expr)?
  private static boolean FullRangeExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOTDOT);
    r = r && FullRangeExpr_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<checkBraceAllowed>> Expr)?
  private static boolean FullRangeExpr_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0_0_1")) return false;
    FullRangeExpr_0_0_1_0(b, l + 1);
    return true;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean FullRangeExpr_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = checkBraceAllowed(b, l + 1);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '...' (<<checkBraceAllowed>> Expr)
  private static boolean FullRangeExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOTDOTDOT);
    r = r && FullRangeExpr_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean FullRangeExpr_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = checkBraceAllowed(b, l + 1);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '..=' (<<checkBraceAllowed>> Expr)
  private static boolean FullRangeExpr_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOTDOTEQ);
    r = r && FullRangeExpr_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean FullRangeExpr_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FullRangeExpr_0_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = checkBraceAllowed(b, l + 1);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '..' (<<checkBraceAllowed>> Expr)? | '...' (<<checkBraceAllowed>> Expr) | '..=' (<<checkBraceAllowed>> Expr)
  public static boolean OpenRangeExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_EXPR, "<open range expr>");
    r = OpenRangeExpr_0(b, l + 1);
    if (!r) r = OpenRangeExpr_1(b, l + 1);
    if (!r) r = OpenRangeExpr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '..' (<<checkBraceAllowed>> Expr)?
  private static boolean OpenRangeExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOTDOT);
    r = r && OpenRangeExpr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (<<checkBraceAllowed>> Expr)?
  private static boolean OpenRangeExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr_0_1")) return false;
    OpenRangeExpr_0_1_0(b, l + 1);
    return true;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean OpenRangeExpr_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = checkBraceAllowed(b, l + 1);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '...' (<<checkBraceAllowed>> Expr)
  private static boolean OpenRangeExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOTDOTDOT);
    r = r && OpenRangeExpr_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean OpenRangeExpr_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = checkBraceAllowed(b, l + 1);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '..=' (<<checkBraceAllowed>> Expr)
  private static boolean OpenRangeExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOTDOTEQ);
    r = r && OpenRangeExpr_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // <<checkBraceAllowed>> Expr
  private static boolean OpenRangeExpr_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OpenRangeExpr_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = checkBraceAllowed(b, l + 1);
    r = r && Expr(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>> BoolOrBinOp
  private static boolean BoolOrBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoolOrBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BoolOrBinExpr_0_0(b, l + 1);
    r = r && BoolOrBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean BoolOrBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoolOrBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<isCompleteBlockExpr>> BoolAndBinOp
  private static boolean BoolAndBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoolAndBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BoolAndBinExpr_0_0(b, l + 1);
    r = r && BoolAndBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean BoolAndBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BoolAndBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<isCompleteBlockExpr>> CompBinOp
  private static boolean CompBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CompBinExpr_0_0(b, l + 1);
    r = r && CompBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean CompBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CompBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<isCompleteBlockExpr>> RelCompBinOp
  private static boolean RelCompBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RelCompBinExpr_0_0(b, l + 1);
    r = r && RelCompBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean RelCompBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RelCompBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !(<<isCompleteBlockExpr>> | oror) BitOrBinOp
  private static boolean BitOrBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitOrBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitOrBinExpr_0_0(b, l + 1);
    r = r && BitOrBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<isCompleteBlockExpr>> | oror)
  private static boolean BitOrBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitOrBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !BitOrBinExpr_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<isCompleteBlockExpr>> | oror
  private static boolean BitOrBinExpr_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitOrBinExpr_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isCompleteBlockExpr(b, l + 1);
    if (!r) r = oror(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>> BitXorBinOp
  private static boolean BitXorBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitXorBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitXorBinExpr_0_0(b, l + 1);
    r = r && BitXorBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean BitXorBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitXorBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !(<<isCompleteBlockExpr>> | andand) BitAndBinOp
  private static boolean BitAndBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitAndBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitAndBinExpr_0_0(b, l + 1);
    r = r && BitAndBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !(<<isCompleteBlockExpr>> | andand)
  private static boolean BitAndBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitAndBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !BitAndBinExpr_0_0_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // <<isCompleteBlockExpr>> | andand
  private static boolean BitAndBinExpr_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitAndBinExpr_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isCompleteBlockExpr(b, l + 1);
    if (!r) r = andand(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>> BitShiftBinOp
  private static boolean BitShiftBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitShiftBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BitShiftBinExpr_0_0(b, l + 1);
    r = r && BitShiftBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean BitShiftBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BitShiftBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<isCompleteBlockExpr>> AddBinOp
  private static boolean AddBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = AddBinExpr_0_0(b, l + 1);
    r = r && AddBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean AddBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AddBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // !<<isCompleteBlockExpr>> MulBinOp
  private static boolean MulBinExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulBinExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MulBinExpr_0_0(b, l + 1);
    r = r && MulBinOp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean MulBinExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MulBinExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (as | ':') ScalarTypeReference
  private static boolean CastExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CastExpr_0_0(b, l + 1);
    r = r && ScalarTypeReference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // as | ':'
  private static boolean CastExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CastExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, AS);
    if (!r) r = consumeTokenSmart(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean UnaryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = UnaryExpr_0(b, l + 1);
    p = r;
    r = p && Expr(b, l, 24);
    exit_section_(b, l, m, UNARY_EXPR, r, p, null);
    return r || p;
  }

  // OuterAttr* (box | '-' | '*' | '!' | '&' mut?)
  private static boolean UnaryExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = UnaryExpr_0_0(b, l + 1);
    r = r && UnaryExpr_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OuterAttr*
  private static boolean UnaryExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr_0_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnaryExpr_0_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // box | '-' | '*' | '!' | '&' mut?
  private static boolean UnaryExpr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, BOX);
    if (!r) r = consumeTokenSmart(b, MINUS);
    if (!r) r = consumeTokenSmart(b, MUL);
    if (!r) r = consumeTokenSmart(b, EXCL);
    if (!r) r = UnaryExpr_0_1_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '&' mut?
  private static boolean UnaryExpr_0_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr_0_1_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, AND);
    r = r && UnaryExpr_0_1_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mut?
  private static boolean UnaryExpr_0_1_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnaryExpr_0_1_4_1")) return false;
    consumeTokenSmart(b, MUT);
    return true;
  }

  // OuterAttr*
  //   (STRING_LITERAL | BYTE_STRING_LITERAL
  //   | RAW_STRING_LITERAL | RAW_BYTE_STRING_LITERAL
  //   | CHAR_LITERAL | BYTE_LITERAL
  //   | INTEGER_LITERAL | FLOAT_LITERAL
  //   | BOOL_LITERAL)
  public static boolean LitExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LitExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIT_EXPR, "<lit expr>");
    r = LitExpr_0(b, l + 1);
    r = r && LitExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean LitExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LitExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LitExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING_LITERAL | BYTE_STRING_LITERAL
  //   | RAW_STRING_LITERAL | RAW_BYTE_STRING_LITERAL
  //   | CHAR_LITERAL | BYTE_LITERAL
  //   | INTEGER_LITERAL | FLOAT_LITERAL
  //   | BOOL_LITERAL
  private static boolean LitExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LitExpr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, STRING_LITERAL);
    if (!r) r = consumeTokenSmart(b, BYTE_STRING_LITERAL);
    if (!r) r = consumeTokenSmart(b, RAW_STRING_LITERAL);
    if (!r) r = consumeTokenSmart(b, RAW_BYTE_STRING_LITERAL);
    if (!r) r = consumeTokenSmart(b, CHAR_LITERAL);
    if (!r) r = consumeTokenSmart(b, BYTE_LITERAL);
    if (!r) r = consumeTokenSmart(b, INTEGER_LITERAL);
    if (!r) r = consumeTokenSmart(b, FLOAT_LITERAL);
    if (!r) r = consumeTokenSmart(b, BOOL_LITERAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // OuterAttr* MacroCallNoSemicolons
  public static boolean MacroExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MACRO_EXPR, "<macro expr>");
    r = MacroExpr_0(b, l + 1);
    r = r && MacroCallNoSemicolons(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean MacroExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MacroExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MacroExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // <<checkStructAllowed>> OuterAttr* PathGenericArgsWithColonsNoTypeQual StructLiteralBody
  public static boolean StructLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteral")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_LITERAL, "<struct literal>");
    r = checkStructAllowed(b, l + 1);
    r = r && StructLiteral_1(b, l + 1);
    r = r && PathGenericArgsWithColonsNoTypeQual(b, l + 1);
    r = r && StructLiteralBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean StructLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StructLiteral_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "StructLiteral_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' MethodOrField
  private static boolean DotExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DotExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOT);
    r = r && MethodOrField(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OuterAttr* PathGenericArgsWithColons
  public static boolean PathExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATH_EXPR, "<path expr>");
    r = PathExpr_0(b, l + 1);
    r = r && PathGenericArgsWithColons(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean PathExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PathExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PathExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !<<isCompleteBlockExpr>> ValueArgumentList
  private static boolean CallExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = CallExpr_0_0(b, l + 1);
    r = r && ValueArgumentList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<isCompleteBlockExpr>>
  private static boolean CallExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !isCompleteBlockExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr* '[' ArrayInitializer ']'
  public static boolean ArrayExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, LBRACK)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_EXPR, "<array expr>");
    r = ArrayExpr_0(b, l + 1);
    r = r && consumeToken(b, LBRACK);
    p = r; // pin = 2
    r = r && report_error_(b, ArrayInitializer(b, l + 1));
    r = p && consumeToken(b, RBRACK) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean ArrayExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ArrayExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ArrayExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OuterAttr* '(' ')'
  public static boolean UnitExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNIT_EXPR, "<unit expr>");
    r = UnitExpr_0(b, l + 1);
    r = r && consumeTokensSmart(b, 0, LPAREN, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // OuterAttr*
  private static boolean UnitExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UnitExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UnitExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // OuterAttr* '(' AnyExpr (TupleExprUpper | ParenExprUpper)
  public static boolean TupleOrParenExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleOrParenExpr")) return false;
    if (!nextTokenIsSmart(b, SHA, LPAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TUPLE_OR_PAREN_EXPR, "<tuple or paren expr>");
    r = TupleOrParenExpr_0(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    p = r; // pin = 2
    r = r && report_error_(b, AnyExpr(b, l + 1));
    r = p && TupleOrParenExpr_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // OuterAttr*
  private static boolean TupleOrParenExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleOrParenExpr_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!OuterAttr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TupleOrParenExpr_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // TupleExprUpper | ParenExprUpper
  private static boolean TupleOrParenExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleOrParenExpr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TupleExprUpper(b, l + 1);
    if (!r) r = ParenExprUpper(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  final static Parser AnonParameter_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AnonParameter(b, l + 1);
    }
  };
  final static Parser AnyExpr_0_1_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return stmtMode(b, l + 1, OFF, Expr_parser_);
    }
  };
  final static Parser AnyExpr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AnyExpr(b, l + 1);
    }
  };
  final static Parser ArrayInitializer_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ArrayInitializer(b, l + 1);
    }
  };
  final static Parser AssertMacroArgument_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AssertMacroArgument_0_0(b, l + 1);
    }
  };
  final static Parser AssocTypeBinding_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return AssocTypeBinding(b, l + 1);
    }
  };
  final static Parser BlockElement_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return BlockElement_recover(b, l + 1);
    }
  };
  final static Parser CompactTT_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return CompactTT(b, l + 1);
    }
  };
  final static Parser EnumVariant_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return EnumVariant(b, l + 1);
    }
  };
  final static Parser Expr_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return Expr(b, l + 1, -1);
    }
  };
  final static Parser Field_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return Field_recover(b, l + 1);
    }
  };
  final static Parser FnParameter_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return FnParameter_recover(b, l + 1);
    }
  };
  final static Parser FormatMacroArg_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return FormatMacroArg(b, l + 1);
    }
  };
  final static Parser FormatMacroArgument_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return FormatMacroArgument_0_0(b, l + 1);
    }
  };
  final static Parser ImplicitTraitType_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ImplicitTraitType(b, l + 1);
    }
  };
  final static Parser Item_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return Item_recover(b, l + 1);
    }
  };
  final static Parser LambdaParameter_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return LambdaParameter(b, l + 1);
    }
  };
  final static Parser LifetimeParameter_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return LifetimeParameter(b, l + 1);
    }
  };
  final static Parser Lifetime_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return Lifetime(b, l + 1);
    }
  };
  final static Parser LogMacroArgument_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return LogMacroArgument_0_0(b, l + 1);
    }
  };
  final static Parser MacroDefinitionBody_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MacroDefinitionBody_0_0(b, l + 1);
    }
  };
  final static Parser MacroExpansionContents_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MacroExpansionContents(b, l + 1);
    }
  };
  final static Parser MacroPatternContents_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MacroPatternContents(b, l + 1);
    }
  };
  final static Parser MatchArm_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MatchArm_recover(b, l + 1);
    }
  };
  final static Parser Member_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return Member_recover(b, l + 1);
    }
  };
  final static Parser MetaItemArgs_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return MetaItemArgs_1_0_0(b, l + 1);
    }
  };
  final static Parser NoStructLitExpr_0_1_parser_ = AnyExpr_0_1_parser_;
  final static Parser PathGenericArgsWithColonsNoTypeQual_0_1_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pathMode(b, l + 1, COLONS, PathImpl_parser_);
    }
  };
  final static Parser PathGenericArgsWithColons_0_1_parser_ = PathGenericArgsWithColonsNoTypeQual_0_1_parser_;
  final static Parser PathGenericArgsWithoutColonsNoTypeQual_0_1_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pathMode(b, l + 1, NO_COLONS, PathImpl_parser_);
    }
  };
  final static Parser PathGenericArgsWithoutColons_0_1_parser_ = PathGenericArgsWithoutColonsNoTypeQual_0_1_parser_;
  final static Parser PathGenericArgsWithoutColons_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return PathGenericArgsWithoutColons(b, l + 1);
    }
  };
  final static Parser PathImpl_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return PathImpl(b, l + 1);
    }
  };
  final static Parser PathParameter_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return PathParameter(b, l + 1);
    }
  };
  final static Parser PathWithoutTypes_0_1_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return pathMode(b, l + 1, NO_TYPES, PathImpl_parser_);
    }
  };
  final static Parser ScalarTypeReferenceInner_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return ScalarTypeReferenceInner(b, l + 1);
    }
  };
  final static Parser StmtModeExpr_0_1_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return stmtMode(b, l + 1, ON, Expr_parser_);
    }
  };
  final static Parser StructLiteralField_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return StructLiteralField_recover(b, l + 1);
    }
  };
  final static Parser TT_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TT_0_0(b, l + 1);
    }
  };
  final static Parser TraitType_upper_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TraitType_upper(b, l + 1);
    }
  };
  final static Parser TupleField_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TupleField_recover(b, l + 1);
    }
  };
  final static Parser TupleType_upper_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TupleType_upper(b, l + 1);
    }
  };
  final static Parser TypeArgumentListImpl_2_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TypeArgumentListImpl_2_1_0_0(b, l + 1);
    }
  };
  final static Parser TypeParameterList_1_0_0_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TypeParameterList_1_0_0(b, l + 1);
    }
  };
  final static Parser TypeReferenceInner_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TypeReferenceInner(b, l + 1);
    }
  };
  final static Parser TypeReference_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return TypeReference(b, l + 1);
    }
  };
  final static Parser UseSpeck_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return UseSpeck_recover(b, l + 1);
    }
  };
  final static Parser WherePred_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return WherePred(b, l + 1);
    }
  };
}
