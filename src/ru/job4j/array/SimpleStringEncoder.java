package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
                if (i == input.length() - 1) {
                    result += symbol + "" + counter;
                }
            } else {
                if (counter != 1) {
                    result += symbol + "" + counter;
                    counter = 1;
                } else {
                    result += symbol + "";
                }
                if (i == input.length() - 1) {
                    result += input.charAt(i);
                } else {
                    symbol = input.charAt(i);
                }
            }
        }
        return result;
    }
}
