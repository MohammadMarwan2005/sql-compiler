package com.sqlcompiler.semantic;

import java.util.*;

/**
 * Represents metadata about a table in the database schema.
 * Used by the symbol table to track table definitions and validate column references.
 */
public class TableInfo {
    private final String name;
    private final Map<String, ColumnInfo> columns; // Lowercase column name -> ColumnInfo

    /**
     * Creates a new table definition with the given name.
     *
     * @param name The table name
     */
    public TableInfo(String name) {
        this.name = name;
        this.columns = new LinkedHashMap<>(); // Preserve insertion order
    }

    /**
     * Creates a new table definition with predefined columns.
     *
     * @param name    The table name
     * @param columns List of column definitions
     */
    public TableInfo(String name, List<ColumnInfo> columns) {
        this(name);
        for (ColumnInfo column : columns) {
            addColumn(column);
        }
    }

    /**
     * Adds a column to this table.
     *
     * @param column The column definition to add
     */
    public void addColumn(ColumnInfo column) {
        columns.put(column.getName().toLowerCase(), column);
    }

    /**
     * Checks if this table has a column with the given name (case-insensitive).
     */
    public boolean hasColumn(String columnName) {
        return columns.containsKey(columnName.toLowerCase());
    }

    /**
     * Gets the column info for the given column name (case-insensitive).
     *
     * @return The column info, or null if not found
     */
    public ColumnInfo getColumn(String columnName) {
        return columns.get(columnName.toLowerCase());
    }

    /**
     * Returns all column names in this table.
     */
    public Set<String> getColumnNames() {
        return Collections.unmodifiableSet(columns.keySet());
    }

    /**
     * Returns all column definitions in this table.
     */
    public Collection<ColumnInfo> getColumns() {
        return Collections.unmodifiableCollection(columns.values());
    }

    /**
     * Returns the number of columns in this table.
     */
    public int getColumnCount() {
        return columns.size();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("TableInfo{name='%s', columns=%s}", name, columns.keySet());
    }
}
