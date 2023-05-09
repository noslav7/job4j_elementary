package ru.job4j.array;

import java.util.*;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        List arrayLeft = new ArrayList();
        for (int i = 0; i < left.length; i++) {
            arrayLeft.add(left[i]);
        }
        List arrayRight = new ArrayList();
        for (int i = 0; i < right.length; i++) {
            arrayRight.add(right[i]);
        }
        arrayLeft.removeAll(arrayRight);
        int[] diffArray = new int[arrayLeft.size()];
        for (int i = 0; i < arrayLeft.size(); i++) {
            diffArray[i] = (int) arrayLeft.get(i);
        }
        return diffArray;
    }
}
