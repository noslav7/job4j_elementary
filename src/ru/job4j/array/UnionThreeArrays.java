package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];
        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];
        for (int i = 1; i < middle.length - 1; i++) {
            for (int j = 2; j < result.length - 1; j++) {
                if (i % 2 == 1 && j % 2 == 0) {
                    result[j] = middle[i];
                    break;
            }
        }
     }
        for (int i = 0; i < right.length - 1; i++) {
            for (int j = 1; j < result.length - 1; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    result[j] = right[i];
                    break;
                }
            }
        }
        return result;
        }
}
