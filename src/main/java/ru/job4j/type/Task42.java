package ru.job4j.type;

public class Task42 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3, num4;
        num4 = ((number % 1000) % 100) % 10;
        num3 = ((number % 100) % 100) / 10;
        num2 = (number % 1000) / 100;
        num1 = number / 1000;
        if (num4 == 0) {
            System.out.println("" + num1 + num2 + num3);
            return;
        }
        System.out.println("" + num4 + num1 + num2 + num3);
    }
}
