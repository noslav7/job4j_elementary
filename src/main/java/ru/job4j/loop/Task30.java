package ru.job4j.loop;

public class Task30 {
    public static void loop(int num) {
        int count = 0;
        int lastDigitInNumber = num % 10;
        for (int i = 100; i < 130; i++) {
            int thirdDigit = i % 10;
            if (lastDigitInNumber == thirdDigit) {
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
