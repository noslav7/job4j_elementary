package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] newString = new char[string.length];
        for (int i = 0; i < string.length; i++) {
        if (string[i] == ('-') || string[i] == 1 || string[i] == 2 || string[i] == 3
                || string[i] == 4 || string[i] == 5 || string[i] == 6
                || string[i] == 7 || string[i] == 8 || string[i] == 9
                || string[i] == 0) {
            newString[i] = Character.toLowerCase(string[i]);
        } else {
            newString[i] = Character.toUpperCase(string[i]);
        }
        }
      return newString;
    }
}
