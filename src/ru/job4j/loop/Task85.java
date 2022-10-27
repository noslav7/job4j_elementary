package ru.job4j.loop;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = 0;
        int count = 0;
        for (int i = 1; i <= months; i++) {
            count++;
            if (count == 1) {
                sum = money + money * ((double) percent / 100);
            } else if (count > 1) {
                sum = sum + sum * ((double) percent / 100);
            }
        }
        System.out.printf("%.2f", sum);
        System.out.println();
    }

    public static void main(String[] args) {
        loop(10000, 10, 10);
    }
}
