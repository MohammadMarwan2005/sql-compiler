package com.sqlcompiler.ast;

/**
 * AST node representing the LIMIT clause.
 */
public class LimitNode extends ASTNode {
    private final int value;

    public LimitNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "LIMIT " + value);
    }
}
