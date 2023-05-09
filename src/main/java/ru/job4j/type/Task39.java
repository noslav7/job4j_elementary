package ru.job4j.type;

public class Task39 {
    public static void leftCircleShift(int number) {
        int num1, num23;
        num1 = number / 100;
        if (number % 100 == 0) {
            System.out.println(num1);
            return;
        }
        num23 = number % 100;
        System.out.println("" + num23 + num1);
    }
}
