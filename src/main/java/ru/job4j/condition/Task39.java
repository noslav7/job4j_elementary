package ru.job4j.condition;

public class Task39 {
    public static void isSymmetric(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num3 = number % 10 % 10;
        if (num1 == num3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
