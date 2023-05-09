package ru.job4j.loop;

public class Task127 {
    public static void loop(int num) {
        while (num > 9) {
            num /= 10;
        }
        System.out.println(num);
    }
}
