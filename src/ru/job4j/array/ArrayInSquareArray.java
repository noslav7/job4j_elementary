package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int[][] twoDArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoDArray[i * 3 + j][j] = array[i];
            }
        }
        return twoDArray;
    }
}
