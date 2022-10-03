package ru.job4j.loop;

public class Task16 {
    public static void loop() {
        System.out.println("Старт");
        for (int i = 1; i < 10; i++) {
            if (i == 9) {
                    System.out.print(i);
                    break;
                }
                System.out.print(i + " ");
            }
        System.out.println();
        System.out.println("Финиш");
    }
}
