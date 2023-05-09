package ru.job4j.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, last;
        String middle;
        int middle_hundreds, middle_tens;
        first = number / 1000;
        middle_hundreds = (number % 1000) / 100;
        middle_tens = ((number % 1000) % 100) / 10;
        last = ((number % 1000) % 100) % 10;
        middle = "" + middle_hundreds + middle_tens;
        System.out.println(Integer.parseInt(last + middle + first));
    }
}
