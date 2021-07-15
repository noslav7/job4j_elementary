package ru.job4j.array;

import java.util.HashSet;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        boolean valid = true;
        int count = 0;
        for (int cell : data) {
            if (cell == value) {
                    count++;
            }
        }
        if (count >= data.length / 2) {
            valid = false;
        }
        return valid;
    }
}
