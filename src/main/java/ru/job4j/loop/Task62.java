package ru.job4j.loop;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 3) {
                count++;
            }
        }
        if (amount / 2 < count) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
