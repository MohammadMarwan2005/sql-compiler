package com.sqlcompiler.semantic;

/**
 * Represents a semantic error detected during SQL analysis.
 * Contains the error type, message, and source location information.
 */
public class SemanticError {
    private final SemanticErrorType type;
    private final String message;
    private final int line;
    private final int column;

    /**
     * Creates a new semantic error.
     *
     * @param type    The type/category of the error
     * @param message The detailed error message
     * @param line    The line number where the error occurred (1-based)
     * @param column  The column number where the error occurred (0-based)
     */
    public SemanticError(SemanticErrorType type, String message, int line, int column) {
        this.type = type;
        this.message = message;
        this.line = line;
        this.column = column;
    }

    public SemanticErrorType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    /**
     * Returns a formatted error message suitable for display.
     */
    public String format() {
        return String.format("Semantic Error [%s] at line %d, column %d: %s",
                type.name(), line, column, message);
    }

    @Override
    public String toString() {
        return format();
    }
}
