package ru.job4j.loop;

public class Task35 {
    public static void loop(int num) {
        int count = 0;
        for (int i = num - 6; i >= num - 30; i = i - 6) {
                count++;
                if (count == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
        System.out.println();
    }
}
