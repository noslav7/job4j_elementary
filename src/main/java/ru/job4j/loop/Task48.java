package ru.job4j.loop;

public class Task48 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count++;
            if (count == 1) {
                System.out.print(i);
            } else {
                System.out.print("+" + i);
            }
        }
        System.out.println();
    }
}
