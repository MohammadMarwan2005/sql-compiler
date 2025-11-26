parser grammar SQLParser;

@header {
package com.sqlcompiler.parser;
}

options { tokenVocab = SQLLexer; }

// Main entry point
query
    :   selectStatement SEMICOLON? EOF
    |   insertStatement SEMICOLON? EOF
    |   updateStatement SEMICOLON? EOF
    |   deleteStatement SEMICOLON? EOF
    ;

// SELECT statement
selectStatement
    :   SELECT (DISTINCT)? selectList
        FROM tableName
        (WHERE expression)?
        (GROUP BY columnList)?
        (HAVING expression)?
        (ORDER BY orderByList)?
        (LIMIT INT)?
    ;

selectList
    :   STAR                                    # selectAll
    |   columnList                             # selectColumns
    ;

columnList
    :   column (COMMA column)*
    ;

column
    :   (tableName DOT)? IDENT (AS IDENT)?      # columnName
    |   expression (AS IDENT)?                  # columnWithExpression
    ;

tableName
    :   IDENT (AS IDENT)?
    ;

// Expressions
expression
    :   logicalOrExpression
    ;

logicalOrExpression
    :   logicalAndExpression (OR_OP logicalAndExpression)*
    ;

logicalAndExpression
    :   comparisonExpression (AND_OP comparisonExpression)*
    ;

comparisonExpression
    :   additiveExpression (comparisonOp additiveExpression)?
    ;

additiveExpression
    :   multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;

multiplicativeExpression
    :   unaryExpression ((STAR | DIV | MOD) unaryExpression)*
    ;

unaryExpression
    :   NOT unaryExpression                      # notExpression
    |   primaryExpression                        # primaryExpr
    ;

primaryExpression
    :   LPAREN expression RPAREN                # parenExpression
    |   (tableName DOT)? IDENT                  # columnReference
    |   USER_VAR                                 # userVariable
    |   literal                                  # literalExpression
    ;

comparisonOp
    :   EQ | NE | LT | LE | GT | GE | LIKE
    ;

literal
    :   INT
    |   FLOAT
    |   HEX_INT
    |   BINARY_INT
    |   STRING
    |   HEX_STRING
    |   BIT_STRING
    |   TRUE
    |   FALSE
    |   NULL
    |   USER_VAR
    ;

orderByList
    :   orderByItem (COMMA orderByItem)*
    ;

orderByItem
    :   column (ASC | DESC)?
    ;

// INSERT statement
insertStatement
    :   INSERT INTO tableName
        (LPAREN columnList RPAREN)?
        VALUES LPAREN valueList RPAREN
    ;

valueList
    :   literal (COMMA literal)*
    ;

// UPDATE statement
updateStatement
    :   UPDATE tableName
        SET assignmentList
        (WHERE expression)?
    ;

assignmentList
    :   assignment (COMMA assignment)*
    ;

assignment
    :   IDENT EQ expression
    ;

// DELETE statement
deleteStatement
    :   DELETE FROM tableName
        (WHERE expression)?
    ;

