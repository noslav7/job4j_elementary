package ru.job4j.condition;

public class Task68 {
    public static void isTriangle(int a, int b, int c) {
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
