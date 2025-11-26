package com.sqlcompiler.semantic;

import com.sqlcompiler.parser.SQLParser;

public class SemanticAnalyzer {
    public void analyze(SQLParser.QueryContext tree) {
        // Very simple placeholder.
        // Later we will add:
        // - identifier resolution
        // - type checking
        // - reference validation
        // - SQL semantic constraints
        System.out.println("Semantic check: OK");
    }
}

