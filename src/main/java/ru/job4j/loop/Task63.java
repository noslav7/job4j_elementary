package ru.job4j.loop;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == 1) {
                count++;
            }
        }
        if (answers.length / 2 < count) {
            System.out.println(count + ", Да");
        } else {
            System.out.println(count + ", Нет");
        }
    }
}
