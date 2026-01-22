package com.sqlcompiler.ast;

/**
 * AST node representing the WHERE clause.
 */
public class WhereNode extends ASTNode {
    private final ASTNode condition;

    public WhereNode(ASTNode condition) {
        this.condition = condition;
    }

    public ASTNode getCondition() {
        return condition;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "WHERE");
        if (condition != null) {
            condition.print(indent + "  ");
        }
    }
}
