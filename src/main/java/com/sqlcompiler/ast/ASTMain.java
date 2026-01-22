package com.sqlcompiler.ast;

import com.sqlcompiler.lexer.SQLLexer;
import com.sqlcompiler.parser.SQLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Main class for demonstrating the Abstract Syntax Tree (AST) stage.

 * This class:
 * 1. Reads SQL input
 * 2. Runs the Lexer to tokenize the input
 * 3. Runs the Parser to generate the Parse Tree
 * 4. Uses ASTBuilderVisitor to construct the AST
 * 5. Prints the AST in hierarchical textual format

 * This is Stage 3 of the compiler: AST Construction.
 * No semantic analysis, execution, or optimization is performed.
 */
public class ASTMain {

    public static void main(String[] args) {
        // Example SQL input from the assignment
        String sql = """
            SELECT
            foo, bar as baz
            FROM
            mytable
            WHERE
            foo LIKE '%neat%'
            ORDER BY
            foo DESC;
            """;

        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║       SQL Compiler - Stage 3: Abstract Syntax Tree (AST)     ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        System.out.println();

        // Display input SQL
        System.out.println("=== Input SQL ===");
        System.out.println(sql.trim());
        System.out.println();

        // Build AST
        ASTNode ast = buildAST(sql);

        if (ast != null) {
            // Print AST
            System.out.println("=== Abstract Syntax Tree (AST) ===");
            ast.print();
            System.out.println();
        }

        // Additional examples
        System.out.println("═══════════════════════════════════════════════════════════════");
        System.out.println("Additional Examples:");
        System.out.println("═══════════════════════════════════════════════════════════════");
        
        // Example 2: INSERT statement
        runExample("INSERT Statement", 
            "INSERT INTO users (id, name, email) VALUES (1, 'John', 'john@example.com');");

        // Example 3: UPDATE statement
        runExample("UPDATE Statement",
            "UPDATE products SET price = 99, stock = 50 WHERE id = 5;");

        // Example 4: DELETE statement
        runExample("DELETE Statement",
            "DELETE FROM logs WHERE created_at < '2023-01-01';");

        // Example 5: CREATE TABLE statement
        runExample("CREATE TABLE Statement",
            "CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50) NOT NULL, salary DECIMAL(10,2));");

        // Example 6: Complex SELECT with multiple clauses
        runExample("Complex SELECT",
            "SELECT id, name, COUNT(*) FROM orders WHERE status = 'active' GROUP BY category HAVING total > 100 ORDER BY name ASC LIMIT 10;");

        // Example 7: CTE statement
        runExample("CTE Statement",
            "WITH active_users AS (SELECT id, name FROM users WHERE status = 'active') SELECT * FROM active_users;");

        // Example 8: DECLARE CURSOR
        runExample("DECLARE CURSOR",
            "DECLARE emp_cursor CURSOR FOR SELECT id, name FROM employees WHERE dept = 'IT';");
    }

    /**
     * Runs an example and prints its AST.
     */
    private static void runExample(String title, String sql) {
        System.out.println();
        System.out.println("--- " + title + " ---");
        System.out.println("SQL: " + sql);
        System.out.println("AST:");
        
        ASTNode ast = buildAST(sql);
        if (ast != null) {
            ast.print();
        }
    }

    /**
     * Builds an AST from SQL input.
     * 
     * @param sql The SQL input string
     * @return The root AST node, or null if parsing failed
     */
    public static ASTNode buildAST(String sql) {
        try {
            // Step 1: Lexical Analysis
            SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Step 2: Syntax Analysis (Parsing)
            SQLParser parser = new SQLParser(tokens);
            ParseTree parseTree = parser.script();

            // Check for syntax errors
            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Syntax errors detected. AST construction aborted.");
                return null;
            }

            // Step 3: AST Construction
            ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();
            return astBuilder.visit(parseTree);

        } catch (Exception e) {
            System.err.println("Error building AST: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Builds an AST for a single statement.
     */
    public static ASTNode buildASTSingleStatement(String sql) {
        try {
            SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(tokens);
            ParseTree parseTree = parser.query();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                return null;
            }

            ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();
            return astBuilder.visit(parseTree);

        } catch (Exception e) {
            return null;
        }
    }
}
