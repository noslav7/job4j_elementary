package ru.job4j.loop;

public class Task77 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        if (num1 > num2) {
            for (int i = 1; i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    sum = sum + i;
                }
            }
        } else {
            for (int i = 1; i <= num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    sum = sum + i;
                }
            }
        }
        System.out.println(sum);
    }
}
