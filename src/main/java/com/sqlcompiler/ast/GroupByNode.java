package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing the GROUP BY clause.
 */
public class GroupByNode extends ASTNode {
    private final List<ASTNode> columns;

    public GroupByNode() {
        this.columns = new ArrayList<>();
    }

    public void addColumn(ASTNode column) {
        if (column != null) {
            columns.add(column);
        }
    }

    public List<ASTNode> getColumns() {
        return columns;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "GROUP_BY");
        for (ASTNode col : columns) {
            col.print(indent + "  ");
        }
    }
}
