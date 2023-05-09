package ru.job4j.condition;

public class Task63 {
    public static void isDecreasing(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 100 % 10;
        if (num1 > num2 && num2 > num3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
