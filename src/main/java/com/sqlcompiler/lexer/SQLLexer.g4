lexer grammar SQLLexer;

@header {
package com.sqlcompiler.lexer;
}

// Keywords
SELECT: [sS][eE][lL][eE][cC][tT];
FROM:   [fF][rR][oO][mM];
WHERE:  [wW][hH][eE][rR][eE];
INSERT: [iI][nN][sS][eE][rR][tT];
INTO:   [iI][nN][tT][oO];
UPDATE: [uU][pP][dD][aA][tT][eE];
DELETE: [dD][eE][lL][eE][tT][eE];
SET:    [sS][eE][tT];
VALUES: [vV][aA][lL][uU][eE][sS];
JOIN:   [jJ][oO][iI][nN];
INNER:  [iI][nN][nN][eE][rR];
LEFT:   [lL][eE][fF][tT];
RIGHT:  [rR][iI][gG][hH][tT];
ON:     [oO][nN];
AND:    [aA][nN][dD];
OR:     [oO][rR];
NOT:    [nN][oO][tT];
AS:     [aA][sS];
ORDER:  [oO][rR][dD][eE][rR];
BY:     [bB][yY];
GROUP:  [gG][rR][oO][uU][pP];
HAVING: [hH][aA][vV][iI][nN][gG];
LIMIT:  [lL][iI][mM][iI][tT];
DISTINCT: [dD][iI][sS][tT][iI][nN][cC][tT];
ASC:    [aA][sS][cC];
DESC:   [dD][eE][sS][cC];

// Identifiers
IDENT: [A-Za-z_] [A-Za-z0-9_]*;
QUOTED_IDENT: '`' (~'`')* '`' | '"' (~'"')* '"';

// User variables (@var, @@sysvar)
USER_VAR: '@' [@]? [A-Za-z_] [A-Za-z0-9_]*;

// Boolean literals
TRUE:  [tT][rR][uU][eE];
FALSE: [fF][aA][lL][sS][eE];


HEX_INT: '0' [xX] [0-9A-Fa-f]+;
BINARY_INT: '0' [bB] [01]+;


// Numbers
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+ | '.' [0-9]+;

// Strings
STRING: '\'' ('\'\'' | ~'\'')* '\'';
HEX_STRING: '0' [xX] [0-9A-Fa-f]+;
BIT_STRING: '0' [bB] [01]+;

// Comparison Operators
EQ: '=';
NE: '!=' | '<>';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
LIKE: [lL][iI][kK][eE];
IN: [iI][nN];
IS: [iI][sS];
NULL: [nN][uU][lL][lL];

// Arithmetic Operators
PLUS: '+';
MINUS: '-';
STAR: '*';
DIV: '/';
MOD: '%';

// Logical Operators
AND_OP: AND;
OR_OP: OR;
NOT_OP: NOT;

// Other Operators
COMMA: ',';
DOT: '.';
SEMICOLON: ';';
LPAREN: '(';
RPAREN: ')';

// Comments
LINE_COMMENT: '--' ~[\r\n]* -> skip;
// Block comments (handles nested comments with recursive approach)
BLOCK_COMMENT: '/*' (BLOCK_COMMENT | .)*? '*/' -> skip;

// Whitespace (including line continuation with \)
WS: [ \t\r\n]+ -> skip;
LINE_CONTINUATION: '\\' [ \t]* [\r\n] -> skip;

// Error
ERROR_CHAR: . ;

