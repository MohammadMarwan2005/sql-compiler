package com.sqlcompiler.semantic;

import java.util.*;

/**
 * Represents metadata about a table in the database schema.
 * Used by the symbol table to track table definitions and validate column references.
 */
public class TableInfo {
    private final String name;
    private final Map<String, ColumnInfo> columns; // Lowercase column name -> ColumnInfo
    private final List<String> primaryKeyColumns;  // Columns that form the primary key
    private final Map<String, List<String>> uniqueConstraints; // Constraint name -> column list
    private final Map<String, ForeignKeyInfo> foreignKeys; // Constraint name -> foreign key info
    private final Map<String, String> indexes; // Index name -> column name

    /**
     * Represents a foreign key constraint.
     */
    public static class ForeignKeyInfo {
        private final List<String> columns;
        private final String referencedTable;
        private final List<String> referencedColumns;

        public ForeignKeyInfo(List<String> columns, String referencedTable, List<String> referencedColumns) {
            this.columns = columns;
            this.referencedTable = referencedTable;
            this.referencedColumns = referencedColumns;
        }

        public List<String> getColumns() { return columns; }
        public String getReferencedTable() { return referencedTable; }
        public List<String> getReferencedColumns() { return referencedColumns; }
    }

    /**
     * Creates a new table definition with the given name.
     *
     * @param name The table name
     */
    public TableInfo(String name) {
        this.name = name;
        this.columns = new LinkedHashMap<>(); // Preserve insertion order
        this.primaryKeyColumns = new ArrayList<>();
        this.uniqueConstraints = new HashMap<>();
        this.foreignKeys = new HashMap<>();
        this.indexes = new HashMap<>();
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
     * Removes a column from this table.
     *
     * @param columnName The name of the column to remove
     * @return true if the column was removed, false if it didn't exist
     */
    public boolean removeColumn(String columnName) {
        return columns.remove(columnName.toLowerCase()) != null;
    }

    /**
     * Sets the primary key columns for this table.
     */
    public void setPrimaryKey(List<String> columns) {
        primaryKeyColumns.clear();
        for (String col : columns) {
            primaryKeyColumns.add(col.toLowerCase());
        }
    }

    /**
     * Checks if a column is part of the primary key.
     */
    public boolean isPrimaryKeyColumn(String columnName) {
        return primaryKeyColumns.contains(columnName.toLowerCase());
    }

    /**
     * Returns the primary key columns.
     */
    public List<String> getPrimaryKeyColumns() {
        return Collections.unmodifiableList(primaryKeyColumns);
    }

    /**
     * Checks if this table has a primary key defined.
     */
    public boolean hasPrimaryKey() {
        return !primaryKeyColumns.isEmpty();
    }

    /**
     * Adds a unique constraint.
     */
    public void addUniqueConstraint(String constraintName, List<String> columns) {
        List<String> lowerCols = new ArrayList<>();
        for (String col : columns) {
            lowerCols.add(col.toLowerCase());
        }
        uniqueConstraints.put(constraintName.toLowerCase(), lowerCols);
    }

    /**
     * Adds a foreign key constraint.
     */
    public void addForeignKey(String constraintName, List<String> columns, 
                              String referencedTable, List<String> referencedColumns) {
        foreignKeys.put(constraintName.toLowerCase(), 
                       new ForeignKeyInfo(columns, referencedTable, referencedColumns));
    }

    /**
     * Gets foreign key info by constraint name.
     */
    public ForeignKeyInfo getForeignKey(String constraintName) {
        return foreignKeys.get(constraintName.toLowerCase());
    }

    /**
     * Returns all foreign keys.
     */
    public Map<String, ForeignKeyInfo> getForeignKeys() {
        return Collections.unmodifiableMap(foreignKeys);
    }

    /**
     * Removes a constraint by name.
     */
    public boolean removeConstraint(String constraintName) {
        String key = constraintName.toLowerCase();
        if (uniqueConstraints.remove(key) != null) return true;
        if (foreignKeys.remove(key) != null) return true;
        return false;
    }

    /**
     * Adds an index on a column.
     */
    public void addIndex(String indexName, String columnName) {
        indexes.put(indexName.toLowerCase(), columnName.toLowerCase());
    }

    /**
     * Removes an index.
     */
    public boolean removeIndex(String indexName) {
        return indexes.remove(indexName.toLowerCase()) != null;
    }

    /**
     * Checks if an index exists.
     */
    public boolean hasIndex(String indexName) {
        return indexes.containsKey(indexName.toLowerCase());
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
