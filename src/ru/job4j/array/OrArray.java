package ru.job4j.array;

public class OrArray {
/*
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
                unitedElements[i] = left[i];
            }
        } else {
            for (int i = 0; i < right.length; i++) {
                unitedElements[i] = right[i];
            }
        }
        int cell = 0;
        if (left.length != 0) {
            for (int i = 0; i < left.length; i++) {
                for (int j = 0; j < right.length; j++) {
                    if (left[i] != right[j]) {
                        unitedElements[left.length + cell] = right[i * left.length + j];
                        cell++;
                    }
                }
            }
        }
        return unitedElements;
    }*/
}

