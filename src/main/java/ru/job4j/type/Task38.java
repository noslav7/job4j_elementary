package ru.job4j.type;

public class Task38 {
    public static void leftShift(int number) {
        int num;
        if (number % 1000 == 0) {
            System.out.println(0);
            return;
        }
        num = number % 1000;
        System.out.println("" + num + 0);
    }
}
