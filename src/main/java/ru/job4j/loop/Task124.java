package ru.job4j.loop;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int cellValue = nums[i];
            while (cellValue != 0) {
                int remains = cellValue % 10;
                sum += remains;
                cellValue /= 10;
            }
            sums[i] = sum;
            joiner.add(String.valueOf(sum));
        }
        int index = 0;
        for (int i = 1; i < sums.length; i++) {
            if (sums[i] > sums[i - 1]) {
                index = i;
            }
        }
        System.out.println("Суммы: " + joiner + ", индекс: " + index);
    }
}
