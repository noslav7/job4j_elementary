package ru.job4j.loop;

public class Task99 {
    public static void loop(int[] num) {
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        int sumOverall = 0;
        for (int i = 0; i < num.length; i++) {
            sumOverall = sumOverall + num[i];
        }
        if ((min + max) / 2 > sumOverall / num.length) {
            System.out.println("Больше");
        } else {
            System.out.println("Нет");
        }
    }
}
