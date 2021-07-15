package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int[][] twoDArray = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
        twoDArray[0][i] = array[i];
        }
        return twoDArray;
    }
}
