package ru.job4j.condition;

public class Task18 {
    public static void numDecrease(int number) {
        if ((number / 100) > 0 && (number / 100) < 10 && number > 0) {
            System.out.println(number - 1);
        } else {
            System.out.println(number);
        }
    }
}
