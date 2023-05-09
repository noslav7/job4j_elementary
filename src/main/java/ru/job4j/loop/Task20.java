package ru.job4j.loop;

public class Task20 {
    public static void loop() {
        System.out.println("Начало");
        for (int i = 1550; i >= 1050; i--) {
            String number = "" + i;
            if (number.endsWith("00")) {
                if (i == 1100) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Конец");
    }
}
