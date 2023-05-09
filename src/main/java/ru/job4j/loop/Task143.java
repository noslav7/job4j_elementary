package ru.job4j.loop;

public class Task143 {
    public static void loop(int num1, int num2) {
        int maxDivider = 0;
        if (num1 > num2) {
            for (int i = 2; i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0 && i > maxDivider) {
                    maxDivider = i;
                }
            }
        } else {
            for (int i = 2; i < num1; i++) {
                if (num1 % i == 0 && num2 % i == 0 && i > maxDivider) {
                    maxDivider = i;
                }
            }
        }
        if (maxDivider == 0) {
            maxDivider = 1;
        }
        System.out.println(maxDivider);
    }
}
