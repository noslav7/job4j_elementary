package ru.job4j;

import java.util.Stack;

public class LogLine {
    public record Line(String level, String threads, String text) { }

    public Line parse(String log) {
        String level = log.substring(0, log.indexOf(" ")); // Extract log level
        StringBuilder threadsBuilder = new StringBuilder();
        StringBuilder textBuilder = new StringBuilder();
        boolean inThreads = false; // Flag to track if we are currently parsing threads
        Stack<Character> stack = new Stack<>(); // Stack to track brackets

        char[] logChars = log.substring(log.indexOf(" ") + 1).toCharArray(); // Skip level part

        for (int i = 0; i < logChars.length; i++) {
            char c = logChars[i];
            if (c == '[') {
                stack.push(c); // Push to stack when we find an opening bracket
                if (!inThreads) { // We are entering the threads section
                    inThreads = true;
                    threadsBuilder.append(c);
                } else { // Already inside threads, append further brackets
                    threadsBuilder.append(c);
                }
            } else if (c == ']') {
                if (!stack.isEmpty()) {
                    stack.pop(); // Pop from stack when we find a closing bracket
                }
                threadsBuilder.append(c);
                if (stack.isEmpty()) { // We've exited the threads section
                    inThreads = false;
                    if (i < logChars.length - 1) { // Check if there's more text after threads
                        textBuilder = new StringBuilder(new String(logChars, i + 2, logChars.length - i - 2));
                        break; // Exit loop as the rest is text
                    }
                }
            } else if (inThreads) {
                threadsBuilder.append(c); // Inside threads, keep appending
            }
        }

        String threads = threadsBuilder.toString();
        String text = textBuilder.toString().trim(); // Trim text to remove leading/trailing whitespace

        return new Line(level, threads, text);
    }
}
