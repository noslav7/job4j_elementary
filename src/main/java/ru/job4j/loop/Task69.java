package ru.job4j.loop;

public class Task69 {
    public static void loop(int num1, int num2) {
        int count = 0;
        if (num1 > num2) {
            for (int i = 1; i <= num2; i++) {
                if (num2 % i == 0 && num1 % i == 0) {
                    count++;
                }
            }
        } else {
            for (int i = 1; i <= num1; i++) {
                if (num2 % i == 0 && num1 % i == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
