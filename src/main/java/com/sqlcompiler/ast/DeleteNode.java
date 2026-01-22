package com.sqlcompiler.ast;

/**
 * AST node representing a DELETE statement.
 */
public class DeleteNode extends ASTNode {
    private IdentifierNode table;
    private WhereNode where;

    public DeleteNode() {
    }

    public void setTable(IdentifierNode table) {
        this.table = table;
    }

    public void setWhere(WhereNode where) {
        this.where = where;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "DELETE");
        
        if (table != null) {
            System.out.println(indent + "  FROM");
            table.print(indent + "    ");
        }
        
        if (where != null) {
            where.print(indent + "  ");
        }
    }
}
