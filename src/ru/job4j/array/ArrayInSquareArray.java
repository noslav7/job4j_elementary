package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int twoDArrayLength = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i >= array.length) {
                twoDArrayLength = i;
                break;
            }
        }
        int[][] twoDArray = new int[twoDArrayLength][twoDArrayLength];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = array[i * twoDArrayLength + j];
                if ((i * twoDArrayLength + j) == array.length - 1) {
                    break;
                }
            }
        }
        return twoDArray;
    }
}
