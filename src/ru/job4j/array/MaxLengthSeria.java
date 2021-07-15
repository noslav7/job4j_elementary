package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int maxLength = 1;
        int subArrayLength = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] || array[i] == array[i-1] +1) {
                subArrayLength++;
                maxLength = Math.max(maxLength, subArrayLength);
            } else {
                subArrayLength = 1;
            }
        }
        return maxLength;
    }
}
