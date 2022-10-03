package ru.job4j.loop;

public class Task21 {
    public static void loop() {
        System.out.println("Старт");
        for (int i = 38; i >= 10; i--) {
            if (i % 5 == 0) {
                if (i == 10) {
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
