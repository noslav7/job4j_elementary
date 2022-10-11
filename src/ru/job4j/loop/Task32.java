package ru.job4j.loop;

public class Task32 {
    public static void loop() {
        int count = 0;
        for (int i = 49; i > 9; i--) {
            int lastDigit = i % 10;
            if (lastDigit == 7) {
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
