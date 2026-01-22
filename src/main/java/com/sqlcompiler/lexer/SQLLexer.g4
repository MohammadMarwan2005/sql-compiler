lexer grammar SQLLexer;

@header {
package com.sqlcompiler.lexer;
}

// Keywords - DML
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

// Keywords - DDL
CREATE:     [cC][rR][eE][aA][tT][eE];
DROP:       [dD][rR][oO][pP];
ALTER:      [aA][lL][tT][eE][rR];
TRUNCATE:   [tT][rR][uU][nN][cC][aA][tT][eE];
TABLE:      [tT][aA][bB][lL][eE];
DATABASE:   [dD][aA][tT][aA][bB][aA][sS][eE];
INDEX:      [iI][nN][dD][eE][xX];
COLUMN:     [cC][oO][lL][uU][mM][nN];
ADD:        [aA][dD][dD];
MODIFY:     [mM][oO][dD][iI][fF][yY];
RENAME:     [rR][eE][nN][aA][mM][eE];
CHANGE:     [cC][hH][aA][nN][gG][eE];
TO:         [tT][oO];
IF:         [iI][fF];
EXISTS:     [eE][xX][iI][sS][tT][sS];
CASCADE:    [cC][aA][sS][cC][aA][dD][eE];
RESTRICT:   [rR][eE][sS][tT][rR][iI][cC][tT];

// Keywords - Constraints
PRIMARY:    [pP][rR][iI][mM][aA][rR][yY];
KEY:        [kK][eE][yY];
FOREIGN:    [fF][oO][rR][eE][iI][gG][nN];
REFERENCES: [rR][eE][fF][eE][rR][eE][nN][cC][eE][sS];
UNIQUE:     [uU][nN][iI][qQ][uU][eE];
CHECK:      [cC][hH][eE][cC][kK];
DEFAULT:    [dD][eE][fF][aA][uU][lL][tT];
AUTO_INCREMENT: [aA][uU][tT][oO] '_' [iI][nN][cC][rR][eE][mM][eE][nN][tT];
CONSTRAINT: [cC][oO][nN][sS][tT][rR][aA][iI][nN][tT];
CLUSTERED:  [cC][lL][uU][sS][tT][eE][rR][eE][dD];
NONCLUSTERED: [nN][oO][nN][cC][lL][uU][sS][tT][eE][rR][eE][dD];

// Keywords - Data Types
TYPE_INT:       [iI][nN][tT];
TYPE_INTEGER:   [iI][nN][tT][eE][gG][eE][rR];
TYPE_BIGINT:    [bB][iI][gG][iI][nN][tT];
TYPE_SMALLINT:  [sS][mM][aA][lL][lL][iI][nN][tT];
TYPE_TINYINT:   [tT][iI][nN][yY][iI][nN][tT];
TYPE_FLOAT:     [fF][lL][oO][aA][tT];
TYPE_DOUBLE:    [dD][oO][uU][bB][lL][eE];
TYPE_DECIMAL:   [dD][eE][cC][iI][mM][aA][lL];
TYPE_NUMERIC:   [nN][uU][mM][eE][rR][iI][cC];
TYPE_VARCHAR:   [vV][aA][rR][cC][hH][aA][rR];
TYPE_NVARCHAR:  [nN][vV][aA][rR][cC][hH][aA][rR];
TYPE_CHAR:      [cC][hH][aA][rR];
TYPE_NCHAR:     [nN][cC][hH][aA][rR];
TYPE_TEXT:      [tT][eE][xX][tT];
TYPE_NTEXT:     [nN][tT][eE][xX][tT];
TYPE_BOOLEAN:   [bB][oO][oO][lL][eE][aA][nN];
TYPE_BOOL:      [bB][oO][oO][lL];
TYPE_DATE:      [dD][aA][tT][eE];
TYPE_DATETIME:  [dD][aA][tT][eE][tT][iI][mM][eE];
TYPE_TIMESTAMP: [tT][iI][mM][eE][sS][tT][aA][mM][pP];
TYPE_TIME:      [tT][iI][mM][eE];
TYPE_BLOB:      [bB][lL][oO][bB];
TYPE_MAX:       [mM][aA][xX];

// Keywords that must come before IDENT
TRUE:    [tT][rR][uU][eE];
FALSE:   [fF][aA][lL][sS][eE];
NULL:    [nN][uU][lL][lL];
LIKE:    [lL][iI][kK][eE];
IN:      [iI][nN];
IS:      [iI][sS];
BETWEEN: [bB][eE][tT][wW][eE][eE][nN];

// Identifiers (must come AFTER all keywords)
IDENT: [A-Za-z_] [A-Za-z0-9_]*;
QUOTED_IDENT: '`' (~'`')* '`' | '"' (~'"')* '"';
BRACKET_IDENT: '[' (~']')* ']';  // T-SQL style [identifier]

// User variables (@var, @@sysvar)
USER_VAR: '@' [@]? [A-Za-z_] [A-Za-z0-9_]*;

// Numbers
HEX_INT: '0' [xX] [0-9A-Fa-f]+;
BINARY_INT: '0' [bB] [01]+;
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

