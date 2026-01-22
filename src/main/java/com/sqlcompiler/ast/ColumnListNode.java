package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing a list of columns in SELECT.
 */
public class ColumnListNode extends ASTNode {
    private final List<ASTNode> columns;
    private boolean selectAll;

    public ColumnListNode() {
        this.columns = new ArrayList<>();
        this.selectAll = false;
    }

    public void addColumn(ASTNode column) {
        if (column != null) {
            columns.add(column);
        }
    }

    public void setSelectAll(boolean selectAll) {
        this.selectAll = selectAll;
    }

    public List<ASTNode> getColumns() {
        return columns;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "COLUMNS");
        if (selectAll) {
            System.out.println(indent + "  *");
        } else {
            for (ASTNode col : columns) {
                col.print(indent + "  ");
            }
        }
    }
}
