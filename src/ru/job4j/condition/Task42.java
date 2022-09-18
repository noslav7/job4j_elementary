package ru.job4j.condition;

public class Task42 {
    public static void isPairSymmetric(int number) {
        int num1, num2, num3, num4;
        String firstNum, secondNum;
        num1 = number / 1000;
        num2 = number % 1000 / 100;
        num3 = number % 1000 % 100 / 10;
        num4 = number % 1000 % 100 % 10;
        firstNum = "" + num1 + num2;
        secondNum = "" + num3 + num4;
        if (firstNum.equals(secondNum)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
