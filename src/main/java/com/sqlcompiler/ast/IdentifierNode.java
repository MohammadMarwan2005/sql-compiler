package com.sqlcompiler.ast;

/**
 * AST node representing an identifier (column name, table name, etc.).
 * This is a terminal node that carries a value.
 */
public class IdentifierNode extends ASTNode {
    private final String name;
    private String alias;
    private String tableName;  // For qualified references like table.column

    public IdentifierNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    @Override
    public void print(String indent) {
        StringBuilder sb = new StringBuilder();
        
        if (tableName != null) {
            sb.append(tableName).append(".");
        }
        sb.append(name);
        
        if (alias != null) {
            sb.append(" AS ").append(alias);
        }
        
        System.out.println(indent + sb);
    }
}
