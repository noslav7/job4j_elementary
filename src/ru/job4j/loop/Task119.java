package ru.job4j.loop;

public class Task119 {
    public static void loop(int num, int digit) {
        int partOfNumber = 0;
        while (num != 0) {
            partOfNumber = num % 10;
            if (partOfNumber == digit) {
               System.out.println("Да");
               return;
            }
            num /= 10;
        }
        System.out.println("Нет");
    }
}
