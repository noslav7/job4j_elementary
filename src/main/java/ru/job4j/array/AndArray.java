package ru.job4j.array;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    count++;
                }
            }
        }
        int[] genElsArray = new int[count];
        int cell = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    genElsArray[cell] = left[i];
                    cell++;
                }
            }
        }
        return genElsArray;
    }
}