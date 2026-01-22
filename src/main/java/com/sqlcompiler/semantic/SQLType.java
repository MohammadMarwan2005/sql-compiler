package com.sqlcompiler.semantic;

/**
 * Represents SQL data types used during semantic analysis.
 * These types are used for type checking and type inference of expressions.
 */
public enum SQLType {
    INTEGER,    // INT, HEX_INT, BINARY_INT literals
    FLOAT,      // FLOAT literals (decimal numbers)
    STRING,     // STRING, HEX_STRING, BIT_STRING literals
    BOOLEAN,    // TRUE, FALSE, and results of comparisons/logical operations
    NULL,       // NULL literal (compatible with any nullable type)
    UNKNOWN;    // Unresolved type (used for error recovery)

    /**
     * Checks if this type is numeric (can be used in arithmetic operations).
     */
    public boolean isNumeric() {
        return this == INTEGER || this == FLOAT;
    }

    /**
     * Checks if this type can be compared with another type.
     * NULL is comparable with any type. Same types are comparable.
     * Numeric types are comparable with each other.
     */
    public boolean isComparableTo(SQLType other) {
        if (this == UNKNOWN || other == UNKNOWN) {
            return true; // Allow comparison to avoid cascading errors
        }
        if (this == NULL || other == NULL) {
            return true; // NULL is comparable with anything
        }
        if (this == other) {
            return true;
        }
        // Numeric types are comparable with each other
        return this.isNumeric() && other.isNumeric();
    }

    /**
     * Returns the result type of an arithmetic operation between two types.
     * Returns UNKNOWN if the operation is not valid.
     */
    public static SQLType arithmeticResult(SQLType left, SQLType right) {
        if (left == UNKNOWN || right == UNKNOWN) {
            return UNKNOWN;
        }
        if (!left.isNumeric() || !right.isNumeric()) {
            return UNKNOWN; // Invalid arithmetic operation
        }
        // If either operand is FLOAT, result is FLOAT
        if (left == FLOAT || right == FLOAT) {
            return FLOAT;
        }
        return INTEGER;
    }
}
