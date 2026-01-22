package com.sqlcompiler.semantic;

/**
 * Represents metadata about a column in a table.
 * Used by the symbol table to track column definitions and perform semantic validation.
 */
public class ColumnInfo {
    private final String name;
    private final SQLType type;
    private final boolean nullable;

    /**
     * Creates a new column definition.
     *
     * @param name     The column name (case-insensitive matching should be done externally)
     * @param type     The SQL type of the column
     * @param nullable Whether the column allows NULL values
     */
    public ColumnInfo(String name, SQLType type, boolean nullable) {
        this.name = name;
        this.type = type;
        this.nullable = nullable;
    }

    /**
     * Creates a non-nullable column with the given name and type.
     */
    public ColumnInfo(String name, SQLType type) {
        this(name, type, false);
    }

    public String getName() {
        return name;
    }

    public SQLType getType() {
        return type;
    }

    public boolean isNullable() {
        return nullable;
    }

    @Override
    public String toString() {
        return String.format("ColumnInfo{name='%s', type=%s, nullable=%s}", name, type, nullable);
    }
}
