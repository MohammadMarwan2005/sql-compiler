package com.sqlcompiler.ast;

/**
 * AST node representing the HAVING clause.
 */
public class HavingNode extends ASTNode {
    private final ASTNode condition;

    public HavingNode(ASTNode condition) {
        this.condition = condition;
    }

    public ASTNode getCondition() {
        return condition;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "HAVING");
        if (condition != null) {
            condition.print(indent + "  ");
        }
    }
}
