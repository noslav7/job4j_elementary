package ru.job4j.loop;

public class Task75 {
    public static void loop(int num) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                sum = sum + i;
            }
        }
        if (sum % count == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
