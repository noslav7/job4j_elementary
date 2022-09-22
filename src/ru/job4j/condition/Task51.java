package ru.job4j.condition;

public class Task51 {
    public static void fractionType(int num1, int num2) {
        if ((double) num1 / (double) num2 < 1) {
            System.out.println("Правильная");
        } else if ((double) num1 / (double) num2 > 1) {
            System.out.println("Неправильная");
        } else {
            System.out.println("Целое число");
        }
    }
}
