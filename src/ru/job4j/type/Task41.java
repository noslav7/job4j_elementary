package ru.job4j.type;

public class Task41 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3;
        num3 = (number % 100) % 10;
        num2 = (number % 100) / 10;
        num1 = number / 100;
        if (num3 == 0) {
            System.out.println("" + num1 + num2);
            return;
        }
        System.out.println("" + num3 + num1 + num2);
    }
}
