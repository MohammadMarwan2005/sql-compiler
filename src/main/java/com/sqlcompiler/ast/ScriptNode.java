package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing a script (multiple SQL statements).
 */
public class ScriptNode extends ASTNode {
    private final List<ASTNode> statements;

    public ScriptNode() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(ASTNode statement) {
        if (statement != null) {
            statements.add(statement);
        }
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "SCRIPT");
        for (ASTNode stmt : statements) {
            stmt.print(indent + "  ");
        }
    }
}
