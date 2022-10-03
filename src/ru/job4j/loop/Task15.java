package ru.job4j.loop;

public class Task15 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        for (int i = b; i > a; i--) {
            if (i > 99 && i < 1000) {
                if (i == a + 1 || i == 100) {
                    System.out.print(i);
                    break;
                }
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Финиш");
    }
}
