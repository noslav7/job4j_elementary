package ru.job4j.loop;

public class Task97 {
    public static void loop(int[] num) {
        int best = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < best) {
                best = num[i];
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] == best) {
                System.out.println("Время: " + best + ", номер: " + i);
            }
        }
    }
}
