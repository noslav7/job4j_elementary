package ru.job4j.loop;

public class Task19 {
    public static void loop() {
        System.out.println("Старт");
        for (int i = 100; i < 153; i++) {
            int digit = i % 10;
            if (digit == 7) {
                if (i == 147) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Финиш");
    }
}
