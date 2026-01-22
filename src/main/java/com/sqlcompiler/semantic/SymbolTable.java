package com.sqlcompiler.semantic;

import java.util.*;

/**
 * Symbol table for semantic analysis of SQL queries.
 * Manages the catalog of known tables, table aliases, and column aliases.
 * 
 * The symbol table provides identifier resolution during semantic analysis:
 * - Table names are resolved against the catalog
 * - Table aliases (FROM t AS alias) create temporary bindings
 * - Column aliases (SELECT x AS alias) are tracked for ORDER BY validation
 */
public class SymbolTable {
    // The catalog of known tables in the database schema
    private final Map<String, TableInfo> catalog;
    
    // Table aliases defined in the current query (e.g., FROM users AS u)
    private final Map<String, TableInfo> tableAliases;
    
    // Column aliases defined in SELECT clause (e.g., SELECT name AS n)
    private final Map<String, SQLType> columnAliases;

    /**
     * Creates an empty symbol table.
     */
    public SymbolTable() {
        this.catalog = new HashMap<>();
        this.tableAliases = new HashMap<>();
        this.columnAliases = new HashMap<>();
    }

    // ==================== Catalog Management ====================

    /**
     * Registers a table in the catalog.
     *
     * @param table The table definition to register
     */
    public void registerTable(TableInfo table) {
        catalog.put(table.getName().toLowerCase(), table);
    }

    /**
     * Resolves a table name against the catalog (case-insensitive).
     *
     * @param name The table name to resolve
     * @return The table info, or null if not found
     */
    public TableInfo resolveTable(String name) {
        return catalog.get(name.toLowerCase());
    }

    /**
     * Checks if a table exists in the catalog.
     */
    public boolean hasTable(String name) {
        return catalog.containsKey(name.toLowerCase());
    }

    // ==================== Table Alias Management ====================

    /**
     * Registers a table alias for the current query scope.
     *
     * @param alias The alias name
     * @param table The table info the alias refers to
     */
    public void registerTableAlias(String alias, TableInfo table) {
        tableAliases.put(alias.toLowerCase(), table);
    }

    /**
     * Resolves a table reference (could be table name or alias).
     * First checks aliases, then falls back to catalog.
     *
     * @param nameOrAlias The table name or alias
     * @return The table info, or null if not found
     */
    public TableInfo resolveTableOrAlias(String nameOrAlias) {
        String key = nameOrAlias.toLowerCase();
        // First check aliases
        if (tableAliases.containsKey(key)) {
            return tableAliases.get(key);
        }
        // Then check catalog
        return catalog.get(key);
    }

    /**
     * Clears all table aliases (call between queries).
     */
    public void clearTableAliases() {
        tableAliases.clear();
    }

    // ==================== Column Alias Management ====================

    /**
     * Registers a column alias from a SELECT clause.
     *
     * @param alias The alias name
     * @param type  The type of the aliased expression
     */
    public void registerColumnAlias(String alias, SQLType type) {
        columnAliases.put(alias.toLowerCase(), type);
    }

    /**
     * Resolves a column alias.
     *
     * @param alias The alias to resolve
     * @return The type, or null if not a known alias
     */
    public SQLType resolveColumnAlias(String alias) {
        return columnAliases.get(alias.toLowerCase());
    }

    /**
     * Checks if a name is a registered column alias.
     */
    public boolean isColumnAlias(String name) {
        return columnAliases.containsKey(name.toLowerCase());
    }

    /**
     * Clears all column aliases (call between queries).
     */
    public void clearColumnAliases() {
        columnAliases.clear();
    }

    // ==================== Column Resolution ====================

    /**
     * Resolves a column reference against a specific table.
     *
     * @param tableName  The table name or alias (can be null for unqualified references)
     * @param columnName The column name
     * @param availableTables Tables available in the current context
     * @return The column info, or null if not found
     */
    public ColumnInfo resolveColumn(String tableName, String columnName, List<TableInfo> availableTables) {
        if (tableName != null) {
            // Qualified reference: table.column
            TableInfo table = resolveTableOrAlias(tableName);
            if (table != null) {
                return table.getColumn(columnName);
            }
            return null;
        }
        
        // Unqualified reference: search all available tables
        ColumnInfo found = null;
        for (TableInfo table : availableTables) {
            ColumnInfo col = table.getColumn(columnName);
            if (col != null) {
                if (found != null) {
                    // Ambiguous - found in multiple tables
                    return null; // Caller should report ambiguous error
                }
                found = col;
            }
        }
        return found;
    }

    /**
     * Checks if a column reference is ambiguous (exists in multiple tables).
     */
    public boolean isColumnAmbiguous(String columnName, List<TableInfo> availableTables) {
        int count = 0;
        for (TableInfo table : availableTables) {
            if (table.hasColumn(columnName)) {
                count++;
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    // ==================== Scope Management ====================

    /**
     * Clears all query-scoped bindings (aliases).
     * Call this between analyzing different queries.
     */
    public void clearQueryScope() {
        clearTableAliases();
        clearColumnAliases();
    }

    /**
     * Returns all registered table names in the catalog.
     */
    public Set<String> getCatalogTableNames() {
        return Collections.unmodifiableSet(catalog.keySet());
    }
}
