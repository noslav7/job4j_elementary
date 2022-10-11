package ru.job4j.loop;

public class Task33 {
    public static void loop() {
        int count = 0;
        for (int i = 100; i < 160; i++) {
            if (i % 11 == 0) {
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
