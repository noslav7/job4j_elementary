package ru.job4j.array;

public class  OrArray {

    public static int[] or(int[] left, int[] right) {
        int foundEqual = 0;
        if (left.length != 0) {
            for (int i = 0; i < left.length; i++) {
                for (int j = 0; j < right.length; j++) {
                    if (left[i] == right[j]) {
                        foundEqual++;
                    }
                }
            }
        }
        int[] unitedElements = new int[left.length + right.length - foundEqual];
        if (left.length != 0) {
            for (int i = 0; i < left.length; i++) {
                for (int j = 0; j < right.length; j++) {
                    if (left[i] != right[j]) {
                        unitedElements[i] = left[i];
                    }
                }
            }
        }
        if (right.length != 0) {
            for (int i = 0; i < right.length; i++) {
                for (int j = 0; j < right.length; j++) {
                    if (left[i] != right[j]) {
                        unitedElements[left.length + i] = right[i];
                    }
                }
            }
        }
        return unitedElements;
    }
}

