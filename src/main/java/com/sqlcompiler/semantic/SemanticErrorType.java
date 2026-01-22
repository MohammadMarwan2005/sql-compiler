package com.sqlcompiler.semantic;

/**
 * Enumeration of semantic error types that can occur during SQL analysis.
 * Each error type represents a specific category of semantic violation.
 */
public enum SemanticErrorType {
    // Identifier resolution errors
    UNDEFINED_TABLE("Undefined table"),
    UNDEFINED_COLUMN("Undefined column"),
    AMBIGUOUS_COLUMN("Ambiguous column reference"),
    DUPLICATE_ALIAS("Duplicate alias"),

    // Type errors
    TYPE_MISMATCH("Type mismatch"),
    INVALID_ARITHMETIC_OPERAND("Invalid operand for arithmetic operation"),
    INVALID_COMPARISON_OPERAND("Invalid operand for comparison"),
    INVALID_LOGICAL_OPERAND("Invalid operand for logical operation"),
    NON_BOOLEAN_WHERE("WHERE clause must be a boolean expression"),
    NON_BOOLEAN_HAVING("HAVING clause must be a boolean expression"),

    // SQL constraint errors
    COLUMN_COUNT_MISMATCH("Column count does not match value count"),
    INVALID_ORDER_BY_COLUMN("Invalid column in ORDER BY clause"),
    INVALID_GROUP_BY_COLUMN("Invalid column in GROUP BY clause"),
    SELECT_ALL_NO_TABLE("Cannot use SELECT * without a valid table"),

    // DDL - CREATE errors
    TABLE_ALREADY_EXISTS("Table already exists"),
    DATABASE_ALREADY_EXISTS("Database already exists"),
    INDEX_ALREADY_EXISTS("Index already exists"),
    DUPLICATE_COLUMN_NAME("Duplicate column name in table definition"),
    INVALID_DATA_TYPE("Invalid data type"),
    INVALID_COLUMN_SIZE("Invalid column size specification"),
    MULTIPLE_PRIMARY_KEYS("Multiple primary key definitions"),
    INVALID_DEFAULT_VALUE("Default value type mismatch"),
    INVALID_AUTO_INCREMENT("AUTO_INCREMENT can only be used with integer types"),

    // DDL - DROP errors
    TABLE_NOT_EXISTS("Table does not exist"),
    DATABASE_NOT_EXISTS("Database does not exist"),
    INDEX_NOT_EXISTS("Index does not exist"),
    CANNOT_DROP_REFERENCED_TABLE("Cannot drop table referenced by foreign key"),

    // DDL - ALTER errors
    COLUMN_ALREADY_EXISTS("Column already exists in table"),
    COLUMN_NOT_EXISTS("Column does not exist in table"),
    CONSTRAINT_NOT_EXISTS("Constraint does not exist"),
    CANNOT_DROP_PRIMARY_KEY_COLUMN("Cannot drop column that is part of primary key"),
    INVALID_RENAME("Invalid rename operation"),

    // DDL - Constraint errors
    INVALID_FOREIGN_KEY_REFERENCE("Invalid foreign key reference"),
    FOREIGN_KEY_COLUMN_COUNT_MISMATCH("Foreign key column count mismatch"),
    REFERENCED_TABLE_NOT_EXISTS("Referenced table does not exist"),
    REFERENCED_COLUMN_NOT_EXISTS("Referenced column does not exist"),
    INVALID_CHECK_CONSTRAINT("Invalid check constraint expression"),

    // General errors
    UNKNOWN_ERROR("Unknown semantic error");

    private final String description;

    SemanticErrorType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
