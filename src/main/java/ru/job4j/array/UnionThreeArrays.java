package ru.job4j.array;

public class UnionThreeArrays {

    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        for (int i = 0; i < middle.length; i++) {
            if (i % 2 == 1) {
            result[i + 1] = middle[i];
            }
        }
        for (int j = 0; j < right.length; j++) {
            if (j % 2 == 0) {
                result[j + 1] = right[j];
            }
        }
        return result;
    }
}