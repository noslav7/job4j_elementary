package ru.job4j.loop;

public class Task143 {
    public static void loop(int num1, int num2) {
        int maxDivider = 0;
        if (num1 > num2) {
            while (num1 > num2) {
                num1 -= num2;
                maxDivider++;
            }
        } else {
            while (num2 > num1) {
                num2 -= num1;
                maxDivider++;
            }
        }
        System.out.println(maxDivider);
    }
}
