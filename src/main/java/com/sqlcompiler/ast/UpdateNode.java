package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing an UPDATE statement.
 */
public class UpdateNode extends ASTNode {
    private IdentifierNode table;
    private final List<AssignmentNode> assignments;
    private WhereNode where;

    public UpdateNode() {
        this.assignments = new ArrayList<>();
    }

    public void setTable(IdentifierNode table) {
        this.table = table;
    }

    public void addAssignment(AssignmentNode assignment) {
        if (assignment != null) {
            assignments.add(assignment);
        }
    }

    public void setWhere(WhereNode where) {
        this.where = where;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "UPDATE");
        
        if (table != null) {
            table.print(indent + "  ");
        }
        
        if (!assignments.isEmpty()) {
            System.out.println(indent + "  SET");
            for (AssignmentNode assign : assignments) {
                assign.print(indent + "    ");
            }
        }
        
        if (where != null) {
            where.print(indent + "  ");
        }
    }
}
