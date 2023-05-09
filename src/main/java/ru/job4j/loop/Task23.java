package ru.job4j.loop;

public class Task23 {
    public static void loop(int num) {
        for (int i = num + 1; i < num + 6; i++) {
             if (i == num + 5) {
                 System.out.println(i);
             } else {
                 System.out.print(i + " ");
             }
        }
    }
}
