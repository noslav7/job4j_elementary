package ru.job4j.loop;

public class Task71 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
