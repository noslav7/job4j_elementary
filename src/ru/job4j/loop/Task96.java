package ru.job4j.loop;

public class Task96 {
    public static void loop(int[] num) {
        int best = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < best) {
                best = num[i];
            }
        }
        System.out.println(best);
    }
}
