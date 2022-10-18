package ru.job4j.loop;

public class Task45 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 100; i <= 500; i++) {
            int lastTwoDigits = i % 100;
            if (lastTwoDigits == num) {
                count++;
                if (count == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println();
    }
}
