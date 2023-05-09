package ru.job4j.loop;

public class Task128 {
    public static void loop(int num) {
        int countDigits = 0;
        while (num != 0) {
            num /= 10;
            countDigits++;
        }
        System.out.println(countDigits);
    }
}
