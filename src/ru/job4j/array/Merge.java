package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = left[i];
            rsl[left.length + i] = right[i];
        }
        for (int j = 0; j < rsl.length; j++) {
            if (rsl[j] > rsl[j + 1]) {
                int temp = rsl[j];
                rsl[j] = rsl[j + 1];
                rsl[j + 1] = temp;
            }
        }
        return rsl;
    }
}
