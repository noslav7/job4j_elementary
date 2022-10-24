package ru.job4j.loop;

public class Task53 {
    public static void loop(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count++;
            if (count == 1) {
                System.out.print((int) Math.pow(2, i));
            } else {
                System.out.print(" " + (int) Math.pow(2, i));
            }
        }
        System.out.println();
    }
}
