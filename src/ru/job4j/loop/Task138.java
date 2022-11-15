package ru.job4j.loop;

public class Task138 {
    public static void loop() {
        for (int i = 99; i > -1; i--) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if ((firstDigit * secondDigit) == i) {
                System.out.println(i);
                break;
            }
        }
    }
}
