package ru.job4j.array;

import java.util.StringJoiner;

public class Task80 {
    public static int[] array(int[] nums) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                stringJoiner.add(String.valueOf(i));
            }
        }

        String str = stringJoiner.toString();
        String[] splitArray = str.split(" ");
        int[] intArray = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            intArray[i] = Integer.parseInt(splitArray[i]);
        }

        return intArray;
    }
}
