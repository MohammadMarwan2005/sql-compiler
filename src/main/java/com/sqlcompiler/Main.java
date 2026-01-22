package com.sqlcompiler;

import com.sqlcompiler.lexer.SQLLexer;
import com.sqlcompiler.parser.SQLParser;
import com.sqlcompiler.test.TestCaseManager;
import com.sqlcompiler.test.TestRunner;
import com.sqlcompiler.utils.InputReader;
import com.sqlcompiler.semantic.*;
import org.antlr.v4.runtime.*;

import java.util.Arrays;

/**
 * Main entry point for the SQL Compiler.
 * <p>
 * Compiler Pipeline:
 * 1. Lexical Analysis (SQLLexer) - Tokenize input
 * 2. Syntax Analysis (SQLParser) - Build parse tree
 * 3. Semantic Analysis (SemanticAnalyzer) - Type checking, identifier resolution
 * 4. [Future] AST Construction
 * 5. [Future] Code Generation / Execution
 */
public class Main {
    
    // ==================== CONFIGURATION ====================
    // Change these variables to control execution mode
    
    /** 
     * Run mode options:
     * - "SQL"           : Run the SQL statement defined below
     * - "TEST_ALL"      : Run all supported test cases
     * - "TEST_LIST"     : List all available test cases
     * - "TEST_CATEGORY" : Run a specific category (set TEST_CATEGORY below)
     * - "TEST_SINGLE"   : Run a single test by name (set TEST_NAME below)
     */

    private static final String RUN_MODE = "TEST_CATEGORY";
    
    /** Category to run when RUN_MODE = "TEST_CATEGORY" */
    private static final String TEST_CATEGORY = "PHASE1_FEATURES";
    
    /** Test name to run when RUN_MODE = "TEST_SINGLE" */
    private static final String TEST_NAME = "CREATE_SIMPLE_TABLE";
    
    // ==================== MAIN METHOD ====================
    
    public static void main(String[] args) throws Exception {
        
        // Handle different run modes
        switch (RUN_MODE) {
            case "TEST_ALL" -> {
                TestRunner runner = new TestRunner();
                runner.setVerbose(true);
                runner.runAllSupported();
                return;
            }
            case "TEST_LIST" -> {
                TestCaseManager manager = new TestCaseManager();
                manager.printAllTestCases();
                manager.printStatistics();
                return;
            }
            case "TEST_CATEGORY" -> {
                TestRunner runner = new TestRunner();
                runner.setVerbose(true);
                runner.runCategory(TEST_CATEGORY);
                return;
            }
            case "TEST_SINGLE" -> {
                TestRunner runner = new TestRunner();
                runner.setVerbose(true);
                runner.runByName(TEST_NAME);
                return;
            }
        }

        // ==================== SQL MODE ====================
        // Modify this SQL to test different statements
        
//        String sql = """
//            CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50) NOT NULL);
//            INSERT INTO test (id, name) VALUES (1, 'name1');
//            INSERT INTO test (id, name) VALUES (2, 'name2');
//            SELECT * FROM test;
//            """;
        String sql = """
                [ WITH <common_table_expression> [...n] ]
                              UPDATE
                              [ TOP ( expression ) [ PERCENT ] ]
                              { { table_alias | <object> | rowset_function_limited
                              [ WITH ( <Table_Hint_Limited> [ ...n ] ) ]
                              }
                              | @table_variable
                              }
                              SET
                              { column_name = { expression | DEFAULT | NULL }
                              | { udt_column_name.{ { property_name = expression
                              | field_name = expression }
                              | method_name ( argument [ ,...n ] )
                              }
                              }
                              | column_name { .WRITE ( expression , @Offset , @Length ) }
                              | @variable = expression
                              | @variable = column = expression
                              | column_name { += | -= | *= | /= | %= | &= | ^= | |= } expression
                              | @variable { += | -= | *= | /= | %= | &= | ^= | |= } expression
                              | @variable = column { += | -= | *= | /= | %= | &= | ^= | |= } expression
                              } [ ,...n ]
                              [ <OUTPUT Clause> ]
                              [ FROM{ <table_source> } [ ,...n ] ]
                              [ WHERE { <search_condition>
                              | { [ CURRENT OF
                              { { [ GLOBAL ] cursor_name }
                              | cursor_variable_name
                              }
                              ]
                              }
                              }
                              ]
                              [ OPTION ( <query_hint> [ ,...n ] ) ]
                              [ ; ]
                              <object> ::=
                              {
                              [ server_name . database_name . schema_name .
                              | database_name .[ schema_name ] .
                              | schema_name .
                              ]
                              table_or_view_name}
              """;

        // Single statement examples (uncomment to try):
        // String sql = "SELECT name, age FROM users WHERE age > 20";
        // String sql = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50))";

        System.out.println("=== Input SQL ===");
        System.out.println(sql);
        System.out.println();

        // ==================== Phase 1: Lexical Analysis ====================
        SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // ==================== Phase 2: Syntax Analysis ====================
        SQLParser parser = new SQLParser(tokens);
        
        // Use script() for multiple statements, query() for single statement
        SQLParser.ScriptContext tree = parser.script();

        // Check for syntax errors
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.println("Syntax errors detected. Aborting.");
            System.exit(1);
        }

        System.out.println("=== Parse Tree ===");
        System.out.println(tree.toStringTree(parser));
        System.out.println();

        // ==================== Phase 3: Semantic Analysis ====================

        // Create symbol table (empty for fresh start, or with sample schema)
        SymbolTable symbolTable = new SymbolTable();
        // Optionally pre-populate: symbolTable = createSampleSchema();

        // Run semantic analysis on the script
        SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
        boolean semanticSuccess = analyzer.analyzeScript(tree);

        // Print each statement result
        System.out.println("=== Semantic Analysis ===");
        int stmtNum = 1;
        for (SQLParser.StatementContext stmt : tree.statement()) {
            System.out.println("Statement " + stmtNum + ": " + getStatementType(stmt));
            stmtNum++;
        }
        System.out.println();

        if (!semanticSuccess) {
            System.err.println("=== Semantic Errors ===");
            analyzer.printErrors();
            System.exit(1);
        }

        System.out.println("All statements: OK");
        System.out.println();

        // Show tables in symbol table after processing
        System.out.println("=== Symbol Table (Tables) ===");
        for (String tableName : symbolTable.getCatalogTableNames()) {
            TableInfo table = symbolTable.resolveTable(tableName);
            System.out.println("Table: " + tableName);
            for (ColumnInfo col : table.getColumns()) {
                System.out.println("  - " + col.getName() + " : " + col.getType() + 
                        (col.isNullable() ? " (nullable)" : " (not null)"));
            }
        }
        System.out.println();

        // ==================== Phase 4: AST Construction ====================
        System.out.println("=== Next Phase ===");
        System.out.println("Ready for AST construction.");
    }

    /**
     * Gets a human-readable description of a statement type.
     */
    private static String getStatementType(SQLParser.StatementContext stmt) {
        if (stmt.selectStatement() != null) return "SELECT";
        if (stmt.insertStatement() != null) return "INSERT";
        if (stmt.updateStatement() != null) return "UPDATE";
        if (stmt.deleteStatement() != null) return "DELETE";
        if (stmt.createTableStatement() != null) return "CREATE TABLE";
        if (stmt.dropTableStatement() != null) return "DROP TABLE";
        if (stmt.alterTableStatement() != null) return "ALTER TABLE";
        if (stmt.truncateTableStatement() != null) return "TRUNCATE TABLE";
        if (stmt.createIndexStatement() != null) return "CREATE INDEX";
        if (stmt.dropIndexStatement() != null) return "DROP INDEX";
        if (stmt.createDatabaseStatement() != null) return "CREATE DATABASE";
        if (stmt.dropDatabaseStatement() != null) return "DROP DATABASE";
        return "UNKNOWN";
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
