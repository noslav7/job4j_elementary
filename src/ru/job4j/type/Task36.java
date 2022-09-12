package ru.job4j.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last;
        first = number / 1000;
        middle = (number % 1000) / 10;
        last = ((number % 1000) % 100) % 10;
        System.out.println(Integer.parseInt("" + last + middle + first));
    }
}
