package ru.job4j.type;

public class Task30 {
    public static void numSum(int number) {
        int num1, num2, result;
        num1 = number / 10;
        num2 = number % 10;
        result = Math.abs(num1 - num2);
        System.out.println(result);
    }
}
