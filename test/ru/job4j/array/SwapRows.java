package ru.job4j.array;

import java.util.ArrayList;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[0].length; i++) {
            int temp = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = temp;
        }
    }
}
