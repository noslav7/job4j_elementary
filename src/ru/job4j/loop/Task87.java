package ru.job4j.loop;

public class Task87 {
    public static void loop() {
        for (int i = 10; i <= 70; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (Math.pow((double) (firstDigit + secondDigit), 3.0) == Math.pow((double) i, 2)) {
                System.out.println(i);
            }
        }
    }
}
