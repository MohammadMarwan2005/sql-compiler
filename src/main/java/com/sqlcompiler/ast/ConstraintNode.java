package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing a table-level constraint.
 */
public class ConstraintNode extends ASTNode {
    private final String type;  // PRIMARY_KEY, FOREIGN_KEY, UNIQUE, CHECK
    private String name;
    private final List<String> columns;
    private String referencedTable;
    private final List<String> referencedColumns;

    public ConstraintNode(String type) {
        this.type = type;
        this.columns = new ArrayList<>();
        this.referencedColumns = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addColumn(String column) {
        if (column != null) {
            columns.add(column);
        }
    }

    public void setReferencedTable(String table) {
        this.referencedTable = table;
    }

    public void addReferencedColumn(String column) {
        if (column != null) {
            referencedColumns.add(column);
        }
    }

    @Override
    public void print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        
        if (name != null) {
            sb.append(" ").append(name);
        }
        
        if (!columns.isEmpty()) {
            sb.append(" (").append(String.join(", ", columns)).append(")");
        }
        
        if (referencedTable != null) {
            sb.append(" REFERENCES ").append(referencedTable);
            if (!referencedColumns.isEmpty()) {
                sb.append("(").append(String.join(", ", referencedColumns)).append(")");
            }
        }
        
        System.out.println(indent + sb);
    }
}
