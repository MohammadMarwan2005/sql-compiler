package com.sqlcompiler.test;

import java.util.*;

/**
 * Manages SQL test cases for the SQL Compiler.
 * Test cases are organized by category and include both supported
 * and future (not yet implemented) SQL features.
 */
public class TestCaseManager {

    /**
     * Represents a single SQL test case.
     */
    public static class TestCase {
        private final String name;
        private final String sql;
        private final String description;
        private final boolean supported;

        public TestCase(String name, String sql, String description, boolean supported) {
            this.name = name;
            this.sql = sql;
            this.description = description;
            this.supported = supported;
        }

        public String getName() { return name; }
        public String getSql() { return sql; }
        public String getDescription() { return description; }
        public boolean isSupported() { return supported; }

        @Override
        public String toString() {
            return String.format("[%s] %s%s", 
                supported ? "OK" : "FUTURE", 
                name, 
                description != null ? " - " + description : "");
        }
    }

    private final Map<String, List<TestCase>> testCases = new LinkedHashMap<>();

    public TestCaseManager() {
        initializeTestCases();
    }

    /**
     * Returns all test case categories.
     */
    public Set<String> getCategories() {
        return testCases.keySet();
    }

    /**
     * Returns test cases for a specific category.
     */
    public List<TestCase> getTestCases(String category) {
        return testCases.getOrDefault(category, Collections.emptyList());
    }

    /**
     * Returns all test cases.
     */
    public List<TestCase> getAllTestCases() {
        List<TestCase> all = new ArrayList<>();
        for (List<TestCase> cases : testCases.values()) {
            all.addAll(cases);
        }
        return all;
    }

    /**
     * Returns only supported test cases.
     */
    public List<TestCase> getSupportedTestCases() {
        List<TestCase> supported = new ArrayList<>();
        for (TestCase tc : getAllTestCases()) {
            if (tc.isSupported()) {
                supported.add(tc);
            }
        }
        return supported;
    }

    /**
     * Gets a specific test case by name.
     */
    public TestCase getTestCase(String name) {
        for (TestCase tc : getAllTestCases()) {
            if (tc.getName().equals(name)) {
                return tc;
            }
        }
        return null;
    }

    private void addTestCase(String category, String name, String sql, String description, boolean supported) {
        testCases.computeIfAbsent(category, k -> new ArrayList<>())
                 .add(new TestCase(name, sql, description, supported));
    }

    private void initializeTestCases() {
        // ==================== DDL - CREATE TABLE ====================
        addTestCase("DDL_CREATE", "CREATE_SIMPLE_TABLE",
            "CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50) NOT NULL);",
            "Simple table with primary key and not null constraint", true);

        addTestCase("DDL_CREATE", "CREATE_TABLE_ALL_CONSTRAINTS",
            """
            CREATE TABLE users (
                id INT PRIMARY KEY AUTO_INCREMENT,
                username VARCHAR(50) NOT NULL,
                email VARCHAR(100) UNIQUE,
                age INT DEFAULT 18,
                created_at TIMESTAMP
            );
            """,
            "Table with multiple constraints", true);

        addTestCase("DDL_CREATE", "CREATE_TABLE_WITH_FOREIGN_KEY",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50));
            CREATE TABLE orders (
                order_id INT PRIMARY KEY,
                user_id INT NOT NULL,
                total DECIMAL(10,2),
                FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
            );
            """,
            "Table with foreign key constraint", true);

        addTestCase("DDL_CREATE", "CREATE_EMPLOYEE_MASTER",
            """
            CREATE TABLE EmployeeMaster (
                Id INT PRIMARY KEY,
                EmployeeCode VARCHAR(10),
                EmployeeName VARCHAR(25),
                DepartmentCode VARCHAR(10),
                LocationCode VARCHAR(10),
                salary INT
            );
            """,
            "Employee master table", true);

        // ==================== DDL - ALTER TABLE ====================
        addTestCase("DDL_ALTER", "ALTER_ADD_COLUMN",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), email VARCHAR(100), age INT);
            ALTER TABLE users ADD COLUMN phone VARCHAR(20);
            """,
            "Add a new column", true);

        addTestCase("DDL_ALTER", "ALTER_MODIFY_COLUMN",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), email VARCHAR(100), age INT);
            ALTER TABLE users MODIFY COLUMN age BIGINT NOT NULL;
            """,
            "Modify column type", true);

        addTestCase("DDL_ALTER", "ALTER_RENAME_COLUMN",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), email VARCHAR(100), age INT);
            ALTER TABLE users RENAME COLUMN email TO email_address;
            """,
            "Rename a column", true);

        addTestCase("DDL_ALTER", "ALTER_MULTIPLE_ACTIONS",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), email VARCHAR(100), age INT);
            ALTER TABLE users ADD COLUMN phone VARCHAR(20), MODIFY COLUMN age BIGINT NOT NULL;
            """,
            "Multiple alter actions", true);

        // ==================== DDL - DROP/TRUNCATE ====================
        addTestCase("DDL_DROP", "DROP_TABLE",
            """
            CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50));
            DROP TABLE test;
            """,
            "Simple drop table", true);

        addTestCase("DDL_DROP", "DROP_TABLE_IF_EXISTS",
            "DROP TABLE IF EXISTS orders CASCADE;",
            "Drop with IF EXISTS and CASCADE", true);

        addTestCase("DDL_DROP", "TRUNCATE_TABLE",
            """
            CREATE TABLE EmployeeMaster (Id INT PRIMARY KEY, EmployeeName VARCHAR(25));
            TRUNCATE TABLE EmployeeMaster;
            """,
            "Truncate table", true);

        // ==================== DDL - INDEX ====================
        addTestCase("DDL_INDEX", "CREATE_INDEX",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50));
            CREATE INDEX idx_name ON users(name);
            """,
            "Create simple index", true);

        addTestCase("DDL_INDEX", "CREATE_UNIQUE_INDEX",
            """
            CREATE TABLE users (id INT PRIMARY KEY, username VARCHAR(50));
            CREATE UNIQUE INDEX idx_username ON users(username);
            """,
            "Create unique index", true);

        addTestCase("DDL_INDEX", "DROP_INDEX",
            """
            CREATE TABLE users (id INT PRIMARY KEY, username VARCHAR(50));
            CREATE INDEX idx_username ON users(username);
            DROP INDEX idx_username ON users;
            """,
            "Drop index", true);

        // ==================== DML - INSERT ====================
        addTestCase("DML_INSERT", "INSERT_SIMPLE",
            """
            CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50));
            INSERT INTO test (id, name) VALUES (1, 'name1');
            """,
            "Simple insert with column list", true);

        addTestCase("DML_INSERT", "INSERT_WITHOUT_COLUMNS",
            """
            CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50));
            INSERT INTO test VALUES (1, 'name1');
            """,
            "Insert without column list", true);

        // ==================== DML - SELECT BASIC ====================
        addTestCase("DML_SELECT", "SELECT_ALL",
            """
            CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50));
            SELECT * FROM test;
            """,
            "Select all columns", true);

        addTestCase("DML_SELECT", "SELECT_COLUMNS",
            """
            CREATE TABLE Products (ProductName VARCHAR(100), UnitPrice DECIMAL(10,2));
            SELECT ProductName, UnitPrice FROM Products;
            """,
            "Select specific columns", true);

        addTestCase("DML_SELECT", "SELECT_WITH_WHERE",
            """
            CREATE TABLE EmployeeMaster (Id INT PRIMARY KEY, EmployeeName VARCHAR(25), salary INT);
            SELECT * FROM EmployeeMaster WHERE salary > 3000;
            """,
            "Select with WHERE clause", true);

        addTestCase("DML_SELECT", "SELECT_WITH_ORDER_BY",
            """
            CREATE TABLE Employees (FirstName VARCHAR(50), BirthDate TIMESTAMP);
            SELECT FirstName, BirthDate FROM Employees ORDER BY BirthDate DESC;
            """,
            "Select with ORDER BY", true);

        addTestCase("DML_SELECT", "SELECT_WITH_MULTIPLE_ORDER",
            """
            CREATE TABLE Employees (FirstName VARCHAR(50), BirthDate TIMESTAMP);
            SELECT FirstName, BirthDate FROM Employees ORDER BY BirthDate DESC, FirstName ASC;
            """,
            "Select with multiple ORDER BY columns", true);

        addTestCase("DML_SELECT", "SELECT_SIMPLE_EXPRESSION",
            """
            CREATE TABLE dual (dummy INT);
            SELECT 1 + 1 FROM dual;
            """,
            "Simple arithmetic expression (requires dummy table)", true);

        addTestCase("DML_SELECT", "SELECT_WITH_ALIAS",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50));
            SELECT name AS employee_name FROM users;
            """,
            "Select with column alias", true);

        // ==================== DML - SELECT WITH OPERATORS ====================
        addTestCase("DML_SELECT", "SELECT_IS_NULL",
            """
            CREATE TABLE EmployeeMaster (Id INT PRIMARY KEY, salary INT);
            SELECT * FROM EmployeeMaster WHERE salary IS NULL;
            """,
            "Select with IS NULL", false);

        addTestCase("DML_SELECT", "SELECT_IS_NOT_NULL",
            """
            CREATE TABLE EmployeeMaster (Id INT PRIMARY KEY, salary INT);
            SELECT * FROM EmployeeMaster WHERE salary IS NOT NULL;
            """,
            "Select with IS NOT NULL", false);

        addTestCase("DML_SELECT", "SELECT_WITH_LIKE",
            """
            CREATE TABLE EmployeeMaster (Id INT PRIMARY KEY, employeename VARCHAR(50));
            SELECT * FROM EmployeeMaster WHERE employeename LIKE 'super';
            """,
            "Select with LIKE operator", true);

        addTestCase("DML_SELECT", "SELECT_WITH_LIKE_WILDCARD",
            """
            CREATE TABLE EmployeeMaster (Id INT PRIMARY KEY, employeename VARCHAR(50));
            SELECT * FROM EmployeeMaster WHERE employeename LIKE 'sup%';
            """,
            "Select with LIKE and wildcard", true);

        addTestCase("DML_SELECT", "SELECT_WITH_BETWEEN",
            """
            CREATE TABLE Employees (EmployeeID INT PRIMARY KEY, name VARCHAR(50));
            SELECT * FROM Employees WHERE EmployeeID BETWEEN 1 AND 5;
            """,
            "Select with BETWEEN operator", false);

        addTestCase("DML_SELECT", "SELECT_WITH_IN",
            """
            CREATE TABLE Employees (EmployeeID INT PRIMARY KEY, name VARCHAR(50));
            SELECT * FROM Employees WHERE EmployeeID IN (1, 2, 3);
            """,
            "Select with IN operator", false);

        // ==================== DML - UPDATE ====================
        addTestCase("DML_UPDATE", "UPDATE_SIMPLE",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50));
            UPDATE users SET name = 'John' WHERE id = 1;
            """,
            "Simple update", true);

        addTestCase("DML_UPDATE", "UPDATE_MULTIPLE_COLUMNS",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50), age INT);
            UPDATE users SET name = 'John', age = 30 WHERE id = 1;
            """,
            "Update multiple columns", true);

        // ==================== DML - DELETE ====================
        addTestCase("DML_DELETE", "DELETE_WITH_WHERE",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50));
            DELETE FROM users WHERE id = 1;
            """,
            "Delete with WHERE clause", true);

        addTestCase("DML_DELETE", "DELETE_ALL",
            """
            CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR(50));
            DELETE FROM users;
            """,
            "Delete all rows", true);

        // ==================== MULTI-STATEMENT SCRIPTS ====================
        addTestCase("SCRIPTS", "CREATE_AND_INSERT",
            """
            CREATE TABLE test (id INT PRIMARY KEY, name VARCHAR(50) NOT NULL);
            INSERT INTO test (id, name) VALUES (1, 'name1');
            INSERT INTO test (id, name) VALUES (2, 'name2');
            SELECT * FROM test;
            """,
            "Create table, insert data, and query", true);

        addTestCase("SCRIPTS", "CREATE_AND_ALTER",
            """
            CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50));
            ALTER TABLE employees ADD COLUMN email VARCHAR(100);
            ALTER TABLE employees ADD COLUMN age INT DEFAULT 25;
            SELECT * FROM employees;
            """,
            "Create table and alter it", true);

        addTestCase("SCRIPTS", "FULL_DDL_WORKFLOW",
            """
            CREATE TABLE products (id INT PRIMARY KEY, name VARCHAR(100), price DECIMAL(10,2));
            CREATE INDEX idx_product_name ON products(name);
            INSERT INTO products (id, name, price) VALUES (1, 'Widget', 19.99);
            SELECT * FROM products;
            DROP INDEX idx_product_name ON products;
            DROP TABLE products;
            """,
            "Full DDL workflow with create, index, insert, select, drop", true);

        // ==================== PHASE 1 - New Features ====================
        
        // Bracket identifiers [name]
        addTestCase("PHASE1_FEATURES", "BRACKET_IDENTIFIERS",
            """
            CREATE TABLE [My Table] ([Column 1] INT PRIMARY KEY, [Column Name] VARCHAR(50));
            INSERT INTO [My Table] ([Column 1], [Column Name]) VALUES (1, 'test');
            SELECT [Column Name] FROM [My Table];
            """,
            "T-SQL bracket identifiers", true);

        // NVARCHAR data type
        addTestCase("PHASE1_FEATURES", "NVARCHAR_TYPE",
            """
            CREATE TABLE unicode_test (
                id INT PRIMARY KEY,
                name NVARCHAR(100),
                description NVARCHAR(MAX)
            );
            """,
            "NVARCHAR and NVARCHAR(MAX) data types", true);

        // Schema.table prefix
        addTestCase("PHASE1_FEATURES", "SCHEMA_PREFIX",
            """
            CREATE TABLE dbo.MyTable (id INT PRIMARY KEY, name VARCHAR(50));
            SELECT * FROM dbo.MyTable;
            """,
            "Schema-qualified table names (dbo.)", true);

        // CLUSTERED PRIMARY KEY
        addTestCase("PHASE1_FEATURES", "CLUSTERED_PRIMARY_KEY",
            """
            CREATE TABLE clustered_test (
                id INT NOT NULL,
                name VARCHAR(50),
                CONSTRAINT PK_clustered PRIMARY KEY CLUSTERED (id)
            );
            """,
            "CLUSTERED PRIMARY KEY constraint", true);

        // IN operator with values
        addTestCase("PHASE1_FEATURES", "IN_OPERATOR",
            """
            CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50), dept_id INT);
            SELECT * FROM employees WHERE dept_id IN (1, 2, 3, 4);
            """,
            "IN operator with value list", true);

        // NOT IN operator
        addTestCase("PHASE1_FEATURES", "NOT_IN_OPERATOR",
            """
            CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50), dept_id INT);
            SELECT * FROM employees WHERE dept_id NOT IN (5, 6, 7);
            """,
            "NOT IN operator with value list", true);

        // BETWEEN operator
        addTestCase("PHASE1_FEATURES", "BETWEEN_OPERATOR",
            """
            CREATE TABLE products (id INT PRIMARY KEY, price DECIMAL(10,2));
            SELECT * FROM products WHERE price BETWEEN 10 AND 100;
            """,
            "BETWEEN operator", true);

        // IS NULL / IS NOT NULL
        addTestCase("PHASE1_FEATURES", "IS_NULL_OPERATOR",
            """
            CREATE TABLE users (id INT PRIMARY KEY, email VARCHAR(100));
            SELECT * FROM users WHERE email IS NULL;
            SELECT * FROM users WHERE email IS NOT NULL;
            """,
            "IS NULL and IS NOT NULL operators", true);

        // Combined Phase 1 test
        addTestCase("PHASE1_FEATURES", "COMBINED_PHASE1",
            """
            CREATE TABLE dbo.[Employee Data] (
                [Employee ID] INT NOT NULL,
                [Full Name] NVARCHAR(100) NOT NULL,
                [Department] NVARCHAR(50),
                [Salary] DECIMAL(10,2),
                CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED ([Employee ID])
            );
            SELECT [Full Name], [Department] FROM dbo.[Employee Data] 
            WHERE [Department] IN ('IT', 'HR', 'Sales');
            """,
            "Combined Phase 1 features: brackets, NVARCHAR, schema, CLUSTERED, IN", true);

        // ==================== CTE (Common Table Expressions) ====================
        // Valid CTE test cases - syntax only
        addTestCase("CTE", "CTE_SIMPLE_SELECT",
            """
            CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50), dept_id INT);
            WITH emp_cte AS (SELECT id, name FROM employees)
            SELECT * FROM emp_cte;
            """,
            "Simple CTE with SELECT", true);

        addTestCase("CTE", "CTE_WITH_WHERE",
            """
            CREATE TABLE orders (order_id INT PRIMARY KEY, customer_id INT, total DECIMAL(10,2));
            WITH high_value AS (SELECT order_id, total FROM orders WHERE total > 1000)
            SELECT * FROM high_value WHERE total > 5000;
            """,
            "CTE with WHERE clause in both CTE and main query", true);

        addTestCase("CTE", "CTE_WITH_UPDATE",
            """
            CREATE TABLE products (id INT PRIMARY KEY, name VARCHAR(50), price DECIMAL(10,2));
            WITH expensive AS (SELECT id FROM products WHERE price > 100)
            UPDATE products SET price = 99 WHERE id IN (1, 2, 3);
            """,
            "CTE followed by UPDATE statement", true);

        addTestCase("CTE", "CTE_WITH_DELETE",
            """
            CREATE TABLE logs (id INT PRIMARY KEY, message VARCHAR(100), created_at DATE);
            WITH old_logs AS (SELECT id FROM logs)
            DELETE FROM logs WHERE id = 1;
            """,
            "CTE followed by DELETE statement", true);

        addTestCase("CTE", "CTE_WITH_BRACKET_IDENT",
            """
            CREATE TABLE [My Table] ([ID] INT PRIMARY KEY, [Name] VARCHAR(50));
            WITH [my cte] AS (SELECT [ID], [Name] FROM [My Table])
            SELECT * FROM [my cte];
            """,
            "CTE with bracket identifiers", true);

        // ==================== CURSOR Declaration ====================
        // Valid cursor declaration test cases - syntax only
        addTestCase("CURSOR", "CURSOR_SIMPLE",
            """
            CREATE TABLE employees (id INT PRIMARY KEY, name VARCHAR(50));
            DECLARE emp_cursor CURSOR FOR SELECT id, name FROM employees;
            """,
            "Simple cursor declaration", true);

        addTestCase("CURSOR", "CURSOR_WITH_WHERE",
            """
            CREATE TABLE orders (order_id INT PRIMARY KEY, status VARCHAR(20), total DECIMAL(10,2));
            DECLARE order_cursor CURSOR FOR SELECT order_id, total FROM orders WHERE status = 'pending';
            """,
            "Cursor declaration with WHERE clause", true);

        addTestCase("CURSOR", "CURSOR_WITH_ORDER_BY",
            """
            CREATE TABLE products (id INT PRIMARY KEY, name VARCHAR(50), price DECIMAL(10,2));
            DECLARE product_cursor CURSOR FOR SELECT name, price FROM products ORDER BY price DESC;
            """,
            "Cursor declaration with ORDER BY", true);

        addTestCase("CURSOR", "CURSOR_WITH_BRACKET_IDENT",
            """
            CREATE TABLE [Sales Data] ([ID] INT PRIMARY KEY, [Amount] DECIMAL(10,2));
            DECLARE [sales cursor] CURSOR FOR SELECT [ID], [Amount] FROM [Sales Data];
            """,
            "Cursor declaration with bracket identifiers", true);

        // ==================== FUTURE - AGGREGATE FUNCTIONS ====================
        addTestCase("FUTURE_AGGREGATES", "SELECT_AVG",
            "SELECT AVG(unitprice) FROM products;",
            "AVG aggregate function", false);

        addTestCase("FUTURE_AGGREGATES", "SELECT_AVG_WITH_ALIAS",
            "SELECT AVG(unitprice) AS 'avg unit price' FROM products;",
            "AVG with alias", false);

        addTestCase("FUTURE_AGGREGATES", "SELECT_MAX",
            "SELECT MAX(unitprice) FROM products;",
            "MAX aggregate function", false);

        addTestCase("FUTURE_AGGREGATES", "SELECT_WITH_GROUP_BY_HAVING",
            """
            SELECT ProductName, UnitPrice FROM Products 
            GROUP BY ProductName, UnitPrice
            HAVING AVG(UnitPrice) > 20;
            """,
            "GROUP BY with HAVING and aggregate", false);

        // ==================== FUTURE - SUBQUERIES ====================
        addTestCase("FUTURE_SUBQUERIES", "SUBQUERY_MAX",
            """
            SELECT productid, productname, unitprice
            FROM products
            WHERE unitprice = (SELECT MAX(unitprice) FROM products);
            """,
            "Subquery using MAX function", false);

        addTestCase("FUTURE_SUBQUERIES", "SUBQUERY_AVG",
            """
            SELECT productid, productname, unitprice
            FROM products
            WHERE unitprice > (SELECT AVG(unitprice) FROM products);
            """,
            "Subquery using AVG function", false);

        addTestCase("FUTURE_SUBQUERIES", "SUBQUERY_EXISTS",
            """
            SELECT * FROM EmployeeMaster WHERE EXISTS
            (SELECT * FROM EmployeeMaster WHERE EmployeeName LIKE 'superman');
            """,
            "EXISTS subquery", false);

        // ==================== FUTURE - JOINS ====================
        addTestCase("FUTURE_JOINS", "INNER_JOIN",
            """
            SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
            FROM trainee  
            INNER JOIN fee ON trainee.admission_no = fee.admission_no;
            """,
            "INNER JOIN", false);

        addTestCase("FUTURE_JOINS", "INNER_JOIN_MULTIPLE",
            """
            SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount, semester.sem_name 
            FROM trainee  
            INNER JOIN fee ON trainee.admission_no = fee.admission_no
            INNER JOIN semester ON semester.sem_no = fee.sem_no;
            """,
            "Multiple INNER JOINs", false);

        addTestCase("FUTURE_JOINS", "LEFT_OUTER_JOIN",
            """
            SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
            FROM trainee  
            LEFT OUTER JOIN fee ON trainee.admission_no = fee.admission_no;
            """,
            "LEFT OUTER JOIN", false);

        addTestCase("FUTURE_JOINS", "RIGHT_OUTER_JOIN",
            """
            SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
            FROM trainee  
            RIGHT OUTER JOIN fee ON trainee.admission_no = fee.admission_no;
            """,
            "RIGHT OUTER JOIN", false);

        addTestCase("FUTURE_JOINS", "FULL_OUTER_JOIN",
            """
            SELECT trainee.admission_no, trainee.first_name, trainee.last_name, fee.course, fee.amount  
            FROM trainee  
            FULL OUTER JOIN fee ON trainee.admission_no = fee.admission_no;
            """,
            "FULL OUTER JOIN", false);

        // ==================== FUTURE - FUNCTIONS ====================
        addTestCase("FUTURE_FUNCTIONS", "CONCAT_FUNCTION",
            "SELECT CONCAT(LastName, ', ', FirstName) AS fullname FROM employees;",
            "CONCAT function", false);

        // ==================== FUTURE - PATTERN MATCHING ====================
        addTestCase("FUTURE_PATTERNS", "LIKE_NOT",
            "SELECT * FROM EmployeeMaster WHERE employeename NOT LIKE '%ra%';",
            "NOT LIKE pattern", false);

        addTestCase("FUTURE_PATTERNS", "LIKE_CHARACTER_CLASS",
            "SELECT * FROM EmployeeMaster WHERE employeename LIKE 'Su[pj]erman%';",
            "LIKE with character class [pj]", false);

        addTestCase("FUTURE_PATTERNS", "LIKE_NEGATED_CLASS",
            "SELECT * FROM EmployeeMaster WHERE employeename LIKE 'ra[^nj]u%';",
            "LIKE with negated character class", false);

        // ====================================================================================
        // FUTURE - From Train2.sql file
        // These test cases use advanced T-SQL features not yet supported
        // ====================================================================================
        
        addTestCase("FUTURE_TRAIN2", "CONDITIONAL_CREATE_TABLE",
            """
            -- From Train2.sql: Conditional table creation with IF NOT EXISTS
            IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='TRACKING' AND xtype='U')
            BEGIN
                CREATE TABLE dbo.TRACKING (
                    TRACKING_KEY INT NOT NULL,
                    C_KEY INT NULL,
                    USER_KEY INT NULL,
                    ACTION_DATETIME DATE NULL,
                    SOURCE NVARCHAR(20) NULL,
                    [ACTION] NVARCHAR(20) NULL,
                    [DESC] NVARCHAR(100) NULL,
                    CONSTRAINT PK_TRACKING
                        PRIMARY KEY CLUSTERED (TRACKING_KEY)
                )
            END
            GO
            """,
            "T-SQL: IF NOT EXISTS with BEGIN/END block and CREATE TABLE", false);

        addTestCase("FUTURE_TRAIN2", "CONDITIONAL_INSERT",
            """
            -- From Train2.sql: Conditional INSERT within IF block
            IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='TRACKING' AND xtype='U')
            BEGIN
                INSERT INTO TRACKING (
                    [TRACKING_KEY],
                    [C_KEY],
                    [USER_KEY],
                    [ACTION_DATETIME],
                    [SOURCE],
                    [ACTION],
                    [DESC]
                )
                VALUES (
                    -1,
                    -1,   
                    -1,  
                    NULL,
                    '-',
                    'OTHER',
                    '-' 
                )
            END
            GO
            """,
            "T-SQL: Conditional INSERT with bracket-quoted column names", false);

        addTestCase("FUTURE_TRAIN2", "INSERT_SELECT_WITH_JOIN",
            """
            -- From Train2.sql: INSERT...SELECT with INNER JOIN and NOT EXISTS subquery
            INSERT INTO TRACKING
            (
                [TRACKING_KEY],
                C_KEY,
                USER_KEY,
                ACTION_DATETIME,
                [SOURCE],
                [ACTION],
                [DESC]
            )
            SELECT
                [STG_TRACKING].[TRACKING_KEY],
                [STG_TRACKING].[C_KEY],
                [STG_TRACKING].USER_KEY,
                [STG_TRACKING].ACTION_DATETIME,
                [STG_TRACKING].SOURCE,
                [STG_TRACKING].[ACTION],
                [STG_TRACKING].[DESC]
            FROM [STG_TRACKING]
            INNER JOIN [USERS]
                ON [USERS].USER_KEY = [STG_TRACKING].USER_KEY 
                AND [USERS].[GROUP_KEY] IN (11,2,3,4)
            WHERE NOT EXISTS (
                SELECT 1
                FROM TRACKING 
                WHERE TRACKING.[TRACKING_KEY] = [STG_TRACKING].[TRACKING_KEY]
            )
            GO
            """,
            "T-SQL: INSERT...SELECT with INNER JOIN, IN operator, and NOT EXISTS subquery", false);

        addTestCase("FUTURE_TRAIN2", "FULL_TRACKING_SCRIPT",
            """
            -- From Train2.sql: Complete tracking table script
            -- Uses: IF NOT EXISTS, BEGIN/END, CREATE TABLE with CLUSTERED PRIMARY KEY,
            --       NVARCHAR, bracket identifiers, INSERT, and GO statements
            
            IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='TRACKING' AND xtype='U')
            BEGIN
                CREATE TABLE dbo.TRACKING (
                    TRACKING_KEY INT NOT NULL,
                    C_KEY INT NULL,
                    USER_KEY INT NULL,
                    ACTION_DATETIME DATE NULL,
                    SOURCE NVARCHAR(20) NULL,
                    [ACTION] NVARCHAR(20) NULL,
                    [DESC] NVARCHAR(100) NULL,
                    CONSTRAINT PK_TRACKING
                        PRIMARY KEY CLUSTERED (TRACKING_KEY)
                )

                INSERT INTO TRACKING (
                    [TRACKING_KEY],
                    [C_KEY],
                    [USER_KEY],
                    [ACTION_DATETIME],
                    [SOURCE],
                    [ACTION],
                    [DESC]
                )
                VALUES (
                    -1,
                    -1,   
                    -1,  
                    NULL,
                    '-',
                    'OTHER',
                    '-' 
                )
            END
            GO
            """,
            "T-SQL: Full conditional table creation and initialization script", false);

        // ==================== FUTURE - T-SQL Specific Features ====================
        addTestCase("FUTURE_TSQL", "SCHEMA_QUALIFIED_TABLE",
            "CREATE TABLE dbo.MyTable (id INT PRIMARY KEY);",
            "T-SQL: Schema-qualified table name (dbo.)", false);

        addTestCase("FUTURE_TSQL", "NVARCHAR_TYPE",
            "CREATE TABLE test (name NVARCHAR(100), description NVARCHAR(MAX));",
            "T-SQL: NVARCHAR data type", false);

        addTestCase("FUTURE_TSQL", "BRACKET_IDENTIFIERS",
            "SELECT [Column Name], [Another Column] FROM [My Table];",
            "T-SQL: Square bracket quoted identifiers", false);

        addTestCase("FUTURE_TSQL", "CLUSTERED_PRIMARY_KEY",
            """
            CREATE TABLE test (
                id INT NOT NULL,
                CONSTRAINT PK_test PRIMARY KEY CLUSTERED (id)
            );
            """,
            "T-SQL: CLUSTERED PRIMARY KEY constraint", false);

        addTestCase("FUTURE_TSQL", "GO_STATEMENT",
            """
            CREATE TABLE test1 (id INT);
            GO
            CREATE TABLE test2 (id INT);
            GO
            """,
            "T-SQL: GO batch separator", false);

        addTestCase("FUTURE_TSQL", "BEGIN_END_BLOCK",
            """
            BEGIN
                SELECT * FROM users;
                UPDATE users SET active = 1;
            END
            """,
            "T-SQL: BEGIN/END statement block", false);

        addTestCase("FUTURE_TSQL", "INSERT_SELECT",
            """
            INSERT INTO target_table (col1, col2)
            SELECT col1, col2 FROM source_table WHERE active = 1;
            """,
            "T-SQL: INSERT...SELECT statement", false);

        addTestCase("FUTURE_TSQL", "IN_OPERATOR_SUBQUERY",
            "SELECT * FROM users WHERE id IN (SELECT user_id FROM active_users);",
            "T-SQL: IN operator with subquery", false);
    }

    /**
     * Prints all test cases organized by category.
     */
    public void printAllTestCases() {
        for (String category : getCategories()) {
            System.out.println("\n=== " + category + " ===");
            for (TestCase tc : getTestCases(category)) {
                System.out.println(tc);
            }
        }
    }

    /**
     * Prints statistics about test cases.
     */
    public void printStatistics() {
        int total = getAllTestCases().size();
        int supported = getSupportedTestCases().size();
        int future = total - supported;

        System.out.println("\n=== Test Case Statistics ===");
        System.out.println("Total test cases: " + total);
        System.out.println("Supported: " + supported);
        System.out.println("Future (not yet implemented): " + future);
        System.out.println("Coverage: " + String.format("%.1f%%", (supported * 100.0 / total)));
    }
}
