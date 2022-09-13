package ru.job4j.type;

public class Task37 {
    public static void leftShift(int number) {
        int num;
        if (number % 100 == 0) {
            System.out.println(0);
            return;
        }
        num = number % 100;
        System.out.println("" + num + 0);
    }
}
