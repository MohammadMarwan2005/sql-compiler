package com.sqlcompiler.ast;

/**
 * AST node representing a single ORDER BY item (column with optional direction).
 */
public class OrderByItemNode extends ASTNode {
    private final ASTNode column;
    private final String direction;  // "ASC" or "DESC" or null for default

    public OrderByItemNode(ASTNode column, String direction) {
        this.column = column;
        this.direction = direction;
    }

    public ASTNode getColumn() {
        return column;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public void print(String indent) {
        if (column instanceof IdentifierNode) {
            IdentifierNode id = (IdentifierNode) column;
            String dirStr = direction != null ? " " + direction : "";
            System.out.println(indent + id.getName() + dirStr);
        } else if (column != null) {
            column.print(indent);
            if (direction != null) {
                System.out.println(indent + "  " + direction);
            }
        }
    }
}
