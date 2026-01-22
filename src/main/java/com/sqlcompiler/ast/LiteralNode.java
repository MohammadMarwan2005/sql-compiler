package com.sqlcompiler.ast;

/**
 * AST node representing a literal value (string, number, boolean, null).
 * This is a terminal node that carries a value.
 */
public class LiteralNode extends ASTNode {
    
    public enum LiteralType {
        INTEGER,
        FLOAT,
        STRING,
        BOOLEAN,
        NULL
    }

    private final String value;
    private final LiteralType type;

    public LiteralNode(String value, LiteralType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public LiteralType getType() {
        return type;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + value);
    }
}
