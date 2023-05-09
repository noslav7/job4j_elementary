package ru.job4j.loop;

public class Task18 {
    public static void loop() {
        System.out.println("Начало");
        for (int i = 10; i < 20; i = i + 2) {
            if (i == 18) {
                System.out.print(i);
                break;
            }
            if (i % 4 == 0) {
                System.out.print(i + "# ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Конец");
    }
}
