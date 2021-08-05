package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int length = 1;
        while (array.length > length * length) {
            length++;
        }
        int[][] twoDArray = new int[length][length];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = array[i * twoDArray.length + j - 1];
            }
        }
        return twoDArray;
    }
}
