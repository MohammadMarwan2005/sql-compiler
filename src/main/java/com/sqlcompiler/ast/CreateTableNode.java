package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing a CREATE TABLE statement.
 */
public class CreateTableNode extends ASTNode {
    private IdentifierNode tableName;
    private boolean ifNotExists;
    private final List<ColumnDefNode> columns;
    private final List<ConstraintNode> constraints;

    public CreateTableNode() {
        this.columns = new ArrayList<>();
        this.constraints = new ArrayList<>();
        this.ifNotExists = false;
    }

    public void setTableName(IdentifierNode tableName) {
        this.tableName = tableName;
    }

    public void setIfNotExists(boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
    }

    public void addColumn(ColumnDefNode column) {
        if (column != null) {
            columns.add(column);
        }
    }

    public void addConstraint(ConstraintNode constraint) {
        if (constraint != null) {
            constraints.add(constraint);
        }
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "CREATE_TABLE" + (ifNotExists ? " IF_NOT_EXISTS" : ""));
        
        if (tableName != null) {
            tableName.print(indent + "  ");
        }
        
        if (!columns.isEmpty()) {
            System.out.println(indent + "  COLUMNS");
            for (ColumnDefNode col : columns) {
                col.print(indent + "    ");
            }
        }
        
        if (!constraints.isEmpty()) {
            System.out.println(indent + "  CONSTRAINTS");
            for (ConstraintNode con : constraints) {
                con.print(indent + "    ");
            }
        }
    }
}
