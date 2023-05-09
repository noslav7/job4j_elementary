package ru.job4j.loop;

public class Task72 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
