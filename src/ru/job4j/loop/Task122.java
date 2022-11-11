package ru.job4j.loop;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int number = nums[i];
            count++;
            while (number != 0) {
                int remains = number % 10;
                sum = sum + remains;
                number = number / 10;
            }
            if (sum == 5) {
                if (count == 1) {
                    System.out.print("");
                    return;
                } else {
                    System.out.println(joiner);
                    return;
                }
            }
         joiner.add(String.valueOf(nums[i]));
            }
            System.out.println(joiner);
        }
    }
