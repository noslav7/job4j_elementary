package ru.job4j.type;

public class Task27 {
    public static void transform(int number) {
        int num1, num2, num3, newValue;
        num1 = number / 100;
        num2 = (number % 100) / 10;
        num3 = (number % 100) % 10;
        newValue = num3 * 100 + num2 * 10 + num1;
        System.out.println(newValue - 20);
    }
}
