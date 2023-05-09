package ru.job4j.array;

public class Task82 {
    public static int[] array(int[] nums) {
        int sumNegative = 0;
        int countZero = 0;
        int sumPositive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                sumNegative += nums[i];
            }
            if (nums[i] == 0) {
                countZero++;
            }
            if (nums[i] > 0) {
                sumPositive += nums[i];
            }
        }
        return new int[] {sumPositive, sumNegative, countZero};
    }
}
