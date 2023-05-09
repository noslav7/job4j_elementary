package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int min = 100;
        int max = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        int result = max - min;
        return result;
    }
}
