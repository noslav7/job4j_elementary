package ru.job4j.loop;

public class Task37 {
    public static void loop() {
        int count = 0;
        for (int i = 100; i < 130; i++) {
            int firstDigit = i / 100;
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 10;
            int multiplication = firstDigit * thirdDigit;
            if (secondDigit * secondDigit == multiplication) {
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
