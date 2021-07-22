package ru.job4j.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 1) {
            if (i != nums.length - 1) {
                sum = sum + (nums[i] - nums[i + 1]);
            } else {
                break;
            }
        }
        return sum;
    }
}
