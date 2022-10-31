package ru.job4j.loop;

public class Task108 {
    public static void loop(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 999) {
                sum += nums[i];
                System.out.println(nums[i]);
            } else {
                System.out.println("Сумма: " + sum);
                break;
            }
        }
    }
}
