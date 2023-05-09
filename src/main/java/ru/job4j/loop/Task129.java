package ru.job4j.loop;

public class Task129 {
    public static void loop(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        System.out.println(sum);
    }
}
