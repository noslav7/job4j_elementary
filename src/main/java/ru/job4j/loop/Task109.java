package ru.job4j.loop;

public class Task109 {
    public static void loop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 123) {
                System.out.println("Код не принят");
            } else {
                System.out.println("Код принят");
                break;
            }
        }
    }
}
