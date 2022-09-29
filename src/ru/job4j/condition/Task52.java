package ru.job4j.condition;

public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        if ((double) a1 / (double) a2 == (double) b1 / (double) b2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
