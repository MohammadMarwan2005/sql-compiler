package com.sqlcompiler.ast;

/**
 * AST node representing the FROM clause.
 */
public class FromNode extends ASTNode {
    private final IdentifierNode table;

    public FromNode(IdentifierNode table) {
        this.table = table;
    }

    public IdentifierNode getTable() {
        return table;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "FROM");
        if (table != null) {
            table.print(indent + "  ");
        }
    }
}
