package ru.job4j.loop;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        if (n == 1) {
            System.out.println(0);
            return;
        }
        StringJoiner stringJoiner = new StringJoiner(" ");
        if (n < m) {
            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    stringJoiner.add(String.valueOf(i * i));
                } else {
                    stringJoiner.add(String.valueOf(0));
                }
            }
        } else if (n > m) {
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    stringJoiner.add(String.valueOf(i * i));
                } else {
                    stringJoiner.add(String.valueOf(0));
                }
            }
        } else {
            if (n % 2 != 0) {
                stringJoiner.add(String.valueOf(n * n));
            } else {
                stringJoiner.add(String.valueOf(0));
            }
        }
        System.out.println(stringJoiner);
    }
}