package ru.job4j.loop;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int resultSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 150) {
                count++;
                resultSum += nums[i];
            } else {
                System.out.println("Сумма: " + resultSum + ", количество: " + count);
                break;
            }
        }
    }
}
