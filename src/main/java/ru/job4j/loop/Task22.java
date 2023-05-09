package ru.job4j.loop;

public class Task22 {
    public static void loop() {
        for (int i = 100; i < 300; i++) {
            if (i % 80 == 45) {
                if (i == 285) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
