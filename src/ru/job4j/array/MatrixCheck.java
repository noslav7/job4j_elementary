package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int range = 0; range < board.length; range++) {
            for (int cell = 0; cell < board[range].length; cell++) {
                if (board[range][cell] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}