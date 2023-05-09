package ru.job4j.loop;

public class Task49 {
    public static void loop(int n, int m) {
        int count = 0;
        if (n == m && n % 2 != 0) {
            return;
        }
        if (n == m && n % 2 == 0) {
            System.out.println(n);
        }
        if (n < m) {
            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    count++;
                    if (count == 1) {
                        System.out.print(i);
                    } else {
                        System.out.print("+" + i);
                    }
                }
            }
            System.out.println();
        } else if (n > m) {
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    count++;
                    if (count == 1) {
                        System.out.print(i);
                    } else {
                        System.out.print("+" + i);
                    }
                }
            }
            System.out.println();
        }
    }
}
