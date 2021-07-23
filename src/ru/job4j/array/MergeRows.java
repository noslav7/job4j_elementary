package ru.job4j.array;

public class MergeRows {

    public static int[] merge(int[][] data) {
        int[] newArray = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                  newArray[i * 3 + j] = data[i][j];
            }
        }
        return newArray;
    }
}