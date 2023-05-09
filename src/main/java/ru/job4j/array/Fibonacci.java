package ru.job4j.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = false;
        for (int i = 2; i < data.length; i++) {
            if (data[i] == data[i - 1] + data[i - 2]) {
                rsl = true;
            } else {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
