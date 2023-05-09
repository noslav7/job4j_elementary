package ru.job4j.condition;

public class Task36 {
    public static void sameNums(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        if (num1 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
