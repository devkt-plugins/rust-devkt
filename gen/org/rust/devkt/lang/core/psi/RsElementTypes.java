// This is a generated file. Not intended for manual editing.
package org.rust.devkt.lang.core.psi;

import org.jetbrains.kotlin.com.intellij.psi.tree.IElementType;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.lang.ASTNode;
import org.rust.devkt.lang.core.psi.impl.*;

public interface RsElementTypes {

  IElementType ALIAS = new RsElementType("ALIAS");
  IElementType ARRAY_EXPR = new RsElementType("ARRAY_EXPR");
  IElementType ARRAY_TYPE = new RsElementType("ARRAY_TYPE");
  IElementType ASSERT_MACRO_ARGUMENT = new RsElementType("ASSERT_MACRO_ARGUMENT");
  IElementType ASSOC_TYPE_BINDING = new RsElementType("ASSOC_TYPE_BINDING");
  IElementType BASE_TYPE = new RsElementType("BASE_TYPE");
  IElementType BINARY_EXPR = new RsElementType("BINARY_EXPR");
  IElementType BINARY_OP = new RsElementType("BINARY_OP");
  IElementType BINDING_MODE = new RsElementType("BINDING_MODE");
  IElementType BLOCK = new RsElementType("BLOCK");
  IElementType BLOCK_EXPR = new RsElementType("BLOCK_EXPR");
  IElementType BLOCK_FIELDS = new RsElementType("BLOCK_FIELDS");
  IElementType BOUND = new RsElementType("BOUND");
  IElementType BREAK_EXPR = new RsElementType("BREAK_EXPR");
  IElementType CALL_EXPR = new RsElementType("CALL_EXPR");
  IElementType CAST_EXPR = new RsElementType("CAST_EXPR");
  IElementType COMPACT_TT = new RsElementType("COMPACT_TT");
  IElementType CONDITION = new RsElementType("CONDITION");
  IElementType CONSTANT = new RsElementType("CONSTANT");
  IElementType CONT_EXPR = new RsElementType("CONT_EXPR");
  IElementType DOT_EXPR = new RsElementType("DOT_EXPR");
  IElementType ELSE_BRANCH = new RsElementType("ELSE_BRANCH");
  IElementType EMPTY_STMT = new RsElementType("EMPTY_STMT");
  IElementType ENUM_BODY = new RsElementType("ENUM_BODY");
  IElementType ENUM_ITEM = new RsElementType("ENUM_ITEM");
  IElementType ENUM_VARIANT = new RsElementType("ENUM_VARIANT");
  IElementType EXPR = new RsElementType("EXPR");
  IElementType EXPR_STMT = new RsElementType("EXPR_STMT");
  IElementType EXPR_STMT_OR_LAST_EXPR = new RsElementType("EXPR_STMT_OR_LAST_EXPR");
  IElementType EXTERN_ABI = new RsElementType("EXTERN_ABI");
  IElementType EXTERN_CRATE_ITEM = new RsElementType("EXTERN_CRATE_ITEM");
  IElementType FIELD_DECL = new RsElementType("FIELD_DECL");
  IElementType FIELD_LOOKUP = new RsElementType("FIELD_LOOKUP");
  IElementType FN_POINTER_TYPE = new RsElementType("FN_POINTER_TYPE");
  IElementType FOREIGN_MOD_ITEM = new RsElementType("FOREIGN_MOD_ITEM");
  IElementType FORMAT_MACRO_ARG = new RsElementType("FORMAT_MACRO_ARG");
  IElementType FORMAT_MACRO_ARGUMENT = new RsElementType("FORMAT_MACRO_ARGUMENT");
  IElementType FOR_EXPR = new RsElementType("FOR_EXPR");
  IElementType FOR_IN_TYPE = new RsElementType("FOR_IN_TYPE");
  IElementType FOR_LIFETIMES = new RsElementType("FOR_LIFETIMES");
  IElementType FUNCTION = new RsElementType("FUNCTION");
  IElementType IF_EXPR = new RsElementType("IF_EXPR");
  IElementType IMPL_ITEM = new RsElementType("IMPL_ITEM");
  IElementType INDEX_EXPR = new RsElementType("INDEX_EXPR");
  IElementType INNER_ATTR = new RsElementType("INNER_ATTR");
  IElementType LABEL = new RsElementType("LABEL");
  IElementType LABEL_DECL = new RsElementType("LABEL_DECL");
  IElementType LAMBDA_EXPR = new RsElementType("LAMBDA_EXPR");
  IElementType LET_DECL = new RsElementType("LET_DECL");
  IElementType LIFETIME = new RsElementType("LIFETIME");
  IElementType LIFETIME_PARAMETER = new RsElementType("LIFETIME_PARAMETER");
  IElementType LIFETIME_PARAM_BOUNDS = new RsElementType("LIFETIME_PARAM_BOUNDS");
  IElementType LIT_EXPR = new RsElementType("LIT_EXPR");
  IElementType LOG_MACRO_ARGUMENT = new RsElementType("LOG_MACRO_ARGUMENT");
  IElementType LOOP_EXPR = new RsElementType("LOOP_EXPR");
  IElementType MACRO_ARGUMENT = new RsElementType("MACRO_ARGUMENT");
  IElementType MACRO_BINDING = new RsElementType("MACRO_BINDING");
  IElementType MACRO_BINDING_GROUP = new RsElementType("MACRO_BINDING_GROUP");
  IElementType MACRO_BINDING_GROUP_SEPARATOR = new RsElementType("MACRO_BINDING_GROUP_SEPARATOR");
  IElementType MACRO_CALL = new RsElementType("MACRO_CALL");
  IElementType MACRO_CALL_NO_SEMICOLONS = new RsElementType("MACRO_CALL_NO_SEMICOLONS");
  IElementType MACRO_DEFINITION = new RsElementType("MACRO_DEFINITION");
  IElementType MACRO_DEFINITION_BODY = new RsElementType("MACRO_DEFINITION_BODY");
  IElementType MACRO_DEFINITION_CASE = new RsElementType("MACRO_DEFINITION_CASE");
  IElementType MACRO_EXPANSION = new RsElementType("MACRO_EXPANSION");
  IElementType MACRO_EXPANSION_CONTENTS = new RsElementType("MACRO_EXPANSION_CONTENTS");
  IElementType MACRO_EXPANSION_GROUP_SEPARATOR = new RsElementType("MACRO_EXPANSION_GROUP_SEPARATOR");
  IElementType MACRO_EXPANSION_REFERENCE_GROUP = new RsElementType("MACRO_EXPANSION_REFERENCE_GROUP");
  IElementType MACRO_EXPR = new RsElementType("MACRO_EXPR");
  IElementType MACRO_PATTERN = new RsElementType("MACRO_PATTERN");
  IElementType MACRO_PATTERN_CONTENTS = new RsElementType("MACRO_PATTERN_CONTENTS");
  IElementType MACRO_REFERENCE = new RsElementType("MACRO_REFERENCE");
  IElementType MATCH_ARM = new RsElementType("MATCH_ARM");
  IElementType MATCH_ARM_GUARD = new RsElementType("MATCH_ARM_GUARD");
  IElementType MATCH_BODY = new RsElementType("MATCH_BODY");
  IElementType MATCH_EXPR = new RsElementType("MATCH_EXPR");
  IElementType MEMBERS = new RsElementType("MEMBERS");
  IElementType META_ITEM = new RsElementType("META_ITEM");
  IElementType META_ITEM_ARGS = new RsElementType("META_ITEM_ARGS");
  IElementType META_VAR_IDENTIFIER = new RsElementType("META_VAR_IDENTIFIER");
  IElementType METHOD_CALL = new RsElementType("METHOD_CALL");
  IElementType MOD_DECL_ITEM = new RsElementType("MOD_DECL_ITEM");
  IElementType MOD_ITEM = new RsElementType("MOD_ITEM");
  IElementType OUTER_ATTR = new RsElementType("OUTER_ATTR");
  IElementType PAREN_EXPR = new RsElementType("PAREN_EXPR");
  IElementType PAT = new RsElementType("PAT");
  IElementType PATH = new RsElementType("PATH");
  IElementType PATH_EXPR = new RsElementType("PATH_EXPR");
  IElementType PAT_BINDING = new RsElementType("PAT_BINDING");
  IElementType PAT_CONST = new RsElementType("PAT_CONST");
  IElementType PAT_ENUM = new RsElementType("PAT_ENUM");
  IElementType PAT_FIELD = new RsElementType("PAT_FIELD");
  IElementType PAT_IDENT = new RsElementType("PAT_IDENT");
  IElementType PAT_MACRO = new RsElementType("PAT_MACRO");
  IElementType PAT_RANGE = new RsElementType("PAT_RANGE");
  IElementType PAT_REF = new RsElementType("PAT_REF");
  IElementType PAT_STRUCT = new RsElementType("PAT_STRUCT");
  IElementType PAT_TUP = new RsElementType("PAT_TUP");
  IElementType PAT_UNIQ = new RsElementType("PAT_UNIQ");
  IElementType PAT_VEC = new RsElementType("PAT_VEC");
  IElementType PAT_WILD = new RsElementType("PAT_WILD");
  IElementType POLYBOUND = new RsElementType("POLYBOUND");
  IElementType RANGE_EXPR = new RsElementType("RANGE_EXPR");
  IElementType REF_LIKE_TYPE = new RsElementType("REF_LIKE_TYPE");
  IElementType RET_EXPR = new RsElementType("RET_EXPR");
  IElementType RET_TYPE = new RsElementType("RET_TYPE");
  IElementType SELF_PARAMETER = new RsElementType("SELF_PARAMETER");
  IElementType STMT = new RsElementType("STMT");
  IElementType STRUCT_ITEM = new RsElementType("STRUCT_ITEM");
  IElementType STRUCT_LITERAL = new RsElementType("STRUCT_LITERAL");
  IElementType STRUCT_LITERAL_BODY = new RsElementType("STRUCT_LITERAL_BODY");
  IElementType STRUCT_LITERAL_FIELD = new RsElementType("STRUCT_LITERAL_FIELD");
  IElementType TRAIT_ITEM = new RsElementType("TRAIT_ITEM");
  IElementType TRAIT_REF = new RsElementType("TRAIT_REF");
  IElementType TRAIT_TYPE = new RsElementType("TRAIT_TYPE");
  IElementType TRY_EXPR = new RsElementType("TRY_EXPR");
  IElementType TRY_MACRO_ARGUMENT = new RsElementType("TRY_MACRO_ARGUMENT");
  IElementType TT = new RsElementType("TT");
  IElementType TUPLE_EXPR = new RsElementType("TUPLE_EXPR");
  IElementType TUPLE_FIELDS = new RsElementType("TUPLE_FIELDS");
  IElementType TUPLE_FIELD_DECL = new RsElementType("TUPLE_FIELD_DECL");
  IElementType TUPLE_OR_PAREN_EXPR = new RsElementType("TUPLE_OR_PAREN_EXPR");
  IElementType TUPLE_TYPE = new RsElementType("TUPLE_TYPE");
  IElementType TYPE_ALIAS = new RsElementType("TYPE_ALIAS");
  IElementType TYPE_ARGUMENT_LIST = new RsElementType("TYPE_ARGUMENT_LIST");
  IElementType TYPE_PARAMETER = new RsElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETER_LIST = new RsElementType("TYPE_PARAMETER_LIST");
  IElementType TYPE_PARAM_BOUNDS = new RsElementType("TYPE_PARAM_BOUNDS");
  IElementType TYPE_QUAL = new RsElementType("TYPE_QUAL");
  IElementType TYPE_REFERENCE = new RsElementType("TYPE_REFERENCE");
  IElementType UNARY_EXPR = new RsElementType("UNARY_EXPR");
  IElementType UNIT_EXPR = new RsElementType("UNIT_EXPR");
  IElementType USE_GROUP = new RsElementType("USE_GROUP");
  IElementType USE_ITEM = new RsElementType("USE_ITEM");
  IElementType USE_SPECK = new RsElementType("USE_SPECK");
  IElementType VALUE_ARGUMENT_LIST = new RsElementType("VALUE_ARGUMENT_LIST");
  IElementType VALUE_PARAMETER = new RsElementType("VALUE_PARAMETER");
  IElementType VALUE_PARAMETER_LIST = new RsElementType("VALUE_PARAMETER_LIST");
  IElementType VARIANT_DISCRIMINANT = new RsElementType("VARIANT_DISCRIMINANT");
  IElementType VEC_MACRO_ARGUMENT = new RsElementType("VEC_MACRO_ARGUMENT");
  IElementType VIS = new RsElementType("VIS");
  IElementType VIS_RESTRICTION = new RsElementType("VIS_RESTRICTION");
  IElementType WHERE_CLAUSE = new RsElementType("WHERE_CLAUSE");
  IElementType WHERE_PRED = new RsElementType("WHERE_PRED");
  IElementType WHILE_EXPR = new RsElementType("WHILE_EXPR");

  IElementType AND = new RsTokenType("&");
  IElementType ANDAND = new RsTokenType("&&");
  IElementType ANDEQ = new RsTokenType("&=");
  IElementType ARROW = new RsTokenType("->");
  IElementType AS = new RsTokenType("as");
  IElementType AT = new RsTokenType("@");
  IElementType AUTO = new RsTokenType("auto_kw");
  IElementType BOOL_LITERAL = new RsTokenType("BOOL_LITERAL");
  IElementType BOX = new RsTokenType("box");
  IElementType BREAK = new RsTokenType("break");
  IElementType BYTE_LITERAL = new RsTokenType("BYTE_LITERAL");
  IElementType BYTE_STRING_LITERAL = new RsTokenType("BYTE_STRING_LITERAL");
  IElementType CHAR_LITERAL = new RsTokenType("CHAR_LITERAL");
  IElementType COLON = new RsTokenType(":");
  IElementType COLONCOLON = new RsTokenType("::");
  IElementType COMMA = new RsTokenType(",");
  IElementType CONST = new RsTokenType("const");
  IElementType CONTINUE = new RsTokenType("continue");
  IElementType CRATE = new RsTokenType("crate");
  IElementType CSELF = new RsTokenType("Self");
  IElementType DEFAULT = new RsTokenType("default_kw");
  IElementType DIV = new RsTokenType("/");
  IElementType DIVEQ = new RsTokenType("/=");
  IElementType DOLLAR = new RsTokenType("$");
  IElementType DOT = new RsTokenType(".");
  IElementType DOTDOT = new RsTokenType("..");
  IElementType DOTDOTDOT = new RsTokenType("...");
  IElementType DOTDOTEQ = new RsTokenType("..=");
  IElementType DYN = new RsTokenType("dyn_kw");
  IElementType ELSE = new RsTokenType("else");
  IElementType ENUM = new RsTokenType("enum");
  IElementType EQ = new RsTokenType("=");
  IElementType EQEQ = new RsTokenType("==");
  IElementType EXCL = new RsTokenType("!");
  IElementType EXCLEQ = new RsTokenType("!=");
  IElementType EXTERN = new RsTokenType("extern");
  IElementType FALSE = new RsTokenType("false");
  IElementType FAT_ARROW = new RsTokenType("=>");
  IElementType FLOAT_LITERAL = new RsTokenType("FLOAT_LITERAL");
  IElementType FN = new RsTokenType("fn");
  IElementType FOR = new RsTokenType("for");
  IElementType GT = new RsTokenType(">");
  IElementType GTEQ = new RsTokenType("GTEQ");
  IElementType GTGT = new RsTokenType("GTGT");
  IElementType GTGTEQ = new RsTokenType("GTGTEQ");
  IElementType IDENTIFIER = new RsTokenType("identifier");
  IElementType IF = new RsTokenType("if");
  IElementType IMPL = new RsTokenType("impl");
  IElementType IN = new RsTokenType("in");
  IElementType INTEGER_LITERAL = new RsTokenType("INTEGER_LITERAL");
  IElementType LBRACE = new RsTokenType("{");
  IElementType LBRACK = new RsTokenType("[");
  IElementType LET = new RsTokenType("let");
  IElementType LOOP = new RsTokenType("loop");
  IElementType LPAREN = new RsTokenType("(");
  IElementType LT = new RsTokenType("<");
  IElementType LTEQ = new RsTokenType("LTEQ");
  IElementType LTLT = new RsTokenType("LTLT");
  IElementType LTLTEQ = new RsTokenType("LTLTEQ");
  IElementType MACRO_KW = new RsTokenType("macro");
  IElementType MATCH = new RsTokenType("match");
  IElementType MINUS = new RsTokenType("-");
  IElementType MINUSEQ = new RsTokenType("-=");
  IElementType MOD = new RsTokenType("mod");
  IElementType MOVE = new RsTokenType("move");
  IElementType MUL = new RsTokenType("*");
  IElementType MULEQ = new RsTokenType("*=");
  IElementType MUT = new RsTokenType("mut");
  IElementType OR = new RsTokenType("|");
  IElementType OREQ = new RsTokenType("|=");
  IElementType OROR = new RsTokenType("OROR");
  IElementType PLUS = new RsTokenType("+");
  IElementType PLUSEQ = new RsTokenType("+=");
  IElementType PUB = new RsTokenType("pub");
  IElementType Q = new RsTokenType("?");
  IElementType QUOTE_IDENTIFIER = new RsTokenType("QUOTE_IDENTIFIER");
  IElementType RAW_BYTE_STRING_LITERAL = new RsTokenType("RAW_BYTE_STRING_LITERAL");
  IElementType RAW_STRING_LITERAL = new RsTokenType("RAW_STRING_LITERAL");
  IElementType RBRACE = new RsTokenType("}");
  IElementType RBRACK = new RsTokenType("]");
  IElementType REF = new RsTokenType("ref");
  IElementType REM = new RsTokenType("%");
  IElementType REMEQ = new RsTokenType("%=");
  IElementType RESERVED_KEYWORD = new RsTokenType("reserved_keyword");
  IElementType RETURN = new RsTokenType("return");
  IElementType RPAREN = new RsTokenType(")");
  IElementType SELF = new RsTokenType("self");
  IElementType SEMICOLON = new RsTokenType(";");
  IElementType SHA = new RsTokenType("#");
  IElementType SHEBANG_LINE = new RsTokenType("shebang_line");
  IElementType STATIC = new RsTokenType("static");
  IElementType STRING_LITERAL = new RsTokenType("STRING_LITERAL");
  IElementType STRUCT = new RsTokenType("struct");
  IElementType SUPER = new RsTokenType("super");
  IElementType TRAIT = new RsTokenType("trait");
  IElementType TRUE = new RsTokenType("true");
  IElementType TYPE_KW = new RsTokenType("type");
  IElementType UNDERSCORE = new RsTokenType("_");
  IElementType UNION = new RsTokenType("union_kw");
  IElementType UNSAFE = new RsTokenType("unsafe");
  IElementType USE = new RsTokenType("use");
  IElementType WHERE = new RsTokenType("where");
  IElementType WHILE = new RsTokenType("while");
  IElementType XOR = new RsTokenType("^");
  IElementType XOREQ = new RsTokenType("^=");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ALIAS) {
        return new RsAliasImpl(node);
      }
      else if (type == ARRAY_EXPR) {
        return new RsArrayExprImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new RsArrayTypeImpl(node);
      }
      else if (type == ASSERT_MACRO_ARGUMENT) {
        return new RsAssertMacroArgumentImpl(node);
      }
      else if (type == ASSOC_TYPE_BINDING) {
        return new RsAssocTypeBindingImpl(node);
      }
      else if (type == BASE_TYPE) {
        return new RsBaseTypeImpl(node);
      }
      else if (type == BINARY_EXPR) {
        return new RsBinaryExprImpl(node);
      }
      else if (type == BINARY_OP) {
        return new RsBinaryOpImpl(node);
      }
      else if (type == BINDING_MODE) {
        return new RsBindingModeImpl(node);
      }
      else if (type == BLOCK) {
        return new RsBlockImpl(node);
      }
      else if (type == BLOCK_EXPR) {
        return new RsBlockExprImpl(node);
      }
      else if (type == BLOCK_FIELDS) {
        return new RsBlockFieldsImpl(node);
      }
      else if (type == BOUND) {
        return new RsBoundImpl(node);
      }
      else if (type == BREAK_EXPR) {
        return new RsBreakExprImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new RsCallExprImpl(node);
      }
      else if (type == CAST_EXPR) {
        return new RsCastExprImpl(node);
      }
      else if (type == COMPACT_TT) {
        return new RsCompactTTImpl(node);
      }
      else if (type == CONDITION) {
        return new RsConditionImpl(node);
      }
      else if (type == CONSTANT) {
        return new RsConstantImpl(node);
      }
      else if (type == CONT_EXPR) {
        return new RsContExprImpl(node);
      }
      else if (type == DOT_EXPR) {
        return new RsDotExprImpl(node);
      }
      else if (type == ELSE_BRANCH) {
        return new RsElseBranchImpl(node);
      }
      else if (type == EMPTY_STMT) {
        return new RsEmptyStmtImpl(node);
      }
      else if (type == ENUM_BODY) {
        return new RsEnumBodyImpl(node);
      }
      else if (type == ENUM_ITEM) {
        return new RsEnumItemImpl(node);
      }
      else if (type == ENUM_VARIANT) {
        return new RsEnumVariantImpl(node);
      }
      else if (type == EXPR) {
        return new RsExprImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new RsExprStmtImpl(node);
      }
      else if (type == EXPR_STMT_OR_LAST_EXPR) {
        return new RsExprStmtOrLastExprImpl(node);
      }
      else if (type == EXTERN_ABI) {
        return new RsExternAbiImpl(node);
      }
      else if (type == EXTERN_CRATE_ITEM) {
        return new RsExternCrateItemImpl(node);
      }
      else if (type == FIELD_DECL) {
        return new RsFieldDeclImpl(node);
      }
      else if (type == FIELD_LOOKUP) {
        return new RsFieldLookupImpl(node);
      }
      else if (type == FN_POINTER_TYPE) {
        return new RsFnPointerTypeImpl(node);
      }
      else if (type == FOREIGN_MOD_ITEM) {
        return new RsForeignModItemImpl(node);
      }
      else if (type == FORMAT_MACRO_ARG) {
        return new RsFormatMacroArgImpl(node);
      }
      else if (type == FORMAT_MACRO_ARGUMENT) {
        return new RsFormatMacroArgumentImpl(node);
      }
      else if (type == FOR_EXPR) {
        return new RsForExprImpl(node);
      }
      else if (type == FOR_IN_TYPE) {
        return new RsForInTypeImpl(node);
      }
      else if (type == FOR_LIFETIMES) {
        return new RsForLifetimesImpl(node);
      }
      else if (type == FUNCTION) {
        return new RsFunctionImpl(node);
      }
      else if (type == IF_EXPR) {
        return new RsIfExprImpl(node);
      }
      else if (type == IMPL_ITEM) {
        return new RsImplItemImpl(node);
      }
      else if (type == INDEX_EXPR) {
        return new RsIndexExprImpl(node);
      }
      else if (type == INNER_ATTR) {
        return new RsInnerAttrImpl(node);
      }
      else if (type == LABEL) {
        return new RsLabelImpl(node);
      }
      else if (type == LABEL_DECL) {
        return new RsLabelDeclImpl(node);
      }
      else if (type == LAMBDA_EXPR) {
        return new RsLambdaExprImpl(node);
      }
      else if (type == LET_DECL) {
        return new RsLetDeclImpl(node);
      }
      else if (type == LIFETIME) {
        return new RsLifetimeImpl(node);
      }
      else if (type == LIFETIME_PARAMETER) {
        return new RsLifetimeParameterImpl(node);
      }
      else if (type == LIFETIME_PARAM_BOUNDS) {
        return new RsLifetimeParamBoundsImpl(node);
      }
      else if (type == LIT_EXPR) {
        return new RsLitExprImpl(node);
      }
      else if (type == LOG_MACRO_ARGUMENT) {
        return new RsLogMacroArgumentImpl(node);
      }
      else if (type == LOOP_EXPR) {
        return new RsLoopExprImpl(node);
      }
      else if (type == MACRO_ARGUMENT) {
        return new RsMacroArgumentImpl(node);
      }
      else if (type == MACRO_BINDING) {
        return new RsMacroBindingImpl(node);
      }
      else if (type == MACRO_BINDING_GROUP) {
        return new RsMacroBindingGroupImpl(node);
      }
      else if (type == MACRO_BINDING_GROUP_SEPARATOR) {
        return new RsMacroBindingGroupSeparatorImpl(node);
      }
      else if (type == MACRO_CALL) {
        return new RsMacroCallImpl(node);
      }
      else if (type == MACRO_CALL_NO_SEMICOLONS) {
        return new RsMacroCallNoSemicolonsImpl(node);
      }
      else if (type == MACRO_DEFINITION) {
        return new RsMacroDefinitionImpl(node);
      }
      else if (type == MACRO_DEFINITION_BODY) {
        return new RsMacroDefinitionBodyImpl(node);
      }
      else if (type == MACRO_DEFINITION_CASE) {
        return new RsMacroDefinitionCaseImpl(node);
      }
      else if (type == MACRO_EXPANSION) {
        return new RsMacroExpansionImpl(node);
      }
      else if (type == MACRO_EXPANSION_CONTENTS) {
        return new RsMacroExpansionContentsImpl(node);
      }
      else if (type == MACRO_EXPANSION_GROUP_SEPARATOR) {
        return new RsMacroExpansionGroupSeparatorImpl(node);
      }
      else if (type == MACRO_EXPANSION_REFERENCE_GROUP) {
        return new RsMacroExpansionReferenceGroupImpl(node);
      }
      else if (type == MACRO_EXPR) {
        return new RsMacroExprImpl(node);
      }
      else if (type == MACRO_PATTERN) {
        return new RsMacroPatternImpl(node);
      }
      else if (type == MACRO_PATTERN_CONTENTS) {
        return new RsMacroPatternContentsImpl(node);
      }
      else if (type == MACRO_REFERENCE) {
        return new RsMacroReferenceImpl(node);
      }
      else if (type == MATCH_ARM) {
        return new RsMatchArmImpl(node);
      }
      else if (type == MATCH_ARM_GUARD) {
        return new RsMatchArmGuardImpl(node);
      }
      else if (type == MATCH_BODY) {
        return new RsMatchBodyImpl(node);
      }
      else if (type == MATCH_EXPR) {
        return new RsMatchExprImpl(node);
      }
      else if (type == MEMBERS) {
        return new RsMembersImpl(node);
      }
      else if (type == META_ITEM) {
        return new RsMetaItemImpl(node);
      }
      else if (type == META_ITEM_ARGS) {
        return new RsMetaItemArgsImpl(node);
      }
      else if (type == META_VAR_IDENTIFIER) {
        return new RsMetaVarIdentifierImpl(node);
      }
      else if (type == METHOD_CALL) {
        return new RsMethodCallImpl(node);
      }
      else if (type == MOD_DECL_ITEM) {
        return new RsModDeclItemImpl(node);
      }
      else if (type == MOD_ITEM) {
        return new RsModItemImpl(node);
      }
      else if (type == OUTER_ATTR) {
        return new RsOuterAttrImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new RsParenExprImpl(node);
      }
      else if (type == PATH) {
        return new RsPathImpl(node);
      }
      else if (type == PATH_EXPR) {
        return new RsPathExprImpl(node);
      }
      else if (type == PAT_BINDING) {
        return new RsPatBindingImpl(node);
      }
      else if (type == PAT_CONST) {
        return new RsPatConstImpl(node);
      }
      else if (type == PAT_ENUM) {
        return new RsPatEnumImpl(node);
      }
      else if (type == PAT_FIELD) {
        return new RsPatFieldImpl(node);
      }
      else if (type == PAT_IDENT) {
        return new RsPatIdentImpl(node);
      }
      else if (type == PAT_MACRO) {
        return new RsPatMacroImpl(node);
      }
      else if (type == PAT_RANGE) {
        return new RsPatRangeImpl(node);
      }
      else if (type == PAT_REF) {
        return new RsPatRefImpl(node);
      }
      else if (type == PAT_STRUCT) {
        return new RsPatStructImpl(node);
      }
      else if (type == PAT_TUP) {
        return new RsPatTupImpl(node);
      }
      else if (type == PAT_UNIQ) {
        return new RsPatUniqImpl(node);
      }
      else if (type == PAT_VEC) {
        return new RsPatVecImpl(node);
      }
      else if (type == PAT_WILD) {
        return new RsPatWildImpl(node);
      }
      else if (type == POLYBOUND) {
        return new RsPolyboundImpl(node);
      }
      else if (type == RANGE_EXPR) {
        return new RsRangeExprImpl(node);
      }
      else if (type == REF_LIKE_TYPE) {
        return new RsRefLikeTypeImpl(node);
      }
      else if (type == RET_EXPR) {
        return new RsRetExprImpl(node);
      }
      else if (type == RET_TYPE) {
        return new RsRetTypeImpl(node);
      }
      else if (type == SELF_PARAMETER) {
        return new RsSelfParameterImpl(node);
      }
      else if (type == STMT) {
        return new RsStmtImpl(node);
      }
      else if (type == STRUCT_ITEM) {
        return new RsStructItemImpl(node);
      }
      else if (type == STRUCT_LITERAL) {
        return new RsStructLiteralImpl(node);
      }
      else if (type == STRUCT_LITERAL_BODY) {
        return new RsStructLiteralBodyImpl(node);
      }
      else if (type == STRUCT_LITERAL_FIELD) {
        return new RsStructLiteralFieldImpl(node);
      }
      else if (type == TRAIT_ITEM) {
        return new RsTraitItemImpl(node);
      }
      else if (type == TRAIT_REF) {
        return new RsTraitRefImpl(node);
      }
      else if (type == TRAIT_TYPE) {
        return new RsTraitTypeImpl(node);
      }
      else if (type == TRY_EXPR) {
        return new RsTryExprImpl(node);
      }
      else if (type == TRY_MACRO_ARGUMENT) {
        return new RsTryMacroArgumentImpl(node);
      }
      else if (type == TT) {
        return new RsTtImpl(node);
      }
      else if (type == TUPLE_EXPR) {
        return new RsTupleExprImpl(node);
      }
      else if (type == TUPLE_FIELDS) {
        return new RsTupleFieldsImpl(node);
      }
      else if (type == TUPLE_FIELD_DECL) {
        return new RsTupleFieldDeclImpl(node);
      }
      else if (type == TUPLE_OR_PAREN_EXPR) {
        return new RsTupleOrParenExprImpl(node);
      }
      else if (type == TUPLE_TYPE) {
        return new RsTupleTypeImpl(node);
      }
      else if (type == TYPE_ALIAS) {
        return new RsTypeAliasImpl(node);
      }
      else if (type == TYPE_ARGUMENT_LIST) {
        return new RsTypeArgumentListImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new RsTypeParameterImpl(node);
      }
      else if (type == TYPE_PARAMETER_LIST) {
        return new RsTypeParameterListImpl(node);
      }
      else if (type == TYPE_PARAM_BOUNDS) {
        return new RsTypeParamBoundsImpl(node);
      }
      else if (type == TYPE_QUAL) {
        return new RsTypeQualImpl(node);
      }
      else if (type == TYPE_REFERENCE) {
        return new RsTypeReferenceImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new RsUnaryExprImpl(node);
      }
      else if (type == UNIT_EXPR) {
        return new RsUnitExprImpl(node);
      }
      else if (type == USE_GROUP) {
        return new RsUseGroupImpl(node);
      }
      else if (type == USE_ITEM) {
        return new RsUseItemImpl(node);
      }
      else if (type == USE_SPECK) {
        return new RsUseSpeckImpl(node);
      }
      else if (type == VALUE_ARGUMENT_LIST) {
        return new RsValueArgumentListImpl(node);
      }
      else if (type == VALUE_PARAMETER) {
        return new RsValueParameterImpl(node);
      }
      else if (type == VALUE_PARAMETER_LIST) {
        return new RsValueParameterListImpl(node);
      }
      else if (type == VARIANT_DISCRIMINANT) {
        return new RsVariantDiscriminantImpl(node);
      }
      else if (type == VEC_MACRO_ARGUMENT) {
        return new RsVecMacroArgumentImpl(node);
      }
      else if (type == VIS) {
        return new RsVisImpl(node);
      }
      else if (type == VIS_RESTRICTION) {
        return new RsVisRestrictionImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new RsWhereClauseImpl(node);
      }
      else if (type == WHERE_PRED) {
        return new RsWherePredImpl(node);
      }
      else if (type == WHILE_EXPR) {
        return new RsWhileExprImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
