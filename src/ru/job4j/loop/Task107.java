package ru.job4j.loop;

public class Task107 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 999) {
                count++;
                System.out.println(nums[i]);
            } else {
                System.out.println("Значений: " + count);
                break;
            }
        }
    }
}
