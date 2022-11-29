package ru.job4j.array;

import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > 1 && !stringJoiner.toString().contains(String.valueOf(nums[i]))) {
                    stringJoiner.add(String.valueOf(nums[i]));
            }
        }
        if (stringJoiner.length() == 0) {
            System.out.print("");
            return;
        }
        System.out.println(stringJoiner);
    }
}
