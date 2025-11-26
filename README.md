# SQL Compiler

A clean, minimal, and extensible SQL compiler project in Java using ANTLR4.

## Project Structure

```
project/
├── README.md
├── pom.xml
└── src/
    └── main/java/com/sqlcompiler/
        ├── lexer/
        │    └── SQLLexer.g4
        ├── parser/
        │    └── SQLParser.g4
        ├── semantic/
        │    └── SemanticAnalyzer.java
        ├── utils/
        │    └── InputReader.java
        └── Main.java
```

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

### Compile and Generate ANTLR Code

```bash
mvn clean compile
```

This command will:
1. Generate Java code from the ANTLR grammar files (`.g4`)
2. Compile all Java source files
3. Place generated files in `target/generated-sources/antlr4/`

### Regenerate ANTLR Code Only

If you modify the grammar files and need to regenerate:

```bash
mvn antlr4:antlr4
```

Or simply run:

```bash
mvn clean compile
```

## Running the Project

### Quick Start (Without Maven)

**Option 1: Using the run script**
```bash
./run.sh
```
Then type your SQL query and press **Enter**, then **Ctrl+D** (or just Enter if using the script).

**Option 2: Using Java directly**

Compile first (if not already compiled):
```bash
mkdir -p target/classes
javac -cp "/tmp/antlr-4.13.1-complete.jar:target/generated-sources/antlr4" \
      -d target/classes \
      src/main/java/com/sqlcompiler/**/*.java \
      target/generated-sources/antlr4/com/sqlcompiler/**/*.java
```

Then run:
```bash
echo "SELECT name FROM users" | java -cp "/tmp/antlr-4.13.1-complete.jar:target/generated-sources/antlr4:target/classes" com.sqlcompiler.Main
```

Or run interactively:
```bash
java -cp "/tmp/antlr-4.13.1-complete.jar:target/generated-sources/antlr4:target/classes" com.sqlcompiler.Main
```
(Type your SQL query, then press **Ctrl+D**)

### Using Maven (if installed)

```bash
mvn exec:java
```

The program will read SQL from stdin. Type your SQL query and press Enter, then Ctrl+D.

Example:
```bash
echo "SELECT name FROM users" | mvn exec:java -q
```

## Example Usage

```bash
$ mvn exec:java
SELECT name FROM users
(query SELECT name FROM users)
Semantic check: OK
```

## Current Features

- Minimal SQL lexer with basic keywords (SELECT, FROM, WHERE)
- Basic identifier, number, and string tokenization
- Simple parser for `SELECT IDENT FROM IDENT` queries
- Placeholder semantic analyzer
- Clean, extensible architecture

## Future Enhancements

The following features are planned for future development:

### Lexer Enhancements
- Full SQL keyword set (INSERT, UPDATE, DELETE, JOIN, etc.)
- Complex identifiers and quoted identifiers
- Numbers: float, scientific notation, hex, binary
- Full string types with escaping and Unicode rules
- Complete SQL operator set
- User variables (@var, @@sysvar)
- Nested comments (/* */)

### Parser Enhancements
- Parser rules for full SQL grammar
  - Complex SELECT statements with JOINs
  - INSERT, UPDATE, DELETE statements
  - Expressions (arithmetic, logical, comparison)
  - Subqueries
  - Aggregate functions
  - GROUP BY, HAVING, ORDER BY clauses
- AST construction

### Semantic Analysis
- Identifier resolution
- Type checking
- Reference validation
- SQL semantic constraints
- Schema validation

### Advanced Features
- Query optimizer
- Execution engine

## Development

This is a minimal skeleton project designed to be extended. Each module (lexer, parser, semantic, utils) is structured to allow easy expansion without breaking existing functionality.

## License

This project is provided as-is for educational and development purposes.

