package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
                factor = factor * i;
            }
        return factor;
    }
}
