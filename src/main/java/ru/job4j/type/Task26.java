package ru.job4j.type;

public class Task26 {
    public static void transform(int number) {
        int num1, num2, newValue;
        num1 = number / 10;
        num2 = number % 10;
        newValue = num2 * 10 + num1;
        System.out.println(newValue + 8);
    }
}
