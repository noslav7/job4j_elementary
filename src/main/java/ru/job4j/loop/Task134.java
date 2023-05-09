package ru.job4j.loop;

public class Task134 {
    public static void loop(int num) {
        double sum = 0;
        int result = 1;
        for (int i = 1; i < num; i++) {
            sum = sum + Math.pow(i, 2);
            if (sum <= num) {
                result = (int) sum;
            } else {
                break;
            }
        }
        System.out.println(result);
    }
}
