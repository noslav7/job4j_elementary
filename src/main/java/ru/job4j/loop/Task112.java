package ru.job4j.loop;

public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            num -= nums[i];
            if (num > 0) {
                count++;
            } else {
                System.out.println(count);
                break;
            }
        }
    }
}
