package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int oneDArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                oneDArrayLength++;
            }
        }
        int[] oneDArray = new int[oneDArrayLength];
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                oneDArray[y] = array[i][j];
                      y++;
            }
        }
        int twoDArrayLength = 0;
        for (int i = 0; i < 10; i++) {
            if (i * i >= oneDArrayLength) {
                twoDArrayLength = i;
                break;
            }
        }
        int z = 0;
        int[][] newTwoDArray = new int[twoDArrayLength][twoDArrayLength];
        for (int i = 0; i < newTwoDArray.length; i++) {
            for (int j = 0; j < newTwoDArray[i].length; j++) {
                newTwoDArray[i][j] = oneDArray[z];
                if (z == oneDArrayLength - 1) {
                    return newTwoDArray;
                }
                z++;
            }
        }
        return newTwoDArray;
    }
}
