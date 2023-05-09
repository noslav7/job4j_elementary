package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        String tempStr = new String(str);
        int commonCount = 0;
        int indexStr = 0;
        OUTTER:
        for (int i = 0; i < result.length; i++) {
            if (indexStr != str.length && tempStr.indexOf(c, indexStr) == -1) {
                result[i] = new char[str.length - indexStr];
            } else if (indexStr != str.length) {
                result[i] = new char[tempStr.indexOf(c, indexStr) - indexStr];
            }
            if (result[i] == null) {
                break;
            }
            for (int j = 0; j <= result[i].length; j++) {
                if (indexStr != str.length && str[indexStr] == c) {
                    indexStr++;
                    commonCount++;
                    continue OUTTER;
                }
                if (j != result[i].length) {
                    result[i][j] = str[indexStr++];
                }
            }
            commonCount++;
        }
        return Arrays.copyOf(result, commonCount);
    }
}
