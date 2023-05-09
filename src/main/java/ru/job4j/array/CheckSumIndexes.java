package ru.job4j.array;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
            }
        }
            int count = 0;
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (data[i][j] != 0) {
                        count++;
                    }
                }
            }
            int[] oneDArray = new int[count];
            int y = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0) {
                    oneDArray[y] = data[i][j];
                    y++;
                }
            }
        }
        return oneDArray;
            }
    }