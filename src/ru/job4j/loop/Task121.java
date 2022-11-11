package ru.job4j.loop;

import java.util.StringJoiner;

public class Task121 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int number = nums[i];
            while (number != 0) {
                int remains = number % 10;
                sum = sum + number;
                number = number / 10;
            }
            joiner.add(String.valueOf(sum));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 31};
        loop(nums);
    }
}
