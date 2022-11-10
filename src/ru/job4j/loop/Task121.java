package ru.job4j.loop;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            if (nums[i] % 10 == 0) {

            }
            while (nums[i] != 0) {
                int remaining = nums[i] % 10;
                sum = sum + remaining;
                nums[i] = nums[i] % 10;

            }
            String sumString = String.valueOf(sum);
            stringJoiner.add(sumString);
        }
        System.out.println(stringJoiner);
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 31};
        loop(nums);
    }
}
