package com.sqlcompiler.ast;

/**
 * AST node representing an assignment (column = value).
 */
public class AssignmentNode extends ASTNode {
    private final IdentifierNode column;
    private final ASTNode value;

    public AssignmentNode(IdentifierNode column, ASTNode value) {
        this.column = column;
        this.value = value;
    }

    public IdentifierNode getColumn() {
        return column;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ASSIGN");
        if (column != null) {
            column.print(indent + "  ");
        }
        if (value != null) {
            value.print(indent + "  ");
        }
    }
}
