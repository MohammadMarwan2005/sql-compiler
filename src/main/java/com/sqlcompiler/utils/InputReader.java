package com.sqlcompiler.utils;

import java.util.Scanner;

public class InputReader {
    public static String readFromStdin() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            // Stop reading when an empty line is entered
            if (line.isEmpty()) {
                break;
            }
            // Append the line with a newline character
            if (input.length() > 0) {
                input.append('\n');
            }
            input.append(line);
        }
        
        return input.toString();
    }
}

