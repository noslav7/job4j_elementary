package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] singleArray = new int[left.length * left.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                 singleArray[i * left.length + j] = Math.max(left[i][j], right[i][j]);
                    }
                }
        return singleArray;
            }
        }
