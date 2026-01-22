package com.sqlcompiler.ast;

/**
 * AST node representing a Common Table Expression (CTE).
 */
public class CTENode extends ASTNode {
    private final IdentifierNode name;
    private final SelectNode definition;
    private final ASTNode mainStatement;  // SELECT, UPDATE, or DELETE that uses the CTE

    public CTENode(IdentifierNode name, SelectNode definition, ASTNode mainStatement) {
        this.name = name;
        this.definition = definition;
        this.mainStatement = mainStatement;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "WITH");
        
        if (name != null) {
            System.out.println(indent + "  CTE_NAME");
            name.print(indent + "    ");
        }
        
        if (definition != null) {
            System.out.println(indent + "  CTE_DEFINITION");
            definition.print(indent + "    ");
        }
        
        if (mainStatement != null) {
            System.out.println(indent + "  MAIN_QUERY");
            mainStatement.print(indent + "    ");
        }
    }
}
