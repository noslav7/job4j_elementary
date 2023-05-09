package ru.job4j.loop;

public class Task136 {
    public static void loop(int num) {
        double number = num;
        boolean isPreciseSquare = false;
        for (int i = 1; i <= num; i++) {
            if (i == Math.sqrt(number)) {
                isPreciseSquare = true;
                break;
            }
        }
        if (isPreciseSquare) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
