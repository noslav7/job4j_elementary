package ru.job4j.array;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] diffArray = new int[left.length - right.length];
        int cell = 0;
        for (int k : left) {
            for (int i : right) {
                if (k == i) {
                    break;
                } else {
                    diffArray[cell] = k;
                }
            }
            cell++;
        }
        return diffArray;
    }
}
