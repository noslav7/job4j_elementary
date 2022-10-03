package ru.job4j.loop;

public class Task14 {
    public static void loop(int a, int b) {
        System.out.println("Старт");
        for (int i = a; i < b; i++) {
            if (i > 9 && i < 100) {
                if (i == b - 1) {
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
