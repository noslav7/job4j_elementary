package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String letter : words) {
            sb.append(letter).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
