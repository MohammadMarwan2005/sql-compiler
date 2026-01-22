package com.sqlcompiler.semantic;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collects and reports semantic errors during SQL analysis.
 * Unlike syntax errors (which stop parsing), semantic errors are collected
 * to report multiple issues in a single pass.
 */
public class SemanticErrorListener {
    private final List<SemanticError> errors;

    public SemanticErrorListener() {
        this.errors = new ArrayList<>();
    }

    /**
     * Reports a semantic error at the location of the given parse tree context.
     *
     * @param ctx     The parser rule context where the error occurred
     * @param type    The type of semantic error
     * @param message The detailed error message
     */
    public void reportError(ParserRuleContext ctx, SemanticErrorType type, String message) {
        Token startToken = ctx.getStart();
        int line = startToken != null ? startToken.getLine() : 0;
        int column = startToken != null ? startToken.getCharPositionInLine() : 0;
        errors.add(new SemanticError(type, message, line, column));
    }

    /**
     * Reports a semantic error at a specific token location.
     *
     * @param token   The token where the error occurred
     * @param type    The type of semantic error
     * @param message The detailed error message
     */
    public void reportError(Token token, SemanticErrorType type, String message) {
        int line = token != null ? token.getLine() : 0;
        int column = token != null ? token.getCharPositionInLine() : 0;
        errors.add(new SemanticError(type, message, line, column));
    }

    /**
     * Reports a semantic error with explicit location.
     *
     * @param line    The line number (1-based)
     * @param column  The column number (0-based)
     * @param type    The type of semantic error
     * @param message The detailed error message
     */
    public void reportError(int line, int column, SemanticErrorType type, String message) {
        errors.add(new SemanticError(type, message, line, column));
    }

    /**
     * Returns true if any semantic errors have been reported.
     */
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    /**
     * Returns the number of errors reported.
     */
    public int getErrorCount() {
        return errors.size();
    }

    /**
     * Returns an unmodifiable list of all reported errors.
     */
    public List<SemanticError> getErrors() {
        return Collections.unmodifiableList(errors);
    }

    /**
     * Clears all reported errors.
     */
    public void clear() {
        errors.clear();
    }

    /**
     * Prints all errors to standard error.
     */
    public void printErrors() {
        for (SemanticError error : errors) {
            System.err.println(error.format());
        }
    }

    /**
     * Returns a formatted summary of all errors.
     */
    public String getErrorSummary() {
        if (errors.isEmpty()) {
            return "No semantic errors.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Found %d semantic error(s):\n", errors.size()));
        for (SemanticError error : errors) {
            sb.append("  ").append(error.format()).append("\n");
        }
        return sb.toString();
    }
}
