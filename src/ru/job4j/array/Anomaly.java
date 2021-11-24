package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int[] temp = new int[2];
        int j = 0;
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                temp[j++] = i;
            }
            if (j == 2) {
                result[count++] = temp;
                temp = new int[2];
                j = 0;
            }
        }
            if (j == 1 && count == 0) {
                temp[1] = temp[0];
                result[0] = temp;
                count++;
            }
        return Arrays.copyOf(result, count);
    }
}
