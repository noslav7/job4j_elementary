package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int i = left.length - 1; i > left.length - 2; i--) {
            if (left[i] != right[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
