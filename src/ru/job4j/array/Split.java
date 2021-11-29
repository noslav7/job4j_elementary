package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < str.length; j++) {
                int ri = 0;
                if (str[j] != c) {
                    result[i][ri++] = str[j];
                } else if (str[j] == c) {
                    index = j + 1;
                    commonCount++;
                }
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
