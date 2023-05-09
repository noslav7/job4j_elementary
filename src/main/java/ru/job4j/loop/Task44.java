package ru.job4j.loop;

public class Task44 {
    public static void loop() {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 10;
            String stringReversedNumber = "" + thirdDigit + secondDigit + firstDigit;
            int reversedNumber = Integer.parseInt(stringReversedNumber);
            double checkSquare = Math.sqrt(i * (double) reversedNumber);
            int intSquare = (int) checkSquare;
            if (checkSquare == intSquare && i != reversedNumber
                    && (secondDigit != 0 && thirdDigit != 0)) {
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
