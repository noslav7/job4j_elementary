package ru.job4j.loop;

public class Task34 {
    public static void loop(int num) {
        int count = 0;
        for (int i = num; i <= num + 10; i++) {
                if (i % 2 != 0 && i != num) {
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
