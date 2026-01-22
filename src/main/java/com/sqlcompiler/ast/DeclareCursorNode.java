package com.sqlcompiler.ast;

/**
 * AST node representing a DECLARE CURSOR statement.
 */
public class DeclareCursorNode extends ASTNode {
    private final IdentifierNode cursorName;
    private final SelectNode selectStatement;

    public DeclareCursorNode(IdentifierNode cursorName, SelectNode selectStatement) {
        this.cursorName = cursorName;
        this.selectStatement = selectStatement;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "DECLARE_CURSOR");
        
        if (cursorName != null) {
            System.out.println(indent + "  CURSOR_NAME");
            cursorName.print(indent + "    ");
        }
        
        if (selectStatement != null) {
            System.out.println(indent + "  FOR");
            selectStatement.print(indent + "    ");
        }
    }
}
