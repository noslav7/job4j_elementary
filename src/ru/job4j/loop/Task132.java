package ru.job4j.loop;

import java.util.StringJoiner;

public class Task132 {
    public static void loop(int[] nums) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        int countEvenOnOddPlace = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && (i + 1) % 2 != 0) {
                countEvenOnOddPlace++;
            }
            if (countEvenOnOddPlace < 3) {
                stringJoiner.add(String.valueOf(nums[i]));
            } else {
                break;
            }
        }
        System.out.println(stringJoiner);
    }
}
