package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing an INSERT statement.
 */
public class InsertNode extends ASTNode {
    private IdentifierNode table;
    private final List<IdentifierNode> columns;
    private final List<ASTNode> values;

    public InsertNode() {
        this.columns = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void setTable(IdentifierNode table) {
        this.table = table;
    }

    public void addColumn(IdentifierNode column) {
        if (column != null) {
            columns.add(column);
        }
    }

    public void addValue(ASTNode value) {
        if (value != null) {
            values.add(value);
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "INSERT");
        
        if (table != null) {
            System.out.println(indent + "  INTO");
            table.print(indent + "    ");
        }
        
        if (!columns.isEmpty()) {
            System.out.println(indent + "  COLUMNS");
            for (IdentifierNode col : columns) {
                col.print(indent + "    ");
            }
        }
        
        if (!values.isEmpty()) {
            System.out.println(indent + "  VALUES");
            for (ASTNode val : values) {
                val.print(indent + "    ");
            }
        }
    }
}
