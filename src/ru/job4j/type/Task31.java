package ru.job4j.type;

public class Task31 {
    public static void numSum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number % 100) / 10;
        num3 = (number % 100) % 10;
        System.out.println(Math.abs((num1 - num3) * num2));
    }
}
