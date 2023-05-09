package ru.job4j.loop;

public class Task39 {
    public static void loop() {
        int count = 0;
        for (int i = 200; i <= 210; i++) {
            int firstDigit = i / 100;
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 10;
            int digitsSum = firstDigit + secondDigit + thirdDigit;
            if (i % digitsSum == 0) {
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
