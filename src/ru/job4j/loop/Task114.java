package ru.job4j.loop;

public class Task114 {
    public static void loop(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                break;
            } else {
                sum += nums[i];
            }
        }
        System.out.println(sum);
    }
}
