package ru.job4j.loop;

public class Task47 {
    public static void loop() {
        int count = 0;
        for (int i = 1350; i < 1450; i++) {
            int firstDigit = i / 1000;
            int secondDigit = i % 1000 / 100;
            int thirdDigit = i % 100 / 10;
            int fourthDigit = i % 10;
            int sumFirstTwoDigits = firstDigit + secondDigit;
            int sumLastTwoDigits = thirdDigit + fourthDigit;
            if (sumFirstTwoDigits == sumLastTwoDigits) {
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
