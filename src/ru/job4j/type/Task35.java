package ru.job4j.type;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number % 100) / 10;
        num3 = (number % 100) % 10;
        System.out.println(Integer.parseInt("" + num3 + num2 + num1));
    }
}
