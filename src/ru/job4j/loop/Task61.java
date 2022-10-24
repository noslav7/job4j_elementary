package ru.job4j.loop;

public class Task61 {
    public static void loop() {
        int count = 0;
        for (int i = 100; i < 500; i++) {
            int firstDigit = i / 100;
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 10;
            if (firstDigit * firstDigit + thirdDigit * thirdDigit == secondDigit * secondDigit) {
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
