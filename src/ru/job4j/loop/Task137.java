package ru.job4j.loop;

public class Task137 {
    public static void loop(int num) {
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (firstDigit + secondDigit == num) {
                System.out.println(i);
                break;
            }
        }
    }
}
