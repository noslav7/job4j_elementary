package ru.job4j.condition;

public class Task81 {
    public static void isLatin(char s) {
        if (Character.isAlphabetic(s)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
