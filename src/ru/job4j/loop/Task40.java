package ru.job4j.loop;

public class Task40 {
    public static void loop() {
        int count = 0;
        for (int i = 20; i < 40; i++) {
            int firstDigit = i / 10;
            int secondDigit = i % 10;
            if (firstDigit % 3 == 0 && secondDigit % 3 == 0 && secondDigit != 0) {
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
