package com.sqlcompiler.ast;

/**
 * Abstract base class for all AST nodes.
 * Implements the Composite Design Pattern.
 * 
 * All AST nodes must inherit from this class and implement
 * the print method for hierarchical textual representation.
 */
public abstract class ASTNode {
    
    /**
     * Prints this AST node and its children in a hierarchical format.
     * 
     * @param indent The indentation string for the current level
     */
    public abstract void print(String indent);
    
    /**
     * Convenience method to print the AST starting from this node.
     */
    public void print() {
        print("");
    }
}
