package ru.job4j.loop;

public class Task50 {
    public static void loop(int n) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            count++;
            if (count == 1) {
                System.out.print(i);
            } else {
                System.out.print(" " + (1 + (i - 1) * n));
            }
        }
        System.out.println();
    }
}
