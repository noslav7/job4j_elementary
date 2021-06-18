package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = left[i];
            rsl[left.length + i] = right[i];
        }
        for (int i = 0; i < rsl.length; i++) {
            if (rsl[i] > rsl[i + 1]) {
                int temp = rsl[i];
                rsl[i] = rsl[i + 1];
                rsl[i + 1] = temp;
            }
        }
        return rsl;
    }
}
