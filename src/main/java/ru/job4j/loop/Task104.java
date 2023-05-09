package ru.job4j.loop;

public class Task104 {
    public static void loop(int[] num) {
        int result = 0;
        int max = -1;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}
