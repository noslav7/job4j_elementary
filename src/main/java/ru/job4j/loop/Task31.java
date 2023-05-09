package ru.job4j.loop;

public class Task31 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 10; i <= 20; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (num > firstDigit * secondDigit) {
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
