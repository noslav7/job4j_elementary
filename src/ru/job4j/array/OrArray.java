package ru.job4j.array;

import java.util.Arrays;
import java.util.List;

public class OrArray {

    public static int[] or(int[] left, int[] right) {
        int foundEqual = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    foundEqual++;
                    break;
                }
            }
        }
        int[] unitedElements = new int[left.length + right.length - foundEqual];
        for (int i = 0; i < left.length; i++) {
            unitedElements[i] = left[i];
        }
        int cell = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] != right[j]) {
                    unitedElements[left.length + cell] = right[j];
                    cell++;
                }
            }
        }
        return unitedElements;
    }
}

