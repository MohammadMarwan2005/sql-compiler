package com.sqlcompiler.ast;

/**
 * AST node representing a DROP TABLE statement.
 */
public class DropTableNode extends ASTNode {
    private IdentifierNode tableName;
    private boolean ifExists;

    public DropTableNode() {
        this.ifExists = false;
    }

    public void setTableName(IdentifierNode tableName) {
        this.tableName = tableName;
    }

    public void setIfExists(boolean ifExists) {
        this.ifExists = ifExists;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "DROP_TABLE" + (ifExists ? " IF_EXISTS" : ""));
        if (tableName != null) {
            tableName.print(indent + "  ");
        }
    }
}
