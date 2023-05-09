package ru.job4j.array;

public class Task81 {
    public static int[] array(int[] nums) {
        int countNegative = 0;
        int countZero = 0;
        int countPositive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                countNegative++;
            }
            if (nums[i] == 0) {
                countZero++;
            }
            if (nums[i] > 0) {
                countPositive++;
            }
        }
        return new int[] {countNegative, countZero, countPositive};
    }
}
