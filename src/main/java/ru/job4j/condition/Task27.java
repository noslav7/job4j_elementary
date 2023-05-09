package ru.job4j.condition;

public class Task27 {
    public static void isEnough(int pupils, int chairs) {
        if (chairs <= pupils) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
