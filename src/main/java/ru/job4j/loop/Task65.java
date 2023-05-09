package ru.job4j.loop;

public class Task65 {
    public static void loop(int[] nums) {
        int countPlus = 0;
        int countMinus = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                countPlus++;
            } else if (nums[i] < 0) {
                countMinus++;
            }
        }
        if (countPlus == countMinus) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
