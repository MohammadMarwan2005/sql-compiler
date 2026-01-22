package com.sqlcompiler.ast;

/**
 * AST node representing a binary expression (e.g., a + b, x AND y, foo LIKE '%bar%').
 */
public class BinaryExprNode extends ASTNode {
    private final String operator;
    private final ASTNode left;
    private final ASTNode right;

    public BinaryExprNode(String operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }

    public ASTNode getLeft() {
        return left;
    }

    public ASTNode getRight() {
        return right;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + operator);
        if (left != null) {
            left.print(indent + "  ");
        }
        if (right != null) {
            right.print(indent + "  ");
        }
    }
}
