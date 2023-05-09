package ru.job4j.loop;

public class Task98 {
    public static void loop(int[] num) {
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println((max + min) / 2);
    }
}
