
/*
* generated by Xtext
*/
lexer grammar InternalPPLexer;


@header {
package org.cloudsmith.geppetto.pp.dsl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}




KEYWORD_64 : 'inherits';

KEYWORD_63 : 'default';

KEYWORD_61 : 'define';

KEYWORD_62 : 'import';

KEYWORD_57 : 'class';

KEYWORD_58 : 'elsif';

KEYWORD_59 : 'false';

KEYWORD_60 : 'undef';

KEYWORD_53 : 'case';

KEYWORD_54 : 'else';

KEYWORD_55 : 'node';

KEYWORD_56 : 'true';

KEYWORD_49 : '<<|';

KEYWORD_50 : '\\${';

KEYWORD_51 : 'and';

KEYWORD_52 : '|>>';

KEYWORD_23 : '!=';

KEYWORD_24 : '!~';

KEYWORD_25 : '${';

KEYWORD_26 : '+=';

KEYWORD_27 : '+>';

KEYWORD_28 : '->';

KEYWORD_29 : '::';

KEYWORD_30 : '<-';

KEYWORD_31 : '<<';

KEYWORD_32 : '<=';

KEYWORD_33 : '<|';

KEYWORD_34 : '<~';

KEYWORD_35 : '==';

KEYWORD_36 : '=>';

KEYWORD_37 : '=~';

KEYWORD_38 : '>=';

KEYWORD_39 : '>>';

KEYWORD_40 : '\\"';

KEYWORD_41 : '\\$';

KEYWORD_42 : '\\\'';

KEYWORD_43 : '\\\\';

KEYWORD_44 : 'if';

KEYWORD_45 : 'in';

KEYWORD_46 : 'or';

KEYWORD_47 : '|>';

KEYWORD_48 : '~>';

KEYWORD_1 : '!';

KEYWORD_2 : '"';

KEYWORD_3 : '$';

KEYWORD_4 : '\'';

KEYWORD_5 : '(';

KEYWORD_6 : ')';

KEYWORD_7 : '*';

KEYWORD_8 : '+';

KEYWORD_9 : ',';

KEYWORD_10 : '-';

KEYWORD_11 : '/';

KEYWORD_12 : ':';

KEYWORD_13 : ';';

KEYWORD_14 : '<';

KEYWORD_15 : '=';

KEYWORD_16 : '>';

KEYWORD_17 : '?';

KEYWORD_18 : '@';

KEYWORD_19 : '[';

KEYWORD_20 : ']';

KEYWORD_21 : '{';

KEYWORD_22 : '}';



RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' ((' '|'\u00A0'|'\t')* '\r'? '\n')?;

RULE_SL_COMMENT : '#' ~(('\r'|'\n'))* ('\r'? '\n')?;

RULE_WS : (' '|'\u00A0'|'\t'|'\r'|'\n')+;

RULE_WORD_CHARS : ('0'..'9'|'a'..'z'|'A'..'Z'|'_'|'.'|'-')+;

RULE_REGULAR_EXPRESSION : '/' RULE_RE_BODY '/' RULE_RE_FLAGS?;

fragment RULE_RE_BODY : RULE_RE_FIRST_CHAR RULE_RE_FOLLOW_CHAR*;

fragment RULE_RE_FIRST_CHAR : (~(('\n'|'*'|'/'|'\\'))|RULE_RE_BACKSLASH_SEQUENCE);

fragment RULE_RE_FOLLOW_CHAR : (RULE_RE_FIRST_CHAR|'*');

fragment RULE_RE_BACKSLASH_SEQUENCE : '\\' ~('\n');

fragment RULE_RE_FLAGS : ('a'..'z')+;

RULE_ANY_OTHER : .;



