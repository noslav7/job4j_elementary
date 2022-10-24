package ru.job4j.loop;

public class Task51 {
    public static void loop(int n, int m) {
        int count = 0;
        if (n < m) {
            for (int i = n; i <= m; i++) {
                if (i % 2 != 0) {
                    count++;
                    if (count == 1) {
                        System.out.print(i * i);
                    } else {
                        System.out.print(" " + i * i);
                    }
                } else {
                    count++;
                    if (count == 1) {
                        System.out.print(0);
                    } else {
                        System.out.print(" " + 0);
                    }
                }
            }
            System.out.println();
        } else {
            for (int i = m; i <= n; i++) {
                if (i % 2 != 0) {
                    count++;
                    if (count == 1) {
                        System.out.print(i * i);
                    } else {
                        System.out.print(" " + i * i);
                    }
                } else {
                        count++;
                        if (count == 1) {
                            System.out.print(0);
                        } else {
                            System.out.print(" " + 0);
                        }
                    }
            }
            System.out.println();
        }
    }
}
