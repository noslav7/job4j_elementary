package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < row && j == column) {
                    array[i][j] = array[i + 1][j];
                }
                if (i == row && j < column) {
                    array[i][j] = array[i][j + 1];
                }
            }
        }
        for (int i = array.length - 1; i > -1; i--) {
            for (int j = array[i].length - 1; j > -1; j--) {
                if (i > row && j == column) {
                    array[i][j] = array[i - 1][j];
                }
                if (i == row && j > column) {
                    array[i][j] = array[i][j - 1];
                }
            }
        }
        array[row][column] = 0;
        }
    }
