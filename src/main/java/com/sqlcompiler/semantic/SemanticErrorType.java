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
