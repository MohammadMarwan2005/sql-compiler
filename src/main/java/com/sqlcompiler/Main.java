package com.sqlcompiler;

import com.sqlcompiler.lexer.SQLLexer;
import com.sqlcompiler.parser.SQLParser;
import com.sqlcompiler.utils.InputReader;
import com.sqlcompiler.semantic.*;
import org.antlr.v4.runtime.*;

import java.util.Arrays;

/**
 * Main entry point for the SQL Compiler.
 * 
 * Compiler Pipeline:
 * 1. Lexical Analysis (SQLLexer) - Tokenize input
 * 2. Syntax Analysis (SQLParser) - Build parse tree
 * 3. Semantic Analysis (SemanticAnalyzer) - Type checking, identifier resolution
 * 4. [Future] AST Construction
 * 5. [Future] Code Generation / Execution
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Test SQL - one statement at a time
        // Try with non-existent table to see error:
        String sql = "SELECT name, age FROM employees WHERE age > 20";
        
        // Working examples (uncomment to try):
        // String sql = "SELECT name, age FROM users WHERE age > 20";
        // String sql = "SELECT * FROM orders";
        // String sql = "SELECT unknown_column FROM users";  // undefined column error
        
        System.out.println("=== Input SQL ===");
        System.out.println(sql);
        System.out.println();
        
        // ==================== Phase 1: Lexical Analysis ====================
        SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // ==================== Phase 2: Syntax Analysis ====================
        SQLParser parser = new SQLParser(tokens);
        SQLParser.QueryContext tree = parser.query();
        
        // Check for syntax errors
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors detected. Aborting.");
            System.exit(1);
        }
        
        System.out.println("=== Parse Tree ===");
        System.out.println(tree.toStringTree(parser));
        System.out.println();
        
        // ==================== Phase 3: Semantic Analysis ====================
        
        // Create symbol table and populate with sample schema
        // In a real database, this would be loaded from the catalog
        SymbolTable symbolTable = createSampleSchema();
        
        // Run semantic analysis
        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
        boolean semanticSuccess = analyzer.analyze(tree);
        
        if (!semanticSuccess) {
            System.err.println("=== Semantic Errors ===");
            analyzer.printErrors();
            System.exit(1);
        }
        
        System.out.println("=== Semantic Analysis ===");
        System.out.println("Semantic check: OK");
        System.out.println();
        
        // ==================== Phase 4: AST Construction ====================
        // TODO: Implement AST builder in next phase
        System.out.println("=== Next Phase ===");
        System.out.println("Ready for AST construction.");
    }
    
    /**
     * Creates a sample database schema for testing semantic analysis.
     * In a production compiler, this would be loaded from database metadata.
     */
    private static SymbolTable createSampleSchema() {
        SymbolTable symbolTable = new SymbolTable();
        
        // Create 'users' table
        TableInfo users = new TableInfo("users", Arrays.asList(
            new ColumnInfo("id", SQLType.INTEGER),
            new ColumnInfo("name", SQLType.STRING, true),
            new ColumnInfo("email", SQLType.STRING, true),
            new ColumnInfo("age", SQLType.INTEGER, true),
            new ColumnInfo("active", SQLType.BOOLEAN)
        ));
        symbolTable.registerTable(users);
        
        // Create 'orders' table
        TableInfo orders = new TableInfo("orders", Arrays.asList(
            new ColumnInfo("id", SQLType.INTEGER),
            new ColumnInfo("user_id", SQLType.INTEGER),
            new ColumnInfo("total", SQLType.FLOAT),
            new ColumnInfo("status", SQLType.STRING, true),
            new ColumnInfo("created_at", SQLType.STRING, true)
        ));
        symbolTable.registerTable(orders);
        
        // Create 'products' table
        TableInfo products = new TableInfo("products", Arrays.asList(
            new ColumnInfo("id", SQLType.INTEGER),
            new ColumnInfo("name", SQLType.STRING),
            new ColumnInfo("price", SQLType.FLOAT),
            new ColumnInfo("quantity", SQLType.INTEGER),
            new ColumnInfo("available", SQLType.BOOLEAN)
        ));
        symbolTable.registerTable(products);
        
        return symbolTable;
    }
}
