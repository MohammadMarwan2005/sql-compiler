package com.sqlcompiler;

import com.sqlcompiler.lexer.SQLLexer;
import com.sqlcompiler.parser.SQLParser;
import com.sqlcompiler.utils.InputReader;
import com.sqlcompiler.semantic.SemanticAnalyzer;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String sql = InputReader.readFromStdin();
        
        SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);
        SQLParser.QueryContext tree = parser.query();
        
        System.out.println(tree.toStringTree(parser));
        new SemanticAnalyzer().analyze(tree);
    }
}

