package com.sqlcompiler.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * AST node representing the ORDER BY clause.
 */
public class OrderByNode extends ASTNode {
    private final List<OrderByItemNode> items;

    public OrderByNode() {
        this.items = new ArrayList<>();
    }

    public void addItem(OrderByItemNode item) {
        if (item != null) {
            items.add(item);
        }
    }

    public List<OrderByItemNode> getItems() {
        return items;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "ORDER_BY");
        for (OrderByItemNode item : items) {
            item.print(indent + "  ");
        }
    }
}
