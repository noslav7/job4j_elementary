package ru.job4j.type;

public class Task40 {
    public static void leftCircleShift(int number) {
        int num1, num234;
        num1 = number / 1000;
        if (number % 1000 == 0) {
            System.out.println(num1);
            return;
        }
        num234 = number % 1000;
        System.out.println("" + num234 + num1);
    }
}
