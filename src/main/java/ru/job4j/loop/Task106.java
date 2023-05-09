package ru.job4j.loop;

public class Task106 {
    public static void loop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                System.out.println(nums[i]);
            } else {
                break;
            }
        }
    }
}
