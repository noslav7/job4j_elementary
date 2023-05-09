package ru.job4j.loop;

public class Task25 {
    public static void loop(int num) {
        for (int i = 7; i <= 7 + 4 * (num - 1); i = i + 4) {
            if (i == 7 + 4 * (num - 1)) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
