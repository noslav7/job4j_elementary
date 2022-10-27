package ru.job4j.loop;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = 0;
        int count = 0;
        for (int i = 1; i <= months; i++) {
            count++;
            if (count == 1) {
                sum = sum + money * (double) percent;
            } else if (count > 1) {
                sum = sum + sum * (double) percent;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
