package ru.job4j.loop;

public class Task27 {
    public static void loop(int num) {
        for (int i = -num + 1; i <= num - 1; i++) {
            if (i == num - 1) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
