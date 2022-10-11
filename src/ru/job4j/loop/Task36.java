package ru.job4j.loop;

public class Task36 {
    public static void loop() {
        int count = 0;
        for (int i = 25; i < 30; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            int multiplication = firstDigit * secondDigit;
            String multiString = String.valueOf(multiplication);
            if (multiString.length() == 2) {
                count++;
                if (count == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println();
    }
}
