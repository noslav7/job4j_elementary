package ru.job4j.type;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, last;
        String middle;
        int middleHundreds, middleTens;
        first = number / 1000;
        middleHundreds = (number % 1000) / 100;
        middleTens = ((number % 1000) % 100) / 10;
        last = ((number % 1000) % 100) % 10;
        middle = "" + middleHundreds + middleTens;
        System.out.println(Integer.parseInt(last + middle + first));
    }
}
