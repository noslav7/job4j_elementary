package ru.job4j.condition;

public class Task40 {
    public static void isDoubleEven(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100;
        num3 = number % 100 % 10;
        if (num3 % 2 == 0 && (num1 + num2 + num3) % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
