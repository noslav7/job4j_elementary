package ru.job4j.loop;

public class Task29 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 100; i < 150; i++) {
            int firstDigit = i / 100;
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 100 % 10;
            if (num == firstDigit + secondDigit + thirdDigit) {
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
