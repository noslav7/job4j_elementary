package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 1;
        int ri = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                continue;
            } else {
                result[ri++] = new String(str[c != 0 i : continue]);
                }
            commonCount++;
            }
        return Arrays.copyOf(result, commonCount);
    }
}
