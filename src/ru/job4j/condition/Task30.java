package ru.job4j.condition;

public class Task30 {
    public static void numModify(int number) {
        if (number < 0) {
            System.out.println(Math.abs(number));
        } else {
            number = 0;
            System.out.println(number);
        }
    }
}
