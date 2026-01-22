package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing a column definition in CREATE TABLE.
 */
public class ColumnDefNode extends ASTNode {
    private final String name;
    private final String dataType;
    private final List<String> constraints;

    public ColumnDefNode(String name, String dataType) {
        this.name = name;
        this.dataType = dataType;
        this.constraints = new ArrayList<>();
    }

    public void addConstraint(String constraint) {
        if (constraint != null) {
            constraints.add(constraint);
        }
    }

    public String getName() {
        return name;
    }

    public String getDataType() {
        return dataType;
    }

    @Override
    public void print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(dataType);
        
        if (!constraints.isEmpty()) {
            sb.append(" [");
            sb.append(String.join(", ", constraints));
            sb.append("]");
        }
        
        System.out.println(indent + sb);
    }
}
