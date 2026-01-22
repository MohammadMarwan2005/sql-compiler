package com.sqlcompiler.ast;

/**
 * AST node representing a SELECT statement.
 */
public class SelectNode extends ASTNode {
    private boolean distinct;
    private ColumnListNode columns;
    private FromNode from;
    private WhereNode where;
    private GroupByNode groupBy;
    private HavingNode having;
    private OrderByNode orderBy;
    private LimitNode limit;

    public SelectNode() {
        this.distinct = false;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public void setColumns(ColumnListNode columns) {
        this.columns = columns;
    }

    public void setFrom(FromNode from) {
        this.from = from;
    }

    public void setWhere(WhereNode where) {
        this.where = where;
    }

    public void setGroupBy(GroupByNode groupBy) {
        this.groupBy = groupBy;
    }

    public void setHaving(HavingNode having) {
        this.having = having;
    }

    public void setOrderBy(OrderByNode orderBy) {
        this.orderBy = orderBy;
    }

    public void setLimit(LimitNode limit) {
        this.limit = limit;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "SELECT" + (distinct ? " DISTINCT" : ""));
        
        if (columns != null) {
            columns.print(indent + "  ");
        }
        
        if (from != null) {
            from.print(indent + "  ");
        }
        
        if (where != null) {
            where.print(indent + "  ");
        }
        
        if (groupBy != null) {
            groupBy.print(indent + "  ");
        }
        
        if (having != null) {
            having.print(indent + "  ");
        }
        
        if (orderBy != null) {
            orderBy.print(indent + "  ");
        }
        
        if (limit != null) {
            limit.print(indent + "  ");
        }
    }
}
