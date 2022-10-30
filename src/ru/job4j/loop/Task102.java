package ru.job4j.loop;

public class Task102 {
    public static void loop(int[] num) {
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        String minStr = null;
        String maxStr = null;
        if (min == 0) {
            minStr = "Нет";
        } else {
            minStr = String.valueOf(min);
        }
        if (max == 0) {
            maxStr = "Нет";
        } else {
            maxStr = String.valueOf(max);
        }
        System.out.println("Max: " + maxStr + ", min: " + minStr);
    }
}
