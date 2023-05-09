package ru.job4j.loop;

public class Task60 {
    public static void loop() {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (secondDigit - firstDigit <= 3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
