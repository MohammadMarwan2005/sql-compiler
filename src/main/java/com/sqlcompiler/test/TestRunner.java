package com.sqlcompiler.test;

import com.sqlcompiler.lexer.SQLLexer;
import com.sqlcompiler.parser.SQLParser;
import com.sqlcompiler.semantic.*;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Runs SQL test cases and reports results.
 */
public class TestRunner {

    public static class TestResult {
        private final TestCaseManager.TestCase testCase;
        private final boolean syntaxOk;
        private final boolean semanticOk;
        private final String errorMessage;
        private final long executionTimeMs;

        public TestResult(TestCaseManager.TestCase testCase, boolean syntaxOk, 
                         boolean semanticOk, String errorMessage, long executionTimeMs) {
            this.testCase = testCase;
            this.syntaxOk = syntaxOk;
            this.semanticOk = semanticOk;
            this.errorMessage = errorMessage;
            this.executionTimeMs = executionTimeMs;
        }

        public TestCaseManager.TestCase getTestCase() { return testCase; }
        public boolean isSyntaxOk() { return syntaxOk; }
        public boolean isSemanticOk() { return semanticOk; }
        public boolean isSuccess() { return syntaxOk && semanticOk; }
        public String getErrorMessage() { return errorMessage; }
        public long getExecutionTimeMs() { return executionTimeMs; }

        @Override
        public String toString() {
            String status = isSuccess() ? "PASS" : "FAIL";
            String details = "";
            if (!syntaxOk) {
                details = " (Syntax Error)";
            } else if (!semanticOk) {
                details = " (Semantic Error)";
            }
            return String.format("[%s] %s%s - %dms", 
                status, testCase.getName(), details, executionTimeMs);
        }
    }

    private final TestCaseManager testCaseManager;
    private final List<TestResult> results = new ArrayList<>();
    private boolean verbose = false;

    public TestRunner() {
        this.testCaseManager = new TestCaseManager();
    }

    public TestRunner(TestCaseManager manager) {
        this.testCaseManager = manager;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    /**
     * Runs all supported test cases.
     */
    public void runAllSupported() {
        results.clear();
        System.out.println("=== Running All Supported Test Cases ===\n");
        
        for (TestCaseManager.TestCase tc : testCaseManager.getSupportedTestCases()) {
            TestResult result = runTestCase(tc);
            results.add(result);
            System.out.println(result);
            
            if (verbose && !result.isSuccess()) {
                System.out.println("  Error: " + result.getErrorMessage());
                System.out.println("  SQL: " + tc.getSql().trim().replace("\n", "\n       "));
            }
        }
        
        printSummary();
    }

    /**
     * Runs test cases in a specific category (only supported tests).
     */
    public void runCategory(String category) {
        runCategory(category, false);
    }

    /**
     * Runs test cases in a specific category.
     * @param category The category to run
     * @param includeUnsupported If true, also runs unsupported tests to see errors
     */
    public void runCategory(String category, boolean includeUnsupported) {
        results.clear();
        String mode = includeUnsupported ? " (including unsupported)" : " (supported only)";
        System.out.println("=== Running Category: " + category + mode + " ===\n");
        
        for (TestCaseManager.TestCase tc : testCaseManager.getTestCases(category)) {
            if (tc.isSupported() || includeUnsupported) {
                TestResult result = runTestCase(tc);
                results.add(result);
                System.out.println(result);
                
                if (verbose && !result.isSuccess()) {
                    System.out.println("  Error: " + result.getErrorMessage());
                }
            } else {
                System.out.println("[SKIP] " + tc.getName() + " (not yet supported)");
            }
        }
        
        printSummary();
    }

    /**
     * Runs a single test case by name.
     */
    public TestResult runByName(String name) {
        TestCaseManager.TestCase tc = testCaseManager.getTestCase(name);
        if (tc == null) {
            System.err.println("Test case not found: " + name);
            return null;
        }
        
        System.out.println("=== Running Test: " + name + " ===\n");
        System.out.println("SQL:");
        System.out.println(tc.getSql());
        System.out.println();
        
        TestResult result = runTestCase(tc);
        System.out.println("Result: " + result);
        
        if (!result.isSuccess()) {
            System.out.println("Error: " + result.getErrorMessage());
        }
        
        return result;
    }

    /**
     * Runs a custom SQL string.
     */
    public TestResult runCustom(String name, String sql) {
        TestCaseManager.TestCase tc = new TestCaseManager.TestCase(name, sql, "Custom test", true);
        
        System.out.println("=== Running Custom Test: " + name + " ===\n");
        System.out.println("SQL:");
        System.out.println(sql);
        System.out.println();
        
        TestResult result = runTestCase(tc);
        System.out.println("Result: " + result);
        
        if (!result.isSuccess()) {
            System.out.println("Error: " + result.getErrorMessage());
        }
        
        return result;
    }

    /**
     * Runs a test case and returns the result.
     */
    private TestResult runTestCase(TestCaseManager.TestCase tc) {
        long startTime = System.currentTimeMillis();
        
        try {
            // Phase 1: Lexical Analysis
            SQLLexer lexer = new SQLLexer(CharStreams.fromString(tc.getSql()));
            lexer.removeErrorListeners(); // Suppress console output
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Phase 2: Syntax Analysis
            SQLParser parser = new SQLParser(tokens);
            parser.removeErrorListeners(); // Suppress console output
            
            ErrorCollector errorCollector = new ErrorCollector();
            parser.addErrorListener(errorCollector);
            
            SQLParser.ScriptContext tree = parser.script();
            
            if (parser.getNumberOfSyntaxErrors() > 0) {
                long time = System.currentTimeMillis() - startTime;
                return new TestResult(tc, false, false, 
                    "Syntax error: " + errorCollector.getErrors(), time);
            }
            
            // Phase 3: Semantic Analysis
            SymbolTable symbolTable = new SymbolTable();
            SemanticAnalyzer analyzer = new SemanticAnalyzer(symbolTable);
            boolean semanticSuccess = analyzer.analyzeScript(tree);
            
            long time = System.currentTimeMillis() - startTime;
            
            if (!semanticSuccess) {
                StringBuilder errors = new StringBuilder();
                for (SemanticError error : analyzer.getErrors()) {
                    if (errors.length() > 0) errors.append("; ");
                    errors.append(error.getMessage());
                }
                return new TestResult(tc, true, false, errors.toString(), time);
            }
            
            return new TestResult(tc, true, true, null, time);
            
        } catch (Exception e) {
            long time = System.currentTimeMillis() - startTime;
            return new TestResult(tc, false, false, "Exception: " + e.getMessage(), time);
        }
    }

    private void printSummary() {
        int passed = 0;
        int failed = 0;
        long totalTime = 0;
        
        for (TestResult result : results) {
            if (result.isSuccess()) {
                passed++;
            } else {
                failed++;
            }
            totalTime += result.getExecutionTimeMs();
        }
        
        System.out.println("\n=== Summary ===");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Total: " + (passed + failed));
        System.out.println("Time: " + totalTime + "ms");
        
        if (failed > 0) {
            System.out.println("\nFailed tests:");
            for (TestResult result : results) {
                if (!result.isSuccess()) {
                    System.out.println("  - " + result.getTestCase().getName() + 
                        ": " + result.getErrorMessage());
                }
            }
        }
    }

    public List<TestResult> getResults() {
        return results;
    }

    /**
     * Error collector for ANTLR parser.
     */
    private static class ErrorCollector extends BaseErrorListener {
        private final StringBuilder errors = new StringBuilder();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                               int line, int charPositionInLine, String msg,
                               RecognitionException e) {
            if (errors.length() > 0) errors.append("; ");
            errors.append("line ").append(line).append(":").append(charPositionInLine)
                  .append(" ").append(msg);
        }

        public String getErrors() {
            return errors.toString();
        }
    }

    // ==================== Main method for standalone execution ====================
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        runner.setVerbose(true);
        
        // Run all supported tests by default
        runner.runAllSupported();
    }
}
