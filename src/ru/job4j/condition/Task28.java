package ru.job4j.condition;

public class Task28 {
    public static void isEnough(int pupils, int desks) {
        if (desks <= pupils / 2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
