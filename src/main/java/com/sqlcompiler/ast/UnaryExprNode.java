package com.sqlcompiler.ast;

/**
 * AST node representing a unary expression (e.g., NOT x, -5).
 */
public class UnaryExprNode extends ASTNode {
    private final String operator;
    private final ASTNode operand;

    public UnaryExprNode(String operator, ASTNode operand) {
        this.operator = operator;
        this.operand = operand;
    }

    public String getOperator() {
        return operator;
    }

    public ASTNode getOperand() {
        return operand;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + operator);
        if (operand != null) {
            operand.print(indent + "  ");
        }
    }
}
