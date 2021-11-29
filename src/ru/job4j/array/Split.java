package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[j] != c) {
                    result[i][count++] = str[j];
                    commonCount++;
                }
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
