package ru.job4j.loop;

public class Task140 {
    public static void loop(int num) {
        for (int i = num - 1; i > 0 ; i--) {
            if (num % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
