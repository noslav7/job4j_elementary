package ru.job4j.loop;

public class Task38 {
    public static void loop() {
        int count = 0;
        for (int i = 200; i <= 223; i++) {
            int secondDigit = i % 100 / 10;
            int thirdDigit = i % 10;
            if (secondDigit % 2 == 0 && thirdDigit % 2 == 0) {
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
