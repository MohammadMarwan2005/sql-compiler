parser grammar SQLParser;

@header {
package com.sqlcompiler.parser;
}

options {
    tokenVocab = SQLLexer;
    visitor = true;
}

// Main entry point - supports multiple statements
script
    :   statement+ EOF
    ;

// Single query (for backward compatibility)
query
    :   statement EOF
    ;

// A single SQL statement
statement
    :   selectStatement SEMICOLON?
    |   insertStatement SEMICOLON?
    |   updateStatement SEMICOLON?
    |   deleteStatement SEMICOLON?
    |   createTableStatement SEMICOLON?
    |   dropTableStatement SEMICOLON?
    |   alterTableStatement SEMICOLON?
    |   truncateTableStatement SEMICOLON?
    |   createIndexStatement SEMICOLON?
    |   dropIndexStatement SEMICOLON?
    |   createDatabaseStatement SEMICOLON?
    |   dropDatabaseStatement SEMICOLON?
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
    :   (tableName DOT)? identifier (AS identifier)?      # columnName
    |   expression (AS identifier)?                       # columnWithExpression
    ;

tableName
    :   schemaName DOT identifier (AS identifier)?        # qualifiedTableName
    |   identifier (AS identifier)?                       # simpleTableName
    ;

// Schema name (e.g., dbo)
schemaName
    :   identifier
    ;

// Identifier can be regular, quoted, or bracket-quoted
identifier
    :   IDENT
    |   QUOTED_IDENT
    |   BRACKET_IDENT
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
    :   additiveExpression (comparisonOp additiveExpression)?       # simpleComparison
    |   additiveExpression IN LPAREN valueList RPAREN               # inExpression
    |   additiveExpression NOT IN LPAREN valueList RPAREN           # notInExpression
    |   additiveExpression BETWEEN additiveExpression AND additiveExpression  # betweenExpression
    |   additiveExpression IS NULL                                  # isNullExpression
    |   additiveExpression IS NOT NULL                              # isNotNullExpression
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
    |   (tableName DOT)? identifier             # columnReference
    |   USER_VAR                                # userVariable
    |   literal                                 # literalExpression
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
    :   valueItem (COMMA valueItem)*
    ;

valueItem
    :   literal
    |   expression
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
    :   identifier EQ expression
    ;

// DELETE statement
deleteStatement
    :   DELETE FROM tableName
        (WHERE expression)?
    ;

// ==================== DDL Statements ====================

// CREATE TABLE statement
createTableStatement
    :   CREATE TABLE (IF NOT EXISTS)? tableIdentifier
        LPAREN columnDefinitionList (COMMA tableConstraint)* RPAREN
    ;

tableIdentifier
    :   (schemaName DOT)? identifier
    ;

columnDefinitionList
    :   columnDefinition (COMMA columnDefinition)*
    ;

columnDefinition
    :   identifier dataType columnConstraint*
    ;

dataType
    :   TYPE_INT                                            # intType
    |   TYPE_INTEGER                                        # integerType
    |   TYPE_BIGINT                                         # bigintType
    |   TYPE_SMALLINT                                       # smallintType
    |   TYPE_TINYINT                                        # tinyintType
    |   TYPE_FLOAT                                          # floatType
    |   TYPE_DOUBLE                                         # doubleType
    |   TYPE_DECIMAL (LPAREN INT (COMMA INT)? RPAREN)?      # decimalType
    |   TYPE_NUMERIC (LPAREN INT (COMMA INT)? RPAREN)?      # numericType
    |   TYPE_VARCHAR LPAREN (INT | TYPE_MAX) RPAREN         # varcharType
    |   TYPE_NVARCHAR LPAREN (INT | TYPE_MAX) RPAREN        # nvarcharType
    |   TYPE_CHAR (LPAREN INT RPAREN)?                      # charType
    |   TYPE_NCHAR (LPAREN INT RPAREN)?                     # ncharType
    |   TYPE_TEXT                                           # textType
    |   TYPE_NTEXT                                          # ntextType
    |   TYPE_BOOLEAN                                        # booleanType
    |   TYPE_BOOL                                           # boolType
    |   TYPE_DATE                                           # dateType
    |   TYPE_DATETIME                                       # datetimeType
    |   TYPE_TIMESTAMP                                      # timestampType
    |   TYPE_TIME                                           # timeType
    |   TYPE_BLOB                                           # blobType
    ;

columnConstraint
    :   NOT NULL                                            # notNullConstraint
    |   NULL                                                # nullConstraint
    |   PRIMARY KEY (CLUSTERED | NONCLUSTERED)?             # primaryKeyColumnConstraint
    |   UNIQUE                                              # uniqueColumnConstraint
    |   DEFAULT literal                                     # defaultConstraint
    |   AUTO_INCREMENT                                      # autoIncrementConstraint
    |   REFERENCES tableIdentifier (LPAREN identifier RPAREN)?  # referencesConstraint
    |   CHECK LPAREN expression RPAREN                      # checkColumnConstraint
    ;

tableConstraint
    :   PRIMARY KEY (CLUSTERED | NONCLUSTERED)? LPAREN columnNameList RPAREN  # primaryKeyTableConstraint
    |   UNIQUE (CLUSTERED | NONCLUSTERED)? (KEY)? (identifier)? LPAREN columnNameList RPAREN  # uniqueTableConstraint
    |   FOREIGN KEY (identifier)? LPAREN columnNameList RPAREN
        REFERENCES tableIdentifier LPAREN columnNameList RPAREN
        (ON DELETE referenceAction)? (ON UPDATE referenceAction)?             # foreignKeyConstraint
    |   CHECK LPAREN expression RPAREN                                        # checkTableConstraint
    |   CONSTRAINT identifier tableConstraint                                 # namedConstraint
    ;

columnNameList
    :   identifier (COMMA identifier)*
    ;

referenceAction
    :   CASCADE
    |   RESTRICT
    |   SET NULL
    |   SET DEFAULT
    ;

// DROP TABLE statement
dropTableStatement
    :   DROP TABLE (IF EXISTS)? tableIdentifier (CASCADE | RESTRICT)?
    ;

// ALTER TABLE statement
alterTableStatement
    :   ALTER TABLE tableIdentifier alterAction (COMMA alterAction)*
    ;

alterAction
    :   ADD (COLUMN)? columnDefinition                                        # addColumn
    |   ADD tableConstraint                                                   # addConstraint
    |   DROP (COLUMN)? identifier (CASCADE | RESTRICT)?                       # dropColumn
    |   DROP CONSTRAINT identifier                                            # dropConstraint
    |   DROP PRIMARY KEY                                                      # dropPrimaryKey
    |   DROP FOREIGN KEY identifier                                           # dropForeignKey
    |   DROP INDEX identifier                                                 # dropIndexAction
    |   MODIFY (COLUMN)? identifier dataType columnConstraint*                # modifyColumn
    |   CHANGE (COLUMN)? identifier identifier dataType columnConstraint*    # changeColumn
    |   RENAME TO tableIdentifier                                             # renameTable
    |   RENAME COLUMN identifier TO identifier                                # renameColumn
    ;

// TRUNCATE TABLE statement
truncateTableStatement
    :   TRUNCATE TABLE? tableIdentifier
    ;

// CREATE INDEX statement
createIndexStatement
    :   CREATE (UNIQUE)? (CLUSTERED | NONCLUSTERED)? INDEX (IF NOT EXISTS)? identifier
        ON tableIdentifier LPAREN indexColumnList RPAREN
    ;

indexColumnList
    :   indexColumn (COMMA indexColumn)*
    ;

indexColumn
    :   identifier (ASC | DESC)?
    ;

// DROP INDEX statement
dropIndexStatement
    :   DROP INDEX (IF EXISTS)? identifier (ON tableIdentifier)?
    ;

// CREATE DATABASE statement
createDatabaseStatement
    :   CREATE DATABASE (IF NOT EXISTS)? identifier
    ;

// DROP DATABASE statement
dropDatabaseStatement
    :   DROP DATABASE (IF EXISTS)? identifier
    ;

