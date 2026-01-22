package com.sqlcompiler.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    
    /**
     * Reads the entire contents of a file and returns it as a String.
     *
     * @param filePath the path to the file to read
     * @return the contents of the file as a String
     * @throws IOException if the file cannot be read
     */
    public static String readFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        return Files.readString(path);
    }
}

